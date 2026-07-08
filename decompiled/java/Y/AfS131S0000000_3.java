package Y;

import X.C09JN;
import X.C11JF;
import X.C11NZ;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2469009lw;
import X.C2469109lx;
import X.C2469209ly;
import X.C606810Nr5;
import android.util.Log;
import com.ss.android.ugc.aweme.lifecycle.task.KeepWarmJobService;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class AfS131S0000000_3 implements C09JN {
    public final int $t;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    public AfS131S0000000_3(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS131S0000000_3 afS131S0000000_3, Object obj) {
        C1C7U.LIZ("TakeStagePlayingManageAudienceFragment@39b3.onWatchLiveClick$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jumpWatchLive");
        sbLIZ.append(", queryUserWithId failed");
        C20441214yg.LJIIIZ("TakeStagePlayingManageAudienceFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("TakeStagePlayingManageAudienceFragment@39b3.onWatchLiveClick$2");
    }

    public static final void accept$1(AfS131S0000000_3 afS131S0000000_3, Object obj) {
        C1C7U.LIZ("LivePlayController@1c0e.startPlayerInstancePollTimer$2L");
        C20441214yg.LJ("Play_Controller_Instance", Log.getStackTraceString((Throwable) obj));
        C1C7U.LIZIZ("LivePlayController@1c0e.startPlayerInstancePollTimer$2L");
    }

    public static final void accept$2(AfS131S0000000_3 afS131S0000000_3, Object obj) {
        C1C7U.LIZ("I18nCenterV3@f9b6.saveHotKeyCache$1L$2L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error when save hot key cache, err = ");
        sbLIZ.append(obj);
        C20441214yg.LJ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("I18nCenterV3@f9b6.saveHotKeyCache$1L$2L");
    }

    public static final void accept$3(AfS131S0000000_3 afS131S0000000_3, Object obj) {
        C1C7U.LIZ("RoomTaskController@30d2.onCreate$1$accept$1L");
        C20441214yg.LIZ(String.valueOf(obj.getClass()));
        C1C7U.LIZIZ("RoomTaskController@30d2.onCreate$1$accept$1L");
    }

    public static final void accept$4(AfS131S0000000_3 afS131S0000000_3, Object obj) {
        C1C7U.LIZ("SysOptimizerTask@9bdb.tryFixSmEditTextLeak$1L");
        ((Boolean) obj).booleanValue();
        C1C7U.LIZIZ("SysOptimizerTask@9bdb.tryFixSmEditTextLeak$1L");
    }

    public static final void accept$5(AfS131S0000000_3 afS131S0000000_3, Object obj) {
        KeepWarmJobService keepWarmJobService;
        C606810Nr5 c606810Nr5 = (C606810Nr5) obj;
        WeakReference<KeepWarmJobService> weakReference = KeepWarmJobService.LLILZLL;
        if (weakReference != null && (keepWarmJobService = weakReference.get()) != null && keepWarmJobService.LLILLL != null && !c606810Nr5.LIZIZ) {
            keepWarmJobService.LIZIZ();
        }
    }

    public static final void accept$6(AfS131S0000000_3 afS131S0000000_3, Object obj) {
        C1C7U.LIZ("LowMemoryAppKillSelf@69e0.run$1L");
        if (((C606810Nr5) obj).LIZIZ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2469009lw.LJI = jCurrentTimeMillis;
            long j = C2469009lw.LJFF;
            if (j != 0) {
                C2469009lw.LIZIZ += (jCurrentTimeMillis - j) / 1000;
            }
            if (!C2469009lw.LIZ) {
                C2469009lw.LIZ = true;
                C2469109lx c2469109lx = new C2469109lx();
                C2469009lw.LIZLLL = c2469109lx;
                C2469009lw.LIZJ = (C11JF) C11NZ.LJJJJLI(((Number) C2469209ly.LIZLLL.getValue()).longValue(), TimeUnit.SECONDS).LJJLJLI(c2469109lx);
            }
        } else {
            C2469009lw.LJFF = System.currentTimeMillis();
            if (C2469009lw.LIZ) {
                C2469009lw.LIZ = false;
                C11JF c11jf = C2469009lw.LIZJ;
                C2469009lw.LIZJ = null;
                C2469009lw.LIZLLL = null;
                if (c11jf != null) {
                    c11jf.dispose();
                }
            }
        }
        C1C7U.LIZIZ("LowMemoryAppKillSelf@69e0.run$1L");
    }

    public static final void accept$7(AfS131S0000000_3 afS131S0000000_3, Object obj) {
        C1C7U.LIZ("LiveNtpUtil@2c5e.<init>$2L");
        C20441214yg.LJIIJ(6, "LiveNtpUtil", ((Throwable) obj).getStackTrace());
        C1C7U.LIZIZ("LiveNtpUtil@2c5e.<init>$2L");
    }
}
