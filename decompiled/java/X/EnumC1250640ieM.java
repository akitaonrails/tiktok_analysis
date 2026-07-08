package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ieM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1250640ieM {
    public static final /* synthetic */ EnumC1250640ieM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1250640ieM PARALLEL;
    public final String LL = "parallel";

    public static InterfaceC2044707zh<EnumC1250640ieM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1250640ieM enumC1250640ieM = new EnumC1250640ieM();
        PARALLEL = enumC1250640ieM;
        EnumC1250640ieM[] enumC1250640ieMArr = {enumC1250640ieM};
        LLILLJJLI = enumC1250640ieMArr;
        LLILLL = new C2254308sP(enumC1250640ieMArr);
    }

    public static EnumC1250640ieM[] values() {
        return (EnumC1250640ieM[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1250640ieM valueOf(String str) {
        return (EnumC1250640ieM) C08FF.LIZ(EnumC1250640ieM.class, str);
    }
}
