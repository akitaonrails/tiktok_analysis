package X;

/* JADX INFO: renamed from: X.0a0U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918400a0U {
    public static final boolean LIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1854802725) {
            if (iHashCode != -1697667698) {
                if (iHashCode == -1595775075 && str.equals("multi_guest_invite_by_empty_mask")) {
                    return true;
                }
            } else if (str.equals("multi_guest_invite_by_capsule")) {
                return true;
            }
        } else if (str.equals("multi_guest_invite_suggest")) {
            return true;
        }
        return false;
    }
}
