package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881500z3s extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ C1881470z3p LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881500z3s(C1881470z3p c1881470z3p) {
        super(1);
        this.LL = c1881470z3p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        C1881470z3p c1881470z3p = this.LL;
        c1881470z3p.getClass();
        Iterator<String> itKeys = jSONObject2.keys();
        boolean z = false;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject2.opt(next);
            if (objOpt != null) {
                C1882380z5I.LJIIIZ(c1881470z3p.LJIIIZ(), next, objOpt);
                c1881470z3p.LLJILLL.put(next, objOpt);
                if (Intrinsics.LJFF(next, "game_info")) {
                    c1881470z3p.LJJII();
                }
                z = true;
            }
        }
        if (z) {
            c1881470z3p.LJIIIZ().LJIIIIZZ();
        }
        return Unit.LIZ;
    }
}
