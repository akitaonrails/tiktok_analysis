package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.189a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC212372189a {
    public static final EnumC212372189a DELETE;
    public static final EnumC212372189a HIDE_SYSTEM_CONTENT;
    public static final EnumC212372189a HIDE_USER_CONTENT;
    public static final /* synthetic */ EnumC212372189a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC212372189a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC212372189a enumC212372189a = new EnumC212372189a("DELETE", 0);
        DELETE = enumC212372189a;
        EnumC212372189a enumC212372189a2 = new EnumC212372189a("HIDE_USER_CONTENT", 1);
        HIDE_USER_CONTENT = enumC212372189a2;
        EnumC212372189a enumC212372189a3 = new EnumC212372189a("HIDE_SYSTEM_CONTENT", 2);
        HIDE_SYSTEM_CONTENT = enumC212372189a3;
        EnumC212372189a[] enumC212372189aArr = {enumC212372189a, enumC212372189a2, enumC212372189a3};
        LL = enumC212372189aArr;
        LLILLJJLI = new C2254308sP(enumC212372189aArr);
    }

    public static EnumC212372189a[] values() {
        return (EnumC212372189a[]) LL.clone();
    }

    public static EnumC212372189a valueOf(String str) {
        return (EnumC212372189a) C08FF.LIZ(EnumC212372189a.class, str);
    }

    public EnumC212372189a(String str, int i) {
    }
}
