package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.network.NetWorkSocketJSWrap$connectSocket$1$1", f = "NetWorkModule.kt", l = {}, m = "invokeSuspend")
public final class C1523100pjo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1524780pmW LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523100pjo(C1524780pmW c1524780pmW, int i, int i2, String str, InterfaceC1364105Vn<? super C1523100pjo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1524780pmW;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1523100pjo(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC1525090pn1 interfaceC1525090pn1;
        C1C7U.LIZ("NetWorkSocketJSWrap@25a7.connectSocket$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        String str = this.LLILZ;
        jSONObject.put("state", "error");
        jSONObject.put("socketTaskId", i);
        jSONObject.put("errorCode", i2);
        jSONObject.put("errorMsg", str);
        C1525050pmx c1525050pmx = this.LL.LIZ;
        if (c1525050pmx != null && (interfaceC1525090pn1 = c1525050pmx.LIZIZ) != null) {
            interfaceC1525090pn1.emitJSAPIEvent("SocketTaskStateChange", jSONObject);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NetWorkSocketJSWrap@25a7.connectSocket$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
