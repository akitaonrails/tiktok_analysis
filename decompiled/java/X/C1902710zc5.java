package X;

/* JADX INFO: renamed from: X.0zc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902710zc5 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZIZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "new" : "earlier" : "this_month" : "this_week" : "yesterday" : "today";
    }

    public static final boolean LIZJ() {
        return ((Boolean) C279210Awx.LIZIZ.getValue()).booleanValue() && C19212010Ec.LIZJ.LIZJ() == C05RV.PERSONAL_INBOX;
    }

    public static String LIZ(Integer num) {
        int i = C1904270zeb.LIZJ;
        if (num != null && num.intValue() == i) {
            return "all";
        }
        int i2 = C1904270zeb.LIZ;
        if (num != null && num.intValue() == i2) {
            return "likes";
        }
        int i3 = C1904270zeb.LIZLLL;
        if (num != null) {
            if (num.intValue() == i3) {
                return "comments";
            }
            if (num.intValue() == 84) {
                return "qa";
            }
            if (num.intValue() == 7) {
                return "followers";
            }
        }
        int i4 = C1904270zeb.LIZIZ;
        if (num == null || num.intValue() != i4) {
            return "all";
        }
        return "mentions";
    }
}
