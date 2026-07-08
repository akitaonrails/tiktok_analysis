package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sDY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1618420sDY {
    public static final EnumC1618420sDY GLOBAL;
    public static final /* synthetic */ EnumC1618420sDY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1618420sDY RECYCLER_VIEW;
    public static final EnumC1618420sDY VERTICAL_VIEWPAGER;
    public static final EnumC1618420sDY VIEW_PAGER;

    public static InterfaceC2044707zh<EnumC1618420sDY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1618420sDY enumC1618420sDY = new EnumC1618420sDY("GLOBAL", 0);
        GLOBAL = enumC1618420sDY;
        EnumC1618420sDY enumC1618420sDY2 = new EnumC1618420sDY("RECYCLER_VIEW", 1);
        RECYCLER_VIEW = enumC1618420sDY2;
        EnumC1618420sDY enumC1618420sDY3 = new EnumC1618420sDY("VIEW_PAGER", 2);
        VIEW_PAGER = enumC1618420sDY3;
        EnumC1618420sDY enumC1618420sDY4 = new EnumC1618420sDY("VERTICAL_VIEWPAGER", 3);
        VERTICAL_VIEWPAGER = enumC1618420sDY4;
        EnumC1618420sDY[] enumC1618420sDYArr = {enumC1618420sDY, enumC1618420sDY2, enumC1618420sDY3, enumC1618420sDY4};
        LL = enumC1618420sDYArr;
        LLILLJJLI = new C2254308sP(enumC1618420sDYArr);
    }

    public static EnumC1618420sDY[] values() {
        return (EnumC1618420sDY[]) LL.clone();
    }

    public static EnumC1618420sDY valueOf(String str) {
        return (EnumC1618420sDY) C08FF.LIZ(EnumC1618420sDY.class, str);
    }

    public EnumC1618420sDY(String str, int i) {
    }
}
