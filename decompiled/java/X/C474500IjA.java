package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.gson.k;
import com.google.gson.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474500IjA implements InterfaceC488740JEq {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC474510IjB LIZ;

    public final void LJIIIIZZ() {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILLIIL();
        }
    }

    public final void LJIIJ() {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(DataChannelGlobal.LLILZ.gg0(C931400aLS.class));
        }
    }

    public final void LJIIL() {
        C466470IQz c466470IQz;
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
            interfaceC474510IjB.LJIIIIZZ((c0ir5 == null || (c466470IQz = c0ir5.LJI) == null) ? null : Integer.valueOf(c466470IQz.LIZJ), "inner_room_position");
        }
    }

    public final Map<String, String> LJIIZILJ() {
        Map<String, String> mapLJIILL;
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        return (interfaceC474510IjB == null || (mapLJIILL = interfaceC474510IjB.LJIILL()) == null) ? new HashMap() : mapLJIILL;
    }

    public final String LJIJ() {
        String eventName;
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        return (interfaceC474510IjB == null || (eventName = interfaceC474510IjB.getEventName()) == null) ? "" : eventName;
    }

    public final Map<String, String> LJIJI() {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            return interfaceC474510IjB.getParams();
        }
        return null;
    }

    public final C474500IjA LJIL() {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class));
        }
        InterfaceC474510IjB interfaceC474510IjB2 = this.LIZ;
        if (interfaceC474510IjB2 != null) {
            interfaceC474510IjB2.LJIILJJIL(DataChannelGlobal.LLILZ.gg0(C1148450fzX.class));
        }
        InterfaceC474510IjB interfaceC474510IjB3 = this.LIZ;
        if (interfaceC474510IjB3 != null) {
            interfaceC474510IjB3.LJIILIIL();
        }
        return this;
    }

    public final void LJJIJIL() {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIJI();
        }
    }

    public final void LJJIJL() {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJ();
        }
    }

    public final void LJJIJLIJ() {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LIZLLL();
        }
    }

    public final void LJJJ() {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(DataChannelGlobal.LLILZ.gg0(C931420aLU.class));
        }
    }

    @Override // X.InterfaceC488740JEq
    public final void LIZ() {
        boolean zLJI = MethodIDManager.LJI(137236);
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LIZ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC488740JEq
    public final /* bridge */ /* synthetic */ C474500IjA LIZJ() {
        LJIL();
        return this;
    }

    @Override // X.InterfaceC488740JEq
    public final /* bridge */ /* synthetic */ InterfaceC488740JEq LIZIZ(Map map) {
        LJJIIZI(map);
        return this;
    }

    public final void LJ(String str) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIIZZ(str, "action_type");
        }
    }

    public final void LJFF(C0IXY c0ixy) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(c0ixy);
        }
    }

    public final void LJI(Long l) {
        if (l != null) {
            LJII(String.valueOf(l.longValue()));
        }
    }

    public final void LJII(String str) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIIZZ(str, "anchor_id");
        }
    }

    public final void LJIIJJI(String str) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIIZZ(str, "event_belong");
        }
    }

    public final void LJIILIIL(String str) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIIZZ(str, "event_module");
        }
    }

    public final void LJIILJJIL(String str) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIIZZ(str, "event_page");
        }
    }

    public final void LJIILL(String str) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIIZZ(str, "event_type");
        }
    }

    public final void LJIILLIIL(C474130IiZ c474130IiZ) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(c474130IiZ);
        }
    }

    public final void LJIJJ(C0IR5 c0ir5) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(c0ir5);
        }
    }

    public final void LJIJJLI(DataChannel dataChannel) {
        Object objGg0;
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        Object objGg02 = null;
        if (interfaceC474510IjB != null) {
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(C1087000eOQ.class);
            } else {
                objGg0 = null;
            }
            interfaceC474510IjB.LJIILJJIL(objGg0);
        }
        InterfaceC474510IjB interfaceC474510IjB2 = this.LIZ;
        if (interfaceC474510IjB2 != null) {
            if (dataChannel != null) {
                objGg02 = dataChannel.gg0(C1099340eiK.class);
            }
            interfaceC474510IjB2.LJIILJJIL(objGg02);
        }
    }

    public final void LJJ(String str) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIIZZ(str, "live_type");
        }
    }

    public final void LJJI(boolean z) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJI(z);
        }
    }

    public final void LJJIIJ(n nVar) {
        String string;
        for (String str : nVar.LJJIJIL()) {
            InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
            if (interfaceC474510IjB != null) {
                k kVarLJJIIZ = nVar.LJJIIZ(str);
                if (kVarLJJIIZ == null || (string = kVarLJJIIZ.toString()) == null) {
                    string = "";
                }
                interfaceC474510IjB.LJIIIIZZ(string, str);
            }
        }
    }

    public final void LJJIIJZLJL(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
            if (interfaceC474510IjB != null) {
                interfaceC474510IjB.LJIIIIZZ(jSONObject.opt(next), next);
            }
        }
    }

    public final void LJJIIZI(Map map) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LIZIZ(map);
        }
    }

    public final void LJJIJ(Map map) {
        if (map != null && (!map.isEmpty())) {
            for (Map.Entry entry : map.entrySet()) {
                InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
                if (interfaceC474510IjB != null) {
                    interfaceC474510IjB.LJIIIIZZ(entry.getValue(), (String) entry.getKey());
                }
            }
        }
    }

    public final void LJJIJIIJI(Long l) {
        if (l != null) {
            LJJIJIIJIL(String.valueOf(l.longValue()));
        }
    }

    public final void LJJIJIIJIL(String str) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIIZZ(str, "room_id");
        }
    }

    public final void LJJIL(ShareFromInfo shareFromInfo) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIILJJIL(shareFromInfo);
        }
    }

    public final void LJJIZ(DataChannel dataChannel) {
        Object objGg0;
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            if (dataChannel != null) {
                objGg0 = dataChannel.gg0(C752130Tet.class);
            } else {
                objGg0 = null;
            }
            interfaceC474510IjB.LJIILJJIL(objGg0);
        }
    }

    public final void LJJIFFI(Float f, String str) {
        InterfaceC474510IjB interfaceC474510IjB;
        if (f != null && !Float.isNaN(f.floatValue()) && !Float.isInfinite(f.floatValue()) && (interfaceC474510IjB = this.LIZ) != null) {
            interfaceC474510IjB.LJIIIIZZ(f, str);
        }
    }

    public final void LJJII(Object obj, String str) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIIZZ(obj, str);
        }
    }

    public final void LJJIII(String str, Double d) {
        InterfaceC474510IjB interfaceC474510IjB;
        if (d != null && !Double.isNaN(d.doubleValue()) && !Double.isInfinite(d.doubleValue()) && (interfaceC474510IjB = this.LIZ) != null) {
            interfaceC474510IjB.LJIIIIZZ(d, str);
        }
    }

    public C474500IjA(String str, boolean z, Double d) {
        this.LIZ = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).WE0(str, z, d);
    }

    public final void LJJIIZ(Object obj, String str, Function0 function0) {
        InterfaceC474510IjB interfaceC474510IjB = this.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIIZ(obj, str, function0);
        }
    }
}
