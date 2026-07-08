package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC901750ZZd {
    public static final EnumC901750ZZd AVATAR;
    public static final EnumC901750ZZd FOLLOW_BTN;
    public static final /* synthetic */ EnumC901750ZZd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC901750ZZd MORE_VIDEO_BTN;
    public static final EnumC901750ZZd OTHERS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC901750ZZd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC901750ZZd enumC901750ZZd = new EnumC901750ZZd("FOLLOW_BTN", 0, "follow");
        FOLLOW_BTN = enumC901750ZZd;
        EnumC901750ZZd enumC901750ZZd2 = new EnumC901750ZZd("MORE_VIDEO_BTN", 1, "more_video");
        MORE_VIDEO_BTN = enumC901750ZZd2;
        EnumC901750ZZd enumC901750ZZd3 = new EnumC901750ZZd("AVATAR", 2, "avatar");
        AVATAR = enumC901750ZZd3;
        EnumC901750ZZd enumC901750ZZd4 = new EnumC901750ZZd("OTHERS", 3, "others");
        OTHERS = enumC901750ZZd4;
        EnumC901750ZZd[] enumC901750ZZdArr = {enumC901750ZZd, enumC901750ZZd2, enumC901750ZZd3, enumC901750ZZd4};
        LLILLJJLI = enumC901750ZZdArr;
        LLILLL = new C2254308sP(enumC901750ZZdArr);
    }

    public static EnumC901750ZZd[] values() {
        return (EnumC901750ZZd[]) LLILLJJLI.clone();
    }

    public final String getButtonTypeStr() {
        return this.LL;
    }

    public static EnumC901750ZZd valueOf(String str) {
        return (EnumC901750ZZd) C08FF.LIZ(EnumC901750ZZd.class, str);
    }

    public EnumC901750ZZd(String str, int i, String str2) {
        this.LL = str2;
    }
}
