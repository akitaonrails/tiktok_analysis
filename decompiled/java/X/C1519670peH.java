package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.sync.ISyncInitProvider;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0peH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519670peH implements InterfaceC1526670ppZ {
    public final C1519750peP LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public volatile C821300WJs LLILZ;
    public volatile InterfaceC1519710peL LLILZIL;

    @Override // X.InterfaceC1526670ppZ
    public final void LIZLLL() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.LL.LIZJ);
        HashMap map = new HashMap();
        C0XDN.LIZJ(map, false);
        this.LL.getClass();
        C0WKN c0wkn = new C0WKN(8001);
        this.LL.getClass();
        c0wkn.LJII = "e1bd35ec9db7b8d846de66ed140b1ad9";
        this.LL.getClass();
        c0wkn.LJFF = 9;
        c0wkn.LJ = this.LL.LIZ;
        ISyncInitProvider iSyncInitProvider = C1519700peK.LIZ;
        c0wkn.LJI = iSyncInitProvider.getVersionCode();
        c0wkn.LJIIIIZZ = this.LLILLJJLI;
        c0wkn.LJIIIZ = this.LLILLL;
        ((ArrayList) c0wkn.LIZLLL).addAll(arrayList);
        ((HashMap) c0wkn.LIZIZ).putAll(map);
        C821320WJu c821320WJuLIZ = c0wkn.LIZ();
        C821300WJs c821300WJs = this.LLILZ;
        if (c821300WJs != null) {
            c821300WJs.LIZJ();
        }
        this.LLILZ = C821310WJt.LIZJ(iSyncInitProvider.getAppContext(), c821320WJuLIZ, new InterfaceC810750VrF() { // from class: X.0peI
            @Override // X.InterfaceC810750VrF
            public final void LIZ(WsChannelMsg wsChannelMsg) {
                Integer numValueOf;
                InterfaceC1519710peL interfaceC1519710peL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("default ws received msg, serverId: ");
                if (wsChannelMsg != null) {
                    numValueOf = Integer.valueOf(wsChannelMsg.service);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                if (wsChannelMsg != null) {
                    int i = wsChannelMsg.service;
                    this.LIZ.LL.getClass();
                    if (i == 20032 && (interfaceC1519710peL = this.LIZ.LLILZIL) != null) {
                        interfaceC1519710peL.LIZ(wsChannelMsg);
                    }
                }
            }

            @Override // X.InterfaceC810750VrF
            public final void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject) {
                InterfaceC1519710peL interfaceC1519710peL = this.LIZ.LLILZIL;
                if (interfaceC1519710peL != null) {
                    interfaceC1519710peL.LJI(c821280WJq);
                }
            }
        });
    }

    @Override // X.InterfaceC1526670ppZ
    public final int getChannelId() {
        C821300WJs c821300WJs = this.LLILZ;
        if (c821300WJs != null) {
            return c821300WJs.LIZ.LIZ;
        }
        this.LL.getClass();
        return 8001;
    }

    @Override // X.InterfaceC1526670ppZ
    public final boolean isConnected() {
        C821300WJs c821300WJs = this.LLILZ;
        return c821300WJs != null && c821300WJs.LJFF == C0XE1.CONNECTED;
    }

    @Override // X.InterfaceC1526670ppZ
    public final void LIZJ(WsChannelMsg wsChannelMsg) {
        C1519720peM c1519720peM = new InterfaceC821350WJx() { // from class: X.0peM
            @Override // X.InterfaceC821350WJx
            public final void LIZ() {
            }
        };
        C821300WJs c821300WJs = this.LLILZ;
        if (c821300WJs != null) {
            c821300WJs.LIZIZ(wsChannelMsg, c1519720peM);
        }
    }

    @Override // X.InterfaceC1526670ppZ
    public final void LJ(C1526610ppT c1526610ppT) {
        this.LLILZIL = c1526610ppT;
    }

    public C1519670peH(C1519750peP c1519750peP, String str, String str2) {
        this.LL = c1519750peP;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        C1519700peK.LIZ.LIZIZ(new AwS567S0100000_23(this, 102));
    }
}
