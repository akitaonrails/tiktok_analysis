package X;

/* JADX INFO: renamed from: X.0h57, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190350h57 {
    public static boolean LIZ(Integer num) {
        int value = EnumC1190310h53.POI_REVIEW_TAB_OTHERS.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC1156340gCG.POI_REVIEW_TRIPADVISOR_TAB.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC1156340gCG.POI_REVIEW_TABELOG_TAB.getValue();
                if (num != null && num.intValue() == value3) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }
}
