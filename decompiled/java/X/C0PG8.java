package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PG8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PG8 {
    public static final C0PG8 ALWAYS_SHOW;
    public static final C0PG8 FIXED_HEIGHT;
    public static final /* synthetic */ C0PG8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PG8 SHOW_WITH_TOP_BAR;
    public static final C0PG8 SHOW_WITH_TOP_ONE_CARD;
    public static final C0PG8 UNTIL_FIRST_CARD_BOTTOM;
    public final int LL;

    public static InterfaceC2044707zh<C0PG8> getEntries() {
        return LLILLL;
    }

    static {
        C0PG8 c0pg8 = new C0PG8("ALWAYS_SHOW", 0, 1);
        ALWAYS_SHOW = c0pg8;
        C0PG8 c0pg82 = new C0PG8("SHOW_WITH_TOP_ONE_CARD", 1, 2);
        SHOW_WITH_TOP_ONE_CARD = c0pg82;
        C0PG8 c0pg83 = new C0PG8("SHOW_WITH_TOP_BAR", 2, 3);
        SHOW_WITH_TOP_BAR = c0pg83;
        C0PG8 c0pg84 = new C0PG8("FIXED_HEIGHT", 3, 4);
        FIXED_HEIGHT = c0pg84;
        C0PG8 c0pg85 = new C0PG8("UNTIL_FIRST_CARD_BOTTOM", 4, 5);
        UNTIL_FIRST_CARD_BOTTOM = c0pg85;
        C0PG8[] c0pg8Arr = {c0pg8, c0pg82, c0pg83, c0pg84, c0pg85};
        LLILLJJLI = c0pg8Arr;
        LLILLL = new C2254308sP(c0pg8Arr);
    }

    public static C0PG8[] values() {
        return (C0PG8[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0PG8 valueOf(String str) {
        return (C0PG8) C08FF.LIZ(C0PG8.class, str);
    }

    public C0PG8(String str, int i, int i2) {
        this.LL = i2;
    }
}
