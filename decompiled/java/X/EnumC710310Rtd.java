package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rtd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC710310Rtd {
    public static final EnumC710310Rtd CLICK;
    public static final /* synthetic */ EnumC710310Rtd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC710310Rtd SLIDE;
    public static final EnumC710310Rtd UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC710310Rtd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC710310Rtd enumC710310Rtd = new EnumC710310Rtd("CLICK", 0, "click");
        CLICK = enumC710310Rtd;
        EnumC710310Rtd enumC710310Rtd2 = new EnumC710310Rtd("SLIDE", 1, "slide");
        SLIDE = enumC710310Rtd2;
        EnumC710310Rtd enumC710310Rtd3 = new EnumC710310Rtd("UNKNOWN", 2, "unknown");
        UNKNOWN = enumC710310Rtd3;
        EnumC710310Rtd[] enumC710310RtdArr = {enumC710310Rtd, enumC710310Rtd2, enumC710310Rtd3};
        LLILLJJLI = enumC710310RtdArr;
        LLILLL = new C2254308sP(enumC710310RtdArr);
    }

    public static EnumC710310Rtd[] values() {
        return (EnumC710310Rtd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC710310Rtd valueOf(String str) {
        return (EnumC710310Rtd) C08FF.LIZ(EnumC710310Rtd.class, str);
    }

    public EnumC710310Rtd(String str, int i, String str2) {
        this.LL = str2;
    }
}
