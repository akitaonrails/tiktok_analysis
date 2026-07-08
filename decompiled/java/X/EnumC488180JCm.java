package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC488180JCm {
    public static final EnumC488180JCm CANCEL;
    public static final EnumC488180JCm FAIL;
    public static final /* synthetic */ EnumC488180JCm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC488180JCm SUCCESS;

    public static InterfaceC2044707zh<EnumC488180JCm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC488180JCm enumC488180JCm = new EnumC488180JCm("SUCCESS", 0);
        SUCCESS = enumC488180JCm;
        EnumC488180JCm enumC488180JCm2 = new EnumC488180JCm("FAIL", 1);
        FAIL = enumC488180JCm2;
        EnumC488180JCm enumC488180JCm3 = new EnumC488180JCm("CANCEL", 2);
        CANCEL = enumC488180JCm3;
        EnumC488180JCm[] enumC488180JCmArr = {enumC488180JCm, enumC488180JCm2, enumC488180JCm3};
        LL = enumC488180JCmArr;
        LLILLJJLI = new C2254308sP(enumC488180JCmArr);
    }

    public static EnumC488180JCm[] values() {
        return (EnumC488180JCm[]) LL.clone();
    }

    public static EnumC488180JCm valueOf(String str) {
        return (EnumC488180JCm) C08FF.LIZ(EnumC488180JCm.class, str);
    }

    public EnumC488180JCm(String str, int i) {
    }
}
