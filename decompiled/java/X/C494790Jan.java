package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.OpenSubActionSheetMethod$handle$1;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.comp.api.subscription.event.SubscribeViewOnShowChannel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.badge.LiveSubscribeEmojiInputDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote.SuggestEmotePageSheet;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.comp.impl.subscription.commonui.SubActionSheetDialog;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0Jan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494790Jan implements InterfaceC494820Jaq {
    public boolean LIZ;

    public static final LiveSubscribeEmojiInputDialog LJIILIIL(FragmentManager fragmentManager) {
        Bundle bundle = new Bundle();
        LiveSubscribeEmojiInputDialog liveSubscribeEmojiInputDialog = new LiveSubscribeEmojiInputDialog();
        liveSubscribeEmojiInputDialog.setArguments(bundle);
        liveSubscribeEmojiInputDialog.show(fragmentManager, "LiveSubscribeEmojiInputDialogFragment");
        return liveSubscribeEmojiInputDialog;
    }

    public final void LJIIL(boolean z) {
        this.LIZ = z;
        DataChannelGlobal.LLILZ.HQ2(SubscribeViewOnShowChannel.class, Boolean.valueOf(z));
    }

    public static final void LJI(DataChannel dataChannel, LiveSubOnlyConfig liveSubOnlyConfig) {
        C493910JYn c493910JYn = SubOnlyLiveSettingDialogNew.LLJLL;
        boolean zKw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(dataChannel);
        c493910JYn.getClass();
        C493910JYn.LIZ(dataChannel, "anchor_close_live_popup", liveSubOnlyConfig, "", false, zKw0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static final void LJFF(Context context, String str, boolean z) {
        C19EG c19egLIZIZ;
        ViewModelProvider viewModelProviderOf;
        DataChannel dataChannelLIZ;
        C19EG c19egLIZIZ2;
        IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (context != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context)) != null) {
                dataChannelLIZ = C0IJR.LIZ(ViewModelProviders.of(c19egLIZIZ2), c19egLIZIZ2);
            } else {
                return;
            }
        } else {
            ?? LJIJI = C520010KaN.LJIJI(context);
            if (LJIJI == 0) {
                if (context != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context);
                } else {
                    return;
                }
            } else {
                c19egLIZIZ = null;
                if (LJIJI == 0 || (viewModelProviderOf = ViewModelProviders.of((Fragment) LJIJI)) == null) {
                }
                dataChannelLIZ = C0IJR.LIZ(viewModelProviderOf, LJIJI);
            }
            if (c19egLIZIZ != null) {
                viewModelProviderOf = ViewModelProviders.of(c19egLIZIZ);
            } else {
                viewModelProviderOf = null;
            }
            if (LJIJI == 0) {
                LJIJI = c19egLIZIZ;
            }
            if (viewModelProviderOf == null || LJIJI == 0) {
                return;
            }
            dataChannelLIZ = C0IJR.LIZ(viewModelProviderOf, LJIJI);
        }
        if (dataChannelLIZ != null) {
            C493910JYn c493910JYn = SubOnlyLiveSettingDialogNew.LLJLL;
            dataChannelLIZ.SX0(C748880TZe.class, C520010KaN.LJIL(context, false));
            c493910JYn.getClass();
            C493910JYn.LIZ(dataChannelLIZ, str, null, "jsbOpen", true, z);
        }
    }

    public static final void LJII(Context context, String str, Map map) {
        if (str != null && !a0.LJJJIL(str)) {
            C495520Jby c495520Jby = new C495520Jby(str);
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
        }
    }

    public static final void LJIIIZ(Context context, String str, Map<String, String> map) {
        C0K8F.LIZ.getClass();
        C0K8F.LJII(context, str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(android.content.Context r4, com.bytedance.android.livesdkapi.depend.model.live.Room r5, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7
            return
        L7:
            X.0Jby r2 = new X.0Jby
            r2.<init>(r6)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r3 = r0.user()
            long r0 = r5.getOwnerUserId()
            java.lang.String r1 = r3.LJIJ(r0)
            java.lang.String r0 = "anchor_id"
            r2.LIZJ(r0, r1)
            java.lang.String r3 = "room_id"
            long r0 = r5.getId()
            r2.LIZIZ(r0, r3)
            qo2.w r0 = qo2.w.LIZ
            r0.getClass()
            java.lang.String r1 = qo2.w.LJIIIZ()
            java.lang.String r0 = "enter_from_merge"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = qo2.w.LJIIL()
            java.lang.String r0 = "enter_method"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = "show_entrance"
            java.lang.String r0 = "webapp"
            r2.LIZJ(r1, r0)
            java.lang.String r1 = qo2.w.LJIJI()
            java.lang.String r0 = "request_id"
            r2.LIZJ(r0, r1)
            java.lang.String r1 = qo2.w.LJJII()
            java.lang.String r0 = "video_id"
            r2.LIZJ(r0, r1)
            com.bytedance.android.live.base.model.user.User r0 = r5.getOwner()
            if (r0 == 0) goto L86
            com.bytedance.android.live.base.model.user.SubscribeInfo r0 = r0.getSubscribeInfo()
            if (r0 == 0) goto L86
            boolean r0 = r0.isSubscribed()
            r1 = 1
            if (r0 != r1) goto L86
        L6d:
            java.lang.String r0 = "is_subscribe"
            r2.LIZ(r1, r0)
            java.lang.String r0 = r2.LIZLLL()
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r0 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r0
            r0.handle(r4, r1)
            return
        L86:
            r1 = 0
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C494790Jan.LJIIJ(android.content.Context, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String):void");
    }

    public static final void LJIIJJI(Context context, Room room, String str, Map<String, String> map) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(C508940Jxc.LIZIZ(map, room, str)));
    }

    public static final void LIZLLL(FragmentManager fragmentManager, String str, List list, List list2, OpenSubActionSheetMethod$handle$1 openSubActionSheetMethod$handle$1) {
        new Object() { // from class: X.0Jav
        }.getClass();
        String str2 = SubActionSheetDialog._pnsPageId;
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.LIZ(3, null);
        sheetOptions.dimBehindType = 1;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("title", str, bundle);
        C786410Ut5.LJJJI("cover", "payment_processing.png", bundle);
        C786410Ut5.LJJIL(bundle, "descriptions", new ArrayList(list));
        C786410Ut5.LJJIL(bundle, "actions", new ArrayList(list2));
        C786410Ut5.LJJIJL(bundle, "callback", openSubActionSheetMethod$handle$1);
        C19322110iZ.LIZLLL(fragmentManager, SubActionSheetDialog.class, "subscription_action_sheet_dialog", sheetOptions, bundle);
    }

    public static final Fragment LJIIIIZZ(String str, String str2, int i, Function0 function0, String str3, String str4) {
        if (i == 1) {
            SuggestEmotePageSheet suggestEmotePageSheet = new SuggestEmotePageSheet();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("sec_user_id", str, bundle);
            C786410Ut5.LJJJI("show_entrance", str2, bundle);
            C786410Ut5.LJJJI("anchor_id", str3, bundle);
            C786410Ut5.LJJJI("upload_user_type", str4, bundle);
            suggestEmotePageSheet.setArguments(bundle);
            return suggestEmotePageSheet;
        }
        SuggestEmotePageFragment.LLJI.getClass();
        return C491550JPl.LIZ(str, str2, str3, str4, function0, false);
    }

    @Override // X.InterfaceC494820Jaq
    public final void LIZ(Context context, Room room, String str, String str2, String str3, long j, long j2) throws JSONException {
        LIZJ(context, room, str, null, str2, str3, 0L, true, j, j2, AFwS193S0000000_7.get$arr$(287), AFwS193S0000000_7.get$arr$(288), "");
    }

    @Override // X.InterfaceC494820Jaq
    public final void LIZIZ(Context context, boolean z, String str, String str2, String str3, String str4, C508400Jwk c508400Jwk) {
        if (Intrinsics.LJFF("popup", EnumC507490JvH.POPUP.getType())) {
            C510180Jzc.LIZIZ(context, z, str, str2, str3, str4, c508400Jwk, null, 128);
        }
    }

    public static final void LJ(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Map map, String str7, String str8) {
        C0K8F.LIZ.getClass();
        C0K8F.LJ(context, str, str2, "sub_only_video_page", str3, str4, str5, str6, z, map, str7, str8);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Jar] */
    @Override // X.InterfaceC494820Jaq
    public final void LIZJ(Context context, Room room, String str, Map map, String str2, String str3, long j, boolean z, long j2, long j3, final Function0 function0, final Function0 function02, String str4) throws JSONException {
        boolean zIsInGracePeriod;
        boolean z2;
        Object obj;
        SubscribeInfo subscribeInfo;
        SubscribeInfo subscribeInfo2 = room.getOwner().getSubscribeInfo();
        int i = 0;
        if (subscribeInfo2 != null) {
            zIsInGracePeriod = subscribeInfo2.isInGracePeriod();
        } else {
            zIsInGracePeriod = false;
        }
        if (j2 > 0 && (room.liveSubOnlyMonth > 0 || room.liveSubOnlyTier > 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zIsInGracePeriod && !z2) {
            C495520Jby c495520Jby = new C495520Jby(LiveSubscribeLynxUrl.INSTANCE.getValue().getUser_grace_period());
            String strLJIJ = UserService.getInstance().user().LJIJ(room.getOwnerUserId());
            c495520Jby.LIZJ("anchor_id", strLJIJ);
            c495520Jby.LIZJ("sec_another_user_id", strLJIJ);
            c495520Jby.LIZJ("sec_anchor_id", strLJIJ);
            c495520Jby.LIZIZ(room.getId(), "room_id");
            w.LIZ.getClass();
            c495520Jby.LIZJ("enter_from_merge", w.LJIIIZ());
            c495520Jby.LIZJ("enter_method", w.LJIIL());
            c495520Jby.LIZJ("show_entrance", str);
            c495520Jby.LIZJ("request_id", w.LJIJI());
            c495520Jby.LIZJ("video_id", w.LJJII());
            if (str3 != null) {
                c495520Jby.LIZJ("package_id", str3);
            }
            User owner = room.getOwner();
            if (owner != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.isSubscribed()) {
                i = 1;
            }
            c495520Jby.LIZ(i, "is_subscribe");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("subs_btn_click", System.currentTimeMillis());
            c495520Jby.LIZJ("subs_perf_tracker", C786410Ut5.J3(jSONObject));
            c495520Jby.LIZJ("emote_id", str2);
            c495520Jby.LIZJ("extra_log_pb", C497390Jez.LIZ("live_room"));
            if (map != null) {
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
                }
            }
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, UriProtector.parse(c495520Jby.LIZLLL()).toString(), new C494850Jat(c495520Jby, this, function0, function02));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("subs_btn_click", System.currentTimeMillis());
        linkedHashMap.put("subs_perf_tracker", C786410Ut5.J3(jSONObject2));
        linkedHashMap.put("emote_id", str2);
        if (map != null) {
            obj = ((LinkedHashMap) map).get("schema");
        } else {
            obj = null;
        }
        linkedHashMap.put("schema", obj);
        C510180Jzc.LIZ(context, room, str, "", linkedHashMap, new InterfaceC508600Jx4() { // from class: X.0Jar
            @Override // X.InterfaceC508600Jx4
            public final void LJJJJZI() {
                this.LIZ.LJIIL(true);
                function0.invoke();
            }
        }, null, null, null, j, z, str3, new C508400Jwk(null, null, j2, j3, C497390Jez.LIZ("live_room"), false, null, null, str4, 1823), null, 8640);
    }
}
