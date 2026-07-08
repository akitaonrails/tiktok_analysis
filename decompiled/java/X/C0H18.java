package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H18, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H18 extends ConstraintLayout {
    public final int LL;
    public final C16F5 LLILLJJLI;
    public final LiveIconView LLILLL;
    public final LiveIconView LLILZ;
    public final C16F5 LLILZIL;
    public final View LLILZLL;
    public View.OnClickListener LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    private final ValueAnimator getShowAlphaAnimator() {
        return (ValueAnimator) this.LLIZLLLIL.getValue();
    }

    private final ValueAnimator getShowScaleAnimator() {
        return (ValueAnimator) this.LLJ.getValue();
    }

    public final View.OnClickListener getOnCloseClickListener() {
        return this.LLIZ;
    }

    public final void e0(Throwable th) {
        ViewParent parent;
        Thread thread;
        View rootView = getRootView();
        Thread thread2 = null;
        if (rootView != null && (parent = rootView.getParent()) != null && parent.getClass().getName().equals("android.view.ViewRootImpl")) {
            try {
                thread = (Thread) parent.getClass().getDeclaredField("mThread").get(parent);
                try {
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } catch (Throwable th3) {
                th = th3;
                thread = null;
            }
            thread2 = thread;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update ui error, is main = ");
        sbLIZ.append(Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()));
        sbLIZ.append(", ViewRootImpl: thread = ");
        sbLIZ.append(thread2);
        sbLIZ.append(", wanna content = ");
        sbLIZ.append((Object) this.LLILLJJLI.getText());
        C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.LLIZ = onClickListener;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        getShowAlphaAnimator().cancel();
        getShowScaleAnimator().cancel();
        if (i == 0) {
            getShowAlphaAnimator().start();
            getShowScaleAnimator().start();
        }
    }

    public C0H18(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = -13092808;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1414));
        this.LLJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1415));
        ViewGroup.inflate(context, R.layout.hsr, this);
        this.LLILLJJLI = (C16F5) findViewById(R.id.znh);
        this.LLILLL = (LiveIconView) findViewById(R.id.lhz);
        this.LLILZ = (LiveIconView) findViewById(R.id.li8);
        this.LLILZIL = (C16F5) findViewById(R.id.z86);
        this.LLILZLL = findViewById(R.id.nah);
    }
}
