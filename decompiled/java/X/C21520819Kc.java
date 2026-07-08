package X;

/* JADX INFO: renamed from: X.19Kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21520819Kc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("web_");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(", ");
            sbLIZ2.append(str2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    public static void LIZ(String str, String str2, String str3, C19KZ c19kz) {
        String trackingName;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lifecycle_");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("source=");
        sbLIZ2.append(str2);
        sbLIZ2.append(", sessionId=");
        sbLIZ2.append(str3);
        sbLIZ2.append(", activeTab=");
        if (c19kz != null) {
            trackingName = c19kz.getTrackingName();
        } else {
            trackingName = null;
        }
        sbLIZ2.append(trackingName);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
