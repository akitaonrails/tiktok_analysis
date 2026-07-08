package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z92, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z92 {
    public static final /* synthetic */ C0Z92[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0Z92 NORMAL;
    public static final C0Z92 PHOTO_SWAP_INBOX_ENTRANCE;
    public static final C0Z92 PHOTO_SWAP_REVEAL_BUTTON;
    public final String LL;

    public static InterfaceC2044707zh<C0Z92> getEntries() {
        return LLILLL;
    }

    static {
        C0Z92 c0z92 = new C0Z92("NORMAL", 0, "normal");
        NORMAL = c0z92;
        C0Z92 c0z922 = new C0Z92("PHOTO_SWAP_INBOX_ENTRANCE", 1, "photo_swap_inbox_entrance");
        PHOTO_SWAP_INBOX_ENTRANCE = c0z922;
        C0Z92 c0z923 = new C0Z92("PHOTO_SWAP_REVEAL_BUTTON", 2, "photo_swap_reveal_button");
        PHOTO_SWAP_REVEAL_BUTTON = c0z923;
        C0Z92[] c0z92Arr = {c0z92, c0z922, c0z923};
        LLILLJJLI = c0z92Arr;
        LLILLL = new C2254308sP(c0z92Arr);
    }

    public static C0Z92[] values() {
        return (C0Z92[]) LLILLJJLI.clone();
    }

    public final String getFrom() {
        return this.LL;
    }

    public static C0Z92 valueOf(String str) {
        return (C0Z92) C08FF.LIZ(C0Z92.class, str);
    }

    public C0Z92(String str, int i, String str2) {
        this.LL = str2;
    }
}
