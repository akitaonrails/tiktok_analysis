package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Xsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel$switchToKey$1$1", f = "CreatorRankingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C862780Xsy extends C09AX implements Function2<C0YT0, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreatorRankingPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862780Xsy(CreatorRankingPageViewModel creatorRankingPageViewModel, InterfaceC1364105Vn<? super C862780Xsy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C862780Xsy c862780Xsy = new C862780Xsy(this.LLILLJJLI, interfaceC1364105Vn);
        c862780Xsy.LL = obj;
        return c862780Xsy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.switchToKey$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YT0 c0yt0 = (C0YT0) this.LL;
        if (!Intrinsics.LJFF(c0yt0.LIZ, this.LLILLJJLI.LLJI.getValue())) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.switchToKey$1$1");
            return unit;
        }
        this.LLILLJJLI.zQ2(c0yt0);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.switchToKey$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0YT0 c0yt0, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0yt0, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
