package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2005907tR {
    public static final EnumC2005907tR DISPLAY_TYPE_GRAY;
    public static final EnumC2005907tR DISPLAY_TYPE_RED;
    public static final EnumC2005907tR DISPLAY_TYPE_UNKNOWN;
    public static final /* synthetic */ EnumC2005907tR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2005907tR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2005907tR enumC2005907tR = new EnumC2005907tR("DISPLAY_TYPE_UNKNOWN", 0, 0);
        DISPLAY_TYPE_UNKNOWN = enumC2005907tR;
        EnumC2005907tR enumC2005907tR2 = new EnumC2005907tR("DISPLAY_TYPE_RED", 1, 1);
        DISPLAY_TYPE_RED = enumC2005907tR2;
        EnumC2005907tR enumC2005907tR3 = new EnumC2005907tR("DISPLAY_TYPE_GRAY", 2, 2);
        DISPLAY_TYPE_GRAY = enumC2005907tR3;
        EnumC2005907tR[] enumC2005907tRArr = {enumC2005907tR, enumC2005907tR2, enumC2005907tR3};
        LLILLJJLI = enumC2005907tRArr;
        LLILLL = new C2254308sP(enumC2005907tRArr);
    }

    public static EnumC2005907tR[] values() {
        return (EnumC2005907tR[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC2005907tR valueOf(String str) {
        return (EnumC2005907tR) C08FF.LIZ(EnumC2005907tR.class, str);
    }

    public EnumC2005907tR(String str, int i, int i2) {
        this.LL = i2;
    }
}
