package X;

/* JADX INFO: renamed from: X.09fJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC2427909fJ {
    PREFER_SD_CARD,
    PREFER_EXTERNAL,
    PREFER_PRIVATE,
    PREFER_EXTERNAL_EXCLUDE_SDCARD,
    PREFER_EXTERNAL_ONLY;

    public static EnumC2427909fJ valueOf(String str) {
        return (EnumC2427909fJ) C08FF.LIZ(EnumC2427909fJ.class, str);
    }
}
