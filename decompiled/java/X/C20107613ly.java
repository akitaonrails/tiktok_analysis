package X;

import Y.ARunnableS130S0100000_30;
import Y.ARunnableS63S0300000_30;
import Y.ARunnableS99S0200000_30;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13ly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20107613ly extends AbstractC1064500do8 {
    public static final CopyOnWriteArraySet<InterfaceC20108113m3> LIZIZ = new CopyOnWriteArraySet<>();
    public static final C20107513lx LIZJ = new InterfaceC20108113m3() { // from class: X.13lx
        @Override // X.InterfaceC20108113m3
        public final void LIZ(JSONObject jSONObject) {
            System.out.println((Object) "request success");
        }

        @Override // X.InterfaceC20108113m3
        public final void onFailed(Throwable th) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request failed message = ");
            sbLIZ.append(th.getMessage());
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    @Override // X.InterfaceC1063690dmp
    public final String getName() {
        return "__prefetch";
    }

    @Override // X.InterfaceC1063690dmp
    public final void LIZIZ(final InterfaceC1107590evd interfaceC1107590evd, final InterfaceC1063920dnC interfaceC1063920dnC, EnumC1059790dgX enumC1059790dgX) {
        C20108313m5 c20108313m5 = new C20108313m5() { // from class: X.13m4
            @Override // X.C20108313m5, X.InterfaceC20108113m3
            public final void LIZ(JSONObject jSONObject) throws JSONException {
                C20107613ly c20107613ly = this.LIZ;
                InterfaceC1063920dnC interfaceC1063920dnC2 = interfaceC1063920dnC;
                C2095708Ix c2095708Ix = new C2095708Ix(jSONObject);
                c20107613ly.getClass();
                AbstractC1064500do8.LJ(interfaceC1063920dnC2, "", c2095708Ix);
                C20107613ly.LIZIZ.remove(this);
                C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_prefetch_data");
                JSONObject jSONObject2 = new JSONObject();
                InterfaceC1107590evd interfaceC1107590evd2 = interfaceC1107590evd;
                jSONObject2.put("prefetch_state", "success");
                jSONObject2.put("prefetch_cached", jSONObject.optInt("cached"));
                jSONObject2.put("prefetch_api", C1871910yoP.LJFF(interfaceC1107590evd2, "url", ""));
                c1520360pfO.LIZLLL = jSONObject2;
                C1520080pew.LIZ(null, c1520360pfO.LIZ());
            }

            @Override // X.C20108313m5, X.InterfaceC20108113m3
            public final void onFailed(Throwable th) throws JSONException {
                String message;
                C20107613ly c20107613ly = this.LIZ;
                InterfaceC1063920dnC interfaceC1063920dnC2 = interfaceC1063920dnC;
                if (th.getMessage() == null) {
                    message = "";
                } else {
                    message = th.getMessage();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c20107613ly.getClass();
                AbstractC1064500do8.LIZJ(interfaceC1063920dnC2, 4, message, linkedHashMap);
                C20107613ly.LIZIZ.remove(this);
                C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_prefetch_data");
                JSONObject jSONObject = new JSONObject();
                InterfaceC1107590evd interfaceC1107590evd2 = interfaceC1107590evd;
                jSONObject.put("prefetch_state", "fail");
                jSONObject.put("prefetch_error", th.getMessage());
                jSONObject.put("prefetch_api", C1871910yoP.LJFF(interfaceC1107590evd2, "url", ""));
                c1520360pfO.LIZLLL = jSONObject;
                C1520080pew.LIZ(null, c1520360pfO.LIZ());
            }
        };
        ARunnableS63S0300000_30 aRunnableS63S0300000_30 = new ARunnableS63S0300000_30(new ARunnableS99S0200000_30(c20108313m5, interfaceC1107590evd, 1), interfaceC1107590evd, c20108313m5, 1);
        Executor executor = C1540210qBP.LIZIZ;
        if (executor != null) {
            executor.execute(new ARunnableS130S0100000_30(aRunnableS63S0300000_30, 11));
        } else {
            aRunnableS63S0300000_30.run();
        }
    }
}
