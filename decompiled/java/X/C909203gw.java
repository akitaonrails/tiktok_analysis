package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C909203gw extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C910203h6 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909203gw(long j, C910203h6 c910203h6, String str, boolean z, boolean z2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = c910203h6;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str2 = this.LL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c957403oi2.LIZLLL("payment_method_id", str2);
        c957403oi2.LIZLLL("api_duration", Long.valueOf(System.currentTimeMillis() - this.LLILLJJLI));
        C910203h6 c910203h6 = this.LLILLL;
        if (c910203h6.LJII == EnumC934003kw.SUCCESS || (str = c910203h6.LJFF) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi2.LIZLLL("status_code", str);
        String str4 = this.LLILLL.LJI;
        if (str4 != null) {
            str3 = str4;
        }
        c957403oi2.LIZLLL("fail_reason", str3);
        c957403oi2.LIZLLL("enable_sync_success", Integer.valueOf(this.LLILZ ? 1 : 0));
        c957403oi2.LIZLLL("enable_trade_success", Integer.valueOf(this.LLILZIL ? 1 : 0));
        c957403oi2.LIZLLL("pay_schema_new_flow", Integer.valueOf(C925303jX.LIZ() ? 1 : 0));
        SettingsManager.LIZLLL().getClass();
        c957403oi2.LIZLLL("use_new_query_api", Integer.valueOf(SettingsManager.LIZ("ecom_payment_order_query_url_switch", false) ? 1 : 0));
        return Unit.LIZ;
    }
}
