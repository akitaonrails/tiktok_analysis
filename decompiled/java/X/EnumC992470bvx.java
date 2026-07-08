package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992470bvx {
    public static final EnumC992470bvx ATTR_STYLE;
    public static final /* synthetic */ EnumC992470bvx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992470bvx RAW_STYLE;
    public static final EnumC992470bvx RES_STYLE;

    public static InterfaceC2044707zh<EnumC992470bvx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992470bvx enumC992470bvx = new EnumC992470bvx("ATTR_STYLE", 0);
        ATTR_STYLE = enumC992470bvx;
        EnumC992470bvx enumC992470bvx2 = new EnumC992470bvx("RES_STYLE", 1);
        RES_STYLE = enumC992470bvx2;
        EnumC992470bvx enumC992470bvx3 = new EnumC992470bvx("RAW_STYLE", 2);
        RAW_STYLE = enumC992470bvx3;
        EnumC992470bvx[] enumC992470bvxArr = {enumC992470bvx, enumC992470bvx2, enumC992470bvx3};
        LL = enumC992470bvxArr;
        LLILLJJLI = new C2254308sP(enumC992470bvxArr);
    }

    public static EnumC992470bvx[] values() {
        return (EnumC992470bvx[]) LL.clone();
    }

    public static EnumC992470bvx valueOf(String str) {
        return (EnumC992470bvx) C08FF.LIZ(EnumC992470bvx.class, str);
    }

    public EnumC992470bvx(String str, int i) {
    }
}
