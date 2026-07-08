package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0f9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1116180f9U {
    public static final EnumC1116180f9U DELETED;
    public static final /* synthetic */ EnumC1116180f9U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1116180f9U MANAGE_INFO;
    public static final EnumC1116180f9U SELF_WAITING;

    public static InterfaceC2044707zh<EnumC1116180f9U> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1116180f9U enumC1116180f9U = new EnumC1116180f9U("SELF_WAITING", 0);
        SELF_WAITING = enumC1116180f9U;
        EnumC1116180f9U enumC1116180f9U2 = new EnumC1116180f9U("DELETED", 1);
        DELETED = enumC1116180f9U2;
        EnumC1116180f9U enumC1116180f9U3 = new EnumC1116180f9U("MANAGE_INFO", 2);
        MANAGE_INFO = enumC1116180f9U3;
        EnumC1116180f9U[] enumC1116180f9UArr = {enumC1116180f9U, enumC1116180f9U2, enumC1116180f9U3};
        LL = enumC1116180f9UArr;
        LLILLJJLI = new C2254308sP(enumC1116180f9UArr);
    }

    public static EnumC1116180f9U[] values() {
        return (EnumC1116180f9U[]) LL.clone();
    }

    public static EnumC1116180f9U valueOf(String str) {
        return (EnumC1116180f9U) C08FF.LIZ(EnumC1116180f9U.class, str);
    }

    public EnumC1116180f9U(String str, int i) {
    }
}
