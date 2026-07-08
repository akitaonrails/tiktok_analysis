package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d0J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1033610d0J {
    public static final EnumC1033610d0J GET;
    public static final /* synthetic */ EnumC1033610d0J[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1033610d0J POST;

    public static InterfaceC2044707zh<EnumC1033610d0J> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1033610d0J enumC1033610d0J = new EnumC1033610d0J("GET", 0);
        GET = enumC1033610d0J;
        EnumC1033610d0J enumC1033610d0J2 = new EnumC1033610d0J("POST", 1);
        POST = enumC1033610d0J2;
        EnumC1033610d0J[] enumC1033610d0JArr = {enumC1033610d0J, enumC1033610d0J2};
        LL = enumC1033610d0JArr;
        LLILLJJLI = new C2254308sP(enumC1033610d0JArr);
    }

    public static EnumC1033610d0J[] values() {
        return (EnumC1033610d0J[]) LL.clone();
    }

    public static EnumC1033610d0J valueOf(String str) {
        return (EnumC1033610d0J) C08FF.LIZ(EnumC1033610d0J.class, str);
    }

    public EnumC1033610d0J(String str, int i) {
    }
}
