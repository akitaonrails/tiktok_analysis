package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC857860Xl2 {
    public static final EnumC857860Xl2 COMMENT_POST_CHAIN;
    public static final EnumC857860Xl2 DEFAULT;
    public static final EnumC857860Xl2 DUET_CHAIN;
    public static final EnumC857860Xl2 HIGH_LIGHT;
    public static final /* synthetic */ EnumC857860Xl2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC857860Xl2 REPLY_COMMENT_CHAIN;
    public static final EnumC857860Xl2 STITCH_CHAIN;

    public static InterfaceC2044707zh<EnumC857860Xl2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC857860Xl2 enumC857860Xl2 = new EnumC857860Xl2("HIGH_LIGHT", 0);
        HIGH_LIGHT = enumC857860Xl2;
        EnumC857860Xl2 enumC857860Xl22 = new EnumC857860Xl2("COMMENT_POST_CHAIN", 1);
        COMMENT_POST_CHAIN = enumC857860Xl22;
        EnumC857860Xl2 enumC857860Xl23 = new EnumC857860Xl2("REPLY_COMMENT_CHAIN", 2);
        REPLY_COMMENT_CHAIN = enumC857860Xl23;
        EnumC857860Xl2 enumC857860Xl24 = new EnumC857860Xl2("DUET_CHAIN", 3);
        DUET_CHAIN = enumC857860Xl24;
        EnumC857860Xl2 enumC857860Xl25 = new EnumC857860Xl2("STITCH_CHAIN", 4);
        STITCH_CHAIN = enumC857860Xl25;
        EnumC857860Xl2 enumC857860Xl26 = new EnumC857860Xl2(LivePreviewCTASmartDisplayManager.DEFAULT, 5);
        DEFAULT = enumC857860Xl26;
        EnumC857860Xl2[] enumC857860Xl2Arr = {enumC857860Xl2, enumC857860Xl22, enumC857860Xl23, enumC857860Xl24, enumC857860Xl25, enumC857860Xl26};
        LL = enumC857860Xl2Arr;
        LLILLJJLI = new C2254308sP(enumC857860Xl2Arr);
    }

    public static EnumC857860Xl2[] values() {
        return (EnumC857860Xl2[]) LL.clone();
    }

    public static EnumC857860Xl2 valueOf(String str) {
        return (EnumC857860Xl2) C08FF.LIZ(EnumC857860Xl2.class, str);
    }

    public EnumC857860Xl2(String str, int i) {
    }
}
