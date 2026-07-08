package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12Dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19720912Dv {
    public static final EnumC19720912Dv CLICK;
    public static final EnumC19720912Dv CLOSE;
    public static final EnumC19720912Dv IMAGE_SHOW;
    public static final /* synthetic */ EnumC19720912Dv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19720912Dv SHOW;

    public static InterfaceC2044707zh<EnumC19720912Dv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19720912Dv enumC19720912Dv = new EnumC19720912Dv("SHOW", 0);
        SHOW = enumC19720912Dv;
        EnumC19720912Dv enumC19720912Dv2 = new EnumC19720912Dv("CLICK", 1);
        CLICK = enumC19720912Dv2;
        EnumC19720912Dv enumC19720912Dv3 = new EnumC19720912Dv("CLOSE", 2);
        CLOSE = enumC19720912Dv3;
        EnumC19720912Dv enumC19720912Dv4 = new EnumC19720912Dv("IMAGE_SHOW", 3);
        IMAGE_SHOW = enumC19720912Dv4;
        EnumC19720912Dv[] enumC19720912DvArr = {enumC19720912Dv, enumC19720912Dv2, enumC19720912Dv3, enumC19720912Dv4};
        LL = enumC19720912DvArr;
        LLILLJJLI = new C2254308sP(enumC19720912DvArr);
    }

    public static EnumC19720912Dv[] values() {
        return (EnumC19720912Dv[]) LL.clone();
    }

    public static EnumC19720912Dv valueOf(String str) {
        return (EnumC19720912Dv) C08FF.LIZ(EnumC19720912Dv.class, str);
    }

    public EnumC19720912Dv(String str, int i) {
    }
}
