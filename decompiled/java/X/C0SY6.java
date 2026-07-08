package X;

/* JADX INFO: renamed from: X.0SY6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SY6 {
    public static C0SY7 LIZ(int i) {
        C0SY7 c0sy7 = C0SY7.NONE;
        if (i != c0sy7.getValue()) {
            C0SY7 c0sy72 = C0SY7.UNFOLLOW;
            if (i != c0sy72.getValue()) {
                c0sy72 = C0SY7.FOLLOWED;
                if (i != c0sy72.getValue()) {
                    c0sy72 = C0SY7.FOLLOW_MUTUAL;
                    if (i != c0sy72.getValue()) {
                        c0sy72 = C0SY7.SAME_USER;
                        if (i != c0sy72.getValue()) {
                            c0sy72 = C0SY7.FOLLOW_REQUESTED;
                            if (i != c0sy72.getValue()) {
                                c0sy72 = C0SY7.UNFOLLOW_BUT_BE_FOLLOWED;
                                if (i == c0sy72.getValue()) {
                                }
                            }
                        }
                    }
                }
            }
            return c0sy72;
        }
        return c0sy7;
    }
}
