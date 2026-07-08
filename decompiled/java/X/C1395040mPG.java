package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.external.TemplateScene;

/* JADX INFO: renamed from: X.0mPG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1395040mPG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[TemplateScene.values().length];
        try {
            iArr[TemplateScene.UGC.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[TemplateScene.PUGC.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
