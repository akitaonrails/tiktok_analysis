package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0owC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492340owC implements InterfaceC1492330owB {
    @Override // X.InterfaceC1492330owB
    public final void LIZ(C1492320owA c1492320owA, EnumC1492290ow7 enumC1492290ow7, JSONObject jSONObject) {
        if (enumC1492290ow7 == EnumC1492290ow7.NO_NETWORK && c1492320owA.LIZIZ) {
            C2487409ou.LIZJ(new Runnable() { // from class: X.0CPe
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MusicDetectorManager@75a7.netDetectCallBack$1");
                    try {
                        C844470XAv.LIZ.getClass();
                        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
                        c1233040iBy.LIZIZ(2131857904);
                        c1233040iBy.LIZLLL();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MusicDetectorManager@75a7.netDetectCallBack$1");
                }
            });
        }
        try {
            C794240VDq.LIZJ("aweme_music_download_netdetect_log", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
