package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00DG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00DG {
    public static final C00DG ANOTHER_UUID_SHOWING;
    public static final C00DG AUTO_DISMISS;
    public static final C00DG BLOCKED_PERIOD;
    public static final C00DG EXPIRED_UUID;
    public static final C00DG HAS_CLICKED_INLINE;
    public static final C00DG HAS_SENT_PHOTO_STICKER;
    public static final /* synthetic */ C00DG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00DG NO_INLINE_MESSAGE;

    public static InterfaceC2044707zh<C00DG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00DG c00dg = new C00DG("HAS_SENT_PHOTO_STICKER", 0);
        HAS_SENT_PHOTO_STICKER = c00dg;
        C00DG c00dg2 = new C00DG("HAS_CLICKED_INLINE", 1);
        HAS_CLICKED_INLINE = c00dg2;
        C00DG c00dg3 = new C00DG("ANOTHER_UUID_SHOWING", 2);
        ANOTHER_UUID_SHOWING = c00dg3;
        C00DG c00dg4 = new C00DG("AUTO_DISMISS", 3);
        AUTO_DISMISS = c00dg4;
        C00DG c00dg5 = new C00DG("NO_INLINE_MESSAGE", 4);
        NO_INLINE_MESSAGE = c00dg5;
        C00DG c00dg6 = new C00DG("EXPIRED_UUID", 5);
        EXPIRED_UUID = c00dg6;
        C00DG c00dg7 = new C00DG("BLOCKED_PERIOD", 6);
        BLOCKED_PERIOD = c00dg7;
        C00DG[] c00dgArr = {c00dg, c00dg2, c00dg3, c00dg4, c00dg5, c00dg6, c00dg7};
        LL = c00dgArr;
        LLILLJJLI = new C2254308sP(c00dgArr);
    }

    public static C00DG[] values() {
        return (C00DG[]) LL.clone();
    }

    public static C00DG valueOf(String str) {
        return (C00DG) C08FF.LIZ(C00DG.class, str);
    }

    public C00DG(String str, int i) {
    }
}
