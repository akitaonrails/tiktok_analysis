package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.TTMallTabRelatedUserInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallentry.action.EcMallEntryRouteActionForRouteParams$handle$1", f = "EcMallEntryRouteActionForRouteParams.kt", l = {}, m = "invokeSuspend")
public final class C1767560w66 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ C1767550w65 LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1767560w66(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z2, C1767550w65 c1767550w65, InterfaceC1364105Vn<? super C1767560w66> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = z2;
        this.LLJI = c1767550w65;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1767560w66(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        long j;
        String str3;
        boolean zIsMallTabDisplay;
        C1C7U.LIZ("EcMallEntryRouteActionForRouteParams@1ccf.handle$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            str = "";
        } else {
            C0CXF.LIZ.getClass();
            boolean zIsLogin = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
            TTMallTabRelatedUserInfo tTMallTabRelatedUserInfo = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().mallTabUserInfo;
            if (tTMallTabRelatedUserInfo != null) {
                zIsMallTabDisplay = tTMallTabRelatedUserInfo.isMallTabDisplay();
            } else {
                zIsMallTabDisplay = false;
            }
            if (!C0CXF.LIZIZ() && !C0CXF.LIZJ()) {
                str = "experiment invalid";
            } else if (zIsLogin && !zIsMallTabDisplay) {
                str = "user info invalid";
            } else {
                str = "no mall show";
            }
        }
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        if (this.LL) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        String str4 = this.LLILLJJLI;
        String str5 = this.LLILLL;
        String str6 = this.LLILZ;
        String str7 = this.LLILZIL;
        String str8 = this.LLILZLL;
        String str9 = this.LLIZ;
        String str10 = this.LLIZLLLIL;
        boolean z = this.LLJ;
        C1767550w65 c1767550w65 = this.LLJI;
        String str11 = c1767550w65.LJIILL;
        String str12 = c1767550w65.LJIILJJIL;
        Map<String, ? extends Object> map = c1767550w65.LJJIJ;
        c1767950w6j.getClass();
        HashMap map2 = new HashMap();
        map2.put("is_success", str2);
        if (str4 == null) {
            str4 = "";
        }
        map2.put("deeplink_type", str4);
        if (str5 == null) {
            str5 = "";
        }
        map2.put("top_product_id", str5);
        map2.put("error_info", str);
        map2.put("position_type", str6);
        if (str7 == null) {
            str7 = "";
        }
        map2.put("previous_page", str7);
        if (str8 == null) {
            str8 = "";
        }
        map2.put("schema", str8);
        if (str9 == null) {
            str9 = "";
        }
        map2.put("creative_id", str9);
        if (str10 == null) {
            str10 = "";
        }
        map2.put("campaign_id", str10);
        map2.put("has_landing_deeplink", Integer.valueOf(z ? 1 : 0));
        map2.put("enter_from", C1767950w6j.LJI());
        if (str11 == null) {
            str11 = "";
        }
        map2.put("diversion_params", str11);
        if (str12 == null) {
            str12 = "";
        }
        map2.put("mall_extra_info", str12);
        map2.put("shoptab_index", "");
        C1767950w6j.LIZ(map2);
        if (map != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj2 = map.get("init_time");
            if ((obj2 instanceof String) && (str3 = (String) obj2) != null) {
                j = CastLongProtector.parseLong(str3);
            } else {
                j = 0;
            }
            map2.put("duration", Long.valueOf(jCurrentTimeMillis - j));
            map2.putAll(map);
        }
        C1767950w6j.LJIJ("rd_tiktokec_mall_home_route", map2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMallEntryRouteActionForRouteParams@1ccf.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
