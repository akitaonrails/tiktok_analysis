package X;

import com.bytedance.lynx.hybrid.settings.SettingsConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0uMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701030uMn {
    public final /* synthetic */ C1700970uMh LIZ;

    public C1701030uMn(C1700970uMh c1700970uMh) {
        this.LIZ = c1700970uMh;
    }

    public final void LIZ(String str) {
        C1700970uMh c1700970uMh = this.LIZ;
        SettingsConfig settingsConfig = c1700970uMh.LIZLLL;
        if (settingsConfig != null) {
            C1701090uMt config = settingsConfig.parseConfig(str);
            if (config != null) {
                AbstractC1701050uMp abstractC1701050uMp = c1700970uMh.LIZIZ;
                if (abstractC1701050uMp == null) {
                    abstractC1701050uMp = null;
                }
                abstractC1701050uMp.LIZLLL(config);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("could not parse content: ");
            sbLIZ.append(str);
            LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZIZ(String str) {
        Iterator<InterfaceC1701080uMs> it2 = this.LIZ.LJI.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZIZ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFetchFailed callback failed ");
                sbLIZ.append(th);
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "HybridSettings");
            }
        }
        this.LIZ.LJ.set(false);
        this.LIZ.LIZLLL(false);
    }
}
