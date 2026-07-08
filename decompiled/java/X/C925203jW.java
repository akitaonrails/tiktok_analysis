package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03jW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C925203jW extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ CommuteType LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ Map<String, Object> LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C925203jW(CommuteType commuteType, Boolean bool, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, Map map2, Map map3) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = l;
        this.LLILZ = str;
        this.LLILZIL = l2;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = bool;
        this.LLJ = str4;
        this.LLJI = commuteType;
        this.LLJIJIL = str5;
        this.LLJILJIL = str6;
        this.LLJILJILJ = str7;
        this.LLJILLL = str8;
        this.LLJJ = str9;
        this.LLJJI = map3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        IECommerceHostService iECommerceHostService;
        String name;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi2.LIZLLL("page_name", "payment_method");
        if (C925303jX.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi2.LIZLLL("is_upgrade", str);
        Map<String, ? extends Object> map = this.LL;
        if (map != null) {
            c957403oi2.LJ(map);
        }
        Map<String, ? extends Object> map2 = this.LLILLJJLI;
        if (map2 != null) {
            c957403oi2.LJ(map2);
        }
        Long l = this.LLILLL;
        if (l != null) {
            c957403oi2.LIZLLL("total_time", Long.valueOf(l.longValue()));
        }
        String str2 = this.LLILZ;
        if (str2 != null) {
            c957403oi2.LIZLLL("pay_request_id", str2);
        }
        Long l2 = this.LLILZIL;
        if (l2 != null) {
            c957403oi2.LIZLLL("create_order_time", Long.valueOf(l2.longValue()));
        }
        String str3 = this.LLILZLL;
        if (str3 != null) {
            c957403oi2.LIZLLL("payment_method_id", str3);
        }
        String str4 = this.LLIZ;
        if (str4 != null) {
            c957403oi2.LIZLLL("payment_method_name", str4);
        }
        Boolean bool = this.LLIZLLLIL;
        if (bool != null) {
            c957403oi2.LIZLLL("is_create_order", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str5 = this.LLJ;
        if (str5 != null) {
            c957403oi2.LIZLLL("source_page_type", str5);
        }
        CommuteType commuteType = this.LLJI;
        if (commuteType != null) {
            c957403oi2.LIZLLL("pay_commute_type", commuteType);
        }
        String str6 = this.LLJIJIL;
        if (str6 != null) {
            c957403oi2.LIZLLL("err_msg", str6);
        }
        String str7 = this.LLJILJIL;
        if (str7 != null) {
            c957403oi2.LIZLLL("code", str7);
        }
        String str8 = this.LLJILJILJ;
        if (str8 != null) {
            c957403oi2.LIZLLL("is_pay_succuss", str8);
        }
        String str9 = this.LLJILLL;
        if (str9 != null) {
            c957403oi2.LIZLLL("checkout_type", str9);
        }
        String str10 = this.LLJJ;
        if (str10 != null) {
            c957403oi2.LIZLLL("pay_route", str10);
        }
        Map<String, ? extends Object> map3 = this.LLJJI;
        if (map3 != null) {
            c957403oi2.LJ(map3);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            IApmDependencyService iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IApmDependencyService.class.getName();
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                name = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        c957403oi2.LIZLLL("traceparent", ((IApmDependencyService) iECommerceHostService).newTrackingTraceparent());
        return Unit.LIZ;
    }
}
