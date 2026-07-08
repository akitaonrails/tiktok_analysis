package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1575230r5t {
    public static final EnumC1575230r5t ACCEPTING;
    public static final EnumC1575230r5t CLOSED;
    public static final C1575240r5u Companion;
    public static final EnumC1575230r5t HIDE;
    public static final EnumC1575230r5t INVITE;
    public static final EnumC1575230r5t INVITE_GAP;
    public static final EnumC1575230r5t INVITE_OUTGAP;
    public static final /* synthetic */ EnumC1575230r5t[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1575230r5t NOT_ESTABLISHED;
    public static final EnumC1575230r5t STARTED;
    public static final EnumC1575230r5t UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1575230r5t> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1575230r5t enumC1575230r5t = new EnumC1575230r5t("UNKNOWN", 0, 0);
        UNKNOWN = enumC1575230r5t;
        EnumC1575230r5t enumC1575230r5t2 = new EnumC1575230r5t("NOT_ESTABLISHED", 1, 1);
        NOT_ESTABLISHED = enumC1575230r5t2;
        EnumC1575230r5t enumC1575230r5t3 = new EnumC1575230r5t("INVITE", 2, 2);
        INVITE = enumC1575230r5t3;
        EnumC1575230r5t enumC1575230r5t4 = new EnumC1575230r5t("INVITE_GAP", 3, 3);
        INVITE_GAP = enumC1575230r5t4;
        EnumC1575230r5t enumC1575230r5t5 = new EnumC1575230r5t("ACCEPTING", 4, 4);
        ACCEPTING = enumC1575230r5t5;
        EnumC1575230r5t enumC1575230r5t6 = new EnumC1575230r5t("INVITE_OUTGAP", 5, 5);
        INVITE_OUTGAP = enumC1575230r5t6;
        EnumC1575230r5t enumC1575230r5t7 = new EnumC1575230r5t("STARTED", 6, 6);
        STARTED = enumC1575230r5t7;
        EnumC1575230r5t enumC1575230r5t8 = new EnumC1575230r5t("CLOSED", 7, 7);
        CLOSED = enumC1575230r5t8;
        EnumC1575230r5t enumC1575230r5t9 = new EnumC1575230r5t("HIDE", 8, 8);
        HIDE = enumC1575230r5t9;
        EnumC1575230r5t[] enumC1575230r5tArr = {enumC1575230r5t, enumC1575230r5t2, enumC1575230r5t3, enumC1575230r5t4, enumC1575230r5t5, enumC1575230r5t6, enumC1575230r5t7, enumC1575230r5t8, enumC1575230r5t9};
        LLILLJJLI = enumC1575230r5tArr;
        LLILLL = new C2254308sP(enumC1575230r5tArr);
        Companion = new C1575240r5u();
    }

    public static EnumC1575230r5t[] values() {
        return (EnumC1575230r5t[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1575230r5t valueOf(String str) {
        return (EnumC1575230r5t) C08FF.LIZ(EnumC1575230r5t.class, str);
    }

    public EnumC1575230r5t(String str, int i, int i2) {
        this.LL = i2;
    }
}
