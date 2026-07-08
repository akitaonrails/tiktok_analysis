package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NEN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NEN {
    public static final C0NEN COLD_START;
    public static final C0NEN DEBUG_TOOL;
    public static final /* synthetic */ C0NEN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0NEN PLAY_LAG;
    public static final C0NEN REACH_BOTTOM;

    public static InterfaceC2044707zh<C0NEN> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0NEN c0nen = new C0NEN("REACH_BOTTOM", 0);
        REACH_BOTTOM = c0nen;
        C0NEN c0nen2 = new C0NEN("COLD_START", 1);
        COLD_START = c0nen2;
        C0NEN c0nen3 = new C0NEN("DEBUG_TOOL", 2);
        DEBUG_TOOL = c0nen3;
        C0NEN c0nen4 = new C0NEN("PLAY_LAG", 3);
        PLAY_LAG = c0nen4;
        C0NEN[] c0nenArr = {c0nen, c0nen2, c0nen3, c0nen4};
        LL = c0nenArr;
        LLILLJJLI = new C2254308sP(c0nenArr);
    }

    public static C0NEN[] values() {
        return (C0NEN[]) LL.clone();
    }

    public static C0NEN valueOf(String str) {
        return (C0NEN) C08FF.LIZ(C0NEN.class, str);
    }

    public C0NEN(String str, int i) {
    }
}
