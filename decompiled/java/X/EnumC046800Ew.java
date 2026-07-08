package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC046800Ew {
    public static final EnumC046800Ew DEFAULT;
    public static final /* synthetic */ EnumC046800Ew[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC046800Ew SEARCH_WORD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC046800Ew> getEntries() {
        return LLILLL;
    }

    static {
        EnumC046800Ew enumC046800Ew = new EnumC046800Ew(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC046800Ew;
        EnumC046800Ew enumC046800Ew2 = new EnumC046800Ew("SEARCH_WORD", 1, 1);
        SEARCH_WORD = enumC046800Ew2;
        EnumC046800Ew[] enumC046800EwArr = {enumC046800Ew, enumC046800Ew2};
        LLILLJJLI = enumC046800EwArr;
        LLILLL = new C2254308sP(enumC046800EwArr);
    }

    public static EnumC046800Ew[] values() {
        return (EnumC046800Ew[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC046800Ew valueOf(String str) {
        return (EnumC046800Ew) C08FF.LIZ(EnumC046800Ew.class, str);
    }

    public EnumC046800Ew(String str, int i, int i2) {
        this.LL = i2;
    }
}
