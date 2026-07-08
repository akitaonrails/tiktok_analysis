package X;

import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621530OZj extends C21569019b6 {
    public InterfaceC621520OZi LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final BPEAHandler LLJJI;
    public final RunnableC621540OZk LLJJIII;
    public final ARunnableS109S0100000_9 LLJJIJI;

    public C621530OZj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getTouchSlop() {
        return ((Number) this.LLJJ.getValue()).intValue();
    }

    public final InterfaceC621520OZi getCallback() {
        return this.LLIZLLLIL;
    }

    @Override // X.C21569019b6, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return true;
    }

    @Override // X.C21569019b6, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.LLJJI.removeCallbacks(this.LLJJIJI);
                    }
                } else if (!this.LLJILLL) {
                    float x = motionEvent.getX() - this.LLJILJIL;
                    float y = motionEvent.getY() - this.LLJILJILJ;
                    if ((x * x) + (y * y) > getTouchSlop() * getTouchSlop()) {
                        this.LLJILLL = true;
                        this.LLJJI.removeCallbacks(this.LLJJIJI);
                        this.LLJJI.removeCallbacks(this.LLJJIII);
                        return true;
                    }
                }
                return true;
            }
            if (this.LLJILLL) {
                this.LLJ = 0L;
                return true;
            }
            if (System.currentTimeMillis() - this.LLJ < 250) {
                this.LLJJI.removeCallbacks(this.LLJJIJI);
                if (System.currentTimeMillis() - this.LLJI < 250) {
                    this.LLJJI.removeCallbacks(this.LLJJIII);
                    this.LLJIJIL = System.currentTimeMillis();
                    InterfaceC621520OZi interfaceC621520OZi = this.LLIZLLLIL;
                    if (interfaceC621520OZi != null) {
                        interfaceC621520OZi.LIZJ();
                    }
                } else if (System.currentTimeMillis() - this.LLJIJIL > 250) {
                    BPEAHandler bPEAHandler = this.LLJJI;
                    RunnableC621540OZk runnableC621540OZk = this.LLJJIII;
                    runnableC621540OZk.LLILZ = MotionEvent.obtain(motionEvent);
                    C786410Ut5.LJLIIL(250L, bPEAHandler, runnableC621540OZk);
                    this.LLJI = System.currentTimeMillis();
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.LLJ;
                if (jCurrentTimeMillis - j < 500 || j == 0) {
                    this.LLJJI.removeCallbacks(this.LLJJIJI);
                    BPEAHandler bPEAHandler2 = this.LLJJI;
                    RunnableC621540OZk runnableC621540OZk2 = this.LLJJIII;
                    runnableC621540OZk2.LLILZ = MotionEvent.obtain(motionEvent);
                    C786410Ut5.LJLIIL(250L, bPEAHandler2, runnableC621540OZk2);
                    this.LLJI = System.currentTimeMillis();
                }
            }
            this.LLJ = 0L;
            return true;
        }
        this.LLJILJIL = motionEvent.getX();
        this.LLJILJILJ = motionEvent.getY();
        this.LLJILLL = false;
        this.LLJ = System.currentTimeMillis();
        this.LLJJIII.LLILLL = MotionEvent.obtain(motionEvent);
        C786410Ut5.LJLIIL(500L, this.LLJJI, this.LLJJIJI);
        return true;
    }

    public final void setCallback(InterfaceC621520OZi interfaceC621520OZi) {
        this.LLIZLLLIL = interfaceC621520OZi;
    }

    @Override // X.C21569019b6, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public C621530OZj(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 523));
        this.LLJJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIII = new RunnableC621540OZk(this, new AwS553S0100000_9(this, 522));
        this.LLJJIJI = new ARunnableS109S0100000_9((Object) this, 91);
    }
}
