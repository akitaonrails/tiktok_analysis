package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Ayl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2197051Ayl {
    public static final EnumC2197051Ayl EXIT;
    public static final EnumC2197051Ayl HIDE;
    public static final EnumC2197051Ayl INITIALIZED;
    public static final /* synthetic */ EnumC2197051Ayl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2197051Ayl LOAD_START;
    public static final EnumC2197051Ayl MAIN_PAGE_LOADED;
    public static final EnumC2197051Ayl RELAUNCH_START;
    public static final EnumC2197051Ayl RETRY;
    public static final EnumC2197051Ayl SHOW;

    public static InterfaceC2044707zh<EnumC2197051Ayl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2197051Ayl enumC2197051Ayl = new EnumC2197051Ayl("MAIN_PAGE_LOADED", 0);
        MAIN_PAGE_LOADED = enumC2197051Ayl;
        EnumC2197051Ayl enumC2197051Ayl2 = new EnumC2197051Ayl("SHOW", 1);
        SHOW = enumC2197051Ayl2;
        EnumC2197051Ayl enumC2197051Ayl3 = new EnumC2197051Ayl("HIDE", 2);
        HIDE = enumC2197051Ayl3;
        EnumC2197051Ayl enumC2197051Ayl4 = new EnumC2197051Ayl("EXIT", 3);
        EXIT = enumC2197051Ayl4;
        EnumC2197051Ayl enumC2197051Ayl5 = new EnumC2197051Ayl("INITIALIZED", 4);
        INITIALIZED = enumC2197051Ayl5;
        EnumC2197051Ayl enumC2197051Ayl6 = new EnumC2197051Ayl("RELAUNCH_START", 5);
        RELAUNCH_START = enumC2197051Ayl6;
        EnumC2197051Ayl enumC2197051Ayl7 = new EnumC2197051Ayl("RETRY", 6);
        RETRY = enumC2197051Ayl7;
        EnumC2197051Ayl enumC2197051Ayl8 = new EnumC2197051Ayl("LOAD_START", 7);
        LOAD_START = enumC2197051Ayl8;
        EnumC2197051Ayl[] enumC2197051AylArr = {enumC2197051Ayl, enumC2197051Ayl2, enumC2197051Ayl3, enumC2197051Ayl4, enumC2197051Ayl5, enumC2197051Ayl6, enumC2197051Ayl7, enumC2197051Ayl8};
        LL = enumC2197051AylArr;
        LLILLJJLI = new C2254308sP(enumC2197051AylArr);
    }

    public static EnumC2197051Ayl[] values() {
        return (EnumC2197051Ayl[]) LL.clone();
    }

    public static EnumC2197051Ayl valueOf(String str) {
        return (EnumC2197051Ayl) C08FF.LIZ(EnumC2197051Ayl.class, str);
    }

    public EnumC2197051Ayl(String str, int i) {
    }
}
