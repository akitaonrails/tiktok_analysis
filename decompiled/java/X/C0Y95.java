package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y95, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y95 {
    public static final C0Y95 ALL;
    public static final /* synthetic */ C0Y95[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0Y95 MUTE;
    public static final C0Y95 UNMUTE;

    public static InterfaceC2044707zh<C0Y95> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0Y95 c0y95 = new C0Y95("ALL", 0);
        ALL = c0y95;
        C0Y95 c0y952 = new C0Y95("UNMUTE", 1);
        UNMUTE = c0y952;
        C0Y95 c0y953 = new C0Y95("MUTE", 2);
        MUTE = c0y953;
        C0Y95[] c0y95Arr = {c0y95, c0y952, c0y953};
        LL = c0y95Arr;
        LLILLJJLI = new C2254308sP(c0y95Arr);
    }

    public static C0Y95[] values() {
        return (C0Y95[]) LL.clone();
    }

    public static C0Y95 valueOf(String str) {
        return (C0Y95) C08FF.LIZ(C0Y95.class, str);
    }

    public C0Y95(String str, int i) {
    }
}
