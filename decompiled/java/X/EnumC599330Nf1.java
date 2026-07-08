package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nf1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599330Nf1 {
    public static final EnumC599330Nf1 INVOKE;
    public static final /* synthetic */ EnumC599330Nf1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC599330Nf1 PUBLISH;
    public static final EnumC599330Nf1 REGISTER;
    public static final EnumC599330Nf1 UNREGISTER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC599330Nf1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC599330Nf1 enumC599330Nf1 = new EnumC599330Nf1("REGISTER", 0, "register");
        REGISTER = enumC599330Nf1;
        EnumC599330Nf1 enumC599330Nf12 = new EnumC599330Nf1("UNREGISTER", 1, "unregister");
        UNREGISTER = enumC599330Nf12;
        EnumC599330Nf1 enumC599330Nf13 = new EnumC599330Nf1("INVOKE", 2, "invoke");
        INVOKE = enumC599330Nf13;
        EnumC599330Nf1 enumC599330Nf14 = new EnumC599330Nf1("PUBLISH", 3, "publish");
        PUBLISH = enumC599330Nf14;
        EnumC599330Nf1[] enumC599330Nf1Arr = {enumC599330Nf1, enumC599330Nf12, enumC599330Nf13, enumC599330Nf14};
        LLILLJJLI = enumC599330Nf1Arr;
        LLILLL = new C2254308sP(enumC599330Nf1Arr);
    }

    public static EnumC599330Nf1[] values() {
        return (EnumC599330Nf1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC599330Nf1 valueOf(String str) {
        return (EnumC599330Nf1) C08FF.LIZ(EnumC599330Nf1.class, str);
    }

    public EnumC599330Nf1(String str, int i, String str2) {
        this.LL = str2;
    }
}
