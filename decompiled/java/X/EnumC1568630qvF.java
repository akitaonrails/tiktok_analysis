package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1568630qvF {
    public static final EnumC1568630qvF FROZEN_COIN;
    public static final /* synthetic */ EnumC1568630qvF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1568630qvF NORMAL_RECHARGE;

    @InterfaceC1294060jmO
    public static final EnumC1568630qvF RETENTION_TASK;

    public static InterfaceC2044707zh<EnumC1568630qvF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1568630qvF enumC1568630qvF = new EnumC1568630qvF("NORMAL_RECHARGE", 0);
        NORMAL_RECHARGE = enumC1568630qvF;
        EnumC1568630qvF enumC1568630qvF2 = new EnumC1568630qvF("FROZEN_COIN", 1);
        FROZEN_COIN = enumC1568630qvF2;
        EnumC1568630qvF enumC1568630qvF3 = new EnumC1568630qvF("RETENTION_TASK", 2);
        RETENTION_TASK = enumC1568630qvF3;
        EnumC1568630qvF[] enumC1568630qvFArr = {enumC1568630qvF, enumC1568630qvF2, enumC1568630qvF3};
        LL = enumC1568630qvFArr;
        LLILLJJLI = new C2254308sP(enumC1568630qvFArr);
    }

    public static EnumC1568630qvF[] values() {
        return (EnumC1568630qvF[]) LL.clone();
    }

    public static EnumC1568630qvF valueOf(String str) {
        return (EnumC1568630qvF) C08FF.LIZ(EnumC1568630qvF.class, str);
    }

    public EnumC1568630qvF(String str, int i) {
    }
}
