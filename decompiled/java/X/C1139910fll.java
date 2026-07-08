package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceIntegrityCheckSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139910fll {
    public static void LIZ(long j, String str) {
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                return;
            }
            C1140890fnL.LIZLLL().getClass();
            AssetsModel assetsModelLJFF = C1138630fjh.LJFF(j);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (LiveGiftResourceIntegrityCheckSetting.INSTANCE.isEnabled(assetsModelLJFF)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(".modCheck");
                C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (!c0vsj2.exists()) {
                    c0vsj2.createNewFile();
                }
                c0vsj2.setLastModified(jCurrentTimeMillis);
            }
            C189200o6.m2constructorimpl(Boolean.valueOf(c0vsj.setLastModified(jCurrentTimeMillis)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
