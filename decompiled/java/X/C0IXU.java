package X;

/* JADX INFO: renamed from: X.0IXU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IXU {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZ(String str) {
        if (str == null) {
            return "outroom_friend";
        }
        switch (str.hashCode()) {
            case -1854802725:
                if (!str.equals("multi_guest_invite_suggest")) {
                    return "outroom_friend";
                }
                return "outroom_recommend_user";
            case 726969668:
                if (!str.equals("multi_guest_invite_guest_invite_friend")) {
                    return "outroom_friend";
                }
                return "outroom_guest_invite_friend";
            case 1327687062:
                if (!str.equals("multi_guest_invite_group")) {
                    return "outroom_friend";
                }
                return "outroom_group";
            case 1851644674:
                if (!str.equals("multi_guest_invite_admin_invite")) {
                    return "outroom_friend";
                }
                return "outroom_admin_invite_friend";
            default:
                return "outroom_friend";
        }
    }
}
