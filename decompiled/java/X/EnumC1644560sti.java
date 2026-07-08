package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1644560sti {
    public static final EnumC1644560sti APPLY_TO_ALL_CLICK;
    public static final EnumC1644560sti CLEAR_MODE_CLICK;
    public static final EnumC1644560sti FILTER_BOX_ENTRANCE_CLICK;
    public static final EnumC1644560sti FILTER_CLICK;
    public static final /* synthetic */ EnumC1644560sti[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1644560sti OUTSIDE_TOUCH;
    public static final EnumC1644560sti TAB_CLICK;
    public static final EnumC1644560sti TAB_LONG_PRESS;

    public static InterfaceC2044707zh<EnumC1644560sti> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1644560sti enumC1644560sti = new EnumC1644560sti("FILTER_BOX_ENTRANCE_CLICK", 0);
        FILTER_BOX_ENTRANCE_CLICK = enumC1644560sti;
        EnumC1644560sti enumC1644560sti2 = new EnumC1644560sti("CLEAR_MODE_CLICK", 1);
        CLEAR_MODE_CLICK = enumC1644560sti2;
        EnumC1644560sti enumC1644560sti3 = new EnumC1644560sti("OUTSIDE_TOUCH", 2);
        OUTSIDE_TOUCH = enumC1644560sti3;
        EnumC1644560sti enumC1644560sti4 = new EnumC1644560sti("TAB_CLICK", 3);
        TAB_CLICK = enumC1644560sti4;
        EnumC1644560sti enumC1644560sti5 = new EnumC1644560sti("TAB_LONG_PRESS", 4);
        TAB_LONG_PRESS = enumC1644560sti5;
        EnumC1644560sti enumC1644560sti6 = new EnumC1644560sti("FILTER_CLICK", 5);
        FILTER_CLICK = enumC1644560sti6;
        EnumC1644560sti enumC1644560sti7 = new EnumC1644560sti("APPLY_TO_ALL_CLICK", 6);
        APPLY_TO_ALL_CLICK = enumC1644560sti7;
        EnumC1644560sti[] enumC1644560stiArr = {enumC1644560sti, enumC1644560sti2, enumC1644560sti3, enumC1644560sti4, enumC1644560sti5, enumC1644560sti6, enumC1644560sti7};
        LL = enumC1644560stiArr;
        LLILLJJLI = new C2254308sP(enumC1644560stiArr);
    }

    public static EnumC1644560sti[] values() {
        return (EnumC1644560sti[]) LL.clone();
    }

    public static EnumC1644560sti valueOf(String str) {
        return (EnumC1644560sti) C08FF.LIZ(EnumC1644560sti.class, str);
    }

    public EnumC1644560sti(String str, int i) {
    }
}
