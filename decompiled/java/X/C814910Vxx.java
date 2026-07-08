package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Vxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814910Vxx implements Serializable {
    public static final int $stable = 8;
    public final boolean LL = ((Boolean) C265570Aax.LIZ.getValue()).booleanValue();
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public final long LLILZ = System.currentTimeMillis();
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public long LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public long LLJJJ;
    public long LLJJJIL;

    @InterfaceC1294060jmO
    public final void onDownloadImageSuccess() {
    }

    public final void endDmCheckReadPhase() {
        if (this.LL) {
            this.LLJILJIL = System.currentTimeMillis();
        }
    }

    public final void endDownloadCommonImagePhase() {
        if (this.LL) {
            this.LLJILLL = System.currentTimeMillis();
        }
    }

    public final void endDownloadLargeModeImagePhase() {
        if (this.LL) {
            this.LLJJI = System.currentTimeMillis();
        }
    }

    public final void endIntelligencePhase() {
        if (this.LL) {
            this.LLIZLLLIL = System.currentTimeMillis();
        }
    }

    public final void endPermissionRequestPhase() {
        if (this.LL) {
            this.LLJJJ = System.currentTimeMillis();
        }
    }

    public final void endRevokePhase() {
        if (this.LL) {
            this.LLILZLL = System.currentTimeMillis();
        }
    }

    public final void endShowNotificationInnerPhase() {
        if (this.LL) {
            this.LLJJIJIIJIL = System.currentTimeMillis();
        }
    }

    public final void endTaskCallPhase() {
        if (this.LL) {
            this.LLJI = System.currentTimeMillis();
        }
    }

    @InterfaceC1294060jmO
    public final void onDmCheckRead() {
        if (this.LL) {
            this.LLJILJIL = System.currentTimeMillis();
        }
    }

    @InterfaceC1294060jmO
    public final void onDownloadCommonImageFinish() {
        if (this.LL) {
            this.LLJILLL = System.currentTimeMillis();
        }
    }

    public final void onDownloadImageFail() {
        if (this.LL) {
            this.LLJJIII = System.currentTimeMillis();
        }
    }

    @InterfaceC1294060jmO
    public final void onDownloadLargeModeImageFinish() {
        if (this.LL) {
            this.LLJJI = System.currentTimeMillis();
        }
    }

    @InterfaceC1294060jmO
    public final void onIntelligenceCallback() {
        if (this.LL) {
            this.LLIZLLLIL = System.currentTimeMillis();
        }
    }

    @InterfaceC1294060jmO
    public final void onPermissionGranted() {
        if (this.LL) {
            this.LLJJJ = System.currentTimeMillis();
        }
    }

    @InterfaceC1294060jmO
    public final void onProxyShowWithNotification() {
        if (this.LL) {
            this.LLJ = System.currentTimeMillis();
        }
    }

    public final void onRealNotify() {
        if (this.LL) {
            this.LLJJJIL = System.currentTimeMillis();
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("push_label", this.LLILLJJLI), new Pair("dm_msg_type", this.LLILLL), new Pair("total_latency", String.valueOf(this.LLJJJIL - this.LLILZ)));
            LIZ(mapLJIIJ, "revoke_latency", this.LLILZIL, this.LLILZLL, this.LLILZ);
            LIZ(mapLJIIJ, "intelligence_latency", this.LLIZ, this.LLIZLLLIL, this.LLILZLL);
            long j = this.LLJ;
            long j2 = this.LLJI;
            getClass();
            LIZ(mapLJIIJ, "task_call_latency", j, j2, 0L);
            long j3 = this.LLJIJIL;
            long j4 = this.LLJILJIL;
            getClass();
            LIZ(mapLJIIJ, "dm_check_read_latency", j3, j4, 0L);
            long j5 = this.LLJILJILJ;
            long j6 = this.LLJILLL;
            getClass();
            LIZ(mapLJIIJ, "download_common_image_latency", j5, j6, 0L);
            long j7 = this.LLJJ;
            long j8 = this.LLJJI;
            getClass();
            LIZ(mapLJIIJ, "download_large_mode_image_latency", j7, j8, 0L);
            long jMin = this.LLJILJILJ;
            long j9 = this.LLJJ;
            if (jMin > 0) {
                if (j9 > 0) {
                    jMin = Math.min(jMin, j9);
                }
                j9 = jMin;
            } else if (j9 <= 0) {
                j9 = 0;
            }
            long jMax = Math.max(this.LLJILLL, Math.max(this.LLJJI, this.LLJJIII));
            getClass();
            LIZ(mapLJIIJ, "download_image_total_latency", j9, jMax, 0L);
            long j10 = this.LLJJIJI;
            long j11 = this.LLJJIJIIJIL;
            getClass();
            LIZ(mapLJIIJ, "show_notification_inner_latency", j10, j11, 0L);
            long j12 = this.LLJJIJIL;
            long j13 = this.LLJJJ;
            getClass();
            LIZ(mapLJIIJ, "permission_request_latency", j12, j13, 0L);
            long jMax2 = Math.max(this.LLJJIJIIJIL, this.LLJJJ);
            if (jMax2 > 0) {
                long j14 = this.LLJJJIL;
                if (j14 > 0) {
                    mapLJIIJ.put("real_notify_latency", String.valueOf(j14 - jMax2));
                }
            }
            C20684815ws.LJIILLIIL("out_push_handle_latency", mapLJIIJ);
        }
    }

    @InterfaceC1294060jmO
    public final void onRequestPermission() {
        if (this.LL) {
            this.LLJJIJIL = System.currentTimeMillis();
        }
    }

    @InterfaceC1294060jmO
    public final void onRevoke() {
        if (this.LL) {
            this.LLILZLL = System.currentTimeMillis();
        }
    }

    @InterfaceC1294060jmO
    public final void onShowNotificationInner() {
        if (this.LL) {
            this.LLJJIJI = System.currentTimeMillis();
        }
    }

    @InterfaceC1294060jmO
    public final void onTaskCall() {
        if (this.LL) {
            this.LLJI = System.currentTimeMillis();
        }
    }

    public final void startDmCheckReadPhase() {
        if (this.LL) {
            this.LLJIJIL = System.currentTimeMillis();
        }
    }

    public final void startDownloadCommonImagePhase() {
        if (this.LL) {
            this.LLJILJILJ = System.currentTimeMillis();
        }
    }

    public final void startDownloadLargeModeImagePhase() {
        if (this.LL) {
            this.LLJJ = System.currentTimeMillis();
        }
    }

    public final void startIntelligencePhase() {
        if (this.LL) {
            this.LLIZ = System.currentTimeMillis();
        }
    }

    public final void startPermissionRequestPhase() {
        if (this.LL) {
            this.LLJJIJIL = System.currentTimeMillis();
        }
    }

    public final void startRevokePhase() {
        if (this.LL) {
            this.LLILZIL = System.currentTimeMillis();
        }
    }

    public final void startShowNotificationInnerPhase() {
        if (this.LL) {
            this.LLJJIJI = System.currentTimeMillis();
        }
    }

    public final void startTaskCallPhase() {
        if (this.LL) {
            this.LLJ = System.currentTimeMillis();
        }
    }

    public final String getPushLabel() {
        return this.LLILLJJLI;
    }

    public final void setUpPushLabel(String str) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (!this.LL || str.length() == 0 || (uri = UriProtector.parse(str)) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label")) == null) {
            return;
        }
        this.LLILLJJLI = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "msg_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        this.LLILLL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
    }

    public static void LIZ(Map map, String str, long j, long j2, long j3) {
        if (j <= 0) {
            j = j3;
        }
        if (j > 0 && j2 > 0) {
            long j4 = j2 - j;
            if (j4 >= 0) {
                map.put(str, String.valueOf(j4));
            }
        }
    }
}
