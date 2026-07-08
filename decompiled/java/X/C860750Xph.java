package X;

import Y.AgS209S0200000_26;
import android.content.Context;
import com.ss.android.ugc.aweme.verify.bio.BioVerifyFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.bio.BioVerifyFragment$onViewCreated$1$1", f = "BioVerifyFragment.kt", l = {159}, m = "invokeSuspend")
public final class C860750Xph extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BioVerifyFragment LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860750Xph(BioVerifyFragment bioVerifyFragment, Context context, InterfaceC1364105Vn<? super C860750Xph> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bioVerifyFragment;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860750Xph(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BioVerifyFragment@bdd1.onViewCreated$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.WR().LLILLJJLI;
            AgS209S0200000_26 agS209S0200000_26 = new AgS209S0200000_26(this.LLILLL, this.LLILLJJLI, 0);
            this.LL = 1;
            if (c2252321DDq.collect(agS209S0200000_26, this) == objLJFF) {
                C1C7U.LIZIZ("BioVerifyFragment@bdd1.onViewCreated$1$1");
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
