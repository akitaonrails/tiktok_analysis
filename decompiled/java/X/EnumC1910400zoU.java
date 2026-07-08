package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1910400zoU {
    public static final EnumC1910400zoU INIT_FEED;
    public static final /* synthetic */ EnumC1910400zoU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1910400zoU MANUAL_LOAD_TO_VIEW_ATTACHED;
    public static final EnumC1910400zoU ON_CREATE;
    public static final EnumC1910400zoU ON_CREATE_VIEW;
    public static final EnumC1910400zoU ON_DESTROY;
    public static final EnumC1910400zoU ON_DESTROY_VIEW;
    public static final EnumC1910400zoU ON_PAUSE;
    public static final EnumC1910400zoU ON_RESUME;
    public static final EnumC1910400zoU ON_START;
    public static final EnumC1910400zoU ON_STOP;
    public static final EnumC1910400zoU ON_VIEW_CREATED;
    public static final EnumC1910400zoU TAB_TO_ON_CREATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1910400zoU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1910400zoU enumC1910400zoU = new EnumC1910400zoU("TAB_TO_ON_CREATE", 0, "tab_to_on_create");
        TAB_TO_ON_CREATE = enumC1910400zoU;
        EnumC1910400zoU enumC1910400zoU2 = new EnumC1910400zoU("ON_CREATE", 1, "on_create");
        ON_CREATE = enumC1910400zoU2;
        EnumC1910400zoU enumC1910400zoU3 = new EnumC1910400zoU("ON_CREATE_VIEW", 2, "on_create_view");
        ON_CREATE_VIEW = enumC1910400zoU3;
        EnumC1910400zoU enumC1910400zoU4 = new EnumC1910400zoU("INIT_FEED", 3, "init_feed");
        INIT_FEED = enumC1910400zoU4;
        EnumC1910400zoU enumC1910400zoU5 = new EnumC1910400zoU("ON_VIEW_CREATED", 4, "on_view_created");
        ON_VIEW_CREATED = enumC1910400zoU5;
        EnumC1910400zoU enumC1910400zoU6 = new EnumC1910400zoU("MANUAL_LOAD_TO_VIEW_ATTACHED", 5, "manual_load_to_view_attach");
        MANUAL_LOAD_TO_VIEW_ATTACHED = enumC1910400zoU6;
        EnumC1910400zoU enumC1910400zoU7 = new EnumC1910400zoU("ON_START", 6, "on_start");
        ON_START = enumC1910400zoU7;
        EnumC1910400zoU enumC1910400zoU8 = new EnumC1910400zoU("ON_RESUME", 7, "on_resume");
        ON_RESUME = enumC1910400zoU8;
        EnumC1910400zoU enumC1910400zoU9 = new EnumC1910400zoU("ON_PAUSE", 8, "on_pause");
        ON_PAUSE = enumC1910400zoU9;
        EnumC1910400zoU enumC1910400zoU10 = new EnumC1910400zoU("ON_STOP", 9, "on_stop");
        ON_STOP = enumC1910400zoU10;
        EnumC1910400zoU enumC1910400zoU11 = new EnumC1910400zoU("ON_DESTROY_VIEW", 10, "on_destroy_view");
        ON_DESTROY_VIEW = enumC1910400zoU11;
        EnumC1910400zoU enumC1910400zoU12 = new EnumC1910400zoU("ON_DESTROY", 11, "on_destroy");
        ON_DESTROY = enumC1910400zoU12;
        EnumC1910400zoU[] enumC1910400zoUArr = {enumC1910400zoU, enumC1910400zoU2, enumC1910400zoU3, enumC1910400zoU4, enumC1910400zoU5, enumC1910400zoU6, enumC1910400zoU7, enumC1910400zoU8, enumC1910400zoU9, enumC1910400zoU10, enumC1910400zoU11, enumC1910400zoU12};
        LLILLJJLI = enumC1910400zoUArr;
        LLILLL = new C2254308sP(enumC1910400zoUArr);
    }

    public static EnumC1910400zoU[] values() {
        return (EnumC1910400zoU[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1910400zoU valueOf(String str) {
        return (EnumC1910400zoU) C08FF.LIZ(EnumC1910400zoU.class, str);
    }

    public EnumC1910400zoU(String str, int i, String str2) {
        this.LL = str2;
    }
}
