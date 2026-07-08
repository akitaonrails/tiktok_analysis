package X;

import Y.ACListenerS165S0100000_31;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import wh6.AbS710S0100000_31;

/* JADX INFO: renamed from: X.155s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204642155s extends AbstractC204637155n implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public LinearLayout LLILLJJLI;
    public TuxIconView LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public final C1664750tQH LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C204642155s.class, "params", "getParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C204642155s.class, "verticalMusicView", "getVerticalMusicView()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/VerticalMusicView;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final C155H LIZLLL() {
        return (C155H) this.LLIZLLLIL.getValue(this, LLJI[0]);
    }

    @Override // X.AbstractC204637155n
    public final void LIZJ() {
        C1457860o2a c1457860o2a;
        Function0<Boolean> function0;
        if (LIZLLL().LJIIZILJ || !((c1457860o2a = LIZLLL().LJIJJLI) == null || (function0 = c1457860o2a.LIZ) == null || function0.invoke().booleanValue())) {
            if (LIZLLL().LJIJI.LIZ) {
                View view = this.LLILZLL;
                C436180H8m.LIZIZ(view != null ? view : null);
            } else {
                LinearLayout linearLayout = this.LLILLJJLI;
                C436180H8m.LIZIZ(linearLayout != null ? linearLayout : null);
            }
        } else if (LIZLLL().LJIJI.LIZ) {
            View view2 = this.LLILZLL;
            C786410Ut5.LJLLLLLL(0, view2 != null ? view2 : null);
        } else {
            LinearLayout linearLayout2 = this.LLILLJJLI;
            C786410Ut5.LJLLLLLL(0, linearLayout2 != null ? linearLayout2 : null);
        }
        C682480Qpq.LIZ().LIZLLL(LIZLLL().LJJIIJZLJL, LIZLLL().LJI.getLifecycle());
        C673090Qah.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C204642155s(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, C155H.class, null);
        this.LLJ = C1664770tQJ.LIZ(c1drg, AbstractC204621154x.class, null);
    }

    @Override // X.AbstractC204637155n
    public final void LIZ(View view) {
        GradientDrawable.Orientation orientation;
        this.LLILLJJLI = (LinearLayout) view.findViewById(R.id.hyo);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.y42);
        this.LLILZ = view.findViewById(R.id.cov);
        this.LLILZIL = view.findViewById(R.id.bzm);
        this.LLILZLL = view.findViewById(R.id.bzn);
        this.LLIZ = view.findViewById(R.id.c0o);
        LinearLayout linearLayout = null;
        int i = 8;
        if (LIZLLL().LJIIJJI) {
            View view2 = this.LLIZ;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(8, view2);
            View view3 = this.LLILZ;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.LJLLLLLL(0, view3);
            View view4 = this.LLILZ;
            if (view4 == null) {
                view4 = null;
            }
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 12), view4);
        } else {
            View view5 = this.LLILZ;
            if (view5 == null) {
                view5 = null;
            }
            C786410Ut5.LJLLLLLL(8, view5);
            LinearLayout linearLayout2 = this.LLILLJJLI;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C426750GoL.LJIIIZ(linearLayout2, 0, Integer.valueOf((int) C12ES.LIZJ(15.0f, LIZLLL().LJJIIJZLJL)), Integer.valueOf((int) C12ES.LIZJ(16.0f, LIZLLL().LJJIIJZLJL)), 0, false, 16);
        }
        if (LIZLLL().LJIJI.LIZ) {
            boolean zLIZIZ = C444960Hcc.LIZIZ();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + (iLIZIZ * 2);
            View view6 = this.LLILZ;
            if (view6 == null) {
                view6 = null;
            }
            C786410Ut5.LJLLLLLL(8, view6);
            LinearLayout linearLayout3 = this.LLILLJJLI;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            C786410Ut5.LJZL(8, linearLayout3);
            View view7 = this.LLIZ;
            if (view7 == null) {
                view7 = null;
            }
            C786410Ut5.LJLLLLLL(0, view7);
            View view8 = this.LLILZLL;
            if (view8 == null) {
                view8 = null;
            }
            C786410Ut5.LJLLLLLL(0, view8);
            View view9 = this.LLILZIL;
            if (view9 == null) {
                view9 = null;
            }
            if (LIZLLL().LJIIJJI) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) + (iLIZIZ * 3);
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, view9);
            View view10 = this.LLILZIL;
            if (view10 == null) {
                view10 = null;
            }
            C786410Ut5.I7(new ACListenerS165S0100000_31(this, 13), view10);
            View view11 = this.LLILZLL;
            if (view11 == null) {
                view11 = null;
            }
            C786410Ut5.I7(new AbS710S0100000_31(this, 0), view11);
            Integer num = LIZLLL().LJ;
            if (num != null) {
                int iIntValue = num.intValue();
                if (zLIZIZ) {
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                } else {
                    orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                }
                view.findViewById(R.id.c0p).setBackground(new GradientDrawable(orientation, new int[]{iIntValue, 0}));
                C426750GoL.LJIIIZ(view.findViewById(R.id.wyb), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(iLIZIZ2 - iLIZIZ), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            }
        }
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        LinearLayout linearLayout4 = this.LLILLJJLI;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        AnonymousClass1250.LIZIZ(linearLayout4);
        LinearLayout linearLayout5 = this.LLILLJJLI;
        if (linearLayout5 == null) {
            linearLayout5 = null;
        }
        linearLayout5.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        linearLayout5.getLayoutParams().height = -1;
        C426750GoL.LJIIIZ(linearLayout5, 0, 0, 0, 0, false, 16);
        linearLayout5.setGravity(17);
        LinearLayout linearLayout6 = this.LLILLJJLI;
        if (linearLayout6 != null) {
            linearLayout = linearLayout6;
        }
        C786410Ut5.I7(new AbS710S0100000_31(this, 1), linearLayout);
    }
}
