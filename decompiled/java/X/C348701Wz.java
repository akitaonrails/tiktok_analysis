package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.starship.strategy.model.StarshipModelPredict$onDeviceModelPredict$2", f = "StarshipModelPredict.kt", l = {32}, m = "invokeSuspend")
public final class C348701Wz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super JSONObject>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ JSONObject LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C348701Wz(String str, JSONObject jSONObject, long j, InterfaceC1364105Vn<? super C348701Wz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = jSONObject;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C348701Wz(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C259800zU c259800zU;
        C259800zU c259800zU2;
        Object obj2;
        String str;
        Integer numLJ;
        Integer numLJ2;
        int i;
        C1C7U.LIZ("StarshipModelPredict@1c32.onDeviceModelPredict$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILLL;
        if (i2 != 0) {
            if (i2 == 1) {
                c259800zU2 = this.LLILLJJLI;
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            c259800zU2 = new C259800zU();
            C1DFB c1dfb = C0PEM.LIZJ;
            C01X0 c01x0 = new C01X0(this.LLILZ, this.LLILZIL, this.LLILZLL, c259800zU, c259800zU2, null);
            this.LL = c259800zU;
            this.LLILLJJLI = c259800zU2;
            this.LLILLL = 1;
            if (C23250099c.LJI(this, c1dfb, c01x0) == objLJFF) {
                C1C7U.LIZIZ("StarshipModelPredict@1c32.onDeviceModelPredict$2");
                return objLJFF;
            }
        }
        if (c259800zU2.element != 0 && c259800zU.element == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("domain:");
            C1309260kAu c1309260kAu = (C1309260kAu) c259800zU2.element;
            String str2 = null;
            if (c1309260kAu != null) {
                str = c1309260kAu.LIZLLL;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(",code:");
            C1309260kAu c1309260kAu2 = (C1309260kAu) c259800zU2.element;
            if (c1309260kAu2 != null) {
                numLJ = C2286608xc.LJ(c1309260kAu2.LIZ);
            } else {
                numLJ = null;
            }
            sbLIZ.append(numLJ);
            sbLIZ.append(",subCode:");
            C1309260kAu c1309260kAu3 = (C1309260kAu) c259800zU2.element;
            if (c1309260kAu3 != null) {
                numLJ2 = C2286608xc.LJ(c1309260kAu3.LIZIZ);
            } else {
                numLJ2 = null;
            }
            sbLIZ.append(numLJ2);
            sbLIZ.append(",summary:");
            C1309260kAu c1309260kAu4 = (C1309260kAu) c259800zU2.element;
            if (c1309260kAu4 != null) {
                str2 = c1309260kAu4.LIZJ;
            }
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1309260kAu c1309260kAu5 = (C1309260kAu) c259800zU2.element;
            if (c1309260kAu5 != null) {
                i = c1309260kAu5.LIZ;
            } else {
                i = -1;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_msg", strLIZIZ);
            jSONObject.put("error_code", i);
            obj2 = jSONObject;
        } else {
            obj2 = c259800zU.element;
        }
        C1C7U.LIZIZ("StarshipModelPredict@1c32.onDeviceModelPredict$2");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super JSONObject> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
