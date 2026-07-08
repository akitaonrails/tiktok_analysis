package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LG8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LG8 {
    public static final C0LG8 AIGC;
    public static final C0LG8 AI_LIVE_PHOTO;
    public static final C0LG8 ECOMMERCE_COMMENT;
    public static final /* synthetic */ C0LG8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LG8 PHOTO_SEARCH;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<C0LG8> getEntries() {
        return LLILLL;
    }

    static {
        C0LG8 c0lg8 = new C0LG8("ECOMMERCE_COMMENT", 0, 0);
        ECOMMERCE_COMMENT = c0lg8;
        C0LG8 c0lg82 = new C0LG8("PHOTO_SEARCH", 1, 1);
        PHOTO_SEARCH = c0lg82;
        C0LG8 c0lg83 = new C0LG8("AIGC", 2, 2);
        AIGC = c0lg83;
        C0LG8 c0lg84 = new C0LG8("AI_LIVE_PHOTO", 3, 3);
        AI_LIVE_PHOTO = c0lg84;
        C0LG8[] c0lg8Arr = {c0lg8, c0lg82, c0lg83, c0lg84};
        LLILLJJLI = c0lg8Arr;
        LLILLL = new C2254308sP(c0lg8Arr);
    }

    public static C0LG8[] values() {
        return (C0LG8[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0LG8 valueOf(String str) {
        return (C0LG8) C08FF.LIZ(C0LG8.class, str);
    }

    public C0LG8(String str, int i, int i2) {
        this.LL = i2;
    }
}
