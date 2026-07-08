package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LNA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LNA {
    public static final C0LNA CACHE;
    public static final /* synthetic */ C0LNA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LNA MEMORY;
    public static final C0LNA NETWORK;
    public final String LL;

    public static InterfaceC2044707zh<C0LNA> getEntries() {
        return LLILLL;
    }

    static {
        C0LNA c0lna = new C0LNA("CACHE", 0, "cache");
        CACHE = c0lna;
        C0LNA c0lna2 = new C0LNA("NETWORK", 1, "network");
        NETWORK = c0lna2;
        C0LNA c0lna3 = new C0LNA("MEMORY", 2, "memory");
        MEMORY = c0lna3;
        C0LNA[] c0lnaArr = {c0lna, c0lna2, c0lna3};
        LLILLJJLI = c0lnaArr;
        LLILLL = new C2254308sP(c0lnaArr);
    }

    public static C0LNA[] values() {
        return (C0LNA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0LNA valueOf(String str) {
        return (C0LNA) C08FF.LIZ(C0LNA.class, str);
    }

    public C0LNA(String str, int i, String str2) {
        this.LL = str2;
    }
}
