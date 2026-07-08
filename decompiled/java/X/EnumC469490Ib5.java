package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ib5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC469490Ib5 {
    public static final EnumC469490Ib5 DEFAULT;
    public static final EnumC469490Ib5 GAME_CATEGORY;
    public static final EnumC469490Ib5 GAME_CATEGORY_BOTTOM;
    public static final EnumC469490Ib5 GAME_DROPS;
    public static final EnumC469490Ib5 GAME_ESPORT;
    public static final EnumC469490Ib5 GAME_GUESS;
    public static final /* synthetic */ EnumC469490Ib5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC469490Ib5 NORMAL_GAME;

    public static InterfaceC2044707zh<EnumC469490Ib5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC469490Ib5 enumC469490Ib5 = new EnumC469490Ib5(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC469490Ib5;
        EnumC469490Ib5 enumC469490Ib52 = new EnumC469490Ib5("NORMAL_GAME", 1);
        NORMAL_GAME = enumC469490Ib52;
        EnumC469490Ib5 enumC469490Ib53 = new EnumC469490Ib5("GAME_ESPORT", 2);
        GAME_ESPORT = enumC469490Ib53;
        EnumC469490Ib5 enumC469490Ib54 = new EnumC469490Ib5("GAME_DROPS", 3);
        GAME_DROPS = enumC469490Ib54;
        EnumC469490Ib5 enumC469490Ib55 = new EnumC469490Ib5("GAME_CATEGORY", 4);
        GAME_CATEGORY = enumC469490Ib55;
        EnumC469490Ib5 enumC469490Ib56 = new EnumC469490Ib5("GAME_CATEGORY_BOTTOM", 5);
        GAME_CATEGORY_BOTTOM = enumC469490Ib56;
        EnumC469490Ib5 enumC469490Ib57 = new EnumC469490Ib5("GAME_GUESS", 6);
        GAME_GUESS = enumC469490Ib57;
        EnumC469490Ib5[] enumC469490Ib5Arr = {enumC469490Ib5, enumC469490Ib52, enumC469490Ib53, enumC469490Ib54, enumC469490Ib55, enumC469490Ib56, enumC469490Ib57};
        LL = enumC469490Ib5Arr;
        LLILLJJLI = new C2254308sP(enumC469490Ib5Arr);
    }

    public static EnumC469490Ib5[] values() {
        return (EnumC469490Ib5[]) LL.clone();
    }

    public static EnumC469490Ib5 valueOf(String str) {
        return (EnumC469490Ib5) C08FF.LIZ(EnumC469490Ib5.class, str);
    }

    public EnumC469490Ib5(String str, int i) {
    }
}
