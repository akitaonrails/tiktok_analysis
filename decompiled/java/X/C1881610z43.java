package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z43, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881610z43 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ C1881590z41 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881610z43(C1881590z41 c1881590z41) {
        super(1);
        this.LL = c1881590z41;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        C1881590z41 c1881590z41 = this.LL;
        c1881590z41.getClass();
        Iterator<String> itKeys = jSONObject2.keys();
        boolean z = false;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject2.opt(next);
            if (objOpt != null) {
                C1882380z5I.LJIIIZ(c1881590z41.LJIIIZ(), next, objOpt);
                c1881590z41.LLJJJ.put(next, objOpt);
                if (Intrinsics.LJFF(next, "game_info")) {
                    c1881590z41.LJJIIJZLJL();
                } else if (Intrinsics.LJFF(next, "reward_list")) {
                    c1881590z41.LJJIIZI();
                }
                z = true;
            }
        }
        if (z) {
            c1881590z41.LJIIIZ().LJIIIIZZ();
        }
        return Unit.LIZ;
    }
}
