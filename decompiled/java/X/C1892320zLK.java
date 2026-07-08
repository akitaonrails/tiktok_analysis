package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.BCSwitchStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.influencer.widget.LSProductBeforeLiveWidget$updateBCSwitchStatus$2", f = "LSProductBeforeLiveWidget.kt", l = {233}, m = "invokeSuspend")
public final class C1892320zLK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1892390zLR LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892320zLK(C1892390zLR c1892390zLR, String str, InterfaceC1364105Vn<? super C1892320zLK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1892390zLR;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892320zLK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Integer numLJ;
        String str;
        Integer numLJ2;
        int i;
        Object objLJI = obj;
        C1C7U.LIZ("LSProductBeforeLiveWidget@c27b.updateBCSwitchStatus$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        String str2 = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJI);
            } else {
                C155000ia.LIZIZ(objLJI);
                C1DFB c1dfb = C0PEM.LIZJ;
                C1892340zLM c1892340zLM = new C1892340zLM(null);
                this.LL = 1;
                objLJI = C23250099c.LJI(this, c1dfb, c1892340zLM);
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("LSProductBeforeLiveWidget@c27b.updateBCSwitchStatus$2");
                    return objLJFF;
                }
            }
            BCSwitchStatusResponse bCSwitchStatusResponse = (BCSwitchStatusResponse) objLJI;
            if (bCSwitchStatusResponse != null && bCSwitchStatusResponse.status_code == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C180W c180w = (C180W) this.LLILLJJLI.LLILZLL.getValue();
                if (c180w != null) {
                    c180w.LIZJ(new C758950Tpt(bCSwitchStatusResponse.bcSwitchOn, bCSwitchStatusResponse.bcSwitchReadOnly, false, false, C2286608xc.LJ(0)));
                }
                C180W c180w2 = (C180W) this.LLILLJJLI.LLILZLL.getValue();
                if (c180w2 != null) {
                    if (Intrinsics.LJFF(bCSwitchStatusResponse.bcSwitchOn, true) && Intrinsics.LJFF(bCSwitchStatusResponse.bcSwitchReadOnly, true)) {
                        i = 1;
                    } else {
                        i = 3;
                    }
                    c180w2.LJFF(i, 4, null);
                }
            } else {
                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateBCSwitchStatus===network error==status_code=");
                if (bCSwitchStatusResponse == null) {
                    numLJ = null;
                } else {
                    numLJ = C2286608xc.LJ(bCSwitchStatusResponse.status_code);
                }
                sbLIZ.append(numLJ);
                sbLIZ.append("===msg=");
                if (bCSwitchStatusResponse == null) {
                    str = null;
                } else {
                    str = bCSwitchStatusResponse.message;
                }
                sbLIZ.append(str);
                c2276471E8n.LIZ("ttls-live", "LSProductBeforeLiveWidget", C2188811AlT.LIZIZ(sbLIZ));
            }
            C1892390zLR c1892390zLR = this.LLILLJJLI;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source", this.LLILLL);
            jSONObject.put("by_catch", 0);
            if (bCSwitchStatusResponse != null) {
                numLJ2 = C2286608xc.LJ(bCSwitchStatusResponse.status_code);
            } else {
                numLJ2 = null;
            }
            jSONObject.put("response_status_code", numLJ2);
            if (bCSwitchStatusResponse != null) {
                str2 = bCSwitchStatusResponse.message;
            }
            jSONObject.put("response_message", str2);
            c1892390zLR.LJJI("StepResponseToggle", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1892390zLR c1892390zLR2 = this.LLILLJJLI;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("source", this.LLILLL);
            jSONObject2.put("by_catch", 1);
            jSONObject2.put("catch_e_message", e.getMessage());
            c1892390zLR2.LJJI("StepResponseToggle", jSONObject2);
            C2276471E8n.LIZIZ.LIZJ("ttls-live", e, "LSProductBeforeLiveWidget", "updateBCSwitchStatus===network error==");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LSProductBeforeLiveWidget@c27b.updateBCSwitchStatus$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
