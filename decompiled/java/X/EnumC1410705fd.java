package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05fd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1410705fd {
    public static final EnumC1410705fd ERROR;
    public static final /* synthetic */ EnumC1410705fd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1410705fd LOADING;
    public static final EnumC1410705fd NONE;
    public static final EnumC1410705fd SUCCESS;

    public static InterfaceC2044707zh<EnumC1410705fd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1410705fd enumC1410705fd = new EnumC1410705fd("NONE", 0);
        NONE = enumC1410705fd;
        EnumC1410705fd enumC1410705fd2 = new EnumC1410705fd("LOADING", 1);
        LOADING = enumC1410705fd2;
        EnumC1410705fd enumC1410705fd3 = new EnumC1410705fd("ERROR", 2);
        ERROR = enumC1410705fd3;
        EnumC1410705fd enumC1410705fd4 = new EnumC1410705fd("SUCCESS", 3);
        SUCCESS = enumC1410705fd4;
        EnumC1410705fd[] enumC1410705fdArr = {enumC1410705fd, enumC1410705fd2, enumC1410705fd3, enumC1410705fd4};
        LL = enumC1410705fdArr;
        LLILLJJLI = new C2254308sP(enumC1410705fdArr);
    }

    public static EnumC1410705fd[] values() {
        return (EnumC1410705fd[]) LL.clone();
    }

    public static EnumC1410705fd valueOf(String str) {
        return (EnumC1410705fd) C08FF.LIZ(EnumC1410705fd.class, str);
    }

    public EnumC1410705fd(String str, int i) {
    }
}
