package X;

import com.bytedance.lynx.hybrid.prefetch.bridge.WorkerBridgeModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531460pxI extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ Callback LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531460pxI(Callback callback) {
        super(1);
        this.LL = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        WorkerBridgeModule.Companion.getClass();
        JavaOnlyMap javaOnlyMapLIZIZ = C1531470pxJ.LIZIZ(jSONObject);
        Callback callback = this.LL;
        if (callback != null) {
            callback.invoke(javaOnlyMapLIZIZ);
        }
        return Unit.LIZ;
    }
}
