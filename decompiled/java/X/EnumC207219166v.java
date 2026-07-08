package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.166v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC207219166v {
    public static final EnumC207219166v BITMAP;
    public static final /* synthetic */ EnumC207219166v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC207219166v PRE_EDIT;
    public static final EnumC207219166v URI;
    public static final EnumC207219166v URL;

    public static InterfaceC2044707zh<EnumC207219166v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC207219166v enumC207219166v = new EnumC207219166v("BITMAP", 0);
        BITMAP = enumC207219166v;
        EnumC207219166v enumC207219166v2 = new EnumC207219166v("URI", 1);
        URI = enumC207219166v2;
        EnumC207219166v enumC207219166v3 = new EnumC207219166v("URL", 2);
        URL = enumC207219166v3;
        EnumC207219166v enumC207219166v4 = new EnumC207219166v("PRE_EDIT", 3);
        PRE_EDIT = enumC207219166v4;
        EnumC207219166v[] enumC207219166vArr = {enumC207219166v, enumC207219166v2, enumC207219166v3, enumC207219166v4};
        LL = enumC207219166vArr;
        LLILLJJLI = new C2254308sP(enumC207219166vArr);
    }

    public static EnumC207219166v[] values() {
        return (EnumC207219166v[]) LL.clone();
    }

    public static EnumC207219166v valueOf(String str) {
        return (EnumC207219166v) C08FF.LIZ(EnumC207219166v.class, str);
    }

    public EnumC207219166v(String str, int i) {
    }
}
