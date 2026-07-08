package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PLQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLQ {
    public static final C0PLQ CARD_BOTTOM;
    public static final /* synthetic */ C0PLQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PLQ NONE;
    public static final C0PLQ PLAYER_INSIDE;

    public static InterfaceC2044707zh<C0PLQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PLQ c0plq = new C0PLQ("PLAYER_INSIDE", 0);
        PLAYER_INSIDE = c0plq;
        C0PLQ c0plq2 = new C0PLQ("CARD_BOTTOM", 1);
        CARD_BOTTOM = c0plq2;
        C0PLQ c0plq3 = new C0PLQ("NONE", 2);
        NONE = c0plq3;
        C0PLQ[] c0plqArr = {c0plq, c0plq2, c0plq3};
        LL = c0plqArr;
        LLILLJJLI = new C2254308sP(c0plqArr);
    }

    public static C0PLQ[] values() {
        return (C0PLQ[]) LL.clone();
    }

    public static C0PLQ valueOf(String str) {
        return (C0PLQ) C08FF.LIZ(C0PLQ.class, str);
    }

    public C0PLQ(String str, int i) {
    }
}
