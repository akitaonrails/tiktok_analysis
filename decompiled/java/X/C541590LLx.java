package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;

/* JADX INFO: renamed from: X.0LLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C541590LLx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Source.values().length];
        try {
            iArr[Source.AI_THEATER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
