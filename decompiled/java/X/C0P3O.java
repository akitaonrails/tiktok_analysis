package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0P3O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P3O {
    public static final /* synthetic */ C0P3O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0P3O REACH_TYPE_DEFAULT;
    public static final C0P3O REACH_TYPE_GROUP_INLINE_MSG_BOTH_LIKE_CARD;
    public static final C0P3O REACH_TYPE_GROUP_INLINE_MSG_REMINDER_CARD;
    public static final C0P3O REACH_TYPE_GROUP_ONLY_INLINE_MSG;
    public static final C0P3O REACH_TYPE_INLINE_MSG_BOTH_LIKE_CARD;
    public static final C0P3O REACH_TYPE_INLINE_MSG_REMINDER_CARD;
    public static final C0P3O REACH_TYPE_ONLY_INLINE_MSG;
    public final int LL;

    public static InterfaceC2044707zh<C0P3O> getEntries() {
        return LLILLL;
    }

    static {
        C0P3O c0p3o = new C0P3O("REACH_TYPE_DEFAULT", 0, 0);
        REACH_TYPE_DEFAULT = c0p3o;
        C0P3O c0p3o2 = new C0P3O("REACH_TYPE_ONLY_INLINE_MSG", 1, 1);
        REACH_TYPE_ONLY_INLINE_MSG = c0p3o2;
        C0P3O c0p3o3 = new C0P3O("REACH_TYPE_INLINE_MSG_BOTH_LIKE_CARD", 2, 2);
        REACH_TYPE_INLINE_MSG_BOTH_LIKE_CARD = c0p3o3;
        C0P3O c0p3o4 = new C0P3O("REACH_TYPE_INLINE_MSG_REMINDER_CARD", 3, 3);
        REACH_TYPE_INLINE_MSG_REMINDER_CARD = c0p3o4;
        C0P3O c0p3o5 = new C0P3O("REACH_TYPE_GROUP_ONLY_INLINE_MSG", 4, 4);
        REACH_TYPE_GROUP_ONLY_INLINE_MSG = c0p3o5;
        C0P3O c0p3o6 = new C0P3O("REACH_TYPE_GROUP_INLINE_MSG_BOTH_LIKE_CARD", 5, 5);
        REACH_TYPE_GROUP_INLINE_MSG_BOTH_LIKE_CARD = c0p3o6;
        C0P3O c0p3o7 = new C0P3O("REACH_TYPE_GROUP_INLINE_MSG_REMINDER_CARD", 6, 6);
        REACH_TYPE_GROUP_INLINE_MSG_REMINDER_CARD = c0p3o7;
        C0P3O[] c0p3oArr = {c0p3o, c0p3o2, c0p3o3, c0p3o4, c0p3o5, c0p3o6, c0p3o7};
        LLILLJJLI = c0p3oArr;
        LLILLL = new C2254308sP(c0p3oArr);
    }

    public static C0P3O[] values() {
        return (C0P3O[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0P3O valueOf(String str) {
        return (C0P3O) C08FF.LIZ(C0P3O.class, str);
    }

    public C0P3O(String str, int i, int i2) {
        this.LL = i2;
    }
}
