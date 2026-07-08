package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1811400xEo {
    public static final EnumC1811400xEo COMBINED;
    public static final EnumC1811400xEo CONTENT_SPOTLIGHT;
    public static final C1811420xEq Companion;
    public static final EnumC1811400xEo DEFAULT;
    public static final EnumC1811400xEo ENTRANCE1;
    public static final EnumC1811400xEo ENTRANCE2;
    public static final EnumC1811400xEo E_COMMERCE;
    public static final EnumC1811400xEo FRIEND_RANKING;
    public static final EnumC1811400xEo GAME_RANK;
    public static final EnumC1811400xEo GIFT_RANK;
    public static final /* synthetic */ EnumC1811400xEo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1811400xEo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1811400xEo enumC1811400xEo = new EnumC1811400xEo(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1811400xEo;
        EnumC1811400xEo enumC1811400xEo2 = new EnumC1811400xEo("GIFT_RANK", 1, 1);
        GIFT_RANK = enumC1811400xEo2;
        EnumC1811400xEo enumC1811400xEo3 = new EnumC1811400xEo("E_COMMERCE", 2, 2);
        E_COMMERCE = enumC1811400xEo3;
        EnumC1811400xEo enumC1811400xEo4 = new EnumC1811400xEo("GAME_RANK", 3, 3);
        GAME_RANK = enumC1811400xEo4;
        EnumC1811400xEo enumC1811400xEo5 = new EnumC1811400xEo("CONTENT_SPOTLIGHT", 4, 5);
        CONTENT_SPOTLIGHT = enumC1811400xEo5;
        EnumC1811400xEo enumC1811400xEo6 = new EnumC1811400xEo("FRIEND_RANKING", 5, 6);
        FRIEND_RANKING = enumC1811400xEo6;
        EnumC1811400xEo enumC1811400xEo7 = new EnumC1811400xEo("COMBINED", 6, 4);
        COMBINED = enumC1811400xEo7;
        EnumC1811400xEo enumC1811400xEo8 = new EnumC1811400xEo("ENTRANCE1", 7, 101);
        ENTRANCE1 = enumC1811400xEo8;
        EnumC1811400xEo enumC1811400xEo9 = new EnumC1811400xEo("ENTRANCE2", 8, 102);
        ENTRANCE2 = enumC1811400xEo9;
        EnumC1811400xEo[] enumC1811400xEoArr = {enumC1811400xEo, enumC1811400xEo2, enumC1811400xEo3, enumC1811400xEo4, enumC1811400xEo5, enumC1811400xEo6, enumC1811400xEo7, enumC1811400xEo8, enumC1811400xEo9};
        LLILLJJLI = enumC1811400xEoArr;
        LLILLL = new C2254308sP(enumC1811400xEoArr);
        Companion = new C1811420xEq();
    }

    public static EnumC1811400xEo[] values() {
        return (EnumC1811400xEo[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1811400xEo valueOf(String str) {
        return (EnumC1811400xEo) C08FF.LIZ(EnumC1811400xEo.class, str);
    }

    public EnumC1811400xEo(String str, int i, int i2) {
        this.LL = i2;
    }
}
