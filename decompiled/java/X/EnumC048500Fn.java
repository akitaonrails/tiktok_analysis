package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC048500Fn {
    public static final /* synthetic */ EnumC048500Fn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC048500Fn NORMAL_PUSH;
    public static final EnumC048500Fn SILENT_PUSH_DEFAULT;

    public static InterfaceC2044707zh<EnumC048500Fn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC048500Fn enumC048500Fn = new EnumC048500Fn("NORMAL_PUSH", 0);
        NORMAL_PUSH = enumC048500Fn;
        EnumC048500Fn enumC048500Fn2 = new EnumC048500Fn("SILENT_PUSH_DEFAULT", 1);
        SILENT_PUSH_DEFAULT = enumC048500Fn2;
        EnumC048500Fn[] enumC048500FnArr = {enumC048500Fn, enumC048500Fn2};
        LL = enumC048500FnArr;
        LLILLJJLI = new C2254308sP(enumC048500FnArr);
    }

    public static EnumC048500Fn[] values() {
        return (EnumC048500Fn[]) LL.clone();
    }

    public static EnumC048500Fn valueOf(String str) {
        return (EnumC048500Fn) C08FF.LIZ(EnumC048500Fn.class, str);
    }

    public EnumC048500Fn(String str, int i) {
    }
}
