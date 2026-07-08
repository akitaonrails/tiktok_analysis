package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestHangupP2EnableSetting;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Inv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477450Inv implements InterfaceC1528010prj {
    public static boolean LIZ;
    public static final List<InterfaceC477320Ini> LIZIZ = new ArrayList();
    public static final C477440Inu LIZJ = new C477440Inu();

    @Override // X.InterfaceC1528010prj
    public final void LIZ(LiveWsMessage liveWsMessage) {
    }

    public static void LIZJ(InterfaceC477320Ini interfaceC477320Ini) {
        if (!MultiGuestHangupP2EnableSetting.isEnable()) {
            C20441214yg.LIZIZ("MultiHangupApplyStatusUpdateHelper", "MultiGuestHangupP2EnableSetting is not enable");
            return;
        }
        C20441214yg.LIZIZ("legolas_im", "addHangupApplyStatusListener");
        if (!LIZ) {
            C20441214yg.LIZIZ("legolas_im", "MultiHangupApplyStatusUpdateHelper init");
            C477630IoD.LIZ.LIZLLL(LIZJ);
            LIZ = true;
        }
        ArrayList arrayList = (ArrayList) LIZIZ;
        if (!arrayList.contains(interfaceC477320Ini)) {
            arrayList.add(interfaceC477320Ini);
        }
    }

    public static void LIZLLL(InterfaceC477320Ini interfaceC477320Ini) {
        if (!MultiGuestHangupP2EnableSetting.isEnable()) {
            C20441214yg.LIZIZ("MultiHangupApplyStatusUpdateHelper", "MultiGuestHangupP2EnableSetting is not enable");
            return;
        }
        C20441214yg.LIZIZ("legolas_im", "removeHangupApplyStatusListener");
        ArrayList arrayList = (ArrayList) LIZIZ;
        arrayList.remove(interfaceC477320Ini);
        if (arrayList.isEmpty()) {
            C477630IoD c477630IoD = C477630IoD.LIZ;
            C477440Inu c477440Inu = LIZJ;
            synchronized (c477630IoD) {
                LinkedHashMap<String, InterfaceC477620IoC> linkedHashMap = C477630IoD.LIZJ;
                if (linkedHashMap.get(c477440Inu.LIZ) == c477440Inu) {
                    linkedHashMap.remove(c477440Inu.LIZ);
                }
                c477630IoD.LJ();
            }
            LIZ = false;
        }
    }

    @Override // X.InterfaceC1528010prj
    public final void LIZIZ(EnumC1527990prh enumC1527990prh, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiHangupApplyStatusUpdateHelper LiveWsConnectState=");
        sbLIZ.append(enumC1527990prh);
        sbLIZ.append(" connectJson=");
        sbLIZ.append(jSONObject);
        C20441214yg.LIZIZ("legolas_im", C2188811AlT.LIZIZ(sbLIZ));
    }
}
