package X;

/* JADX INFO: renamed from: X.0IXO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IXO {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LIZ(String str) {
        if (str == null) {
            return "normal";
        }
        switch (str.hashCode()) {
            case -1854802725:
                if (!str.equals("multi_guest_invite_suggest")) {
                    return "normal";
                }
                return "recommend";
            case -1697667698:
                if (!str.equals("multi_guest_invite_by_capsule")) {
                    return "normal";
                }
                return "friend";
            case -1595775075:
                if (!str.equals("multi_guest_invite_by_empty_mask")) {
                    return "normal";
                }
                return "friend";
            case -197470302:
                if (!str.equals("multi_guest_invite_private_message")) {
                    return "normal";
                }
                return "friend";
            case 619566230:
                if (!str.equals("multi_guest_invite")) {
                    return "normal";
                }
                return "friend";
            case 726969668:
                if (!str.equals("multi_guest_invite_guest_invite_friend")) {
                    return "normal";
                }
                return "guestInvite";
            case 1327687062:
                if (!str.equals("multi_guest_invite_group")) {
                    return "normal";
                }
                return "group";
            default:
                return "normal";
        }
    }
}
