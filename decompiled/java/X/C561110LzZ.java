package X;

import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$initObserver$5$1", f = "DraftBoxFragment.kt", l = {642, 643}, m = "invokeSuspend")
public final class C561110LzZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxFragment LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561110LzZ(DraftBoxFragment draftBoxFragment, AwemeDraft awemeDraft, InterfaceC1364105Vn<? super C561110LzZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxFragment;
        this.LLILLL = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561110LzZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.initObserver$5$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DraftBoxFragment@80e.initObserver$5$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0M03 c0m03CS = this.LLILLJJLI.cS();
            Context context = this.LLILLJJLI.getContext();
            AwemeDraft awemeDraft = this.LLILLL;
            C561130Lzb c561130LzbWR = this.LLILLJJLI.WR();
            this.LL = 1;
            obj = c0m03CS.LJII(context, awemeDraft, c561130LzbWR, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftBoxFragment@80e.initObserver$5$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C561630M0z c561630M0z = new C561630M0z((C0M0P) obj, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c561630M0z) == objLJFF) {
            C1C7U.LIZIZ("DraftBoxFragment@80e.initObserver$5$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.initObserver$5$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
