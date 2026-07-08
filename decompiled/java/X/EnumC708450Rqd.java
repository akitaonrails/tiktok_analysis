package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Rqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC708450Rqd {
    public static final EnumC708450Rqd HAS_AUDIO;
    public static final EnumC708450Rqd HAS_PHOTO;
    public static final /* synthetic */ EnumC708450Rqd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC708450Rqd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC708450Rqd enumC708450Rqd = new EnumC708450Rqd("HAS_PHOTO", 0, "has_photo");
        HAS_PHOTO = enumC708450Rqd;
        EnumC708450Rqd enumC708450Rqd2 = new EnumC708450Rqd("HAS_AUDIO", 1, "has_audio");
        HAS_AUDIO = enumC708450Rqd2;
        EnumC708450Rqd[] enumC708450RqdArr = {enumC708450Rqd, enumC708450Rqd2};
        LLILLJJLI = enumC708450RqdArr;
        LLILLL = new C2254308sP(enumC708450RqdArr);
    }

    public static EnumC708450Rqd[] values() {
        return (EnumC708450Rqd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC708450Rqd valueOf(String str) {
        return (EnumC708450Rqd) C08FF.LIZ(EnumC708450Rqd.class, str);
    }

    public EnumC708450Rqd(String str, int i, String str2) {
        this.LL = str2;
    }
}
