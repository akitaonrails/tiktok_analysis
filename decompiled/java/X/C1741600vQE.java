package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import com.bytedance.android.livesdk.model.message.EcDrawGrabRemindMessage;
import com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.EcDrawMessage;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.SlimShortTouch;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741600vQE implements InterfaceC21213517zx, InterfaceC1741780vQW, InterfaceC1141530foN {
    public final Room LL;
    public final Context LLILLJJLI;
    public final Lifecycle LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public long LLJI;
    public String LLJJIJIIJIL;
    public Long LLIZ = 0L;
    public Map<String, String> LLIZLLLIL = new LinkedHashMap();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(332));
    public final C054G LLJIJIL = C2296808zG.LIZ(C2126308Ur.LJFF);
    public final HashSet<String> LLJILJIL = new HashSet<>();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(331));
    public String LLJILLL = "";
    public final List<String> LLJJ = new ArrayList();
    public final Map<String, String> LLJJI = new LinkedHashMap();
    public final Map<String, Long> LLJJIII = new LinkedHashMap();
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(333));

    @Override // X.InterfaceC21213517zx
    public final void onAudiencePermissionChanged(boolean z) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onClick(long j, String str, Map<String, ? extends Object> map, String str2) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onDispose() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onExposure(String str) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onProductNumChange(int i) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onShopBagIconDrawableLoaded() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onSlotCreated(IIconSlot.SlotViewModel slotViewModel, InterfaceC21213717zz interfaceC21213717zz) {
    }

    @Override // X.InterfaceC21213517zx
    public final void onStart() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onStop() {
    }

    @Override // X.InterfaceC21213517zx
    public final void onPause() {
        this.LLJILLL = "";
    }

    @Override // X.InterfaceC21213517zx
    public final void onResume() {
        if (Intrinsics.LJFF(this.LLJILLL, "")) {
            return;
        }
        SmartRouter.buildRoute(this.LLILLJJLI, this.LLJILLL).open();
        this.LLJILLL = "";
    }

    @Override // X.InterfaceC21213517zx
    public final void onDestroy() {
        C1514860pWW.LIZ(this);
        C1548820qPI.LJIIIIZZ("ec_lucky_bag_activity_page_open", this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0vQE] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static void LIZLLL(C1741600vQE c1741600vQE) {
        ?? arrayList;
        Room room = c1741600vQE.LL;
        if (room != null) {
            List<ShortTouchItem> list = room.shortTouchItems;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (ShortTouchItem shortTouchItem : list) {
                    arrayList.add(new SlimShortTouch(shortTouchItem.animeType, shortTouchItem.name, shortTouchItem.schema, shortTouchItem.previewSetting, shortTouchItem.iconSkin, shortTouchItem.activityId));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c1741600vQE.LJ(room, arrayList, false, "room_enter_api");
            CommerceStruct commerceStruct = room.getCommerceStruct();
            if (commerceStruct != null && commerceStruct.asyncLoad && room.getId() > 0 && room.getOwnerUserId() > 0) {
                C23250099c.LIZLLL(c1741600vQE.LLJIJIL, null, null, new C0NSV(room, c1741600vQE, false, null), 3);
            }
        }
    }

    @Override // X.InterfaceC1741780vQW
    public final boolean LIZ(IMessage iMessage) {
        ECommerceMessage eCommerceMessage;
        if ((iMessage instanceof EcDrawMessage) || (iMessage instanceof ECShortItemRefreshMessage) || (((iMessage instanceof ECommerceMessage) && (eCommerceMessage = (ECommerceMessage) iMessage) != null && eCommerceMessage.actionType == 9) || (iMessage instanceof EcDrawGrabRemindMessage))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String string;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ec_lucky_bag_activity_page_open")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                string = interfaceC1107590evd.getString("containerID");
            } else {
                string = null;
            }
            this.LLJJIJIIJIL = string;
        }
    }

    @Override // X.InterfaceC21213517zx
    public final void onCreate(Bundle bundle) {
        C1514860pWW.LIZ.add(new WeakReference<>(this, C1514860pWW.LIZIZ));
        C1548820qPI.LIZLLL("ec_lucky_bag_activity_page_open", this);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x032a  */
    @Override // X.InterfaceC1741780vQW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1741600vQE.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[PHI: r5
      0x0039: PHI (r5v4 java.util.List<java.lang.String>) = 
      (r5v2 java.util.List<java.lang.String>)
      (r5v2 java.util.List<java.lang.String>)
      (r5v5 java.util.List<java.lang.String>)
     binds: [B:26:0x005c, B:28:0x0060, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage r11, boolean r12) {
        /*
            r10 = this;
            r6 = r10
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LL
            r9 = 0
            if (r0 == 0) goto L65
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        Le:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r6.LL
            if (r0 == 0) goto L24
            long r0 = r0.getOwnerUserId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = r0.toString()
            if (r4 != 0) goto L26
        L24:
            java.lang.String r4 = ""
        L26:
            r8 = r11
            if (r12 == 0) goto L52
            java.lang.String r2 = "shortTouchEcommerceBonusTask"
            java.lang.String r1 = "shortTouchEcommerceLuckyBag"
            java.lang.String r0 = "shortTouchEcommerceVoucher"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0, r2}
            java.util.List r5 = X.C1697810uHb.LJIIJJI(r0)
        L37:
            if (r12 == 0) goto L5c
        L39:
            r7 = 0
        L3a:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L51
            boolean r0 = X.C123100dR.LIZ(r4)
            if (r0 == 0) goto L51
            X.054G r1 = r6.LLJIJIL
            X.0NSW r2 = new X.0NSW
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r9, r9, r2, r0)
        L51:
            return
        L52:
            if (r8 == 0) goto L5b
            com.bytedance.android.livesdk.model.message.ext.ShortItemRefreshEntity r0 = r8.entity
            if (r0 == 0) goto L5b
            java.util.List<java.lang.String> r5 = r0.refreshItems
            goto L37
        L5b:
            r5 = r9
        L5c:
            if (r8 == 0) goto L39
            com.bytedance.android.livesdk.model.message.ext.ShortItemRefreshEntity r0 = r8.entity
            if (r0 == 0) goto L39
            int r7 = r0.interval
            goto L3a
        L65:
            r0 = r9
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1741600vQE.LIZJ(com.bytedance.android.livesdk.model.message.ext.ECShortItemRefreshMessage, boolean):void");
    }

    public final void LJFF(ECShortItemRefreshMessage eCShortItemRefreshMessage, boolean z) {
        Long l = this.LLIZ;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                C23250099c.LIZLLL(this.LLJIJIL, null, null, new C0NJV(jLongValue, this, eCShortItemRefreshMessage, z, null), 3);
            } else {
                LIZJ(eCShortItemRefreshMessage, z);
            }
        }
    }

    public final void LJI(String str, String str2) throws JSONException {
        Unit unit;
        String str3;
        ((ArrayList) C07PT.LIZ).add(str);
        try {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObject = new JSONObject();
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            jSONObject.put("activity_id", str3);
            jSONObject.put("reason", str2);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_remove_lucky_bag", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str4 = (String) ((LinkedHashMap) this.LLJJI).get(str);
        if (str4 != null) {
            if (!((ArrayList) this.LLJJ).isEmpty() && Intrinsics.LJFF(C13LP.LJJLIIIJJI(this.LLJJ), str)) {
                InterfaceC1087010eOR interfaceC1087010eORLJIIJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJIIJ();
                if (interfaceC1087010eORLJIIJ != null) {
                    interfaceC1087010eORLJIIJ.Ud(EnumC1101860emO.ID, str4);
                    unit = Unit.LIZ;
                }
            } else {
                C594270NSn.LJ((String) C13LP.LJJLIIIJL(this.LLJJ), "remove wrong giveaway");
                unit = Unit.LIZ;
            }
            if (unit != null) {
                return;
            }
        }
        C594270NSn.LJ((String) C13LP.LJJLIIIJL(this.LLJJ), "activityId not found");
    }

    @Override // X.InterfaceC21213517zx
    public final void prepareToShow(Map<String, ? extends Object> map, InterfaceC756140TlM interfaceC756140TlM) {
        String str;
        String str2;
        String str3;
        Long l;
        Map<String, String> map2;
        Long l2;
        Object obj = map.get("param_live_enter_from_merge");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        this.LLILZ = str;
        Object obj2 = map.get("param_live_enter_method_merge");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        this.LLILZIL = str2;
        Object obj3 = map.get("param_live_action_type");
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        } else {
            str3 = null;
        }
        this.LLILZLL = str3;
        Object obj4 = map.get("delay_time_for_load_ecommerce_widget");
        if (obj4 instanceof Long) {
            l = (Long) obj4;
        } else {
            l = null;
        }
        this.LLIZ = l;
        Object obj5 = map.get("param_extra_ec_common_extra_param");
        if (C19719512Dh.LJII(obj5)) {
            map2 = (Map) obj5;
        } else {
            map2 = null;
        }
        this.LLIZLLLIL = map2;
        this.LLJI = System.currentTimeMillis();
        if (!((Boolean) this.LLJ.getValue()).booleanValue() && (l2 = this.LLIZ) != null) {
            long jLongValue = l2.longValue();
            if (jLongValue > 0) {
                C23250099c.LIZLLL(this.LLJIJIL, null, null, new C0NJU(jLongValue, this, null), 3);
            } else {
                LIZLLL(this);
            }
        }
    }

    public C1741600vQE(Room room, Context context, Lifecycle lifecycle) {
        this.LL = room;
        this.LLILLJJLI = context;
        this.LLILLL = lifecycle;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.bytedance.android.livesdkapi.depend.model.live.Room r32, java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.infra.api.SlimShortTouch> r33, boolean r34, java.lang.String r35) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1741600vQE.LJ(com.bytedance.android.livesdkapi.depend.model.live.Room, java.util.List, boolean, java.lang.String):void");
    }

    public final void LIZIZ(InterfaceC1087010eOR interfaceC1087010eOR, SlimShortTouch slimShortTouch, boolean z, Room room, String str) {
        String str2;
        Uri uri;
        String strValueOf;
        boolean z2;
        String str3;
        String str4;
        ShortTouchPreviewSetting shortTouchPreviewSetting = slimShortTouch.previewSetting;
        InterfaceC1101720emA interfaceC1101720emAZd = null;
        if (shortTouchPreviewSetting != null) {
            str2 = shortTouchPreviewSetting.previewSchema;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str2) && !((Boolean) this.LLJJIJI.getValue()).booleanValue()) {
            ShortTouchPreviewSetting shortTouchPreviewSetting2 = slimShortTouch.previewSetting;
            if (shortTouchPreviewSetting2 != null) {
                str4 = shortTouchPreviewSetting2.previewSchema;
            } else {
                str4 = null;
            }
            uri = UriProtector.parse(str4);
        } else {
            uri = null;
        }
        String str5 = slimShortTouch.name;
        if (str5 != null) {
            Context context = this.LLILLJJLI;
            String str6 = slimShortTouch.schema;
            if (str6 == null) {
                str6 = "";
            }
            Uri uriBuild = UriProtector.parse(str6);
            if (Intrinsics.LJFF(str5, "shortTouchEcommerceVoucher")) {
                Map<String, String> map = this.LLIZLLLIL;
                if (map != null && (str3 = map.get("source_module")) != null) {
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uriBuild);
                    Uri.Builder builderBuildUpon = uriBuild.buildUpon();
                    if (!queryParameterNames.contains("source_module")) {
                        uriBuild = builderBuildUpon.appendQueryParameter("source_module", str3).build();
                    }
                }
            } else if (Intrinsics.LJFF(str5, "shortTouchEcommerceLuckyBag") && (strValueOf = String.valueOf(System.currentTimeMillis())) != null) {
                Set<String> queryParameterNames2 = UriProtector.getQueryParameterNames(uriBuild);
                Uri.Builder builderBuildUpon2 = uriBuild.buildUpon();
                if (!queryParameterNames2.contains("start_time_mil")) {
                    uriBuild = builderBuildUpon2.appendQueryParameter("start_time_mil", strValueOf).build();
                }
            }
            InterfaceC1085330eLj interfaceC1085330eLjVd = interfaceC1087010eOR.Vd(context, uriBuild, this.LLILLL, str5, null, false);
            if (interfaceC1085330eLjVd != null) {
                EnumC1101860emO enumC1101860emO = EnumC1101860emO.NAME;
                if (uri != null) {
                    Context context2 = this.LLILLJJLI;
                    if (!z && !((Boolean) this.LLJJIJI.getValue()).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    interfaceC1101720emAZd = interfaceC1087010eOR.Zd(context2, uri, z2);
                }
                interfaceC1087010eOR.Wd(enumC1101860emO, str5, interfaceC1085330eLjVd, interfaceC1101720emAZd);
                String str7 = slimShortTouch.activityId;
                if (str7 != null) {
                    ((ArrayList) this.LLJJ).add(str7);
                    this.LLJJI.put(str7, interfaceC1085330eLjVd.dT1());
                }
                C594270NSn.LIZLLL(room.getIdStr(), slimShortTouch.name, slimShortTouch.schema, str);
            }
        }
    }
}
