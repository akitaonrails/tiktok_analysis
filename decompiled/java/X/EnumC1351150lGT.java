package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1351150lGT {
    public static final EnumC1351150lGT DEFAULT;
    public static final EnumC1351150lGT DOUBLE_FOLLOW;
    public static final /* synthetic */ EnumC1351150lGT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1351150lGT ZERO_COMMENT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1351150lGT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1351150lGT enumC1351150lGT = new EnumC1351150lGT(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC1351150lGT;
        EnumC1351150lGT enumC1351150lGT2 = new EnumC1351150lGT("ZERO_COMMENT", 1, "zero_comment");
        ZERO_COMMENT = enumC1351150lGT2;
        EnumC1351150lGT enumC1351150lGT3 = new EnumC1351150lGT("DOUBLE_FOLLOW", 2, "double_follow");
        DOUBLE_FOLLOW = enumC1351150lGT3;
        EnumC1351150lGT[] enumC1351150lGTArr = {enumC1351150lGT, enumC1351150lGT2, enumC1351150lGT3};
        LLILLJJLI = enumC1351150lGTArr;
        LLILLL = new C2254308sP(enumC1351150lGTArr);
    }

    public static EnumC1351150lGT[] values() {
        return (EnumC1351150lGT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1351150lGT valueOf(String str) {
        return (EnumC1351150lGT) C08FF.LIZ(EnumC1351150lGT.class, str);
    }

    public EnumC1351150lGT(String str, int i, String str2) {
        this.LL = str2;
    }
}
