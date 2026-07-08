package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008L {
    public static final C008L ANSWER_CARD;
    public static final C008L ANSWER_EXPAND_CARD;
    public static final C008L ANSWER_MIX_RANK;
    public static final /* synthetic */ C008L[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final C008L LOW_END_SIMPLE_CARD;
    public static final C008L ONLINE_ANSWER_CARD;
    public static final C008L ONLINE_STREAMING_CARD;
    public static final C008L VISUAL_ONLINE_AI_CARD;
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public static InterfaceC2044707zh<C008L> getEntries() {
        return LLILZIL;
    }

    static {
        C008L c008l = new C008L("ANSWER_CARD", 0, false, false, false, 7);
        ANSWER_CARD = c008l;
        C008L c008l2 = new C008L("ANSWER_EXPAND_CARD", 1, false, false, true, 3);
        ANSWER_EXPAND_CARD = c008l2;
        C008L c008l3 = new C008L("ONLINE_ANSWER_CARD", 2, false, true, false, 5);
        ONLINE_ANSWER_CARD = c008l3;
        C008L c008l4 = new C008L("VISUAL_ONLINE_AI_CARD", 3, false, true, false, 5);
        VISUAL_ONLINE_AI_CARD = c008l4;
        C008L c008l5 = new C008L("ANSWER_MIX_RANK", 4, true, false, false, 6);
        ANSWER_MIX_RANK = c008l5;
        C008L c008l6 = new C008L("LOW_END_SIMPLE_CARD", 5, false, false, false, 7);
        LOW_END_SIMPLE_CARD = c008l6;
        C008L c008l7 = new C008L("ONLINE_STREAMING_CARD", 6, false, true, false, 5);
        ONLINE_STREAMING_CARD = c008l7;
        C008L[] c008lArr = {c008l, c008l2, c008l3, c008l4, c008l5, c008l6, c008l7};
        LLILZ = c008lArr;
        LLILZIL = new C2254308sP(c008lArr);
    }

    public static C008L[] values() {
        return (C008L[]) LLILZ.clone();
    }

    public final boolean isExpand() {
        return this.LLILLL;
    }

    public final boolean isMixTop1() {
        return this.LL;
    }

    public final boolean isOnline() {
        return this.LLILLJJLI;
    }

    public static C008L valueOf(String str) {
        return (C008L) C08FF.LIZ(C008L.class, str);
    }

    public C008L(String str, int i, boolean z, boolean z2, boolean z3, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        z3 = (i2 & 4) != 0 ? false : z3;
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
    }
}
