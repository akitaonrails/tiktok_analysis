package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.Banner;

/* JADX INFO: renamed from: X.11F6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C11F6 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Banner.BannerSchemaType.values().length];
        LIZ = iArr;
        try {
            iArr[Banner.BannerSchemaType.PLAYLIST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[Banner.BannerSchemaType.AI_RECOMMEND_PLAYLIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[Banner.BannerSchemaType.MUSIC.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[Banner.BannerSchemaType.WEB.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
