package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03i2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C916003i2 extends AbstractC916103i3 {
    public C916003i2() {
    }

    public C916003i2(String str) {
        super(str);
        try {
            this.LIZ.optString("detail_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
