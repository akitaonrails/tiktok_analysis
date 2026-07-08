package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.components.model.ComponentKey;

/* JADX INFO: renamed from: X.0tfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public /* synthetic */ class C1674020tfE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ComponentKey.values().length];
        try {
            iArr[ComponentKey.TABS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
