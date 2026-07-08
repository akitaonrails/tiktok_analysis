package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.189A, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189A extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C21241518Ar LL;
    public final /* synthetic */ C013C LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C189A(C21241518Ar c21241518Ar, C013C c013c) {
        super(0);
        this.LL = c21241518Ar;
        this.LLILLJJLI = c013c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String strLIZIZ;
        C18G6 c18g6LIZJ = this.LL.LIZJ();
        if (c18g6LIZJ == null || (strLIZIZ = c18g6LIZJ.LIZIZ("key_btm_chain", "")) == null) {
            strLIZIZ = "";
        }
        if (strLIZIZ.length() > 0) {
            JSONObject jSONObject = new JSONObject(strLIZIZ);
            Iterator<String> itKeys = jSONObject.keys();
            C21241518Ar c21241518Ar = this.LL;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                c21241518Ar.LJ.put(next, jSONObject.optString(next));
            }
            this.LLILLJJLI.element = false;
        }
        C18G6 c18g6LIZJ2 = this.LL.LIZJ();
        if (c18g6LIZJ2 != null) {
            c18g6LIZJ2.LIZJ("key_btm_chain", "");
        }
        return Boolean.valueOf(strLIZIZ.length() > 0);
    }
}
