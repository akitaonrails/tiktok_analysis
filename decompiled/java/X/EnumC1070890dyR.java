package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1070890dyR {
    public static final /* synthetic */ EnumC1070890dyR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1070890dyR NECESSARY;
    public static final EnumC1070890dyR NORMAL;

    public static InterfaceC2044707zh<EnumC1070890dyR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1070890dyR enumC1070890dyR = new EnumC1070890dyR("NORMAL", 0);
        NORMAL = enumC1070890dyR;
        EnumC1070890dyR enumC1070890dyR2 = new EnumC1070890dyR("NECESSARY", 1);
        NECESSARY = enumC1070890dyR2;
        EnumC1070890dyR[] enumC1070890dyRArr = {enumC1070890dyR, enumC1070890dyR2};
        LL = enumC1070890dyRArr;
        LLILLJJLI = new C2254308sP(enumC1070890dyRArr);
    }

    public static EnumC1070890dyR[] values() {
        return (EnumC1070890dyR[]) LL.clone();
    }

    public static EnumC1070890dyR valueOf(String str) {
        return (EnumC1070890dyR) C08FF.LIZ(EnumC1070890dyR.class, str);
    }

    public EnumC1070890dyR(String str, int i) {
    }
}
