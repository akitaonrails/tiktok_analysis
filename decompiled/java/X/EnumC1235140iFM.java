package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235140iFM {
    public static final EnumC1235140iFM EMAIL;
    public static final /* synthetic */ EnumC1235140iFM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235140iFM PHONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235140iFM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235140iFM enumC1235140iFM = new EnumC1235140iFM("EMAIL", 0, "email");
        EMAIL = enumC1235140iFM;
        EnumC1235140iFM enumC1235140iFM2 = new EnumC1235140iFM("PHONE", 1, "phone");
        PHONE = enumC1235140iFM2;
        EnumC1235140iFM[] enumC1235140iFMArr = {enumC1235140iFM, enumC1235140iFM2};
        LLILLJJLI = enumC1235140iFMArr;
        LLILLL = new C2254308sP(enumC1235140iFMArr);
    }

    public static EnumC1235140iFM[] values() {
        return (EnumC1235140iFM[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235140iFM valueOf(String str) {
        return (EnumC1235140iFM) C08FF.LIZ(EnumC1235140iFM.class, str);
    }

    public EnumC1235140iFM(String str, int i, String str2) {
        this.LL = str2;
    }
}
