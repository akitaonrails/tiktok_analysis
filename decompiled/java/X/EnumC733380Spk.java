package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Spk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC733380Spk {
    public static final EnumC733380Spk ADVERTISEMENT;
    public static final EnumC733380Spk ALLOW_COMMENT;
    public static final EnumC733380Spk DEFAULT;
    public static final EnumC733380Spk DELETED;
    public static final EnumC733380Spk FORBIDDEN;
    public static final EnumC733380Spk FTC;
    public static final /* synthetic */ EnumC733380Spk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC733380Spk NOT_ADX_AD;
    public static final EnumC733380Spk NO_PERMISSION;
    public static final EnumC733380Spk PRIVATE;
    public static final EnumC733380Spk THIRD_PARTY;
    public static final EnumC733380Spk UNAVAILABLE;
    public static final EnumC733380Spk UNPUBLISHED;

    public static InterfaceC2044707zh<EnumC733380Spk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC733380Spk enumC733380Spk = new EnumC733380Spk("FTC", 0);
        FTC = enumC733380Spk;
        EnumC733380Spk enumC733380Spk2 = new EnumC733380Spk("UNAVAILABLE", 1);
        UNAVAILABLE = enumC733380Spk2;
        EnumC733380Spk enumC733380Spk3 = new EnumC733380Spk("DELETED", 2);
        DELETED = enumC733380Spk3;
        EnumC733380Spk enumC733380Spk4 = new EnumC733380Spk("PRIVATE", 3);
        PRIVATE = enumC733380Spk4;
        EnumC733380Spk enumC733380Spk5 = new EnumC733380Spk("THIRD_PARTY", 4);
        THIRD_PARTY = enumC733380Spk5;
        EnumC733380Spk enumC733380Spk6 = new EnumC733380Spk("UNPUBLISHED", 5);
        UNPUBLISHED = enumC733380Spk6;
        EnumC733380Spk enumC733380Spk7 = new EnumC733380Spk("ADVERTISEMENT", 6);
        ADVERTISEMENT = enumC733380Spk7;
        EnumC733380Spk enumC733380Spk8 = new EnumC733380Spk("FORBIDDEN", 7);
        FORBIDDEN = enumC733380Spk8;
        EnumC733380Spk enumC733380Spk9 = new EnumC733380Spk("NO_PERMISSION", 8);
        NO_PERMISSION = enumC733380Spk9;
        EnumC733380Spk enumC733380Spk10 = new EnumC733380Spk("ALLOW_COMMENT", 9);
        ALLOW_COMMENT = enumC733380Spk10;
        EnumC733380Spk enumC733380Spk11 = new EnumC733380Spk("NOT_ADX_AD", 10);
        NOT_ADX_AD = enumC733380Spk11;
        EnumC733380Spk enumC733380Spk12 = new EnumC733380Spk(LivePreviewCTASmartDisplayManager.DEFAULT, 11);
        DEFAULT = enumC733380Spk12;
        EnumC733380Spk[] enumC733380SpkArr = {enumC733380Spk, enumC733380Spk2, enumC733380Spk3, enumC733380Spk4, enumC733380Spk5, enumC733380Spk6, enumC733380Spk7, enumC733380Spk8, enumC733380Spk9, enumC733380Spk10, enumC733380Spk11, enumC733380Spk12};
        LL = enumC733380SpkArr;
        LLILLJJLI = new C2254308sP(enumC733380SpkArr);
    }

    public static EnumC733380Spk[] values() {
        return (EnumC733380Spk[]) LL.clone();
    }

    public static EnumC733380Spk valueOf(String str) {
        return (EnumC733380Spk) C08FF.LIZ(EnumC733380Spk.class, str);
    }

    public EnumC733380Spk(String str, int i) {
    }
}
