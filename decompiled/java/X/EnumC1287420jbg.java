package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1287420jbg {
    public static final EnumC1287420jbg HexagonGrid;
    public static final EnumC1287420jbg HexagonZoom;
    public static final /* synthetic */ EnumC1287420jbg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1287420jbg NoiseGradient;
    public static final EnumC1287420jbg SpinDiffuse;

    public static InterfaceC2044707zh<EnumC1287420jbg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1287420jbg enumC1287420jbg = new EnumC1287420jbg("SpinDiffuse", 0);
        SpinDiffuse = enumC1287420jbg;
        EnumC1287420jbg enumC1287420jbg2 = new EnumC1287420jbg("HexagonGrid", 1);
        HexagonGrid = enumC1287420jbg2;
        EnumC1287420jbg enumC1287420jbg3 = new EnumC1287420jbg("HexagonZoom", 2);
        HexagonZoom = enumC1287420jbg3;
        EnumC1287420jbg enumC1287420jbg4 = new EnumC1287420jbg("NoiseGradient", 3);
        NoiseGradient = enumC1287420jbg4;
        EnumC1287420jbg[] enumC1287420jbgArr = {enumC1287420jbg, enumC1287420jbg2, enumC1287420jbg3, enumC1287420jbg4};
        LL = enumC1287420jbgArr;
        LLILLJJLI = new C2254308sP(enumC1287420jbgArr);
    }

    public static EnumC1287420jbg[] values() {
        return (EnumC1287420jbg[]) LL.clone();
    }

    public static EnumC1287420jbg valueOf(String str) {
        return (EnumC1287420jbg) C08FF.LIZ(EnumC1287420jbg.class, str);
    }

    public EnumC1287420jbg(String str, int i) {
    }
}
