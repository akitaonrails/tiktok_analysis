package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yuT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1875670yuT {
    public static final C1875680yuU Companion;
    public static final EnumC1875670yuT HEAVY;
    public static final EnumC1875670yuT LIGHT;
    public static final /* synthetic */ EnumC1875670yuT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1875670yuT MEDIUM;
    public static final EnumC1875670yuT UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1875670yuT> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0yuU] */
    static {
        EnumC1875670yuT enumC1875670yuT = new EnumC1875670yuT("LIGHT", 0, 50);
        LIGHT = enumC1875670yuT;
        EnumC1875670yuT enumC1875670yuT2 = new EnumC1875670yuT("MEDIUM", 1, 125);
        MEDIUM = enumC1875670yuT2;
        EnumC1875670yuT enumC1875670yuT3 = new EnumC1875670yuT("HEAVY", 2, 255);
        HEAVY = enumC1875670yuT3;
        EnumC1875670yuT enumC1875670yuT4 = new EnumC1875670yuT("UNKNOWN", 3, 0);
        UNKNOWN = enumC1875670yuT4;
        EnumC1875670yuT[] enumC1875670yuTArr = {enumC1875670yuT, enumC1875670yuT2, enumC1875670yuT3, enumC1875670yuT4};
        LLILLJJLI = enumC1875670yuTArr;
        LLILLL = new C2254308sP(enumC1875670yuTArr);
        Companion = new Object() { // from class: X.0yuU
        };
    }

    public static EnumC1875670yuT[] values() {
        return (EnumC1875670yuT[]) LLILLJJLI.clone();
    }

    public final int getAmplitude() {
        return this.LL;
    }

    public static EnumC1875670yuT valueOf(String str) {
        return (EnumC1875670yuT) C08FF.LIZ(EnumC1875670yuT.class, str);
    }

    public EnumC1875670yuT(String str, int i, int i2) {
        this.LL = i2;
    }
}
