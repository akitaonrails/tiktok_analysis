package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6K {
    public static final /* synthetic */ C0N6K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N6K PREVIEW_STARTED;
    public static final C0N6K RENDER_CREATED;
    public static final C0N6K TET_RENDER_DESTROYED;

    public static InterfaceC2044707zh<C0N6K> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N6K c0n6k = new C0N6K("RENDER_CREATED", 0);
        RENDER_CREATED = c0n6k;
        C0N6K c0n6k2 = new C0N6K("PREVIEW_STARTED", 1);
        PREVIEW_STARTED = c0n6k2;
        C0N6K c0n6k3 = new C0N6K("TET_RENDER_DESTROYED", 2);
        TET_RENDER_DESTROYED = c0n6k3;
        C0N6K[] c0n6kArr = {c0n6k, c0n6k2, c0n6k3};
        LL = c0n6kArr;
        LLILLJJLI = new C2254308sP(c0n6kArr);
    }

    public static C0N6K[] values() {
        return (C0N6K[]) LL.clone();
    }

    public static C0N6K valueOf(String str) {
        return (C0N6K) C08FF.LIZ(C0N6K.class, str);
    }

    public C0N6K(String str, int i) {
    }
}
