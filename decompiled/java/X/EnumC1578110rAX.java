package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1578110rAX {
    public static final EnumC1578110rAX CLICK;
    public static final /* synthetic */ EnumC1578110rAX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1578110rAX LONG_CLICK;
    public static final EnumC1578110rAX MULTI_FINDER;
    public static final EnumC1578110rAX SWIPE_DOWN;
    public static final EnumC1578110rAX SWIPE_LEFT;
    public static final EnumC1578110rAX SWIPE_RIGHT;
    public static final EnumC1578110rAX SWIPE_UP;

    public static InterfaceC2044707zh<EnumC1578110rAX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1578110rAX enumC1578110rAX = new EnumC1578110rAX("MULTI_FINDER", 0);
        MULTI_FINDER = enumC1578110rAX;
        EnumC1578110rAX enumC1578110rAX2 = new EnumC1578110rAX("SWIPE_LEFT", 1);
        SWIPE_LEFT = enumC1578110rAX2;
        EnumC1578110rAX enumC1578110rAX3 = new EnumC1578110rAX("SWIPE_RIGHT", 2);
        SWIPE_RIGHT = enumC1578110rAX3;
        EnumC1578110rAX enumC1578110rAX4 = new EnumC1578110rAX("SWIPE_UP", 3);
        SWIPE_UP = enumC1578110rAX4;
        EnumC1578110rAX enumC1578110rAX5 = new EnumC1578110rAX("SWIPE_DOWN", 4);
        SWIPE_DOWN = enumC1578110rAX5;
        EnumC1578110rAX enumC1578110rAX6 = new EnumC1578110rAX("CLICK", 5);
        CLICK = enumC1578110rAX6;
        EnumC1578110rAX enumC1578110rAX7 = new EnumC1578110rAX("LONG_CLICK", 6);
        LONG_CLICK = enumC1578110rAX7;
        EnumC1578110rAX[] enumC1578110rAXArr = {enumC1578110rAX, enumC1578110rAX2, enumC1578110rAX3, enumC1578110rAX4, enumC1578110rAX5, enumC1578110rAX6, enumC1578110rAX7};
        LL = enumC1578110rAXArr;
        LLILLJJLI = new C2254308sP(enumC1578110rAXArr);
    }

    public static EnumC1578110rAX[] values() {
        return (EnumC1578110rAX[]) LL.clone();
    }

    public static EnumC1578110rAX valueOf(String str) {
        return (EnumC1578110rAX) C08FF.LIZ(EnumC1578110rAX.class, str);
    }

    public EnumC1578110rAX(String str, int i) {
    }
}
