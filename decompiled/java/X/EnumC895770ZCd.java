package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895770ZCd {
    public static final EnumC895770ZCd COMMENT_MENTION;
    public static final /* synthetic */ EnumC895770ZCd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC895770ZCd QA_INVITE;
    public static final EnumC895770ZCd UNDEFINED;
    public static final EnumC895770ZCd VIDEO_MENTION;
    public static final EnumC895770ZCd VIDEO_TAG;
    public final int LL;

    public static InterfaceC2044707zh<EnumC895770ZCd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC895770ZCd enumC895770ZCd = new EnumC895770ZCd("UNDEFINED", 0, 0);
        UNDEFINED = enumC895770ZCd;
        EnumC895770ZCd enumC895770ZCd2 = new EnumC895770ZCd("COMMENT_MENTION", 1, 3);
        COMMENT_MENTION = enumC895770ZCd2;
        EnumC895770ZCd enumC895770ZCd3 = new EnumC895770ZCd("VIDEO_TAG", 2, 4);
        VIDEO_TAG = enumC895770ZCd3;
        EnumC895770ZCd enumC895770ZCd4 = new EnumC895770ZCd("QA_INVITE", 3, 5);
        QA_INVITE = enumC895770ZCd4;
        EnumC895770ZCd enumC895770ZCd5 = new EnumC895770ZCd("VIDEO_MENTION", 4, 6);
        VIDEO_MENTION = enumC895770ZCd5;
        EnumC895770ZCd[] enumC895770ZCdArr = {enumC895770ZCd, enumC895770ZCd2, enumC895770ZCd3, enumC895770ZCd4, enumC895770ZCd5};
        LLILLJJLI = enumC895770ZCdArr;
        LLILLL = new C2254308sP(enumC895770ZCdArr);
    }

    public static EnumC895770ZCd[] values() {
        return (EnumC895770ZCd[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC895770ZCd valueOf(String str) {
        return (EnumC895770ZCd) C08FF.LIZ(EnumC895770ZCd.class, str);
    }

    public EnumC895770ZCd(String str, int i, int i2) {
        this.LL = i2;
    }
}
