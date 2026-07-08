package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hrr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1220570hrr {
    public static final EnumC1220570hrr AUTHOR_SIDE_FIRST_COMMENT;
    public static final EnumC1220570hrr DEFAULT;
    public static final EnumC1220570hrr FIRST_COMMENT_MILESTONE;
    public static final /* synthetic */ EnumC1220570hrr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1220570hrr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1220570hrr enumC1220570hrr = new EnumC1220570hrr(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1220570hrr;
        EnumC1220570hrr enumC1220570hrr2 = new EnumC1220570hrr("FIRST_COMMENT_MILESTONE", 1, 5);
        FIRST_COMMENT_MILESTONE = enumC1220570hrr2;
        EnumC1220570hrr enumC1220570hrr3 = new EnumC1220570hrr("AUTHOR_SIDE_FIRST_COMMENT", 2, 6);
        AUTHOR_SIDE_FIRST_COMMENT = enumC1220570hrr3;
        EnumC1220570hrr[] enumC1220570hrrArr = {enumC1220570hrr, enumC1220570hrr2, enumC1220570hrr3};
        LLILLJJLI = enumC1220570hrrArr;
        LLILLL = new C2254308sP(enumC1220570hrrArr);
    }

    public static EnumC1220570hrr[] values() {
        return (EnumC1220570hrr[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1220570hrr valueOf(String str) {
        return (EnumC1220570hrr) C08FF.LIZ(EnumC1220570hrr.class, str);
    }

    public EnumC1220570hrr(String str, int i, int i2) {
        this.LL = i2;
    }
}
