package X;

/* JADX INFO: renamed from: X.0l2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342490l2V {
    public static final String LIZ(EnumC1342450l2R enumC1342450l2R) {
        if (enumC1342450l2R != null) {
            int i = C1342460l2S.LIZ[enumC1342450l2R.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "creator";
                    }
                    return "hot";
                }
                return "media";
            }
            return "time";
        }
        return "hot";
    }
}
