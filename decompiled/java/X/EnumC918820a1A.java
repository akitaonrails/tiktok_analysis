package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918820a1A {
    public static final EnumC918820a1A CREATE;
    public static final /* synthetic */ EnumC918820a1A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC918820a1A NOTHING;
    public static final EnumC918820a1A SAVE;
    public static final EnumC918820a1A UPDATE;

    public static InterfaceC2044707zh<EnumC918820a1A> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC918820a1A enumC918820a1A = new EnumC918820a1A("NOTHING", 0);
        NOTHING = enumC918820a1A;
        EnumC918820a1A enumC918820a1A2 = new EnumC918820a1A("CREATE", 1);
        CREATE = enumC918820a1A2;
        EnumC918820a1A enumC918820a1A3 = new EnumC918820a1A("UPDATE", 2);
        UPDATE = enumC918820a1A3;
        EnumC918820a1A enumC918820a1A4 = new EnumC918820a1A("SAVE", 3);
        SAVE = enumC918820a1A4;
        EnumC918820a1A[] enumC918820a1AArr = {enumC918820a1A, enumC918820a1A2, enumC918820a1A3, enumC918820a1A4};
        LL = enumC918820a1AArr;
        LLILLJJLI = new C2254308sP(enumC918820a1AArr);
    }

    public static EnumC918820a1A[] values() {
        return (EnumC918820a1A[]) LL.clone();
    }

    public static EnumC918820a1A valueOf(String str) {
        return (EnumC918820a1A) C08FF.LIZ(EnumC918820a1A.class, str);
    }

    public EnumC918820a1A(String str, int i) {
    }
}
