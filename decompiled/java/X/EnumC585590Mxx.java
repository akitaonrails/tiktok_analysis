package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585590Mxx {
    public static final EnumC585590Mxx DEFAULT;
    public static final EnumC585590Mxx FILE_IS_EXPIRED;
    public static final EnumC585590Mxx FILE_LENGH_IS_INVALID;
    public static final EnumC585590Mxx FILE_NOT_EXIST;
    public static final EnumC585590Mxx FILE_NOT_IN_MEDIA_BOX;
    public static final EnumC585590Mxx FILE_NO_AWEME;
    public static final /* synthetic */ EnumC585590Mxx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC585590Mxx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC585590Mxx enumC585590Mxx = new EnumC585590Mxx(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC585590Mxx;
        EnumC585590Mxx enumC585590Mxx2 = new EnumC585590Mxx("FILE_NOT_EXIST", 1, 401);
        FILE_NOT_EXIST = enumC585590Mxx2;
        EnumC585590Mxx enumC585590Mxx3 = new EnumC585590Mxx("FILE_IS_EXPIRED", 2, 402);
        FILE_IS_EXPIRED = enumC585590Mxx3;
        EnumC585590Mxx enumC585590Mxx4 = new EnumC585590Mxx("FILE_LENGH_IS_INVALID", 3, 403);
        FILE_LENGH_IS_INVALID = enumC585590Mxx4;
        EnumC585590Mxx enumC585590Mxx5 = new EnumC585590Mxx("FILE_NOT_IN_MEDIA_BOX", 4, 404);
        FILE_NOT_IN_MEDIA_BOX = enumC585590Mxx5;
        EnumC585590Mxx enumC585590Mxx6 = new EnumC585590Mxx("FILE_NO_AWEME", 5, 405);
        FILE_NO_AWEME = enumC585590Mxx6;
        EnumC585590Mxx[] enumC585590MxxArr = {enumC585590Mxx, enumC585590Mxx2, enumC585590Mxx3, enumC585590Mxx4, enumC585590Mxx5, enumC585590Mxx6};
        LLILLJJLI = enumC585590MxxArr;
        LLILLL = new C2254308sP(enumC585590MxxArr);
    }

    public static EnumC585590Mxx[] values() {
        return (EnumC585590Mxx[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC585590Mxx valueOf(String str) {
        return (EnumC585590Mxx) C08FF.LIZ(EnumC585590Mxx.class, str);
    }

    public EnumC585590Mxx(String str, int i, int i2) {
        this.LL = i2;
    }
}
