package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SM0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SM0 {
    public static final C0SM0 BLUR_PLACEHOLDER;
    public static final C0SM0 COVER_PLACEHOLDER;
    public static final /* synthetic */ C0SM0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0SM0 NONE;

    public static InterfaceC2044707zh<C0SM0> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0SM0 c0sm0 = new C0SM0("NONE", 0);
        NONE = c0sm0;
        C0SM0 c0sm02 = new C0SM0("BLUR_PLACEHOLDER", 1);
        BLUR_PLACEHOLDER = c0sm02;
        C0SM0 c0sm03 = new C0SM0("COVER_PLACEHOLDER", 2);
        COVER_PLACEHOLDER = c0sm03;
        C0SM0[] c0sm0Arr = {c0sm0, c0sm02, c0sm03};
        LL = c0sm0Arr;
        LLILLJJLI = new C2254308sP(c0sm0Arr);
    }

    public static C0SM0[] values() {
        return (C0SM0[]) LL.clone();
    }

    public static C0SM0 valueOf(String str) {
        return (C0SM0) C08FF.LIZ(C0SM0.class, str);
    }

    public C0SM0(String str, int i) {
    }
}
