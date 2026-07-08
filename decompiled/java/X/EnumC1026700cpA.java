package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1026700cpA {
    public static final EnumC1026700cpA ACT;
    public static final EnumC1026700cpA APK_FILE;
    public static final EnumC1026700cpA BOC;
    public static final EnumC1026700cpA GP;
    public static final EnumC1026700cpA IAB;
    public static final EnumC1026700cpA IN_APP;
    public static final EnumC1026700cpA LIVE;
    public static final /* synthetic */ EnumC1026700cpA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1026700cpA LYNX;
    public static final EnumC1026700cpA MESSAGE;
    public static final EnumC1026700cpA PHONE;
    public static final EnumC1026700cpA SCHEME;
    public static final EnumC1026700cpA UNIVERSAL;

    public static InterfaceC2044707zh<EnumC1026700cpA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1026700cpA enumC1026700cpA = new EnumC1026700cpA("LIVE", 0);
        LIVE = enumC1026700cpA;
        EnumC1026700cpA enumC1026700cpA2 = new EnumC1026700cpA("MESSAGE", 1);
        MESSAGE = enumC1026700cpA2;
        EnumC1026700cpA enumC1026700cpA3 = new EnumC1026700cpA("PHONE", 2);
        PHONE = enumC1026700cpA3;
        EnumC1026700cpA enumC1026700cpA4 = new EnumC1026700cpA("IN_APP", 3);
        IN_APP = enumC1026700cpA4;
        EnumC1026700cpA enumC1026700cpA5 = new EnumC1026700cpA("UNIVERSAL", 4);
        UNIVERSAL = enumC1026700cpA5;
        EnumC1026700cpA enumC1026700cpA6 = new EnumC1026700cpA("SCHEME", 5);
        SCHEME = enumC1026700cpA6;
        EnumC1026700cpA enumC1026700cpA7 = new EnumC1026700cpA("LYNX", 6);
        LYNX = enumC1026700cpA7;
        EnumC1026700cpA enumC1026700cpA8 = new EnumC1026700cpA("ACT", 7);
        ACT = enumC1026700cpA8;
        EnumC1026700cpA enumC1026700cpA9 = new EnumC1026700cpA("BOC", 8);
        BOC = enumC1026700cpA9;
        EnumC1026700cpA enumC1026700cpA10 = new EnumC1026700cpA("APK_FILE", 9);
        APK_FILE = enumC1026700cpA10;
        EnumC1026700cpA enumC1026700cpA11 = new EnumC1026700cpA("IAB", 10);
        IAB = enumC1026700cpA11;
        EnumC1026700cpA enumC1026700cpA12 = new EnumC1026700cpA("GP", 11);
        GP = enumC1026700cpA12;
        EnumC1026700cpA[] enumC1026700cpAArr = {enumC1026700cpA, enumC1026700cpA2, enumC1026700cpA3, enumC1026700cpA4, enumC1026700cpA5, enumC1026700cpA6, enumC1026700cpA7, enumC1026700cpA8, enumC1026700cpA9, enumC1026700cpA10, enumC1026700cpA11, enumC1026700cpA12};
        LL = enumC1026700cpAArr;
        LLILLJJLI = new C2254308sP(enumC1026700cpAArr);
    }

    public static EnumC1026700cpA[] values() {
        return (EnumC1026700cpA[]) LL.clone();
    }

    public static EnumC1026700cpA valueOf(String str) {
        return (EnumC1026700cpA) C08FF.LIZ(EnumC1026700cpA.class, str);
    }

    public EnumC1026700cpA(String str, int i) {
    }
}
