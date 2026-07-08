package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite.helper.SettingInfo;
import com.ss.android.ugc.aweme.ecommerce.core.ab.LynxCardModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.LynxOptModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpIntegrateLynxAirModel;
import defpackage.p1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS344S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546360qLK {
    public static boolean LIZIZ;
    public static final C1546360qLK LIZ = new C1546360qLK();
    public static final ConcurrentHashMap<String, Integer> LIZJ = new ConcurrentHashMap<>();

    static {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1097680efe c1097680efe = new C1097680efe();
        Boolean bool = C1155800gBO.LIZIZ().preCreateOpt.pendingLoad;
        c1097680efe.LJ = bool != null ? bool.booleanValue() : false;
        c1097680efe.LJIIZILJ = true;
        Integer num = C1155800gBO.LIZIZ().preCreateOpt.poolCapacity;
        c1097680efe.LJIJ = num != null ? num.intValue() : 16;
        c1097680efe.LIZ = "pdp_integrate_lynx_air";
        c1097680efe.LJIJI = -1;
        c1097680efe.LJIIIIZZ = AnonymousClass0208.get$arr$(53);
        c1097680efe.LJIJJ = AFwS344S0000000_23.get$arr$(4);
        C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
    }

    public static void LIZIZ(Context context) {
        List<LynxCardModel> list;
        LynxCardModel next;
        String str;
        InterfaceC497601wk lifecycleScope;
        C19EG c19egLIZIZ;
        PdpIntegrateLynxAirModel pdpIntegrateLynxAirModelLIZIZ = C04IL.LIZIZ();
        LynxOptModel lynxOptModel = pdpIntegrateLynxAirModelLIZIZ.opt;
        int iIntValue = 1;
        if (lynxOptModel != null && lynxOptModel.LIZIZ() && (list = pdpIntegrateLynxAirModelLIZIZ.renderCardList) != null) {
            Iterator<LynxCardModel> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.cardName, "pdp_product_info")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LynxCardModel lynxCardModel = next;
            if (lynxCardModel != null && (str = lynxCardModel.schema) != null) {
                C1546360qLK c1546360qLK = LIZ;
                boolean zLIZ = pdpIntegrateLynxAirModelLIZIZ.opt.LIZ();
                LynxOptModel lynxOptModel2 = pdpIntegrateLynxAirModelLIZIZ.opt;
                Integer num = lynxOptModel2.preCreateCount;
                if (num != null && num.intValue() > 0) {
                    iIntValue = lynxOptModel2.preCreateCount.intValue();
                }
                c1546360qLK.getClass();
                if (zLIZ) {
                    if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) == null) {
                        lifecycleScope = C817503Hh.LL;
                    }
                    C1546390qLN.LIZ.getClass();
                    C23250099c.LIZLLL(lifecycleScope, new C2232408os(C1546390qLN.LIZJ()).plus(C1546390qLN.LJIIJJI), null, new C315570CYp(str, iIntValue, zLIZ, null), 2);
                    return;
                }
                LIZJ(11, iIntValue, str, zLIZ);
            }
        }
    }

    public static void LIZ(String str, C1537910q7h c1537910q7h, boolean z) {
        C649560Pdq c649560Pdq = new C649560Pdq();
        c649560Pdq.LIZIZ = Integer.valueOf(EnumC665490Q8l.PART_ON_LAYOUT.id());
        c649560Pdq.LIZ = Boolean.TRUE;
        c1537910q7h.LJIJJ(c649560Pdq);
        c1537910q7h.LJJI = true;
        if (z) {
            c1537910q7h.LJJI(C13LP.LJJLIIIJ(C1106704Un.LIZ, ",", null, null, 0, null, null, 62));
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "ecAbSetting");
        C1546410qLP.LIZ.getClass();
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            try {
                Map mapLIZ = C1546410qLP.LIZ((List) C08JS.LIZIZ().LJIIIIZZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new TypeToken<List<? extends SettingInfo>>() { // from class: X.04ZS
                }.getType()));
                if (mapLIZ != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("settings", mapLIZ);
                    linkedHashMap.put("pdpFavoriteShareButtonsReposition", Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_pdp_favorite_share_buttons_reposition", true, false)));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("ecom_pdp_new_price_style", Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_pdp_new_price_style", true)));
                    linkedHashMap2.put("ec_pdp_price_v2_switch", Boolean.valueOf(p1.LIZ()));
                    linkedHashMap.put("client_settings", linkedHashMap2);
                    c1537910q7h.LIZLLL(linkedHashMap);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_LYNX_GET_SETTING, e, null);
            }
        }
    }

    public static void LIZJ(int i, int i2, String str, boolean z) {
        int iIntValue;
        ConcurrentHashMap<String, Integer> concurrentHashMap = LIZJ;
        Integer num = concurrentHashMap.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue >= i2) {
            return;
        }
        int i3 = i2 - iIntValue;
        concurrentHashMap.put(str, Integer.valueOf(i2));
        for (int i4 = 0; i4 < i3; i4++) {
            C1508250pLr.LIZIZ("pdp_lynx_preload", String.valueOf(i), new C1541380qDI(str, z, i));
        }
    }

    public static void LIZLLL(C1546360qLK c1546360qLK, String str, int i, int i2, String str2, String str3, int i3) {
        if ((i3 & 16) != 0) {
            str2 = null;
        }
        if ((i3 & 256) != 0) {
            str3 = null;
        }
        c1546360qLK.getClass();
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("type", str), new Pair("result", Integer.valueOf(i)), new Pair("preload_scene", Integer.valueOf(i2)));
        if (str2 != null) {
            mapLJIIJ.put("schema", str2);
        }
        if (str3 != null) {
            mapLJIIJ.put("error_msg", str3);
        }
        C1018703yb.LJ("rd_tiktokec_pdp_preload_resource", mapLJIIJ);
    }
}
