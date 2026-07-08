package X;

/* JADX INFO: renamed from: X.0Cdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C318310Cdp {
    public static String LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("my_effects_draft_cache_key_");
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("my_effects_submitted_cache_key_");
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
