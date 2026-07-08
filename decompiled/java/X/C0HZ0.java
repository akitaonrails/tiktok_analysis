package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZ0 {
    public static final C0HZ0 AI_SELF;
    public static final C0HZ1 Companion;
    public static final /* synthetic */ C0HZ0[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0HZ0 NONE;
    public static final C0HZ0 SOCIAL_AVATAR;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<C0HZ0> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0HZ1] */
    static {
        C0HZ0 c0hz0 = new C0HZ0("SOCIAL_AVATAR", 0, 0, 2131827051);
        SOCIAL_AVATAR = c0hz0;
        C0HZ0 c0hz02 = new C0HZ0("AI_SELF", 1, 1, 2131830920);
        AI_SELF = c0hz02;
        C0HZ0 c0hz03 = new C0HZ0("NONE", 2, 2, -1);
        NONE = c0hz03;
        C0HZ0[] c0hz0Arr = {c0hz0, c0hz02, c0hz03};
        LLILLL = c0hz0Arr;
        LLILZ = new C2254308sP(c0hz0Arr);
        Companion = new Object() { // from class: X.0HZ1
        };
    }

    public static C0HZ0[] values() {
        return (C0HZ0[]) LLILLL.clone();
    }

    public final int getStrId() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0HZ0 valueOf(String str) {
        return (C0HZ0) C08FF.LIZ(C0HZ0.class, str);
    }

    public C0HZ0(String str, int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}
