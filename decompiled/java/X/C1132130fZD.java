package X;

import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.livesetting.clientai.LiveGiftPanelPredictOpenSettings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132130fZD {
    public static final C1132130fZD LIZ = new C1132130fZD();

    public static final C11KS LIZ(final long j, final long j2) {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0fZE
            public final /* synthetic */ String LLILLL = "enter_room_30s";

            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Long> interfaceC2329309At) throws JSONException {
                InterfaceC964460bCm interfaceC964460bCmLJIIL = LivePitayaEnv.LJIIL();
                LiveGiftPanelPredictOpenSettings liveGiftPanelPredictOpenSettings = LiveGiftPanelPredictOpenSettings.INSTANCE;
                String strAlgoPkgName = liveGiftPanelPredictOpenSettings.algoPkgName();
                JSONObject jSONObject = new JSONObject();
                long j3 = j;
                long j4 = j2;
                String str = this.LLILLL;
                jSONObject.put("room_id", j3);
                jSONObject.put("anchor_id", j4);
                jSONObject.put("trigger_type", str);
                jSONObject.put("is_training", liveGiftPanelPredictOpenSettings.isTraining());
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                ((C1ATJ) interfaceC964460bCmLJIIL).LIZJ(new C1ATK(strAlgoPkgName, new C1132380fZc(false, jSONObject), new InterfaceC2179811ASt() { // from class: X.0fZF
                    @Override // X.InterfaceC2179811ASt
                    public final void LIZ(C21406118pv c21406118pv) {
                        InterfaceC2329309At<Long> interfaceC2329309At2 = c11kt;
                        long jDefaultPredictTimeSec = LiveGiftPanelPredictOpenSettings.INSTANCE.defaultPredictTimeSec();
                        if (c21406118pv.LIZ()) {
                            JSONObject jSONObject2 = c21406118pv.LIZIZ;
                            if (jSONObject2 != null) {
                                jDefaultPredictTimeSec = jSONObject2.optLong("time", jDefaultPredictTimeSec);
                            }
                            interfaceC2329309At2.onSuccess(Long.valueOf(jDefaultPredictTimeSec));
                            return;
                        }
                        interfaceC2329309At2.onError(new Exception(String.valueOf(c21406118pv)));
                    }
                }, null, 24));
            }
        });
    }
}
