package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e2L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1073310e2L {
    public static final /* synthetic */ EnumC1073310e2L[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1073310e2L PHASE1;
    public static final EnumC1073310e2L PHASE2;
    public static final EnumC1073310e2L UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1073310e2L> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1073310e2L enumC1073310e2L = new EnumC1073310e2L("UNKNOWN", 0, 0);
        UNKNOWN = enumC1073310e2L;
        EnumC1073310e2L enumC1073310e2L2 = new EnumC1073310e2L("PHASE1", 1, 1);
        PHASE1 = enumC1073310e2L2;
        EnumC1073310e2L enumC1073310e2L3 = new EnumC1073310e2L("PHASE2", 2, 2);
        PHASE2 = enumC1073310e2L3;
        EnumC1073310e2L[] enumC1073310e2LArr = {enumC1073310e2L, enumC1073310e2L2, enumC1073310e2L3};
        LLILLJJLI = enumC1073310e2LArr;
        LLILLL = new C2254308sP(enumC1073310e2LArr);
    }

    public static EnumC1073310e2L[] values() {
        return (EnumC1073310e2L[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1073310e2L valueOf(String str) {
        return (EnumC1073310e2L) C08FF.LIZ(EnumC1073310e2L.class, str);
    }

    public EnumC1073310e2L(String str, int i, int i2) {
        this.LL = i2;
    }
}
