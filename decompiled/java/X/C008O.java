package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008O {
    public static final /* synthetic */ C008O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C008O STICKER_SET_ACTION_ADD;
    public static final C008O STICKER_SET_ACTION_REMOVE;
    public static final C008O STICKER_SET_ACTION_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C008O> getEntries() {
        return LLILLL;
    }

    static {
        C008O c008o = new C008O("STICKER_SET_ACTION_UNKNOWN", 0, 0);
        STICKER_SET_ACTION_UNKNOWN = c008o;
        C008O c008o2 = new C008O("STICKER_SET_ACTION_ADD", 1, 1);
        STICKER_SET_ACTION_ADD = c008o2;
        C008O c008o3 = new C008O("STICKER_SET_ACTION_REMOVE", 2, 2);
        STICKER_SET_ACTION_REMOVE = c008o3;
        C008O[] c008oArr = {c008o, c008o2, c008o3};
        LLILLJJLI = c008oArr;
        LLILLL = new C2254308sP(c008oArr);
    }

    public static C008O[] values() {
        return (C008O[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C008O valueOf(String str) {
        return (C008O) C08FF.LIZ(C008O.class, str);
    }

    public C008O(String str, int i, int i2) {
        this.LL = i2;
    }
}
