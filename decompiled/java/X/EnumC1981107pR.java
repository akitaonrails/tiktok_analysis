package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1981107pR {
    public static final /* synthetic */ EnumC1981107pR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1981107pR OLD;
    public static final EnumC1981107pR V1;
    public static final EnumC1981107pR V2;
    public static final EnumC1981107pR V3;
    public static final EnumC1981107pR V4;
    public static final EnumC1981107pR V5;

    public static InterfaceC2044707zh<EnumC1981107pR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1981107pR enumC1981107pR = new EnumC1981107pR("OLD", 0);
        OLD = enumC1981107pR;
        EnumC1981107pR enumC1981107pR2 = new EnumC1981107pR("V1", 1);
        V1 = enumC1981107pR2;
        EnumC1981107pR enumC1981107pR3 = new EnumC1981107pR("V2", 2);
        V2 = enumC1981107pR3;
        EnumC1981107pR enumC1981107pR4 = new EnumC1981107pR("V3", 3);
        V3 = enumC1981107pR4;
        EnumC1981107pR enumC1981107pR5 = new EnumC1981107pR("V4", 4);
        V4 = enumC1981107pR5;
        EnumC1981107pR enumC1981107pR6 = new EnumC1981107pR("V5", 5);
        V5 = enumC1981107pR6;
        EnumC1981107pR[] enumC1981107pRArr = {enumC1981107pR, enumC1981107pR2, enumC1981107pR3, enumC1981107pR4, enumC1981107pR5, enumC1981107pR6};
        LL = enumC1981107pRArr;
        LLILLJJLI = new C2254308sP(enumC1981107pRArr);
    }

    public static EnumC1981107pR[] values() {
        return (EnumC1981107pR[]) LL.clone();
    }

    public static EnumC1981107pR valueOf(String str) {
        return (EnumC1981107pR) C08FF.LIZ(EnumC1981107pR.class, str);
    }

    public EnumC1981107pR(String str, int i) {
    }
}
