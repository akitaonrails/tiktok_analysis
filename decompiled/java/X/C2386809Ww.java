package X;

import com.ss.android.ugc.aweme.tools.draft.DraftFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment$tryShowCleanStorageUI$1", f = "DraftFragment.kt", l = {518}, m = "invokeSuspend")
public final class C2386809Ww extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2386809Ww(DraftFragment draftFragment, InterfaceC1364105Vn<? super C2386809Ww> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2386809Ww(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftFragment@975a.tryShowCleanStorageUI$1");
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
            C19EG activity = this.LLILLJJLI.getActivity();
            if (activity != null) {
                DraftFragment draftFragment = this.LLILLJJLI;
                if (!activity.isFinishing() && !draftFragment.LLILZIL && C571820Mbk.LIZ(activity) && 1 != 0) {
                    DraftFragment draftFragment2 = this.LLILLJJLI;
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C561490M0l c561490M0l = new C561490M0l(draftFragment2, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c561490M0l) == objLJFF) {
                        C1C7U.LIZIZ("DraftFragment@975a.tryShowCleanStorageUI$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftFragment@975a.tryShowCleanStorageUI$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
