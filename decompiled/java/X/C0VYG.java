package X;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0VYG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYG implements Callable<JSONArray> {
    @Override // java.util.concurrent.Callable
    public final JSONArray call() {
        C1C7U.LIZ("Flavor@fd02.setActivityImpl$1");
        JSONArray jSONArray = new JSONArray();
        for (C0VYF c0vyf : new ArrayList(C0VYH.LIZIZ().LJII)) {
            long j = c0vyf.LIZIZ;
            C0VYK c0vyk = c0vyf.LIZ;
            jSONArray.put(C0VYF.LIZ(c0vyk.LIZIZ, c0vyf.LIZJ, j, c0vyk.LIZ));
        }
        C1C7U.LIZIZ("Flavor@fd02.setActivityImpl$1");
        return jSONArray;
    }
}
