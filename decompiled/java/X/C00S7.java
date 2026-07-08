package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00S7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00S7 {
    public static final C00S7 AGE_CONSENT_ACTION_ENUM_NO_SHOW;
    public static final C00S7 AGE_CONSENT_ACTION_ENUM_SHOW;
    public static final C00S7 AGE_CONSENT_ACTION_ENUM_UNKNOWN;
    public static final /* synthetic */ C00S7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C00S7> getEntries() {
        return LLILLL;
    }

    static {
        C00S7 c00s7 = new C00S7("AGE_CONSENT_ACTION_ENUM_UNKNOWN", 0, 0);
        AGE_CONSENT_ACTION_ENUM_UNKNOWN = c00s7;
        C00S7 c00s72 = new C00S7("AGE_CONSENT_ACTION_ENUM_NO_SHOW", 1, 1);
        AGE_CONSENT_ACTION_ENUM_NO_SHOW = c00s72;
        C00S7 c00s73 = new C00S7("AGE_CONSENT_ACTION_ENUM_SHOW", 2, 2);
        AGE_CONSENT_ACTION_ENUM_SHOW = c00s73;
        C00S7[] c00s7Arr = {c00s7, c00s72, c00s73};
        LLILLJJLI = c00s7Arr;
        LLILLL = new C2254308sP(c00s7Arr);
    }

    public static C00S7[] values() {
        return (C00S7[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00S7 valueOf(String str) {
        return (C00S7) C08FF.LIZ(C00S7.class, str);
    }

    public C00S7(String str, int i, int i2) {
        this.LL = i2;
    }
}
