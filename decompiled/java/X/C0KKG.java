package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KKG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KKG extends C0KKP implements C0KJL, C0IFW {
    public C0KMN LLILLL;

    @Override // X.C0IFW
    public final void W() {
    }

    @Override // X.C0IFW
    public final void pause() {
    }

    @Override // X.C0IFW
    public final void resume() {
    }

    @Override // X.C0KJL
    public final C0KKG LIZ() {
        C0KKD c0kkd = new C0KKD();
        C516200KMg c516200KMg = new C516200KMg();
        this.LL = c0kkd;
        this.LLILLJJLI = c516200KMg;
        return this;
    }

    @Override // X.C0KJL
    public final C0KKG LIZIZ() {
        this.LLILLL = new C0KMN();
        return this;
    }

    @Override // X.C0IFW
    public final void cancel() {
        AbstractC515830KKv<?> abstractC515830KKv = this.LL;
        if (abstractC515830KKv != null) {
            abstractC515830KKv.LJ();
        }
        AbstractC516450KNf<?> abstractC516450KNf = this.LLILLJJLI;
        if (abstractC516450KNf != null) {
            abstractC516450KNf.LJFF();
        }
    }

    public C0KKG() {
        ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerCrashCallback(new C1AQR() { // from class: X.0KMH
            @Override // X.C1AQR
            public final void LIZ() {
                if (Intrinsics.LJFF(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity().getClass().getSimpleName(), "ProxyBillingActivity")) {
                    C0KMK.LIZ.getClass();
                    Map<String, List<C0KML>> map = C0KMK.LIZIZ;
                    if (map != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
                        while (it2.hasNext()) {
                            C19719612Di.LJJI((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList);
                        }
                        ArrayList<C0KML> arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            C0KMJ c0kmj = ((C0KML) obj).LIZJ;
                            if (c0kmj == C0KMJ.CREATED || c0kmj == C0KMJ.IAP_STARTED) {
                                arrayList2.add(obj);
                            }
                        }
                        for (C0KML c0kml : arrayList2) {
                            C516010KLn c516010KLn = C516010KLn.LIZ;
                            String str = c0kml.LIZ;
                            Map mapLJ = C2097608Jq.LJ();
                            C0KM7 c0km7 = new C0KM7();
                            c516010KLn.getClass();
                            C516010KLn.LJII(null, str, -1L, 1001, 0, "", "", "normal_sub", "crash_callback", mapLJ, c0km7, 0, null);
                        }
                    }
                }
            }
        });
        ((HashSet) C0IH1.LIZ).add(this);
    }

    @Override // X.C0KJL
    public final void LIZJ(C0KJK c0kjk) {
        AbstractC516450KNf<?> abstractC516450KNf = this.LLILLJJLI;
        if (abstractC516450KNf != null) {
            abstractC516450KNf.LIZ = c0kjk;
            if (abstractC516450KNf.LIZLLL(true)) {
                abstractC516450KNf.LIZJ();
            }
        }
    }

    public static final Object LJFF(InterfaceC1364105Vn interfaceC1364105Vn, AwS373S0200000_7 awS373S0200000_7) {
        return C0KKY.LIZ.LIZIZ(interfaceC1364105Vn, awS373S0200000_7);
    }

    public final void LJI(C0KJX c0kjx, C0KJT c0kjt) {
        String idStr;
        C0KMN c0kmn = this.LLILLL;
        if (c0kmn != null) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            String str = "";
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            c0kmn.LIZIZ = idStr;
            C19EG c19egLJ = C500260Jjc.LJ(c0kjx.LJIIIZ);
            String str2 = c0kjx.LJIIL.get("show_entrance");
            if (str2 != null) {
                str = str2;
            }
            c0kmn.LIZ = str;
            if (c19egLJ != null) {
                C500260Jjc.LJJJJJ(c19egLJ, null, new C0KME(c0kjt, c0kmn, c19egLJ, c0kjx, null), 3);
            }
        }
    }
}
