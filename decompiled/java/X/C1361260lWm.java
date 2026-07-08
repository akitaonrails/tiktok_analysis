package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361260lWm {
    public static String LIZJ(InterfaceC1361270lWn interfaceC1361270lWn) {
        String aid = interfaceC1361270lWn.getAweme().getAid();
        if (aid == null) {
            return "";
        }
        return aid;
    }

    public static boolean LIZ(InterfaceC1361270lWn interfaceC1361270lWn, InterfaceC1891350zJl interfaceC1891350zJl) {
        String aid;
        String aid2;
        String uid;
        if (!C1203004nE.LIZ()) {
            if (!(interfaceC1891350zJl instanceof InterfaceC1361270lWn)) {
                return false;
            }
            if (interfaceC1361270lWn.getAweme() == null && ((C0OB8) interfaceC1891350zJl).getAweme() != null) {
                return false;
            }
            if (interfaceC1361270lWn.getAweme() != null && ((C0OB8) interfaceC1891350zJl).getAweme() == null) {
                return false;
            }
            Aweme aweme = interfaceC1361270lWn.getAweme();
            String uid2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            InterfaceC1361270lWn interfaceC1361270lWn2 = (InterfaceC1361270lWn) interfaceC1891350zJl;
            Aweme aweme2 = interfaceC1361270lWn2.getAweme();
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            if (!Intrinsics.LJFF(aid, aid2)) {
                return false;
            }
            User userLLILLL = interfaceC1361270lWn.LLILLL();
            if (userLLILLL != null) {
                uid = userLLILLL.getUid();
            } else {
                uid = null;
            }
            User userLLILLL2 = interfaceC1361270lWn2.LLILLL();
            if (userLLILLL2 != null) {
                uid2 = userLLILLL2.getUid();
            }
            if (!Intrinsics.LJFF(uid, uid2)) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, interfaceC1361270lWn);
    }

    public static boolean LIZIZ(InterfaceC1361270lWn interfaceC1361270lWn, InterfaceC1891350zJl interfaceC1891350zJl) {
        String aid;
        String aid2;
        String uid;
        if (C1203004nE.LIZ()) {
            if (!(interfaceC1891350zJl instanceof InterfaceC1361270lWn)) {
                return false;
            }
            if (interfaceC1361270lWn.getAweme() == null && ((C0OB8) interfaceC1891350zJl).getAweme() != null) {
                return false;
            }
            if (interfaceC1361270lWn.getAweme() != null && ((C0OB8) interfaceC1891350zJl).getAweme() == null) {
                return false;
            }
            Aweme aweme = interfaceC1361270lWn.getAweme();
            String uid2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            InterfaceC1361270lWn interfaceC1361270lWn2 = (InterfaceC1361270lWn) interfaceC1891350zJl;
            Aweme aweme2 = interfaceC1361270lWn2.getAweme();
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            if (!Intrinsics.LJFF(aid, aid2)) {
                return false;
            }
            User userLLILLL = interfaceC1361270lWn.LLILLL();
            if (userLLILLL != null) {
                uid = userLLILLL.getUid();
            } else {
                uid = null;
            }
            User userLLILLL2 = interfaceC1361270lWn2.LLILLL();
            if (userLLILLL2 != null) {
                uid2 = userLLILLL2.getUid();
            }
            if (!Intrinsics.LJFF(uid, uid2)) {
                return false;
            }
            return true;
        }
        return C1361280lWo.LIZ(interfaceC1361270lWn, interfaceC1891350zJl);
    }
}
