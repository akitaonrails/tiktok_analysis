package X;

import Y.AfS195S0100000_26;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.IEcUgNewInstallService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0w6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767930w6h implements InterfaceC1741330vPn {
    public final ShopMallMixFragment LIZ;

    @Override // X.InterfaceC1741330vPn
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1741330vPn
    public final void LIZJ() {
        C1906580ziK.LIZJ().LIZJ().LJLLLL(this.LIZ.getLifecycle(), new AfS195S0100000_26(this, 21));
    }

    public C1767930w6h(ShopMallMixFragment shopMallMixFragment) {
        this.LIZ = shopMallMixFragment;
    }

    @Override // X.InterfaceC1741330vPn
    public final void LIZ(C1741260vPg c1741260vPg) {
        this.LIZ.LLJJJ.getClass();
        C1767790w6T c1767790w6T = C1767980w6m.LJII;
        if (c1741260vPg.LJ()) {
            C1767960w6k.LIZ.getClass();
            if (C1767960w6k.LJIIL == -1) {
                C1767960w6k.LJIIL = System.currentTimeMillis();
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZ("ShopMainLifeCycle stay_time startCalStayTime");
                return;
            }
            return;
        }
        if (c1741260vPg.LIZLLL()) {
            C1767960w6k.LIZ.getClass();
            if (C1767960w6k.LJ()) {
                return;
            }
            LIZLLL(c1741260vPg, c1767790w6T);
            return;
        }
        LIZLLL(c1741260vPg, c1767790w6T);
    }

    public final void LIZLLL(C1741260vPg c1741260vPg, C1767790w6T c1767790w6T) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        Object obj2;
        String str6;
        Object objLIZLLL;
        String str7;
        Object obj3;
        Pair<String, String> pairLIZ;
        String second;
        InterfaceC599750Nfh interfaceC599750NfhLIZ;
        C1767680w6I c1767680w6I;
        C1767670w6H c1767670w6H;
        C1767960w6k c1767960w6k = C1767960w6k.LIZ;
        if (c1767790w6T != null) {
            str = c1767790w6T.LJIIIZ;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (c1767790w6T == null || (str2 = c1767790w6T.LJII) == null) {
            str2 = "";
        }
        if (c1767790w6T == null || (str3 = c1767790w6T.LJI) == null) {
            str3 = "";
        }
        if (c1767790w6T == null || (c1767680w6I = c1767790w6T.LIZJ) == null || (c1767670w6H = c1767680w6I.LIZ) == null || (str4 = c1767670w6H.LIZ) == null) {
            str4 = "";
        }
        if (c1767790w6T == null || (str5 = c1767790w6T.LJIIZILJ) == null) {
            str5 = "";
        }
        c1767960w6k.getClass();
        boolean z = C1767960w6k.LJII;
        String str8 = "1";
        String str9 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        if (C1767960w6k.LJFF) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        ShopMallMixFragment shopMallMixFragment = this.LIZ;
        InterfaceC1773310wFN interfaceC1773310wFN = shopMallMixFragment.LLJJIJIL;
        Object objLIZLLL2 = shopMallMixFragment.bS().globalContext.LIZLLL("mix_mall_page_state", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
        if (objLIZLLL2 instanceof String) {
            str6 = (String) objLIZLLL2;
        } else {
            str6 = null;
        }
        FrameLayout frameLayoutAS = this.LIZ.aS();
        if (C1767960w6k.LJIIL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - C1767960w6k.LJIIL;
            C1767950w6j.LIZ.getClass();
            HashMap map = new HashMap();
            map.put("enter_from", "homepage_shop_mall");
            map.put("duration", Long.valueOf(jCurrentTimeMillis));
            C1018703yb.LIZIZ("stay_time", map);
            C1741420vPw.LIZ.getClass();
            C0NOF.LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (interfaceC1773310wFN != null && (interfaceC599750NfhLIZ = interfaceC1773310wFN.LIZ()) != null) {
                objLIZLLL = interfaceC599750NfhLIZ.LIZLLL("page_struc_type", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            } else {
                objLIZLLL = null;
            }
            if (!(objLIZLLL instanceof String) || objLIZLLL == null) {
                objLIZLLL = "";
            }
            linkedHashMap.put("page_struc_type", objLIZLLL);
            linkedHashMap.put("stay_time", Long.valueOf(jCurrentTimeMillis));
            if (c1741260vPg.LIZIZ == EnumC1741180vPY.OUT_OF_MALL) {
                str7 = "switch_tab";
            } else {
                str7 = "not_in_front";
            }
            linkedHashMap.put("quit_type", str7);
            linkedHashMap.put("is_load_data", C1584390rKf.LIZJ(str6));
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "mall");
            linkedHashMap.put("enter_from", C1767950w6j.LJFF());
            linkedHashMap.put("previous_page", str);
            linkedHashMap.put("enter_method", str2);
            linkedHashMap.put("mall_extra_info", str3);
            linkedHashMap.put("diversion_params", str4);
            linkedHashMap.put("is_clickable", obj);
            linkedHashMap.put("is_first_enter_page", obj2);
            linkedHashMap.put("shoptab_index", str5);
            linkedHashMap.put("rd_page_type", "native");
            if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_login", obj3);
            if (!MMKStorageUtil.LIZ.LIZJ()) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_use_cache", str8);
            IEcUgNewInstallService iEcUgNewInstallService = (IEcUgNewInstallService) PluggableExtentionKt.pluggableSpi$default(IEcUgNewInstallService.class, false, false, false, 14, null);
            if (iEcUgNewInstallService != null && (pairLIZ = iEcUgNewInstallService.LIZ()) != null && (second = pairLIZ.getSecond()) != null) {
                str9 = second;
            }
            linkedHashMap.put("is_ug_allowlist_user", str9);
            linkedHashMap.putAll(C1767950w6j.LJII());
            C1767950w6j.LIZIZ(linkedHashMap, interfaceC1773310wFN, frameLayoutAS);
            C1767950w6j.LJIIZILJ("tiktokec_stay_mall", linkedHashMap, interfaceC1773310wFN, null);
            C1767960w6k.LJIIL = -1L;
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShopMainLifeCycle stay_time stopCalStayTime dur = ");
            sbLIZ.append(jCurrentTimeMillis);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
        }
    }
}
