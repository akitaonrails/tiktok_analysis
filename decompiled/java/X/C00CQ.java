package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CQ {
    public static final /* synthetic */ C00CQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00CQ QUOTE_VIDEO;
    public static final C00CQ RETURN_TO_CHAT_FROM_VIDEO_PLAYER;

    public static InterfaceC2044707zh<C00CQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00CQ c00cq = new C00CQ("QUOTE_VIDEO", 0);
        QUOTE_VIDEO = c00cq;
        C00CQ c00cq2 = new C00CQ("RETURN_TO_CHAT_FROM_VIDEO_PLAYER", 1);
        RETURN_TO_CHAT_FROM_VIDEO_PLAYER = c00cq2;
        C00CQ[] c00cqArr = {c00cq, c00cq2};
        LL = c00cqArr;
        LLILLJJLI = new C2254308sP(c00cqArr);
    }

    public static C00CQ[] values() {
        return (C00CQ[]) LL.clone();
    }

    public static C00CQ valueOf(String str) {
        return (C00CQ) C08FF.LIZ(C00CQ.class, str);
    }

    public C00CQ(String str, int i) {
    }
}
