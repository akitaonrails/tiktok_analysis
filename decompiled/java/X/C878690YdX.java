package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserArchiveSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YdX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878690YdX {
    public static final boolean LIZ(C0Y8T c0y8t) {
        if (c0y8t == null) {
            return false;
        }
        int i = C877430YbV.LIZ[C19212010Ec.LIZJ.LIZJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (C879070Ye9.LIZIZ(c0y8t)) {
                        IMChatListApi.LJJIII.getClass();
                        IMUserArchiveSettings iMUserArchiveSettingsLJJJJ = C890330YwJ.LIZ().LJJJJ();
                        if (iMUserArchiveSettingsLJJJJ == null || !Intrinsics.LJFF(iMUserArchiveSettingsLJJJJ.keepConversationsArchived, Boolean.FALSE)) {
                            return false;
                        }
                    }
                } else {
                    throw new C1954807lC();
                }
            } else if (!C879070Ye9.LIZJ(c0y8t, true)) {
                if (!C879070Ye9.LIZIZ(c0y8t)) {
                    return false;
                }
                IMChatListApi.LJJIII.getClass();
                IMUserArchiveSettings iMUserArchiveSettingsLJJJJ2 = C890330YwJ.LIZ().LJJJJ();
                if (iMUserArchiveSettingsLJJJJ2 == null || !Intrinsics.LJFF(iMUserArchiveSettingsLJJJJ2.keepConversationsArchived, Boolean.FALSE)) {
                    return false;
                }
            }
        } else {
            if (C879070Ye9.LJ(c0y8t, false)) {
                return false;
            }
            if (C879070Ye9.LIZIZ(c0y8t)) {
                IMChatListApi.LJJIII.getClass();
                IMUserArchiveSettings iMUserArchiveSettingsLJJJJ3 = C890330YwJ.LIZ().LJJJJ();
                if (iMUserArchiveSettingsLJJJJ3 == null || !Intrinsics.LJFF(iMUserArchiveSettingsLJJJJ3.keepConversationsArchived, Boolean.FALSE)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LIZIZ(C0Y8T c0y8t) {
        long jLJII = C0YNP.LJII(c0y8t.getConversationId());
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(jLJII), null, "im_local_db");
        if (iMUserLJIIL != null && iMUserLJIIL.isBlock()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l) {
        C0Y8T c0y8tLIZ;
        if (c869590Y9l == null || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId())) == null) {
            return false;
        }
        if (c0y8tLIZ.isGroupChat()) {
            C877500Ybc.LIZ.getClass();
            int i = C877510Ybd.LIZ[C877500Ybc.LIZ(c869590Y9l.getConversationId()).ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return false;
                    }
                    throw new C1954807lC();
                }
                if (!C880080Yfm.LIZJ(c869590Y9l)) {
                    return false;
                }
            }
            if (!LIZ(c0y8tLIZ)) {
                return false;
            }
        } else if (!LIZLLL(c0y8tLIZ)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(C0Y8T c0y8t) {
        if (c0y8t == null) {
            return true;
        }
        if (!c0y8t.isMute() && LIZ(c0y8t)) {
            return true;
        }
        return false;
    }
}
