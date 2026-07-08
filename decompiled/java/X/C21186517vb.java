package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.PreviewData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.PreviewHighlightData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.EnterRoomPrompt;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17vb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21186517vb implements InterfaceC469100IaS {
    public static final C01GW<C21186517vb> LJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(151));
    public C598640Ndu LIZ;
    public long LIZIZ = System.currentTimeMillis();
    public AnonymousClass0956 LIZJ;
    public String LIZLLL;

    @Override // X.InterfaceC469100IaS
    public final C0IHN LIZ() {
        return new C0IHN() { // from class: X.17vu
            @Override // X.C0IHN
            public final void LIZ(Fragment fragment, Room room) throws JSONException {
                Long lValueOf;
                Long lValueOf2;
                long id;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onExitRoom:");
                String idStr = null;
                if (room != null) {
                    lValueOf = Long.valueOf(room.getId());
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                C21196317xB c21196317xB = C21196317xB.LIZ;
                if (room != null) {
                    lValueOf2 = Long.valueOf(room.getId());
                } else {
                    lValueOf2 = null;
                }
                c21196317xB.getClass();
                C21196317xB.LIZJ(lValueOf2);
                if (room != null) {
                    idStr = room.getIdStr();
                }
                Object objValueOf = "";
                if (C123100dR.LIZ(idStr)) {
                    HashMap<String, Map<String, Object>> map = C21190617wG.LIZJ;
                    if (map.containsKey(idStr)) {
                        map.remove(idStr);
                        C212391189t.LIZ.getClass();
                        C212391189t.LIZIZ("shop_bag", idStr, "");
                        C212391189t.LIZIZ("prerender_bag_assemble", idStr, "");
                        C212391189t.LIZIZ("lru_mix_shop_bag", idStr, "");
                        C212391189t.LIZIZ("product_update", idStr, "");
                    }
                }
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                C1511870pRh.LIZJ.remove(Long.valueOf(id));
                if (room != null) {
                    long id2 = room.getId();
                    C1733990vDx.LIZIZ(id2);
                    String strValueOf = String.valueOf(id2);
                    C598410NdX.LIZLLL().remove(strValueOf);
                    ((Map) C598410NdX.LIZIZ.getValue()).remove(strValueOf);
                    C598360NdS.LIZ(strValueOf);
                    String strValueOf2 = String.valueOf(id2);
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ECLiveMessageCenter: leave room: ");
                    sbLIZ2.append(strValueOf2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c2341109Fh.getClass();
                    C2341109Fh.LJ(strLIZIZ);
                    ((ConcurrentHashMap) C21182917v1.LIZ.getValue()).remove(strValueOf2);
                    C21182917v1.LIZIZ().remove(strValueOf2);
                    ((ConcurrentHashMap) C21182917v1.LIZJ.getValue()).remove(strValueOf2);
                    C20340514iR.LIZ(String.valueOf(id2));
                }
                C21213217zu.LIZJ(room);
                C21199917xl.LIZIZ(room);
                IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
                JSONObject jSONObject = new JSONObject();
                if (room != null) {
                    objValueOf = Long.valueOf(room.getId());
                }
                jSONObject.put("room_id", objValueOf);
                iEventCenter.LIZ("ec_live_shop_widget_on_destroy", C786410Ut5.J3(jSONObject));
            }

            @Override // X.C0IHN
            public final void LIZIZ(LivePlayFragment livePlayFragment, Room room, long j, String str, boolean z, String str2, C0IIF c0iif, HashMap map) throws JSONException {
                boolean zBooleanValue;
                boolean z2;
                String str3;
                OecInitData oecInitData;
                Boolean boolValueOf;
                int i;
                String str4;
                Type type;
                String str5;
                Boolean boolLJLI;
                OecInitData oecInitDataLIZ;
                IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
                if (iECommerceRegionService != null && iECommerceRegionService.isEnable() && (oecInitDataLIZ = C1733990vDx.LIZ(room)) != null) {
                    iECommerceRegionService.LJI(EnumC21192017wU.ROOM, oecInitDataLIZ.regionInfo, room.getRequestId(), null);
                    iECommerceRegionService.LIZIZ(room.getIdStr(), false);
                }
                this.LIZ.LIZLLL = room.getIdStr();
                C21194817ww.LJIIIZ = System.currentTimeMillis();
                C21196317xB.LIZ.getClass();
                C21196317xB.LIZIZ(livePlayFragment, room);
                C598640Ndu c598640Ndu = this.LIZ.LIZ;
                if (c598640Ndu != null) {
                    C2341109Fh.LIZ.getClass();
                    C2341109Fh.LJ("destroy");
                    c598640Ndu.LIZ.set(true);
                }
                this.LIZ.LIZ = new C598640Ndu();
                C21197617xO.LIZ = 0;
                C21197617xO.LIZIZ = String.valueOf(room.getId());
                if (map != null && (str5 = (String) map.get("has_shown_ec_feed_shopping_bag_card")) != null && (boolLJLI = a0.LJLI(str5)) != null) {
                    zBooleanValue = boolLJLI.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                C21186517vb c21186517vb = this.LIZ;
                AnonymousClass0956 anonymousClass0956 = c21186517vb.LIZJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c21186517vb.LIZIZ = System.currentTimeMillis();
                if (((Boolean) C276570Ash.LIZ.getValue()).booleanValue()) {
                    BcmParams bcmParams = new BcmParams();
                    bcmParams.put("action_type", str2);
                    BtmSDK.INSTANCE.setBcmPageParams(PageFinder.via((Fragment) livePlayFragment), bcmParams, Boolean.FALSE);
                }
                CommerceStruct commerceStruct = room.getCommerceStruct();
                if (commerceStruct != null && commerceStruct.commercePermission == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                CommerceStruct commerceStruct2 = room.getCommerceStruct();
                if (commerceStruct2 != null) {
                    str3 = commerceStruct2.oecInitDataString;
                } else {
                    str3 = null;
                }
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(OecInitData.class));
                    } else {
                        type = new TypeToken<OecInitData>() { // from class: X.17vX
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str3, type);
                    if (!(objFromJson instanceof OecInitData)) {
                        objFromJson = null;
                    }
                    oecInitData = (OecInitData) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    C21197617xO.LIZ(String.valueOf(room.getId()), e.getMessage());
                    oecInitData = null;
                }
                if (!z2) {
                    C21213217zu.LIZLLL = null;
                }
                if (oecInitData == null) {
                    if (z2) {
                        CommerceStruct commerceStruct3 = room.getCommerceStruct();
                        if (commerceStruct3 != null && (str4 = commerceStruct3.oecInitDataString) != null && str4.length() != 0) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        C1421105hJ.LIZLLL("rd_tiktokec_on_enter_room", new Pair("room_id", Long.valueOf(room.getId())), new Pair("is_oec_data_empty", Integer.valueOf(i)), new Pair("is_oec_data_decode_failed", Integer.valueOf(i ^ 1)));
                        return;
                    }
                    return;
                }
                if (z2) {
                    C1421105hJ.LIZLLL("rd_tiktokec_on_enter_room", new Pair("room_id", Long.valueOf(room.getId())), new Pair("is_oec_data_empty", 0), new Pair("is_oec_data_decode_failed", 0));
                }
                C1733990vDx.LIZ.put(Long.valueOf(room.getId()), oecInitData);
                CommerceStruct commerceStruct4 = room.getCommerceStruct();
                if (commerceStruct4 != null) {
                    boolValueOf = Boolean.valueOf(commerceStruct4.asyncLoad);
                } else {
                    boolValueOf = null;
                }
                boolean zLIZIZ = C21194717wv.LIZIZ(oecInitData, boolValueOf);
                if (oecInitData.productNum > 0 && oecInitData.displayProductNum > 0) {
                    ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIIZZ("shop_bag_icon", null, Long.valueOf(j), null, null);
                } else {
                    C21213217zu.LIZLLL = null;
                }
                if (zLIZIZ) {
                    ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIIZZ("pop_card", null, Long.valueOf(j), null, null);
                }
                C21190617wG.LJFF(room.getIdStr(), c0iif.LIZ);
                C23250099c.LIZJ(LifecycleOwnerKt.getLifecycleScope(livePlayFragment), C23271099x.INSTANCE, C099V.DEFAULT, new C21165417sC(new C21188217vs(oecInitData, c21186517vb, room, str, z, zBooleanValue, str2, livePlayFragment), oecInitData, Long.valueOf(room.getId()), z2, null));
            }
        };
    }

    public final void LIZIZ(Fragment fragment, String str) {
        Type type;
        PreviewHighlightData previewHighlightData;
        EnterRoomPrompt enterRoomPrompt = null;
        if (str != null) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(PreviewData.class));
                } else {
                    type = new TypeToken<PreviewData>() { // from class: X.0vRV
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                if (!(objFromJson instanceof PreviewData)) {
                    objFromJson = null;
                }
                PreviewData previewData = (PreviewData) objFromJson;
                if (previewData != null && (previewHighlightData = previewData.highlightData) != null) {
                    enterRoomPrompt = previewHighlightData.toastInfo;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LIZJ(enterRoomPrompt, fragment);
    }

    public final void LIZJ(EnterRoomPrompt enterRoomPrompt, Fragment fragment) {
        if (enterRoomPrompt != null && enterRoomPrompt.needPrompt) {
            AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C505001xw(fragment, enterRoomPrompt, null), 3);
            this.LIZJ = anonymousClass0956LIZLLL;
            anonymousClass0956LIZLLL.start();
        }
    }
}
