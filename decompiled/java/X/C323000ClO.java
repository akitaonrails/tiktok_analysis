package X;

import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ClO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel$cacheData$1", f = "RepostListViewModel.kt", l = {334}, m = "invokeSuspend")
public final class C323000ClO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1260790iuj>, Object> {
    public int LL;
    public final /* synthetic */ RepostListViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323000ClO(RepostListViewModel repostListViewModel, boolean z, InterfaceC1364105Vn<? super C323000ClO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = repostListViewModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323000ClO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("RepostListViewModel@7b6b.cacheData$1");
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
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("RepostTabFragment", "cacheData: start");
            RepostListViewModel repostListViewModel = this.LLILLJJLI;
            String str = repostListViewModel.LLIZLLLIL;
            boolean z = this.LLILLL;
            this.LL = 1;
            obj = repostListViewModel.CQ2(str, 0L, 12, 0, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RepostListViewModel@7b6b.cacheData$1");
                return objLJFF;
            }
        }
        int i3 = C2187451AjH.LIZ;
        C1720106oR.LJI("RepostTabFragment", "cacheData: end");
        C1C7U.LIZIZ("RepostListViewModel@7b6b.cacheData$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1260790iuj> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
