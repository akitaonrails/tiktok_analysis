package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.publish.AVPublishPageScene;

/* JADX INFO: renamed from: X.0hAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1193940hAu {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AVPublishPageScene.values().length];
        try {
            iArr[AVPublishPageScene.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AVPublishPageScene.EDIT_POST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
