package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mO9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1394350mO9 {
    public static final EnumC1394350mO9 INVISIBLE_FOR_AB;
    public static final EnumC1394350mO9 INVISIBLE_FOR_COMMERCE_ACCOUNT;
    public static final EnumC1394350mO9 INVISIBLE_FOR_FEATURE_BEATS_UNSUPPORTED;
    public static final EnumC1394350mO9 INVISIBLE_FOR_NOT_GOT_FEATURE_BITS;
    public static final EnumC1394350mO9 INVISIBLE_FOR_NO_FILTER_INFO;
    public static final EnumC1394350mO9 INVISIBLE_FOR_OTHER_REASON;
    public static final EnumC1394350mO9 INVISIBLE_FOR_TEMPLATE_ANCHOR_STATUS;
    public static final /* synthetic */ EnumC1394350mO9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1394350mO9 VISIBLE_FOR_STATUS_NORMAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1394350mO9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1394350mO9 enumC1394350mO9 = new EnumC1394350mO9("VISIBLE_FOR_STATUS_NORMAL", 0, "normal");
        VISIBLE_FOR_STATUS_NORMAL = enumC1394350mO9;
        EnumC1394350mO9 enumC1394350mO92 = new EnumC1394350mO9("INVISIBLE_FOR_FEATURE_BEATS_UNSUPPORTED", 1, "featurebits not supported");
        INVISIBLE_FOR_FEATURE_BEATS_UNSUPPORTED = enumC1394350mO92;
        EnumC1394350mO9 enumC1394350mO93 = new EnumC1394350mO9("INVISIBLE_FOR_TEMPLATE_ANCHOR_STATUS", 2, "invalid template");
        INVISIBLE_FOR_TEMPLATE_ANCHOR_STATUS = enumC1394350mO93;
        EnumC1394350mO9 enumC1394350mO94 = new EnumC1394350mO9("INVISIBLE_FOR_AB", 3, "filtered by experiment");
        INVISIBLE_FOR_AB = enumC1394350mO94;
        EnumC1394350mO9 enumC1394350mO95 = new EnumC1394350mO9("INVISIBLE_FOR_COMMERCE_ACCOUNT", 4, "commercial account");
        INVISIBLE_FOR_COMMERCE_ACCOUNT = enumC1394350mO95;
        EnumC1394350mO9 enumC1394350mO96 = new EnumC1394350mO9("INVISIBLE_FOR_NOT_GOT_FEATURE_BITS", 5, "undetermined featurebits");
        INVISIBLE_FOR_NOT_GOT_FEATURE_BITS = enumC1394350mO96;
        EnumC1394350mO9 enumC1394350mO97 = new EnumC1394350mO9("INVISIBLE_FOR_NO_FILTER_INFO", 6, "no filter info");
        INVISIBLE_FOR_NO_FILTER_INFO = enumC1394350mO97;
        EnumC1394350mO9 enumC1394350mO98 = new EnumC1394350mO9("INVISIBLE_FOR_OTHER_REASON", 7, "unknown");
        INVISIBLE_FOR_OTHER_REASON = enumC1394350mO98;
        EnumC1394350mO9[] enumC1394350mO9Arr = {enumC1394350mO9, enumC1394350mO92, enumC1394350mO93, enumC1394350mO94, enumC1394350mO95, enumC1394350mO96, enumC1394350mO97, enumC1394350mO98};
        LLILLJJLI = enumC1394350mO9Arr;
        LLILLL = new C2254308sP(enumC1394350mO9Arr);
    }

    public static EnumC1394350mO9[] values() {
        return (EnumC1394350mO9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1394350mO9 valueOf(String str) {
        return (EnumC1394350mO9) C08FF.LIZ(EnumC1394350mO9.class, str);
    }

    public EnumC1394350mO9(String str, int i, String str2) {
        this.LL = str2;
    }
}
