package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveMultiGuestEffectFetchUtils$restoreMultiGuestEffectToLiveCoreForGuest$2", f = "LiveMultiGuestEffectFetchUtils.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C508801yY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508801yY(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, InterfaceC1364105Vn<? super C508801yY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveSmallItemBeautyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C508801yY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMultiGuestEffectFetchUtils@fbdb.restoreMultiGuestEffectToLiveCoreForGuest$2");
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
            C20441214yg.LJIIIZ("LiveMultiGuestEffectFetchUtils", "send FetchData");
            C1DEK c1dek = this.LLILLJJLI.LLILLJJLI;
            C403101hV c403101hV = C403101hV.LIZ;
            this.LL = 1;
            if (c1dek.LJIJI(c403101hV, this) == objLJFF) {
                C1C7U.LIZIZ("LiveMultiGuestEffectFetchUtils@fbdb.restoreMultiGuestEffectToLiveCoreForGuest$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveMultiGuestEffectFetchUtils@fbdb.restoreMultiGuestEffectToLiveCoreForGuest$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
