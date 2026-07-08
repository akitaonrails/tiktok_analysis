package X;

import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0w6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem$sendTabClickEventWhenPageShow$1", f = "ShopMallMixAssem.kt", l = {}, m = "invokeSuspend")
public final class C1767970w6l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1767970w6l(InterfaceC1364105Vn<? super C1767970w6l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1767970w6l(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        Pair<String, String> pairLIZ;
        String second;
        C1C7U.LIZ("ShopMallMixAssem@a45d.sendTabClickEventWhenPageShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
        MMKStorageUtil mMKStorageUtil = MMKStorageUtil.LIZ;
        boolean zLIZLLL = MMKStorageUtil.LIZLLL();
        c1767950w6j.getClass();
        HashMap map = new HashMap();
        map.put("page_name", "mall");
        map.put("tab_name", "mall");
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("enter_from", C1767950w6j.LJFF());
        map.put("enter_method", "switch_tab");
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (zLIZLLL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_data_cache", str);
        C1767960w6k.LIZ.getClass();
        map.put("coldboot_to_click_duration", Long.valueOf(C1767960w6k.LJ));
        map.put("coldboot_to_tab_show_duration", Long.valueOf(C1767960w6k.LIZIZ - C1150504el.LIZ().LJJII));
        map.put("tab_show_to_tab_click_duration", Long.valueOf(C1767960w6k.LIZLLL - C1767960w6k.LIZIZ));
        if (C1767960w6k.LIZJ > 0) {
            z = true;
        } else {
            z = false;
        }
        map.put("cold_task_start_before_tab_click", Boolean.valueOf(z));
        long j = C1767960w6k.LIZJ;
        if (j > 0) {
            map.put("cold_task_start_time_from_tab_show", Long.valueOf(j - C1767960w6k.LIZIZ));
            map.put("cold_task_start_time_before_tab_click", Long.valueOf(C1767960w6k.LIZLLL - C1767960w6k.LIZJ));
        }
        IEcUgNewInstallService iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null);
        if (iEcUgNewInstallService != null && (pairLIZ = iEcUgNewInstallService.LIZ()) != null && (second = pairLIZ.getSecond()) != null) {
            str2 = second;
        }
        map.put("is_ug_allowlist_user", str2);
        map.putAll(C1767950w6j.LJII());
        C1767950w6j.LJIJ("rd_tiktokec_mall_entrance_click", map);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallMixAssem@a45d.sendTabClickEventWhenPageShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1767970w6l(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
