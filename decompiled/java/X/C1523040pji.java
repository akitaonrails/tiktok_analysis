package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.network.api.socket.CreateSocketTaskApiHandler$emitSocketEvent$1", f = "CreateSocketTaskApiHandler.kt", l = {}, m = "invokeSuspend")
public final class C1523040pji extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1523050pjj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function1<JSONObject, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1523040pji(C1523050pjj c1523050pjj, String str, int i, Function1<? super JSONObject, Unit> function1, InterfaceC1364105Vn<? super C1523040pji> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1523050pjj;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1523040pji(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        C1C7U.LIZ("CreateSocketTaskApiHandler@507e.emitSocketEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        int i = this.LLILLL;
        String str2 = this.LLILLJJLI;
        Function1<JSONObject, Unit> function1 = this.LLILZ;
        jSONObject.put("socketTaskId", i);
        jSONObject.put("state", str2);
        function1.invoke(jSONObject);
        this.LL.LIZ.emitJSAPIEvent("SocketTaskStateChange", jSONObject);
        String str3 = this.LLILLJJLI;
        switch (str3.hashCode()) {
            case 3417674:
                if (str3.equals("open")) {
                    str = "onSocketTaskOpen";
                    this.LL.LIZ.emitJSAPIEvent(str, jSONObject);
                }
                break;
            case 94756344:
                if (str3.equals("close")) {
                    str = "onSocketTaskClose";
                    this.LL.LIZ.emitJSAPIEvent(str, jSONObject);
                }
                break;
            case 96784904:
                if (str3.equals("error")) {
                    str = "onSocketTaskError";
                    this.LL.LIZ.emitJSAPIEvent(str, jSONObject);
                }
                break;
            case 954925063:
                if (str3.equals("message")) {
                    str = "onSocketTaskMessage";
                    this.LL.LIZ.emitJSAPIEvent(str, jSONObject);
                }
                break;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreateSocketTaskApiHandler@507e.emitSocketEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
