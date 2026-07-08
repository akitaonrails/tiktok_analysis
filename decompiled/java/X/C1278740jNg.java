package X;

import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.params.SwitchParams;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jNg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278740jNg implements Handler.Callback {
    public final C1278870jNt LL;
    public final long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public final BPEAHandler LLILZIL;
    public final C1277590jLp LLILZLL;
    public final PushBase LLIZ;
    public final SwitchParams LLIZLLLIL;
    public final C1278910jNx LLJ;
    public final C1278770jNj LLJI;
    public final C1278200jMo LLJIJIL = new C1278200jMo();
    public long LLJILJIL = 0;

    public final void LIZ(JSONObject jSONObject) {
        int i;
        String tag = this.LLIZ.LJJIIZI.getTag();
        String tag2 = this.LLIZ.LJJIJ.getTag();
        String tag3 = this.LLIZ.LJJI.getTag();
        try {
            JSONObject jSONObjectPut = jSONObject.put("audio_codec", tag).put("audio_profile", tag2).put("video_codec", tag3).put("video_profile", this.LLIZ.LJJIIZ.getTag());
            if (this.LLIZ.useHardwareEncode) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObjectPut.put("hardware", i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f2  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZJ(X.C1278870jNt r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1278740jNg.LIZJ(X.0jNt):org.json.JSONObject");
    }

    public final void LIZLLL(boolean z) {
        Object obj;
        int i;
        Object obj2;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject.put("report_version", 5).put("product_line", "live").put("timestamp", jCurrentTimeMillis).put("mode", "push").put("project_key", this.LLILZLL.LIZIZ.LIZ);
            if (z) {
                this.LLJILJIL = jCurrentTimeMillis;
                jSONObject.put("event_key", "live_pusher_start");
            } else {
                jSONObject.put("event_key", "live_pusher_end");
                long j = this.LLJILJIL;
                if (j != 0) {
                    jSONObject.put("push_duration", jCurrentTimeMillis - j);
                }
                C1278770jNj c1278770jNj = this.LLJI;
                WeakReference<Object> weakReference = c1278770jNj.LIZJ.LJIIJJI;
                if (weakReference == null) {
                    obj = null;
                } else {
                    obj = weakReference.get();
                }
                C1278750jNh c1278750jNh = (C1278750jNh) obj;
                if (c1278750jNh != null) {
                    i = c1278750jNh.LJII;
                } else {
                    i = 0;
                }
                JSONObject jSONObjectPut = jSONObject.put("create_encode_count", i);
                WeakReference<Object> weakReference2 = c1278770jNj.LIZJ.LJIIJJI;
                if (weakReference2 == null) {
                    obj2 = null;
                } else {
                    obj2 = weakReference2.get();
                }
                jSONObjectPut.put("change_video_fps_count", 0);
            }
            C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS89S0200000_20(jSONObject, this, 3));
            if (!z && this.LLIZLLLIL.LJ) {
                AVLog.setupLogKibanaDevice(null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Create live core log error: ");
            sbLIZ.append(e);
            AVLog.ioe("VeLiveLogService", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        JSONObject jSONObjectLIZJ;
        int i = message.what;
        if (101 == i) {
            try {
                if (this.LL.LIZ(this.LLILZLL, this.LLJ) && (jSONObjectLIZJ = LIZJ(this.LL)) != null) {
                    this.LLJIJIL.LIZIZ(jSONObjectLIZJ);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.ioe("VeLiveLogService", "upload push_stream failed");
            }
            C786410Ut5.LJLJJI(101, this.LLILLJJLI, this.LLILZIL);
            return true;
        }
        if (103 == i) {
            try {
                if (this.LL.LIZ(this.LLILZLL, this.LLJ)) {
                    this.LLJIJIL.LIZJ(this.LL);
                    this.LLJ.LIZJ().LJ(this.LL);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C786410Ut5.LJLJJI(103, this.LLILLL, this.LLILZIL);
            return true;
        }
        return true;
    }

    public C1278740jNg(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        this.LLILZLL = c1277590jLp;
        LiveSdkSetting liveSdkSetting = c1277590jLp.LJI;
        PushBase pushBase = liveSdkSetting.mPushBase;
        this.LLIZ = pushBase;
        this.LLIZLLLIL = liveSdkSetting.switchParams;
        this.LLJ = c1278910jNx;
        c1278910jNx.getClass();
        c1278910jNx.LJI = new WeakReference<>(this);
        this.LLILZIL = new BPEAHandler(c1278910jNx.LIZ.getLooper(), this);
        long j = pushBase.LJJIZ;
        this.LLILLJJLI = j;
        this.LLILLJJLI = (j <= 1000 || j > 60000) ? Mp4ScreenVideoLoadTimeout.CONTROL : j;
        this.LLJI = new C1278770jNj(c1277590jLp, this, c1278910jNx);
        this.LL = new C1278870jNt();
        if (!AVLog.isLogKibanaDeviceSetFromExternal()) {
            AVLog.setupLogKibanaDevice(new C1278960jO2(this));
        }
        InterfaceC1279060jOC logKibanaDevice = AVLog.getLogKibanaDevice();
        if (logKibanaDevice instanceof C1278960jO2) {
            C1278960jO2 c1278960jO2 = (C1278960jO2) logKibanaDevice;
            c1278960jO2.getClass();
            c1278960jO2.LIZ = new WeakReference<>(this);
        }
    }

    public final JSONObject LIZIZ(JSONObject jSONObject, long j) {
        int i;
        String tag = this.LLIZ.LJJI.getTag();
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        JSONObject jSONObjectPut = jSONObject.put("product_line", "live").put("version", "2.0.0").put("live_sdk_version", AbstractC1277570jLn.getVersion()).put("report_version", 5).put("timestamp", j).put("mode", "push").put("project_key", this.LLILZLL.LIZIZ.LIZ).put("qId", this.LLIZ.LJJIL.toString()).put("video_codec", tag);
        if (this.LLIZ.useHardwareEncode) {
            i = 1;
        } else {
            i = 0;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("hardware", i);
        this.LLJI.LJJIIZI(jSONObjectPut2);
        return jSONObjectPut2;
    }

    public final void LJ(InterfaceC1278600jNS interfaceC1278600jNS, int i) {
        this.LLJIJIL.LIZ = interfaceC1278600jNS;
        if (i > 0 && i <= 60) {
            this.LLILLL = i * LSPassThroughRecordSizeConfig.DEFAULT;
        } else {
            this.LLILLL = this.LLILLJJLI;
        }
        this.LLILZIL.removeMessages(103);
        if (interfaceC1278600jNS != null) {
            C786410Ut5.LJLILLLLZI(this.LLILZIL, 103);
        }
    }
}
