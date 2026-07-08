package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$initObserver$3$1$1", f = "DraftBoxFragment.kt", l = {583}, m = "invokeSuspend")
public final class C561340Lzw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DraftBoxFragment LLILLL;
    public final /* synthetic */ Boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561340Lzw(DraftBoxFragment draftBoxFragment, Boolean bool, InterfaceC1364105Vn<? super C561340Lzw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = draftBoxFragment;
        this.LLILZ = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C561340Lzw c561340Lzw = new C561340Lzw(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c561340Lzw.LLILLJJLI = obj;
        return c561340Lzw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.initObserver$3$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                DraftBoxFragment draftBoxFragment = this.LLILLL;
                this.LL = 1;
                if (draftBoxFragment.nS(this) == objLJFF) {
                    C1C7U.LIZIZ("DraftBoxFragment@80e.initObserver$3$1$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C0M0W c0m0w = this.LLILLL.LLLFZ;
        if (c0m0w != null) {
            c0m0w.LIZIZ();
        }
        int iCw = this.LLILLL.dS().vQ2().Cw();
        this.LLILLL.dS().vQ2().ww(this.LLILZ.booleanValue());
        this.LLILLL.dS().wQ2(iCw, this.LLILLL.getEnterFrom(), this.LLILLL.LLJJJ, this.LLILZ.booleanValue());
        this.LLILLL.dS().xQ2();
        this.LLILLL.VR().notifyItemRangeChanged(0, this.LLILLL.VR().getItemCount(), "edit_mode_change");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.initObserver$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
