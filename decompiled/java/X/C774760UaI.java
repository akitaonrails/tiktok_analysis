package X;

import Y.AfS181S0100000_12;
import com.bytedance.android.livesdk.livesetting.broadcast.FrameSignSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774760UaI {
    public static C11JF LIZ;
    public static C11JF LIZIZ;
    public static final Map<String, String> LIZJ = new LinkedHashMap();
    public static final IHostUser LIZLLL = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
    public static volatile int LJ = 1;

    public static void LIZIZ(long j) {
        Map<String, String> map = LIZJ;
        ((LinkedHashMap) map).clear();
        map.put("aid", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId()));
        map.put("uid", String.valueOf(UserService.getInstance().user().getCurrentUser().getId()));
        map.put("did", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId());
        map.put("roomid", String.valueOf(j));
    }

    public static void LIZJ(AbstractC1273900jFs abstractC1273900jFs) {
        if (FrameSignSetting.INSTANCE.isDisable() || abstractC1273900jFs == null) {
            return;
        }
        LIZIZ = (C11JF) C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.087Y
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<String> c09aj) {
                C1C7U.LIZ("FrameSignHelper@4381.signMetaData$1");
                Map<String, String> map = C774760UaI.LIZJ;
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                c09aj.onNext(C786410Ut5.J3(C774760UaI.LIZ(1, map)));
                C1C7U.LIZIZ("FrameSignHelper@4381.signMetaData$1");
            }
        }).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(abstractC1273900jFs, 283), new C09JN() { // from class: X.00om
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FrameSignHelper@4381.signMetaData$3");
                C20441214yg.LJII((Throwable) obj);
                C1C7U.LIZIZ("FrameSignHelper@4381.signMetaData$3");
            }
        });
    }

    public static void LIZLLL(AbstractC1273900jFs abstractC1273900jFs) {
        if (FrameSignSetting.INSTANCE.isDisable() || abstractC1273900jFs == null) {
            return;
        }
        LIZ = (C11JF) C11NZ.LJJJJJL(0L, 30L, TimeUnit.SECONDS).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.08Lb
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Map<String, String> map = C774760UaI.LIZJ;
                map.put("timestamp", String.valueOf(System.currentTimeMillis()));
                int i = C774760UaI.LJ;
                C774760UaI.LJ = i + 1;
                map.put("index", String.valueOf(i));
                return C774760UaI.LIZ(2, map);
            }
        }).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(abstractC1273900jFs, 284), new C09JN() { // from class: X.00on
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FrameSignHelper@4381.startSignSeiFrame$3");
                C20441214yg.LJII((Throwable) obj);
                C1C7U.LIZIZ("FrameSignHelper@4381.startSignSeiFrame$3");
            }
        });
    }

    public static JSONObject LJ(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.putOpt((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    public static JSONObject LIZ(int i, Map map) throws JSONException {
        Map<String, String> mapFrameSign = LIZLLL.frameSign(C786410Ut5.J3(LJ(map)), i);
        if (!mapFrameSign.isEmpty()) {
            return LJ(mapFrameSign);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("framtype", String.valueOf(i));
        jSONObject.putOpt("signversion", "999");
        jSONObject.putOpt("signinfo", LJ(map));
        jSONObject.putOpt("signvalue", "");
        return jSONObject;
    }
}
