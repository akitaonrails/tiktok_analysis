package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N67, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N67 {
    public static final C0N67 COHOST_FOLLOW_PROMPT;
    public static final /* synthetic */ C0N67[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N67 MULTI_COHOST_FEEDBACK_DIALOG;

    public static InterfaceC2044707zh<C0N67> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N67 c0n67 = new C0N67("MULTI_COHOST_FEEDBACK_DIALOG", 0);
        MULTI_COHOST_FEEDBACK_DIALOG = c0n67;
        C0N67 c0n672 = new C0N67("COHOST_FOLLOW_PROMPT", 1);
        COHOST_FOLLOW_PROMPT = c0n672;
        C0N67[] c0n67Arr = {c0n67, c0n672};
        LL = c0n67Arr;
        LLILLJJLI = new C2254308sP(c0n67Arr);
    }

    public static C0N67[] values() {
        return (C0N67[]) LL.clone();
    }

    public static C0N67 valueOf(String str) {
        return (C0N67) C08FF.LIZ(C0N67.class, str);
    }

    public C0N67(String str, int i) {
    }
}
