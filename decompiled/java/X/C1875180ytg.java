package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0ytg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875180ytg {
    public final /* synthetic */ CompletionBlock<InterfaceC1875140ytc> LIZ;
    public final /* synthetic */ C1875170ytf LIZIZ;
    public final /* synthetic */ InterfaceC1063720dms LIZJ;
    public final /* synthetic */ InterfaceC1875160yte LIZLLL;

    public final void LIZIZ() {
        this.LIZ.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1875140ytc.class, null), "");
        C1875170ytf c1875170ytf = this.LIZIZ;
        InterfaceC1063720dms interfaceC1063720dms = this.LIZJ;
        String socketTaskID = this.LIZLLL.getSocketTaskID();
        c1875170ytf.getClass();
        HashMap map = new HashMap();
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "closed");
        if (socketTaskID != null) {
            map.put("socketTaskID", socketTaskID);
        }
        if (interfaceC1063720dms != null) {
            interfaceC1063720dms.LIZ("x.socketStatusChanged", map);
        }
    }

    public final void LIZ(String str) {
        C2382909Vj.LIZ(this.LIZ, 0, str, null, 4);
    }

    public C1875180ytg(CompletionBlock<InterfaceC1875140ytc> completionBlock, C1875170ytf c1875170ytf, InterfaceC1063720dms interfaceC1063720dms, InterfaceC1875160yte interfaceC1875160yte) {
        this.LIZ = completionBlock;
        this.LIZIZ = c1875170ytf;
        this.LIZJ = interfaceC1063720dms;
        this.LIZLLL = interfaceC1875160yte;
    }
}
