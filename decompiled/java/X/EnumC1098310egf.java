package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0egf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1098310egf {
    public static final EnumC1098310egf AUTO_SCROLL;
    public static final EnumC1098310egf DRAG;
    public static final /* synthetic */ EnumC1098310egf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1098310egf PANEL_ITEM_SCROLL;

    public static InterfaceC2044707zh<EnumC1098310egf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1098310egf enumC1098310egf = new EnumC1098310egf("AUTO_SCROLL", 0);
        AUTO_SCROLL = enumC1098310egf;
        EnumC1098310egf enumC1098310egf2 = new EnumC1098310egf("DRAG", 1);
        DRAG = enumC1098310egf2;
        EnumC1098310egf enumC1098310egf3 = new EnumC1098310egf("PANEL_ITEM_SCROLL", 2);
        PANEL_ITEM_SCROLL = enumC1098310egf3;
        EnumC1098310egf[] enumC1098310egfArr = {enumC1098310egf, enumC1098310egf2, enumC1098310egf3};
        LL = enumC1098310egfArr;
        LLILLJJLI = new C2254308sP(enumC1098310egfArr);
    }

    public static EnumC1098310egf[] values() {
        return (EnumC1098310egf[]) LL.clone();
    }

    public static EnumC1098310egf valueOf(String str) {
        return (EnumC1098310egf) C08FF.LIZ(EnumC1098310egf.class, str);
    }

    public EnumC1098310egf(String str, int i) {
    }
}
