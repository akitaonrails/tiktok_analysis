package X;

import Y.ACListenerS149S0100000_14;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z9H, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z9H extends C1619110sEf implements InterfaceC19330810jy {
    public static InterfaceC539120LCk LLILLL;
    public static boolean LLILZIL;
    public static final C0Z9H LL = new C0Z9H();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C876940Yai());
    public static final int[] LLILZ = {1009};

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
    }

    public static final ILightInteractionPlatformService LJIILL() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return LLILZ;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        Long lValueOf;
        LLILZIL = false;
        InterfaceC892560Yzu interfaceC892560YzuLIZJ = LJIILL().LIZJ();
        if (innerPushMessage != null) {
            lValueOf = Long.valueOf(innerPushMessage.getId());
        } else {
            lValueOf = null;
        }
        interfaceC892560YzuLIZJ.LIZIZ(String.valueOf(lValueOf), ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI(), "inner_push", null, "inner_streak_countdown_reminder", LJIILIIL(innerPushMessage), "spark");
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        C876900Yae c876900Yae = C876900Yae.LIZ;
        if (C876900Yae.LIZ() != 1) {
            List listLIZJ = C876900Yae.LIZJ(null);
            if (((ArrayList) listLIZJ).size() != 1 || !Intrinsics.LJFF(ListProtector.get(listLIZJ, 0), "im_page")) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        Object obj;
        String str;
        Integer numS;
        Long lValueOf;
        long jLongValue;
        StreakData streakDataR;
        Map<String, Object> extrasMap = innerPushMessage.getExtrasMap();
        Long lValueOf2 = null;
        if (extrasMap != null) {
            obj = extrasMap.get("dm_streak_remind_conv_id");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null && str.length() > 0) {
            IStreakService.LJJIIZ.getClass();
            boolean zD = C06LY.LIZ().D(str);
            IStreakService iStreakService = (IStreakService) PluggableExtentionKt.pluggableSpi$default(IStreakService.class, false, false, false, 14, null);
            if (iStreakService != null) {
                numS = iStreakService.S(str);
            } else {
                numS = null;
            }
            if (zD) {
                if (numS != null) {
                    int iIntValue = numS.intValue();
                    IStreakService iStreakService2 = (IStreakService) PluggableExtentionKt.pluggableSpiForReal(IStreakService.class);
                    if (iStreakService2 != null && (streakDataR = iStreakService2.r(str, false)) != null) {
                        lValueOf = Long.valueOf(streakDataR.activeBefore);
                        lValueOf2 = Long.valueOf(streakDataR.endAt);
                    } else {
                        lValueOf = null;
                    }
                    int iLIZ = C879390Yef.LIZ(str);
                    long createTime = innerPushMessage.getCreateTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    long jLongValue2 = 0;
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (lValueOf2 != null) {
                        jLongValue2 = lValueOf2.longValue();
                    }
                    C0I0B.LJFF.LIZIZ();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("conversation_type", String.valueOf(iLIZ));
                    linkedHashMap.put("message_type", String.valueOf(iIntValue));
                    linkedHashMap.put("create_time", String.valueOf(createTime));
                    linkedHashMap.put("active_before", String.valueOf(jLongValue));
                    linkedHashMap.put("end_at", String.valueOf(jLongValue2));
                    linkedHashMap.put("active_time_difference", String.valueOf(createTime - jLongValue));
                    linkedHashMap.put("end_time_difference", String.valueOf(jLongValue2 - createTime));
                    C20684815ws.LJIILLIIL("ttsocial_skip_show_inner_reminder", linkedHashMap);
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final String LJIILIIL(InnerPushMessage innerPushMessage) {
        Object obj;
        String str;
        Map<String, Object> extrasMap;
        Boolean boolValueOf = null;
        if (innerPushMessage != null && (extrasMap = innerPushMessage.getExtrasMap()) != null) {
            obj = extrasMap.get("dm_streak_remind_conv_id");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || (str = (String) obj) == null || str.length() <= 0) {
            str = null;
        }
        long jLJII = C0YNP.LJII(str);
        if (jLJII == -1) {
            return null;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(new C595710NYb(String.valueOf(jLJII)));
        if (c595660NXwLIZIZ != null) {
            boolValueOf = Boolean.valueOf(C896480ZEw.LIZJ(c595660NXwLIZIZ));
        }
        return LJIILL().LJJLIIIJLLLLLLLZ(boolValueOf);
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        Object obj;
        String str;
        InnerPushUITemplate uiTemplate;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        Map<String, Object> extrasMap;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("interceptInnerPushClick, area = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        Activity activityLIZ = null;
        if (innerPushMessage != null && (extrasMap = innerPushMessage.getExtrasMap()) != null) {
            obj = extrasMap.get("dm_streak_remind_conv_id");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null && str.length() > 0) {
            ((IIMChatRoomService) LLILLJJLI.getValue()).LIZLLL();
            if (i != 3) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                    activityLIZ = C1388190mED.LIZ(activityLIZIZ2);
                }
                C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(LJIILJJIL(this, activityLIZ, str, false), null);
                C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", i);
                InterfaceC539120LCk interfaceC539120LCk = LLILLL;
                if (interfaceC539120LCk != null) {
                    interfaceC539120LCk.LIZIZ("DM push click", null, true);
                }
            } else if (LLILZIL) {
                AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                if (abstractC1387200mCcLIZIZ2 != null && (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) != null) {
                    activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                }
                C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(LJIILJJIL(this, activityLIZ, str, true), null);
                InterfaceC539120LCk interfaceC539120LCk2 = LLILLL;
                if (interfaceC539120LCk2 != null) {
                    interfaceC539120LCk2.LIZIZ("DM push click", null, true);
                    return true;
                }
            } else {
                if (innerPushMessage != null && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
                    uiTemplate.setRightType(3);
                    Context context = C1383370m6R.LIZ;
                    uiTemplate.setRightBtnText(context.getString(2131830941));
                    uiTemplate.setRightImageUrl(null);
                    uiTemplate.setRightImageResId(0);
                    uiTemplate.setRightImageDrawable(null);
                    uiTemplate.setRightImageHeight(0);
                    uiTemplate.setRightImageWidth(0);
                    uiTemplate.setRightImageRadius(0);
                    uiTemplate.setGlobalSchemaUrl(uiTemplate.rightSchemaUrl);
                    uiTemplate.setContent(context.getString(2131832101));
                    LLILZIL = true;
                    InterfaceC539120LCk interfaceC539120LCk3 = LLILLL;
                    if (interfaceC539120LCk3 != null) {
                        C539110LCj.LIZIZ(interfaceC539120LCk3, innerPushMessage, new int[]{3, 2}, false, 12);
                    }
                }
                LJIILL().LJIJI(str, false);
                LJIILL().LIZJ().LJ(((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI(), "inner_push", null, "inner_streak_countdown_reminder", LJIILIIL(innerPushMessage), "spark");
                if (innerPushMessage != null) {
                    C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", 3);
                    return true;
                }
            }
            return true;
        }
        InterfaceC539120LCk interfaceC539120LCk4 = LLILLL;
        if (interfaceC539120LCk4 != null) {
            interfaceC539120LCk4.LIZIZ("DM push click", null, true);
        }
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        String str;
        LLILLL = c20663515tR;
        if (innerPushMessage == null || !LJIILL().LJJI().LJIJJ(innerPushMessage)) {
            return null;
        }
        InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
        String str2 = "";
        if ((uiTemplate2 == null || (str = uiTemplate2.rightSchemaUrl) == null) && ((uiTemplate = innerPushMessage.getUiTemplate()) == null || (str = uiTemplate.globalSchemaUrl) == null)) {
            str = "";
        }
        C0Z9K c0z9kLJJI = LJIILL().LJJI();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "inner_push");
        String strLJJJJZI = LJIILL().LJJI().LJJJJZI(str);
        if (strLJJJJZI == null) {
            strLJJJJZI = "";
        }
        pairArr[1] = new Pair("enter_method", strLJJJJZI);
        String label = innerPushMessage.getLabel();
        if (label != null) {
            str2 = label;
        }
        pairArr[2] = new Pair("push_label", str2);
        pairArr[3] = new Pair("light_interaction_enter_from", ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI());
        pairArr[4] = new Pair("light_interaction_enter_method", EnumC1908380zlE.INNER_PUSH.getValue());
        return c0z9kLJJI.LJIIJJI(innerPushMessage, null, false, C2097608Jq.LJIIIIZZ(pairArr), new ACListenerS149S0100000_14(innerPushMessage, 84), new AwS450S0200000_14(c20663515tR, innerPushMessage, 21));
    }

    public static EnterChatParams LJIILJJIL(C0Z9H c0z9h, Activity activity, String str, boolean z) {
        EnterChatParams enterChatParams;
        String conversationId;
        String strLJIIJ;
        c0z9h.getClass();
        long jLJII = C0YNP.LJII(str);
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        boolean zLIZJ = false;
        if (c0y8tLIZ != null && c0y8tLIZ.isSingleChat()) {
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String strValueOf = String.valueOf(jLJII);
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null) {
                strLJIIJ = iIMContactUtilServiceLIZ.LJIIJ(str);
            } else {
                strLJIIJ = null;
            }
            enterChatParams = new EnterChatParams((Context) activity, c1bgsLJ.LIZLLL(strValueOf, strLJIIJ, "im_nudge_streak"));
        } else {
            if (c0y8tLIZ == null || (conversationId = c0y8tLIZ.getConversationId()) == null) {
                conversationId = "";
            }
            enterChatParams = new EnterChatParams(activity, 3, conversationId);
        }
        enterChatParams.setEnterFromForMob("inner_push");
        enterChatParams.setEnterMethodForMob("inner_streak_countdown_reminder");
        enterChatParams.setFullScreenByDefault(!z);
        enterChatParams.setShowKeyBoardByDefault(z);
        if (c0y8tLIZ != null) {
            zLIZJ = C879390Yef.LIZJ(c0y8tLIZ);
        }
        enterChatParams.setTCM(zLIZJ);
        enterChatParams.setQuickChat(true);
        return enterChatParams;
    }
}
