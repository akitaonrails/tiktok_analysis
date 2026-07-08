package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleBridgedPunishScoreUpdateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowLeagueScoreChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMatchThemeConfigSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.RankNoticeMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.MatchRankScoreAddedEvent;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchThemeDisplayResource;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchTitleBarConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0031, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0031 {
    public static final void LIZ(LinkMicBattleMessage linkMicBattleMessage, DataChannel dataChannel, Long l, String str) {
        List list;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive punish score update, source=");
        sbLIZ.append(str);
        sbLIZ.append(", currentBattleId=");
        sbLIZ.append(l);
        sbLIZ.append(", messageBattleId=");
        sbLIZ.append(linkMicBattleMessage.battleId);
        C20441214yg.LJIIIZ("MatchPunishScoreDispatch", C2188811AlT.LIZIZ(sbLIZ));
        if (l != null && l.longValue() > 0) {
            if (l.longValue() == linkMicBattleMessage.battleId) {
                MatchThemeDisplayResource matchThemeDisplayResource = linkMicBattleMessage.matchThemeDisplayResource;
                Text text = null;
                rankNoticeMessage = null;
                rankNoticeMessage = null;
                rankNoticeMessage = null;
                RankNoticeMessage rankNoticeMessage = null;
                if (matchThemeDisplayResource == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("skip rank notice build because matchThemeDisplayResource is null, battleId=");
                    sbLIZ2.append(linkMicBattleMessage.battleId);
                    C20441214yg.LJIIIZ("MatchPunishScorePayload", C2188811AlT.LIZIZ(sbLIZ2));
                } else if (!LiveMatchThemeConfigSetting.INSTANCE.isConfiguredTheme(Integer.valueOf(matchThemeDisplayResource.matchTheme))) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("skip rank notice build because theme is not configured match mania, battleId=");
                    sbLIZ3.append(linkMicBattleMessage.battleId);
                    sbLIZ3.append(", theme=");
                    sbLIZ3.append(matchThemeDisplayResource.matchTheme);
                    C20441214yg.LJIIIZ("MatchPunishScorePayload", C2188811AlT.LIZIZ(sbLIZ3));
                } else if (matchThemeDisplayResource.matchTheme != 3) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("skip rank notice build because theme is not match mania, battleId=");
                    sbLIZ4.append(linkMicBattleMessage.battleId);
                    sbLIZ4.append(", theme=");
                    sbLIZ4.append(matchThemeDisplayResource.matchTheme);
                    C20441214yg.LJIIIZ("MatchPunishScorePayload", C2188811AlT.LIZIZ(sbLIZ4));
                } else {
                    MatchTitleBarConfig matchTitleBarConfig = matchThemeDisplayResource.matchTitleBarConfig;
                    if (matchTitleBarConfig == null || (list = matchTitleBarConfig.displayRules) == null) {
                        list = C13BV.INSTANCE;
                    }
                    Text textLIZJ = C0113001f.LIZJ(3, list);
                    Text textLIZJ2 = C0113001f.LIZJ(4, list);
                    boolean zLIZLLL = C0113001f.LIZLLL(textLIZJ);
                    boolean zLIZLLL2 = C0113001f.LIZLLL(textLIZJ2);
                    if (!zLIZLLL && !zLIZLLL2) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("skip rank notice build because filtered punish queue is empty, battleId=");
                        sbLIZ5.append(linkMicBattleMessage.battleId);
                        sbLIZ5.append(", hasStartText=");
                        sbLIZ5.append(zLIZLLL);
                        sbLIZ5.append(", hasOngoingText=");
                        sbLIZ5.append(zLIZLLL2);
                        C20441214yg.LJIIIZ("MatchPunishScorePayload", C2188811AlT.LIZIZ(sbLIZ5));
                    } else {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("build rank notice success, battleId=");
                        sbLIZ6.append(linkMicBattleMessage.battleId);
                        sbLIZ6.append(", hasStartText=");
                        sbLIZ6.append(zLIZLLL);
                        sbLIZ6.append(", hasOngoingText=");
                        sbLIZ6.append(zLIZLLL2);
                        C20441214yg.LJIIIZ("MatchPunishScorePayload", C2188811AlT.LIZIZ(sbLIZ6));
                        RankNoticeMessage rankNoticeMessage2 = new RankNoticeMessage();
                        if (!Boolean.valueOf(zLIZLLL).booleanValue()) {
                            textLIZJ = null;
                        }
                        rankNoticeMessage2.contentText = textLIZJ;
                        if (Boolean.valueOf(zLIZLLL2).booleanValue()) {
                            text = textLIZJ2;
                        }
                        rankNoticeMessage2.affiliatedContentText = text;
                        rankNoticeMessage = rankNoticeMessage2;
                    }
                }
                if (rankNoticeMessage == null) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("skip punish score update because rank notice conversion is null, source=");
                    sbLIZ7.append(str);
                    sbLIZ7.append(", battleId=");
                    sbLIZ7.append(linkMicBattleMessage.battleId);
                    C20441214yg.LJIIIZ("MatchPunishScoreDispatch", C2188811AlT.LIZIZ(sbLIZ7));
                    return;
                }
                List<Text> listLIZIZ = C0113001f.LIZIZ(rankNoticeMessage);
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("post league score gating and MatchRankScoreAddedEvent, source=");
                sbLIZ8.append(str);
                sbLIZ8.append(", battleId=");
                sbLIZ8.append(linkMicBattleMessage.battleId);
                sbLIZ8.append(", hasStartText=");
                boolean z2 = true;
                if (rankNoticeMessage.contentText != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ8.append(z);
                sbLIZ8.append(", hasOngoingText=");
                if (rankNoticeMessage.affiliatedContentText == null) {
                    z2 = false;
                }
                sbLIZ8.append(z2);
                sbLIZ8.append(", filteredQueueSize=");
                sbLIZ8.append(((ArrayList) listLIZIZ).size());
                C20441214yg.LJIIIZ("MatchPunishScoreDispatch", C2188811AlT.LIZIZ(sbLIZ8));
                if (dataChannel != null) {
                    dataChannel.zW(BattleBridgedPunishScoreUpdateChannel.class, Boolean.TRUE);
                    dataChannel.zW(BattleShowLeagueScoreChannel.class, Boolean.FALSE);
                    dataChannel.zW(MatchRankScoreAddedEvent.class, rankNoticeMessage);
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("skip punish score update because battleId mismatch, source=");
        sbLIZ9.append(str);
        sbLIZ9.append(", currentBattleId=");
        sbLIZ9.append(l);
        sbLIZ9.append(", messageBattleId=");
        sbLIZ9.append(linkMicBattleMessage.battleId);
        C20441214yg.LJIIL("MatchPunishScoreDispatch", C2188811AlT.LIZIZ(sbLIZ9));
    }
}
