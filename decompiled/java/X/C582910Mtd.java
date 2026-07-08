package X;

import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mtd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C582910Mtd {
    public static volatile boolean LIZ;
    public static boolean LIZIZ;
    public static WeakReference<InterfaceC739770T0d> LIZJ;
    public static WeakReference<IBaseListFragmentPanel> LIZLLL;
    public static C582930Mtf LJ;
    public static String LJFF;
    public static C582900Mtc LJI;
    public static AnonymousClass0956 LJII;
    public static C054G LJIIIIZZ;
    public static boolean LJIIIZ;

    public static void LIZ(IBaseListFragmentPanel iBaseListFragmentPanel) {
        Fragment fragment;
        C19EG activity;
        if (iBaseListFragmentPanel == null || (fragment = iBaseListFragmentPanel.getFragment()) == null || (activity = fragment.getActivity()) == null || !Intrinsics.LJFF(activity.getClass().getSimpleName(), "MainActivity")) {
            return;
        }
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strPz = c446900Hfk.LIZ(activity).pz(iBaseListFragmentPanel.getFragment());
        if (strPz == null) {
            return;
        }
        LJFF = strPz;
        C582900Mtc c582900Mtc = LJI;
        if (c582900Mtc != null) {
            c446900Hfk.LIZ(activity).wQ2(strPz, c582900Mtc);
        }
    }

    public static void LIZIZ(IBaseListFragmentPanel iBaseListFragmentPanel) {
        Fragment fragment;
        C19EG activity;
        if (iBaseListFragmentPanel != null && (fragment = iBaseListFragmentPanel.getFragment()) != null && (activity = fragment.getActivity()) != null) {
            String str = LJFF;
            C582900Mtc c582900Mtc = LJI;
            if (str != null && c582900Mtc != null) {
                Hox.LLJILJIL.LIZ(activity).PQ2(str, c582900Mtc);
            }
        }
    }
}
