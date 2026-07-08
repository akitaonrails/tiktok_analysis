package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1450, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1450 implements InterfaceC202074144y {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC202074144y
    public final void LIZ(AnonymousClass1452 anonymousClass1452) {
        C202075144z c202075144z = C202075144z.LIZ;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        c202075144z.getClass();
        JSONObject jSONObject = new JSONObject();
        C844470XAv.LIZ.getClass();
        jSONObject.put("aid", C844470XAv.LJIIJ);
        jSONObject.put("from_region", str);
        jSONObject.put("to_region", str2);
        if (anonymousClass1452.LIZ) {
            jSONObject.put("rst", 0);
        } else if (anonymousClass1452.LIZJ != null) {
            jSONObject.put("rst", anonymousClass1452.LIZIZ);
            jSONObject.put("err", anonymousClass1452.LIZJ);
        } else {
            jSONObject.put("rst", -1);
        }
        AppLogNewUtils.onEventV3("pitaya22_change_region", jSONObject);
    }

    public AnonymousClass1450(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
