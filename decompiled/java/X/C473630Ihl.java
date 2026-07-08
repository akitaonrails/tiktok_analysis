package X;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: renamed from: X.0Ihl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473630Ihl extends AbstractC473640Ihm {
    public final AbstractC473620Ihk LIZ;

    public final void LIZJ() {
        AbstractC473620Ihk abstractC473620Ihk = this.LIZ;
        if (abstractC473620Ihk != null) {
            abstractC473620Ihk.LIZLLL();
        }
    }

    public C473630Ihl(AbstractC473620Ihk abstractC473620Ihk) {
        this.LIZ = abstractC473620Ihk;
    }

    public final String LIZIZ(String str) {
        String strLIZJ;
        AbstractC473620Ihk abstractC473620Ihk = this.LIZ;
        if (abstractC473620Ihk == null || (strLIZJ = abstractC473620Ihk.LIZJ(str)) == null) {
            return "";
        }
        return strLIZJ;
    }

    public final void LIZLLL(boolean z) {
        AbstractC473620Ihk abstractC473620Ihk = this.LIZ;
        if (abstractC473620Ihk != null) {
            abstractC473620Ihk.LJ(z);
        }
    }

    public final void LJ(ComponentActivity componentActivity, boolean z) {
        AbstractC473620Ihk abstractC473620Ihk = this.LIZ;
        if (abstractC473620Ihk != null) {
            abstractC473620Ihk.LJFF(componentActivity, z);
        }
    }

    public final boolean LIZ(ComponentActivity componentActivity, DialogFragment dialogFragment, Long l) {
        AbstractC473620Ihk abstractC473620Ihk = this.LIZ;
        if (abstractC473620Ihk != null) {
            return abstractC473620Ihk.LIZ(componentActivity, dialogFragment, l);
        }
        return false;
    }
}
