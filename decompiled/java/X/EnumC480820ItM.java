package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ItM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC480820ItM {
    public static final EnumC480820ItM FIRST_SCREEN;
    public static final /* synthetic */ EnumC480820ItM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC480820ItM LOAD_MORE;
    public static final EnumC480820ItM PRELOAD;
    public static final EnumC480820ItM REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC480820ItM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC480820ItM enumC480820ItM = new EnumC480820ItM("PRELOAD", 0, "preload");
        PRELOAD = enumC480820ItM;
        EnumC480820ItM enumC480820ItM2 = new EnumC480820ItM("FIRST_SCREEN", 1, "first_screen");
        FIRST_SCREEN = enumC480820ItM2;
        EnumC480820ItM enumC480820ItM3 = new EnumC480820ItM("REFRESH", 2, "refresh");
        REFRESH = enumC480820ItM3;
        EnumC480820ItM enumC480820ItM4 = new EnumC480820ItM("LOAD_MORE", 3, "load_more");
        LOAD_MORE = enumC480820ItM4;
        EnumC480820ItM[] enumC480820ItMArr = {enumC480820ItM, enumC480820ItM2, enumC480820ItM3, enumC480820ItM4};
        LLILLJJLI = enumC480820ItMArr;
        LLILLL = new C2254308sP(enumC480820ItMArr);
    }

    public static EnumC480820ItM[] values() {
        return (EnumC480820ItM[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC480820ItM valueOf(String str) {
        return (EnumC480820ItM) C08FF.LIZ(EnumC480820ItM.class, str);
    }

    public EnumC480820ItM(String str, int i, String str2) {
        this.LL = str2;
    }
}
