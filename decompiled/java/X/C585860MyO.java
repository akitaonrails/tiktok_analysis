package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0MyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585860MyO {
    public static float LIZ(Aweme aweme) {
        if (aweme == null) {
            return 1.0f;
        }
        float fLIZIZ = LIZIZ(aweme);
        double d = fLIZIZ;
        if (0.5d > d || d > 2.0d) {
            return 1.0f;
        }
        return fLIZIZ;
    }

    public static float LIZIZ(Aweme aweme) {
        if (aweme == null || C19252910Tv.LIZIZ.LIZLLL().block().LJFF()) {
            return -1.0f;
        }
        return aweme.getParameterizedSpeed();
    }
}
