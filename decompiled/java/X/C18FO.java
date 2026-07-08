package X;

import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18FO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FO extends C09AY implements Function0<Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC21252118Et LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FO(Object obj, InterfaceC21252118Et interfaceC21252118Et) {
        super(0);
        this.LL = obj;
        this.LLILLJJLI = interfaceC21252118Et;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object obj = this.LL;
        InterfaceC21252118Et interfaceC21252118Et = this.LLILLJJLI;
        jSONObject.put("page", obj.getClass().getName());
        if (interfaceC21252118Et != null) {
            jSONObject.put("node", interfaceC21252118Et.toString());
            C18E9 tree = interfaceC21252118Et.getTree();
            jSONObject.put("tree", tree != null ? tree.toString() : null);
        }
        return jSONObject;
    }
}
