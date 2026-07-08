package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HO5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel$onPrepared$1$2", f = "MixStudioBaseViewModel.kt", l = {165}, m = "invokeSuspend")
public final class C0HO5 extends C09AX implements Function2<Pair<? extends AbstractC440540HPg, ? extends List<? extends C440830HQj>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioBaseViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HO5(MixStudioBaseViewModel mixStudioBaseViewModel, InterfaceC1364105Vn<? super C0HO5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mixStudioBaseViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HO5 c0ho5 = new C0HO5(this.LLILLL, interfaceC1364105Vn);
        c0ho5.LLILLJJLI = obj;
        return c0ho5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioBaseViewModel@9c39.onPrepared$1$2");
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
            Pair pair = (Pair) this.LLILLJJLI;
            AbstractC440540HPg abstractC440540HPg = (AbstractC440540HPg) pair.getFirst();
            List list = (List) pair.getSecond();
            MixStudioBaseViewModel mixStudioBaseViewModel = this.LLILLL;
            int size = list.size();
            this.LL = 1;
            if (mixStudioBaseViewModel.yQ2(abstractC440540HPg, size, false, this) == objLJFF) {
                C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.onPrepared$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.onPrepared$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends AbstractC440540HPg, ? extends List<? extends C440830HQj>> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
