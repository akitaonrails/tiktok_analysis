package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VOLightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.strategybridge.LightInteractionMetaData;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva.MessageAfterFollowBackKeva;
import com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.LightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Z8Q, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z8Q implements InterfaceC884950Ynd {
    public long LJ;
    public long LJFF;
    public final C01GW LIZ = C452501pT.LIZIZ(new C894760Z8g());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C894740Z8e());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C882660Yjw());
    public final C879040Ye6 LIZLLL = new C879040Ye6(new AwS558S0100000_14(this, 1797));
    public final long LJI = 60000;

    @Override // X.InterfaceC884950Ynd
    public final void LIZJ() {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (C881500Yi4.LJ() != null) {
            AbstractC883730Ylf.LJJIFFI(Collections.singletonList(this.LIZLLL));
        }
        LIZLLL().clear();
        LJFF().clear();
    }

    public final ConcurrentHashMap<LightInteractionMetaData, VOLightInteractionEntryConf> LIZLLL() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    public final long LJ() {
        INetwork iNetwork = (INetwork) PluggableExtentionKt.pluggableSpi$default(INetwork.class, false, false, false, 14, null);
        long jLIZIZ = iNetwork != null ? iNetwork.LIZIZ() : System.currentTimeMillis();
        long j = this.LJFF;
        if (jLIZIZ - j < this.LJI) {
            return j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        this.LJFF = jLIZIZ;
        return jLIZIZ / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public final ConcurrentHashMap<InterfaceC1491305sd, Boolean> LJFF() {
        return (ConcurrentHashMap) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC884950Ynd
    public final void init() {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        if (C881500Yi4.LJ() != null) {
            AbstractC883730Ylf.LJJI(Collections.singletonList(this.LIZLLL));
        }
    }

    public final VOLightInteractionEntryConf LIZIZ(LightInteractionMetaData lightInteractionMetaData) {
        if (LIZLLL().keySet().contains(lightInteractionMetaData)) {
            return LIZLLL().get(lightInteractionMetaData);
        }
        ILightInteractionPlatformService iLightInteractionPlatformService = (ILightInteractionPlatformService) this.LIZ.getValue();
        LightInteractionEntryConf first = iLightInteractionPlatformService.LJJIJIIJI(lightInteractionMetaData, iLightInteractionPlatformService.LJ()).getFirst();
        if (first == null) {
            return null;
        }
        return new VOLightInteractionEntryConf(first.getIconUrl(), first.getLightModeUrl(), first.getDarkModeUrl(), first.getText(), first.getInteractionName(), first.getInboxPreview());
    }

    public final void LJI(LightInteractionMetaData lightInteractionMetaData, VOLightInteractionEntryConf vOLightInteractionEntryConf) {
        Iterator<T> it2 = LIZLLL().keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((LightInteractionMetaData) next).conversationId, lightInteractionMetaData.conversationId)) {
                if (next != null) {
                    LIZLLL().remove(next);
                }
            }
        }
        if (vOLightInteractionEntryConf != null) {
            LIZLLL().put(lightInteractionMetaData, vOLightInteractionEntryConf);
        } else {
            LIZLLL().remove(lightInteractionMetaData);
        }
    }

    public final void LJII(VOLightInteractionEntryConf vOLightInteractionEntryConf, String str) {
        String str2;
        if (vOLightInteractionEntryConf != null && (str2 = vOLightInteractionEntryConf.interactionName) != null && u.LJJIIJZLJL(str2, "say_hi", false)) {
            ((ILightInteractionPlatformService) this.LIZ.getValue()).LJJLIIJ(System.currentTimeMillis(), str);
        }
    }

    @Override // X.InterfaceC884950Ynd
    public final void LIZ(InterfaceC884440Ymo interfaceC884440Ymo, InterfaceC879010Ye3 interfaceC879010Ye3, boolean z) {
        boolean zK;
        long j;
        boolean zK2;
        long j2;
        String strValueOf;
        boolean zLJFF;
        long jLJ;
        MessageAfterFollowBackKeva messageAfterFollowBackKevaLIZ;
        MessageAfterFollowBackKeva messageAfterFollowBackKevaLIZ2;
        if (z) {
            return;
        }
        if (interfaceC884440Ymo instanceof C0Z8N) {
            C0Z8N c0z8n = (C0Z8N) interfaceC884440Ymo;
            String sessionId = c0z8n.getExtra().getSessionId();
            C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            c0ysq.getClass();
            C0Y8T c0y8tLIZ = C0YSQ.LIZ(c0ym2).LIZ(sessionId);
            if (c0y8tLIZ == null) {
                return;
            }
            IMUser imUser = c0z8n.getExtra().getImUser();
            C429270GsP activityStatusViewData = c0z8n.getActivityStatusViewData();
            Boolean bool = LJFF().get(c0z8n.getKey());
            if (bool != null) {
                zK2 = bool.booleanValue();
            } else {
                IStreakService.LJJIIZ.getClass();
                IStreakService iStreakServiceLIZ = C06LY.LIZ();
                EnumC1578206Fw enumC1578206Fw = EnumC1578206Fw.CHAT_LIST;
                c0y8tLIZ.getConversationId();
                zK2 = iStreakServiceLIZ.k(enumC1578206Fw);
            }
            LJFF().put(c0z8n.getKey(), Boolean.valueOf(zK2));
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j3 = this.LJ;
            if (jCurrentTimeMillis - j3 < this.LJI) {
                j2 = j3 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                this.LJ = jCurrentTimeMillis;
                j2 = jCurrentTimeMillis / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            long jLJ2 = LJ();
            if (imUser == null || (strValueOf = imUser.getUid()) == null) {
                strValueOf = String.valueOf(C0YNP.LJII(c0y8tLIZ.getConversationId()));
            }
            IIMLightInteractService iIMLightInteractService = (IIMLightInteractService) PluggableExtentionKt.pluggableSpi$default(IIMLightInteractService.class, false, false, false, 14, null);
            if (iIMLightInteractService != null && (messageAfterFollowBackKevaLIZ2 = iIMLightInteractService.LIZ()) != null) {
                zLJFF = messageAfterFollowBackKevaLIZ2.LJFF(null, strValueOf);
            } else {
                zLJFF = false;
            }
            IIMLightInteractService iIMLightInteractService2 = (IIMLightInteractService) PluggableExtentionKt.pluggableSpi$default(IIMLightInteractService.class, false, false, false, 14, null);
            if (iIMLightInteractService2 != null && (messageAfterFollowBackKevaLIZ = iIMLightInteractService2.LIZ()) != null) {
                jLJ = messageAfterFollowBackKevaLIZ.LJ(null, strValueOf);
            } else {
                jLJ = -1;
            }
            long jLJJLIL = ((ILightInteractionPlatformService) this.LIZ.getValue()).LJJLIL(c0y8tLIZ.getConversationId());
            if (jLJ >= jLJJLIL) {
                jLJ = jLJJLIL;
            }
            C0Z8Z c0z8zLJFF = ((InterfaceC894810Z8l) this.LIZ.getValue()).LJFF();
            c0z8zLJFF.LIZJ = "inbox_dm_cell";
            c0z8zLJFF.LIZJ(c0y8tLIZ);
            c0z8zLJFF.LJIILL = Long.valueOf(jLJ);
            c0z8zLJFF.LIZ = zLJFF;
            c0z8zLJFF.LJII(C429290GsR.LIZ(activityStatusViewData) ? 1 : 0);
            c0z8zLJFF.LJIJI = zK2;
            c0z8zLJFF.LJJ = j2;
            c0z8zLJFF.LJJI = jLJ2;
            C869590Y9l lastShowMessage = c0y8tLIZ.getLastShowMessage();
            if (lastShowMessage != null) {
                c0z8zLJFF.LJFF(lastShowMessage);
            }
            if (imUser != null) {
                c0z8zLJFF.LIZIZ(imUser);
            }
            LightInteractionMetaData lightInteractionMetaDataBuild = c0z8zLJFF.build();
            VOLightInteractionEntryConf vOLightInteractionEntryConfLIZIZ = LIZIZ(lightInteractionMetaDataBuild);
            LJII(vOLightInteractionEntryConfLIZIZ, c0z8n.getExtra().getSessionId());
            LJI(lightInteractionMetaDataBuild, vOLightInteractionEntryConfLIZIZ);
            c0z8n.setHasStreakReminderInlineMsg(zK2);
            c0z8n.setLightInteractionEntryConf(vOLightInteractionEntryConfLIZIZ);
            return;
        }
        if (interfaceC884440Ymo instanceof C0Z8O) {
            C0Z8O c0z8o = (C0Z8O) interfaceC884440Ymo;
            String sessionId2 = c0z8o.getExtra().getSessionId();
            C0YSQ c0ysq2 = InterfaceC876950Yaj.LIZ;
            C0YM2 c0ym22 = C0YM2.TIKTOK_SOCIAL_IM;
            c0ysq2.getClass();
            C0Y8T c0y8tLIZ2 = C0YSQ.LIZ(c0ym22).LIZ(sessionId2);
            if (c0y8tLIZ2 == null) {
                return;
            }
            Boolean bool2 = LJFF().get(c0z8o.getKey());
            if (bool2 != null) {
                zK = bool2.booleanValue();
            } else {
                IStreakService.LJJIIZ.getClass();
                IStreakService iStreakServiceLIZ2 = C06LY.LIZ();
                EnumC1578206Fw enumC1578206Fw2 = EnumC1578206Fw.CHAT_LIST;
                c0y8tLIZ2.getConversationId();
                zK = iStreakServiceLIZ2.k(enumC1578206Fw2);
            }
            LJFF().put(c0z8o.getKey(), Boolean.valueOf(zK));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j4 = this.LJ;
            if (jCurrentTimeMillis2 - j4 < this.LJI) {
                j = j4 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                this.LJ = jCurrentTimeMillis2;
                j = jCurrentTimeMillis2 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            LightInteractionMetaData lightInteractionMetaDataLIZ = C0Z8Y.LIZ("inbox_dm_cell", c0y8tLIZ2, null, Long.valueOf(((ILightInteractionPlatformService) this.LIZ.getValue()).LJJLIL(c0y8tLIZ2.getConversationId())), c0y8tLIZ2.getLastShowMessage(), j, Integer.valueOf(C429290GsR.LIZ(c0z8o.getActivityStatusViewData()) ? 1 : 0), zK, 0, LJ(), 13836);
            VOLightInteractionEntryConf vOLightInteractionEntryConfLIZIZ2 = LIZIZ(lightInteractionMetaDataLIZ);
            LJII(vOLightInteractionEntryConfLIZIZ2, c0z8o.getExtra().getSessionId());
            LJI(lightInteractionMetaDataLIZ, vOLightInteractionEntryConfLIZIZ2);
            c0z8o.setHasStreakReminderInlineMsg(zK);
            c0z8o.setLightInteractionEntryConf(vOLightInteractionEntryConfLIZIZ2);
        }
    }
}
