package Y;

import X.C1391550mJd;
import X.C1391600mJi;
import X.C1860640yWE;
import X.C1C7U;
import X.C259800zU;
import X.C450650Hln;
import X.EnumC1235690iGF;
import android.view.View;
import com.ss.android.ugc.profile.platform.business.background.ProfileBackgroundComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS16S0200100_19 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((View) this.l0).isAttachedToWindow()) {
            C1391550mJd c1391550mJd = new C1391550mJd(((View) this.l0).getContext());
            View view = (View) this.l0;
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LIZIZ = view;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c1391550mJd.LJII(R.attr.a0d);
            int i = C1860640yWE.LIZ;
            View view2 = (View) this.l0;
            C450650Hln c450650Hln = new C450650Hln(view2.getContext());
            C450650Hln.LJ(c450650Hln, view2.getContext().getString(2131822604), R.attr.a0r);
            c450650Hln.LIZ(0);
            C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
            c1391600mJi2.LJIIZILJ = c450650Hln;
            c1391600mJi2.LJII = this.j2;
            c1391600mJi2.LJIIIIZZ = C1860640yWE.LIZ;
            c1391600mJi2.LJIJJ = true;
            c1391550mJd.LIZJ(new AwS598S0100000_19((Function0) this.l1, (Function0<Unit>) 527));
            c1391550mJd.LIZIZ().show();
        }
    }

    public final void LIZ$1() {
        if (((View) this.l0).isAttachedToWindow()) {
            C1391550mJd c1391550mJd = new C1391550mJd(((View) this.l0).getContext());
            View view = (View) this.l0;
            C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
            c1391600mJi.LIZIZ = view;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c1391550mJd.LJII(R.attr.a0d);
            int i = C1860640yWE.LIZ;
            View view2 = (View) this.l0;
            C450650Hln c450650Hln = new C450650Hln(view2.getContext());
            C450650Hln.LJ(c450650Hln, view2.getContext().getString(2131822586), R.attr.a0r);
            c450650Hln.LIZ(0);
            C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
            c1391600mJi2.LJIIZILJ = c450650Hln;
            c1391600mJi2.LJII = this.j2;
            c1391600mJi2.LJIIIIZZ = C1860640yWE.LIZ;
            c1391600mJi2.LJIJJ = true;
            c1391550mJd.LJ(new AwS563S0100000_19((Function0) this.l1, (Function0<Unit>) 2768));
            c1391550mJd.LIZIZ().show();
        }
    }

    public static final void run$0(ARunnableS16S0200100_19 aRunnableS16S0200100_19) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileBackgroundComponent@e625.scheduleLoopRestart$1");
        try {
            ProfileBackgroundComponent profileBackgroundComponent = (ProfileBackgroundComponent) aRunnableS16S0200100_19.l0;
            if (profileBackgroundComponent.LLLIILIL == aRunnableS16S0200100_19.j2 && profileBackgroundComponent.LLLIL != null) {
                profileBackgroundComponent.Qp();
                ProfileBackgroundComponent profileBackgroundComponent2 = (ProfileBackgroundComponent) aRunnableS16S0200100_19.l0;
                if (profileBackgroundComponent2.LLLILZJ == ((C259800zU) aRunnableS16S0200100_19.l1).element) {
                    profileBackgroundComponent2.LLLILZJ = null;
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBackgroundComponent@e625.scheduleLoopRestart$1");
    }

    public static final void run$1(ARunnableS16S0200100_19 aRunnableS16S0200100_19) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAIVideoGuideHelper@243c.showAIVideoTip$1");
        try {
            aRunnableS16S0200100_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAIVideoGuideHelper@243c.showAIVideoTip$1");
    }

    public static final void run$2(ARunnableS16S0200100_19 aRunnableS16S0200100_19) {
        boolean zLIZ;
        C1C7U.LIZ("TakoAIVideoGuideHelper@243c.showKeyboardSwitchTip$1");
        try {
            aRunnableS16S0200100_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoAIVideoGuideHelper@243c.showKeyboardSwitchTip$1");
    }

    public ARunnableS16S0200100_19(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j2 = j;
        this.l1 = obj2;
    }
}
