package X;

import com.bytedance.adsdk.ugeno.yoga.YogaNative;
import com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19JX, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JX extends YogaNodeJNIBase {
    public final void finalize() throws Throwable {
        try {
            long j = this.LLILZ;
            if (j != 0) {
                this.LLILZ = 0L;
                YogaNative.jni_YGNodeFinalizeJNI(j);
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }
}
