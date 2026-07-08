package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0Pg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650980Pg8 {
    public static C1345560l7S LIZ(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C650970Pg7 c650970Pg7;
        if (view == null) {
            return null;
        }
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if ((fragmentLIZ != null && fragmentLIZ.getContext() == null) || (interfaceC665370Q7zLJ = C1558360qeg.LJ(view, null)) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJ, "source_default_key", C650970Pg7.class, null)) == null || (c650970Pg7 = (C650970Pg7) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return c650970Pg7.getFragmentData();
    }
}
