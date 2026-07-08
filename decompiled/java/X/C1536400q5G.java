package X;

import android.net.Uri;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q5G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536400q5G extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C1537480q70 LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536400q5G(C013C c013c, C1537480q70 c1537480q70, Runnable runnable) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = c1537480q70;
        this.LLILLL = runnable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) throws JSONException {
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        String starlingChannel;
        String strLIZ;
        Uri uriLIZ;
        boolean zBooleanValue = bool.booleanValue();
        C013C c013c = this.LL;
        if (!c013c.element) {
            c013c.element = true;
            if (zBooleanValue) {
                boolean z = C1536390q5F.LIZ;
                C1537480q70 c1537480q70 = this.LLILLJJLI;
                if (C1536390q5F.LIZ && (interfaceC1531560pxS = c1537480q70.hybridParams) != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && (starlingChannel = hybridSchemaParamLIZJ.getStarlingChannel()) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(starlingChannel);
                    sbLIZ.append("__");
                    sbLIZ.append(C1536390q5F.LIZIZ(c1537480q70));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (strLIZIZ != null) {
                        InterfaceC1531560pxS interfaceC1531560pxS2 = c1537480q70.hybridParams;
                        if (interfaceC1531560pxS2 == null || (uriLIZ = interfaceC1531560pxS2.LIZ()) == null || (strLIZ = uriLIZ.toString()) == null) {
                            strLIZ = C1536390q5F.LIZ(strLIZIZ);
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", strLIZ);
                        jSONObject.put("timeout", C1536390q5F.LIZIZ);
                        jSONObject.put("channel", strLIZIZ);
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("starling load timeout: ");
                        sbLIZ2.append(jSONObject);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ2), null, "LYNX_I18N", 2);
                        String str = c1537480q70.containerId;
                        C1520360pfO c1520360pfO = new C1520360pfO("hybrid_starling_resource_preload_timeout");
                        c1520360pfO.LIZIZ = c1537480q70.bid;
                        c1520360pfO.LIZ = strLIZ;
                        c1520360pfO.LIZLLL = jSONObject;
                        c1520360pfO.LIZIZ(0);
                        C1520080pew.LIZ(str, c1520360pfO.LIZ());
                    }
                }
            }
            this.LLILLL.run();
        }
        return Unit.LIZ;
    }
}
