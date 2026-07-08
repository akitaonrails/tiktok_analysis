package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.network.NetWorkDownloadJSWrap$downloadFile$1", f = "NetWorkModule.kt", l = {195, 221}, m = "invokeSuspend")
public final class C1524760pmU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1525160pn8 LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524760pmU(C1525160pn8 c1525160pn8, JSONObject jSONObject, int i, InterfaceC1364105Vn<? super C1524760pmU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1525160pn8;
        this.LLILLL = jSONObject;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1524760pmU(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        InterfaceC1524580pmC interfaceC1524580pmC;
        C1525120pn4 c1525120pn4LIZIZ;
        C1525180pnA c1525180pnA;
        Object obj2;
        Object obj3;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        C1C7U.LIZ("NetWorkDownloadJSWrap@eab6.downloadFile$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NetWorkDownloadJSWrap@eab6.downloadFile$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            c1525180pnA = null;
        } else {
            C155000ia.LIZIZ(obj);
            C1525040pmw c1525040pmw = this.LLILLJJLI.LIZ;
            if (c1525040pmw != null) {
                interfaceC1524580pmC = c1525040pmw.LIZ;
            } else {
                interfaceC1524580pmC = null;
            }
            C1524660pmK c1524660pmK = new C1524660pmK(interfaceC1524580pmC, c1525040pmw.LIZIZ, c1525040pmw.LIZJ);
            JSONObject jSONObject3 = this.LLILLL;
            int i2 = this.LLILZ;
            c1524660pmK.LIZLLL = i2;
            try {
                try {
                    c1525120pn4LIZIZ = c1524660pmK.LIZ(jSONObject3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1525120pn4LIZIZ = C1524690pmN.LIZIZ("downloadFile", th);
                }
                if (!c1525120pn4LIZIZ.LIZJ) {
                    C1525140pn6 c1525140pn6 = new C1525140pn6();
                    c1525140pn6.LIZ.put("requestTaskId", i2);
                    c1525120pn4LIZIZ = C1524690pmN.LIZJ("downloadFile", c1525140pn6.LIZ);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c1525120pn4LIZIZ = C1524690pmN.LIZIZ("downloadFile", th2);
            }
            c1525180pnA = new C1525180pnA(c1525120pn4LIZIZ);
            if (!c1525120pn4LIZIZ.LIZJ) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("NetWorkDownloadJSWrap@eab6.downloadFile$1");
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
        jSONObject4.put("downloadTaskId", i3);
        jSONObject4.put("errorMsg", obj3);
        jSONObject4.put("errorCode", iIntValue);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1524790pmX c1524790pmX = new C1524790pmX(this.LLILLJJLI, jSONObject4, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1524790pmX) == objLJFF) {
            C1C7U.LIZIZ("NetWorkDownloadJSWrap@eab6.downloadFile$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("NetWorkDownloadJSWrap@eab6.downloadFile$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
