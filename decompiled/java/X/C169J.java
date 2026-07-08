package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.169J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C169J extends C09AY implements Function0<AbstractC207271168v> {
    public C169J() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC207271168v invoke() {
        return new AbstractC207271168v() { // from class: X.169H
            @Override // X.AbstractC207271168v
            public final String LJ() {
                return "im_conv_context";
            }

            @Override // X.AbstractC207271168v
            public final ITTMParamData LIZLLL(Object obj) {
                Object obj2;
                Object obj3;
                String str;
                Map map;
                Map map2;
                boolean z = obj instanceof Map;
                if (z && (map2 = (Map) obj) != null) {
                    obj2 = map2.get("conversation_id");
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                    if (z && (map = (Map) obj) != null) {
                        obj3 = map.get("convId");
                    } else {
                        obj3 = null;
                    }
                    if (!(obj3 instanceof String) || (str = (String) obj3) == null) {
                        C169O.LIZ();
                        return null;
                    }
                }
                C895190Z9x.LIZ.getClass();
                C829840Wgw c829840WgwLIZ = C895190Z9x.LIZ(str);
                if (C169O.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getCustomParamFromAction: convContext=");
                    sbLIZ.append(c829840WgwLIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C169O.LIZ();
                }
                return c829840WgwLIZ;
            }

            @Override // X.AbstractC207271168v, X.AbstractC830880Wic
            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                InterfaceC1712206nA interfaceC1712206nALJIILL;
                super.LIZJ(interfaceC830890Wid, enumC2213771Bkd);
                if (interfaceC830890Wid != null && enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                    IIMBusinessChatService.LIZ.getClass();
                    IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
                    if (iIMBusinessChatService != null && (interfaceC1712206nALJIILL = iIMBusinessChatService.LJIILL()) != null) {
                        interfaceC1712206nALJIILL.LIZ(interfaceC830890Wid);
                    }
                }
            }

            @Override // X.AbstractC830880Wic
            public final TTMParamData LIZIZ(C830870Wib c830870Wib, String str, AnonymousClass1696 anonymousClass1696) {
                String stringValue;
                String stringValue2;
                ITTMParamData iTTMParamData = anonymousClass1696.LIZ;
                if (iTTMParamData != null) {
                    stringValue = iTTMParamData.getStringValue("al_event_key", 0);
                } else {
                    stringValue = null;
                }
                ITTMParamData iTTMParamData2 = anonymousClass1696.LIZ;
                if (iTTMParamData2 == null || ((stringValue2 = iTTMParamData2.getStringValue("conversation_id", 0)) == null && (stringValue2 = iTTMParamData2.getStringValue("convId", 0)) == null)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getStrategyCustomParam: convId is null, eventName=");
                    sbLIZ.append(stringValue);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C169O.LIZ();
                    return null;
                }
                C895190Z9x.LIZ.getClass();
                C829840Wgw c829840WgwLIZ = C895190Z9x.LIZ(stringValue2);
                if (C169O.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getStrategyCustomParam: eventName=");
                    sbLIZ2.append(stringValue);
                    sbLIZ2.append(", convContext=");
                    sbLIZ2.append(c829840WgwLIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C169O.LIZ();
                }
                return new TTMParamData((ITTMParamData) c829840WgwLIZ);
            }
        };
    }
}
