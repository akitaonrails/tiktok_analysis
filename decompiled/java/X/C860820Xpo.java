package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingFirstTabPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.ui.CreatorRankingFirstTabPageFragment$onViewCreated$2", f = "CreatorRankingFirstTabPageFragment.kt", l = {155}, m = "invokeSuspend")
public final class C860820Xpo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreatorRankingFirstTabPageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860820Xpo(CreatorRankingFirstTabPageFragment creatorRankingFirstTabPageFragment, InterfaceC1364105Vn<? super C860820Xpo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingFirstTabPageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860820Xpo(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingFirstTabPageFragment@c16.onViewCreated$2");
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
            LifecycleOwner viewLifecycleOwner = this.LLILLJJLI.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.STARTED;
            C860830Xpp c860830Xpp = new C860830Xpp(this.LLILLJJLI, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c860830Xpp, this) == objLJFF) {
                C1C7U.LIZIZ("CreatorRankingFirstTabPageFragment@c16.onViewCreated$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingFirstTabPageFragment@c16.onViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
