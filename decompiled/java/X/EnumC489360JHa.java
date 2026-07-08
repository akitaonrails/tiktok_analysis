package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC489360JHa {
    public static final EnumC489360JHa CHOOSE_FROM_ALBUM;
    public static final /* synthetic */ EnumC489360JHa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC489360JHa RE_EDIT_SCENE;
    public static final EnumC489360JHa UNKNOWN;

    public static InterfaceC2044707zh<EnumC489360JHa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC489360JHa enumC489360JHa = new EnumC489360JHa("CHOOSE_FROM_ALBUM", 0);
        CHOOSE_FROM_ALBUM = enumC489360JHa;
        EnumC489360JHa enumC489360JHa2 = new EnumC489360JHa("RE_EDIT_SCENE", 1);
        RE_EDIT_SCENE = enumC489360JHa2;
        EnumC489360JHa enumC489360JHa3 = new EnumC489360JHa("UNKNOWN", 2);
        UNKNOWN = enumC489360JHa3;
        EnumC489360JHa[] enumC489360JHaArr = {enumC489360JHa, enumC489360JHa2, enumC489360JHa3};
        LL = enumC489360JHaArr;
        LLILLJJLI = new C2254308sP(enumC489360JHaArr);
    }

    public static EnumC489360JHa[] values() {
        return (EnumC489360JHa[]) LL.clone();
    }

    public static EnumC489360JHa valueOf(String str) {
        return (EnumC489360JHa) C08FF.LIZ(EnumC489360JHa.class, str);
    }

    public EnumC489360JHa(String str, int i) {
    }
}
