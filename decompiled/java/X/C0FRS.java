package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FRS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FRS {
    public static final C0FRS LIVE;
    public static final /* synthetic */ C0FRS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FRS NONE;
    public static final C0FRS STORY_UNREAD;

    public static InterfaceC2044707zh<C0FRS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FRS c0frs = new C0FRS("NONE", 0);
        NONE = c0frs;
        C0FRS c0frs2 = new C0FRS("STORY_UNREAD", 1);
        STORY_UNREAD = c0frs2;
        C0FRS c0frs3 = new C0FRS("LIVE", 2);
        LIVE = c0frs3;
        C0FRS[] c0frsArr = {c0frs, c0frs2, c0frs3};
        LL = c0frsArr;
        LLILLJJLI = new C2254308sP(c0frsArr);
    }

    public static C0FRS[] values() {
        return (C0FRS[]) LL.clone();
    }

    public static C0FRS valueOf(String str) {
        return (C0FRS) C08FF.LIZ(C0FRS.class, str);
    }

    public C0FRS(String str, int i) {
    }
}
