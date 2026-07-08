package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114300c1 {
    public static final /* synthetic */ EnumC114300c1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC114300c1 LOAD_TIME;
    public static final EnumC114300c1 METHOD_TIME;

    public static InterfaceC2044707zh<EnumC114300c1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC114300c1 enumC114300c1 = new EnumC114300c1("LOAD_TIME", 0);
        LOAD_TIME = enumC114300c1;
        EnumC114300c1 enumC114300c12 = new EnumC114300c1("METHOD_TIME", 1);
        METHOD_TIME = enumC114300c12;
        EnumC114300c1[] enumC114300c1Arr = {enumC114300c1, enumC114300c12};
        LL = enumC114300c1Arr;
        LLILLJJLI = new C2254308sP(enumC114300c1Arr);
    }

    public static EnumC114300c1[] values() {
        return (EnumC114300c1[]) LL.clone();
    }

    public static EnumC114300c1 valueOf(String str) {
        return (EnumC114300c1) C08FF.LIZ(EnumC114300c1.class, str);
    }

    public EnumC114300c1(String str, int i) {
    }
}
