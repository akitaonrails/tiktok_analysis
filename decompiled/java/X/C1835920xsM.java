package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0xsM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835920xsM extends FrameLayout {
    public final C0KXW LL;
    public C1290330jgN LLILLJJLI;
    public C1835970xsR LLILLL;
    public Function1<? super Float, Unit> LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public final AwS571S0100000_27 LLIZ;
    public final AwS571S0100000_27 LLIZLLLIL;
    public final AwS571S0100000_27 LLJ;
    public final AwS606S0100000_27 LLJI;
    public C1835960xsQ LLJIJIL;
    public final RecyclerView LLJILJIL;

    public final Pair<Integer, Integer> getStartEndPair() {
        int iIntValue = ((Number) C1835950xsP.LIZ(getContext(), Integer.valueOf(C814420VxA.LIZIZ(((Number) this.LLIZ.invoke()).floatValue() * this.LLILZIL)), Integer.valueOf(C814420VxA.LIZIZ(((Number) this.LLIZLLLIL.invoke()).floatValue() * this.LLILZIL)))).intValue();
        if (this.LLJIJIL.getSteppingSize() == 0.0f) {
            return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
        }
        return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(C814420VxA.LIZIZ((this.LLJIJIL.getRightPosition().LIZIZ.floatValue() - this.LLJIJIL.getLeftPosition().LIZIZ.floatValue()) / this.LLJIJIL.getSteppingSize()) + iIntValue));
    }

    public final Function0<Float> getCurrentPercentage() {
        return this.LLJ;
    }

    public final Function0<Float> getLeftPercentage() {
        return this.LLIZ;
    }

    public final Function1<Boolean, Unit> getPlayAndPauseCallback() {
        return this.LLJI;
    }

    public final Function0<Float> getRightPercentage() {
        return this.LLIZLLLIL;
    }

    public final C1835960xsQ getScrollHandle$live_release() {
        return this.LLJIJIL;
    }

    public final float getTotalWidth() {
        return this.LLILZLL;
    }

    public final int getVideoDuration() {
        return this.LLILZIL;
    }

    public final void LIZ(float f) {
        float f2;
        float f3 = f / 100.0f;
        C1835960xsQ c1835960xsQ = this.LLJIJIL;
        float f4 = c1835960xsQ.LLLFFI;
        float f5 = f4 * f3;
        if (c1835960xsQ.LLIZLLLIL) {
            f2 = c1835960xsQ.LLJ + f5;
        } else {
            f2 = (f4 + c1835960xsQ.LLJ) - f5;
        }
        c1835960xsQ.LLLII = f3;
        if ((c1835960xsQ.LLJJIJIIJIL || c1835960xsQ.LLJJIJIL) && !((Boolean) c1835960xsQ.LLJJLIIIJLLLLLLLZ.invoke(Float.valueOf(f2))).booleanValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = c1835960xsQ.LLJJJ;
            if (j <= 0) {
                j = jCurrentTimeMillis;
            }
            long jAbs = Math.abs(jCurrentTimeMillis - j);
            boolean z = c1835960xsQ.LLJJIJIIJIL;
            if (z && jAbs > 0 && jAbs < 1000) {
                c1835960xsQ.LLJJL.invoke();
                Function1<? super Float, Unit> function1 = c1835960xsQ.LLJJIII;
                if (function1 != null) {
                    function1.invoke(Float.valueOf(c1835960xsQ.LIZ(null)));
                    return;
                }
                return;
            }
            if (c1835960xsQ.LLJJIJIL) {
                if (!z) {
                    c1835960xsQ.LLJJL.invoke();
                    Function1<? super Float, Unit> function12 = c1835960xsQ.LLJJIII;
                    if (function12 == null) {
                        return;
                    }
                    function12.invoke(Float.valueOf(c1835960xsQ.LIZ(null)));
                    return;
                }
            } else if (!z) {
                return;
            }
            Function0<Unit> function0 = c1835960xsQ.LLJJIJI;
            if (function0 == null) {
                return;
            }
            function0.invoke();
            return;
        }
        c1835960xsQ.LLJJJIL.LIZJ(Float.valueOf(f2));
    }

    public final void setScrollHandle$live_release(C1835960xsQ c1835960xsQ) {
        this.LLJIJIL = c1835960xsQ;
    }

    public final void setTotalWidth(float f) {
        this.LLILZLL = f;
    }

    public final void setVideoDuration(int i) {
        this.LLILZIL = i;
    }

    public C1835920xsM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C0KXW();
        this.LLILZIL = 1;
        this.LLILZLL = 1.0f;
        this.LLIZ = new AwS571S0100000_27(this, 1280);
        this.LLIZLLLIL = new AwS571S0100000_27(this, 1281);
        this.LLJ = new AwS571S0100000_27(this, 1285);
        this.LLJI = new AwS606S0100000_27(this, 495);
        C1835960xsQ c1835960xsQ = new C1835960xsQ(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1835960xsQ);
        c1835960xsQ.setLayoutParams(layoutParams);
        this.LLJIJIL = c1835960xsQ;
        RecyclerView recyclerView = new RecyclerView(getContext());
        C786410Ut5.p6(recyclerView, new ViewGroup.LayoutParams(-1, -1));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        this.LLJILJIL = recyclerView;
        addView(recyclerView);
        addView(this.LLJIJIL);
        C426750GoL.LJIIIZ(recyclerView, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, false, 16);
    }
}
