package X;

import Y.ARunnableS17S1100000_12;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TXZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TXZ extends C09AY implements Function2<String, JSONObject, Unit> {
    public C0TXZ() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        C0TXY.LIZ.getClass();
        if (str2 != null && str2.length() != 0 && jSONObject2 != null && C0TXY.LJ.contains(str2) && !((List) C0TXY.LJFF.getValue()).isEmpty()) {
            C823050WQl.LIZJ().execute(new ARunnableS17S1100000_12(jSONObject2, str2, 15));
        }
        return Unit.LIZ;
    }
}
