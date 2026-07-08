package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.network.NetWorkSystemRequestJSWrap$request$1", f = "NetWorkModule.kt", l = {130, 154}, m = "invokeSuspend")
public final class C1524770pmV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1525170pn9 LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524770pmV(C1525170pn9 c1525170pn9, JSONObject jSONObject, int i, InterfaceC1364105Vn<? super C1524770pmV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1525170pn9;
        this.LLILLL = jSONObject;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1524770pmV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC1304870k3p interfaceC1304870k3p;
        InterfaceC1525090pn1 interfaceC1525090pn1;
        C1304160k2g c1304160k2g;
        C1525120pn4 c1525120pn4LIZIZ;
        C1525180pnA c1525180pnA;
        Object obj2;
        Object obj3;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        C1C7U.LIZ("NetWorkSystemRequestJSWrap@5e78.request$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NetWorkSystemRequestJSWrap@5e78.request$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            c1525180pnA = null;
        } else {
            C155000ia.LIZIZ(obj);
            C1525060pmy c1525060pmy = this.LLILLJJLI.LIZ;
            if (c1525060pmy != null) {
                interfaceC1304870k3p = c1525060pmy.LIZ;
            } else {
                interfaceC1304870k3p = null;
            }
            if (c1525060pmy != null) {
                interfaceC1525090pn1 = c1525060pmy.LIZIZ;
            } else {
                interfaceC1525090pn1 = null;
            }
            if (c1525060pmy != null) {
                c1304160k2g = c1525060pmy.LIZJ;
            } else {
                c1304160k2g = null;
            }
            C1524610pmF c1524610pmF = new C1524610pmF(interfaceC1304870k3p, interfaceC1525090pn1, c1304160k2g);
            JSONObject jSONObject3 = this.LLILLL;
            int i2 = this.LLILZ;
            c1524610pmF.LIZLLL = i2;
            try {
                try {
                    c1525120pn4LIZIZ = c1524610pmF.LIZ(jSONObject3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1525120pn4LIZIZ = C1524690pmN.LIZIZ("request", th);
                }
                if (!c1525120pn4LIZIZ.LIZJ) {
                    C1525140pn6 c1525140pn6 = new C1525140pn6();
                    c1525140pn6.LIZ.put("requestTaskId", i2);
                    c1525120pn4LIZIZ = C1524690pmN.LIZJ("request", c1525140pn6.LIZ);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c1525120pn4LIZIZ = C1524690pmN.LIZIZ("request", th2);
            }
            c1525180pnA = new C1525180pnA(c1525120pn4LIZIZ);
            if (!c1525120pn4LIZIZ.LIZJ) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("NetWorkSystemRequestJSWrap@5e78.request$1");
                return unit2;
            }
        }
        C1525120pn4 c1525120pn4 = c1525180pnA.LIZ;
        if (c1525120pn4 != null && (jSONObject2 = c1525120pn4.LIZ) != null) {
            obj2 = jSONObject2.get("errNo");
        } else {
            obj2 = null;
        }
        int iIntValue = ((Integer) obj2).intValue();
        C1525120pn4 c1525120pn42 = c1525180pnA.LIZ;
        if (c1525120pn42 != null && (jSONObject = c1525120pn42.LIZ) != null) {
            obj3 = jSONObject.get("errMsg");
        } else {
            obj3 = null;
        }
        JSONObject jSONObject4 = new JSONObject();
        int i3 = this.LLILZ;
        jSONObject4.put("state", "fail");
        jSONObject4.put("requestTaskId", i3);
        jSONObject4.put("errorMsg", obj3);
        jSONObject4.put("errorCode", iIntValue);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1524800pmY c1524800pmY = new C1524800pmY(this.LLILLJJLI, jSONObject4, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1524800pmY) == objLJFF) {
            C1C7U.LIZIZ("NetWorkSystemRequestJSWrap@5e78.request$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("NetWorkSystemRequestJSWrap@5e78.request$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
