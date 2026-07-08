package X;

import Y.ACallableS63S1100000_11;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0SwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737520SwQ {
    public static final void LIZ(String str, Function1<? super JSONObject, Unit> function1) {
        JSONObject jSONObject = new JSONObject();
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
        C15O7.LIZJ(new ACallableS63S1100000_11(str, jSONObject, 1));
    }
}
