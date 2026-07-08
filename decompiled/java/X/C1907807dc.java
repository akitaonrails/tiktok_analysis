package X;

import java.util.Map;
import kotlin.jvm.internal.AwS547S0100000_3;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1907807dc extends AbstractC1907907dd {
    public final String LIZ;
    public final JSONObject LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 176));

    @Override // X.AbstractC1907907dd
    public final Map<String, Object> LIZIZ() {
        return (Map) this.LIZJ.getValue();
    }

    @Override // X.AbstractC1907907dd
    public final String LIZ() {
        return this.LIZ;
    }

    public C1907807dc(String str, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = jSONObject;
    }
}
