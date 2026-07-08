package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideConfig;

/* JADX INFO: renamed from: X.0d7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1038260d7o {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AdExternalGuideConfig.Format.values().length];
        try {
            iArr[AdExternalGuideConfig.Format.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AdExternalGuideConfig.Format.DIALOG.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AdExternalGuideConfig.Format.DIRECT_JUMP.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
