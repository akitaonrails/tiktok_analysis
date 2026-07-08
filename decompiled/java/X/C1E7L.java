package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1E7L, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E7L {
    public static final C1E7L AUTH;
    public static final C1E7L AUTH_CONTACT;
    public static final C1E7L AUTH_FB;
    public static final C1E7L AUTH_PHASE1;
    public static final C1E7L AUTH_PHASE2;
    public static final C1E7L BIG_CARD;
    public static final C1E7L BIG_CARD_FRIENDS_FEED;
    public static final C1E7L BIG_CARD_FYP;
    public static final C1E7L EMAIL;
    public static final /* synthetic */ C1E7L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1E7L REC_POP;

    public static InterfaceC2044707zh<C1E7L> getEntries() {
        return LLILLJJLI;
    }

    static {
        C1E7L c1e7l = new C1E7L("REC_POP", 0);
        REC_POP = c1e7l;
        C1E7L c1e7l2 = new C1E7L("BIG_CARD_FYP", 1);
        BIG_CARD_FYP = c1e7l2;
        C1E7L c1e7l3 = new C1E7L("BIG_CARD_FRIENDS_FEED", 2);
        BIG_CARD_FRIENDS_FEED = c1e7l3;
        C1E7L c1e7l4 = new C1E7L("AUTH_FB", 3);
        AUTH_FB = c1e7l4;
        C1E7L c1e7l5 = new C1E7L("AUTH_CONTACT", 4);
        AUTH_CONTACT = c1e7l5;
        C1E7L c1e7l6 = new C1E7L("AUTH_PHASE1", 5);
        AUTH_PHASE1 = c1e7l6;
        C1E7L c1e7l7 = new C1E7L("AUTH_PHASE2", 6);
        AUTH_PHASE2 = c1e7l7;
        C1E7L c1e7l8 = new C1E7L("EMAIL", 7);
        EMAIL = c1e7l8;
        C1E7L c1e7l9 = new C1E7L("AUTH", 8);
        AUTH = c1e7l9;
        C1E7L c1e7l10 = new C1E7L("BIG_CARD", 9);
        BIG_CARD = c1e7l10;
        C1E7L[] c1e7lArr = {c1e7l, c1e7l2, c1e7l3, c1e7l4, c1e7l5, c1e7l6, c1e7l7, c1e7l8, c1e7l9, c1e7l10};
        LL = c1e7lArr;
        LLILLJJLI = new C2254308sP(c1e7lArr);
    }

    public static C1E7L[] values() {
        return (C1E7L[]) LL.clone();
    }

    public static C1E7L valueOf(String str) {
        return (C1E7L) C08FF.LIZ(C1E7L.class, str);
    }

    public C1E7L(String str, int i) {
    }
}
