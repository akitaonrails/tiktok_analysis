package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2004807tG {
    public static final C2004907tH Companion;
    public static final /* synthetic */ EnumC2004807tG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2004807tG MULTI_DSP;
    public static final EnumC2004807tG NORMAL;
    public static final EnumC2004807tG PREFERRED_DSP;
    public static final EnumC2004807tG SINGLE_DSP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2004807tG> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.07tH] */
    static {
        EnumC2004807tG enumC2004807tG = new EnumC2004807tG("NORMAL", 0, 0);
        NORMAL = enumC2004807tG;
        EnumC2004807tG enumC2004807tG2 = new EnumC2004807tG("SINGLE_DSP", 1, 1);
        SINGLE_DSP = enumC2004807tG2;
        EnumC2004807tG enumC2004807tG3 = new EnumC2004807tG("MULTI_DSP", 2, 2);
        MULTI_DSP = enumC2004807tG3;
        EnumC2004807tG enumC2004807tG4 = new EnumC2004807tG("PREFERRED_DSP", 3, 3);
        PREFERRED_DSP = enumC2004807tG4;
        EnumC2004807tG[] enumC2004807tGArr = {enumC2004807tG, enumC2004807tG2, enumC2004807tG3, enumC2004807tG4};
        LLILLJJLI = enumC2004807tGArr;
        LLILLL = new C2254308sP(enumC2004807tGArr);
        Companion = new Object() { // from class: X.07tH
        };
    }

    public static EnumC2004807tG[] values() {
        return (EnumC2004807tG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2004807tG valueOf(String str) {
        return (EnumC2004807tG) C08FF.LIZ(EnumC2004807tG.class, str);
    }

    public EnumC2004807tG(String str, int i, int i2) {
        this.LL = i2;
    }
}
