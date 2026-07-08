package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC555310LqD {
    public static final /* synthetic */ EnumC555310LqD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC555310LqD REAL;
    public static final EnumC555310LqD VIRTUAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC555310LqD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC555310LqD enumC555310LqD = new EnumC555310LqD("REAL", 0, "real");
        REAL = enumC555310LqD;
        EnumC555310LqD enumC555310LqD2 = new EnumC555310LqD("VIRTUAL", 1, "virtual");
        VIRTUAL = enumC555310LqD2;
        EnumC555310LqD[] enumC555310LqDArr = {enumC555310LqD, enumC555310LqD2};
        LLILLJJLI = enumC555310LqDArr;
        LLILLL = new C2254308sP(enumC555310LqDArr);
    }

    public static EnumC555310LqD[] values() {
        return (EnumC555310LqD[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC555310LqD valueOf(String str) {
        return (EnumC555310LqD) C08FF.LIZ(EnumC555310LqD.class, str);
    }

    public EnumC555310LqD(String str, int i, String str2) {
        this.LL = str2;
    }
}
