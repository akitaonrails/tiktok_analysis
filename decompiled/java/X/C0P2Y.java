package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* JADX INFO: renamed from: X.0P2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C0P2Y {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[DspPlatform.values().length];
        try {
            iArr[DspPlatform.APPLE_MUSIC.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[DspPlatform.AMAZON_MUSIC.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[DspPlatform.SPOTIFY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[DspPlatform.MELON.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[DspPlatform.DEEZER.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[DspPlatform.SOUND_CLOUD.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[DspPlatform.YOUTUBE_MUSIC.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[DspPlatform.ANGHAMI.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        LIZ = iArr;
    }
}
