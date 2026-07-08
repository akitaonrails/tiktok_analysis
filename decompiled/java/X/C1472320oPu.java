package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472320oPu extends C1469760oLm {
    public static WeakReference<InterfaceC1472490oQB> LLILZ;
    public static final C1472330oPv LLILZIL = new C0WPT() { // from class: X.0oPv
        @Override // X.C0WPT
        public final void onEvent() {
            InterfaceC1472490oQB interfaceC1472490oQB;
            WeakReference<InterfaceC1472490oQB> weakReference = C1472320oPu.LLILZ;
            if (weakReference != null && (interfaceC1472490oQB = weakReference.get()) != null) {
                interfaceC1472490oQB.onEvent(C0WPS.instance.popAllEvents());
            } else if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("video_playq", "eventListener null");
            }
        }

        @Override // X.C0WPT
        public void onEventV2(String str) {
            JSONArray jSONArrayPopAllEventsV2;
            InterfaceC1472490oQB interfaceC1472490oQB;
            if (!TextUtils.isEmpty(str) && C1480850odf.LIZJ.isEnablePlayerLogV2() && (jSONArrayPopAllEventsV2 = C0WPS.instance.popAllEventsV2()) != null && jSONArrayPopAllEventsV2.length() > 0) {
                for (int i = 0; i < jSONArrayPopAllEventsV2.length(); i++) {
                    try {
                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArrayPopAllEventsV2, i);
                        if (jSONObject != null) {
                            jSONObject.put("params_for_special", "videoplayer_monitor");
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                WeakReference<InterfaceC1472490oQB> weakReference = C1472320oPu.LLILZ;
                if (weakReference != null && (interfaceC1472490oQB = weakReference.get()) != null) {
                    interfaceC1472490oQB.LIZ(str, jSONArrayPopAllEventsV2);
                }
            }
        }
    };
    public InterfaceC1472490oQB LLILLL;

    public C1472320oPu(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
    }
}
