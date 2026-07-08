package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.0Xq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860960Xq2 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Keva LIZ = KevaImpl.getRepo("mobile_effect_creation_ban_status", 1);

    public final int LIZIZ() {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("most_recent_ban_");
        sbLIZ.append(currentUserID);
        return keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public final boolean LIZ(int i) {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobile_effect_creation_ban_status_");
        sbLIZ.append(currentUserID);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public final void LIZJ(int i) {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobile_effect_creation_ban_status_");
        sbLIZ.append(currentUserID);
        sbLIZ.append('_');
        sbLIZ.append(i);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public final void LIZLLL(int i) {
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("most_recent_ban_");
        sbLIZ.append(currentUserID);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }
}
