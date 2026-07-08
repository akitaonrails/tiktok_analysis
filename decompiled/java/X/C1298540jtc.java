package X;

import com.bytedance.sdui.event.SDUIEventManager;
import com.bytedance.sdui.render.bridge.Callback;
import com.bytedance.sdui.serializedData.common.event.ClientEvent;
import com.bytedance.sdui.serializedData.common.event.ModuleInvokeCallback;

/* JADX INFO: renamed from: X.0jtc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1298540jtc implements Callback {
    public final /* synthetic */ AbstractC1317090kNX LIZ;
    public final /* synthetic */ Long LIZIZ;

    public /* synthetic */ C1298540jtc(AbstractC1317090kNX abstractC1317090kNX, Long l) {
        this.LIZ = abstractC1317090kNX;
        this.LIZIZ = l;
    }

    @Override // com.bytedance.sdui.render.bridge.Callback
    public final void invoke(Object[] objArr) {
        AbstractC1317090kNX abstractC1317090kNX = this.LIZ;
        Long l = this.LIZIZ;
        C1297860jsW c1297860jsW = new C1297860jsW();
        c1297860jsW.putInt("code", ((Integer) objArr[0]).intValue());
        if (objArr.length > 1) {
            c1297860jsW.put("data", objArr[1]);
        }
        String strJ3 = C786410Ut5.J3(c1297860jsW.toJSONObject());
        SDUIEventManager sDUIEventManager = abstractC1317090kNX.LLJJJ;
        sDUIEventManager.getClass();
        ClientEvent clientEvent = new ClientEvent();
        ModuleInvokeCallback moduleInvokeCallback = new ModuleInvokeCallback();
        moduleInvokeCallback.LIZIZ = strJ3;
        moduleInvokeCallback.LIZ = l.longValue();
        clientEvent.LJFF = moduleInvokeCallback;
        sDUIEventManager.LIZ(clientEvent, false);
    }
}
