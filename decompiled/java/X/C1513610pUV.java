package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.profile.business.profile.prediction.exp.FYP2ProfilePredictConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0pUV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.prediction.FYP2ProfilePredictHelper$runSmartService$1$1", f = "FYP2ProfilePredictHelper.kt", l = {54}, m = "invokeSuspend")
public final class C1513610pUV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FYP2ProfilePredictConfig LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513610pUV(FYP2ProfilePredictConfig fYP2ProfilePredictConfig, Aweme aweme, Function0<Unit> function0, InterfaceC1364105Vn<? super C1513610pUV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fYP2ProfilePredictConfig;
        this.LLILLL = aweme;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1513610pUV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("FYP2ProfilePredictHelper@51b7.runSmartService$1$1");
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
            long j = ((long) this.LLILLJJLI.delayTime) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("FYP2ProfilePredictHelper@51b7.runSmartService$1$1");
                return objLJFF;
            }
        }
        if (Intrinsics.LJFF(C1513630pUX.LIZLLL, this.LLILLL.getAid()) && !C1513630pUX.LJ) {
            if (C1513630pUX.LIZIZ == null) {
                C01GW c01gw = C1513640pUY.LIZJ;
                String str2 = (String) c01gw.getValue();
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                C1510230pP3 c1510230pP3 = new C1510230pP3(str2);
                c1510230pP3.LIZIZ = (SmartSceneConfig) C1513640pUY.LIZIZ.getValue();
                C1513630pUX.LIZ = c1510230pP3;
                C1511390pQv c1511390pQvLIZ = C1511420pQy.LIZ();
                String str4 = (String) c01gw.getValue();
                if (str4 != null) {
                    str3 = str4;
                }
                C1513630pUX.LIZIZ = c1511390pQvLIZ.LIZ(str3, C1513630pUX.LIZ);
            }
            C0N33 c0n33 = new C0N33();
            c0n33.LJIIJ = this.LLILLL;
            C1513630pUX.LIZJ = c0n33;
            AbstractC1511510pR7 abstractC1511510pR7 = C1513630pUX.LIZIZ;
            if (abstractC1511510pR7 != null) {
                C1509310pNZ c1509310pNZ = C1513630pUX.LIZJ;
                final FYP2ProfilePredictConfig fYP2ProfilePredictConfig = this.LLILLJJLI;
                final Function0<Unit> function0 = this.LLILZ;
                abstractC1511510pR7.runAsyncDelay(0L, c1509310pNZ, new InterfaceC1511740pRU() { // from class: X.0pUW
                    @Override // X.InterfaceC1511740pRU
                    public final void LIZ(C1512100pS4 c1512100pS4) {
                        float fFloatValue;
                        Map<String, Float> map;
                        Float f;
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("run model, result is ");
                        sbLIZ.append(c1512100pS4);
                        C1720106oR.LJI("FYP2ProfilePredictHelper", C2188811AlT.LIZIZ(sbLIZ));
                        if (c1512100pS4 != null && (map = c1512100pS4.LIZJ) != null && (f = map.get(fYP2ProfilePredictConfig.targetKey)) != null) {
                            fFloatValue = f.floatValue();
                        } else {
                            fFloatValue = 0.0f;
                        }
                        if (fFloatValue > fYP2ProfilePredictConfig.positiveThreshold) {
                            function0.invoke();
                        }
                    }
                });
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FYP2ProfilePredictHelper@51b7.runSmartService$1$1");
            return unit;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop model, reason is ");
        if (!Intrinsics.LJFF(C1513630pUX.LIZLLL, this.LLILLL.getAid())) {
            str = "change aweme";
        } else {
            str = "go to profile";
        }
        sbLIZ.append(str);
        C1720106oR.LJI("FYP2ProfilePredictHelper", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FYP2ProfilePredictHelper@51b7.runSmartService$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
