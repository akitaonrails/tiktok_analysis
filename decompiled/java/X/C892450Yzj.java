package X;

/* JADX INFO: renamed from: X.0Yzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892450Yzj {
    public static String LIZ(C0Z72 c0z72) {
        int i;
        C0Z8A c0z8a = c0z72.contentType;
        if (c0z8a instanceof C1273004yW) {
            EnumC894710Z8b activityStatusLevel = ((C1273004yW) c0z8a).getActivityStatusLevel();
            if (activityStatusLevel != null) {
                return activityStatusLevel.getEventValue();
            }
            return null;
        }
        if (c0z8a instanceof C1232304rx) {
            return "draft";
        }
        if (c0z8a instanceof C892460Yzk) {
            return ((C892460Yzk) c0z8a).getMsgType();
        }
        if (c0z8a instanceof C1232404ry) {
            return ((C1232404ry) c0z8a).getLightInteractionName();
        }
        if (c0z8a instanceof C891940Yyu) {
            EnumC881770YiV status = ((C891940Yyu) c0z8a).getStatus();
            if (status != null && (i = C892430Yzh.LIZ[status.ordinal()]) != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    return "all_seen";
                                }
                                throw new C1954807lC();
                            }
                            return "part_seen";
                        }
                        return "success";
                    }
                    return "failed";
                }
                return "sending";
            }
            return null;
        }
        if (c0z8a instanceof C1274004yg) {
            int i2 = C892430Yzh.LIZIZ[((C1274004yg) c0z8a).getRecentActivityType().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return "repost";
                }
                throw new C1954807lC();
            }
            return "post";
        }
        if (c0z8a instanceof C1231904rt) {
            return "say_hi";
        }
        if (c0z8a instanceof C1232204rw) {
            return "typing";
        }
        if (c0z8a instanceof C1232004ru) {
            return "story_anniversary";
        }
        if (c0z8a instanceof C1232104rv) {
            return "added_thought";
        }
        throw new C1954807lC();
    }
}
