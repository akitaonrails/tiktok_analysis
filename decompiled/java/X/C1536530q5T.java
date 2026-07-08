package X;

import android.text.TextUtils;
import com.bytedance.forest.model.GeckoSource;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0q5T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536530q5T extends AbstractC1300020jw0<Object, byte[]> {
    public final IResourceServiceX LIZ;
    public final C1537480q70 LIZIZ;

    public C1536530q5T(IResourceServiceX iResourceServiceX, C1537480q70 c1537480q70) {
        this.LIZ = iResourceServiceX;
        this.LIZIZ = c1537480q70;
    }

    @Override // X.AbstractC1300020jw0
    public final void LIZ(C1299260jum<Object> c1299260jum, AbstractC1299910jvp<byte[]> abstractC1299910jvp) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1533760q10 c1533760q10;
        C1536760q5q c1536760q5q;
        InterfaceC1531560pxS interfaceC1531560pxS;
        InterfaceC1531560pxS interfaceC1531560pxS2 = null;
        if (this.LIZ == null) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ExternalJSProvider request ");
            sbLIZ.append(c1299260jum.LIZ);
            sbLIZ.append(", but resourceService is null");
            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, null, 4);
            return;
        }
        String str = c1299260jum.LIZ;
        if ((!TextUtils.isEmpty(str)) && str != null) {
            IResourceServiceX iResourceServiceX = this.LIZ;
            RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_EXTERNAL_JS);
            JSONArray jSONArray = C1533710q0v.LIZ;
            C1537480q70 c1537480q70 = this.LIZIZ;
            if (c1537480q70 != null && (interfaceC1531560pxS = c1537480q70.hybridParams) != null) {
                hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ();
            } else {
                hybridSchemaParamLIZJ = null;
            }
            C1533710q0v.LJIIJJI(requestParams, hybridSchemaParamLIZJ);
            requestParams.waitGeckoUpdate = true;
            requestParams.loadToMemory = true;
            requestParams.needLocalFile = Boolean.FALSE;
            C1537480q70 c1537480q702 = this.LIZIZ;
            if (c1537480q702 != null) {
                requestParams.customParams.put("rl_container_uuid", c1537480q702.containerId);
                requestParams.customParams.put("hybrid_channel", "Lynx_ExternalJS_Forest");
                requestParams.customParams.put("source_location", "com.bytedance.lynx.hybrid.resource.ExternalJSProvider.request");
                C1533710q0v.LJ(requestParams, c1537480q702);
            }
            String strLIZLLL = C1533710q0v.LIZLLL(null, requestParams, str);
            if (!Intrinsics.LJFF(strLIZLLL, str)) {
                requestParams.customParams.put("resource_url", str);
            }
            C1533720q0w c1533720q0w = C1533720q0w.LIZ;
            C1537480q70 c1537480q703 = this.LIZIZ;
            if (c1537480q703 != null) {
                c1533760q10 = c1537480q703.mainDocumentGeckoInfo;
            } else {
                c1533760q10 = null;
            }
            c1533720q0w.getClass();
            C1533510q0b c1533510q0bLIZJ = C1533720q0w.LIZJ(strLIZLLL, c1533760q10);
            if (c1533510q0bLIZJ != null) {
                requestParams.accessKey = c1533510q0bLIZJ.LIZ;
                requestParams.channel = c1533510q0bLIZJ.LIZIZ;
                requestParams.bundle = c1533510q0bLIZJ.LIZJ;
                requestParams.geckoSource = GeckoSource.SPARK_MANIFEST;
            }
            C1537480q70 c1537480q704 = this.LIZIZ;
            if (c1537480q704 != null) {
                interfaceC1531560pxS2 = c1537480q704.hybridParams;
            }
            C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS2;
            if (c1537910q7h != null && (c1536760q5q = c1537910q7h.LJIJI) != null) {
                c1536760q5q.LIZJ(strLIZLLL, new LinkedHashMap());
            }
            iResourceServiceX.fetchResourceAsyncIfNeed(strLIZLLL, requestParams, new C1536560q5W(c1537910q7h, strLIZLLL, abstractC1299910jvp));
        }
    }
}
