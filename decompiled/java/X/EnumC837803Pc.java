package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC837803Pc {
    public static final EnumC837803Pc ANCHOR_COMBINE_PAYMENT;
    public static final /* synthetic */ EnumC837803Pc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC837803Pc MEMBERSHIP;
    public static final EnumC837803Pc OCP;
    public static final EnumC837803Pc OCP_PANEL;
    public static final EnumC837803Pc OSP;
    public static final EnumC837803Pc SECOND_PAY;
    public static final EnumC837803Pc SNS;

    public static InterfaceC2044707zh<EnumC837803Pc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC837803Pc enumC837803Pc = new EnumC837803Pc("OSP", 0);
        OSP = enumC837803Pc;
        EnumC837803Pc enumC837803Pc2 = new EnumC837803Pc("SECOND_PAY", 1);
        SECOND_PAY = enumC837803Pc2;
        EnumC837803Pc enumC837803Pc3 = new EnumC837803Pc("OCP", 2);
        OCP = enumC837803Pc3;
        EnumC837803Pc enumC837803Pc4 = new EnumC837803Pc("SNS", 3);
        SNS = enumC837803Pc4;
        EnumC837803Pc enumC837803Pc5 = new EnumC837803Pc("ANCHOR_COMBINE_PAYMENT", 4);
        ANCHOR_COMBINE_PAYMENT = enumC837803Pc5;
        EnumC837803Pc enumC837803Pc6 = new EnumC837803Pc("OCP_PANEL", 5);
        OCP_PANEL = enumC837803Pc6;
        EnumC837803Pc enumC837803Pc7 = new EnumC837803Pc("MEMBERSHIP", 6);
        MEMBERSHIP = enumC837803Pc7;
        EnumC837803Pc[] enumC837803PcArr = {enumC837803Pc, enumC837803Pc2, enumC837803Pc3, enumC837803Pc4, enumC837803Pc5, enumC837803Pc6, enumC837803Pc7};
        LL = enumC837803PcArr;
        LLILLJJLI = new C2254308sP(enumC837803PcArr);
    }

    public static EnumC837803Pc[] values() {
        return (EnumC837803Pc[]) LL.clone();
    }

    public static EnumC837803Pc valueOf(String str) {
        return (EnumC837803Pc) C08FF.LIZ(EnumC837803Pc.class, str);
    }

    public EnumC837803Pc(String str, int i) {
    }
}
