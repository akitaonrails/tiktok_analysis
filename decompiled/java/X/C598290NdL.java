package X;

import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.eventcenter.PdpEventCenter$createLynxHandler$1", f = "PdpEventCenter.kt", l = {}, m = "invokeSuspend")
public final class C598290NdL extends C09AX implements InterfaceC1631620sYq<Map<String, ? extends Object>, Map<String, ? extends Object>, InterfaceC1364105Vn<? super C599070Neb>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC634840OvC LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598290NdL(InterfaceC634840OvC interfaceC634840OvC, String str, InterfaceC1364105Vn<? super C598290NdL> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC634840OvC;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String strLJIIIIZZ;
        C1C7U.LIZ("PdpEventCenter@c50e.createLynxHandler$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        String string = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("callbackId", string);
        if (obj2 != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj2);
        } else {
            strLJIIIIZZ = null;
        }
        jSONObject.put("parameters", strLJIIIIZZ);
        C599070Neb c599070Neb = new C599070Neb(string, this.LLILLJJLI, this.LLILLL, jSONObject);
        C1C7U.LIZIZ("PdpEventCenter@c50e.createLynxHandler$1");
        return c599070Neb;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super C599070Neb> interfaceC1364105Vn) {
        C598290NdL c598290NdL = new C598290NdL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c598290NdL.LL = map;
        return c598290NdL.invokeSuspend(Unit.LIZ);
    }
}
