package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$updateDraftMemorySize$1", f = "DraftBoxFragment.kt", l = {1114}, m = "invokeSuspend")
public final class C561170Lzf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561170Lzf(DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C561170Lzf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561170Lzf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DraftBoxFragment@80e.updateDraftMemorySize$1");
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
            C0M03 c0m03CS = this.LLILLJJLI.cS();
            C561130Lzb c561130LzbWR = this.LLILLJJLI.WR();
            this.LL = 1;
            c0m03CS.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C561250Lzn(c0m03CS, null, null, c561130LzbWR, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftBoxFragment@80e.updateDraftMemorySize$1");
                return objLJFF;
            }
        }
        long jLongValue = ((Number) obj).longValue();
        DraftBoxFragment draftBoxFragment = this.LLILLJJLI;
        draftBoxFragment.LLJLL = jLongValue;
        AnonymousClass0880.LIZ(draftBoxFragment.dS().LLILLL, C2286608xc.LJFF(jLongValue));
        this.LLILLJJLI.cS().LJIIJ = jLongValue;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.updateDraftMemorySize$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
