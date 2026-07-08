package X;

import com.bytedance.keva.Keva;
import lth.o;

/* JADX INFO: renamed from: X.0t83, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653450t83 {
    public final Keva LIZ = Keva.getRepo("live_tab_pop_up_in_record");

    public final boolean LIZ() {
        String currentUserID = o.LJIIZILJ.getCurrentUserID();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_live_tab_pop_up_show");
        sbLIZ.append(currentUserID);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public final boolean LIZIZ() {
        String currentUserID = o.LJIIZILJ.getCurrentUserID();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("never_live_flag_when_first_entrance");
        sbLIZ.append(currentUserID);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public final boolean LIZJ() {
        String currentUserID = o.LJIIZILJ.getCurrentUserID();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("never_go_live_flag_value_as_zero");
        sbLIZ.append(currentUserID);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public final void LIZLLL(boolean z) {
        String currentUserID = o.LJIIZILJ.getCurrentUserID();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("never_live_flag_when_first_entrance");
        sbLIZ.append(currentUserID);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }
}
