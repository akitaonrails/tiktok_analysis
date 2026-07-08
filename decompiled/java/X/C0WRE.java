package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WRE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WRE extends C09AY implements Function0<Object> {
    public C0WRE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str = C813160Vv8.LIZ;
        C796440VMc<String> c796440VMc = C813160Vv8.LIZIZ;
        JSONArray jSONArray = new JSONArray();
        if (c796440VMc != null) {
            Iterator<String> it2 = c796440VMc.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
        }
        return jSONArray.toString();
    }
}
