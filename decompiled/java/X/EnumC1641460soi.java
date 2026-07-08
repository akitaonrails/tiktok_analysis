package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641460soi {
    public static final EnumC1641460soi BIND_DATA;
    public static final EnumC1641460soi CATEGORY_CLICK;
    public static final EnumC1641460soi DATA_VISIBLE;
    public static final /* synthetic */ EnumC1641460soi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641460soi STICKER_CLICK;
    public static final EnumC1641460soi STICKER_LOAD;

    public static InterfaceC2044707zh<EnumC1641460soi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641460soi enumC1641460soi = new EnumC1641460soi("DATA_VISIBLE", 0);
        DATA_VISIBLE = enumC1641460soi;
        EnumC1641460soi enumC1641460soi2 = new EnumC1641460soi("CATEGORY_CLICK", 1);
        CATEGORY_CLICK = enumC1641460soi2;
        EnumC1641460soi enumC1641460soi3 = new EnumC1641460soi("STICKER_CLICK", 2);
        STICKER_CLICK = enumC1641460soi3;
        EnumC1641460soi enumC1641460soi4 = new EnumC1641460soi("BIND_DATA", 3);
        BIND_DATA = enumC1641460soi4;
        EnumC1641460soi enumC1641460soi5 = new EnumC1641460soi("STICKER_LOAD", 4);
        STICKER_LOAD = enumC1641460soi5;
        EnumC1641460soi[] enumC1641460soiArr = {enumC1641460soi, enumC1641460soi2, enumC1641460soi3, enumC1641460soi4, enumC1641460soi5};
        LL = enumC1641460soiArr;
        LLILLJJLI = new C2254308sP(enumC1641460soiArr);
    }

    public static EnumC1641460soi[] values() {
        return (EnumC1641460soi[]) LL.clone();
    }

    public static EnumC1641460soi valueOf(String str) {
        return (EnumC1641460soi) C08FF.LIZ(EnumC1641460soi.class, str);
    }

    public EnumC1641460soi(String str, int i) {
    }
}
