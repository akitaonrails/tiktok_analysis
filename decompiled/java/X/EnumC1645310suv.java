package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0suv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1645310suv {
    public static final EnumC1645310suv LEFT;
    public static final /* synthetic */ EnumC1645310suv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1645310suv NONE;
    public static final EnumC1645310suv RIGHT;

    public static InterfaceC2044707zh<EnumC1645310suv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1645310suv enumC1645310suv = new EnumC1645310suv("NONE", 0);
        NONE = enumC1645310suv;
        EnumC1645310suv enumC1645310suv2 = new EnumC1645310suv("LEFT", 1);
        LEFT = enumC1645310suv2;
        EnumC1645310suv enumC1645310suv3 = new EnumC1645310suv("RIGHT", 2);
        RIGHT = enumC1645310suv3;
        EnumC1645310suv[] enumC1645310suvArr = {enumC1645310suv, enumC1645310suv2, enumC1645310suv3};
        LL = enumC1645310suvArr;
        LLILLJJLI = new C2254308sP(enumC1645310suvArr);
    }

    public static EnumC1645310suv[] values() {
        return (EnumC1645310suv[]) LL.clone();
    }

    public static EnumC1645310suv valueOf(String str) {
        return (EnumC1645310suv) C08FF.LIZ(EnumC1645310suv.class, str);
    }

    public EnumC1645310suv(String str, int i) {
    }
}
