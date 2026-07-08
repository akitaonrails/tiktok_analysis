package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Xt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel$retry$1", f = "CreatorRankingPageViewModel.kt", l = {537}, m = "invokeSuspend")
public final class C862800Xt0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreatorRankingPageViewModel LLILLJJLI;
    public final /* synthetic */ C861890XrX LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862800Xt0(CreatorRankingPageViewModel creatorRankingPageViewModel, C861890XrX c861890XrX, InterfaceC1364105Vn<? super C862800Xt0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageViewModel;
        this.LLILLL = c861890XrX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C862800Xt0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.retry$1");
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
            C1785380wYq c1785380wYqLIZJ = ((C0YUW) this.LLILLJJLI.IQ2()).LIZJ(this.LLILLL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("retry hasCache=");
            if (c1785380wYqLIZJ != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C20441214yg.LIZIZ("CreatorRankingPageViewModel", C2188811AlT.LIZIZ(sbLIZ));
            if (c1785380wYqLIZJ == null) {
                this.LLILLJJLI.PQ2(this.LLILLL);
            }
            InterfaceC875080YUo interfaceC875080YUoIQ2 = this.LLILLJJLI.IQ2();
            C861890XrX c861890XrX = this.LLILLL;
            CreatorRankingPageViewModel creatorRankingPageViewModel = this.LLILLJJLI;
            long j = creatorRankingPageViewModel.LLJJIJIIJIL;
            long j2 = creatorRankingPageViewModel.LLJJIJI;
            this.LL = 1;
            obj = ((C0YUW) interfaceC875080YUoIQ2).LIZIZ(c861890XrX, j, j2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.retry$1");
                return objLJFF;
            }
        }
        C0YT0 c0yt0 = (C0YT0) obj;
        if (Intrinsics.LJFF(c0yt0.LIZ, this.LLILLJJLI.LLJI.getValue())) {
            this.LLILLJJLI.zQ2(c0yt0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.retry$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
