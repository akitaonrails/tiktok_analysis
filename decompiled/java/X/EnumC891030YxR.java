package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC891030YxR {
    public static final EnumC891030YxR DISABLE;
    public static final EnumC891030YxR ENABLE;
    public static final /* synthetic */ EnumC891030YxR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC891030YxR UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC891030YxR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC891030YxR enumC891030YxR = new EnumC891030YxR("UNKNOWN", 0, 0);
        UNKNOWN = enumC891030YxR;
        EnumC891030YxR enumC891030YxR2 = new EnumC891030YxR("ENABLE", 1, 1);
        ENABLE = enumC891030YxR2;
        EnumC891030YxR enumC891030YxR3 = new EnumC891030YxR("DISABLE", 2, 2);
        DISABLE = enumC891030YxR3;
        EnumC891030YxR[] enumC891030YxRArr = {enumC891030YxR, enumC891030YxR2, enumC891030YxR3};
        LLILLJJLI = enumC891030YxRArr;
        LLILLL = new C2254308sP(enumC891030YxRArr);
    }

    public static EnumC891030YxR[] values() {
        return (EnumC891030YxR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC891030YxR valueOf(String str) {
        return (EnumC891030YxR) C08FF.LIZ(EnumC891030YxR.class, str);
    }

    public EnumC891030YxR(String str, int i, int i2) {
        this.LL = i2;
    }
}
