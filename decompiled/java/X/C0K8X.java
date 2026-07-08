package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K8X, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K8X {
    public static final C0K8X AT;
    public static final C0K8X EMOJI;
    public static final /* synthetic */ C0K8X[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0K8X NONE;
    public static final C0K8X STICKER;

    public static InterfaceC2044707zh<C0K8X> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0K8X c0k8x = new C0K8X("NONE", 0);
        NONE = c0k8x;
        C0K8X c0k8x2 = new C0K8X("EMOJI", 1);
        EMOJI = c0k8x2;
        C0K8X c0k8x3 = new C0K8X("AT", 2);
        AT = c0k8x3;
        C0K8X c0k8x4 = new C0K8X("STICKER", 3);
        STICKER = c0k8x4;
        C0K8X[] c0k8xArr = {c0k8x, c0k8x2, c0k8x3, c0k8x4};
        LL = c0k8xArr;
        LLILLJJLI = new C2254308sP(c0k8xArr);
    }

    public static C0K8X[] values() {
        return (C0K8X[]) LL.clone();
    }

    public static C0K8X valueOf(String str) {
        return (C0K8X) C08FF.LIZ(C0K8X.class, str);
    }

    public C0K8X(String str, int i) {
    }
}
