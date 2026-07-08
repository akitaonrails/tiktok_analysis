package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import njp.a;

/* JADX INFO: renamed from: X.0NKR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.shortcut.ShopMallShortcutGuideTrigger$showShortcutGuide$1$job$1", f = "ShopMallShortcutGuideTrigger.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C0NKR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NKR(Fragment fragment, InterfaceC1364105Vn<? super C0NKR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NKR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallShortcutGuideTrigger@a8d9.showShortcutGuide$1$job$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(15000L, this) == objLJFF) {
                C1C7U.LIZIZ("ShopMallShortcutGuideTrigger@a8d9.showShortcutGuide$1$job$1");
                return objLJFF;
            }
        }
        ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIIJ(this.LLILLJJLI, "shop", AFwS213S0000000_24.get$arr$(570), AFwS264S0000000_24.get$arr$(679), null, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallShortcutGuideTrigger@a8d9.showShortcutGuide$1$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
