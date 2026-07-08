package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@InterfaceC1294060jmO
public final class EnumC1127600fRu {
    public static final EnumC1127600fRu COLOR_BANNER;
    public static final C1127950fST Companion;
    public static final EnumC1127600fRu DEFAULT;
    public static final EnumC1127600fRu FIRST_GIFT;
    public static final EnumC1127600fRu FIRST_RECHARGE;
    public static final EnumC1127600fRu GOAL_GIFT;
    public static final /* synthetic */ EnumC1127600fRu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1127600fRu LYNX_BANNER;
    public static final EnumC1127600fRu MATCH_ONLY;
    public static final EnumC1127600fRu RANDOM_BANNER;
    public static final EnumC1127600fRu SPONSOR_BANNER;
    public static final EnumC1127600fRu USER_LEVEL;

    public static InterfaceC2044707zh<EnumC1127600fRu> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0fST] */
    static {
        EnumC1127600fRu enumC1127600fRu = new EnumC1127600fRu("SPONSOR_BANNER", 0);
        SPONSOR_BANNER = enumC1127600fRu;
        EnumC1127600fRu enumC1127600fRu2 = new EnumC1127600fRu("COLOR_BANNER", 1);
        COLOR_BANNER = enumC1127600fRu2;
        EnumC1127600fRu enumC1127600fRu3 = new EnumC1127600fRu("MATCH_ONLY", 2);
        MATCH_ONLY = enumC1127600fRu3;
        EnumC1127600fRu enumC1127600fRu4 = new EnumC1127600fRu("FIRST_RECHARGE", 3);
        FIRST_RECHARGE = enumC1127600fRu4;
        EnumC1127600fRu enumC1127600fRu5 = new EnumC1127600fRu("USER_LEVEL", 4);
        USER_LEVEL = enumC1127600fRu5;
        EnumC1127600fRu enumC1127600fRu6 = new EnumC1127600fRu("LYNX_BANNER", 5);
        LYNX_BANNER = enumC1127600fRu6;
        EnumC1127600fRu enumC1127600fRu7 = new EnumC1127600fRu("RANDOM_BANNER", 6);
        RANDOM_BANNER = enumC1127600fRu7;
        EnumC1127600fRu enumC1127600fRu8 = new EnumC1127600fRu("FIRST_GIFT", 7);
        FIRST_GIFT = enumC1127600fRu8;
        EnumC1127600fRu enumC1127600fRu9 = new EnumC1127600fRu("GOAL_GIFT", 8);
        GOAL_GIFT = enumC1127600fRu9;
        EnumC1127600fRu enumC1127600fRu10 = new EnumC1127600fRu(LivePreviewCTASmartDisplayManager.DEFAULT, 9);
        DEFAULT = enumC1127600fRu10;
        EnumC1127600fRu[] enumC1127600fRuArr = {enumC1127600fRu, enumC1127600fRu2, enumC1127600fRu3, enumC1127600fRu4, enumC1127600fRu5, enumC1127600fRu6, enumC1127600fRu7, enumC1127600fRu8, enumC1127600fRu9, enumC1127600fRu10};
        LL = enumC1127600fRuArr;
        LLILLJJLI = new C2254308sP(enumC1127600fRuArr);
        Companion = new Object() { // from class: X.0fST
        };
    }

    public static EnumC1127600fRu[] values() {
        return (EnumC1127600fRu[]) LL.clone();
    }

    public static EnumC1127600fRu valueOf(String str) {
        return (EnumC1127600fRu) C08FF.LIZ(EnumC1127600fRu.class, str);
    }

    public EnumC1127600fRu(String str, int i) {
    }
}
