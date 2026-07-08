package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0m2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1381120m2o {
    public static final EnumC1381120m2o FULL_SCREEN;
    public static final /* synthetic */ EnumC1381120m2o[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1381120m2o POPUP;

    public static InterfaceC2044707zh<EnumC1381120m2o> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1381120m2o enumC1381120m2o = new EnumC1381120m2o("POPUP", 0);
        POPUP = enumC1381120m2o;
        EnumC1381120m2o enumC1381120m2o2 = new EnumC1381120m2o("FULL_SCREEN", 1);
        FULL_SCREEN = enumC1381120m2o2;
        EnumC1381120m2o[] enumC1381120m2oArr = {enumC1381120m2o, enumC1381120m2o2};
        LL = enumC1381120m2oArr;
        LLILLJJLI = new C2254308sP(enumC1381120m2oArr);
    }

    public static EnumC1381120m2o[] values() {
        return (EnumC1381120m2o[]) LL.clone();
    }

    public static EnumC1381120m2o valueOf(String str) {
        return (EnumC1381120m2o) C08FF.LIZ(EnumC1381120m2o.class, str);
    }

    public EnumC1381120m2o(String str, int i) {
    }
}
