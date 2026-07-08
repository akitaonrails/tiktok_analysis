package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.simplayer.TTNetClientApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ole, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1485800ole implements InterfaceC1469840oLu {
    public final TTNetClientApi LIZ;
    public final C11NJ LIZIZ = new C11NJ();
    public final InterfaceC2661011f LIZJ;

    @Override // X.InterfaceC1469840oLu
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC1469840oLu
    public final void cancel() {
        this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC1469840oLu
    public final String getHost() {
        return C844470XAv.LJIIIIZZ.LIZ;
    }

    public C1485800ole(InterfaceC2661011f interfaceC2661011f) {
        this.LIZJ = interfaceC2661011f;
        this.LIZ = (TTNetClientApi) interfaceC2661011f.create(TTNetClientApi.class);
    }

    public static List LJFF(Map map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (String str : map.keySet()) {
                arrayList.add(new C080U(str, (String) map.get(str)));
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1469840oLu
    public final Map<String, String> getRequestHeader(String str) throws JSONException {
        Map<String, String> mapLIZJ = C847400XMc.LIZJ(str);
        if (mapLIZJ != null && !mapLIZJ.isEmpty()) {
            try {
                mapLIZJ.put("cookie", C2204961BRm.LLIZ(C786410Ut5.A2(), C0CQT.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkiEBigVanPN9ju3QRqN53DOWLF9xpoI=", null)));
                return mapLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return mapLIZJ;
    }

    @Override // X.InterfaceC1469840oLu
    public final void LIZ(String str, InterfaceC1469850oLv interfaceC1469850oLv) {
        boolean zLJI = MethodIDManager.LJI(137769);
        LJ(str, null, null, 0, interfaceC1469850oLv);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1469840oLu
    public final void LIZJ(String str, Map<String, String> map, InterfaceC1469850oLv interfaceC1469850oLv) {
        boolean zLJI = MethodIDManager.LJI(137769);
        LJ(str, map, null, 0, interfaceC1469850oLv);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1469840oLu
    public final void LIZLLL(String str, Map<String, String> map, JSONObject jSONObject, int i, InterfaceC1469850oLv interfaceC1469850oLv) {
        boolean zLJI = MethodIDManager.LJI(137769);
        LJ(str, map, jSONObject, i, interfaceC1469850oLv);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJ(final String str, final Map<String, String> map, final JSONObject jSONObject, final int i, final InterfaceC1469850oLv interfaceC1469850oLv) {
        C11NJ c11nj = this.LIZIZ;
        C19476611Hw c19476611HwLJL = C11NZ.LJJJJI(new Callable<C1484660ojo>() { // from class: X.0old
            @Override // java.util.concurrent.Callable
            public final C1484660ojo call() {
                C1C7U.LIZ("SimNetClient@e367.doTask$2");
                C1484660ojo c1484660ojo = new C1484660ojo();
                try {
                    C0X52<String> c0x52Execute = (i != 1 ? this.LLILZIL.LIZ.get(str, C1485800ole.LJFF(map)) : this.LLILZIL.LIZ.post(str, C1485800ole.LJFF(map), jSONObject)).execute();
                    try {
                        c1484660ojo.LIZ = new JSONObject(c0x52Execute.LIZIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1484660ojo.LIZIZ = e;
                        c1484660ojo.LIZJ = -2;
                    }
                    if (c1484660ojo.LIZIZ == null && !c0x52Execute.LIZJ()) {
                        c1484660ojo.LIZIZ = new Exception("http fail");
                        c1484660ojo.LIZJ = c0x52Execute.LIZ.LIZIZ;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c1484660ojo.LIZIZ = e2;
                }
                C1C7U.LIZIZ("SimNetClient@e367.doTask$2");
                return c1484660ojo;
            }
        }).LJL(C11S5.LIZ());
        C11N2<C1484660ojo> c11n2 = new C11N2<C1484660ojo>() { // from class: X.0ojn
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                C1481110oe5.LIZ("ttnet doTask startTask onComplete");
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
                C1481110oe5.LJ("ttnet doTask startTask onError", th);
                interfaceC1469850oLv.LIZ(null, new C1472240oPm(-1, "", th));
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) {
                String strJ3;
                C1484660ojo c1484660ojo = (C1484660ojo) obj;
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ttnet doTask startTask onNext:");
                    JSONObject jSONObject2 = c1484660ojo.LIZ;
                    if (jSONObject2 != null) {
                        strJ3 = C786410Ut5.J3(jSONObject2);
                    } else {
                        strJ3 = "json null.";
                    }
                    sbLIZ.append(strJ3);
                    C1481110oe5.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (c1484660ojo.LIZIZ == null) {
                    interfaceC1469850oLv.LIZ(c1484660ojo.LIZ, null);
                } else {
                    interfaceC1469850oLv.LIZ(c1484660ojo.LIZ, new C1472240oPm(c1484660ojo.LIZJ, "", c1484660ojo.LIZIZ));
                }
            }
        };
        c19476611HwLJL.LIZIZ(c11n2);
        c11nj.LIZ(c11n2);
    }
}
