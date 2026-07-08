package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1874010yrn {
    public static final C1873340yqi Companion;
    public static final EnumC1874010yrn DEBUG_META_UPDATE;
    public static final EnumC1874010yrn GAME_READY;
    public static final EnumC1874010yrn IFRAME_END;
    public static final EnumC1874010yrn LAUNCH_END;
    public static final /* synthetic */ EnumC1874010yrn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1874010yrn MAIN_FRAME_READY;
    public static final EnumC1874010yrn PERF_MONITOR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1874010yrn> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0yqi] */
    static {
        EnumC1874010yrn enumC1874010yrn = new EnumC1874010yrn("MAIN_FRAME_READY", 0, "minis.mainframeReady");
        MAIN_FRAME_READY = enumC1874010yrn;
        EnumC1874010yrn enumC1874010yrn2 = new EnumC1874010yrn("IFRAME_END", 1, "minis.loadIframeEnd");
        IFRAME_END = enumC1874010yrn2;
        EnumC1874010yrn enumC1874010yrn3 = new EnumC1874010yrn("LAUNCH_END", 2, "minis.launchEnd");
        LAUNCH_END = enumC1874010yrn3;
        EnumC1874010yrn enumC1874010yrn4 = new EnumC1874010yrn("GAME_READY", 3, "minis.gameSceneShow");
        GAME_READY = enumC1874010yrn4;
        EnumC1874010yrn enumC1874010yrn5 = new EnumC1874010yrn("PERF_MONITOR", 4, "minis.perfMonitor");
        PERF_MONITOR = enumC1874010yrn5;
        EnumC1874010yrn enumC1874010yrn6 = new EnumC1874010yrn("DEBUG_META_UPDATE", 5, "debugMetaUpdate");
        DEBUG_META_UPDATE = enumC1874010yrn6;
        EnumC1874010yrn[] enumC1874010yrnArr = {enumC1874010yrn, enumC1874010yrn2, enumC1874010yrn3, enumC1874010yrn4, enumC1874010yrn5, enumC1874010yrn6};
        LLILLJJLI = enumC1874010yrnArr;
        LLILLL = new C2254308sP(enumC1874010yrnArr);
        Companion = new Object() { // from class: X.0yqi
        };
    }

    public static EnumC1874010yrn[] values() {
        return (EnumC1874010yrn[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1874010yrn valueOf(String str) {
        return (EnumC1874010yrn) C08FF.LIZ(EnumC1874010yrn.class, str);
    }

    public EnumC1874010yrn(String str, int i, String str2) {
        this.LL = str2;
    }
}
