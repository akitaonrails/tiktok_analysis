package X;

import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayActivityLeaksOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0KbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C520690KbT extends FrameLayout {
    public final C16F5 LL;
    public InterfaceC520700KbU LLILLJJLI;
    public int LLILLL;
    public final BPEAHandler LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public long LLIZLLLIL;
    public final ARunnableS107S0100000_7 LLJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (LivePlayActivityLeaksOptSetting.enableGiftCountDownViewLeakOpt()) {
            this.LLILZ.removeCallbacks(this.LLJ);
        }
    }

    public final InterfaceC520700KbU getListener() {
        return this.LLILLJJLI;
    }

    public final int getOneDay$livegift_impl_release() {
        return this.LLIZ;
    }

    public final C16F5 getTimer() {
        return this.LL;
    }

    public final int getWidthInOneDay() {
        return this.LLILLL;
    }

    public final void LIZ(long j) {
        setTimeTextAndWidth(j - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        this.LLIZLLLIL = j;
        this.LLILZ.removeCallbacks(this.LLJ);
        C786410Ut5.LJLIIL(1000L, this.LLILZ, this.LLJ);
    }

    public final void setListener(InterfaceC520700KbU interfaceC520700KbU) {
        this.LLILLJJLI = interfaceC520700KbU;
    }

    public void setTimeTextAndWidth(long j) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (j <= 0) {
            InterfaceC520700KbU interfaceC520700KbU = this.LLILLJJLI;
            if (interfaceC520700KbU != null) {
                interfaceC520700KbU.V3();
            }
            C16F5 c16f5 = this.LL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131841737));
            }
            C16F5 c16f52 = this.LL;
            if (c16f52 != null && (layoutParams2 = c16f52.getLayoutParams()) != null) {
                layoutParams2.width = -2;
                C500260Jjc.LJJZZIII(3, this);
                C16F5 c16f53 = this.LL;
                if (c16f53 != null) {
                    C786410Ut5.y6(c16f53, layoutParams2);
                }
            }
            C16F5 c16f54 = this.LL;
            if (c16f54 != null) {
                c16f54.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
                return;
            }
            return;
        }
        long j2 = this.LLIZ;
        if (j > j2) {
            C16F5 c16f55 = this.LL;
            if (c16f55 != null) {
                int i = (int) (j / j2);
                c16f55.setText(u.LJJIFFI(C497740JfY.LJIIJJI(2131755524, i), "{num}", String.valueOf(i), false));
            }
            C16F5 c16f56 = this.LL;
            if (c16f56 != null && (layoutParams = c16f56.getLayoutParams()) != null) {
                layoutParams.width = -2;
                C500260Jjc.LJJZZIII(3, this);
            }
            C16F5 c16f57 = this.LL;
            if (c16f57 == null) {
                return;
            }
            c16f57.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
            return;
        }
        C16F5 c16f58 = this.LL;
        if (c16f58 != null) {
            StringBuilder sb = new StringBuilder();
            long j3 = j / ((long) this.LLILZLL);
            String strValueOf = String.valueOf(j3);
            if (strValueOf.length() <= 1) {
                sb.append(CardStruct.IStatusCode.DEFAULT);
            }
            sb.append(strValueOf);
            sb.append(":");
            long j4 = (j - (((long) this.LLILZLL) * j3)) / ((long) this.LLILZIL);
            String strValueOf2 = String.valueOf(j4);
            if (strValueOf2.length() <= 1) {
                sb.append(CardStruct.IStatusCode.DEFAULT);
            }
            sb.append(strValueOf2);
            sb.append(":");
            String strValueOf3 = String.valueOf((j - (j3 * ((long) this.LLILZLL))) - (j4 * ((long) this.LLILZIL)));
            if (strValueOf3.length() <= 1) {
                sb.append(CardStruct.IStatusCode.DEFAULT);
            }
            sb.append(strValueOf3);
            c16f58.setText(sb.toString());
        }
        C16F5 c16f59 = this.LL;
        if (c16f59 == null) {
            return;
        }
        c16f59.setWidth(this.LLILLL);
    }

    public final void setWidthInOneDay(int i) {
        this.LLILLL = i;
    }

    public C520690KbT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        this.LLILZ = new BPEAHandler(Looper.getMainLooper());
        this.LLILZIL = 60;
        this.LLILZLL = 3600;
        this.LLIZ = 86400;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hrc, this, true);
        C16F5 c16f5 = (C16F5) findViewById(R.id.xy0);
        this.LL = c16f5;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, context));
        }
        this.LLJ = new ARunnableS107S0100000_7(this, 85);
    }
}
