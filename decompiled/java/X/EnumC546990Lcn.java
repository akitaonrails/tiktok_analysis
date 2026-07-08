package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lcn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC546990Lcn {
    public static final EnumC546990Lcn ASYNC_TASK_HANDLER;
    public static final EnumC546990Lcn GLOBAL_ASYNC_HANDLER;
    public static final /* synthetic */ EnumC546990Lcn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC546990Lcn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC546990Lcn enumC546990Lcn = new EnumC546990Lcn("GLOBAL_ASYNC_HANDLER", 0);
        GLOBAL_ASYNC_HANDLER = enumC546990Lcn;
        EnumC546990Lcn enumC546990Lcn2 = new EnumC546990Lcn("ASYNC_TASK_HANDLER", 1);
        ASYNC_TASK_HANDLER = enumC546990Lcn2;
        EnumC546990Lcn[] enumC546990LcnArr = {enumC546990Lcn, enumC546990Lcn2};
        LL = enumC546990LcnArr;
        LLILLJJLI = new C2254308sP(enumC546990LcnArr);
    }

    public static EnumC546990Lcn[] values() {
        return (EnumC546990Lcn[]) LL.clone();
    }

    public static EnumC546990Lcn valueOf(String str) {
        return (EnumC546990Lcn) C08FF.LIZ(EnumC546990Lcn.class, str);
    }

    public EnumC546990Lcn(String str, int i) {
    }
}
