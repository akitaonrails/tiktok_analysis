package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19283910cP {
    public static final C19284410cU Companion;
    public static final EnumC19283910cP EXIT_APP;
    public static final EnumC19283910cP INTERVAL;
    public static final /* synthetic */ EnumC19283910cP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19283910cP LOGIN_ACCOUNT;
    public static final EnumC19283910cP LOGOUT_ACCOUNT;
    public static final EnumC19283910cP OPEN_APP;
    public static final EnumC19283910cP PIP;
    public static final EnumC19283910cP REAL_TIME;
    public static final EnumC19283910cP SWITCH_ACCOUNT_ACTIVATE;
    public static final EnumC19283910cP SWITCH_ACCOUNT_DEACTIVATE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19283910cP> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.10cU] */
    static {
        EnumC19283910cP enumC19283910cP = new EnumC19283910cP("OPEN_APP", 0, 1);
        OPEN_APP = enumC19283910cP;
        EnumC19283910cP enumC19283910cP2 = new EnumC19283910cP("EXIT_APP", 1, 2);
        EXIT_APP = enumC19283910cP2;
        EnumC19283910cP enumC19283910cP3 = new EnumC19283910cP("INTERVAL", 2, 3);
        INTERVAL = enumC19283910cP3;
        EnumC19283910cP enumC19283910cP4 = new EnumC19283910cP("LOGOUT_ACCOUNT", 3, 4);
        LOGOUT_ACCOUNT = enumC19283910cP4;
        EnumC19283910cP enumC19283910cP5 = new EnumC19283910cP("LOGIN_ACCOUNT", 4, 5);
        LOGIN_ACCOUNT = enumC19283910cP5;
        EnumC19283910cP enumC19283910cP6 = new EnumC19283910cP("SWITCH_ACCOUNT_DEACTIVATE", 5, 6);
        SWITCH_ACCOUNT_DEACTIVATE = enumC19283910cP6;
        EnumC19283910cP enumC19283910cP7 = new EnumC19283910cP("SWITCH_ACCOUNT_ACTIVATE", 6, 7);
        SWITCH_ACCOUNT_ACTIVATE = enumC19283910cP7;
        EnumC19283910cP enumC19283910cP8 = new EnumC19283910cP("PIP", 7, 8);
        PIP = enumC19283910cP8;
        EnumC19283910cP enumC19283910cP9 = new EnumC19283910cP("REAL_TIME", 8, 9);
        REAL_TIME = enumC19283910cP9;
        EnumC19283910cP[] enumC19283910cPArr = {enumC19283910cP, enumC19283910cP2, enumC19283910cP3, enumC19283910cP4, enumC19283910cP5, enumC19283910cP6, enumC19283910cP7, enumC19283910cP8, enumC19283910cP9};
        LLILLJJLI = enumC19283910cPArr;
        LLILLL = new C2254308sP(enumC19283910cPArr);
        Companion = new Object() { // from class: X.10cU
        };
    }

    public static EnumC19283910cP[] values() {
        return (EnumC19283910cP[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC19283910cP valueOf(String str) {
        return (EnumC19283910cP) C08FF.LIZ(EnumC19283910cP.class, str);
    }

    public EnumC19283910cP(String str, int i, int i2) {
        this.LL = i2;
    }
}
