package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallTabRefreshAssem;

/* JADX INFO: renamed from: X.0k22, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallTabRefreshAssem", f = "MixMallTabRefreshAssem.kt", l = {311}, m = "waitToRefreshFinish")
public final class C1303760k22 extends AbstractC23140094w {
    public EnumC1303770k23 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixMallTabRefreshAssem LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303760k22(MixMallTabRefreshAssem mixMallTabRefreshAssem, InterfaceC1364105Vn<? super C1303760k22> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mixMallTabRefreshAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixMallTabRefreshAssem@7e11.waitToRefreshFinish$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objKo = this.LLILLL.ko(null, this);
        C1C7U.LIZIZ("MixMallTabRefreshAssem@7e11.waitToRefreshFinish$1");
        return objKo;
    }
}
