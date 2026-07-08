package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC880850Yh1 {
    public static final /* synthetic */ EnumC880850Yh1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC880850Yh1 MULTI_SELECT;
    public static final EnumC880850Yh1 NORMAL;

    public static InterfaceC2044707zh<EnumC880850Yh1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC880850Yh1 enumC880850Yh1 = new EnumC880850Yh1("NORMAL", 0);
        NORMAL = enumC880850Yh1;
        EnumC880850Yh1 enumC880850Yh12 = new EnumC880850Yh1("MULTI_SELECT", 1);
        MULTI_SELECT = enumC880850Yh12;
        EnumC880850Yh1[] enumC880850Yh1Arr = {enumC880850Yh1, enumC880850Yh12};
        LL = enumC880850Yh1Arr;
        LLILLJJLI = new C2254308sP(enumC880850Yh1Arr);
    }

    public static EnumC880850Yh1[] values() {
        return (EnumC880850Yh1[]) LL.clone();
    }

    public static EnumC880850Yh1 valueOf(String str) {
        return (EnumC880850Yh1) C08FF.LIZ(EnumC880850Yh1.class, str);
    }

    public EnumC880850Yh1(String str, int i) {
    }
}
