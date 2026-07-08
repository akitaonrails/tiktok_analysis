package X;

import com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel$proceedNoCandidateBackendJudge$2", f = "BioVerifyViewModel.kt", l = {130}, m = "invokeSuspend")
public final class C1714840uj4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BioVerifyViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ BioVerifyViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714840uj4(BioVerifyViewModel bioVerifyViewModel, InterfaceC1364105Vn<? super C1714840uj4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bioVerifyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1714840uj4(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BioVerifyViewModel bioVerifyViewModel;
        C1C7U.LIZ("BioVerifyViewModel@d5f8.proceedNoCandidateBackendJudge$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                bioVerifyViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            bioVerifyViewModel = this.LLILLL;
            C1713570uh1 c1713570uh1 = bioVerifyViewModel.LLJ;
            if (c1713570uh1 != null) {
                C1714950ujF c1714950ujF = new C1714950ujF(c1713570uh1, bioVerifyViewModel.LLIZLLLIL, null, new C1714630uij(c1713570uh1, null));
                this.LL = bioVerifyViewModel;
                this.LLILLJJLI = 1;
                obj = c1714950ujF.LIZIZ("", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BioVerifyViewModel@d5f8.proceedNoCandidateBackendJudge$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BioVerifyViewModel@d5f8.proceedNoCandidateBackendJudge$2");
            return unit;
        }
        bioVerifyViewModel.xQ2((InterfaceC1715120ujW) obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BioVerifyViewModel@d5f8.proceedNoCandidateBackendJudge$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
