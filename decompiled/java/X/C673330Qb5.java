package X;

import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchMiddlePitayaHelper;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew$runPitayaTask$1", f = "EcSearchSuggestViewModelNew.kt", l = {646, 650}, m = "invokeSuspend")
public final class C673330Qb5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcSearchSuggestViewModelNew LLILLJJLI;
    public final /* synthetic */ C673920Qc2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673330Qb5(EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew, C673920Qc2 c673920Qc2, InterfaceC1364105Vn<? super C673330Qb5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecSearchSuggestViewModelNew;
        this.LLILLL = c673920Qc2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673330Qb5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0QER c0qer;
        String strOptString;
        JSONObject jSONObject;
        C1C7U.LIZ("EcSearchSuggestViewModelNew@29c4.runPitayaTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.runPitayaTask$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew = this.LLILLJJLI;
            C0QWJ c0qwj = ecSearchSuggestViewModelNew.LLILZ;
            if (c0qwj != null) {
                c0qer = c0qwj.LIZ;
            } else {
                c0qer = null;
            }
            JSONObject jSONObjectLIZ = EcSearchMiddlePitayaHelper.LIZ(c0qer, ((InterfaceC673060Qae) ecSearchSuggestViewModelNew.zQ2().getOperator()).LJIJJLI(this.LLILLJJLI.v4()));
            this.LL = 1;
            obj = EcSearchMiddlePitayaHelper.LIZLLL(jSONObjectLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.runPitayaTask$1");
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
            EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew2 = this.LLILLJJLI;
            C673920Qc2 c673920Qc22 = this.LLILLL;
            this.LL = 2;
            ecSearchSuggestViewModelNew2.getClass();
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ.plus(C2296908zH.LIZ()), new C673490QbL(c673920Qc22, c673690Qbf, ecSearchSuggestViewModelNew2, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.runPitayaTask$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.runPitayaTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
