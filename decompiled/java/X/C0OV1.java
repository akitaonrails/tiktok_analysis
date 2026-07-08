package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OV1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OV1 extends AbstractC606400NqQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jLongValue;
        C1540620qC4 c1540620qC4;
        LinkedHashMap linkedHashMap;
        C1323890kYV c1323890kYV;
        InterfaceC606390NqP interfaceC606390NqP = (InterfaceC606390NqP) xBaseParamModel;
        String eventName = interfaceC606390NqP.getEventName();
        Map<String, Object> params = interfaceC606390NqP.getParams();
        Number timestamp = interfaceC606390NqP.getTimestamp();
        if (timestamp != null) {
            jLongValue = timestamp.longValue();
        } else {
            jLongValue = -1;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            c1540620qC4 = (C1540620qC4) interfaceC634840OvC.LIZIZ(C1540620qC4.class);
        } else {
            c1540620qC4 = null;
        }
        if (params != null) {
            linkedHashMap = new LinkedHashMap(params);
        } else {
            linkedHashMap = null;
        }
        if ((linkedHashMap instanceof Map) && linkedHashMap != null) {
            c1323890kYV = new C1323890kYV(new JSONObject(linkedHashMap));
        } else {
            c1323890kYV = null;
        }
        if (c1540620qC4 != null) {
            C0OV3 c0ov3 = new C0OV3(jLongValue, c1323890kYV, eventName);
            C0OV2 c0ov2 = c1540620qC4.LJIILLIIL;
            c0ov2.getClass();
            if (eventName != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet();
                for (C0OV3 c0ov32 : (CopyOnWriteArrayList) c0ov2.LIZ.getValue()) {
                    if (Math.abs(jCurrentTimeMillis - c0ov32.LLILLJJLI) > 300000) {
                        concurrentSkipListSet.add(c0ov32);
                    }
                }
                Iterator it2 = concurrentSkipListSet.iterator();
                while (it2.hasNext()) {
                    ((CopyOnWriteArrayList) c0ov2.LIZ.getValue()).remove(it2.next());
                }
                ((CopyOnWriteArrayList) c0ov2.LIZ.getValue()).add(c0ov3);
                CopyOnWriteArrayList<C0OV4> copyOnWriteArrayList = c0ov2.LIZ().get(c0ov3.LL);
                if (copyOnWriteArrayList != null) {
                    Iterator<C0OV4> it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        InterfaceC1548390qOb interfaceC1548390qOb = it3.next().LIZJ;
                        if (interfaceC1548390qOb != null) {
                            interfaceC1548390qOb.H4(c0ov3.LLILLL, c0ov3.LL);
                        }
                    }
                }
            }
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC606410NqR.class, null), "");
    }
}
