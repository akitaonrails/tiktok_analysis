package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641610sox implements InterfaceC1641630soz {
    public static final /* synthetic */ EnumC1641610sox[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641610sox PAGE_INVISIBLE;
    public static final EnumC1641610sox USER_OPERATION;

    public static InterfaceC2044707zh<EnumC1641610sox> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641610sox enumC1641610sox = new EnumC1641610sox("PAGE_INVISIBLE", 0);
        PAGE_INVISIBLE = enumC1641610sox;
        EnumC1641610sox enumC1641610sox2 = new EnumC1641610sox("USER_OPERATION", 1);
        USER_OPERATION = enumC1641610sox2;
        EnumC1641610sox[] enumC1641610soxArr = {enumC1641610sox, enumC1641610sox2};
        LL = enumC1641610soxArr;
        LLILLJJLI = new C2254308sP(enumC1641610soxArr);
    }

    public static EnumC1641610sox[] values() {
        return (EnumC1641610sox[]) LL.clone();
    }

    public static EnumC1641610sox valueOf(String str) {
        return (EnumC1641610sox) C08FF.LIZ(EnumC1641610sox.class, str);
    }

    public EnumC1641610sox(String str, int i) {
    }
}
