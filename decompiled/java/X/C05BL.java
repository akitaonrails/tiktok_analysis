package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05BL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05BL {
    public static final C05BL DM_CARD;
    public static final /* synthetic */ C05BL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C05BL SKYLIGHT_ANCHOR;
    public static final C05BL SKYLIGHT_TAG;
    public static final C05BL UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C05BL> getEntries() {
        return LLILLL;
    }

    static {
        C05BL c05bl = new C05BL("UNKNOWN", 0, 0);
        UNKNOWN = c05bl;
        C05BL c05bl2 = new C05BL("SKYLIGHT_ANCHOR", 1, 1);
        SKYLIGHT_ANCHOR = c05bl2;
        C05BL c05bl3 = new C05BL("SKYLIGHT_TAG", 2, 2);
        SKYLIGHT_TAG = c05bl3;
        C05BL c05bl4 = new C05BL("DM_CARD", 3, 3);
        DM_CARD = c05bl4;
        C05BL[] c05blArr = {c05bl, c05bl2, c05bl3, c05bl4};
        LLILLJJLI = c05blArr;
        LLILLL = new C2254308sP(c05blArr);
    }

    public static C05BL[] values() {
        return (C05BL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C05BL valueOf(String str) {
        return (C05BL) C08FF.LIZ(C05BL.class, str);
    }

    public C05BL(String str, int i, int i2) {
        this.LL = i2;
    }
}
