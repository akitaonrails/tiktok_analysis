package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x9I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1807980x9I {
    public static final EnumC1807980x9I ICON_SCALE_IN;
    public static final EnumC1807980x9I ICON_SHIMMER;
    public static final /* synthetic */ EnumC1807980x9I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1807980x9I TEXT_SCALE_OUT;
    public static final EnumC1807980x9I TEXT_SHIMMER;

    public static InterfaceC2044707zh<EnumC1807980x9I> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1807980x9I enumC1807980x9I = new EnumC1807980x9I("TEXT_SCALE_OUT", 0);
        TEXT_SCALE_OUT = enumC1807980x9I;
        EnumC1807980x9I enumC1807980x9I2 = new EnumC1807980x9I("ICON_SCALE_IN", 1);
        ICON_SCALE_IN = enumC1807980x9I2;
        EnumC1807980x9I enumC1807980x9I3 = new EnumC1807980x9I("TEXT_SHIMMER", 2);
        TEXT_SHIMMER = enumC1807980x9I3;
        EnumC1807980x9I enumC1807980x9I4 = new EnumC1807980x9I("ICON_SHIMMER", 3);
        ICON_SHIMMER = enumC1807980x9I4;
        EnumC1807980x9I[] enumC1807980x9IArr = {enumC1807980x9I, enumC1807980x9I2, enumC1807980x9I3, enumC1807980x9I4};
        LL = enumC1807980x9IArr;
        LLILLJJLI = new C2254308sP(enumC1807980x9IArr);
    }

    public static EnumC1807980x9I[] values() {
        return (EnumC1807980x9I[]) LL.clone();
    }

    public static EnumC1807980x9I valueOf(String str) {
        return (EnumC1807980x9I) C08FF.LIZ(EnumC1807980x9I.class, str);
    }

    public EnumC1807980x9I(String str, int i) {
    }
}
