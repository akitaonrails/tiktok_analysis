package X;

import com.ss.android.ugc.aweme.creative.model.SoundEffect;

/* JADX INFO: renamed from: X.11f0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19554811f0 {
    public static final float LIZ = C354870Dvh.LIZIZ() * 48.0f;
    public static final long LIZIZ = 300;

    public static final C19556311fF LIZ(SoundEffect soundEffect) {
        int i;
        int i2 = soundEffect.collectStatus;
        if (soundEffect.isLocalFileExist) {
            i = 3;
        } else {
            i = 1;
        }
        return new C19556311fF(soundEffect, i, i2);
    }
}
