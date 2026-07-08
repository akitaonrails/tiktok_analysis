package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1355810lNz {
    public static final EnumC1355810lNz DOUBLE_TAP_ZOOM;
    public static final EnumC1355810lNz DRAG;
    public static final /* synthetic */ EnumC1355810lNz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1355810lNz NONE;
    public static final EnumC1355810lNz PINCH;
    public static final EnumC1355810lNz REACH_END;

    public static InterfaceC2044707zh<EnumC1355810lNz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1355810lNz enumC1355810lNz = new EnumC1355810lNz("NONE", 0);
        NONE = enumC1355810lNz;
        EnumC1355810lNz enumC1355810lNz2 = new EnumC1355810lNz("DRAG", 1);
        DRAG = enumC1355810lNz2;
        EnumC1355810lNz enumC1355810lNz3 = new EnumC1355810lNz("PINCH", 2);
        PINCH = enumC1355810lNz3;
        EnumC1355810lNz enumC1355810lNz4 = new EnumC1355810lNz("REACH_END", 3);
        REACH_END = enumC1355810lNz4;
        EnumC1355810lNz enumC1355810lNz5 = new EnumC1355810lNz("DOUBLE_TAP_ZOOM", 4);
        DOUBLE_TAP_ZOOM = enumC1355810lNz5;
        EnumC1355810lNz[] enumC1355810lNzArr = {enumC1355810lNz, enumC1355810lNz2, enumC1355810lNz3, enumC1355810lNz4, enumC1355810lNz5};
        LL = enumC1355810lNzArr;
        LLILLJJLI = new C2254308sP(enumC1355810lNzArr);
    }

    public static EnumC1355810lNz[] values() {
        return (EnumC1355810lNz[]) LL.clone();
    }

    public static EnumC1355810lNz valueOf(String str) {
        return (EnumC1355810lNz) C08FF.LIZ(EnumC1355810lNz.class, str);
    }

    public EnumC1355810lNz(String str, int i) {
    }
}
