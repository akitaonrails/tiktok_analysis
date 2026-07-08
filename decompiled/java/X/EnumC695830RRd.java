package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC695830RRd {
    public static final EnumC695830RRd ANCHOR_KEY;
    public static final EnumC695830RRd BANNER_KEY;
    public static final EnumC695830RRd BUTTON_KEY;
    public static final /* synthetic */ EnumC695830RRd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC695830RRd TAG_KEY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC695830RRd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC695830RRd enumC695830RRd = new EnumC695830RRd("TAG_KEY", 0, "tag_key");
        TAG_KEY = enumC695830RRd;
        EnumC695830RRd enumC695830RRd2 = new EnumC695830RRd("BUTTON_KEY", 1, "button_key");
        BUTTON_KEY = enumC695830RRd2;
        EnumC695830RRd enumC695830RRd3 = new EnumC695830RRd("ANCHOR_KEY", 2, "anchor_key");
        ANCHOR_KEY = enumC695830RRd3;
        EnumC695830RRd enumC695830RRd4 = new EnumC695830RRd("BANNER_KEY", 3, "banner_key");
        BANNER_KEY = enumC695830RRd4;
        EnumC695830RRd[] enumC695830RRdArr = {enumC695830RRd, enumC695830RRd2, enumC695830RRd3, enumC695830RRd4};
        LLILLJJLI = enumC695830RRdArr;
        LLILLL = new C2254308sP(enumC695830RRdArr);
    }

    public static EnumC695830RRd[] values() {
        return (EnumC695830RRd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC695830RRd valueOf(String str) {
        return (EnumC695830RRd) C08FF.LIZ(EnumC695830RRd.class, str);
    }

    public EnumC695830RRd(String str, int i, String str2) {
        this.LL = str2;
    }
}
