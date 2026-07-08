package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0no1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1448830no1 {
    public static final EnumC1448830no1 CLICK;
    public static final EnumC1448830no1 COUNT_DOWN;
    public static final /* synthetic */ EnumC1448830no1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1448830no1 NONE;
    public static final EnumC1448830no1 PRESS;

    public static InterfaceC2044707zh<EnumC1448830no1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1448830no1 enumC1448830no1 = new EnumC1448830no1("NONE", 0);
        NONE = enumC1448830no1;
        EnumC1448830no1 enumC1448830no12 = new EnumC1448830no1("CLICK", 1);
        CLICK = enumC1448830no12;
        EnumC1448830no1 enumC1448830no13 = new EnumC1448830no1("PRESS", 2);
        PRESS = enumC1448830no13;
        EnumC1448830no1 enumC1448830no14 = new EnumC1448830no1("COUNT_DOWN", 3);
        COUNT_DOWN = enumC1448830no14;
        EnumC1448830no1[] enumC1448830no1Arr = {enumC1448830no1, enumC1448830no12, enumC1448830no13, enumC1448830no14};
        LL = enumC1448830no1Arr;
        LLILLJJLI = new C2254308sP(enumC1448830no1Arr);
    }

    public static EnumC1448830no1[] values() {
        return (EnumC1448830no1[]) LL.clone();
    }

    public static EnumC1448830no1 valueOf(String str) {
        return (EnumC1448830no1) C08FF.LIZ(EnumC1448830no1.class, str);
    }

    public EnumC1448830no1(String str, int i) {
    }
}
