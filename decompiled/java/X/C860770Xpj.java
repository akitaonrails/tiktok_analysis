package X;

import Y.AgS306S0100000_26;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollStepFragment$onViewCreated$1$1", f = "BioEnrollStepFragment.kt", l = {119}, m = "invokeSuspend")
public final class C860770Xpj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BioEnrollStepFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860770Xpj(BioEnrollStepFragment bioEnrollStepFragment, InterfaceC1364105Vn<? super C860770Xpj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bioEnrollStepFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860770Xpj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BioEnrollStepFragment@5a3e.onViewCreated$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.NR().LLILLL;
            AgS306S0100000_26 agS306S0100000_26 = new AgS306S0100000_26(this.LLILLJJLI, 1);
            this.LL = 1;
            if (c2252321DDq.collect(agS306S0100000_26, this) == objLJFF) {
                C1C7U.LIZIZ("BioEnrollStepFragment@5a3e.onViewCreated$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
