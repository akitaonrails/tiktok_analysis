package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uTV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1705190uTV {
    public static final C1705210uTX Companion;
    public static final EnumC1705190uTV ERASER;
    public static final /* synthetic */ EnumC1705190uTV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1705190uTV NONE;
    public static final EnumC1705190uTV PAINTER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1705190uTV> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0uTX] */
    static {
        EnumC1705190uTV enumC1705190uTV = new EnumC1705190uTV("NONE", 0, "None");
        NONE = enumC1705190uTV;
        EnumC1705190uTV enumC1705190uTV2 = new EnumC1705190uTV("ERASER", 1, "Eraser");
        ERASER = enumC1705190uTV2;
        EnumC1705190uTV enumC1705190uTV3 = new EnumC1705190uTV("PAINTER", 2, "Painter");
        PAINTER = enumC1705190uTV3;
        EnumC1705190uTV[] enumC1705190uTVArr = {enumC1705190uTV, enumC1705190uTV2, enumC1705190uTV3};
        LLILLJJLI = enumC1705190uTVArr;
        LLILLL = new C2254308sP(enumC1705190uTVArr);
        Companion = new Object() { // from class: X.0uTX
        };
    }

    public static EnumC1705190uTV[] values() {
        return (EnumC1705190uTV[]) LLILLJJLI.clone();
    }

    public final String getTypeVal() {
        return this.LL;
    }

    public static EnumC1705190uTV valueOf(String str) {
        return (EnumC1705190uTV) C08FF.LIZ(EnumC1705190uTV.class, str);
    }

    public EnumC1705190uTV(String str, int i, String str2) {
        this.LL = str2;
    }
}
