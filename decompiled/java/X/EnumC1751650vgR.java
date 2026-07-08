package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1751650vgR {
    public static final EnumC1751650vgR LIVEROOM;
    public static final /* synthetic */ EnumC1751650vgR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1751650vgR PREVIOUS;
    public static final EnumC1751650vgR SHOPPAGE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1751650vgR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1751650vgR enumC1751650vgR = new EnumC1751650vgR("PREVIOUS", 0, 0);
        PREVIOUS = enumC1751650vgR;
        EnumC1751650vgR enumC1751650vgR2 = new EnumC1751650vgR("LIVEROOM", 1, 1);
        LIVEROOM = enumC1751650vgR2;
        EnumC1751650vgR enumC1751650vgR3 = new EnumC1751650vgR("SHOPPAGE", 2, 2);
        SHOPPAGE = enumC1751650vgR3;
        EnumC1751650vgR[] enumC1751650vgRArr = {enumC1751650vgR, enumC1751650vgR2, enumC1751650vgR3};
        LLILLJJLI = enumC1751650vgRArr;
        LLILLL = new C2254308sP(enumC1751650vgRArr);
    }

    public static EnumC1751650vgR[] values() {
        return (EnumC1751650vgR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1751650vgR valueOf(String str) {
        return (EnumC1751650vgR) C08FF.LIZ(EnumC1751650vgR.class, str);
    }

    public EnumC1751650vgR(String str, int i, int i2) {
        this.LL = i2;
    }
}
