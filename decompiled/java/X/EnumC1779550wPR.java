package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779550wPR {
    public static final EnumC1779550wPR APP_FOREGROUND;
    public static final EnumC1779550wPR APP_LAUNCH;
    public static final EnumC1779550wPR DELAY_TASK;
    public static final EnumC1779550wPR HYBRID_AB;
    public static final EnumC1779550wPR INIT;
    public static final /* synthetic */ EnumC1779550wPR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1779550wPR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779550wPR enumC1779550wPR = new EnumC1779550wPR("INIT", 0);
        INIT = enumC1779550wPR;
        EnumC1779550wPR enumC1779550wPR2 = new EnumC1779550wPR("DELAY_TASK", 1);
        DELAY_TASK = enumC1779550wPR2;
        EnumC1779550wPR enumC1779550wPR3 = new EnumC1779550wPR("APP_FOREGROUND", 2);
        APP_FOREGROUND = enumC1779550wPR3;
        EnumC1779550wPR enumC1779550wPR4 = new EnumC1779550wPR("APP_LAUNCH", 3);
        APP_LAUNCH = enumC1779550wPR4;
        EnumC1779550wPR enumC1779550wPR5 = new EnumC1779550wPR("HYBRID_AB", 4);
        HYBRID_AB = enumC1779550wPR5;
        EnumC1779550wPR[] enumC1779550wPRArr = {enumC1779550wPR, enumC1779550wPR2, enumC1779550wPR3, enumC1779550wPR4, enumC1779550wPR5};
        LL = enumC1779550wPRArr;
        LLILLJJLI = new C2254308sP(enumC1779550wPRArr);
    }

    public static EnumC1779550wPR[] values() {
        return (EnumC1779550wPR[]) LL.clone();
    }

    public static EnumC1779550wPR valueOf(String str) {
        return (EnumC1779550wPR) C08FF.LIZ(EnumC1779550wPR.class, str);
    }

    public EnumC1779550wPR(String str, int i) {
    }
}
