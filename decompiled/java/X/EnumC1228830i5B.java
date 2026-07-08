package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i5B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1228830i5B {
    public static final EnumC1228830i5B COMMENT_ADD_GROUP;
    public static final EnumC1228830i5B DEFAULT;
    public static final /* synthetic */ EnumC1228830i5B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1228830i5B STICKER_CHOOSE_GROUP;

    public static InterfaceC2044707zh<EnumC1228830i5B> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1228830i5B enumC1228830i5B = new EnumC1228830i5B("COMMENT_ADD_GROUP", 0);
        COMMENT_ADD_GROUP = enumC1228830i5B;
        EnumC1228830i5B enumC1228830i5B2 = new EnumC1228830i5B(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = enumC1228830i5B2;
        EnumC1228830i5B enumC1228830i5B3 = new EnumC1228830i5B("STICKER_CHOOSE_GROUP", 2);
        STICKER_CHOOSE_GROUP = enumC1228830i5B3;
        EnumC1228830i5B[] enumC1228830i5BArr = {enumC1228830i5B, enumC1228830i5B2, enumC1228830i5B3};
        LL = enumC1228830i5BArr;
        LLILLJJLI = new C2254308sP(enumC1228830i5BArr);
    }

    public static EnumC1228830i5B[] values() {
        return (EnumC1228830i5B[]) LL.clone();
    }

    public static EnumC1228830i5B valueOf(String str) {
        return (EnumC1228830i5B) C08FF.LIZ(EnumC1228830i5B.class, str);
    }

    public EnumC1228830i5B(String str, int i) {
    }
}
