package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.model.RawGameDetailHomeResponse$ResponseData;
import com.google.gson.n;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CUP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.impl.GamePreregisterService$callUpdateData$1$1", f = "GamePreregisterService.kt", l = {}, m = "invokeSuspend")
public final class C0CUP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C470590Icr<RawGameDetailHomeResponse$ResponseData> LL;
    public final /* synthetic */ C1882050z4l LLILLJJLI;
    public final /* synthetic */ Function1<JSONObject, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CUP(C470590Icr<RawGameDetailHomeResponse$ResponseData> c470590Icr, C1882050z4l c1882050z4l, Function1<? super JSONObject, Unit> function1, InterfaceC1364105Vn<? super C0CUP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c470590Icr;
        this.LLILLJJLI = c1882050z4l;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CUP(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String string;
        n nVar;
        C1C7U.LIZ("GamePreregisterService@ff4c.callUpdateData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RawGameDetailHomeResponse$ResponseData rawGameDetailHomeResponse$ResponseData = this.LL.data;
        if (rawGameDetailHomeResponse$ResponseData == null || (nVar = rawGameDetailHomeResponse$ResponseData.data) == null || (string = nVar.toString()) == null) {
            string = "{}";
        }
        JSONObject jSONObject = new JSONObject(string);
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        C1882050z4l c1882050z4l = this.LLILLJJLI;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (c1882050z4l.LLILZ.contains(next)) {
                jSONObject2.put(next, jSONObject.opt(next));
            }
        }
        InterfaceC497601wk interfaceC497601wkLJIILL = this.LLILLJJLI.LL.getPage().LJIILL();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wkLJIILL, C2107308Nj.LIZ, null, new C0CSM(this.LLILLJJLI, this.LLILLL, jSONObject2, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GamePreregisterService@ff4c.callUpdateData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
