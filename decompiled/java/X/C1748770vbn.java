package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: renamed from: X.0vbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1748770vbn {
    public AbstractC1748750vbl LIZ;
    public final HashMap<String, LaneParams> LIZIZ = new HashMap<>();

    public final void LIZ(Function2<? super String, ? super LaneParams, Unit> function2) {
        for (Map.Entry<String, LaneParams> entry : this.LIZIZ.entrySet()) {
            function2.invoke(entry.getKey(), entry.getValue());
        }
    }

    public LaneParams LIZIZ(String str) {
        return this.LIZIZ.get(str);
    }

    public final void LIZJ(C1748770vbn c1748770vbn) {
        c1748770vbn.LIZ(new AwS640S0100000_26(this, 165));
    }
}
