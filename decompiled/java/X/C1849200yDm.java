package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.module.StorageJSWrapKeva$getStorage$1", f = "StorageModule.kt", l = {436}, m = "invokeSuspend")
public final class C1849200yDm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ C1849390yE5 LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1849200yDm(JSONObject jSONObject, C1849390yE5 c1849390yE5, int i, InterfaceC1364105Vn<? super C1849200yDm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = jSONObject;
        this.LLILLL = c1849390yE5;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1849200yDm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String string;
        C1849360yE2 c1849360yE2;
        InterfaceC1525090pn1 interfaceC1525090pn1;
        C2220181Buy c2220181BuyLIZ;
        C1849360yE2 c1849360yE22;
        InterfaceC1525090pn1 interfaceC1525090pn12;
        C1C7U.LIZ("StorageJSWrapKeva@7dec.getStorage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object objOpt = this.LLILLJJLI.opt("key");
            if (objOpt instanceof String) {
                if (!(!a0.LJJJIL((String) objOpt))) {
                    objOpt = null;
                }
                string = (String) objOpt;
            } else {
                if (objOpt instanceof Number) {
                    string = objOpt.toString();
                }
                c1849360yE2 = this.LLILLL.LIZIZ;
                if (c1849360yE2 != null && (interfaceC1525090pn1 = c1849360yE2.LIZIZ) != null) {
                    interfaceC1525090pn1.LJJLIIJ(C2286608xc.LJ(this.LLILZ), C2220181Buy.LIZLLL);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StorageJSWrapKeva@7dec.getStorage$1");
                return unit;
            }
            if (string != null) {
                C1849210yDn c1849210yDnLIZ = this.LLILLL.LIZ();
                if (c1849210yDnLIZ != null) {
                    this.LL = 1;
                    obj = c1849210yDnLIZ.LJI(string, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("StorageJSWrapKeva@7dec.getStorage$1");
                        return objLJFF;
                    }
                }
                c2220181BuyLIZ = C2220181Buy.LIZJ;
                c1849360yE22 = this.LLILLL.LIZIZ;
                if (c1849360yE22 != null && (interfaceC1525090pn12 = c1849360yE22.LIZIZ) != null) {
                    interfaceC1525090pn12.LJJLIIJ(C2286608xc.LJ(this.LLILZ), c2220181BuyLIZ);
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("StorageJSWrapKeva@7dec.getStorage$1");
                return unit2;
            }
            c1849360yE2 = this.LLILLL.LIZIZ;
            if (c1849360yE2 != null) {
                interfaceC1525090pn1.LJJLIIJ(C2286608xc.LJ(this.LLILZ), C2220181Buy.LIZLLL);
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("StorageJSWrapKeva@7dec.getStorage$1");
            return unit3;
        }
        C2220221Bv2 c2220221Bv2 = (C2220221Bv2) obj;
        if (c2220221Bv2 != null) {
            c2220181BuyLIZ = c2220221Bv2.LIZ();
        } else {
            c2220181BuyLIZ = C2220181Buy.LIZJ;
        }
        c1849360yE22 = this.LLILLL.LIZIZ;
        if (c1849360yE22 != null) {
            interfaceC1525090pn12.LJJLIIJ(C2286608xc.LJ(this.LLILZ), c2220181BuyLIZ);
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("StorageJSWrapKeva@7dec.getStorage$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
