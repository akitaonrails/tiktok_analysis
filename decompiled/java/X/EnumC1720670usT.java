package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0usT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1720670usT {
    public static final C1720680usU Companion;
    public static final EnumC1720670usT DARK;
    public static final EnumC1720670usT LIGHT;
    public static final /* synthetic */ EnumC1720670usT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1720670usT NORMAL;
    public static final EnumC1720670usT OPPOSITE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1720670usT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1720670usT enumC1720670usT = new EnumC1720670usT("NORMAL", 0, "normal");
        NORMAL = enumC1720670usT;
        EnumC1720670usT enumC1720670usT2 = new EnumC1720670usT("OPPOSITE", 1, "opposite");
        OPPOSITE = enumC1720670usT2;
        EnumC1720670usT enumC1720670usT3 = new EnumC1720670usT("LIGHT", 2, "force_light");
        LIGHT = enumC1720670usT3;
        EnumC1720670usT enumC1720670usT4 = new EnumC1720670usT("DARK", 3, "force_dark");
        DARK = enumC1720670usT4;
        EnumC1720670usT[] enumC1720670usTArr = {enumC1720670usT, enumC1720670usT2, enumC1720670usT3, enumC1720670usT4};
        LLILLJJLI = enumC1720670usTArr;
        LLILLL = new C2254308sP(enumC1720670usTArr);
        Companion = new C1720680usU();
    }

    public static EnumC1720670usT[] values() {
        return (EnumC1720670usT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1720670usT valueOf(String str) {
        return (EnumC1720670usT) C08FF.LIZ(EnumC1720670usT.class, str);
    }

    public EnumC1720670usT(String str, int i, String str2) {
        this.LL = str2;
    }
}
