package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;

/* JADX INFO: renamed from: X.0PCE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCE {
    public static Taco LIZIZ(Fragment fragment) {
        C0P7T c0p7t;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragment, null), "source_default_key", C0P7T.class, null);
        if (interfaceC1555100qZQLIZIZ == null || (c0p7t = (C0P7T) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return c0p7t.LL;
    }

    public static Taco LIZ(View view, boolean z) {
        C0P7T c0p7t;
        Fragment fragmentLIZ;
        Taco taco = null;
        if (z && ((fragmentLIZ = C946803n0.LIZ(view)) == null || fragmentLIZ.getFragmentManager() == null)) {
            return null;
        }
        try {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(view, null), "source_default_key", C0P7T.class, null);
            if (interfaceC1555100qZQLIZIZ != null && (c0p7t = (C0P7T) interfaceC1555100qZQLIZIZ.getSource()) != null) {
                taco = c0p7t.LL;
                return taco;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return taco;
    }
}
