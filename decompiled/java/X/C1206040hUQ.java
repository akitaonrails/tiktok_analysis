package X;

import com.ss.android.ugc.aweme.game.GameEffectExtras;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0hUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206040hUQ {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0gTt] */
    public static final C1167270gTt LIZ(C1698606ky c1698606ky) {
        String str;
        final boolean zIsChallengeGame;
        GameEffectExtras gameEffectExtras = (GameEffectExtras) C051M.LIZIZ(GameEffectExtras.class, c1698606ky.LIZIZ.getExtra());
        final String name = c1698606ky.LIZIZ.getName();
        final String effect_id = c1698606ky.LIZIZ.getEffect_id();
        final String resourceId = c1698606ky.LIZIZ.getResourceId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) C13LP.LJJJLL(c1698606ky.LIZ));
        if (gameEffectExtras == null || (str = gameEffectExtras.coverImg) == null) {
            str = "";
        }
        sbLIZ.append(str);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        final Effect effect = c1698606ky.LIZIZ;
        if (gameEffectExtras != null) {
            zIsChallengeGame = gameEffectExtras.isChallengeGame();
        } else {
            zIsChallengeGame = false;
        }
        return new Object(name, effect_id, resourceId, strLIZIZ, effect, zIsChallengeGame) { // from class: X.0gTt
            public final String LIZ;
            public final String LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final Effect LJ;
            public final boolean LJFF;

            {
                this.LIZ = name;
                this.LIZIZ = effect_id;
                this.LIZJ = resourceId;
                this.LIZLLL = strLIZIZ;
                this.LJ = effect;
                this.LJFF = zIsChallengeGame;
            }
        };
    }
}
