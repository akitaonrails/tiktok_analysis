package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dKS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.rich.impression.impl.staticviewability.StaticImpressionSDKService$shouldSendEvent$1$1", f = "StaticImpressionSDKService.kt", l = {84}, m = "invokeSuspend")
public final class C1046100dKS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1046220dKe LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C1046110dKT LLILZIL;
    public final /* synthetic */ Pair<Float, Integer> LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC1046170dKZ LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1046100dKS(C1046220dKe c1046220dKe, int i, int i2, C1046110dKT c1046110dKT, Pair<Float, Integer> pair, long j, String str, InterfaceC1046170dKZ interfaceC1046170dKZ, InterfaceC1364105Vn<? super C1046100dKS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1046220dKe;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = c1046110dKT;
        this.LLILZLL = pair;
        this.LLIZ = j;
        this.LLIZLLLIL = str;
        this.LLJ = interfaceC1046170dKZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1046100dKS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineContext coroutineContextLLIILII;
        boolean z;
        Object objLJI = obj;
        C1C7U.LIZ("StaticImpressionSDKService@4e49.shouldSendEvent$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            if (this.LLILLJJLI.LIZ) {
                C1DFH c1dfh = C0PEM.LIZ;
                coroutineContextLLIILII = C2107308Nj.LIZ.LLIILII();
            } else {
                coroutineContextLLIILII = C0PEM.LIZ;
            }
            C1046090dKR c1046090dKR = new C1046090dKR(this.LLILZIL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, coroutineContextLLIILII, c1046090dKR);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("StaticImpressionSDKService@4e49.shouldSendEvent$1$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) objLJI;
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        long jLongValue = ((Number) pair.getSecond()).longValue();
        int i2 = this.LLILLL * this.LLILZ;
        ArrayList arrayList = new ArrayList();
        ArrayList<C1046070dKP> arrayList2 = this.LLILZIL.LJFF;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (C1046070dKP c1046070dKP : this.LLILZIL.LJFF) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1046070dKP.LIZ);
                sbLIZ.append(", ");
                sbLIZ.append(c1046070dKP.LIZIZ);
                sbLIZ.append(", ");
                sbLIZ.append(c1046070dKP.LIZJ - c1046070dKP.LIZ);
                sbLIZ.append(", ");
                sbLIZ.append(c1046070dKP.LIZLLL - c1046070dKP.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                String str = c1046070dKP.LJ;
                if (str == null) {
                    str = "";
                }
                arrayList.add(new C1046160dKY(str, c1046070dKP.LIZ() / i2));
            }
        }
        if (fFloatValue >= this.LLILZLL.getSecond().intValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LLJ.LIZ(new C1046150dKX(z, this.LLIZ + jLongValue, this.LLILZLL.getFirst().floatValue(), fFloatValue / i2, arrayList));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StaticImpressionSDKService@4e49.shouldSendEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
