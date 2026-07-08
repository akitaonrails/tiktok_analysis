package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1008600cLy implements InterfaceC593520NPq<String> {
    public static final EnumC1008600cLy CHECK_GECKO_START;
    public static final EnumC1008600cLy CHECK_GECKO_SUCCESS;
    public static final EnumC1008600cLy CONTAINER_ON_TOP;
    public static final /* synthetic */ EnumC1008600cLy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1008600cLy LOAD_FAIL;
    public static final EnumC1008600cLy LOAD_START;
    public static final EnumC1008600cLy LOAD_SUCCESS;
    public static final EnumC1008600cLy LYNX_FINISH;
    public static final EnumC1008600cLy LYNX_READY;
    public static final EnumC1008600cLy OPEN_LANDINGPAGE;
    public static final EnumC1008600cLy SELECT;
    public static final EnumC1008600cLy SHAKE;
    public static final EnumC1008600cLy SHOW;
    public static final EnumC1008600cLy START_PLAY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1008600cLy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1008600cLy enumC1008600cLy = new EnumC1008600cLy("SELECT", 0, "select");
        SELECT = enumC1008600cLy;
        EnumC1008600cLy enumC1008600cLy2 = new EnumC1008600cLy("CHECK_GECKO_START", 1, "check_gecko_start");
        CHECK_GECKO_START = enumC1008600cLy2;
        EnumC1008600cLy enumC1008600cLy3 = new EnumC1008600cLy("CHECK_GECKO_SUCCESS", 2, "check_gecko_success");
        CHECK_GECKO_SUCCESS = enumC1008600cLy3;
        EnumC1008600cLy enumC1008600cLy4 = new EnumC1008600cLy("LOAD_START", 3, "load_start");
        LOAD_START = enumC1008600cLy4;
        EnumC1008600cLy enumC1008600cLy5 = new EnumC1008600cLy("LOAD_FAIL", 4, "load_fail");
        LOAD_FAIL = enumC1008600cLy5;
        EnumC1008600cLy enumC1008600cLy6 = new EnumC1008600cLy("LOAD_SUCCESS", 5, "load_success");
        LOAD_SUCCESS = enumC1008600cLy6;
        EnumC1008600cLy enumC1008600cLy7 = new EnumC1008600cLy("SHOW", 6, "show");
        SHOW = enumC1008600cLy7;
        EnumC1008600cLy enumC1008600cLy8 = new EnumC1008600cLy("SHAKE", 7, "shake");
        SHAKE = enumC1008600cLy8;
        EnumC1008600cLy enumC1008600cLy9 = new EnumC1008600cLy("LYNX_READY", 8, "lynx_ready");
        LYNX_READY = enumC1008600cLy9;
        EnumC1008600cLy enumC1008600cLy10 = new EnumC1008600cLy("START_PLAY", 9, "start_play");
        START_PLAY = enumC1008600cLy10;
        EnumC1008600cLy enumC1008600cLy11 = new EnumC1008600cLy("LYNX_FINISH", 10, "lynx_finish");
        LYNX_FINISH = enumC1008600cLy11;
        EnumC1008600cLy enumC1008600cLy12 = new EnumC1008600cLy("OPEN_LANDINGPAGE", 11, "open_landingpage");
        OPEN_LANDINGPAGE = enumC1008600cLy12;
        EnumC1008600cLy enumC1008600cLy13 = new EnumC1008600cLy("CONTAINER_ON_TOP", 12, "container_on_top");
        CONTAINER_ON_TOP = enumC1008600cLy13;
        EnumC1008600cLy[] enumC1008600cLyArr = {enumC1008600cLy, enumC1008600cLy2, enumC1008600cLy3, enumC1008600cLy4, enumC1008600cLy5, enumC1008600cLy6, enumC1008600cLy7, enumC1008600cLy8, enumC1008600cLy9, enumC1008600cLy10, enumC1008600cLy11, enumC1008600cLy12, enumC1008600cLy13};
        LLILLJJLI = enumC1008600cLyArr;
        LLILLL = new C2254308sP(enumC1008600cLyArr);
    }

    public static EnumC1008600cLy[] values() {
        return (EnumC1008600cLy[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1008600cLy valueOf(String str) {
        return (EnumC1008600cLy) C08FF.LIZ(EnumC1008600cLy.class, str);
    }

    public EnumC1008600cLy(String str, int i, String str2) {
        this.LL = str2;
    }
}
