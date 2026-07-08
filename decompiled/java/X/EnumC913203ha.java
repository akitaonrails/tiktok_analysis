package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC913203ha {
    public static final /* synthetic */ EnumC913203ha[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC913203ha MERCHANT_ORDER_ID;
    public static final EnumC913203ha PAY_INSTRUMENT_ID;
    public final int LL;

    public static InterfaceC2044707zh<EnumC913203ha> getEntries() {
        return LLILLL;
    }

    static {
        EnumC913203ha enumC913203ha = new EnumC913203ha("MERCHANT_ORDER_ID", 0, 2);
        MERCHANT_ORDER_ID = enumC913203ha;
        EnumC913203ha enumC913203ha2 = new EnumC913203ha("PAY_INSTRUMENT_ID", 1, 3);
        PAY_INSTRUMENT_ID = enumC913203ha2;
        EnumC913203ha[] enumC913203haArr = {enumC913203ha, enumC913203ha2};
        LLILLJJLI = enumC913203haArr;
        LLILLL = new C2254308sP(enumC913203haArr);
    }

    public static EnumC913203ha[] values() {
        return (EnumC913203ha[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC913203ha valueOf(String str) {
        return (EnumC913203ha) C08FF.LIZ(EnumC913203ha.class, str);
    }

    public EnumC913203ha(String str, int i, int i2) {
        this.LL = i2;
    }
}
