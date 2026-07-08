package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC733850SqV {
    public static final EnumC733850SqV DM_PAGE;
    public static final EnumC733850SqV FYP;
    public static final /* synthetic */ EnumC733850SqV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC733850SqV SHARE_AND_REPOST_FEED;
    public static final EnumC733850SqV UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC733850SqV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC733850SqV enumC733850SqV = new EnumC733850SqV("UNKNOWN", 0, CardStruct.IStatusCode.DEFAULT);
        UNKNOWN = enumC733850SqV;
        EnumC733850SqV enumC733850SqV2 = new EnumC733850SqV("FYP", 1, "1");
        FYP = enumC733850SqV2;
        EnumC733850SqV enumC733850SqV3 = new EnumC733850SqV("SHARE_AND_REPOST_FEED", 2, "2");
        SHARE_AND_REPOST_FEED = enumC733850SqV3;
        EnumC733850SqV enumC733850SqV4 = new EnumC733850SqV("DM_PAGE", 3, "3");
        DM_PAGE = enumC733850SqV4;
        EnumC733850SqV[] enumC733850SqVArr = {enumC733850SqV, enumC733850SqV2, enumC733850SqV3, enumC733850SqV4};
        LLILLJJLI = enumC733850SqVArr;
        LLILLL = new C2254308sP(enumC733850SqVArr);
    }

    public static EnumC733850SqV[] values() {
        return (EnumC733850SqV[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC733850SqV valueOf(String str) {
        return (EnumC733850SqV) C08FF.LIZ(EnumC733850SqV.class, str);
    }

    public EnumC733850SqV(String str, int i, String str2) {
        this.LL = str2;
    }
}
