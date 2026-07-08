package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.tiktok.strategycenterengine.utils.PSPFeedUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Timer;
import kotlin.jvm.internal.AwS115S1000000_31;

/* JADX INFO: renamed from: X.14hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20336914hr extends AbstractC20655215s6 {
    public final Map<String, Timer> LIZIZ = new LinkedHashMap();

    @Override // X.AbstractC20655215s6
    public final String LIZJ() {
        return "outreach_timer";
    }

    @Override // X.AbstractC20655215s6
    public final void LIZIZ() {
        PSPFeedUtils.setInstance(new PSPFeedUtils() { // from class: X.14hq
            @Override // com.tiktok.strategycenterengine.utils.PSPFeedUtils
            public final long feePauseTime(String str) {
                C20571615ec c20571615ec = C20571615ec.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TimerOperator, feePauseTime, timerName: ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c20571615ec.getClass();
                C20571615ec.LIZIZ(strLIZIZ);
                if (str != null && str.length() > 0) {
                    this.LIZ.LIZLLL(str);
                    return 0L;
                }
                return 0L;
            }

            @Override // com.tiktok.strategycenterengine.utils.PSPFeedUtils
            public final long feeStopTime(String str) {
                C20571615ec c20571615ec = C20571615ec.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TimerOperator, feeStopTime, timerName: ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c20571615ec.getClass();
                C20571615ec.LIZIZ(strLIZIZ);
                if (str != null && str.length() > 0) {
                    this.LIZ.LIZLLL(str);
                    return 0L;
                }
                return 0L;
            }

            @Override // com.tiktok.strategycenterengine.utils.PSPFeedUtils
            public final long feedStartTime(String str, long j, boolean z) {
                long j2 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                C20571615ec c20571615ec = C20571615ec.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TimerOperator, feedStartTime, timerName: ");
                sbLIZ.append(str);
                sbLIZ.append(", totalTime: ");
                sbLIZ.append(j2);
                sbLIZ.append(", isCross: ");
                sbLIZ.append(z);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c20571615ec.getClass();
                C20571615ec.LIZIZ(strLIZIZ);
                if (str != null && str.length() > 0 && j2 > 0) {
                    C20336914hr c20336914hr = this.LIZ;
                    AwS115S1000000_31 awS115S1000000_31 = new AwS115S1000000_31(str, 2);
                    Timer timer = (Timer) ((LinkedHashMap) c20336914hr.LIZIZ).get(str);
                    if (timer != null) {
                        timer.cancel();
                    }
                    PthreadTimer pthreadTimer = new PthreadTimer("TimerOperator");
                    pthreadTimer.schedule(new C391480FWo(awS115S1000000_31, 6), j2);
                    c20336914hr.LIZIZ.put(str, pthreadTimer);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Start Timer '");
                    sbLIZ2.append(str);
                    sbLIZ2.append("', time = ");
                    sbLIZ2.append(j2);
                    C20571615ec.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
                return 0L;
            }
        });
    }

    public final void LIZLLL(String str) {
        Timer timer = (Timer) ((LinkedHashMap) this.LIZIZ).get(str);
        if (timer != null) {
            timer.cancel();
        }
        this.LIZIZ.remove(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Timer '");
        sbLIZ.append(str);
        sbLIZ.append("' stopped.");
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
    }
}
