package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC970570bMd {
    public static final EnumC970570bMd FAIL_BIZ_COMMON_NULL;
    public static final EnumC970570bMd FAIL_CHANNEL_ID_MISMATCH;
    public static final EnumC970570bMd FAIL_COMPETITION_ID_0;
    public static final EnumC970570bMd FAIL_COMPETITION_ID_FINISHED;
    public static final EnumC970570bMd FAIL_COMPETITION_STATUS_FINISHED;
    public static final EnumC970570bMd FAIL_TAKE_STAGE_INFO_NULL;
    public static final /* synthetic */ EnumC970570bMd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC970570bMd SUCCESS;

    public static InterfaceC2044707zh<EnumC970570bMd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC970570bMd enumC970570bMd = new EnumC970570bMd("SUCCESS", 0);
        SUCCESS = enumC970570bMd;
        EnumC970570bMd enumC970570bMd2 = new EnumC970570bMd("FAIL_BIZ_COMMON_NULL", 1);
        FAIL_BIZ_COMMON_NULL = enumC970570bMd2;
        EnumC970570bMd enumC970570bMd3 = new EnumC970570bMd("FAIL_TAKE_STAGE_INFO_NULL", 2);
        FAIL_TAKE_STAGE_INFO_NULL = enumC970570bMd3;
        EnumC970570bMd enumC970570bMd4 = new EnumC970570bMd("FAIL_CHANNEL_ID_MISMATCH", 3);
        FAIL_CHANNEL_ID_MISMATCH = enumC970570bMd4;
        EnumC970570bMd enumC970570bMd5 = new EnumC970570bMd("FAIL_COMPETITION_ID_0", 4);
        FAIL_COMPETITION_ID_0 = enumC970570bMd5;
        EnumC970570bMd enumC970570bMd6 = new EnumC970570bMd("FAIL_COMPETITION_ID_FINISHED", 5);
        FAIL_COMPETITION_ID_FINISHED = enumC970570bMd6;
        EnumC970570bMd enumC970570bMd7 = new EnumC970570bMd("FAIL_COMPETITION_STATUS_FINISHED", 6);
        FAIL_COMPETITION_STATUS_FINISHED = enumC970570bMd7;
        EnumC970570bMd[] enumC970570bMdArr = {enumC970570bMd, enumC970570bMd2, enumC970570bMd3, enumC970570bMd4, enumC970570bMd5, enumC970570bMd6, enumC970570bMd7};
        LL = enumC970570bMdArr;
        LLILLJJLI = new C2254308sP(enumC970570bMdArr);
    }

    public static EnumC970570bMd[] values() {
        return (EnumC970570bMd[]) LL.clone();
    }

    public final boolean isNeedRetryApi() {
        return (this == SUCCESS || this == FAIL_COMPETITION_ID_FINISHED || this == FAIL_COMPETITION_STATUS_FINISHED) ? false : true;
    }

    public final boolean isSuccess() {
        return this == SUCCESS;
    }

    public static EnumC970570bMd valueOf(String str) {
        return (EnumC970570bMd) C08FF.LIZ(EnumC970570bMd.class, str);
    }

    public EnumC970570bMd(String str, int i) {
    }
}
