package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1394360mOA {
    public static final EnumC1394360mOA INVISIBLE_FOR_AB;
    public static final EnumC1394360mOA INVISIBLE_FOR_COMMERCE_ACCOUNT;
    public static final EnumC1394360mOA INVISIBLE_FOR_FEATURE_BEATS_UNSUPPORTED;
    public static final EnumC1394360mOA INVISIBLE_FOR_NOT_GOT_FEATURE_BITS;
    public static final EnumC1394360mOA INVISIBLE_FOR_NO_FILTER_INFO;
    public static final EnumC1394360mOA INVISIBLE_FOR_OTHER_REASON;
    public static final EnumC1394360mOA INVISIBLE_FOR_TEMPLATE_ANCHOR_STATUS;
    public static final /* synthetic */ EnumC1394360mOA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1394360mOA VISIBLE_FOR_STATUS_NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1394360mOA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1394360mOA enumC1394360mOA = new EnumC1394360mOA("VISIBLE_FOR_STATUS_NORMAL", 0, 0);
        VISIBLE_FOR_STATUS_NORMAL = enumC1394360mOA;
        EnumC1394360mOA enumC1394360mOA2 = new EnumC1394360mOA("INVISIBLE_FOR_FEATURE_BEATS_UNSUPPORTED", 1, 1);
        INVISIBLE_FOR_FEATURE_BEATS_UNSUPPORTED = enumC1394360mOA2;
        EnumC1394360mOA enumC1394360mOA3 = new EnumC1394360mOA("INVISIBLE_FOR_TEMPLATE_ANCHOR_STATUS", 2, 2);
        INVISIBLE_FOR_TEMPLATE_ANCHOR_STATUS = enumC1394360mOA3;
        EnumC1394360mOA enumC1394360mOA4 = new EnumC1394360mOA("INVISIBLE_FOR_AB", 3, 3);
        INVISIBLE_FOR_AB = enumC1394360mOA4;
        EnumC1394360mOA enumC1394360mOA5 = new EnumC1394360mOA("INVISIBLE_FOR_COMMERCE_ACCOUNT", 4, 4);
        INVISIBLE_FOR_COMMERCE_ACCOUNT = enumC1394360mOA5;
        EnumC1394360mOA enumC1394360mOA6 = new EnumC1394360mOA("INVISIBLE_FOR_NOT_GOT_FEATURE_BITS", 5, 5);
        INVISIBLE_FOR_NOT_GOT_FEATURE_BITS = enumC1394360mOA6;
        EnumC1394360mOA enumC1394360mOA7 = new EnumC1394360mOA("INVISIBLE_FOR_NO_FILTER_INFO", 6, 6);
        INVISIBLE_FOR_NO_FILTER_INFO = enumC1394360mOA7;
        EnumC1394360mOA enumC1394360mOA8 = new EnumC1394360mOA("INVISIBLE_FOR_OTHER_REASON", 7, -1);
        INVISIBLE_FOR_OTHER_REASON = enumC1394360mOA8;
        EnumC1394360mOA[] enumC1394360mOAArr = {enumC1394360mOA, enumC1394360mOA2, enumC1394360mOA3, enumC1394360mOA4, enumC1394360mOA5, enumC1394360mOA6, enumC1394360mOA7, enumC1394360mOA8};
        LLILLJJLI = enumC1394360mOAArr;
        LLILLL = new C2254308sP(enumC1394360mOAArr);
    }

    public static EnumC1394360mOA[] values() {
        return (EnumC1394360mOA[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1394360mOA valueOf(String str) {
        return (EnumC1394360mOA) C08FF.LIZ(EnumC1394360mOA.class, str);
    }

    public EnumC1394360mOA(String str, int i, int i2) {
        this.LL = i2;
    }
}
