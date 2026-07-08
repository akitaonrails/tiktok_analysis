package Y;

import X.C098200Yq;
import X.C0VAW;
import X.C0VAX;
import X.C0VAY;
import X.C0VSP;
import X.C0VYZ;
import X.C0VZK;
import X.C0WPO;
import X.C0WPR;
import X.C0WPS;
import X.C0XAA;
import X.C0XAU;
import X.C0XAV;
import X.C0XAW;
import X.C1471660oOq;
import X.C189200o6;
import X.C197039127h;
import X.C1971107np;
import X.C19EG;
import X.C1C7U;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2206831BYr;
import X.C786410Ut5;
import X.C791650V3r;
import X.C793390VAj;
import X.C798090VSl;
import X.C799540VYa;
import X.C800370VaV;
import X.C808900VoG;
import X.C809030VoT;
import X.C809980Vq0;
import X.C810360Vqc;
import X.C810890VrT;
import X.C818590W9h;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.compliance.agegate.view.DatePickerBottomSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCPhoneStateListener;
import com.ss.bytertc.engine.RTCVideoInterface;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS32S0110000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout constraintLayout;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        RadiusLayout radiusLayout = ((SeaPdpCreatorSheetWidget) this.l0).LLJJIII;
        if (radiusLayout == null || (viewFindViewById = radiusLayout.findViewById(R.id.f86)) == null || viewFindViewById.getParent() == null) {
            return;
        }
        RadiusLayout radiusLayout2 = ((SeaPdpCreatorSheetWidget) this.l0).LLJJIII;
        if (radiusLayout2 != null && (viewFindViewById2 = radiusLayout2.findViewById(R.id.f86)) != null && (layoutParams = viewFindViewById2.getLayoutParams()) != null) {
            layoutParams.height = (!this.z1 || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((SeaPdpCreatorSheetWidget) this.l0).LLJJIJIIJIL) == null) ? -2 : sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getHeight();
            RadiusLayout radiusLayout3 = ((SeaPdpCreatorSheetWidget) this.l0).LLJJIII;
            if (radiusLayout3 != null && (constraintLayout = (ConstraintLayout) radiusLayout3.findViewById(R.id.f86)) != null) {
                C786410Ut5.m6(constraintLayout, layoutParams);
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = ((SeaPdpCreatorSheetWidget) this.l0).LLJJIJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, this.z1 ? 4 : 0);
        }
    }

    public final void LIZ$1() throws Throwable {
        long j;
        BufferedReader bufferedReader;
        C0VAW c0vaw = (C0VAW) this.l0;
        boolean z = this.z1;
        C0VAX c0vax = (C0VAX) c0vaw;
        c0vax.getClass();
        int iMyPid = Process.myPid();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/proc/");
                sbLIZ.append(iMyPid);
                sbLIZ.append("/stat");
                bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ))), LSPassThroughRecordSizeConfig.DEFAULT);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();
            String[] strArrSplit = line.split(" ");
            j = Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]);
            C1971107np.LIZ(bufferedReader);
        } catch (Exception e2) {
            e = e2;
            bufferedReader2 = bufferedReader;
            TryCatchGuardChecker.doCheck(e);
            C1971107np.LIZ(bufferedReader2);
            j = -1;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            TryCatchGuardChecker.doCheck(th);
            C1971107np.LIZ(bufferedReader2);
            throw th;
        }
        long j2 = j - c0vax.LIZJ;
        if (j2 > 0) {
            C0VAY.LIZ.LIZJ(new C793390VAj(System.currentTimeMillis(), j2, c0vax.LIZIZ, z));
            c0vax.LIZJ = j;
        }
    }

    public final void LIZ$2() {
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout constraintLayout;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        RadiusLayout radiusLayout = ((PdpCreatorSheetWidget) this.l0).LLJJIII;
        if (radiusLayout == null || (viewFindViewById = radiusLayout.findViewById(R.id.f86)) == null || viewFindViewById.getParent() == null) {
            return;
        }
        RadiusLayout radiusLayout2 = ((PdpCreatorSheetWidget) this.l0).LLJJIII;
        if (radiusLayout2 != null && (viewFindViewById2 = radiusLayout2.findViewById(R.id.f86)) != null && (layoutParams = viewFindViewById2.getLayoutParams()) != null) {
            layoutParams.height = (!this.z1 || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((PdpCreatorSheetWidget) this.l0).LLJJIJIIJIL) == null) ? -2 : sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getHeight();
            RadiusLayout radiusLayout3 = ((PdpCreatorSheetWidget) this.l0).LLJJIII;
            if (radiusLayout3 != null && (constraintLayout = (ConstraintLayout) radiusLayout3.findViewById(R.id.f86)) != null) {
                C786410Ut5.m6(constraintLayout, layoutParams);
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = ((PdpCreatorSheetWidget) this.l0).LLJJIJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, this.z1 ? 4 : 0);
        }
    }

    public static final void run$0(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PushInitializer@b651.setup$1");
        try {
            C810890VrT.LIZIZ.LJIIIZ("setup() calls pushCoreInitWhenConfigUpdate() in handler");
            C2206831BYr.LIZ.LJJIL(new C818590W9h()).LJJLJLI(new AfS182S0100000_13((Context) aRunnableS32S0110000_13.l0, 72));
            C810360Vqc.LIZ((Context) aRunnableS32S0110000_13.l0, aRunnableS32S0110000_13.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushInitializer@b651.setup$1");
    }

    public static final void run$1(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean z = aRunnableS32S0110000_13.z1;
        Context context = (Context) aRunnableS32S0110000_13.l0;
        C1C7U.LIZ("PushInitializer@b651.setup$1L");
        C810890VrT c810890VrT = C810890VrT.LIZIZ;
        c810890VrT.LJFF("initConfiguration_in_setup_execute_runnable");
        c810890VrT.LJIIL("initConfiguration_in_setup_execute_runnable");
        C809980Vq0.LIZ(context, z);
        c810890VrT.LJI("initConfiguration_in_setup_execute_runnable");
        c810890VrT.LJIIJJI("initConfiguration_in_setup_execute_runnable");
        c810890VrT.LJI("initConfiguration_in_setup_add_to_pending_jobs");
        c810890VrT.LJIIJJI("initConfiguration_in_setup_add_to_pending_jobs");
        C1C7U.LIZIZ("PushInitializer@b651.setup$1L");
    }

    public static final void run$10(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean z = aRunnableS32S0110000_13.z1;
        Fragment fragment = (Fragment) aRunnableS32S0110000_13.l0;
        C1C7U.LIZ("FragmentManagerLancet@61e.findFragmentForVisibleHint$1L");
        C0XAU.LIZ(new ARunnableS32S0110000_13(fragment, z, 11));
        C1C7U.LIZIZ("FragmentManagerLancet@61e.findFragmentForVisibleHint$1L");
    }

    public static final void run$11(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        C0XAW c0xaw;
        C19EG activity;
        boolean z = aRunnableS32S0110000_13.z1;
        Fragment fragmentLIZ = (Fragment) aRunnableS32S0110000_13.l0;
        C1C7U.LIZ("FragmentManagerLancet@61e.findFragmentForVisibleHint$1L$1L");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C0XAA.LIZIZ && (c0xaw = C0XAA.LIZJ) != null) {
            if (z && (activity = fragmentLIZ.getActivity()) != null && activity.getSupportFragmentManager() != null && (activity.getSupportFragmentManager() == null || (fragmentLIZ = C0XAV.LIZ(activity.getSupportFragmentManager().LJJLIIIJL())) != null)) {
                c0xaw.LIZ(fragmentLIZ.getActivity(), fragmentLIZ);
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FragmentManagerLancet#setUserVisibleHint cost: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
            C1C7U.LIZIZ("FragmentManagerLancet@61e.findFragmentForVisibleHint$1L$1L");
            return;
        }
        C1C7U.LIZIZ("FragmentManagerLancet@61e.findFragmentForVisibleHint$1L$1L");
    }

    public static final void run$12(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("DatePickerBottomSheetFragment@a610.setNextButtonEnabled$1");
        try {
            C197039127h c197039127hOR = ((DatePickerBottomSheetFragment) aRunnableS32S0110000_13.l0).OR();
            if (c197039127hOR != null) {
                c197039127hOR.setEnabled(aRunnableS32S0110000_13.z1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DatePickerBottomSheetFragment@a610.setNextButtonEnabled$1");
    }

    public static final void run$13(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("DatePickerBottomSheetFragment@a610.setNextButtonLoading$1");
        try {
            C197039127h c197039127hOR = ((DatePickerBottomSheetFragment) aRunnableS32S0110000_13.l0).OR();
            if (c197039127hOR != null) {
                c197039127hOR.setLoading(aRunnableS32S0110000_13.z1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DatePickerBottomSheetFragment@a610.setNextButtonLoading$1");
    }

    public static final void run$14(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        Object c098200Yq;
        boolean z = aRunnableS32S0110000_13.z1;
        JSONObject jSONObject = (JSONObject) aRunnableS32S0110000_13.l0;
        C1C7U.LIZ("MonitorNavigationInterceptor$Companion@18b9.reportInternal$1L");
        C799540VYa c799540VYa = new C799540VYa(z, false, 2);
        for (C0VYZ c0vyz : C800370VaV.LJFF) {
            try {
                c0vyz.LIZ(jSONObject, c799540VYa);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C0VZK.LIZ(thM5exceptionOrNullimpl, "webview_monitor_report_to_sink_error", C2097608Jq.LJIIJ(new Pair("message", "webview_monitor_report_to_sink_error"), new Pair("monitor", c0vyz.getClass().getSimpleName())));
            }
        }
        C1C7U.LIZIZ("MonitorNavigationInterceptor$Companion@18b9.reportInternal$1L");
    }

    public static final void run$2(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("SeaPdpCreatorSheetWidget@d61b.changeCreatorModelHeight$1");
        try {
            aRunnableS32S0110000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaPdpCreatorSheetWidget@d61b.changeCreatorModelHeight$1");
    }

    public static final void run$3(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("AbsBatteryValueStats@c6e3.asyncRecord$1");
        try {
            aRunnableS32S0110000_13.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsBatteryValueStats@c6e3.asyncRecord$1");
    }

    public static final void run$4(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("NewTrafficStatisticsImpl@fc1.onStatusChange$1");
        try {
            ((C798090VSl) aRunnableS32S0110000_13.l0).LJIIJ();
            ((C798090VSl) aRunnableS32S0110000_13.l0).LJIIIIZZ = !aRunnableS32S0110000_13.z1;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewTrafficStatisticsImpl@fc1.onStatusChange$1");
    }

    public static final void run$5(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("SocketHookTrafficStatisticsImpl@12fc.onStatusChange$1");
        try {
            ((C791650V3r) aRunnableS32S0110000_13.l0).LJIIIIZZ(aRunnableS32S0110000_13.z1);
            ((C791650V3r) aRunnableS32S0110000_13.l0).LIZJ = aRunnableS32S0110000_13.z1;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocketHookTrafficStatisticsImpl@12fc.onStatusChange$1");
    }

    public static final void run$6(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean z = aRunnableS32S0110000_13.z1;
        JSONObject jSONObject = (JSONObject) aRunnableS32S0110000_13.l0;
        C1C7U.LIZ("AsyncGetLogDataRunnable@f222.com_ss_ttvideoengine_log_AsyncGetLogDataRunnable__run$___twin___$2L");
        C0WPS c0wps = C0WPS.instance;
        c0wps.getClass();
        synchronized (C0WPS.class) {
            try {
                if (jSONObject != null) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("addEvent  uploadLog = ");
                    sbLIZ.append(z);
                    TTVideoEngineLog.d("VideoEventManager", C2188811AlT.LIZIZ(sbLIZ));
                    C0WPR c0wpr = c0wps.LLILZ;
                    if (c0wpr != null) {
                        ((C0WPO) c0wpr).LIZIZ("video_playq", jSONObject);
                    } else {
                        if (c0wps.LL != null) {
                            c0wps.LLILLJJLI.put(jSONObject);
                            c0wps.LL.onEvent();
                        } else {
                            C1471660oOq.LIZIZ("VideoEventManager", "no listener set");
                        }
                        EngineThreadPool.addExecuteTask(new ARunnableS113S0100000_13(jSONObject, 223));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("AsyncGetLogDataRunnable@f222.com_ss_ttvideoengine_log_AsyncGetLogDataRunnable__run$___twin___$2L");
    }

    public static final void run$7(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("SenderService@9bf8.tryUpdateSender$1");
        try {
            C809030VoT c809030VoT = C809030VoT.LJIIJ;
            c809030VoT.LIZJ("tryUpdateSender_run");
            c809030VoT.LIZ("tryUpdateSender_run");
            ((C808900VoG) aRunnableS32S0110000_13.l0).LIZIZ.LIZJ(aRunnableS32S0110000_13.z1);
            c809030VoT.LJ("tryUpdateSender_run");
            c809030VoT.LIZLLL("tryUpdateSender_run");
            c809030VoT.LJ("tryUpdateSender_submitRunnable");
            c809030VoT.LIZLLL("tryUpdateSender_submitRunnable");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SenderService@9bf8.tryUpdateSender$1");
    }

    public static final void run$8(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PdpCreatorSheetWidget@3a80.changeCreatorModelHeight$1");
        try {
            aRunnableS32S0110000_13.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpCreatorSheetWidget@3a80.changeCreatorModelHeight$1");
    }

    public static final void run$9(ARunnableS32S0110000_13 aRunnableS32S0110000_13) {
        boolean zLIZ;
        AudioRoute audioRoute;
        C1C7U.LIZ("RTCPhoneStateListener@937f.onCallEnd$2");
        try {
            RTCVideoInterface rTCVideoInterface = ((RTCPhoneStateListener) aRunnableS32S0110000_13.l0).LIZJ;
            if (aRunnableS32S0110000_13.z1) {
                audioRoute = AudioRoute.AUDIO_ROUTE_SPEAKERPHONE;
            } else {
                audioRoute = AudioRoute.AUDIO_ROUTE_EARPIECE;
            }
            rTCVideoInterface.setDefaultAudioRoute(audioRoute);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RTCPhoneStateListener@937f.onCallEnd$2");
    }

    public ARunnableS32S0110000_13(Context context, boolean z, int i) {
        this.$t = i;
        if (i != 0) {
            this.z1 = z;
            this.l0 = context;
        } else {
            this.l0 = context;
            this.z1 = z;
        }
    }

    public ARunnableS32S0110000_13(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
