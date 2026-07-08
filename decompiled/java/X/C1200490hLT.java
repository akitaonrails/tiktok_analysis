package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionVisible;

/* JADX INFO: renamed from: X.0hLT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1200490hLT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AVPublishExtensionVisible.values().length];
        try {
            iArr[AVPublishExtensionVisible.VISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AVPublishExtensionVisible.GRAY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AVPublishExtensionVisible.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
