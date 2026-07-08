package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1586970rOp {
    public static final EnumC1586970rOp COLD_START;
    public static final C1586990rOr Companion;
    public static final EnumC1586970rOp FYP_GUIDE_CARD;
    public static final EnumC1586970rOp HOT_START;
    public static final /* synthetic */ EnumC1586970rOp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1586970rOp LOGIN_SUCCESS;
    public static final EnumC1586970rOp NON_PERSONALIZED_CHANGED;
    public static final EnumC1586970rOp POOLING;
    public static final EnumC1586970rOp SWITCH_ACCOUNT;
    public static final EnumC1586970rOp UNKNOWN;
    public static final EnumC1586970rOp WEB_SOCKET;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1586970rOp> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0rOr] */
    static {
        EnumC1586970rOp enumC1586970rOp = new EnumC1586970rOp("UNKNOWN", 0, 0);
        UNKNOWN = enumC1586970rOp;
        EnumC1586970rOp enumC1586970rOp2 = new EnumC1586970rOp("COLD_START", 1, 1);
        COLD_START = enumC1586970rOp2;
        EnumC1586970rOp enumC1586970rOp3 = new EnumC1586970rOp("HOT_START", 2, 2);
        HOT_START = enumC1586970rOp3;
        EnumC1586970rOp enumC1586970rOp4 = new EnumC1586970rOp("POOLING", 3, 3);
        POOLING = enumC1586970rOp4;
        EnumC1586970rOp enumC1586970rOp5 = new EnumC1586970rOp("LOGIN_SUCCESS", 4, 4);
        LOGIN_SUCCESS = enumC1586970rOp5;
        EnumC1586970rOp enumC1586970rOp6 = new EnumC1586970rOp("SWITCH_ACCOUNT", 5, 5);
        SWITCH_ACCOUNT = enumC1586970rOp6;
        EnumC1586970rOp enumC1586970rOp7 = new EnumC1586970rOp("WEB_SOCKET", 6, 6);
        WEB_SOCKET = enumC1586970rOp7;
        EnumC1586970rOp enumC1586970rOp8 = new EnumC1586970rOp("NON_PERSONALIZED_CHANGED", 7, 7);
        NON_PERSONALIZED_CHANGED = enumC1586970rOp8;
        EnumC1586970rOp enumC1586970rOp9 = new EnumC1586970rOp("FYP_GUIDE_CARD", 8, 8);
        FYP_GUIDE_CARD = enumC1586970rOp9;
        EnumC1586970rOp[] enumC1586970rOpArr = {enumC1586970rOp, enumC1586970rOp2, enumC1586970rOp3, enumC1586970rOp4, enumC1586970rOp5, enumC1586970rOp6, enumC1586970rOp7, enumC1586970rOp8, enumC1586970rOp9};
        LLILLJJLI = enumC1586970rOpArr;
        LLILLL = new C2254308sP(enumC1586970rOpArr);
        Companion = new Object() { // from class: X.0rOr
        };
    }

    public static EnumC1586970rOp[] values() {
        return (EnumC1586970rOp[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1586970rOp valueOf(String str) {
        return (EnumC1586970rOp) C08FF.LIZ(EnumC1586970rOp.class, str);
    }

    public EnumC1586970rOp(String str, int i, int i2) {
        this.LL = i2;
    }
}
