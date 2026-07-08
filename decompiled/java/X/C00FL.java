package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00FL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FL {
    public static final C00FL BULLETIN_BOARD_CARD_TYPE_UNKNOWN;
    public static final C00FL BULLETIN_BOARD_CARD_TYPE_VIDEO;
    public static final /* synthetic */ C00FL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final long LL;

    public static InterfaceC2044707zh<C00FL> getEntries() {
        return LLILLL;
    }

    static {
        C00FL c00fl = new C00FL("BULLETIN_BOARD_CARD_TYPE_UNKNOWN", 0, 0L);
        BULLETIN_BOARD_CARD_TYPE_UNKNOWN = c00fl;
        C00FL c00fl2 = new C00FL("BULLETIN_BOARD_CARD_TYPE_VIDEO", 1, 9L);
        BULLETIN_BOARD_CARD_TYPE_VIDEO = c00fl2;
        C00FL[] c00flArr = {c00fl, c00fl2};
        LLILLJJLI = c00flArr;
        LLILLL = new C2254308sP(c00flArr);
    }

    public static C00FL[] values() {
        return (C00FL[]) LLILLJJLI.clone();
    }

    public final long getType() {
        return this.LL;
    }

    public static C00FL valueOf(String str) {
        return (C00FL) C08FF.LIZ(C00FL.class, str);
    }

    public C00FL(String str, int i, long j) {
        this.LL = j;
    }
}
