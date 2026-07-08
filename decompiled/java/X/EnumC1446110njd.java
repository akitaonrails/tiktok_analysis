package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0njd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1446110njd {
    public static final EnumC1446110njd AUDIO;
    public static final /* synthetic */ EnumC1446110njd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1446110njd PHOTO;
    public static final EnumC1446110njd STICKER;
    public static final EnumC1446110njd VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1446110njd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1446110njd enumC1446110njd = new EnumC1446110njd("PHOTO", 0, "photo");
        PHOTO = enumC1446110njd;
        EnumC1446110njd enumC1446110njd2 = new EnumC1446110njd("VIDEO", 1, "video");
        VIDEO = enumC1446110njd2;
        EnumC1446110njd enumC1446110njd3 = new EnumC1446110njd("AUDIO", 2, "audio");
        AUDIO = enumC1446110njd3;
        EnumC1446110njd enumC1446110njd4 = new EnumC1446110njd("STICKER", 3, "sticker");
        STICKER = enumC1446110njd4;
        EnumC1446110njd[] enumC1446110njdArr = {enumC1446110njd, enumC1446110njd2, enumC1446110njd3, enumC1446110njd4};
        LLILLJJLI = enumC1446110njdArr;
        LLILLL = new C2254308sP(enumC1446110njdArr);
    }

    public static EnumC1446110njd[] values() {
        return (EnumC1446110njd[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1446110njd valueOf(String str) {
        return (EnumC1446110njd) C08FF.LIZ(EnumC1446110njd.class, str);
    }

    public EnumC1446110njd(String str, int i, String str2) {
        this.LL = str2;
    }
}
