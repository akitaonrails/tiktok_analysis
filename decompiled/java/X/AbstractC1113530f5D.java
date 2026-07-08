package X;

import Y.AfS6S0100100_17;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.LiveExtendScreenCloseEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.goal.model.PinRequestParams;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS10S0100200_17;

/* JADX INFO: renamed from: X.0f5D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1113530f5D {
    public final View LIZ;
    public int LIZIZ;

    public CharSequence LIZJ(CharSequence charSequence, AbstractC1110800f0o<?> abstractC1110800f0o) {
        return charSequence;
    }

    public abstract boolean LJII(AbstractC1110800f0o<?> abstractC1110800f0o, List<Object> list);

    public void LJIIIIZZ() {
    }

    public AbstractC1113530f5D(View view) {
        this.LIZ = view;
    }

    public static String LIZLLL(boolean z) {
        if (z) {
            return C497740JfY.LJIJI(2131854907);
        }
        return C497740JfY.LJIJI(2131854906);
    }

    public static CharSequence LJ(Text text) {
        String str;
        if (text == null || (str = text.defaultPattern) == null) {
            str = "";
        }
        return C1133830fbx.LJIILIIL(text, str);
    }

    public final void LIZ(PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic, PublicAreaMessageCommon.CreatorSuccessInfo.Topic.ActionButton actionButton, AbstractC1110790f0n abstractC1110790f0n, Context context, boolean z) {
        long jLongValue;
        Boolean bool;
        Long l;
        AbstractC1110800f0o abstractC1110800f0o;
        int i = actionButton.buttonType;
        Boolean boolValueOf = null;
        if (i != 1) {
            if (i != 12) {
                if (i != 14) {
                    if (i != 21) {
                        if (i != 17) {
                            if (i != 18) {
                                DataChannel dataChannel = abstractC1110790f0n.LLIIIILZ().LJIIIZ;
                                if (dataChannel != null) {
                                    dataChannel.FQ2(LiveExtendScreenCloseEvent.class);
                                }
                                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, actionButton.buttonSchema);
                                return;
                            }
                            DataChannel dataChannel2 = abstractC1110790f0n.LLIIIILZ().LJIIIZ;
                            if (dataChannel2 == null) {
                                return;
                            }
                            dataChannel2.LC0(LinkInRoomAnchorInviteGuestEvent.class, new C919670a2X(abstractC1110790f0n.getUser(), "creator_crm_topic"));
                            return;
                        }
                        if (!(abstractC1110790f0n instanceof AbstractC1110800f0o) || (abstractC1110800f0o = (AbstractC1110800f0o) abstractC1110790f0n) == null) {
                            return;
                        }
                        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).ol2(abstractC1110800f0o.LLIIIILZ(), abstractC1110800f0o.LJIL);
                        return;
                    }
                    long jLLJJIII = abstractC1110790f0n.LLJJIII();
                    long j = abstractC1110790f0n.LIZ;
                    C919670a2X c919670a2X = new C919670a2X(abstractC1110790f0n.getUser(), "comment_invitation_guide");
                    c919670a2X.LJI = new AwS10S0100200_17(topic, jLLJJIII, j, 2);
                    DataChannel dataChannel3 = abstractC1110790f0n.LLIIIILZ().LJIIIZ;
                    if (dataChannel3 == null) {
                        return;
                    }
                    dataChannel3.LC0(LinkInRoomAnchorInviteGuestEvent.class, c919670a2X);
                    return;
                }
                PinRequestParams pinRequestParams = new PinRequestParams();
                try {
                    Uri uri = UriProtector.parse(actionButton.buttonSchema);
                    if (uri == null) {
                        return;
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "goal_id");
                    String str = "";
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "subgoal_id");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                        str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                    }
                    try {
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
                            pinRequestParams.goalId = CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        }
                        if (pinRequestParams.goalId <= 0) {
                            return;
                        }
                        if (str.length() > 0) {
                            pinRequestParams.subGoalId = CastLongProtector.parseLong(str);
                        }
                        pinRequestParams.type = 1;
                        DataChannel dataChannel4 = abstractC1110790f0n.LLIIIILZ().LJIIIZ;
                        if (dataChannel4 != null && (l = (Long) dataChannel4.gg0(C751340Tdc.class)) != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        pinRequestParams.roomId = jLongValue;
                        if (jLongValue != 0 && dataChannel4 != null && (bool = (Boolean) dataChannel4.gg0(UserIsAnchorChannel.class)) != null && bool.booleanValue()) {
                            DataChannel dataChannel5 = abstractC1110790f0n.LLIIIILZ().LJIIIZ;
                            if (dataChannel5 != null) {
                                dataChannel5.FQ2(LiveExtendScreenCloseEvent.class);
                            }
                            GiftService.LLILLJJLI.pinGoal(pinRequestParams);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJIIIZ("CRMLabel", "parse schema failed");
                    return;
                }
            }
            DataChannel dataChannel6 = abstractC1110790f0n.LLIIIILZ().LJIIIZ;
            if (dataChannel6 != null) {
                dataChannel6.FQ2(LiveExtendScreenCloseEvent.class);
            }
            GiftService.LLILLJJLI.showViewerWishesSettingPage(abstractC1110790f0n.LLIIIILZ().LJIIIZ, new C1AI6(true, EnumC785670Urt.OTHER, "creator_crm_topic", null, null, null, null, null, 2036), false);
            return;
        }
        long jLLIIJI = abstractC1110790f0n.LLIIJI();
        long jLLJJIII2 = abstractC1110790f0n.LLJJIII();
        User user = abstractC1110790f0n.getUser();
        if (user != null) {
            boolValueOf = Boolean.valueOf(user.isFollowing);
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C1113650f5P c1113650f5P = new C1113650f5P();
            c1113650f5P.LIZIZ(jLLIIJI);
            c1113650f5P.LJ(jLLJJIII2);
            c1113650f5P.getClass();
            interfaceC500940JkiUser.LJI(new C1812120xFy(c1113650f5P)).LJJLL(new AfS6S0100100_17(jLLJJIII2, abstractC1110790f0n, 19), new C09JN() { // from class: X.0f5J
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BaseSubviewViewHolder@84e1.actionButtonClick$5");
                    C20441214yg.LJFF("SubviewViewHolder", "onBindView: unFollow failed", (Throwable) obj);
                    C1C7U.LIZIZ("BaseSubviewViewHolder@84e1.actionButtonClick$5");
                }
            });
            if (z) {
                LJFF(this, abstractC1110790f0n, topic, "tag_cta", false, null, 24);
                C1113520f5C.LIZIZ(abstractC1110790f0n.LLIIJI(), abstractC1110790f0n.LLIIIILZ().LJIIIZ, false);
                return;
            } else {
                C1113520f5C.LIZIZ(abstractC1110790f0n.LLIIJI(), abstractC1110790f0n.LLIIIILZ().LJIIIZ, false);
                return;
            }
        }
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        C1099430eiT c1099430eiT = new C1099430eiT();
        c1099430eiT.LIZIZ(jLLIIJI);
        c1099430eiT.LJ(jLLJJIII2);
        interfaceC500940JkiUser2.LIZ(c1099430eiT.LIZJ()).LJJLL(new AfS6S0100100_17(jLLJJIII2, abstractC1110790f0n, 20), new C09JN() { // from class: X.0f5K
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("BaseSubviewViewHolder@84e1.actionButtonClick$7");
                C20441214yg.LJFF("SubviewViewHolder", "onBindView: follow failed", (Throwable) obj);
                C1C7U.LIZIZ("BaseSubviewViewHolder@84e1.actionButtonClick$7");
            }
        });
        if (z) {
            LJFF(this, abstractC1110790f0n, topic, "tag_cta", false, null, 24);
            C1113520f5C.LIZIZ(abstractC1110790f0n.LLIIJI(), abstractC1110790f0n.LLIIIILZ().LJIIIZ, true);
        } else {
            C1113520f5C.LIZIZ(abstractC1110790f0n.LLIIJI(), abstractC1110790f0n.LLIIIILZ().LJIIIZ, true);
        }
    }

    public static void LJI(AbstractC1113530f5D abstractC1113530f5D, AbstractC1110790f0n abstractC1110790f0n, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic, boolean z, Map map, int i) {
        boolean z2 = z;
        PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic2 = topic;
        Map map2 = null;
        if ((i & 2) != 0) {
            topic2 = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) == 0) {
            map2 = map;
        }
        abstractC1113530f5D.getClass();
        if (abstractC1110790f0n.LJIILJJIL.LIZJ == 1) {
            C1113520f5C.LIZJ("livesdk_companion_tool_label_show", abstractC1110790f0n.LLIIIILZ().LJIIIZ, abstractC1110790f0n.getUser(), C1113520f5C.LIZ(abstractC1110790f0n), topic2, abstractC1110790f0n.LLII(), null, z2, map2);
        }
    }

    public static void LJFF(AbstractC1113530f5D abstractC1113530f5D, AbstractC1110790f0n abstractC1110790f0n, PublicAreaMessageCommon.CreatorSuccessInfo.Topic topic, String str, boolean z, Map map, int i) {
        Map map2 = map;
        boolean z2 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            map2 = null;
        }
        abstractC1113530f5D.getClass();
        C1113520f5C.LIZJ("livesdk_companion_tool_label_click", abstractC1110790f0n.LLIIIILZ().LJIIIZ, abstractC1110790f0n.getUser(), C1113520f5C.LIZ(abstractC1110790f0n), topic, abstractC1110790f0n.LLII(), str, z2, map2);
    }
}
