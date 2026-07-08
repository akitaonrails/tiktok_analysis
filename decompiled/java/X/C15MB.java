package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin;

/* JADX INFO: renamed from: X.15MB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C15MB {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ShootActionOrigin.values().length];
        try {
            iArr[ShootActionOrigin.CLICK_EFFECT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[ShootActionOrigin.CLICK_HASHTAG.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
