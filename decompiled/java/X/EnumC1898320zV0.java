package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zV0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1898320zV0 {
    public static final EnumC1898320zV0 ANTI_FRAUD_BUBBLE;
    public static final EnumC1898320zV0 COUNTDOWN_BUBBLE;
    public static final /* synthetic */ EnumC1898320zV0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1898320zV0 NORMAL_SHAPE_BUBBLE;
    public static final EnumC1898320zV0 REMINDER_BUBBLE;
    public static final EnumC1898320zV0 SHAPE_BUBBLE;
    public static final EnumC1898320zV0 TIMER_LONG_BUBBLE;
    public static final EnumC1898320zV0 UNKNOWN;

    public static InterfaceC2044707zh<EnumC1898320zV0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1898320zV0 enumC1898320zV0 = new EnumC1898320zV0("TIMER_LONG_BUBBLE", 0);
        TIMER_LONG_BUBBLE = enumC1898320zV0;
        EnumC1898320zV0 enumC1898320zV02 = new EnumC1898320zV0("SHAPE_BUBBLE", 1);
        SHAPE_BUBBLE = enumC1898320zV02;
        EnumC1898320zV0 enumC1898320zV03 = new EnumC1898320zV0("COUNTDOWN_BUBBLE", 2);
        COUNTDOWN_BUBBLE = enumC1898320zV03;
        EnumC1898320zV0 enumC1898320zV04 = new EnumC1898320zV0("NORMAL_SHAPE_BUBBLE", 3);
        NORMAL_SHAPE_BUBBLE = enumC1898320zV04;
        EnumC1898320zV0 enumC1898320zV05 = new EnumC1898320zV0("REMINDER_BUBBLE", 4);
        REMINDER_BUBBLE = enumC1898320zV05;
        EnumC1898320zV0 enumC1898320zV06 = new EnumC1898320zV0("ANTI_FRAUD_BUBBLE", 5);
        ANTI_FRAUD_BUBBLE = enumC1898320zV06;
        EnumC1898320zV0 enumC1898320zV07 = new EnumC1898320zV0("UNKNOWN", 6);
        UNKNOWN = enumC1898320zV07;
        EnumC1898320zV0[] enumC1898320zV0Arr = {enumC1898320zV0, enumC1898320zV02, enumC1898320zV03, enumC1898320zV04, enumC1898320zV05, enumC1898320zV06, enumC1898320zV07};
        LL = enumC1898320zV0Arr;
        LLILLJJLI = new C2254308sP(enumC1898320zV0Arr);
    }

    public static EnumC1898320zV0[] values() {
        return (EnumC1898320zV0[]) LL.clone();
    }

    public static EnumC1898320zV0 valueOf(String str) {
        return (EnumC1898320zV0) C08FF.LIZ(EnumC1898320zV0.class, str);
    }

    public EnumC1898320zV0(String str, int i) {
    }
}
