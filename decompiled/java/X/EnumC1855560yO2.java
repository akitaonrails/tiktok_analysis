package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1855560yO2 {
    public static final EnumC1855560yO2 CLICK_TO_TALK;
    public static final EnumC1855560yO2 DIRECT_TO_TALK;
    public static final EnumC1855560yO2 HOLD_TO_TALK;
    public static final EnumC1855560yO2 KEYBOARD;
    public static final /* synthetic */ EnumC1855560yO2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1855560yO2 LONG_PRESS_TO_TALK;

    public static InterfaceC2044707zh<EnumC1855560yO2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1855560yO2 enumC1855560yO2 = new EnumC1855560yO2("KEYBOARD", 0);
        KEYBOARD = enumC1855560yO2;
        EnumC1855560yO2 enumC1855560yO22 = new EnumC1855560yO2("HOLD_TO_TALK", 1);
        HOLD_TO_TALK = enumC1855560yO22;
        EnumC1855560yO2 enumC1855560yO23 = new EnumC1855560yO2("DIRECT_TO_TALK", 2);
        DIRECT_TO_TALK = enumC1855560yO23;
        EnumC1855560yO2 enumC1855560yO24 = new EnumC1855560yO2("CLICK_TO_TALK", 3);
        CLICK_TO_TALK = enumC1855560yO24;
        EnumC1855560yO2 enumC1855560yO25 = new EnumC1855560yO2("LONG_PRESS_TO_TALK", 4);
        LONG_PRESS_TO_TALK = enumC1855560yO25;
        EnumC1855560yO2[] enumC1855560yO2Arr = {enumC1855560yO2, enumC1855560yO22, enumC1855560yO23, enumC1855560yO24, enumC1855560yO25};
        LL = enumC1855560yO2Arr;
        LLILLJJLI = new C2254308sP(enumC1855560yO2Arr);
    }

    public static EnumC1855560yO2[] values() {
        return (EnumC1855560yO2[]) LL.clone();
    }

    public static EnumC1855560yO2 valueOf(String str) {
        return (EnumC1855560yO2) C08FF.LIZ(EnumC1855560yO2.class, str);
    }

    public EnumC1855560yO2(String str, int i) {
    }
}
