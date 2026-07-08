package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TI4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TI4 {
    public static final /* synthetic */ C0TI4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TI4 THIRD_PARTY_AGE_RANGE_ENUM_FETCH;
    public static final C0TI4 THIRD_PARTY_AGE_RANGE_ENUM_NO_FETCH;
    public static final C0TI4 THIRD_PARTY_AGE_RANGE_ENUM_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0TI4> getEntries() {
        return LLILLL;
    }

    static {
        C0TI4 c0ti4 = new C0TI4("THIRD_PARTY_AGE_RANGE_ENUM_UNKNOWN", 0, 0);
        THIRD_PARTY_AGE_RANGE_ENUM_UNKNOWN = c0ti4;
        C0TI4 c0ti42 = new C0TI4("THIRD_PARTY_AGE_RANGE_ENUM_NO_FETCH", 1, 1);
        THIRD_PARTY_AGE_RANGE_ENUM_NO_FETCH = c0ti42;
        C0TI4 c0ti43 = new C0TI4("THIRD_PARTY_AGE_RANGE_ENUM_FETCH", 2, 2);
        THIRD_PARTY_AGE_RANGE_ENUM_FETCH = c0ti43;
        C0TI4[] c0ti4Arr = {c0ti4, c0ti42, c0ti43};
        LLILLJJLI = c0ti4Arr;
        LLILLL = new C2254308sP(c0ti4Arr);
    }

    public static C0TI4[] values() {
        return (C0TI4[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0TI4 valueOf(String str) {
        return (C0TI4) C08FF.LIZ(C0TI4.class, str);
    }

    public C0TI4(String str, int i, int i2) {
        this.LL = i2;
    }
}
