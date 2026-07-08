package X;

import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.GetLeadsAnchorPublishResp;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0dZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055620dZo {
    public static final C1055620dZo LIZ = new C1055620dZo();
    public static final InterfaceC1055630dZp LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ = c1499850p8JCreateBuilder != null ? (InterfaceC1055630dZp) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC1055630dZp.class) : null;
    }

    public static void LIZ(Map map) {
        InterfaceC1055630dZp interfaceC1055630dZp;
        C15O7<GetLeadsAnchorPublishResp> c15o7LIZ;
        if (map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ((Map.Entry) it2.next()).getValue();
                if (anchorPublishStruct.type == EnumC1430380nKG.GET_LEADS.getTYPE() && (interfaceC1055630dZp = LIZIZ) != null && (c15o7LIZ = interfaceC1055630dZp.LIZ()) != null) {
                    c15o7LIZ.LIZLLL(new C1077460e92(anchorPublishStruct, 6));
                }
            }
        }
    }
}
