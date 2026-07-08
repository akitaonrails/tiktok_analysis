package X;

import Y.ARunnableS20S0100100_17;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.room.DismissUserProfileEvent;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.GiftInsertGiftMessageChannel;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBag;
import com.bytedance.android.livesdk.dataChannel.UpdateGiftListEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftStrategyData;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.guide.GiftGuideWidget;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftCollaborateGiftingDownloadTimeOutToastSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftCollaborateGiftingEndAssetTimeoutSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.event.QuitFansClubEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.FansClubWidget;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.FansClubViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdk.share.LiveShareDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import tikcast.api.fans.FansGetTaskInfoResponse;

/* JADX INFO: renamed from: X.0g4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151790g4v implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
            case 2:
                mh2$2(this, c262100zr);
                break;
            case 3:
                mh2$3(this, c262100zr);
                break;
            case 4:
                mh2$4(this, c262100zr);
                break;
            case 5:
                mh2$5(this, c262100zr);
                break;
            case 6:
                mh2$6(this, c262100zr);
                break;
            case 7:
                mh2$7(this, c262100zr);
                break;
            case 8:
                mh2$8(this, c262100zr);
                break;
        }
    }

    public C1151790g4v(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C1151790g4v c1151790g4v, C262100zr c262100zr) {
        Integer numValueOf;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        boolean z;
        String string;
        String str;
        int iIntValue;
        String str2;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        String str3;
        Integer num;
        Map<String, Object> mapLIZ;
        String str4;
        boolean zBooleanValue;
        Boolean bool;
        WeakReference<InterfaceC978780bZs> weakReferenceLIZJ;
        InterfaceC978780bZs interfaceC978780bZs;
        C1104710eqz c1104710eqz = (C1104710eqz) c1151790g4v.l0;
        c1104710eqz.getClass();
        String str5 = c262100zr.LIZ;
        int iHashCode = str5.hashCode();
        if (iHashCode != -1091071735) {
            if (iHashCode != -126454431) {
                if (iHashCode == 353918035 && str5.equals("EVENT_ENVELOPE_UPDATE")) {
                    C20441214yg.LJ("RedEnvelopePresenter", "handleEvent: EVENT_ENVELOPE_UPDATE");
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C408701iP(null), 3);
                    return;
                }
            } else if (str5.equals("liveGoldenEnvelopeCreate")) {
                C20441214yg.LIZIZ("RedEnvelopePresenter", "handleEvent: liveGoldenEnvelopeCreate");
                InterfaceC1104760er4 interfaceC1104760er4 = c1104710eqz.LIZJ;
                if (interfaceC1104760er4 != null && (weakReferenceLIZJ = interfaceC1104760er4.LIZJ()) != null && (interfaceC978780bZs = weakReferenceLIZJ.get()) != null) {
                    interfaceC978780bZs.onSuccess();
                }
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd != null) {
                    interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "envelope_info");
                } else {
                    interfaceC1107590evdLJ = null;
                }
                if (interfaceC1107590evdLJ != null && interfaceC1107590evdLJ.hasKey("send_time")) {
                    z = true;
                } else {
                    z = false;
                }
                String str6 = CardStruct.IStatusCode.DEFAULT;
                if (z) {
                    string = interfaceC1107590evdLJ.getString("send_time");
                } else {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                C1104350eqP.LIZ = string;
                RedEnvelopMessage redEnvelopMessage = new RedEnvelopMessage();
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 != null && (mapLIZ = interfaceC1107590evd2.LIZ()) != null) {
                    Gson gson = C19748512Ol.LIZIZ;
                    redEnvelopMessage = (RedEnvelopMessage) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, mapLIZ), RedEnvelopMessage.class);
                    MessageRedEnvelopInfo messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo;
                    if (messageRedEnvelopInfo != null) {
                        str4 = messageRedEnvelopInfo.envelopeId;
                    } else {
                        str4 = null;
                    }
                    C1104350eqP.LIZIZ = String.valueOf(str4);
                    MessageRedEnvelopInfo messageRedEnvelopInfo2 = redEnvelopMessage.envelopeInfo;
                    if (messageRedEnvelopInfo2 != null) {
                        messageRedEnvelopInfo2.createTime = String.valueOf(System.currentTimeMillis());
                    }
                    String strLJIIIZ = c1104710eqz.LJIIIZ(redEnvelopMessage, "fe");
                    if (strLJIIIZ != null) {
                        c1104710eqz.LJFF.add(new Pair<>(strLJIIIZ, "fe"));
                        c1104710eqz.LIZIZ();
                    }
                    c1104710eqz.LJIIJJI(c1104710eqz.LJIIJ());
                    DataChannel dataChannel = c1104710eqz.LIZIZ;
                    if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = true;
                    }
                    DataChannel dataChannel2 = c1104710eqz.LIZIZ;
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(GiftDialogDismissEvent.class, Boolean.valueOf(!zBooleanValue));
                    }
                }
                Boolean bool2 = c1104710eqz.LIZLLL;
                HashMap map = new HashMap(7);
                MessageRedEnvelopInfo messageRedEnvelopInfo3 = redEnvelopMessage.envelopeInfo;
                String str7 = "";
                if (messageRedEnvelopInfo3 == null || (str = messageRedEnvelopInfo3.envelopeId) == null) {
                    str = "";
                }
                map.put("envelope_id", str);
                MessageRedEnvelopInfo messageRedEnvelopInfo4 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo4 != null && (num = messageRedEnvelopInfo4.businessType) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                map.put("business_type", String.valueOf(iIntValue));
                MessageRedEnvelopInfo messageRedEnvelopInfo5 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo5 == null || (str2 = messageRedEnvelopInfo5.sendUserId) == null) {
                    str2 = "";
                }
                map.put("send_user_id", str2);
                MessageRedEnvelopInfo messageRedEnvelopInfo6 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo6 != null && (str3 = messageRedEnvelopInfo6.createTime) != null) {
                    str7 = str3;
                }
                map.put("create_at", str7);
                UserService userService = UserService.getInstance();
                if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                    map.put("user_id", String.valueOf(currentUser.getId()));
                }
                if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                    str6 = "1";
                }
                map.put("is_anchor", str6);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_treasure_box_create_event_receive");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJIILJJIL("live_detail");
                c474500IjALIZ.LJIILL("click");
                c474500IjALIZ.LJIIJJI("live");
                c474500IjALIZ.LIZ();
                C1CC2.LJII(0, "ttlive_treasure_box_create_event_receive", map);
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C408601iO(null), 3);
                return;
            }
        } else if (str5.equals("liveGoldenEnvelopCloseAll")) {
            C20441214yg.LIZIZ("RedEnvelopePresenter", "handleEvent: liveGoldenEnvelopCloseAll");
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 == null || (numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd3, "business_type", 0))) == null) {
                return;
            }
            if (numValueOf.intValue() != 1 && numValueOf.intValue() != 2) {
                return;
            }
            c1104710eqz.LJII = null;
            c1104710eqz.LJIIJJI(false);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleEvent: unknown event->");
        sbLIZ.append(c262100zr.LIZ);
        C20441214yg.LJ("RedEnvelopePresenter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void mh2$1(C1151790g4v c1151790g4v, C262100zr c262100zr) {
        Map<String, ? extends Object> mapLJ;
        InterfaceC1107590evd map;
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_lynx_gift_guide_popup_load_finish") && !((GiftGuideWidget) c1151790g4v.l0).LLILZLL) {
            C20441214yg.LIZIZ("GiftGuideLynx", "receive load finish event");
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd == null || (map = interfaceC1107590evd.getMap("extra_event_params")) == null || (mapLJ = map.LIZ()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            ((GiftGuideWidget) c1151790g4v.l0).E1().LJIILLIIL(mapLJ);
            GiftGuideWidget giftGuideWidget = (GiftGuideWidget) c1151790g4v.l0;
            synchronized (c1151790g4v) {
                try {
                    giftGuideWidget.LLIZLLLIL.LJFF = SystemClock.elapsedRealtime();
                    C1123450fLD.LJIIIZ(giftGuideWidget.LLIZLLLIL);
                    giftGuideWidget.LLILZLL = true;
                    if (giftGuideWidget.LLIZ) {
                        C20441214yg.LIZIZ("GiftGuideLynx", "show the guide");
                        giftGuideWidget.G1();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static final void mh2$2(C1151790g4v c1151790g4v, C262100zr c262100zr) {
        String strLJFF;
        C1102070emj c1102070emj = C1102070emj.LIZ;
        DataChannel dataChannel = (DataChannel) c1151790g4v.l0;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null) {
            strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "effect_notify_id", "");
        } else {
            strLJFF = null;
        }
        c1102070emj.getClass();
        C1102070emj.LJIL(dataChannel, strLJFF);
    }

    public static final void mh2$3(C1151790g4v c1151790g4v, C262100zr c262100zr) {
        String string;
        String strLJFF;
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1956776850) {
            if (iHashCode != -950565376) {
                if (iHashCode == -247915288 && str.equals("audience_ranking_pop_event")) {
                    C465520INi.LIZ.sw0("audience_list_lynx");
                    return;
                }
                return;
            }
            if (!str.equals("ttlive_flare_viewers_list")) {
                return;
            }
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "entrance_sub_rank_type", "");
            } else {
                strLJFF = null;
            }
            ((OnlineAudienceRankWidget) c1151790g4v.l0).G1(strLJFF);
            return;
        }
        if (!str.equals("audience_ranking_data")) {
            return;
        }
        try {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 == null || (string = interfaceC1107590evd2.getString("rank_data")) == null) {
                return;
            }
            try {
                C1105360es2.LIZIZ = string;
                C1105360es2.LIZIZ((OnlineRankListResponse) new Gson().LJII(string, OnlineRankListResponse.class));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void mh2$4(C1151790g4v c1151790g4v, C262100zr c262100zr) {
        IHostAppContext iHostAppContext;
        IDebugService iDebugService;
        IHostAppContext iHostAppContext2;
        C1095140ebY c1095140ebY;
        Boolean bool;
        Room room;
        FansClubViewModel fansClubViewModelX1;
        JoinDialogViewModel joinDialogViewModel;
        C1095610ecJ c1095610ecJ;
        String strLJFF;
        String strLJFF2;
        String strLIZJ;
        String strLJFF3;
        String string;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        Map<String, Object> mapLIZ;
        DataChannel dataChannel;
        String strLJFF4;
        String strLJFF5;
        int iLIZLLL;
        int iLIZLLL2;
        Number numberValueOf;
        User userLJIJJLI;
        Long lValueOf;
        Long lValueOf2;
        int i;
        long j;
        String str;
        Long lValueOf3;
        long jLongValue;
        FansClubViewModel fansClubViewModelX12;
        C1094910ebB c1094910ebB;
        C1095140ebY c1095140ebY2;
        String string2;
        FansClubWidget fansClubWidget = (FansClubWidget) c1151790g4v.l0;
        fansClubWidget.getClass();
        String str2 = c262100zr.LIZ;
        String str3 = "";
        switch (str2.hashCode()) {
            case -1891834119:
                if (str2.equals("anchor_set_customize_superfan_sticker")) {
                    BPEAHandler bPEAHandler = C1085070eLJ.LIZ;
                    InterfaceC1106030et7.Y8.LIZJ(Boolean.TRUE);
                }
                break;
            case -1880760082:
                if (str2.equals("tt_live_clear_local_test_keva_keys_data") && (iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) != null) {
                    if ((iHostAppContext.isOffline() || iHostAppContext.isRegressionTest()) && (iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class)) != null && iDebugService.Az1() != null && (iHostAppContext2 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) != null && iHostAppContext2.isOffline()) {
                        for (Class cls : C1697810uHb.LJIIJJI(InterfaceC1106030et7.class, InterfaceC772190UQv.class, C1834350xpp.class, C0USY.class)) {
                            C089E c089e = new C089E(cls.getDeclaredFields());
                            while (c089e.hasNext()) {
                                Field field = (Field) c089e.next();
                                try {
                                    field.setAccessible(true);
                                    Object obj = field.get(cls);
                                    if (obj instanceof C20337914i1) {
                                        C20337914i1 c20337914i1 = (C20337914i1) obj;
                                        c20337914i1.LJFF(c20337914i1.LIZLLL);
                                    }
                                    if (obj instanceof C0JT6) {
                                        C20337914i1<HashMap<String, V>> c20337914i12 = ((C0JT6) obj).LIZ;
                                        c20337914i12.LJFF(c20337914i12.LIZLLL);
                                    }
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case -1221738807:
                String strLJFF6 = null;
                if (str2.equals("tt_live_fans_club_event_quit_clear_data")) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null) {
                        strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd, "anchor_id", "");
                    }
                    long jLIZIZ = C0IZJ.LIZIZ(strLJFF6);
                    C0JT6<Map<String, String>> c0jt6 = InterfaceC1093910eZZ.LLLLLZIL;
                    Map<String, String> mapLIZ2 = c0jt6.LIZ();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Map<String, String> map = mapLIZ2;
                    if (map != null) {
                        linkedHashMap.putAll(map);
                    }
                    linkedHashMap.put(String.valueOf(jLIZIZ), CardStruct.IStatusCode.DEFAULT);
                    c0jt6.LIZJ(linkedHashMap);
                }
                break;
            case -677068476:
                if (str2.equals("tt_live_block_pause_live_stream")) {
                    DataChannelGlobal.LLILZ.JQ2(C1148260fzE.class, Boolean.TRUE);
                }
                break;
            case -655806071:
                if (str2.equals("anchor_set_customize_fan_club_badge")) {
                    BPEAHandler bPEAHandler2 = C1085070eLJ.LIZ;
                    InterfaceC1106030et7.W8.LIZJ(Boolean.TRUE);
                }
                break;
            case -413287005:
                if (str2.equals("anchor_set_customize_fan_club_sticker")) {
                    BPEAHandler bPEAHandler3 = C1085070eLJ.LIZ;
                    InterfaceC1106030et7.X8.LIZJ(Boolean.TRUE);
                }
                break;
            case -209672718:
                if (str2.equals("tt_live_fans_club_event_quit")) {
                    final FansClubViewModel fansClubViewModelX13 = fansClubWidget.x1();
                    if (fansClubViewModelX13 != null) {
                        DataChannel dataChannel2 = fansClubViewModelX13.getDataChannel();
                        if (dataChannel2 == null || (c1095140ebY = (C1095140ebY) dataChannel2.gg0(FansClubChannel.class)) == null) {
                            c1095140ebY = new C1095140ebY(0L, 0L, null, 0, "", 0L, 7936);
                        }
                        String strXQ2 = FansClubViewModel.xQ2(0, false);
                        long j2 = c1095140ebY.LJII - 1;
                        if (j2 < 0) {
                            j2 = 0;
                        }
                        C1095140ebY c1095140ebYLIZ = C1095140ebY.LIZ(c1095140ebY, 0L, 0L, null, null, 0, null, strXQ2, j2, 0L, 0L, 0L, 0L, null, 4128);
                        C087800Uq.LIZ(UserService.getInstance().user().getCurrentUser());
                        DataChannel dataChannel3 = fansClubViewModelX13.getDataChannel();
                        if (dataChannel3 != null) {
                            dataChannel3.zW(FansClubChannel.class, c1095140ebYLIZ);
                        }
                        fansClubViewModelX13.CQ2(c1095140ebYLIZ, false);
                        DataChannel dataChannel4 = fansClubViewModelX13.getDataChannel();
                        if (dataChannel4 != null) {
                            bool = (Boolean) dataChannel4.gg0(UserIsAnchorChannel.class);
                        } else {
                            bool = null;
                        }
                        DataChannel dataChannel5 = fansClubViewModelX13.getDataChannel();
                        if (dataChannel5 != null) {
                            room = (Room) dataChannel5.gg0(RoomChannel.class);
                            if (room != null && bool != null) {
                                ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).syncGiftList(new AbstractC1132980faa() { // from class: X.0KTJ
                                    @Override // X.AbstractC1132980faa
                                    public final void LIZIZ(List<Gift> list) {
                                    }

                                    @Override // X.AbstractC1132980faa
                                    public final void LIZJ(List list, GiftsInfo giftsInfo, GiftStrategyData giftStrategyData, long j3, int i2) {
                                        DataChannel dataChannel6 = fansClubViewModelX13.getDataChannel();
                                        if (dataChannel6 != null) {
                                            dataChannel6.LC0(UpdateGiftListEvent.class, list);
                                        }
                                    }
                                }, room.getId(), 14, bool.booleanValue());
                            }
                        } else {
                            room = null;
                        }
                        DataChannel dataChannel6 = fansClubViewModelX13.getDataChannel();
                        if (dataChannel6 != null) {
                            dataChannel6.LC0(FansClubEvent.class, new AbstractC1095150ebZ() { // from class: X.0ebP
                            });
                        }
                        DataChannel dataChannel7 = fansClubViewModelX13.getDataChannel();
                        if (dataChannel7 != null) {
                            dataChannel7.LC0(GiftDialogDismissEvent.class, Boolean.FALSE);
                        }
                        if (room != null) {
                            User.FansClubInfo fansClubInfo = room.getOwner().fansClubInfo;
                            if (fansClubInfo != null) {
                                fansClubInfo.fansCount = 0L;
                                fansClubInfo.fansLevel = 0L;
                                fansClubInfo.fansScore = 0L;
                                fansClubInfo.isSleeping = false;
                            }
                            DataChannel dataChannel8 = fansClubViewModelX13.getDataChannel();
                            if (dataChannel8 != null) {
                                dataChannel8.zW(RoomChannel.class, room);
                            }
                        }
                        DataChannel dataChannel9 = fansClubViewModelX13.getDataChannel();
                        if (dataChannel9 != null) {
                            dataChannel9.SX0(C1095100ebU.class, null);
                        }
                    }
                    fansClubWidget.dataChannel.FQ2(DismissUserProfileEvent.class);
                    fansClubWidget.dataChannel.FQ2(QuitFansClubEvent.class);
                }
                break;
            case 472310620:
                if (str2.equals("fans_user_page_preload_data_listener_ready") && (fansClubViewModelX1 = fansClubWidget.x1()) != null && (joinDialogViewModel = fansClubViewModelX1.LLJJIII) != null && (c1095610ecJ = joinDialogViewModel.LLJIJIL) != null) {
                    c1095610ecJ.LIZJ = true;
                    c1095610ecJ.LJ();
                    break;
                }
                break;
            case 550701530:
                if (str2.equals("fan_club_guide_containerzation_frequency_maximum")) {
                    InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd2 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "guidance_type", "")) == null) {
                        strLJFF = "";
                    }
                    InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd3 != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, "guidance_key", "")) != null) {
                        str3 = strLJFF2;
                    }
                    if (str3.length() > 0) {
                        switch (strLJFF.hashCode()) {
                            case -1638333453:
                                if (strLJFF.equals("fan_club_entrance")) {
                                    C1092520eXK c1092520eXK = fansClubWidget.LLJI;
                                    DataChannel dataChannel10 = fansClubWidget.dataChannel;
                                    c1092520eXK.getClass();
                                    C1092520eXK.LJ(dataChannel10, str3, true);
                                }
                                break;
                            case 18096540:
                                if (!strLJFF.equals("publish_screen")) {
                                }
                                break;
                            case 552555053:
                                if (!strLJFF.equals("capsule")) {
                                }
                                break;
                            case 620466616:
                                if (!strLJFF.equals("guide_gift_bubble")) {
                                }
                                break;
                            case 1311830723:
                                if (!strLJFF.equals("room_info_entrance")) {
                                }
                                break;
                        }
                        C1092650eXX.LIZJ(1, fansClubWidget.dataChannel, strLJFF, str3, true);
                    }
                }
                break;
            case 649809957:
                if (str2.equals("FE_FANS_LEVEL_FETCH_TASK_DATA")) {
                    InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd4 != null && (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd4, "data")) != null && (mapLIZ = interfaceC1107590evdLJ.LIZ()) != null) {
                        strLIZJ = C1516000pYM.LIZJ(mapLIZ);
                    } else {
                        strLIZJ = null;
                    }
                    InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd5 != null) {
                        strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd5, "room_id", "");
                    } else {
                        strLJFF3 = null;
                    }
                    Room room2 = (Room) fansClubWidget.dataChannel.gg0(RoomChannel.class);
                    if (room2 != null) {
                        string = Long.valueOf(room2.getId()).toString();
                    } else {
                        string = null;
                    }
                    if (Intrinsics.LJFF(strLJFF3, string)) {
                        Object objFromJson = GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, strLIZJ, (Class<Object>) FansGetTaskInfoResponse.Data.class);
                        DataChannel dataChannel11 = fansClubWidget.dataChannel;
                        if (dataChannel11 != null) {
                            dataChannel11.SX0(C1095100ebU.class, objFromJson);
                        }
                    }
                }
                break;
            case 740500684:
                if (str2.equals("anchor_fan_club_select_page_closed")) {
                    DataChannelGlobal.LLILZ.IQ2(C1148260fzE.class);
                }
                break;
            case 1438225941:
                if (str2.equals("live_fans_level_all_tasks_points_claimed") && (dataChannel = fansClubWidget.dataChannel) != null) {
                    dataChannel.LC0(FansClubEvent.class, C1095060ebQ.LIZ);
                    break;
                }
                break;
            case 2011394563:
                if (str2.equals("tt_fe_fans_level_data")) {
                    InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd6 == null || (strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd6, "room_id", "")) == null) {
                        strLJFF4 = "";
                    }
                    InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd7 == null || (strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd7, "log_id", "")) == null) {
                        strLJFF5 = "";
                    }
                    InterfaceC1107590evd interfaceC1107590evd8 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd8 != null) {
                        iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd8, "fans_level", 0);
                    } else {
                        iLIZLLL = 0;
                    }
                    InterfaceC1107590evd interfaceC1107590evd9 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd9 != null) {
                        iLIZLLL2 = C1871910yoP.LIZLLL(interfaceC1107590evd9, "fans_status", 0);
                    } else {
                        iLIZLLL2 = 0;
                    }
                    InterfaceC1107590evd interfaceC1107590evd10 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd10 != null) {
                        numberValueOf = Double.valueOf(C1871910yoP.LIZJ(interfaceC1107590evd10, "fans_count", 0.0d));
                    } else {
                        numberValueOf = 0;
                    }
                    Room room3 = (Room) fansClubWidget.dataChannel.gg0(RoomChannel.class);
                    if (room3 != null && (string2 = Long.valueOf(room3.getId()).toString()) != null) {
                        str3 = string2;
                    }
                    if (Intrinsics.LJFF(strLJFF4, str3)) {
                        long j3 = iLIZLLL;
                        long jLongValue2 = numberValueOf.longValue();
                        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
                            DataChannel dataChannel12 = fansClubWidget.dataChannel;
                            if (dataChannel12 != null && (c1095140ebY2 = (C1095140ebY) dataChannel12.gg0(FansClubChannel.class)) != null) {
                                lValueOf = Long.valueOf(c1095140ebY2.LIZ);
                            } else {
                                lValueOf = null;
                            }
                            int iAR = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).AR(userLJIJJLI.getBadgeList());
                            C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
                            if (c1095140ebYUw0 != null) {
                                lValueOf2 = Long.valueOf(c1095140ebYUw0.LIZ);
                            } else {
                                lValueOf2 = null;
                            }
                            C1095140ebY c1095140ebYUw02 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
                            if (c1095140ebYUw02 != null) {
                                i = c1095140ebYUw02.LJ;
                            } else {
                                i = 0;
                            }
                            C1095140ebY c1095140ebYUw03 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
                            if (c1095140ebYUw03 != null) {
                                j = c1095140ebYUw03.LJII;
                            } else {
                                j = 0;
                            }
                            DataChannel dataChannel13 = fansClubWidget.dataChannel;
                            if (dataChannel13 != null && C500260Jjc.LJIIZILJ(dataChannel13)) {
                                str = "anchor";
                            } else {
                                str = "user";
                            }
                            Integer numValueOf = Integer.valueOf(iLIZLLL2);
                            Integer numValueOf2 = Integer.valueOf(i);
                            Long lValueOf4 = Long.valueOf(jLongValue2);
                            Long lValueOf5 = Long.valueOf(j);
                            Long lValueOf6 = Long.valueOf(j3);
                            Integer numValueOf3 = Integer.valueOf(iAR);
                            int iLIZIZ = C496760Jdy.LIZIZ(Boolean.valueOf(Intrinsics.LJFF(lValueOf, lValueOf6)));
                            int iLIZIZ2 = C496760Jdy.LIZIZ(Boolean.valueOf(Intrinsics.LJFF(lValueOf2, lValueOf6)));
                            if (numValueOf3 != null) {
                                lValueOf3 = Long.valueOf(numValueOf3.intValue());
                            } else {
                                lValueOf3 = null;
                            }
                            int iLIZIZ3 = C496760Jdy.LIZIZ(Boolean.valueOf(Intrinsics.LJFF(lValueOf3, lValueOf6)));
                            try {
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_system_fans_page_all_info_monitor");
                                c474500IjALIZ.LJIL();
                                c474500IjALIZ.LJJII(lValueOf6, "fans_level");
                                c474500IjALIZ.LJJII(lValueOf, "entrance_fans_level");
                                c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ), "is_entrance_level_same");
                                c474500IjALIZ.LJJII(lValueOf, "entrance_model_fans_level");
                                c474500IjALIZ.LJJII(str3, "entrance_model_room_id");
                                c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ2), "is_local_level_same");
                                c474500IjALIZ.LJJII(lValueOf2, "local_fans_level");
                                c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ3), "is_user_fans_level_same");
                                c474500IjALIZ.LJJII(numValueOf3, "user_fans_level");
                                c474500IjALIZ.LJJII(numValueOf, "right_fans_status");
                                c474500IjALIZ.LJJII(numValueOf2, "local_fans_status");
                                c474500IjALIZ.LJJII(Integer.valueOf(C496760Jdy.LIZIZ(Boolean.valueOf(Intrinsics.LJFF(numValueOf2, numValueOf)))), "is_fans_status_same");
                                c474500IjALIZ.LJJII(lValueOf4, "fans_count");
                                c474500IjALIZ.LJJII(lValueOf5, "entrance_fans_count");
                                c474500IjALIZ.LJJII(Integer.valueOf(C496760Jdy.LIZIZ(Boolean.valueOf(Intrinsics.LJFF(lValueOf5, lValueOf4)))), "is_fans_count_same");
                                c474500IjALIZ.LJJII(str, "user_type");
                                c474500IjALIZ.LIZ();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (lValueOf2 != null) {
                                jLongValue = lValueOf2.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            if (C1114690f75.LIZ(jLongValue, j3) && (fansClubViewModelX12 = fansClubWidget.x1()) != null && (c1094910ebB = fansClubViewModelX12.LLJ) != null) {
                                C1095090ebT.LIZ("task_page", C1094910ebB.LIZ(fansClubViewModelX12.getDataChannel()), jLongValue, j3, c1094910ebB.LIZ, new C1095010ebL("task_page", strLJFF5, null, null, new C1095070ebR(str3)), c1094910ebB.LIZIZ, null);
                                break;
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    public static final void mh2$5(C1151790g4v c1151790g4v, C262100zr c262100zr) {
        String strLJFF;
        Long lValueOf;
        Long lValueOf2;
        String str;
        Map<String, Object> mapLIZ;
        Context viewContext;
        IHybridStorageService iHybridStorageService;
        WeakReference<InterfaceC978780bZs> weakReferenceLIZJ;
        InterfaceC978780bZs interfaceC978780bZs;
        Context viewContext2;
        Activity activityLIZ;
        InterfaceC1107590evd interfaceC1107590evd;
        Map<String, Object> mapLIZ2;
        String string;
        Boolean bool;
        final C1104590eqn c1104590eqn = (C1104590eqn) c1151790g4v.l0;
        c1104590eqn.getClass();
        String str2 = c262100zr.LIZ;
        int iHashCode = str2.hashCode();
        boolean zBooleanValue = true;
        if (iHashCode != -932658980) {
            if (iHashCode != 1912105183) {
                if (iHashCode == 2058562843 && str2.equals("EVENT_GOODY_BAG_SHARE_EVENT")) {
                    C20441214yg.LIZIZ("GoodyBagPresenter", "handleEvent: EVENT_GOODY_BAG_CREATE_SUCCESS");
                    InterfaceC1104610eqp interfaceC1104610eqp = c1104590eqn.LIZIZ;
                    if (interfaceC1104610eqp != null && (viewContext2 = interfaceC1104610eqp.getViewContext()) != null && (activityLIZ = C1388190mED.LIZ(viewContext2)) != null && (interfaceC1107590evd = c262100zr.LIZIZ) != null && (mapLIZ2 = interfaceC1107590evd.LIZ()) != null) {
                        DataChannel dataChannel = c1104590eqn.LIZ;
                        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("openSharePanel: ");
                        sbLIZ.append(zBooleanValue);
                        C20441214yg.LIZIZ("GoodyBagPresenter", C2188811AlT.LIZIZ(sbLIZ));
                        Object obj = mapLIZ2.get("track_info");
                        if (obj == null || (string = obj.toString()) == null) {
                            string = "";
                        }
                        try {
                            final JSONObject jSONObject = new JSONObject(string);
                            final Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                            Map<String, String> mapLJIIZILJ = C0IJT.LIZ("").LJIIZILJ();
                            IShareService iShareService = (IShareService) C1161920gLG.LIZJ(IShareService.class);
                            C1106200etO c1106200etO = new C1106200etO(c1104590eqn.LIZLLL);
                            c1106200etO.LJIL = mapLJIIZILJ;
                            c1106200etO.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
                            c1106200etO.LJJJI = zBooleanValue;
                            LiveShareDialog liveShareDialogT71 = iShareService.t71(new C1106210etP(c1106200etO), new InterfaceC1372610lp5() { // from class: X.0IhZ
                                @Override // X.InterfaceC1372610lp5
                                public final void LIZ(Throwable th) {
                                }

                                @Override // X.InterfaceC1372610lp5
                                public final /* synthetic */ void LIZIZ(HashMap map) {
                                }

                                @Override // X.InterfaceC1372610lp5
                                public final /* synthetic */ void LIZLLL(HashMap map) {
                                }

                                @Override // X.InterfaceC1372610lp5
                                public final /* synthetic */ void LJ(HashMap map) {
                                }

                                @Override // X.InterfaceC1372610lp5
                                public final /* synthetic */ void LJFF(Dialog dialog) {
                                }

                                @Override // X.InterfaceC1372610lp5
                                public final /* synthetic */ void LJI(Dialog dialog) {
                                }

                                @Override // X.InterfaceC1372610lp5
                                public final /* synthetic */ void LJII() {
                                }

                                @Override // X.InterfaceC1372610lp5
                                public final /* synthetic */ void onDismiss() {
                                }

                                @Override // X.InterfaceC1372610lp5
                                public final /* synthetic */ void onShow(int i) {
                                }

                                @Override // X.InterfaceC1372610lp5
                                public final void LIZJ(String str3, String str4, Bundle bundle) {
                                    String string2;
                                    long id;
                                    String str5;
                                    String labels;
                                    long ownerUserId;
                                    long currentUserId;
                                    String str6 = str3;
                                    String str7 = str4;
                                    if (bundle == null || (string2 = bundle.getString("shareIdList", "")) == null) {
                                        string2 = "";
                                    }
                                    Room room2 = room;
                                    if (room2 != null) {
                                        id = room2.getId();
                                    } else {
                                        id = 0;
                                    }
                                    if (str6 == null) {
                                        str5 = "";
                                    } else {
                                        str5 = str6;
                                    }
                                    if (str7 == null) {
                                        str7 = "";
                                    }
                                    Room room3 = room;
                                    if (room3 != null) {
                                        labels = room3.getLabels();
                                    } else {
                                        labels = null;
                                    }
                                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                                    String str8 = (String) dataChannelGlobal.gg0(C1148270fzF.class);
                                    DataChannel dataChannel2 = c1104590eqn.LIZ;
                                    if (dataChannel2 != null) {
                                        dataChannel2.LC0(ShareJoinInGoodyBag.class, str5);
                                    }
                                    C1104590eqn c1104590eqn2 = c1104590eqn;
                                    Room room4 = room;
                                    JSONObject jSONObject2 = jSONObject;
                                    c1104590eqn2.getClass();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("share_success");
                                    sbLIZ2.append(System.currentTimeMillis());
                                    String mD5String = MD5Utils.getMD5String(C2188811AlT.LIZIZ(sbLIZ2));
                                    C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("share_info", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                                    c474500IjALIZIZ.LJJII(mD5String, "bind_id");
                                    c474500IjALIZIZ.LJJII(string2, "to_user_id");
                                    c474500IjALIZIZ.LIZ();
                                    HashMap map = new HashMap();
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    map.put("share_platform", str6);
                                    map.put("share_type", str7);
                                    map.put("bind_id", mD5String);
                                    if (room4 != null && room4.getLog_pb() != null) {
                                        map.put("log_pb", room4.getLog_pb());
                                    }
                                    w.LIZ.getClass();
                                    String strLJIILJJIL = w.LJIILJJIL();
                                    Room room5 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                                    InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                                    if (room5 != null) {
                                        ownerUserId = room5.getOwnerUserId();
                                    } else {
                                        ownerUserId = -1;
                                    }
                                    if (interfaceC500940JkiUser != null) {
                                        currentUserId = interfaceC500940JkiUser.getCurrentUserId();
                                    } else {
                                        currentUserId = -2;
                                    }
                                    if (ownerUserId != currentUserId && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vp0()) {
                                        map.put("connection_type", "manual_pk");
                                        map.put("pk_id", String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()));
                                    }
                                    if (!TextUtils.isEmpty(strLJIILJJIL) && Intrinsics.LJFF("click_push_live_cd_user", strLJIILJJIL)) {
                                        map.put("is_subscribe", "1");
                                    } else {
                                        map.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
                                    }
                                    if (C497740JfY.LJIL()) {
                                        map.put("room_orientation", "portrait");
                                    } else {
                                        map.put("room_orientation", "landscape");
                                    }
                                    map.put("multi_tool", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).No2());
                                    ((ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class)).addPkTransfer(map, room4, "GoodyBagPresenter_logLiveShare");
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("share");
                                    c474500IjALIZ.LJJIIZI(map);
                                    c474500IjALIZ.LJ("click");
                                    c474500IjALIZ.LJIL();
                                    c474500IjALIZ.LJJIIJZLJL(jSONObject2);
                                    c474500IjALIZ.LIZ();
                                    ((IShareService) C1161920gLG.LIZJ(IShareService.class)).ky(labels, id, string2, str8).LJJLL(new C09JN() { // from class: X.0Iha
                                        @Override // X.C09JN
                                        public final void accept(Object obj2) {
                                            T t;
                                            C1C7U.LIZ("GoodyBagPresenter@6f83.handleEvent$6$1$shareDialog$1$onSuccess$1");
                                            BaseResponse baseResponse = (BaseResponse) obj2;
                                            if (baseResponse != null && (t = baseResponse.data) != null && ((ShareReportResult) t).getDeltaIntimacy() > 0) {
                                                C784440Upu.LIZ().LIZIZ(new C473550Ihd((ShareReportResult) baseResponse.data));
                                            }
                                            C1C7U.LIZIZ("GoodyBagPresenter@6f83.handleEvent$6$1$shareDialog$1$onSuccess$1");
                                        }
                                    }, C0J1R.LIZ);
                                }
                            });
                            C19EG c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ);
                            if (c19egLIZIZ != null && liveShareDialogT71 != null) {
                                liveShareDialogT71.show(c19egLIZIZ.getSupportFragmentManager(), "LiveShareDialog");
                                return;
                            }
                            return;
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return;
                        }
                    }
                    return;
                }
            } else if (str2.equals("EVENT_GOODY_BAG_CREATE_SUCCESS")) {
                C20441214yg.LIZIZ("GoodyBagPresenter", "handleEvent: EVENT_GOODY_BAG_CREATE_SUCCESS");
                InterfaceC1104610eqp interfaceC1104610eqp2 = c1104590eqn.LIZIZ;
                if (interfaceC1104610eqp2 != null && (weakReferenceLIZJ = interfaceC1104610eqp2.LIZJ()) != null && (interfaceC978780bZs = weakReferenceLIZJ.get()) != null) {
                    interfaceC978780bZs.onSuccess();
                }
                if (!c1104590eqn.LJFF) {
                    C817503Hh c817503Hh = C817503Hh.LL;
                    C23250099c.LIZLLL(c817503Hh, null, null, new C314190CTh(c1104590eqn, null), 3);
                    InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd2 != null && (mapLIZ = interfaceC1107590evd2.LIZ()) != null) {
                        Object obj2 = mapLIZ.get("base_info");
                        Gson gson = C19748512Ol.LIZIZ;
                        GoodyBagBaseInfo goodyBagBaseInfo = (GoodyBagBaseInfo) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, obj2), GoodyBagBaseInfo.class);
                        String strLJIIJJI = c1104590eqn.LJIIJJI(goodyBagBaseInfo, "fe");
                        if (strLJIIJJI != null) {
                            c1104590eqn.LJFF = true;
                            InterfaceC1104610eqp interfaceC1104610eqp3 = c1104590eqn.LIZIZ;
                            if (interfaceC1104610eqp3 != null && (viewContext = interfaceC1104610eqp3.getViewContext()) != null && (iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)) != null) {
                                iHybridStorageService.CM(viewContext, Boolean.FALSE, "ANCHOR_OPENED_GOODY_BAG_PANEL", null);
                            }
                            InterfaceC1104610eqp interfaceC1104610eqp4 = c1104590eqn.LIZIZ;
                            if (interfaceC1104610eqp4 != null) {
                                interfaceC1104610eqp4.LJJZ(strLJIIJJI);
                            }
                            c1104590eqn.LJIIJ = goodyBagBaseInfo;
                            c1104590eqn.LJIILJJIL = false;
                            c1104590eqn.LJIILL = false;
                            c1104590eqn.LJIJJ(false);
                            c1104590eqn.LJIILL("fe");
                            C20441214yg.LIZIZ("GoodyBagPresenter", "receive goodybag send event: updateCurrentGoodyBag");
                            C780500UjY.LIZ = c1104590eqn.LJIIJ;
                        }
                    }
                    C23250099c.LIZLLL(c817503Hh, null, null, new C408801iQ(null), 3);
                    return;
                }
                return;
            }
        } else if (str2.equals("EVENT_GOODY_BAG_END")) {
            C20441214yg.LIZIZ("GoodyBagPresenter", "handleEvent: EVENT_GOODY_BAG_END");
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd3, "goody_bag_id", "");
            } else {
                strLJFF = null;
            }
            GoodyBagBaseInfo goodyBagBaseInfo2 = c1104590eqn.LJIIJ;
            if (goodyBagBaseInfo2 != null && (str = goodyBagBaseInfo2.goodyBagId) != null) {
                lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            } else {
                lValueOf = null;
            }
            if (strLJFF != null) {
                lValueOf2 = Long.valueOf(CastLongProtector.parseLong(strLJFF));
            } else {
                lValueOf2 = null;
            }
            if (Intrinsics.LJFF(lValueOf, lValueOf2) && !c1104590eqn.LJIIL) {
                c1104590eqn.LJIIL = true;
                C817503Hh c817503Hh2 = C817503Hh.LL;
                C23250099c.LIZLLL(c817503Hh2, null, null, new C314220CTk(c1104590eqn, null), 3);
                C23250099c.LIZLLL(c817503Hh2, null, null, new C314170CTf(c1104590eqn, null), 3);
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleEvent: unknown event->");
        sbLIZ2.append(c262100zr.LIZ);
        C20441214yg.LJ("GoodyBagPresenter", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final void mh2$6(C1151790g4v c1151790g4v, C262100zr c262100zr) {
        C1104720er0 c1104720er0 = (C1104720er0) c1151790g4v.l0;
        c1104720er0.getClass();
        String str = c262100zr.LIZ;
        Integer numValueOf = null;
        if (Intrinsics.LJFF(str, "liveGoldenEnvelopCloseAll")) {
            C20441214yg.LIZIZ("ActivityTreasurePresenter", "handleEvent: liveGoldenEnvelopCloseAll");
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "business_type", 0));
            }
            C19719512Dh.LIZJ(c1104720er0.LJ).remove(numValueOf);
            return;
        }
        if (Intrinsics.LJFF(str, "EVENT_ENVELOPE_UPDATE")) {
            C20441214yg.LJ("ActivityTreasurePresenter", "handleEvent: EVENT_ENVELOPE_UPDATE");
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C408501iN(null), 3);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleEvent: unknown event->");
            sbLIZ.append(c262100zr.LIZ);
            C20441214yg.LJ("ActivityTreasurePresenter", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        r0 = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fportals_detail%2Ftemplate.js&gravity=bottom&landscape_screen_size_as_portrait=1";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void mh2$7(X.C1151790g4v r17, X.C262100zr r18) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1151790g4v.mh2$7(X.0g4v, X.00zr):void");
    }

    public static final void mh2$8(C1151790g4v c1151790g4v, C262100zr c262100zr) {
        Room room;
        C20441214yg.LJIIIZ("CollaborateGiftingBiz", "Lynx ShortTouch destroy jsb received, removing ShortTouch view and play finish effect");
        C1131150fXd c1131150fXd = (C1131150fXd) c1151790g4v.l0;
        long j = c1131150fXd.LJII;
        if (j <= 0) {
            C20441214yg.LJ("CollaborateGiftingBiz", "playSessionFinishEffect return, effectId is invalid");
        } else {
            DataChannel dataChannel = c1131150fXd.LIZ;
            if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                long id = room.getId();
                long j2 = c1131150fXd.LJFF;
                CommonMessageData commonMessageData = new CommonMessageData();
                commonMessageData.roomId = id;
                commonMessageData.messageId = C158B.LIZ();
                commonMessageData.createTime = System.currentTimeMillis();
                GiftEffect giftEffect = new GiftEffect();
                AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(j);
                if (assetsModelLIZLLL != null) {
                    giftEffect.assets.add(assetsModelLIZLLL);
                }
                GiftMessage giftMessage = new GiftMessage();
                giftMessage.LLILLJJLI = true;
                giftMessage.LLILLL = false;
                giftMessage.isLocalInsertMsg = true;
                giftMessage.comboCount = 1;
                giftMessage.repeatCount = 1;
                giftMessage.groupId = C158B.LIZ();
                giftMessage.baseMessage = commonMessageData;
                giftMessage.fromUser = new User();
                giftMessage.toUser = C0KXJ.LIZIZ();
                giftMessage.giftEffect = giftEffect;
                Gift gift = new Gift();
                gift.id = j2;
                gift.type = 2;
                gift.primaryEffectId = j;
                giftMessage.mGift = gift;
                GiftMessage.InteractiveGiftInfo interactiveGiftInfo = new GiftMessage.InteractiveGiftInfo();
                interactiveGiftInfo.ignoreComponent = 6L;
                giftMessage.interactiveGiftInfo = interactiveGiftInfo;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playSessionFinishEffect effectId=");
                sbLIZ.append(j);
                C20441214yg.LJIIIZ("CollaborateGiftingBiz", C2188811AlT.LIZIZ(sbLIZ));
                GiftCollaborateGiftingEndAssetTimeoutSetting giftCollaborateGiftingEndAssetTimeoutSetting = GiftCollaborateGiftingEndAssetTimeoutSetting.INSTANCE;
                long timeoutMs = giftCollaborateGiftingEndAssetTimeoutSetting.getTimeoutMs();
                long timeoutMs2 = giftCollaborateGiftingEndAssetTimeoutSetting.getTimeoutMs();
                AFwS301S0000000_17 aFwS301S0000000_17 = AFwS301S0000000_17.get$arr$(23);
                if (GiftCollaborateGiftingDownloadTimeOutToastSetting.INSTANCE.isEnabled() && timeoutMs > 0 && timeoutMs2 > 0) {
                    Map<Long, C1131940fYu> map = C1131950fYv.LIZ;
                    C1131940fYu c1131940fYuRemove = map.remove(Long.valueOf(j));
                    if (c1131940fYuRemove != null) {
                        C0IK5.LIZLLL(c1131940fYuRemove.LIZJ);
                        Object obj = c1131940fYuRemove.LJFF;
                        if (obj != null) {
                            C0IK5.LIZLLL(obj);
                        }
                        c1131940fYuRemove.LIZIZ = EnumC1131980fYy.LLILLL;
                    }
                    Object obj2 = new Object();
                    map.put(Long.valueOf(j), new C1131940fYu(j, obj2, timeoutMs2, aFwS301S0000000_17));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("mark effectId=");
                    sbLIZ2.append(j);
                    sbLIZ2.append(" waitStart=");
                    sbLIZ2.append(timeoutMs);
                    sbLIZ2.append("ms timeout=");
                    sbLIZ2.append(timeoutMs2);
                    sbLIZ2.append("ms");
                    C20441214yg.LJIIIZ("GiftEffectDownloadTimeoutWatcher", C2188811AlT.LIZIZ(sbLIZ2));
                    C486790J7d.LIZLLL(new ARunnableS20S0100100_17(j, obj2, 7), obj2, timeoutMs);
                }
                DataChannel dataChannel2 = c1131150fXd.LIZ;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(GiftInsertGiftMessageChannel.class, giftMessage);
                }
            }
        }
        ((C1131150fXd) c1151790g4v.l0).LIZ();
    }
}
