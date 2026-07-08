package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC444680HcA {
    public static final EnumC444680HcA COMPLETE;
    public static final /* synthetic */ EnumC444680HcA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC444680HcA NO_CONTENT;
    public static final EnumC444680HcA NO_NETWORK;
    public static final EnumC444680HcA SOMETHING_WRONG;
    public static final EnumC444680HcA UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC444680HcA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC444680HcA enumC444680HcA = new EnumC444680HcA("NO_NETWORK", 0);
        NO_NETWORK = enumC444680HcA;
        EnumC444680HcA enumC444680HcA2 = new EnumC444680HcA("SOMETHING_WRONG", 1);
        SOMETHING_WRONG = enumC444680HcA2;
        EnumC444680HcA enumC444680HcA3 = new EnumC444680HcA("NO_CONTENT", 2);
        NO_CONTENT = enumC444680HcA3;
        EnumC444680HcA enumC444680HcA4 = new EnumC444680HcA("UNAVAILABLE", 3);
        UNAVAILABLE = enumC444680HcA4;
        EnumC444680HcA enumC444680HcA5 = new EnumC444680HcA("COMPLETE", 4);
        COMPLETE = enumC444680HcA5;
        EnumC444680HcA[] enumC444680HcAArr = {enumC444680HcA, enumC444680HcA2, enumC444680HcA3, enumC444680HcA4, enumC444680HcA5};
        LL = enumC444680HcAArr;
        LLILLJJLI = new C2254308sP(enumC444680HcAArr);
    }

    public static EnumC444680HcA[] values() {
        return (EnumC444680HcA[]) LL.clone();
    }

    public static EnumC444680HcA valueOf(String str) {
        return (EnumC444680HcA) C08FF.LIZ(EnumC444680HcA.class, str);
    }

    public EnumC444680HcA(String str, int i) {
    }
}
