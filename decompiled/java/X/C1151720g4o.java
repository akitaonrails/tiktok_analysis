package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.game.model.AccessRecallMessage;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelReceiver;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelSender;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortalInfoWithDisplay;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.portal.PortalFeatureSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.KaraokeSwitchMessage;
import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.NewPinMessage;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0g4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151720g4o implements OnMessageListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        switch (this.$t) {
            case 0:
                onMessage$0(this, iMessage);
                break;
            case 1:
                onMessage$1(this, iMessage);
                break;
            case 2:
                onMessage$2(this, iMessage);
                break;
            case 3:
                onMessage$3(this, iMessage);
                break;
            case 4:
                onMessage$4(this, iMessage);
                break;
            case 5:
                onMessage$5(this, iMessage);
                break;
            case 6:
                onMessage$6(this, iMessage);
                break;
            case 7:
                onMessage$7(this, iMessage);
                break;
            case 8:
                onMessage$8(this, iMessage);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onMessage$9(this, iMessage);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onMessage$10(this, iMessage);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onMessage$11(this, iMessage);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onMessage$12(this, iMessage);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onMessage$13(this, iMessage);
                break;
            case 14:
                onMessage$14(this, iMessage);
                break;
            case 15:
                onMessage$15(this, iMessage);
                break;
            case 16:
                onMessage$16(this, iMessage);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onMessage$17(this, iMessage);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onMessage$18(this, iMessage);
                break;
            case 19:
                onMessage$19(this, iMessage);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onMessage$20(this, iMessage);
                break;
            case 21:
                onMessage$21(this, iMessage);
                break;
            case 22:
                onMessage$22(this, iMessage);
                break;
            case 23:
                onMessage$23(this, iMessage);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onMessage$24(this, iMessage);
                break;
            case 25:
                onMessage$25(this, iMessage);
                break;
            case 26:
                onMessage$26(this, iMessage);
                break;
            case 27:
                onMessage$27(this, iMessage);
                break;
            case 28:
                onMessage$28(this, iMessage);
                break;
            case 29:
                onMessage$29(this, iMessage);
                break;
        }
    }

    public C1151720g4o(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo] */
    /* JADX WARN: Type inference failed for: r6v6, types: [long] */
    public static final void onMessage$0(C1151720g4o c1151720g4o, IMessage iMessage) {
        String str;
        String str2;
        String str3;
        int iIntValue;
        String str4;
        String str5;
        String str6;
        String str7;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        Object obj;
        Object obj2;
        boolean z;
        MessageRedEnvelopInfo messageRedEnvelopInfo;
        long j;
        String str8;
        String string;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        String string2;
        String str9;
        FollowInfo followInfo;
        String str10;
        String str11;
        MessageRedEnvelopInfo messageRedEnvelopInfo2;
        MessageRedEnvelopInfo messageRedEnvelopInfo3;
        MessageRedEnvelopInfo messageRedEnvelopInfo4;
        MessageRedEnvelopInfo messageRedEnvelopInfo5;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        InterfaceC500940Jki interfaceC500940JkiUser2;
        InterfaceC2262081DgM currentUser2;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        boolean zLJI = MethodIDManager.LJI(72014);
        Map<String, Object> map = C1338270kvh.LIZ;
        C1104710eqz c1104710eqz = (C1104710eqz) c1151720g4o.l0;
        c1104710eqz.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (iMessage instanceof RedEnvelopMessage) {
            RedEnvelopMessage redEnvelopMessage = (RedEnvelopMessage) iMessage;
            if (redEnvelopMessage.display != 3) {
                MessageRedEnvelopInfo messageRedEnvelopInfo6 = redEnvelopMessage.envelopeInfo;
                String str12 = "";
                if (messageRedEnvelopInfo6 == null || (str2 = messageRedEnvelopInfo6.sendUserId) == null) {
                    str2 = "";
                }
                boolean zLJFF = Intrinsics.LJFF(str2, String.valueOf(UserService.getInstance().user().getCurrentUserId()));
                Boolean bool = c1104710eqz.LIZLLL;
                boolean zLJIIJ = c1104710eqz.LJIIJ();
                HashMap map2 = new HashMap(7);
                MessageRedEnvelopInfo messageRedEnvelopInfo7 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo7 == null || (str3 = messageRedEnvelopInfo7.envelopeId) == null) {
                    str3 = "";
                }
                map2.put("envelope_id", str3);
                MessageRedEnvelopInfo messageRedEnvelopInfo8 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo8 != null && (num9 = messageRedEnvelopInfo8.businessType) != null) {
                    iIntValue = num9.intValue();
                } else {
                    iIntValue = 0;
                }
                map2.put("business_type", String.valueOf(iIntValue));
                MessageRedEnvelopInfo messageRedEnvelopInfo9 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo9 == null || (str4 = messageRedEnvelopInfo9.sendUserId) == null) {
                    str4 = "";
                }
                map2.put("send_user_id", str4);
                MessageRedEnvelopInfo messageRedEnvelopInfo10 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo10 == null || (str5 = messageRedEnvelopInfo10.createTime) == null) {
                    str5 = "";
                }
                map2.put("create_at", str5);
                map2.put("display", String.valueOf(redEnvelopMessage.display));
                map2.put("is_self_send", String.valueOf(zLJFF ? 1 : 0));
                long jLIZIZ = C963140bAe.LIZIZ();
                MessageRedEnvelopInfo messageRedEnvelopInfo11 = redEnvelopMessage.envelopeInfo;
                String str13 = CardStruct.IStatusCode.DEFAULT;
                if (messageRedEnvelopInfo11 == null || (str6 = messageRedEnvelopInfo11.createTime) == null) {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                map2.put("duration_from_create", String.valueOf(jLIZIZ - CastLongProtector.parseLong(str6)));
                MessageRedEnvelopInfo messageRedEnvelopInfo12 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo12 == null || (str7 = messageRedEnvelopInfo12.createTime) == null) {
                    str7 = "";
                }
                map2.put("create_at", str7);
                MessageRedEnvelopInfo messageRedEnvelopInfo13 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo13 != null && (num8 = messageRedEnvelopInfo13.unpackAt) != null) {
                    iIntValue2 = num8.intValue();
                } else {
                    iIntValue2 = 0;
                }
                map2.put("unpack_at", String.valueOf(iIntValue2));
                MessageRedEnvelopInfo messageRedEnvelopInfo14 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo14 != null && (num7 = messageRedEnvelopInfo14.peopleCount) != null) {
                    iIntValue3 = num7.intValue();
                } else {
                    iIntValue3 = 0;
                }
                map2.put("people_count", String.valueOf(iIntValue3));
                MessageRedEnvelopInfo messageRedEnvelopInfo15 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo15 != null && (num6 = messageRedEnvelopInfo15.diamondCount) != null) {
                    iIntValue4 = num6.intValue();
                } else {
                    iIntValue4 = 0;
                }
                map2.put("diamond_count", String.valueOf(iIntValue4));
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                map2.put("is_anchor", obj);
                if (zLJIIJ) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                map2.put("is_showing_treasure_box", obj2);
                map2.put("display", String.valueOf(redEnvelopMessage.display));
                UserService userService = UserService.getInstance();
                if (userService != null && (interfaceC500940JkiUser2 = userService.user()) != null && (currentUser2 = interfaceC500940JkiUser2.getCurrentUser()) != null) {
                    map2.put("user_id", String.valueOf(currentUser2.getId()));
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_treasure_box_msg_receive");
                c474500IjALIZ.LJJIIZI(map2);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJIILJJIL("live_detail");
                c474500IjALIZ.LJIILL("click");
                c474500IjALIZ.LJIIJJI("live");
                c474500IjALIZ.LIZ();
                C1CC2.LJII(0, "ttlive_treasure_box_msg_receive", map2);
                MessageRedEnvelopInfo messageRedEnvelopInfo16 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo16 != null && (num5 = messageRedEnvelopInfo16.businessType) != null && num5.intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || (((messageRedEnvelopInfo2 = redEnvelopMessage.envelopeInfo) != null && (num4 = messageRedEnvelopInfo2.businessType) != null && num4.intValue() == 2) || (((messageRedEnvelopInfo3 = redEnvelopMessage.envelopeInfo) != null && (num3 = messageRedEnvelopInfo3.businessType) != null && num3.intValue() == 4) || (((messageRedEnvelopInfo4 = redEnvelopMessage.envelopeInfo) != null && (num2 = messageRedEnvelopInfo4.businessType) != null && num2.intValue() == 9) || ((messageRedEnvelopInfo5 = redEnvelopMessage.envelopeInfo) != null && (num = messageRedEnvelopInfo5.businessType) != null && num.intValue() == 19))))) {
                    String strLJIIIZ = c1104710eqz.LJIIIZ(redEnvelopMessage, "message");
                    if (strLJIIIZ != null) {
                        if (!c1104710eqz.LJIIJ() && redEnvelopMessage.display == 2) {
                            ((HashSet) c1104710eqz.LIZ).add(iMessage);
                        } else {
                            MessageRedEnvelopInfo messageRedEnvelopInfo17 = redEnvelopMessage.envelopeInfo;
                            if (messageRedEnvelopInfo17 == null || (str10 = messageRedEnvelopInfo17.sendUserId) == null) {
                                str10 = "";
                            }
                            arrayList.add(str10);
                            MessageRedEnvelopInfo messageRedEnvelopInfo18 = redEnvelopMessage.envelopeInfo;
                            if (messageRedEnvelopInfo18 == null || (str11 = messageRedEnvelopInfo18.envelopeId) == null) {
                                str11 = "";
                            }
                            arrayList2.add(str11);
                            c1104710eqz.LJFF.add(new Pair<>(strLJIIIZ, "message"));
                            c1104710eqz.LIZIZ();
                            c1104710eqz.LJIIJJI(c1104710eqz.LJIIJ());
                        }
                    }
                    boolean zIsAnchor = c1104710eqz.isAnchor();
                    HashMap map3 = new HashMap(11);
                    w.LIZ.getClass();
                    map3.put("enter_from_merge", w.LJIIIZ());
                    map3.put("enter_method", w.LJIIL());
                    map3.put("type", "redpacket_type");
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room != null) {
                        String idStr = room.getIdStr();
                        if (idStr == null) {
                            idStr = String.valueOf(room.getId());
                        }
                        map3.put("room_id", idStr);
                        map3.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                        User owner = room.getOwner();
                        if (owner == null || (followInfo = owner.getFollowInfo()) == null || (string2 = Long.valueOf(followInfo.getFollowStatus()).toString()) == null) {
                            string2 = "";
                        }
                        map3.put("follow_status", string2);
                        Hashtag hashtag = room.hashtag;
                        if (hashtag != null && (str9 = hashtag.title) != null) {
                            str12 = str9;
                        }
                        map3.put("hashtag_type", str12);
                        map3.put("live_type", C354201Zc.LIZ(room.getStreamType()));
                    }
                    UserService userService2 = UserService.getInstance();
                    if (userService2 != null && (interfaceC500940JkiUser = userService2.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                        map3.put("user_id", String.valueOf(currentUser.getId()));
                    }
                    if (zIsAnchor) {
                        str13 = "1";
                    }
                    map3.put("is_anchor", str13);
                    map3.put("online_watch_users", String.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()));
                    map3.put(Scene.SCENE_SERVICE, C1128450fTH.LJIILLIIL());
                    if (redEnvelopMessage.display == 1 && (messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo) != 0) {
                        long jLIZ = C158B.LIZ();
                        try {
                            str8 = messageRedEnvelopInfo.createTime;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(" createTime parse exception ");
                            sbLIZ.append(messageRedEnvelopInfo.createTime);
                            C20441214yg.LJ("DownloadManager", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (str8 != null && (string = a0.LJLIIIL(str8).toString()) != null) {
                            messageRedEnvelopInfo = CastLongProtector.parseLong(string);
                            j = messageRedEnvelopInfo;
                        } else {
                            j = -1;
                        }
                        if (j == -1) {
                            map3.put("show_delay_duration", String.valueOf(j));
                        } else {
                            map3.put("show_delay_duration", String.valueOf(jLIZ - j));
                        }
                    }
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("redpacket_show_delay_duration");
                    c474500IjALIZ2.LJJIIZI(map3);
                    c474500IjALIZ2.LJIL();
                    c474500IjALIZ2.LJIILJJIL("live_detail");
                    c474500IjALIZ2.LJIILL("click");
                    c474500IjALIZ2.LJIIJJI("live");
                    c474500IjALIZ2.LIZ();
                }
            }
        } else if (iMessage instanceof AccessRecallMessage) {
            AccessRecallMessage accessRecallMessage = (AccessRecallMessage) iMessage;
            if (TextUtils.equals(accessRecallMessage.scene, "ENVELOPE") && accessRecallMessage.status == 0) {
                C20441214yg.LJIIIZ("RedEnvelopePresenter", " permission recover msg");
                DataChannel dataChannel = c1104710eqz.LIZIZ;
                if (dataChannel != null) {
                    dataChannel.SX0(C1104680eqw.class, 0L);
                }
                InterfaceC1104760er4 interfaceC1104760er4 = c1104710eqz.LIZJ;
                if (interfaceC1104760er4 != null) {
                    interfaceC1104760er4.LLJJI();
                }
            }
        } else if (iMessage instanceof PerceptionMessage) {
            PerceptionMessage perceptionMessage = (PerceptionMessage) iMessage;
            PunishEventInfo punishEventInfo = perceptionMessage.publicEventInfo;
            if (punishEventInfo != null) {
                str = punishEventInfo.punishType;
            } else {
                str = null;
            }
            if (TextUtils.equals(str, "box_ban")) {
                long jLIZIZ2 = C158B.LIZIZ();
                long j2 = ((long) perceptionMessage.endTime) * 1000;
                if (j2 - jLIZIZ2 > 0) {
                    DataChannel dataChannel2 = c1104710eqz.LIZIZ;
                    if (dataChannel2 != null) {
                        dataChannel2.SX0(C1104680eqw.class, Long.valueOf(j2));
                    }
                    InterfaceC1104760er4 interfaceC1104760er42 = c1104710eqz.LIZJ;
                    if (interfaceC1104760er42 != null) {
                        interfaceC1104760er42.e0();
                    }
                } else {
                    C20441214yg.LJIIIZ("RedEnvelopePresenter", " permission revoke msg is late");
                }
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void onMessage$1(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$10(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$11(C1151720g4o c1151720g4o, IMessage iMessage) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) c1151720g4o.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        interfaceC1078490eAh.invoke(iMessage);
    }

    public static final void onMessage$12(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$13(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$14(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$15(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$16(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$17(C1151720g4o c1151720g4o, IMessage iMessage) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) c1151720g4o.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        interfaceC1078490eAh.invoke(iMessage);
    }

    public static final void onMessage$18(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$19(C1151720g4o c1151720g4o, IMessage iMessage) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) c1151720g4o.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message: ");
        sbLIZ.append(iMessage);
        C20441214yg.LIZIZ("KLazy", C2188811AlT.LIZIZ(sbLIZ));
        if (iMessage instanceof KaraokeSwitchMessage) {
            KaraokeSwitchMessage karaokeSwitchMessage = (KaraokeSwitchMessage) iMessage;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("message: ");
            sbLIZ2.append(karaokeSwitchMessage.status);
            sbLIZ2.append(", ");
            sbLIZ2.append(karaokeSwitchMessage.type);
            C20441214yg.LIZIZ("KLazy", C2188811AlT.LIZIZ(sbLIZ2));
            if (karaokeSwitchMessage.type == 0 && karaokeSwitchMessage.status == 0) {
                interfaceC1078490eAh.invoke(iMessage);
            }
        }
    }

    public static final void onMessage$2(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$20(C1151720g4o c1151720g4o, IMessage iMessage) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) c1151720g4o.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message: ");
        sbLIZ.append(iMessage);
        C20441214yg.LIZIZ("KLazy", C2188811AlT.LIZIZ(sbLIZ));
        if (iMessage instanceof KaraokeSwitchMessage) {
            KaraokeSwitchMessage karaokeSwitchMessage = (KaraokeSwitchMessage) iMessage;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("message: ");
            sbLIZ2.append(karaokeSwitchMessage.status);
            sbLIZ2.append(", ");
            sbLIZ2.append(karaokeSwitchMessage.type);
            C20441214yg.LIZIZ("KLazy", C2188811AlT.LIZIZ(sbLIZ2));
            if (karaokeSwitchMessage.type == 0 && karaokeSwitchMessage.status == 0) {
                interfaceC1078490eAh.invoke(iMessage);
            }
        }
    }

    public static final void onMessage$21(C1151720g4o c1151720g4o, IMessage iMessage) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) c1151720g4o.l0;
        if (iMessage instanceof MemberMessage) {
            int i = ((MemberMessage) iMessage).action;
            if (i == 28 || i == 36) {
                interfaceC1078490eAh.invoke(iMessage);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onMessage$22(X.C1151720g4o r18, com.ss.ugc.live.sdk.message.data.IMessage r19) {
        /*
            Method dump skipped, instruction units count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1151720g4o.onMessage$22(X.0g4o, com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onMessage$23(X.C1151720g4o r13, com.ss.ugc.live.sdk.message.data.IMessage r14) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1151720g4o.onMessage$23(X.0g4o, com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public static final void onMessage$24(C1151720g4o c1151720g4o, IMessage iMessage) {
        if (iMessage instanceof LiveEventMessage) {
            C1096420edc c1096420edc = C1096420edc.LL;
            C1096420edc.LIZIZ(((Room) c1151720g4o.l0).getId(), C1096490edj.LIZ(new C1096490edj(((Room) c1151720g4o.l0).getId()), (LiveEventMessage) iMessage, false, null, 13));
        }
    }

    public static final void onMessage$25(C1151720g4o c1151720g4o, IMessage iMessage) {
        String str;
        String str2;
        String strValueOf;
        Object obj;
        int i;
        Object obj2;
        ImageModel imageModel;
        ImageModel imageModel2;
        String str3;
        String str4;
        InterfaceC2365009Om interfaceC2365009Om;
        String str5;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive message ");
        sbLIZ.append(iMessage.getClass().getCanonicalName());
        C20441214yg.LIZIZ("PortalLeaf", C2188811AlT.LIZIZ(sbLIZ));
        C1100380ek0 c1100380ek0 = (C1100380ek0) c1151720g4o.l0;
        c1100380ek0.getClass();
        if (iMessage instanceof EnvelopePortalMessage) {
            EnvelopePortalMessage envelopePortalMessage = (EnvelopePortalMessage) iMessage;
            boolean zLJJJJI = c1100380ek0.LJJJJI();
            HashMap map = new HashMap(11);
            EnvelopePortalMessage.PortalInfo portalInfo = envelopePortalMessage.portalInfo;
            String str6 = "";
            if (portalInfo == null || (str = portalInfo.id) == null) {
                str = "";
            }
            map.put("portal_id", str);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = String.valueOf(room.getId());
                }
                map.put("room_id", idStr);
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            EnvelopePortalMessage.PortalInfo portalInfo2 = envelopePortalMessage.portalInfo;
            String str7 = CardStruct.IStatusCode.DEFAULT;
            if (portalInfo2 == null || (str2 = portalInfo2.senderId) == null) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            UserService userService = UserService.getInstance();
            if (userService == null || (interfaceC500940JkiUser = userService.user()) == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null) {
                strValueOf = "";
            } else {
                map.put("user_id", String.valueOf(currentUser.getId()));
                strValueOf = String.valueOf(currentUser.getId());
            }
            if (Intrinsics.LJFF(strValueOf, str2)) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_self_send", obj);
            EnvelopePortalMessage.PortalInfo portalInfo3 = envelopePortalMessage.portalInfo;
            if (portalInfo3 != null) {
                i = portalInfo3.sendAtSecond;
            } else {
                i = 0;
            }
            map.put("duration_from_send", String.valueOf(C963140bAe.LIZIZ() - (((long) i) * 1000)));
            if (zLJJJJI) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_anchor", obj2);
            map.put("portal_view_type", String.valueOf(envelopePortalMessage.portalView));
            map.put("display", String.valueOf(envelopePortalMessage.portalDisplay));
            EnvelopePortalMessage.PortalInfo portalInfo4 = envelopePortalMessage.portalInfo;
            if (portalInfo4 != null && (str5 = portalInfo4.senderId) != null) {
                str6 = str5;
            }
            map.put("sender_id", str6);
            if (PortalFeatureSetting.INSTANCE.getValue()) {
                str7 = "1";
            }
            map.put("settings_enable", str7);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_portal_msg_receive");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
            C1CC2.LIZLLL("ttlive_portal_msg_receive", map, new HashMap(), new HashMap());
            EnvelopePortalMessage.PortalTransTarget portalTransTarget = envelopePortalMessage.portalTransTarget;
            String str8 = null;
            if (portalTransTarget != null) {
                imageModel = portalTransTarget.sendRoomCover;
                if (imageModel == null) {
                    imageModel = portalTransTarget.anchorAvatar;
                }
            } else {
                imageModel = null;
            }
            int i2 = envelopePortalMessage.portalView;
            if (i2 != 1) {
                if (i2 != 2) {
                    C150500hr.LIZ(envelopePortalMessage, c1100380ek0.LJJJJI(), "msg_data_is_null");
                    return;
                }
                EnvelopPortal4FEModelSender envelopPortal4FEModelSender = new EnvelopPortal4FEModelSender();
                envelopPortal4FEModelSender.portalInfos.add(envelopePortalMessage.portalInfo);
                envelopPortal4FEModelSender.timeDiff = C963140bAe.LIZLLL;
                envelopPortal4FEModelSender.dataFrom = "message";
                interfaceC2365009Om = envelopPortal4FEModelSender;
            } else {
                EnvelopPortal4FEModelReceiver envelopPortal4FEModelReceiver = new EnvelopPortal4FEModelReceiver();
                EnvelopPortalInfoWithDisplay envelopPortalInfoWithDisplay = new EnvelopPortalInfoWithDisplay();
                envelopPortalInfoWithDisplay.portalInfo = envelopePortalMessage.portalInfo;
                EnvelopePortalMessage.PortalTransTarget portalTransTarget2 = envelopePortalMessage.portalTransTarget;
                if (portalTransTarget2 != null) {
                    imageModel2 = portalTransTarget2.anchorAvatar;
                } else {
                    imageModel2 = null;
                }
                envelopPortalInfoWithDisplay.anchorAvatar = imageModel2;
                envelopPortalInfoWithDisplay.display = envelopePortalMessage.portalDisplay;
                if (portalTransTarget2 != null) {
                    str3 = portalTransTarget2.roomId;
                } else {
                    str3 = null;
                }
                envelopPortalInfoWithDisplay.roomId = str3;
                if (portalTransTarget2 != null) {
                    str4 = portalTransTarget2.anchorId;
                } else {
                    str4 = null;
                }
                envelopPortalInfoWithDisplay.anchorId = str4;
                if (portalTransTarget2 != null) {
                    str8 = portalTransTarget2.anchorDisplayId;
                }
                envelopPortalInfoWithDisplay.anchorDisplayId = str8;
                envelopPortalInfoWithDisplay.dataFrom = "message";
                envelopPortal4FEModelReceiver.portalInfos.add(envelopPortalInfoWithDisplay);
                envelopPortal4FEModelReceiver.timeDiff = C963140bAe.LIZLLL;
                interfaceC2365009Om = envelopPortal4FEModelReceiver;
            }
            C1100380ek0.LJJJJIZL(c1100380ek0, interfaceC2365009Om, imageModel, envelopePortalMessage.portalView, envelopePortalMessage.portalDisplay, envelopePortalMessage, 32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onMessage$26(C1151720g4o c1151720g4o, IMessage iMessage) {
        if (!((BaseMessage) iMessage).isCurrentRoom(((C1141780fom) c1151720g4o.l0).LIZJ)) {
            return;
        }
        if (iMessage instanceof GiftMessage) {
            GiftMessage giftMessage = (GiftMessage) iMessage;
            Gift gift = giftMessage.mGift;
            if (gift != null && gift.LJIIIZ()) {
                ((C1141780fom) c1151720g4o.l0).LIZIZ += giftMessage.comboCount;
            } else {
                ((C1141780fom) c1151720g4o.l0).LIZ += giftMessage.comboCount;
            }
        }
        C01GW c01gw = C20430714wz.LIZ;
        C20430714wz.LIZ("livesdk_custom_log_sum_gifts", new JSONObject().putOpt("small_gifts", Integer.valueOf(((C1141780fom) c1151720g4o.l0).LIZ)).putOpt("large_gifts", Integer.valueOf(((C1141780fom) c1151720g4o.l0).LIZIZ)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onMessage$27(X.C1151720g4o r12, com.ss.ugc.live.sdk.message.data.IMessage r13) {
        /*
            boolean r0 = r13 instanceof com.bytedance.android.livesdk.model.message.GiftGuideMessage
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r12.l0
            X.0fsz r0 = (X.C1144390fsz) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.LIZ
            boolean r0 = X.C500260Jjc.LJIIZILJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L1a
            return
        L1a:
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r0 = X.C915980Zwa.LJFF()
            r7 = 0
            X.0bCJ r1 = r0.RY(r7)
            X.0bCJ r0 = X.EnumC964170bCJ.MATCH_START
            if (r1 == r0) goto L28
            return
        L28:
            com.bytedance.android.livesdk.model.message.GiftGuideMessage r13 = (com.bytedance.android.livesdk.model.message.GiftGuideMessage) r13
            java.util.List<com.bytedance.android.livesdk.model.message.GuidePageResource> r3 = r13.guidePageResources
            com.bytedance.android.livesdk.model.message.GuideTarget r0 = r13.guideTarget
            r5 = 0
            if (r0 == 0) goto L7a
            long r8 = r0.targetId
            java.lang.String r10 = r0.targetType
            if (r10 != 0) goto L3a
        L38:
            java.lang.String r10 = ""
        L3a:
            if (r0 == 0) goto L77
            long r0 = r0.periodId
        L3e:
            boolean r4 = kotlin.text.a0.LJJJIL(r10)
            java.lang.String r2 = "MatchPowerupTriggerGuide"
            if (r4 != 0) goto La3
            int r4 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r4 == 0) goto La3
            com.bytedance.android.live.liveinteract.match.service.ILiveMatchService r4 = X.C915980Zwa.LJFF()
            X.0bRj r4 = r4.yf2(r7)
            if (r4 == 0) goto La3
            long r5 = r4.LJJJJJL()
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 != 0) goto La3
            java.lang.Object r0 = r12.l0
            X.0fsz r0 = (X.C1144390fsz) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LIZ
            r11 = 0
            if (r1 == 0) goto L75
            java.lang.Class<com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel> r0 = com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel.class
            java.lang.Object r1 = r1.gg0(r0)
        L6b:
            X.159M r0 = X.C159M.DISABLED
            if (r1 == r0) goto L7d
            java.lang.String r0 = "SpeedChallenge is showing , no need show this guide now"
            X.C20441214yg.LJ(r2, r0)
            return
        L75:
            r1 = r11
            goto L6b
        L77:
            r0 = 0
            goto L3e
        L7a:
            r8 = 0
            goto L38
        L7d:
            java.lang.Object r0 = r12.l0
            X.0fsz r0 = (X.C1144390fsz) r0
            java.lang.System.currentTimeMillis()
            r0.getClass()
            java.lang.Object r7 = X.C13LP.LJJJLL(r3)
            com.bytedance.android.livesdk.model.message.GuidePageResource r7 = (com.bytedance.android.livesdk.model.message.GuidePageResource) r7
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0ft4 r5 = new X.0ft4
            java.lang.Object r6 = r12.l0
            X.0fsz r6 = (X.C1144390fsz) r6
            r5.<init>(r6, r7, r8, r10, r11)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r11, r11, r5, r0)
            return
        La3:
            java.lang.String r0 = "didn't match the target match"
            X.C20441214yg.LJ(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1151720g4o.onMessage$27(X.0g4o, com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public static final void onMessage$28(C1151720g4o c1151720g4o, IMessage iMessage) {
        List<Integer> list;
        User user;
        int i;
        C1139550flB c1139550flB = (C1139550flB) c1151720g4o.l0;
        if (c1139550flB.LIZIZ == EnumC1139760flW.ACTIVE && (iMessage instanceof GiftMessage)) {
            GiftMessage giftMessage = (GiftMessage) iMessage;
            if (!giftMessage.isHistoryMessage && C1133680fbi.LIZIZ(giftMessage) == UserService.getInstance().user().getCurrentUserId()) {
                Gift giftFindGiftById = GiftManager.inst().findGiftById(giftMessage.giftId);
                if ((giftFindGiftById == null && (giftFindGiftById = giftMessage.mGift) == null) || (list = giftFindGiftById.giftVerticalScenarios) == null || !list.contains(39) || giftMessage.LLILZ) {
                    return;
                }
                if ((giftFindGiftById.combo && giftMessage.repeatEnd == 0) || (user = giftMessage.fromUser) == null) {
                    return;
                }
                long id = user.getId();
                if (id == 0) {
                    return;
                }
                C1133690fbj.LIZ.getClass();
                if (C1133690fbj.LJIIIZ(giftMessage)) {
                    i = giftMessage.repeatCount;
                } else {
                    i = giftMessage.comboCount;
                }
                long j = i;
                if (j < 1) {
                    j = 1;
                }
                long j2 = ((long) giftFindGiftById.diamondCount) * j;
                if (j2 <= 0) {
                    return;
                }
                Map<Long, C1139370fkt> map = c1139550flB.LJFF;
                Long lValueOf = Long.valueOf(id);
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                Object c1139370fkt = linkedHashMap.get(lValueOf);
                if (c1139370fkt == null) {
                    c1139370fkt = new C1139370fkt();
                    linkedHashMap.put(lValueOf, c1139370fkt);
                }
                C1139370fkt c1139370fkt2 = (C1139370fkt) c1139370fkt;
                c1139370fkt2.LIZ += j2;
                String nickName = user.getNickName();
                List urls = null;
                if (nickName != null && nickName.length() > 0) {
                    c1139370fkt2.LIZIZ = nickName;
                }
                ImageModel avatarThumb = user.getAvatarThumb();
                if (avatarThumb != null) {
                    urls = avatarThumb.getUrls();
                }
                String strLIZLLL = C1139550flB.LIZLLL(urls);
                if (strLIZLLL.length() > 0) {
                    c1139370fkt2.LIZJ = strLIZLLL;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPowerUpGiftCandidate: +");
                sbLIZ.append(j2);
                sbLIZ.append(" diamonds, uid=");
                sbLIZ.append(id);
                sbLIZ.append(", giftId=");
                sbLIZ.append(giftMessage.giftId);
                sbLIZ.append(", total=");
                sbLIZ.append(c1139370fkt2.LIZ);
                sbLIZ.append(", uniqueSenders=");
                sbLIZ.append(c1139550flB.LJFF.size());
                C1139550flB.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static final void onMessage$29(C1151720g4o c1151720g4o, IMessage iMessage) {
        if (iMessage instanceof PinMessage) {
            C1109010exv c1109010exv = C1109010exv.LIZ;
            long id = ((Room) c1151720g4o.l0).getId();
            C1109020exw c1109020exw = new C1109020exw(((Room) c1151720g4o.l0).getId());
            PinMessage pinMessage = (PinMessage) iMessage;
            c1109020exw.LIZIZ = pinMessage.operator;
            c1109020exw.LIZJ = false;
            c1109020exw.LIZLLL = false;
            c1109020exw.LJFF = C004F.LIZ(pinMessage);
            c1109020exw.LJI = pinMessage;
            C1109010exv.LJFF(c1109010exv, id, c1109020exw);
            return;
        }
        if (!(iMessage instanceof NewPinMessage)) {
            return;
        }
        C1109010exv c1109010exv2 = C1109010exv.LIZ;
        c1109010exv2.getClass();
        PinMessage pinMessageLIZ = C1109010exv.LIZ((NewPinMessage) iMessage);
        long id2 = ((Room) c1151720g4o.l0).getId();
        C1109020exw c1109020exw2 = new C1109020exw(((Room) c1151720g4o.l0).getId());
        c1109020exw2.LIZIZ = pinMessageLIZ.operator;
        c1109020exw2.LIZJ = true;
        c1109020exw2.LIZLLL = false;
        c1109020exw2.LJFF = C004F.LIZ(pinMessageLIZ);
        c1109020exw2.LJI = pinMessageLIZ;
        C1109010exv.LJFF(c1109010exv2, id2, c1109020exw2);
    }

    public static final void onMessage$3(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$4(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$5(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$6(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$7(C1151720g4o c1151720g4o, IMessage iMessage) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) c1151720g4o.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        interfaceC1078490eAh.invoke(iMessage);
    }

    public static final void onMessage$8(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }

    public static final void onMessage$9(C1151720g4o c1151720g4o, IMessage iMessage) {
        ((InterfaceC1078490eAh) c1151720g4o.l0).invoke(iMessage);
    }
}
