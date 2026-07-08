package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648860Pci extends C648850Pch {
    public final InterfaceC1541990qEH LIZJ;

    public C648860Pci(InterfaceC1541990qEH interfaceC1541990qEH) {
        super(interfaceC1541990qEH);
        this.LIZJ = interfaceC1541990qEH;
    }

    @Override // X.C648850Pch
    public final void LIZJ(DynamicPatch dynamicPatch) {
        this.LIZJ.d1(dynamicPatch.getRawData());
    }

    @Override // X.C648850Pch
    public final void LIZLLL(String str) {
        this.LIZJ.d1(str);
    }

    @Override // X.C648850Pch
    public final void LIZ(String str, JSONObject jSONObject) throws JSONException {
        C1539250q9r c1539250q9r;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZJ;
        if ((interfaceC1541990qEH instanceof C1539250q9r) && (c1539250q9r = (C1539250q9r) interfaceC1541990qEH) != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", jSONObject);
            c1539250q9r.LIZ(str, jSONObject2);
        }
    }
}
