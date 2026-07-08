package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.RustBaseTrackerSetup;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import qo2.w;

/* JADX INFO: renamed from: X.0jUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283260jUy extends C09AY implements Function0<Boolean> {
    public C1283260jUy() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0bM7] */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        try {
            LoadSoLancet.LIZJ("link_mic_sdk");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("link_mic_sdk");
            LoadSoLancet.LJ(jUptimeMillis, "link_mic_sdk");
            LoadSoLancet.LIZLLL(jUptimeMillis, "link_mic_sdk");
            LoadSoLancet.LIZIZ("link_mic_sdk");
            if (RustBaseTrackerSetup.INSTANCE.getValue()) {
                C2231651CWd.LJJLIIIJLJLI(new InterfaceC970260bM8() { // from class: X.0bM7
                    @Override // X.InterfaceC970260bM8
                    public final void LIZ(long j, String str, Map map) {
                        double no_sample;
                        String str2;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("on rust tracker event: ");
                        sbLIZ.append(str);
                        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), "Tracker");
                        if (j == 1) {
                            no_sample = LiveLogSampleConfigSetting.getSAMPLE_10();
                        } else if (j == 10) {
                            no_sample = LiveLogSampleConfigSetting.getSAMPLE_100();
                        } else if (j == 100) {
                            no_sample = LiveLogSampleConfigSetting.getSAMPLE_1000();
                        } else if (j == 1000) {
                            no_sample = LiveLogSampleConfigSetting.getNO_SAMPLE();
                        } else {
                            no_sample = LiveLogSampleConfigSetting.getNO_SAMPLE();
                        }
                        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ(str, Double.valueOf(no_sample));
                        HashMap map2 = new HashMap();
                        map2.putAll(map);
                        try {
                            map2.put("nqe_score", String.valueOf(TTNetInit.getEffectiveConnectionType()));
                            map2.put("http_rtt", String.valueOf(TTNetInit.getNetworkQuality().LIZIZ));
                            map2.put("trans_rtt", String.valueOf(TTNetInit.getNetworkQuality().LIZ));
                            map2.put("connection_type", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType());
                            w.LIZ.getClass();
                            map2.put("enter_method", w.LJIIL());
                            map2.put("enter_from_merge", w.LJIIIZ());
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        c474500IjALIZIZ.LJJIIZI(map2);
                        HashMap map3 = new HashMap();
                        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).wc0()) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        map3.put("in_bg", str2);
                        c474500IjALIZIZ.LJJIIZI(map3);
                        c474500IjALIZIZ.LIZ();
                    }
                });
            }
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on link mic_sdk load LinkMicRustNativeHelper2 unable to preload liblink_mic_sdk.so \n ");
            sbLIZ.append(th);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1AZW.LJFF(C1304630k3R.LJI("LinkerPlugin"), strLIZIZ, null, null);
            C1304660k3U.LIZ.LIZIZ(100001, strLIZIZ, th, null);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
