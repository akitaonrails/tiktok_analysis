package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E4K, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4K {
    public static final C0E4K HUE;
    public static final C0E4K LIGHTNESS;
    public static final /* synthetic */ C0E4K[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0E4K SATURATION;

    public static InterfaceC2044707zh<C0E4K> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0E4K c0e4k = new C0E4K("HUE", 0);
        HUE = c0e4k;
        C0E4K c0e4k2 = new C0E4K("SATURATION", 1);
        SATURATION = c0e4k2;
        C0E4K c0e4k3 = new C0E4K("LIGHTNESS", 2);
        LIGHTNESS = c0e4k3;
        C0E4K[] c0e4kArr = {c0e4k, c0e4k2, c0e4k3};
        LL = c0e4kArr;
        LLILLJJLI = new C2254308sP(c0e4kArr);
    }

    public static C0E4K[] values() {
        return (C0E4K[]) LL.clone();
    }

    public static C0E4K valueOf(String str) {
        return (C0E4K) C08FF.LIZ(C0E4K.class, str);
    }

    public C0E4K(String str, int i) {
    }
}
