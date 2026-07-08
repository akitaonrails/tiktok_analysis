package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07u1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2009507u1 {
    public static final EnumC2009507u1 DAILY_SCREEN_TIME_CHALLENGE_PUSH;
    public static final EnumC2009507u1 DAILY_SCREEN_TIME_NORMAL_PUSH;
    public static final EnumC2009507u1 DAILY_SCREEN_TIME_POPUP;
    public static final /* synthetic */ EnumC2009507u1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2009507u1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2009507u1 enumC2009507u1 = new EnumC2009507u1("DAILY_SCREEN_TIME_POPUP", 0, -1);
        DAILY_SCREEN_TIME_POPUP = enumC2009507u1;
        EnumC2009507u1 enumC2009507u12 = new EnumC2009507u1("DAILY_SCREEN_TIME_NORMAL_PUSH", 1, 2);
        DAILY_SCREEN_TIME_NORMAL_PUSH = enumC2009507u12;
        EnumC2009507u1 enumC2009507u13 = new EnumC2009507u1("DAILY_SCREEN_TIME_CHALLENGE_PUSH", 2, 3);
        DAILY_SCREEN_TIME_CHALLENGE_PUSH = enumC2009507u13;
        EnumC2009507u1[] enumC2009507u1Arr = {enumC2009507u1, enumC2009507u12, enumC2009507u13};
        LLILLJJLI = enumC2009507u1Arr;
        LLILLL = new C2254308sP(enumC2009507u1Arr);
    }

    public static EnumC2009507u1[] values() {
        return (EnumC2009507u1[]) LLILLJJLI.clone();
    }

    public final int getI() {
        return this.LL;
    }

    public static EnumC2009507u1 valueOf(String str) {
        return (EnumC2009507u1) C08FF.LIZ(EnumC2009507u1.class, str);
    }

    public EnumC2009507u1(String str, int i, int i2) {
        this.LL = i2;
    }
}
