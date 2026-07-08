package X;

import Y.AObserverS191S0200000_32;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.message.AddToCartButton;
import com.bytedance.android.livesdk.model.message.FlashSaleAtmosphereInfo;
import com.bytedance.android.livesdk.model.message.Img;
import com.bytedance.android.livesdk.model.message.ProductSnapShot;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.cache.LiveExposedProductsCache;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcLiveShopListClientRequestConfigDetail;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.settings.ECommerceNativePreloadConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.hotroom.HotRoomInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.shopbag.FlashSaleInfoForJs;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.CreatorProductListLynxConfigSettings;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS320S0000000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21208517z9 extends AbstractC21208617zA implements InterfaceC1141530foN {
    public final C1743900vTw LL;
    public final WeakReference<C21212117zj> LLILLJJLI;
    public boolean LLILLL;
    public Room LLILZ;
    public OecInitData LLILZIL;
    public String LLILZLL;
    public final Context LLIZ;
    public C1546510qLZ LLIZLLLIL;
    public C21208817zC LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public long LLJILJIL;
    public Map<String, ? extends Object> LLJILJILJ;
    public Integer LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final int LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public String LLJJJJJIL;
    public final C054G LLJJJJLIIL;
    public final C054G LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public List<String> LLJZ;
    public Boolean LLJZIJLIL;
    public C21209817zM LLL;

    public void LJI(Map<String, Object> map) {
    }

    @Override // X.InterfaceC1506090pIN
    public final Map<String, Object> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strLIZJ = this.LL.LIZJ("room_id");
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        linkedHashMap.put("room_id", strLIZJ);
        String strLIZJ2 = this.LL.LIZJ("author_id");
        if (strLIZJ2 == null) {
            strLIZJ2 = "";
        }
        linkedHashMap.put("author_id", strLIZJ2);
        String strLIZJ3 = this.LL.LIZJ("enter_from_merge");
        if (strLIZJ3 == null) {
            strLIZJ3 = "";
        }
        linkedHashMap.put("enter_from_merge", strLIZJ3);
        String strLIZJ4 = this.LL.LIZJ("action_type");
        if (strLIZJ4 == null) {
            strLIZJ4 = "";
        }
        linkedHashMap.put("action_type", strLIZJ4);
        String strLIZJ5 = this.LL.LIZJ("follow_status");
        if (strLIZJ5 == null) {
            strLIZJ5 = "";
        }
        linkedHashMap.put("follow_status", strLIZJ5);
        String strLIZJ6 = this.LL.LIZJ("is_ad");
        if (strLIZJ6 == null) {
            strLIZJ6 = "";
        }
        linkedHashMap.put("is_ad", strLIZJ6);
        String strLIZJ7 = this.LL.LIZJ("ad_id");
        if (strLIZJ7 == null) {
            strLIZJ7 = "";
        }
        linkedHashMap.put("ad_id", strLIZJ7);
        String strLIZJ8 = this.LL.LIZJ("creative_id");
        if (strLIZJ8 == null) {
            strLIZJ8 = "";
        }
        linkedHashMap.put("creative_id", strLIZJ8);
        String strLIZJ9 = this.LL.LIZJ("request_id");
        if (strLIZJ9 == null) {
            strLIZJ9 = "";
        }
        linkedHashMap.put("request_id", strLIZJ9);
        String strLIZJ10 = this.LL.LIZJ("search_id");
        if (strLIZJ10 == null) {
            strLIZJ10 = "";
        }
        linkedHashMap.put("search_id", strLIZJ10);
        String strLIZJ11 = this.LL.LIZJ("search_result_id");
        linkedHashMap.put("search_result_id", strLIZJ11 != null ? strLIZJ11 : "");
        return linkedHashMap;
    }

    public final boolean LJ() {
        if (!this.LLJLIL) {
            return false;
        }
        C21209717zL.LIZ.getClass();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        return iLiveOuterService != null && iLiveOuterService.D3();
    }

    public boolean LJFF() {
        boolean z = this.LLJJ;
        Boolean bool = this.LLJZIJLIL;
        Boolean bool2 = ((EcLiveShopListClientRequestConfigDetail) C21191117wL.LIZIZ.getValue()).enable;
        Boolean bool3 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool2, bool3)) {
            return !(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_shop_bag_disable_pending_js", true, false) || z) || Intrinsics.LJFF(bool, bool3);
        }
        return false;
    }

    public final void LJIILIIL() {
        if (this.LLILLL) {
            return;
        }
        if (this.LLJ == null) {
            this.LLJIJIL = true;
            return;
        }
        this.LLILLL = true;
        String strLIZ = C0CC0.LIZ();
        if (strLIZ.length() != 0) {
            C1537480q70 c1537480q70 = new C1537480q70();
            c1537480q70.LJJIIZ(strLIZ);
            c1537480q70.hybridParams = new C1537830q7Z(UriProtector.parse(strLIZ), c1537480q70);
            C1538140q84.LIZ.getClass();
            InterfaceC497601wk interfaceC497601wk = c1537480q70.coroutineScope;
            if (interfaceC497601wk == null) {
                interfaceC497601wk = C817503Hh.LL;
            }
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C373001ce(c1537480q70, null), 3);
        }
    }

    public void onDestroy() {
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        SparkPopup sparkPopup;
        SparkContext sparkContext;
        String strLJIJI;
        C1548820qPI.LJIIIIZZ("redeem_live_product_list", this);
        C1548820qPI.LJIIIIZZ("ec_open_live_bag", this);
        C1548820qPI.LJIIIIZZ("ec_audience_deliver_product_param_event", this);
        C1514860pWW.LIZ(this);
        C622680Oba.LIZLLL(this);
        C2296808zG.LIZJ(this.LLJJJJLIIL, null);
        C2296808zG.LIZJ(this.LLJJL, null);
        if (this.LLIZLLLIL != null) {
            C1546500qLY c1546500qLY = C1546560qLe.LIZ;
            String str = this.LLJJJJJIL;
            c1546500qLY.getClass();
            C1546500qLY.LIZIZ(str, "ec_shop_bag_biz");
            C1546500qLY.LJIIIIZZ("ec_shop_bag_biz");
            this.LLIZLLLIL = null;
            EnumC21192817wc enumC21192817wc = EnumC21192817wc.REUSE_DESTROY;
            Room room = this.LLILZ;
            C21196417xC.LIZ(enumC21192817wc, room != null ? room.getIdStr() : null, null, null, null, this.LLJLLL, null, null, 220);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJLILLLLZIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C21208817zC c21208817zC = this.LLJ;
        if (c21208817zC != null) {
            c21208817zC.onDestroy();
        }
        Context context2 = this.LLIZ;
        if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Fragment next = it2.next();
                if ((next instanceof SparkPopup) && (sparkPopup = (SparkPopup) next) != null && (sparkContext = sparkPopup.LLJIJIL) != null && (strLJIJI = sparkContext.LJIJI()) != null && a0.LJJIIZI(strLJIJI, C0CC0.LIZ(), false)) {
                    sparkPopup.gS(true);
                    break;
                }
            }
        }
        if (!Intrinsics.LJFF(this.LLJZIJLIL, Boolean.TRUE) || (context = this.LLIZ) == null) {
            return;
        }
        C150V.LIZIZ.LIZ().LIZ(context).LIZJ(this);
    }

    public void onShopBagIconDrawableLoaded() {
        WeakReference<C21212117zj> weakReference;
        C21212117zj c21212117zj;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        Room room;
        IEcommerceLiveService iEcommerceLiveService;
        Integer num = this.LLJILLL;
        boolean z = true;
        if (num != null && num.intValue() == 1) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C21193217wg(this, null), 3);
        }
        if (LJ() || (weakReference = this.LLILLJJLI) == null || (c21212117zj = weakReference.get()) == null || (slotViewModel = c21212117zj.LLJ) == null || (mutableLiveData = slotViewModel.LLILZ) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE) || this.LLJL) {
            return;
        }
        if (!C20595415iS.LIZIZ() && !C20595415iS.LIZJ()) {
            z = false;
        }
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = ((Number) this.LLJJIJIIJIL.getValue()).longValue();
        boolean zBooleanValue = ((Boolean) this.LLJJIJIL.getValue()).booleanValue();
        boolean zLIZIZ = C1513700pUe.LIZIZ();
        if (C0A14.LIZ() == 2 || C0A14.LIZ() == 3) {
            LJIIJ(c238400w2.element, z, zBooleanValue);
            return;
        }
        if (!zLIZIZ || (room = this.LLILZ) == null || (iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null)) == null || !iEcommerceLiveService.isECVisible(room)) {
            LJIIJ(c238400w2.element, z, zBooleanValue);
        } else {
            Room room2 = this.LLILZ;
            C1513700pUe.LIZ(room2 != null ? room2.getId() : 0L).LIZ(new C1512510pSj(c238400w2, this, z, zBooleanValue));
        }
    }

    @Override // X.InterfaceC1741780vQW
    public final boolean LIZ(IMessage iMessage) {
        return iMessage instanceof ECommerceMessage;
    }

    public final Map<String, Object> LJII(Map<String, ? extends Object> map) {
        Object obj;
        Map map2;
        Object obj2;
        Map map3;
        if (map == null) {
            obj = null;
        } else {
            try {
                obj = map.get("content_params");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map == null) {
            obj2 = null;
        } else {
            try {
                obj2 = map.get("page_params");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (obj2 instanceof Map) {
            map3 = (Map) obj2;
        } else {
            map3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        Map<String, ? extends Object> map4 = this.LLJILJILJ;
        if (map4 != null) {
            linkedHashMap.putAll(map4);
        }
        List<String> list = this.LLJZ;
        if (list != null) {
            linkedHashMap.put("voucher_type_ids", list);
            this.LLJZ = null;
        }
        if (linkedHashMap.isEmpty()) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap2.put(key, value);
            }
        }
        return linkedHashMap2;
    }

    public final Map<String, Object> LJIIIZ(String str) {
        HashMap map = new HashMap(this.LL.LJ());
        int i = 1;
        if (!(!this.LLJL)) {
            i = 0;
        }
        map.put("is_first_click", Integer.valueOf(i));
        map.put("bag_product_num", Integer.valueOf(this.LLJLLIL));
        map.put("enter_from", str);
        return map;
    }

    public void LJIILJJIL(Map map) {
        if (LJFF()) {
            C23250099c.LIZLLL(this.LLJJL, null, null, new C0CSX(this, map, 0, null), 3);
        }
    }

    public final void LJIIZILJ(boolean z) throws JSONException {
        InterfaceC486570J6h interfaceC486570J6hR3;
        IEcommerceLiveService iEcommerceLiveService;
        C21208817zC c21208817zC = this.LLJ;
        if (c21208817zC != null) {
            boolean zIsECVisible = false;
            if (this.LLIZLLLIL != null) {
                c21208817zC.LIZIZ(this.LLJJLIIIJLLLLLLLZ, z, this.LLJL);
            } else {
                c21208817zC.LIZIZ(this.LLJJLIIIJLLLLLLLZ, z, false);
            }
            Room room = this.LLILZ;
            if (room != null && (iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null)) != null) {
                zIsECVisible = iEcommerceLiveService.isECVisible(room);
            }
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC486570J6hR3 = iLiveOuterService.r3()) != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("can_show_bag", zIsECVisible);
                interfaceC486570J6hR3.LIZIZ(jSONObject, jSONObject2, new JSONObject());
                return;
            }
            return;
        }
        this.LLJI = true;
    }

    @Override // X.InterfaceC21209217zG
    public void is1(boolean z) {
        this.LLJLL = true;
        if (z) {
            C23250099c.LIZLLL(this.LLJJJJLIIL, null, null, new C598660Ndw(this, null), 3);
        }
    }

    public void mh2(C262100zr c262100zr) throws JSONException {
        InterfaceC1107590evd interfaceC1107590evd;
        Map<String, Object> mapLIZ;
        String idStr;
        Long lValueOf;
        List list;
        Map mapLIZ2;
        LinkedHashMap linkedHashMap;
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object objLJJIJLIJ;
        Object obj3;
        Map<String, Object> mapLIZ3;
        String str3 = c262100zr.LIZ;
        int iHashCode = str3.hashCode();
        List list2 = null;
        Map map = null;
        String strCreateJumpSourceBtmToken = null;
        if (iHashCode != -1212468668) {
            if (iHashCode != -1130961282) {
                if (iHashCode == 1743779497 && str3.equals("ec_open_live_bag")) {
                    this.LLJILJIL = System.currentTimeMillis();
                    InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd2 != null) {
                        mapLIZ2 = interfaceC1107590evd2.LIZ();
                    } else {
                        mapLIZ2 = null;
                    }
                    LJIILJJIL(mapLIZ2);
                    InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd3 != null && (mapLIZ3 = interfaceC1107590evd3.LIZ()) != null) {
                        linkedHashMap = new LinkedHashMap(mapLIZ3);
                    } else {
                        linkedHashMap = null;
                    }
                    if (linkedHashMap != null) {
                        obj = linkedHashMap.get("btm");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    if (C123100dR.LIZ(str)) {
                        if (linkedHashMap != null) {
                            obj2 = linkedHashMap.get("containerID");
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof String) {
                            str2 = (String) obj2;
                        } else {
                            str2 = null;
                        }
                        C1041990dDp.LIZ.getClass();
                        SparkContext sparkContextLIZ = C1041990dDp.LIZ(str2);
                        if (sparkContextLIZ == null || (objLJJIJLIJ = sparkContextLIZ.LJJIJLIJ()) == null) {
                            objLJJIJLIJ = this.LLIZ;
                        }
                        if (linkedHashMap != null) {
                            obj3 = linkedHashMap.get("bcm");
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof Map) {
                            map = (Map) obj3;
                        }
                        BtmSDK btmSDK = BtmSDK.INSTANCE;
                        PageFinder pageFinderVia = PageFinder.via(objLJJIJLIJ);
                        BcmParams.Companion.getClass();
                        strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(str, pageFinderVia, C212367188v.LIZJ(map));
                        if (linkedHashMap != null) {
                            linkedHashMap.remove("btm");
                            linkedHashMap.remove("bcm");
                        }
                    }
                    LJIIJJI(null, "ec_open_live_bag", strCreateJumpSourceBtmToken, linkedHashMap, false);
                    return;
                }
                return;
            }
            if (!str3.equals("redeem_live_product_list")) {
                return;
            }
            this.LLJILJIL = System.currentTimeMillis();
            LJIILJJIL(null);
            LJIIJJI(null, "redeem_live_product_list", null, null, false);
            return;
        }
        if (!str3.equals("ec_audience_deliver_product_param_event") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (mapLIZ = interfaceC1107590evd.LIZ()) == null) {
            return;
        }
        try {
            LiveExposedProductsCache liveExposedProductsCache = LiveExposedProductsCache.LIZ;
            Room room = this.LLILZ;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            Room room2 = this.LLILZ;
            if (room2 != null) {
                lValueOf = Long.valueOf(room2.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            Object obj4 = mapLIZ.get("deliver_show_product_list");
            if (obj4 instanceof List) {
                list = (List) obj4;
            } else {
                list = null;
            }
            Object obj5 = mapLIZ.get("deliver_click_product_list");
            if (obj5 instanceof List) {
                list2 = (List) obj5;
            }
            liveExposedProductsCache.getClass();
            if (idStr == null) {
                return;
            }
            LiveExposedProductsCache.LIZ(idStr, strValueOf, new AwS398S0200000_32(list, (List<String>) list2, (List<String>) 18));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC21213517zx
    public final void onAudiencePermissionChanged(boolean z) {
        this.LLJLIL = z;
    }

    public void onCreate(Bundle bundle) {
        C1548820qPI.LIZLLL("redeem_live_product_list", this);
        C1548820qPI.LIZLLL("ec_open_live_bag", this);
        C1548820qPI.LIZLLL("ec_audience_deliver_product_param_event", this);
        C1514860pWW.LIZ.add(new WeakReference<>(this, C1514860pWW.LIZIZ));
        C622680Oba.LIZJ(this);
    }

    @Override // X.InterfaceC1741780vQW
    public final void onMessage(IMessage iMessage) throws JSONException {
        String strLIZLLL;
        List<FlashSaleAtmosphereInfo> list;
        String strLIZLLL2;
        String strLJIIIIZZ;
        Long lValueOf;
        String str;
        Type type;
        int i;
        String str2;
        if (iMessage instanceof ECommerceMessage) {
            ECommerceMessage eCommerceMessage = (ECommerceMessage) iMessage;
            int i2 = eCommerceMessage.actionType;
            String string = null;
            switch (i2) {
                case 0:
                    LJIILL(i2, null);
                    LJIILLIIL(eCommerceMessage.actionType, null);
                    break;
                case 1:
                    PopProduct popProduct = eCommerceMessage.popProduct;
                    if (popProduct != null) {
                        Long.valueOf(popProduct.productId).longValue();
                        is1(false);
                    }
                    int i3 = eCommerceMessage.actionType;
                    JSONObject jSONObject = new JSONObject();
                    PopProduct popProduct2 = eCommerceMessage.popProduct;
                    if (popProduct2 != null) {
                        jSONObject.put("product_id", String.valueOf(Long.valueOf(popProduct2.productId).longValue()));
                    }
                    LJIILLIIL(i3, jSONObject);
                    break;
                case 2:
                    LJIILL(i2, null);
                    LJIILLIIL(eCommerceMessage.actionType, null);
                    break;
                case 3:
                    LJIILL(i2, null);
                    LJIILLIIL(eCommerceMessage.actionType, null);
                    is1(true);
                    break;
                case 4:
                case 5:
                    LJIILLIIL(i2, null);
                    is1(false);
                    ProductSnapShot productSnapShot = eCommerceMessage.productSnapShot;
                    if (productSnapShot != null && productSnapShot.productId != null) {
                        int i4 = eCommerceMessage.actionType;
                        JSONObject jSONObject2 = new JSONObject();
                        ProductSnapShot productSnapShot2 = eCommerceMessage.productSnapShot;
                        if (productSnapShot2 != null) {
                            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(productSnapShot2);
                        } else {
                            strLJIIIIZZ = null;
                        }
                        jSONObject2.put("product_snap_shot", strLJIIIIZZ);
                        LJIILL(i4, jSONObject2);
                        Room room = this.LLILZ;
                        if (room != null) {
                            lValueOf = Long.valueOf(room.getId());
                        } else {
                            lValueOf = null;
                        }
                        String strValueOf = String.valueOf(lValueOf);
                        int i5 = eCommerceMessage.actionType;
                        ProductSnapShot productSnapShot3 = eCommerceMessage.productSnapShot;
                        if (strValueOf.length() != 0 && productSnapShot3 != null && (str = productSnapShot3.productId) != null && str.length() != 0) {
                            C212391189t.LIZ.getClass();
                            String strLIZ = C212391189t.LIZ("product_update", strValueOf);
                            if (strLIZ == null) {
                                if (i5 == 5) {
                                    productSnapShot3.timestamp = 0L;
                                }
                                C212391189t.LIZIZ("product_update", strValueOf, C1741890vQh.LJIIIIZZ(C2097908Jt.LIZJ(new Pair(productSnapShot3.productId, productSnapShot3))));
                            } else {
                                try {
                                    Gson gsonLJFF = C1741890vQh.LJFF();
                                    C1120604Zw.LIZ.getClass();
                                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                                        C13JX c13jx = KTypeProjection.LIZJ;
                                        C13JW c13jwLJII = C13LE.LJII(String.class);
                                        c13jx.getClass();
                                        type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(ProductSnapShot.class))));
                                    } else {
                                        type = new TypeToken<HashMap<String, ProductSnapShot>>() { // from class: X.00Ts
                                        }.getType();
                                    }
                                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLIZ, type);
                                    if (!(objFromJson instanceof HashMap)) {
                                        objFromJson = null;
                                    }
                                    HashMap map = (HashMap) objFromJson;
                                    if (map != null) {
                                        ProductSnapShot productSnapShot4 = (ProductSnapShot) map.get(productSnapShot3.productId);
                                        if (productSnapShot4 == null) {
                                            productSnapShot4 = productSnapShot3;
                                        } else if (i5 != 4) {
                                            if (i5 == 5) {
                                                if (!Intrinsics.LJFF(productSnapShot3.title, "")) {
                                                    productSnapShot4.title = productSnapShot3.title;
                                                }
                                                Img img = productSnapShot3.cover;
                                                if (img == null || (str2 = img.url) == null || str2.length() == 0) {
                                                    productSnapShot4.cover = productSnapShot3.cover;
                                                }
                                            }
                                        } else {
                                            long j = productSnapShot3.timestamp;
                                            if (j > productSnapShot4.timestamp && ((i = productSnapShot3.stockType) == 1 || i == 2)) {
                                                productSnapShot4.stockType = i;
                                                productSnapShot4.timestamp = j;
                                                AddToCartButton addToCartButton = productSnapShot3.addToCartButton;
                                                if (addToCartButton != null) {
                                                    productSnapShot4.addToCartButton = addToCartButton;
                                                }
                                            }
                                        }
                                        map.put(productSnapShot3.productId, productSnapShot4);
                                        C212391189t c212391189t = C212391189t.LIZ;
                                        String strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(map);
                                        c212391189t.getClass();
                                        C212391189t.LIZIZ("product_update", strValueOf, strLJIIIIZZ2);
                                    }
                                } catch (s e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return;
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 8:
                    this.LLJLLL = true;
                    LJIILL(i2, null);
                    LJIILLIIL(eCommerceMessage.actionType, null);
                    Room room2 = this.LLILZ;
                    if (room2 != null) {
                        string = Long.valueOf(room2.getId()).toString();
                    }
                    C212391189t.LIZ.getClass();
                    C212391189t.LIZIZ("shop_bag", string, "");
                    C212391189t.LIZIZ("prerender_bag_assemble", string, "");
                    C212391189t.LIZIZ("lru_mix_shop_bag", string, "");
                    C212391189t.LIZIZ("product_update", string, "");
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    if (C1894507bT.LIZ()) {
                        this.LLJLLL = false;
                        LJIILL(eCommerceMessage.actionType, null);
                        LJIILLIIL(eCommerceMessage.actionType, null);
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    if (!LJ() && (list = eCommerceMessage.flashSaleAtmosphereInfo) != null && (strLIZLLL2 = C08JS.LIZLLL(list)) != null) {
                        C23250099c.LIZLLL(this.LLJJJJLIIL, null, null, new C503601xi(false, eCommerceMessage.actionType, new FlashSaleInfoForJs(strLIZLLL2), null), 3);
                        break;
                    }
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    List<FlashSaleAtmosphereInfo> list2 = eCommerceMessage.flashSaleAtmosphereInfo;
                    if (list2 != null && (strLIZLLL = C08JS.LIZLLL(list2)) != null) {
                        C23250099c.LIZLLL(this.LLJJJJLIIL, null, null, new C503601xi(LJ(), eCommerceMessage.actionType, new FlashSaleInfoForJs(strLIZLLL), null), 3);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // X.InterfaceC21213517zx
    public final void onProductNumChange(int i) {
        this.LLJLLIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShowBagList(X.C037D r10) throws org.json.JSONException {
        /*
            r9 = this;
            r3 = r9
            boolean r0 = r3.LJ()
            if (r0 != 0) goto L70
            java.lang.ref.WeakReference<X.17zj> r0 = r3.LLILLJJLI
            java.lang.Object r0 = r0.get()
            X.17zj r0 = (X.C21212117zj) r0
            if (r0 == 0) goto L70
            com.bytedance.android.live.slot.IIconSlot$SlotViewModel r0 = r0.LLJ
            if (r0 == 0) goto L70
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.LLILZ
            if (r0 == 0) goto L70
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L70
            java.lang.String r2 = r10.LIZ
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.LLILZ
            if (r0 == 0) goto L88
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L33:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L70
            long r0 = java.lang.System.currentTimeMillis()
            r3.LLJILJIL = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.LIZLLL
            r3.LJIILJJIL(r0)
            java.lang.String r4 = r10.LIZIZ
            java.lang.String r2 = r10.LIZJ
            int r1 = r2.hashCode()
            r0 = 72116195(0x44c67e3, float:2.4027787E-36)
            if (r1 == r0) goto L7c
            r0 = 935175186(0x37bda412, float:2.2606957E-5)
            if (r1 == r0) goto L71
            r0 = 2087096502(0x7c6690b6, float:4.7886535E36)
            if (r1 != r0) goto L67
            java.lang.String r0 = "live_coupon_card"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L85
        L67:
            java.lang.String r5 = "ec_open_live_bag_from_voucher"
        L69:
            r6 = 0
            java.util.Map<java.lang.String, java.lang.Object> r7 = r10.LIZLLL
            r8 = 0
            r3.LJIIJJI(r4, r5, r6, r7, r8)
        L70:
            return
        L71:
            java.lang.String r0 = "live_promotion_container"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L67
            java.lang.String r5 = r10.LIZJ
            goto L69
        L7c:
            java.lang.String r0 = "live_popup_coupon_card"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L85
            goto L67
        L85:
            java.lang.String r5 = "ec_open_live_bag"
            goto L69
        L88:
            r0 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21208517z9.onShowBagList(X.037D):void");
    }

    public C21208517z9(C1743900vTw c1743900vTw, WeakReference weakReference) {
        Context context;
        this.LL = c1743900vTw;
        this.LLILLJJLI = weakReference;
        C21212117zj c21212117zj = (C21212117zj) weakReference.get();
        if (c21212117zj != null) {
            context = c21212117zj.LLIZLLLIL;
        } else {
            context = null;
        }
        this.LLIZ = context;
        this.LLJILJIL = -1L;
        this.LLJJIII = -1;
        this.LLJJIJI = -1;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5950));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5951));
        int iLIZ = C0A14.LIZ();
        this.LLJJJ = iLIZ;
        this.LLJJJIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1710));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(313));
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = C2296808zG.LIZ(C2126308Ur.LJFF);
        this.LLJJL = C2296808zG.LIZ(C2126308Ur.LIZIZ);
        this.LLJJLIIIJLLLLLLLZ = "";
        this.LLJZIJLIL = iLIZ == 2 ? Boolean.TRUE : null;
    }

    public static final void LJIILL(int i, JSONObject jSONObject) throws JSONException {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_type", i);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            iEventCenter.LIZ("ec_audience_message_event", C786410Ut5.J3(jSONObject2));
        }
    }

    public static void LJIILLIIL(int i, JSONObject jSONObject) throws JSONException {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action_type", i);
            if (jSONObject != null) {
                jSONObject2.put("data", jSONObject);
            }
            iEventCenter.LIZ("ec_author_message_event", C786410Ut5.J3(jSONObject2));
        }
    }

    public String LJIJ(String str, boolean z) {
        if (!z && LJFF()) {
            return UriProtector.parse(str).buildUpon().appendQueryParameter("use_client_request", "1").build().toString();
        }
        return str;
    }

    public void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        String str;
        Room room;
        int i;
        C21208817zC c21208817zC;
        String strOptString$default;
        BcmParams bcmParams;
        String str2;
        String str3;
        Object obj = map.get("param_product_bag_page_params");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str4 = "{}";
        if (str == null) {
            str = "{}";
        }
        this.LLJILJILJ = C1741890vQh.LJIIJ(str);
        Object obj2 = map.get("param_room");
        if (obj2 instanceof Room) {
            room = (Room) obj2;
        } else {
            room = null;
        }
        this.LLILZ = room;
        if (Intrinsics.LJFF(map.get("param_live_action_type"), "click") && this.LLJJJ == 3) {
            Object obj3 = map.get("param_extra_auto_route_schema");
            if (!(obj3 instanceof String) || (str3 = (String) obj3) == null || str3.length() == 0 || ((ECommerceNativePreloadConfig) C21209417zI.LIZIZ.getValue()).allowPreloadWhenOpenPdp) {
                this.LLJZIJLIL = Boolean.TRUE;
            }
        }
        Object obj4 = map.get("param_extra_auto_open_product_bag");
        if (!(obj4 instanceof Integer) || (i = (Integer) obj4) == null) {
            i = 0;
        }
        this.LLJILLL = i;
        Object obj5 = map.get("param_extra_auto_open_product_bag_params");
        if ((obj5 instanceof String) && (str2 = (String) obj5) != null) {
            str4 = str2;
        }
        this.LLILZLL = str4;
        Integer num = this.LLJILLL;
        if (num != null && num.intValue() == 0 && Intrinsics.LJFF(map.get("param_live_action_type"), "click")) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = "";
            c21244318Bt.LIZIZ = C520170Kad.LIZ(this.LLIZ);
            C18C6 bcmChainByBtmModel = btmSDK.getBcmChainByBtmModel(c21244318Bt, 20, false);
            if (bcmChainByBtmModel.LIZ.size() >= 2) {
                C1766990w5B c1766990w5B = ((C1766940w56) ListProtector.get(bcmChainByBtmModel.LIZ, 1)).LJIIIZ;
                if (c1766990w5B != null && (bcmParams = c1766990w5B.LIZIZ) != null) {
                    strOptString$default = BcmParams.optString$default(bcmParams, "extra_auto_open_product_bag_params_for_live", null, 2, null);
                } else {
                    strOptString$default = null;
                }
                if (C123100dR.LIZ(strOptString$default)) {
                    this.LLILZLL = strOptString$default;
                    this.LLJILLL = 1;
                }
            }
        }
        OecInitData oecInitDataLIZ = C1733990vDx.LIZ(this.LLILZ);
        if (oecInitDataLIZ != null) {
            this.LLILZIL = oecInitDataLIZ;
        }
        if (this.LLJIJIL) {
            LJIILIIL();
        }
        if (this.LLIZ != null) {
            c21208817zC = new C21208817zC(this.LLILZ, LJFF());
        } else {
            c21208817zC = null;
        }
        this.LLJ = c21208817zC;
        if (this.LLJI) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C21191317wN(this, null), 3);
        }
    }

    @Override // X.InterfaceC1506090pIN
    public final SparkContext LIZJ(String str, String str2, boolean z) {
        String str3;
        TemplateData templateDataLJII;
        SparkContext sparkContext = new SparkContext();
        final C21210517zT c21210517zT = new C21210517zT(this.LLJILJIL, !C2274811E2d.LIZJ(), LJIIIZ(str2), z, new AwS576S0100000_32(this, 855));
        sparkContext.LJJLIIJ(str);
        sparkContext.LJJJZ("enable_lite_mode", "1");
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LJI = false;
        c1538590q8n.LJIIIZ = true;
        sparkContext.liteLynxConfig = c1538590q8n;
        final WeakReference<C21212117zj> weakReference = this.LLILLJJLI;
        sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0(weakReference, c21210517zT) { // from class: X.17zF
            public final WeakReference<C21212117zj> LIZ;
            public final C21210517zT LIZIZ;

            @Override // X.InterfaceC1554220qY0
            public final void LIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILIIL(SparkPopup sparkPopup, View view) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILJJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILL(SparkPopup sparkPopup, int i) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJI(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJJ(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJJLI(SparkPopup sparkPopup, float f) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIFFI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJ(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z2) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZI() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewAttachedToWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewDetachedFromWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIZILJ(SparkPopup sparkPopup) throws JSONException {
                C21212117zj c21212117zj = this.LIZ.get();
                if (c21212117zj != null) {
                    C1756140vng.LIZ(c21212117zj);
                }
                C21210517zT c21210517zT2 = this.LIZIZ;
                if (c21210517zT2 != null) {
                    c21210517zT2.LJJJZ();
                }
            }

            {
                this.LIZ = weakReference;
                this.LIZIZ = c21210517zT;
            }
        });
        sparkContext.LJJ(AbstractC1911210zpn.class, new C21210617zU(this.LLILLJJLI));
        sparkContext.LJJ(AbstractC1911210zpn.class, c21210517zT);
        sparkContext.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.17zE
            {
                super(0);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str4) {
                C1075770e6J c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
                if (c1075770e6J != null) {
                    c1075770e6J.LJIJ(C21210517zT.class, c21210517zT);
                }
            }
        });
        if (z) {
            C21209817zM c21209817zM = this.LLL;
            if (c21209817zM == null) {
                this.LLL = new C21209817zM(this.LLILLJJLI, c21210517zT);
            } else {
                c21209817zM.LIZJ(this.LLJILJIL, LJIIIZ(str2), c21210517zT);
            }
        }
        if (LJFF()) {
            C21208817zC c21208817zC = this.LLJ;
            if (c21208817zC != null && (str3 = c21208817zC.LLIZLLLIL) != null && (templateDataLJII = TemplateData.LJII(C21208817zC.LIZ(str3, "api first"))) != null) {
                C1547280qMo.LJ(sparkContext, templateDataLJII);
            }
            sparkContext.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.17zD
                {
                    super(0);
                }

                @Override // X.AbstractC1537870q7d
                public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                    InterfaceC21213717zz interfaceC21213717zz;
                    LifecycleOwner lifecycleOwner;
                    C21208817zC c21208817zC2;
                    MutableLiveData<String> mutableLiveData;
                    C21212117zj c21212117zj = this.LLILLJJLI.LLILLJJLI.get();
                    if (c21212117zj != null && (interfaceC21213717zz = c21212117zj.LLJI) != null && (lifecycleOwner = interfaceC21213717zz.getLifecycleOwner()) != null && (c21208817zC2 = this.LLILLJJLI.LLJ) != null && (mutableLiveData = c21208817zC2.LLJ) != null) {
                        mutableLiveData.observe(lifecycleOwner, new AObserverS191S0200000_32(c21208817zC2, interfaceC1541990qEH, 4));
                    }
                }
            });
        }
        sparkContext.LJJJJZI(new C21525119Lt(this, 3));
        return sparkContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(int r9, java.util.Map r10, X.InterfaceC1364105Vn r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C21191017wK
            if (r0 == 0) goto L5f
            r7 = r11
            X.17wK r7 = (X.C21191017wK) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L66
            int r9 = r7.LL
            X.C155000ia.LIZIZ(r6)
        L25:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L65
            if (r9 != 0) goto L36
            X.054G r2 = r8.LLJJJJLIIL
            X.17wO r1 = new X.17wO
            r1.<init>(r8, r6, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
        L36:
            return r6
        L37:
            X.C155000ia.LIZIZ(r6)
            X.01GW r0 = r8.LLJJJJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcLiveShopListFullDataConfigBean r0 = (com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcLiveShopListFullDataConfigBean) r0
            if (r0 == 0) goto L5c
            java.lang.Long r0 = r0.maxTimeOut
            if (r0 == 0) goto L5c
            long r1 = r0.longValue()
        L4c:
            X.17wH r0 = new X.17wH
            r0.<init>(r8, r10, r9, r4)
            r7.LL = r9
            r7.LLILZ = r3
            java.lang.Object r6 = X.C099A.LIZJ(r1, r0, r7)
            if (r6 != r5) goto L25
            return r5
        L5c:
            r1 = -1
            goto L4c
        L5f:
            X.17wK r7 = new X.17wK
            r7.<init>(r8, r11)
            goto L12
        L65:
            return r4
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21208517z9.LJIIIIZZ(int, java.util.Map, X.05Vn):java.lang.Object");
    }

    public final void LJIIJ(long j, boolean z, boolean z2) {
        if (!this.LLJJ) {
            this.LLJJ = ((Boolean) this.LLJJJIL.getValue()).booleanValue();
        }
        if (this.LLJZIJLIL == null && 1 == this.LLJJJ) {
            this.LLJZIJLIL = Boolean.valueOf(this.LLJJ);
        }
        Boolean bool = this.LLJZIJLIL;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2)) {
            this.LLJJLIIIJLLLLLLLZ = LJIIJJI(null, "live_cart", null, null, true);
        }
        this.LLJLILLLLZIIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZ), null, null, new C1894300zOW(j, this, z, z2, null), 3);
        if (!z && !Intrinsics.LJFF(this.LLJZIJLIL, bool2) && ((Boolean) C0AAY.LIZ.getValue()).booleanValue()) {
            C1546510qLZ c1546510qLZ = new C1546510qLZ();
            c1546510qLZ.LIZ = true;
            c1546510qLZ.LJFF = "ec_shop_bag_biz";
            c1546510qLZ.LIZLLL = 1;
            c1546510qLZ.LJIIL = C21212117zj.LLLLJ;
            c1546510qLZ.LJIILIIL = C21212117zj.LLLLILI;
            c1546510qLZ.LJIIIZ = AFwS320S0000000_32.get$arr$(4);
            this.LLIZLLLIL = c1546510qLZ;
            C1546500qLY c1546500qLY = C1546560qLe.LIZ;
            Boolean bool3 = Boolean.FALSE;
            c1546500qLY.getClass();
            C1546500qLY.LJI(c1546510qLZ, bool3);
        }
    }

    @Override // X.InterfaceC21213517zx
    public final void onClick(long j, String str, Map<String, ? extends Object> map, String str2) throws JSONException {
        String idStr;
        Long lValueOf;
        User owner;
        this.LLJILJIL = j;
        if (LJ()) {
            String strLIZ = CreatorProductListLynxConfigSettings.LIZ();
            Room room = this.LLILZ;
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = CardStruct.IStatusCode.DEFAULT;
            }
            String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(strLIZ, "_roomId_", idStr, false), "_isLiving_", "true", false), "_liveStatus_", "during_live", false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJIFFI);
            sbLIZ.append("&moderate_author_id=");
            Room room2 = this.LLILZ;
            if (room2 != null && (owner = room2.getOwner()) != null) {
                lValueOf = Long.valueOf(owner.getId());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append("&user_type=moderator");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Context context = this.LLIZ;
            if (context != null) {
                SmartRouter.buildRoute(context, strLIZIZ).open();
                return;
            }
            return;
        }
        LJIILJJIL(map);
        LJIIJJI(null, str2, str, map, false);
    }

    public final String LJIIJJI(String str, String str2, String str3, Map<String, ? extends Object> map, boolean z) throws JSONException {
        boolean z2;
        boolean z3;
        String strLIZJ;
        boolean z4;
        String str4;
        int i;
        String string;
        Long lValueOf;
        C21208817zC c21208817zC;
        String str5;
        String string2;
        String strLIZ = str;
        String str6 = C1742330vRP.LIZ;
        if (((Number) C286250BJv.LIZ.getValue()).intValue() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Long lValueOf2 = null;
        if (z2) {
            C1191504lN c1191504lN = C1191504lN.LIZ;
            String str7 = C1742330vRP.LIZ;
            String value = EnumC1733160vCc.SHOP_BAG_LIST.getValue();
            c1191504lN.getClass();
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1742340vRQ(str7, "shop_bag_list", value, null), 3);
        }
        if (strLIZ == null) {
            strLIZ = C0CC0.LIZ();
        }
        if (strLIZ.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Object obj = "";
        if (!z3) {
            return "";
        }
        String strLIZLLL = LIZLLL(strLIZ, str3, str2, map, z);
        this.LLJJJJJIL = strLIZLLL;
        if (!z) {
            Boolean bool = this.LLJZIJLIL;
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            this.LLJZIJLIL = bool;
            long jLIZ = this.LL.LIZ("first_show_shop_bag_icon_time");
            C1743900vTw c1743900vTw = this.LL;
            if (c1743900vTw != null) {
                strLIZJ = c1743900vTw.LIZJ("enter_from_merge");
            } else {
                strLIZJ = null;
            }
            Room room = this.LLILZ;
            if (room != null) {
                lValueOf2 = Long.valueOf(room.getId());
            }
            if (str2.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String str8 = "live_room";
            if (z4) {
                str4 = "live_room";
            } else {
                str4 = str2;
            }
            int i2 = !this.LLJL ? 1 : 0;
            Integer numValueOf = Integer.valueOf(this.LLJJIII);
            Integer numValueOf2 = Integer.valueOf(this.LLJJIJI);
            long jCurrentTimeMillis = System.currentTimeMillis() - jLIZ;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C21196317xB.LIZ.getClass();
            long j = jCurrentTimeMillis2 - C21196317xB.LJIIIZ;
            C212391189t c212391189t = C212391189t.LIZ;
            String strValueOf = String.valueOf(lValueOf2);
            c212391189t.getClass();
            String strLIZ2 = C212391189t.LIZ("shop_bag", strValueOf);
            if (strLIZ2 != null && strLIZ2.length() != 0) {
                i = 0;
            } else {
                i = 1;
            }
            Pair[] pairArr = new Pair[8];
            pairArr[0] = new Pair("enter_from", str4);
            pairArr[1] = new Pair("click_delay", Long.valueOf(j));
            pairArr[2] = new Pair("click_delay_show", Long.valueOf(jCurrentTimeMillis));
            pairArr[3] = new Pair("has_cached_preview", Integer.valueOf(i ^ 1));
            pairArr[4] = new Pair("is_first_click", Integer.valueOf(i2));
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            pairArr[5] = new Pair("enter_from_merge", strLIZJ);
            pairArr[6] = new Pair("ai_predict", numValueOf);
            pairArr[7] = new Pair("ai_preload", numValueOf2);
            C1421105hJ.LIZLLL("rd_tiktokec_live_shopping_bag_click", pairArr);
            EnumC21192817wc enumC21192817wc = EnumC21192817wc.CLICK;
            if (lValueOf2 != null) {
                string = lValueOf2.toString();
            } else {
                string = null;
            }
            Long lValueOf3 = null;
            C21196417xC.LIZ(enumC21192817wc, string, null, null, null, false, null, null, 220);
            if (this.LLIZLLLIL != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("start_click_time", this.LLJILJIL);
                if (str2.length() != 0) {
                    str8 = str2;
                }
                jSONObject.put("enter_from", str8);
                if (!this.LLJL) {
                    str5 = "1";
                } else {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("is_first_click", str5);
                jSONObject.put("is_enable_reuse", "1");
                if (map != null) {
                    obj = map;
                }
                jSONObject.put("extra_track_params", obj);
                Room room2 = this.LLILZ;
                if (room2 != null) {
                    string2 = Long.valueOf(room2.getId()).toString();
                } else {
                    string2 = null;
                }
                HotRoomInfo hotRoomInfoLIZJ = C598410NdX.LIZJ(string2);
                if (hotRoomInfoLIZJ != null) {
                    jSONObject.put("hot_live_room_path", C1741890vQh.LJIIIIZZ(hotRoomInfoLIZJ));
                }
                C21196317xB.LJIIJ = jSONObject;
            }
            Room room3 = this.LLILZ;
            if (room3 != null) {
                lValueOf = Long.valueOf(room3.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf2 = String.valueOf(lValueOf);
            if (C21196317xB.LJIIL) {
                int i3 = C21197617xO.LIZ;
                C21197617xO.LJ(strValueOf2, C21196317xB.LJIIJJI, false);
            } else if (C21196317xB.LJIILIIL) {
                C21197617xO.LJ(strValueOf2, null, true);
            }
            if (Intrinsics.LJFF(this.LLJZIJLIL, Boolean.TRUE)) {
                Context context = this.LLIZ;
                if (context != null) {
                    C21209817zM c21209817zM = this.LLL;
                    if (c21209817zM != null) {
                        c21209817zM.LIZJ(this.LLJILJIL, LJIIIZ(str2), null);
                    }
                    C421580Gg0.LIZ(new C21209917zN(context, this, strLIZLLL, str2, map, str3));
                }
            } else {
                C21208817zC c21208817zC2 = this.LLJ;
                if (c21208817zC2 != null) {
                    Room room4 = this.LLILZ;
                    if (room4 != null) {
                        lValueOf3 = Long.valueOf(room4.getId());
                    }
                    long j2 = this.LLJILJIL;
                    boolean z5 = this.LLJL;
                    C1537720q7O c1537720q7O = c21208817zC2.LLILZ;
                    if (c1537720q7O != null) {
                        c1537720q7O.U0(C2097908Jt.LIZJ(new Pair("shopping_list_datas", C21208717zB.LIZ(lValueOf3, j2, str2, z5, ((Boolean) C0AAY.LIZ.getValue()).booleanValue(), map))));
                    }
                }
                if (this.LLJLL && ((!this.LLJL || this.LLIZLLLIL == null) && (c21208817zC = this.LLJ) != null)) {
                    c21208817zC.LIZJ();
                }
                Context context2 = this.LLIZ;
                if (context2 != null) {
                    C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                    SparkContext sparkContextLIZJ = LIZJ(strLIZLLL, str2, false);
                    c1537900q7g.getClass();
                    new C1541950qED(context2, sparkContextLIZJ).LIZIZ();
                }
            }
            this.LLJL = true;
        }
        return strLIZLLL;
    }
}
