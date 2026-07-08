package X;

import com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetSyncWorker;
import com.ss.android.ugc.aweme.ecommerce.marketing.widget.api.BonusWidgetDataResponse;

/* JADX INFO: renamed from: X.0y03, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.marketing.widget.BonusWidgetSyncWorker", f = "BonusWidgetSyncWorker.kt", l = {89, 98, 115, 116}, m = "doWork")
public final class C1840690y03 extends AbstractC23140094w {
    public Object LL;
    public BonusWidgetDataResponse LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ BonusWidgetSyncWorker LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1840690y03(BonusWidgetSyncWorker bonusWidgetSyncWorker, InterfaceC1364105Vn<? super C1840690y03> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = bonusWidgetSyncWorker;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BonusWidgetSyncWorker@9e6c.doWork$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZIL.LJII(this);
        C1C7U.LIZIZ("BonusWidgetSyncWorker@9e6c.doWork$1");
        return objLJII;
    }
}
