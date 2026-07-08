package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1241340iPM {
    public static final /* synthetic */ EnumC1241340iPM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1241340iPM RECENT;
    public static final EnumC1241340iPM RESULT;
    public static final EnumC1241340iPM SUGGESTED;
    public static final EnumC1241340iPM USER_FILTER;

    public static InterfaceC2044707zh<EnumC1241340iPM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1241340iPM enumC1241340iPM = new EnumC1241340iPM("SUGGESTED", 0);
        SUGGESTED = enumC1241340iPM;
        EnumC1241340iPM enumC1241340iPM2 = new EnumC1241340iPM("RECENT", 1);
        RECENT = enumC1241340iPM2;
        EnumC1241340iPM enumC1241340iPM3 = new EnumC1241340iPM("USER_FILTER", 2);
        USER_FILTER = enumC1241340iPM3;
        EnumC1241340iPM enumC1241340iPM4 = new EnumC1241340iPM("RESULT", 3);
        RESULT = enumC1241340iPM4;
        EnumC1241340iPM[] enumC1241340iPMArr = {enumC1241340iPM, enumC1241340iPM2, enumC1241340iPM3, enumC1241340iPM4};
        LL = enumC1241340iPMArr;
        LLILLJJLI = new C2254308sP(enumC1241340iPMArr);
    }

    public static EnumC1241340iPM[] values() {
        return (EnumC1241340iPM[]) LL.clone();
    }

    public static EnumC1241340iPM valueOf(String str) {
        return (EnumC1241340iPM) C08FF.LIZ(EnumC1241340iPM.class, str);
    }

    public EnumC1241340iPM(String str, int i) {
    }
}
