package X;

import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.shopbag.FlashSaleInfoForJs;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.shopbag.PublishAudienceEventData;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$5$params$1", f = "ECDuringLiveBroadcasterWidget.kt", l = {}, m = "invokeSuspend")
public final class C503401xg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ IMessage LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503401xg(IMessage iMessage, String str, InterfaceC1364105Vn<? super C503401xg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMessage;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C503401xg(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZLLL;
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$5$params$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            strLIZLLL = C08JS.LIZLLL(new PublishAudienceEventData(((ECommerceMessage) this.LL).actionType, new FlashSaleInfoForJs(this.LLILLJJLI)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZLLL = null;
        }
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$5$params$1");
        return strLIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
