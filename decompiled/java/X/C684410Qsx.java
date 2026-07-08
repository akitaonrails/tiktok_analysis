package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684410Qsx extends AbstractC684420Qsy {
    public final void LIZJ(String str, String str2) {
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("op_args", str);
                jSONObject.put("alert_id", str2);
                interfaceC634840OvC.sendEvent("onAlertButtonClickAction", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[EDGE_INSN: B:42:0x008a->B:51:0x00ac BREAK  A[LOOP:0: B:93:0x0159->B:98:0x0167]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:3:0x0006, B:7:0x0011, B:10:0x0018, B:12:0x001e, B:13:0x0022, B:15:0x002c, B:20:0x0040, B:23:0x0048, B:25:0x0050, B:30:0x005b, B:32:0x0063, B:33:0x0067, B:35:0x006f, B:36:0x0073, B:38:0x007c, B:43:0x008c, B:45:0x0096, B:47:0x009c, B:49:0x00a6, B:51:0x00ac, B:53:0x00b7, B:55:0x00c2, B:56:0x00c5, B:58:0x00cb, B:59:0x00ce, B:60:0x00eb, B:62:0x00f1, B:63:0x00f5, B:65:0x0101, B:67:0x010b, B:69:0x0119, B:72:0x011f, B:74:0x0123, B:77:0x012d, B:79:0x0133, B:81:0x0139, B:82:0x013d, B:84:0x0143, B:93:0x0159, B:95:0x015d, B:96:0x0161, B:88:0x014b, B:90:0x014f), top: B:105:0x0006 }] */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r17, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r18, X.EnumC1063300dmC r19) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C684410Qsx.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
