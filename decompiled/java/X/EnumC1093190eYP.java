package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eYP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1093190eYP {
    public static final EnumC1093190eYP FEATURE_MODIFY;
    public static final /* synthetic */ EnumC1093190eYP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1093190eYP PITAYA_CEP;
    public static final EnumC1093190eYP PSP_CEP;
    public static final EnumC1093190eYP TTM_CEP;
    public final long LL;

    public static InterfaceC2044707zh<EnumC1093190eYP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1093190eYP enumC1093190eYP = new EnumC1093190eYP("PITAYA_CEP", 0, 1L);
        PITAYA_CEP = enumC1093190eYP;
        EnumC1093190eYP enumC1093190eYP2 = new EnumC1093190eYP("PSP_CEP", 1, 2L);
        PSP_CEP = enumC1093190eYP2;
        EnumC1093190eYP enumC1093190eYP3 = new EnumC1093190eYP("FEATURE_MODIFY", 2, 3L);
        FEATURE_MODIFY = enumC1093190eYP3;
        EnumC1093190eYP enumC1093190eYP4 = new EnumC1093190eYP("TTM_CEP", 3, 4L);
        TTM_CEP = enumC1093190eYP4;
        EnumC1093190eYP[] enumC1093190eYPArr = {enumC1093190eYP, enumC1093190eYP2, enumC1093190eYP3, enumC1093190eYP4};
        LLILLJJLI = enumC1093190eYPArr;
        LLILLL = new C2254308sP(enumC1093190eYPArr);
    }

    public static EnumC1093190eYP[] values() {
        return (EnumC1093190eYP[]) LLILLJJLI.clone();
    }

    public final long getType() {
        return this.LL;
    }

    public static EnumC1093190eYP valueOf(String str) {
        return (EnumC1093190eYP) C08FF.LIZ(EnumC1093190eYP.class, str);
    }

    public EnumC1093190eYP(String str, int i, long j) {
        this.LL = j;
    }
}
