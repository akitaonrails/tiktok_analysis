package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15MQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15MQ {
    public static final /* synthetic */ C15MQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15MQ LOADING;
    public static final C15MQ PAUSE;
    public static final C15MQ PLAY;

    public static InterfaceC2044707zh<C15MQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15MQ c15mq = new C15MQ("PLAY", 0);
        PLAY = c15mq;
        C15MQ c15mq2 = new C15MQ("PAUSE", 1);
        PAUSE = c15mq2;
        C15MQ c15mq3 = new C15MQ("LOADING", 2);
        LOADING = c15mq3;
        C15MQ[] c15mqArr = {c15mq, c15mq2, c15mq3};
        LL = c15mqArr;
        LLILLJJLI = new C2254308sP(c15mqArr);
    }

    public static C15MQ[] values() {
        return (C15MQ[]) LL.clone();
    }

    public static C15MQ valueOf(String str) {
        return (C15MQ) C08FF.LIZ(C15MQ.class, str);
    }

    public C15MQ(String str, int i) {
    }
}
