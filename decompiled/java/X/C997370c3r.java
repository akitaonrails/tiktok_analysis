package X;

import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0c3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997370c3r {
    public static <DEPEND extends InterfaceC997360c3q> void LIZ(InterfaceC998100c52<DEPEND> interfaceC998100c52, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroupLJIJI = interfaceC998100c52.Mh().LJIJI();
        ViewGroup.LayoutParams layoutParams = viewGroupLJIJI.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
        }
        C786410Ut5.X5(viewGroupLJIJI.getLayoutParams(), viewGroupLJIJI);
    }

    public static <DEPEND extends InterfaceC997360c3q> void LIZIZ(InterfaceC998100c52<DEPEND> interfaceC998100c52, int i) {
        ViewGroup viewGroupLJIJI = interfaceC998100c52.Mh().LJIJI();
        viewGroupLJIJI.getLayoutParams().height = i;
        C786410Ut5.X5(viewGroupLJIJI.getLayoutParams(), viewGroupLJIJI);
    }

    public static <DEPEND extends InterfaceC997360c3q> void LIZJ(InterfaceC998100c52<DEPEND> interfaceC998100c52, int i) {
        C786410Ut5.LJLZ(i, interfaceC998100c52.Mh().LJIJI());
    }
}
