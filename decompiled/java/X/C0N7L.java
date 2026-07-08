package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7L {
    public static final C0N7L BACKGROUND_IMAGE;
    public static final C0N7L INLINE_IMAGE;
    public static final /* synthetic */ C0N7L[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N7L NORMAL_IMAGE;

    public static InterfaceC2044707zh<C0N7L> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N7L c0n7l = new C0N7L("INLINE_IMAGE", 0);
        INLINE_IMAGE = c0n7l;
        C0N7L c0n7l2 = new C0N7L("BACKGROUND_IMAGE", 1);
        BACKGROUND_IMAGE = c0n7l2;
        C0N7L c0n7l3 = new C0N7L("NORMAL_IMAGE", 2);
        NORMAL_IMAGE = c0n7l3;
        C0N7L[] c0n7lArr = {c0n7l, c0n7l2, c0n7l3};
        LL = c0n7lArr;
        LLILLJJLI = new C2254308sP(c0n7lArr);
    }

    public static C0N7L[] values() {
        return (C0N7L[]) LL.clone();
    }

    public static C0N7L valueOf(String str) {
        return (C0N7L) C08FF.LIZ(C0N7L.class, str);
    }

    public C0N7L(String str, int i) {
    }
}
