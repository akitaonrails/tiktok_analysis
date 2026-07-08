package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import com.ss.android.ugc.aweme.tako.ccl.net.AgentCommandSyncData;
import kotlin.Unit;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596900Nb6 implements InterfaceC596800Naw, InterfaceC486470J5x {
    public InterfaceC497601wk LLILLJJLI;
    public InterfaceC1631630sYr<? super AgentCommandRequest, ? super InterfaceC596800Naw, ? super C596790Nav, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> LLILLL;
    public final EnumC596890Nb5 LL = EnumC596890Nb5.FRONTIER;
    public final C596910Nb7 LLILZ = new C0XEZ() { // from class: X.0Nb7
        @Override // X.C0XEZ
        public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
            if (C07IC.LIZ()) {
                C1930207hE.LIZ();
            }
            C596900Nb6 c596900Nb6 = this.LL;
            C2203431BLp.LIZIZ.isConnected();
            c596900Nb6.getClass();
        }
    };

    public static void LIZ() {
        Application application;
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        if (c2203431BLp.isConnected()) {
            return;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (!(contextLIZ instanceof Application) || (application = (Application) contextLIZ) == null) {
            return;
        }
        c2203431BLp.LJIIJ(application);
        c2203431BLp.LJ("tako_ccl_frontier");
        if (C07IC.LIZ()) {
            C1930207hE.LIZ();
        }
    }

    @Override // X.InterfaceC596800Naw
    public final EnumC596890Nb5 Kf() {
        return this.LL;
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        InterfaceC1631630sYr<? super AgentCommandRequest, ? super InterfaceC596800Naw, ? super C596790Nav, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr;
        InterfaceC497601wk interfaceC497601wk = this.LLILLJJLI;
        if (interfaceC497601wk == null || (interfaceC1631630sYr = this.LLILLL) == null) {
            return;
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C596880Nb4(wsChannelMsg, interfaceC1631630sYr, this, null), 3);
    }

    @Override // X.InterfaceC596800Naw
    public final void Lf(C054G c054g, C596780Nau c596780Nau) {
        this.LLILLJJLI = c054g;
        this.LLILLL = c596780Nau;
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LJI(134218304, 1, this);
        c2203431BLp.LIZLLL(this.LLILZ);
        LIZ();
    }

    @Override // X.InterfaceC596800Naw
    public final Object Mf(AgentCommandSyncData agentCommandSyncData, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        if (!c2203431BLp.isConnected()) {
            if (C07IC.LIZ()) {
                C1930207hE.LIZ();
            }
            LIZ();
        }
        c2203431BLp.LJIIIIZZ(0L, System.currentTimeMillis(), 134218304, 2, GsonProtectorUtils.toJson(C597040NbK.LIZ(), agentCommandSyncData).getBytes(Charsets.UTF_8), "", "", C2097608Jq.LJ());
        return Unit.LIZ;
    }
}
