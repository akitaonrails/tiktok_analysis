package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y82, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y82 {
    public static final C0Y82 CONVERSATION_CHAIN;
    public static final C0Y83 Companion;
    public static final /* synthetic */ C0Y82[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0Y82 PRIORITY_CHAIN;
    public static final C0Y82 RECENT_CONV_CHAIN;
    public static final C0Y82 STATUS_MSG_CHAIN;
    public static final C0Y82 UNKNOWN;
    public static final C0Y82 USER_CHAIN;
    public final int LL;

    public static InterfaceC2044707zh<C0Y82> getEntries() {
        return LLILLL;
    }

    static {
        C0Y82 c0y82 = new C0Y82("UNKNOWN", 0, -1);
        UNKNOWN = c0y82;
        C0Y82 c0y822 = new C0Y82("USER_CHAIN", 1, 0);
        USER_CHAIN = c0y822;
        C0Y82 c0y823 = new C0Y82("RECENT_CONV_CHAIN", 2, 1);
        RECENT_CONV_CHAIN = c0y823;
        C0Y82 c0y824 = new C0Y82("STATUS_MSG_CHAIN", 3, 2);
        STATUS_MSG_CHAIN = c0y824;
        C0Y82 c0y825 = new C0Y82("PRIORITY_CHAIN", 4, 3);
        PRIORITY_CHAIN = c0y825;
        C0Y82 c0y826 = new C0Y82("CONVERSATION_CHAIN", 5, 4);
        CONVERSATION_CHAIN = c0y826;
        C0Y82[] c0y82Arr = {c0y82, c0y822, c0y823, c0y824, c0y825, c0y826};
        LLILLJJLI = c0y82Arr;
        LLILLL = new C2254308sP(c0y82Arr);
        Companion = new C0Y83();
    }

    public static C0Y82[] values() {
        return (C0Y82[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0Y82 valueOf(String str) {
        return (C0Y82) C08FF.LIZ(C0Y82.class, str);
    }

    public C0Y82(String str, int i, int i2) {
        this.LL = i2;
    }
}
