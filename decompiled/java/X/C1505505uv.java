package X;

import com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameConfig;

/* JADX INFO: renamed from: X.05uv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1505505uv {
    public static final EmojiGameConfig LIZ = new EmojiGameConfig(null, 0, null, 0, 15, null);
    public static final boolean LIZIZ;
    public static final int LIZJ;

    static {
        LIZIZ = LIZ().enable == 1;
        LIZJ = LIZ().expVersion;
    }

    public static EmojiGameConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EmojiGameConfig emojiGameConfig = LIZ;
        EmojiGameConfig emojiGameConfig2 = (EmojiGameConfig) c0c64LJIILLIIL.LJJII(EmojiGameConfig.class, emojiGameConfig, "emoji_game_experiment", false);
        return emojiGameConfig2 != null ? emojiGameConfig2 : emojiGameConfig;
    }
}
