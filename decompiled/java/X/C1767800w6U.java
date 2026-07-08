package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallstatus.libra.EcMallUgRefactorConfigSettings;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0w6U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767800w6U {
    @InterfaceC1294060jmO
    public static String LIZ() {
        C1767680w6I c1767680w6I;
        C1767670w6H c1767670w6H;
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        if (c1767790w6T == null || (c1767680w6I = c1767790w6T.LIZJ) == null || (c1767670w6H = c1767680w6I.LIZ) == null) {
            return null;
        }
        return c1767670w6H.LIZ;
    }

    public static InterfaceC599750Nfh LIZIZ() {
        WeakReference<InterfaceC599750Nfh> weakReference = C1767980w6m.LJIIJJI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static String LIZJ() {
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        if (c1767790w6T != null) {
            return c1767790w6T.LJIIIZ;
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static boolean LIZLLL() {
        if (!EcMallUgRefactorConfigSettings.LIZIZ.disableMarkRouteForHandleClick) {
            return C1767980w6m.LJIIIIZZ;
        }
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        return (c1767790w6T == null || c1767790w6T.LJIILL || c1767790w6T.LIZ != EnumC1767410w5r.ROUTE) ? false : true;
    }

    @InterfaceC1294060jmO
    public static boolean LJ() {
        EnumC1767640w6E enumC1767640w6E;
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        if (c1767790w6T != null && (enumC1767640w6E = c1767790w6T.LJ) != null) {
            return enumC1767640w6E.isMallTopTab();
        }
        C0CXF.LIZ.getClass();
        return C0CXF.LJFF();
    }
}
