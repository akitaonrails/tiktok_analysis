package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchMiddlePitayaHelper;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel$runPitayaTask$1", f = "SuggestAssemViewModel.kt", l = {1100, 1104}, m = "invokeSuspend")
public final class C673340Qb6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SuggestAssemViewModel LLILLJJLI;
    public final /* synthetic */ C673920Qc2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673340Qb6(SuggestAssemViewModel suggestAssemViewModel, C673920Qc2 c673920Qc2, InterfaceC1364105Vn<? super C673340Qb6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = suggestAssemViewModel;
        this.LLILLL = c673920Qc2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673340Qb6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0QER c0qer;
        C0QER c0qer2;
        String strOptString;
        JSONObject jSONObject;
        C1C7U.LIZ("SuggestAssemViewModel@b236.runPitayaTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SuggestAssemViewModel@b236.runPitayaTask$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SuggestAssemViewModel suggestAssemViewModel = this.LLILLJJLI;
            C0QWJ c0qwj = suggestAssemViewModel.LLILLL;
            if (c0qwj != null) {
                c0qer = c0qwj.LIZ;
            } else {
                c0qer = null;
            }
            InterfaceC673410QbD interfaceC673410QbD = (InterfaceC673410QbD) suggestAssemViewModel.DQ2().getOperator();
            C0QWJ c0qwj2 = this.LLILLJJLI.LLILLL;
            if (c0qwj2 != null) {
                c0qer2 = c0qwj2.LIZ;
            } else {
                c0qer2 = null;
            }
            JSONObject jSONObjectLIZ = EcSearchMiddlePitayaHelper.LIZ(c0qer, interfaceC673410QbD.LLLIL(c0qer2, !r2.LL, null, null));
            this.LL = 1;
            obj = EcSearchMiddlePitayaHelper.LIZLLL(jSONObjectLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SuggestAssemViewModel@b236.runPitayaTask$1");
                return objLJFF;
            }
        }
        C673690Qbf c673690Qbf = (C673690Qbf) obj;
        if (c673690Qbf != null && (jSONObject = c673690Qbf.LIZIZ) != null) {
            strOptString = jSONObject.optString("log_extra");
        } else {
            strOptString = null;
        }
        C673920Qc2 c673920Qc2 = this.LLILLL;
        c673920Qc2.LIZ.LJI = Long.valueOf(System.currentTimeMillis());
        C673990Qc9 c673990Qc9 = c673920Qc2.LIZ;
        c673990Qc9.LJIIJJI = strOptString;
        c673990Qc9.LJ = EnumC673930Qc3.PITAYA_END_TIME;
        c673920Qc2.LIZJ();
        if (c673690Qbf != null && Intrinsics.LJFF(c673690Qbf.LIZ, true)) {
            SuggestAssemViewModel suggestAssemViewModel2 = this.LLILLJJLI;
            C673920Qc2 c673920Qc22 = this.LLILLL;
            this.LL = 2;
            suggestAssemViewModel2.getClass();
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ.plus(C2296908zH.LIZ()), new C673500QbM(c673920Qc22, c673690Qbf, suggestAssemViewModel2, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("SuggestAssemViewModel@b236.runPitayaTask$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SuggestAssemViewModel@b236.runPitayaTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
