package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304140k2e extends AbstractC1304150k2f {
    public final Object LIZIZ;
    public final Function2<? super JSONObject, ? super Integer, ? extends JSONObject> LIZJ;

    @Override // X.AbstractC1304150k2f
    public final JSONObject LIZ(int i, JSONObject jSONObject) {
        return this.LIZJ.invoke(jSONObject, Integer.valueOf(i));
    }

    public C1304140k2e(String str, Function2 function2, Object obj) {
        super(str);
        this.LIZIZ = obj;
        this.LIZJ = function2;
    }
}
