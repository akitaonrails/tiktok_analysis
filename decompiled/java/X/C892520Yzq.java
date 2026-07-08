package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.keva.Keva;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersViewHelper;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMSayhiAnalyticsImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva.MessageAfterFollowBackKeva;
import com.ss.android.ugc.aweme.im.service.experiment.stickerset.TTIMLightInteractionSendStickerSetConfig;
import com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionCommonResource;
import com.ss.android.ugc.aweme.im.strategy.commonresource.LightInteractionStickerSetMessage;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892520Yzq implements InterfaceC1252250igx {
    public static final C892520Yzq LIZ = new C892520Yzq();

    @Override // X.InterfaceC1252250igx
    public final Drawable LJIIIIZZ(Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_bitmap_sticker_hi;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
    }

    @Override // X.InterfaceC1252250igx
    public final void LJIIJ(FollowStatus followStatus) {
        int iIntValue;
        Keva kevaLIZ = MessageAfterFollowBackKeva.LIZIZ.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String userId = followStatus.getUserId();
        if (userId != null) {
            int followStatus2 = followStatus.getFollowStatus();
            Integer followerStatus = followStatus.getFollowerStatus();
            if (followerStatus != null) {
                iIntValue = followerStatus.intValue();
            } else {
                iIntValue = -1;
            }
            MessageAfterFollowBackKeva.LJIIIIZZ(followStatus2, iIntValue, userId, kevaLIZ, jCurrentTimeMillis);
        }
    }

    @Override // X.InterfaceC1252250igx
    public final boolean LJIIJJI(String str) {
        Keva kevaLIZ = MessageAfterFollowBackKeva.LIZIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_double_follow_time_stamp");
        sbLIZ.append(str);
        if (kevaLIZ.contains(C2188811AlT.LIZIZ(sbLIZ))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("key_follow_requested_status");
            sbLIZ2.append(str);
            kevaLIZ.erase(C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("key_follow_requested_status");
        sbLIZ3.append(str);
        return kevaLIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ3), false);
    }

    @Override // X.InterfaceC1252250igx
    public final void LJIIL(String str) {
        MessageAfterFollowBackKeva messageAfterFollowBackKeva = MessageAfterFollowBackKeva.LIZIZ;
        Keva kevaLIZ = messageAfterFollowBackKeva.LIZ();
        messageAfterFollowBackKeva.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("chat_cell_first_show_say_hi_time");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!kevaLIZ.contains(strLIZIZ)) {
            kevaLIZ.storeLong(strLIZIZ, System.currentTimeMillis());
        }
    }

    @Override // X.InterfaceC1252250igx
    public final void LJIILIIL(String str) {
        MessageAfterFollowBackKeva messageAfterFollowBackKeva = MessageAfterFollowBackKeva.LIZIZ;
        messageAfterFollowBackKeva.LIZIZ(messageAfterFollowBackKeva.LIZ(), str);
    }

    @Override // X.InterfaceC1252250igx
    @InterfaceC1294060jmO
    public final boolean LJIILJJIL(String str) {
        C0Y8T c0y8tLIZ;
        C869590Y9l lastShowMessage;
        long serverTime;
        int iLJIJ;
        if (!C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(str)) {
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_sayhi_relation_calculate_opt", true) > 0) {
            if (!C1336205Ku.LIZ(false).getImSayHiService().LJ(str, true, null, !C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(str), false) || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(C0YNP.LJ(str))) == null || (lastShowMessage = c0y8tLIZ.getLastShowMessage()) == null || lastShowMessage.getMsgType() != 15) {
                return false;
            }
            long createdAt = lastShowMessage.getCreatedAt();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            long j2 = createdAt / j;
            if (((InterfaceC1513805wG) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJIIJ()) {
                serverTime = System.currentTimeMillis() / j;
            } else {
                serverTime = ((INetwork) ServiceManager.get().getService(INetwork.class)).getServerTime();
            }
            long j3 = serverTime - j2;
            if (C0C64.LJIILLIIL().LJIJ(31744, 3, "im_light_interaction_sayhi_expiration", false) > 0) {
                iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 3, "im_light_interaction_sayhi_expiration", false);
            } else {
                iLJIJ = 7;
            }
            if (j3 > iLJIJ * 24 * 60 * 60) {
                return false;
            }
            return true;
        }
        return C1336205Ku.LIZ(false).getImSayHiService().LJ(str, true, null, !C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(str), false);
    }

    @Override // X.InterfaceC1252250igx
    public final void LIZJ(String str, boolean z) {
        if (str != null) {
            Keva kevaLIZ = MessageAfterFollowBackKeva.LIZIZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key_fake_double_follow_time_stamp");
            sbLIZ.append(str);
            if (kevaLIZ.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                if (z) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("key_fake_double_follow_time_stamp");
                    sbLIZ2.append(str);
                    kevaLIZ.erase(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
            if (z) {
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("key_fake_double_follow_time_stamp");
            sbLIZ3.append(str);
            kevaLIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ3), System.currentTimeMillis());
            MessageAfterFollowBackKeva.LJI(str, true, 1, kevaLIZ);
        }
    }

    @Override // X.InterfaceC1252250igx
    public final boolean LJII(Long l, Long l2) {
        C01GW c01gw = C0Z4M.LIZIZ;
        long j = ((TTIMLightInteractionSendStickerSetConfig) c01gw.getValue()).stickerId;
        if (l != null && j == l.longValue()) {
            long j2 = ((TTIMLightInteractionSendStickerSetConfig) c01gw.getValue()).stickerSetId;
            if (l2 != null && j2 == l2.longValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1252250igx
    public final void LJIIIZ(String str, Map<String, String> map) {
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LIZJ().LIZLLL("send_a_hi");
        if (C455040Hss.LIZ()) {
            Pair pairLJIILLIIL = LJIILLIIL(str, map, null);
            pairLJIILLIIL.getFirst();
            C0YP2 c0yp2 = (C0YP2) pairLJIILLIIL.getSecond();
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                c0yozLJFF.LJI(new C0YP2(c0yp2.LIZ, c0yp2.LIZIZ, c0yp2.LIZJ, c0yp2.LIZLLL, null, null, c0yp2.LJI, null, null, c0yp2.LJIIIZ, null, null, 15792), new C0IC5(null, 3), new C0YOY() { // from class: X.0Yzr
                    @Override // X.C0YOY
                    public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                    }
                });
                return;
            }
            return;
        }
        Pair pairLJIILLIIL2 = LJIILLIIL(str, map, null);
        StickerTemplate stickerTemplate = (StickerTemplate) pairLJIILLIIL2.getFirst();
        C0YP2 c0yp22 = (C0YP2) pairLJIILLIIL2.getSecond();
        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
        c874730YTfLIZ.LIZIZ.LJFF = C0YNP.LJ(str);
        c874730YTfLIZ.LIZJ(stickerTemplate);
        C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
        c0ytz.LJIIL = "sticker";
        c0ytz.LJIILIIL = map;
        c0ytz.LJIILL = c0yp22.LJIIIZ;
        c874730YTfLIZ.LJ();
    }

    public static Pair LJIILLIIL(String str, Map map, Map map2) {
        LightInteractionStickerSetMessage stickerSetMsg;
        String str2;
        LightInteractionStickerSetMessage stickerSetMsg2;
        UrlModel urlModel = new UrlModel();
        String str3 = null;
        ILightInteractionPlatformService iLightInteractionPlatformService = (ILightInteractionPlatformService) PluggableExtentionKt.pluggableSpi$default(ILightInteractionPlatformService.class, false, false, false, 14, null);
        if (iLightInteractionPlatformService != null) {
            LightInteractionCommonResource lightInteractionCommonResourceLJJIIZI = iLightInteractionPlatformService.LJJIIZI("say_hi_sticker_v1");
            List<String> listSingletonList = null;
            if (lightInteractionCommonResourceLJJIIZI != null && (stickerSetMsg2 = lightInteractionCommonResourceLJJIIZI.getStickerSetMsg()) != null) {
                str3 = stickerSetMsg2.stickerUri;
            }
            urlModel.setUri(str3);
            if (lightInteractionCommonResourceLJJIIZI != null && (stickerSetMsg = lightInteractionCommonResourceLJJIIZI.getStickerSetMsg()) != null && (str2 = stickerSetMsg.stickerUrl) != null) {
                listSingletonList = Collections.singletonList(str2);
            }
            urlModel.setUrlList(listSingletonList);
        }
        if (map != null) {
            map.put("message_from", "send_a_hi");
            map.put("a:light_interaction_name", "say_hi_sticker_v1");
        }
        int type = EnumC451180Hme.ANIMATED.getType();
        C01GW c01gw = C0Z4M.LIZIZ;
        SetSticker setSticker = new SetSticker(Long.valueOf(((TTIMLightInteractionSendStickerSetConfig) c01gw.getValue()).stickerId), null, null, new StickerUrlStruct(null, urlModel, null, null), null, Long.valueOf(((TTIMLightInteractionSendStickerSetConfig) c01gw.getValue()).stickerSetId), Long.valueOf(((TTIMLightInteractionSendStickerSetConfig) c01gw.getValue()).creatorUserId), Integer.valueOf(type), null, null, null, null, null);
        InterfaceC454710HsL imStickerMessageService = IMStickerApi.LIZ.LIZIZ().getImStickerMessageService();
        C0I0B.LJFF.LIZJ();
        StickerTemplate stickerTemplateLJIJJLI = imStickerMessageService.LJIJJLI(setSticker, C894660Z7w.LIZ(), null, null, null);
        return new Pair(stickerTemplateLJIJJLI, new C0YP2(new C1265404xI(str), stickerTemplateLJIJJLI.getMessageType(), new C460190I2v(stickerTemplateLJIJJLI.encode()), "sticker", null, null, map, null, null, C901060ZWm.LJ(map2), null, null, 15792));
    }

    @Override // X.InterfaceC1252250igx
    public final void LIZIZ(int i, String str, boolean z) {
        Keva kevaLIZ = MessageAfterFollowBackKeva.LIZIZ.LIZ();
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key_double_follow_time_stamp");
            sbLIZ.append(str);
            if (kevaLIZ.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("key_follow_requested_status");
                sbLIZ2.append(str);
                kevaLIZ.erase(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            MessageAfterFollowBackKeva.LJII(System.currentTimeMillis(), kevaLIZ, str);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("key_follow_requested_status");
        sbLIZ3.append(str);
        kevaLIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ3), true);
        MessageAfterFollowBackKeva.LJI(str, false, i, kevaLIZ);
    }

    @Override // X.InterfaceC1252250igx
    public final void LJI(int i, int i2, String str) {
        MessageAfterFollowBackKeva.LJIIIIZZ(i, i2, str, MessageAfterFollowBackKeva.LIZIZ.LIZ(), System.currentTimeMillis());
    }

    @Override // X.InterfaceC1252250igx
    public final void LJIILL(Context context, User user, String str) {
        Resources resources = context.getResources();
        IMSayhiAnalyticsImpl.LIZ.getClass();
        if (Intrinsics.LJFF(str, resources.getString(((Number) new Pair(2131846831, "send_a_hi").getFirst()).intValue(), "👋")) || Intrinsics.LJFF(str, "👋")) {
            ((ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJLIIJ(System.currentTimeMillis(), C0YNP.LJ(user.getUid()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    @Override // X.InterfaceC1252250igx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(java.lang.String r10, boolean r11, com.bytedance.keva.Keva r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C892520Yzq.LJ(java.lang.String, boolean, com.bytedance.keva.Keva, boolean, boolean):boolean");
    }

    @Override // X.InterfaceC1252250igx
    public final String LJFF(int i, Context context, String str, boolean z, boolean z2) {
        Keva kevaLIZ;
        IIMLightInteractService.IMessageAfterFollowBackKeva.LIZ.getClass();
        IIMLightInteractService.IMessageAfterFollowBackKeva value = C15579068b.LIZIZ.getValue();
        if (value != null) {
            kevaLIZ = value.LIZ();
        } else {
            kevaLIZ = null;
        }
        boolean z3 = false;
        boolean z4 = !C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(str);
        String string = context.getResources().getString(2131837236);
        if (str != null && C1336205Ku.LIZ(false).getImSayHiService().LJ(str, z, kevaLIZ, z4, z2)) {
            if (C1336205Ku.LIZ(false).getLightInteractService().LIZLLL(str)) {
                Resources resources = context.getResources();
                IMSayhiAnalyticsImpl.LIZ.getClass();
                string = "👋";
                String string2 = resources.getString(((Number) new Pair(2131846831, "send_a_hi").getFirst()).intValue(), "👋");
                if (i > 0) {
                    Map<Pair<String, Integer>, Boolean> map = C00H7.LIZ;
                    Boolean boolValueOf = (Boolean) ((LinkedHashMap) map).get(new Pair(string2, Integer.valueOf(i)));
                    if (boolValueOf == null) {
                        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                        tuxTextView.LJJJJI(10.0f);
                        tuxTextView.setText(string2);
                        tuxTextView.measure(0, 0);
                        if (tuxTextView.getMeasuredWidth() <= i) {
                            z3 = true;
                        }
                        boolValueOf = Boolean.valueOf(z3);
                        map.put(new Pair<>(string2, Integer.valueOf(i)), boolValueOf);
                    }
                    if (boolValueOf.booleanValue()) {
                        return string2;
                    }
                } else {
                    return string2;
                }
            }
            return string;
        }
        return context.getResources().getString(2131837236);
    }

    @Override // X.InterfaceC1252250igx
    public final void LIZ(Context context, String str, String str2, Map map, AwS563S0100000_19 awS563S0100000_19, AwS415S0200000_14 awS415S0200000_14) {
        LJIIZILJ(context, str, str2, map, null, awS563S0100000_19, awS415S0200000_14, true, false);
    }

    @Override // X.InterfaceC1252250igx
    public final void LIZLLL(Context context, String str, String str2, boolean z, Map map, boolean z2, Map map2, Function0 function0) {
        LJIIZILJ(context, str, str2, map, map2, null, function0, z, z2);
    }

    public static void LJIIZILJ(Context context, String str, String str2, Map map, Map map2, AwS563S0100000_19 awS563S0100000_19, Function0 function0, boolean z, boolean z2) {
        ((C0Z9X) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LIZJ().LIZLLL("send_a_hi");
        IRemindUsersViewHelper.LIZ.getClass();
        IRemindUsersViewHelper iRemindUsersViewHelperLIZ = C069A.LIZ();
        if (iRemindUsersViewHelperLIZ != null) {
            String str3 = (String) ((LinkedHashMap) map).get("enter_from");
            if (str3 == null && (map2 == null || (str3 = (String) map2.get("enter_from")) == null)) {
                str3 = "";
            }
            iRemindUsersViewHelperLIZ.LIZ(context, str3, z, new C879410Yeh(context, str, str2, map, map2, awS563S0100000_19, function0, z2, z));
        }
    }
}
