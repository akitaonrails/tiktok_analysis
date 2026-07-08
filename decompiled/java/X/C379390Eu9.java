package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0Eu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379390Eu9 {
    public final C379420EuC LIZ = new C379420EuC();

    public final boolean LIZ(String str) {
        C379420EuC c379420EuC = this.LIZ;
        c379420EuC.getClass();
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        Keva keva = c379420EuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("block_editing_sticker_list_");
        sbLIZ.append(currentUserID);
        return C13LQ.LJIILLIIL(str, keva.getStringArray(C2188811AlT.LIZIZ(sbLIZ), new String[0]));
    }
}
