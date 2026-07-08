package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0o81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461230o81 {
    public static final C1461230o81 LIZ = new C1461230o81();
    public static volatile boolean LIZIZ = true;
    public static final List<Integer> LIZJ = new ArrayList();
    public static final List<Integer> LIZLLL = new ArrayList();
    public static final C0V0D LJ = new BroadcastReceiver() { // from class: X.0V0D
        public static void LIZ() {
            if (C1461230o81.LIZIZ) {
                return;
            }
            int iLIZLLL = C2179771ASp.LIZLLL();
            List<Integer> list = C1461230o81.LIZJ;
            Integer num = (Integer) C13LP.LJJLIIIJL(list);
            if (num == null || iLIZLLL != num.intValue()) {
                ((ArrayList) list).add(Integer.valueOf(iLIZLLL));
            }
            int iLIZ = C2179771ASp.LIZ();
            List<Integer> list2 = C1461230o81.LIZLLL;
            Integer num2 = (Integer) C13LP.LJJLIIIJL(list2);
            if (num2 == null || iLIZ != num2.intValue()) {
                ((ArrayList) list2).add(Integer.valueOf(iLIZ));
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                LIZ();
            } else {
                C2408409cA.LIZ();
                LIZ();
            }
        }
    };

    public static void LIZJ() {
        if (C291380BbU.LIZ()) {
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            LIZIZ = false;
            try {
                C786410Ut5.LJIJJ(C0CHQ.LIZ, LJ, intentFilter);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZLLL() {
        if (C291380BbU.LIZ()) {
            LIZIZ = true;
            try {
                C786410Ut5.LJJIFFI(C0CHQ.LIZ, LJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            ((ArrayList) LIZJ).clear();
            ((ArrayList) LIZLLL).clear();
        }
    }

    public static void LIZ(INLEMediaSession iNLEMediaSession, boolean z) {
        if (!C291380BbU.LIZ()) {
            return;
        }
        iNLEMediaSession.getMetricsApi().enableAudioGlitchMetrics(z);
        C346630DiP.LIZ().getModel().getTracks().size();
    }

    public static void LIZIZ(int i, long j, String str, C1461270o85 c1461270o85, C1461270o85 c1461270o852, CreativeModel creativeModel, int i2, String str2, String str3, String str4) {
        Object objValueOf;
        int i3;
        int i4;
        int i5;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, "calling_event_index");
        c0lab.LJ("creation_id", str);
        C0CHQ.LIZ().getApplicationService().getClass();
        c0lab.LJ("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        c0lab.LJ("item_id", str2);
        c0lab.LJ("user_id", C0CHQ.LIZ().getAccountService().getCurrentUserID());
        c0lab.LIZIZ(j, "calling_event_ts");
        c0lab.LIZ(c1461270o85.LIZJ, "channels_playback");
        c0lab.LIZ(c1461270o85.LIZIZ, "playback_sample_rate");
        c0lab.LIZIZ(c1461270o85.LIZLLL, "duration_playback");
        c0lab.LIZ(c1461270o85.LIZ, "glitch_cnt_playback");
        long j2 = c1461270o85.LIZLLL;
        int i6 = 0;
        Object objValueOf2 = 0;
        if (j2 > 0) {
            objValueOf = Float.valueOf(((c1461270o85.LIZ * 1.0f) / j2) * 1000.0f);
        } else {
            objValueOf = objValueOf2;
        }
        c0lab.LIZLLL(objValueOf, "glitch_rate_playback");
        c0lab.LIZ(c1461270o852.LIZJ, "channels_recording");
        c0lab.LIZ(c1461270o852.LIZIZ, "recording_sample_rate");
        c0lab.LIZIZ(c1461270o852.LIZLLL, "duration_recording");
        c0lab.LIZ(c1461270o852.LIZ, "glitch_cnt_recording");
        long j3 = c1461270o852.LIZLLL;
        if (j3 > 0) {
            objValueOf2 = Float.valueOf(((c1461270o852.LIZ * 1.0f) / j3) * 1000.0f);
        }
        c0lab.LIZLLL(objValueOf2, "glitch_rate_recording");
        c0lab.LJ("mv_id", str3);
        c0lab.LJ("sticker_id", str4);
        c0lab.LIZ(C2179771ASp.LIZLLL(), "audio_route_playback");
        c0lab.LIZ(C2179771ASp.LIZ(), "audio_route_recording");
        c0lab.LIZLLL(LIZJ, "audio_route_change_list_playback");
        c0lab.LIZLLL(LIZLLL, "audio_route_change_list_recording");
        c0lab.LIZ(i2, "track_num");
        if (creativeModel.audioAlgorithmModel.isAECOn) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c0lab.LIZ(i3, "aec_on");
        if (creativeModel.audioAlgorithmModel.isLoudnessOn) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c0lab.LIZ(i4, "loudness_on");
        if (creativeModel.audioAlgorithmModel.isLoudnessCheckOn) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        c0lab.LIZ(i5, "loudness_check_on");
        if (creativeModel.audioAlgorithmModel.isDenoiseOn) {
            i6 = 1;
        }
        c0lab.LIZ(i6, "denoise_on");
        C20684815ws.LJIILLIIL("audio_glitch", c0lab.LIZ);
    }
}
