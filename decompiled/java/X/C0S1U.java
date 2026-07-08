package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S1U, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1U {
    public static final C0S1U EMOJI;
    public static final /* synthetic */ C0S1U[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0S1U REPLY_BOX;

    public static InterfaceC2044707zh<C0S1U> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0S1U c0s1u = new C0S1U("REPLY_BOX", 0);
        REPLY_BOX = c0s1u;
        C0S1U c0s1u2 = new C0S1U("EMOJI", 1);
        EMOJI = c0s1u2;
        C0S1U[] c0s1uArr = {c0s1u, c0s1u2};
        LL = c0s1uArr;
        LLILLJJLI = new C2254308sP(c0s1uArr);
    }

    public static C0S1U[] values() {
        return (C0S1U[]) LL.clone();
    }

    public static C0S1U valueOf(String str) {
        return (C0S1U) C08FF.LIZ(C0S1U.class, str);
    }

    public C0S1U(String str, int i) {
    }
}
