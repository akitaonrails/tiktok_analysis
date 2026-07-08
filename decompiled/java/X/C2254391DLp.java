package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDuetSettings;
import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.proxy.TEDuetProxy;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: renamed from: X.1DLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254391DLp implements InterfaceC2253811DJj {
    public final VERecorder LIZ;

    @Override // X.InterfaceC2253811DJj
    public final void LIZ() {
        this.LIZ.LIZIZ(VERecordMode.DUET);
    }

    @Override // X.InterfaceC2253811DJj
    public final void LIZJ() {
        this.LIZ.LIZIZ.getClass();
        C2484209oO.LIZJ("TERecorder", "setEnableDuetV2 is not supported");
    }

    public C2254391DLp(VERecorder vERecorder) {
        this.LIZ = vERecorder;
    }

    @Override // X.InterfaceC2253811DJj
    public final void LIZIZ(Runnable runnable) {
        k kVar = this.LIZ.LIZIZ;
        synchronized (kVar.LJL) {
            try {
                C1DMH c1dmh = kVar.LJJZZIII;
                if (c1dmh != null && (c1dmh instanceof TEDuetProxy)) {
                    ((TEDuetProxy) c1dmh).LJIIIIZZ(runnable);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2253811DJj
    public final void LIZLLL(String str, String str2, boolean z) {
        String str3 = str2;
        VERecorder vERecorder = this.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        VEDuetSettings vEDuetSettings = new VEDuetSettings(str, str3, 0.0f, 0.16f, 0.6f, z);
        k kVar = vERecorder.LIZIZ;
        kVar.LJIIJ = vEDuetSettings;
        if (kVar.LJJJJ.LJFF == 0) {
            kVar.LJIIJJI = VERecordMode.DUET;
        }
        kVar.LJJJ.LJIJJLI("FocusSingleAudioTrack", true);
        synchronized (kVar.LJL) {
            try {
                C1DMH c1dmh = kVar.LJJZZIII;
                if (c1dmh != null && !(c1dmh instanceof TEDuetProxy)) {
                    c1dmh.onDestroy();
                    kVar.LJJZZIII = null;
                }
                kVar.LJJIZ.LJIJI(false);
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(vEDuetSettings.toString());
            if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
                b.LIZIZ("vesdk_event_recorder_init_duet", "business", jSONObject, true);
            }
        } catch (JSONException e) {
        }
    }
}
