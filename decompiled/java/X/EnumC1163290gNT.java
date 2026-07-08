package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gNT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1163290gNT {
    public static final EnumC1163290gNT BOX;
    public static final C1163300gNU Companion;
    public static final EnumC1163290gNT FOUR_SEVEN_EIGHT;
    public static final /* synthetic */ EnumC1163290gNT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1163290gNT> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0gNU] */
    static {
        EnumC1163290gNT enumC1163290gNT = new EnumC1163290gNT("BOX", 0, "box");
        BOX = enumC1163290gNT;
        EnumC1163290gNT enumC1163290gNT2 = new EnumC1163290gNT("FOUR_SEVEN_EIGHT", 1, "478");
        FOUR_SEVEN_EIGHT = enumC1163290gNT2;
        EnumC1163290gNT[] enumC1163290gNTArr = {enumC1163290gNT, enumC1163290gNT2};
        LLILLJJLI = enumC1163290gNTArr;
        LLILLL = new C2254308sP(enumC1163290gNTArr);
        Companion = new Object() { // from class: X.0gNU
        };
    }

    public static EnumC1163290gNT[] values() {
        return (EnumC1163290gNT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1163290gNT valueOf(String str) {
        return (EnumC1163290gNT) C08FF.LIZ(EnumC1163290gNT.class, str);
    }

    public EnumC1163290gNT(String str, int i, String str2) {
        this.LL = str2;
    }
}
