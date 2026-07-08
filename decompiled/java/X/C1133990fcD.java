package X;

import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS226S0300000_17;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133990fcD {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(boolean z, List list, C1135810ff9 c1135810ff9) {
        IDebugService iDebugService;
        boolean z2;
        String str;
        Map<String, String> mapLJ;
        InterfaceC1100860ekm interfaceC1100860ekmSg;
        boolean z3 = false;
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || (iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class)) == null || iDebugService.Sg() == null) {
            return false;
        }
        synchronized (C1133980fcC.LJ) {
            try {
                if (C1133980fcC.LIZIZ != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!z2) {
            return false;
        }
        C1515210pX5.LIZLLL().getClass();
        C0IMD c0imdLJI = C1515210pX5.LJI(GiftMessage.class);
        C1515210pX5.LIZLLL().getClass();
        InterfaceC1132110fZB interfaceC1132110fZBLJII = C1515210pX5.LJII(GiftMessage.class);
        C1496690p3D c1496690p3D = new C1496690p3D();
        C1148820g08 c1148820g08 = null;
        if (interfaceC1132110fZBLJII == null || c0imdLJI == null) {
            return false;
        }
        AwS226S0300000_17 awS226S0300000_17 = new AwS226S0300000_17(interfaceC1132110fZBLJII, (InterfaceC1132110fZB<GiftMessage>) c0imdLJI, (C0IMD<GiftMessage>) c1496690p3D, (C1496690p3D) 20);
        if (z) {
            str = "selfQueue";
        } else {
            str = "outerQueue";
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(awS226S0300000_17.invoke(it2.next()));
        }
        if (c1135810ff9 != null) {
            c1148820g08 = (C1148820g08) awS226S0300000_17.invoke(c1135810ff9);
        }
        IDebugService iDebugService2 = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
        if (iDebugService2 != null && (interfaceC1100860ekmSg = iDebugService2.Sg()) != null) {
            C1133970fcB c1133970fcB = (C1133970fcB) interfaceC1100860ekmSg;
            InterfaceC1125480fOU interfaceC1125480fOU = c1133970fcB.LIZIZ;
            if (interfaceC1125480fOU == null || (mapLJ = interfaceC1125480fOU.LIZ(c1133970fcB.LIZ)) == null) {
                mapLJ = new LinkedHashMap<>();
            }
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            jSONArray.put(C1148810g07.LIZ((C1148820g08) it3.next()));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "queue_snapshot");
        String str2 = mapLJ.get("RoomId");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("room_id", str2);
        String str4 = mapLJ.get("AnchorId");
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("anchor_id", str4);
        String str5 = mapLJ.get("UserId");
        if (str5 != null) {
            str3 = str5;
        }
        jSONObject.put("user_id", str3);
        jSONObject.put("queueType", str);
        jSONObject.put("messages", jSONArray);
        if (c1148820g08 != null) {
            jSONObject.put("dequeued", C1148810g07.LIZ(c1148820g08));
        }
        IDebugService iDebugService3 = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
        if (iDebugService3 != null && iDebugService3.Sg() != null) {
            jSONObject.put("seq", C1133980fcC.LIZJ.incrementAndGet());
            C204577153f c204577153f = C1133980fcC.LIZIZ;
            if (c204577153f != null) {
                try {
                    c204577153f.LJJJJIZL(C786410Ut5.J3(jSONObject));
                    z3 = true;
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return z3;
    }
}
