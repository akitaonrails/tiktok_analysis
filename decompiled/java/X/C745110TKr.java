package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.LiveNewAiSummaryConfig;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.PreviewGameRewardsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessingWidget;
import com.ss.android.ugc.aweme.feed.model.live.BoardUsingInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveAiSummary;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0TKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745110TKr {
    public static EnumC745120TKs LIZ(C1ACA c1aca) {
        LiveRoomStruct liveRoomStruct;
        LiveAiSummary liveAiSummary;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        EnumC745120TKs enumC745120TKs;
        LiveRoomStruct liveRoomStruct4;
        BoardUsingInfo boardUsingInfo;
        LiveRoomStruct liveRoomStruct5;
        Long lValueOf = null;
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null && (liveAiSummary = liveRoomStruct.getLiveAiSummary()) != null) {
            List<String> list = liveAiSummary.aiSummaryList;
            int i = 0;
            if (list != null && !list.isEmpty()) {
                if (C999380c76.LIZ(c1aca)) {
                    return EnumC745120TKs.PROGRAMMED_LIVE;
                }
                LiveNewAiSummaryConfig liveNewAiSummaryConfig = C0TL7.LIZ;
                if (c1aca != null) {
                    liveRoomStruct2 = c1aca.LIZJ;
                } else {
                    liveRoomStruct2 = null;
                }
                if (!C0TL7.LIZ(liveRoomStruct2).enable) {
                    return EnumC745120TKs.NOT_HIT_EXP;
                }
                if (c1aca != null && (liveRoomStruct5 = c1aca.LIZJ) != null && liveRoomStruct5.hasCommerceGoods) {
                    return EnumC745120TKs.EC_ROOM;
                }
                if (c1aca != null && (liveRoomStruct4 = c1aca.LIZJ) != null && (boardUsingInfo = liveRoomStruct4.boardUsingInfo) != null && boardUsingInfo.usingBoard == 1) {
                    return EnumC745120TKs.HAS_BOARD;
                }
                PreviewGameGuessingWidget.LLJJIJIL.getClass();
                if (!C2175451ABz.LIZ(c1aca)) {
                    PreviewGameRewardsWidget.LLJJJIL.getClass();
                    if (!C2175421ABw.LIZ(c1aca)) {
                        if (C745130TKt.LIZ().enable) {
                            int i2 = C745130TKt.LIZ().maxShowTimes;
                            try {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long j = C745100TKq.LJ().getLong(C745100TKq.LIZIZ(), 0L);
                                if (j > 0 && jCurrentTimeMillis < j) {
                                    List listLIZLLL = C745100TKq.LIZLLL();
                                    if (listLIZLLL != null && ((ArrayList) listLIZLLL).size() > 0) {
                                        enumC745120TKs = EnumC745120TKs.FREQUENCY_EXIT_24H;
                                    } else {
                                        enumC745120TKs = EnumC745120TKs.FREQUENCY_EXIT_14D;
                                    }
                                } else {
                                    List listLIZ = C745100TKq.LIZ();
                                    if (listLIZ != null) {
                                        Iterator it2 = ((ArrayList) listLIZ).iterator();
                                        while (it2.hasNext()) {
                                            if (jCurrentTimeMillis - CastLongProtector.parseLong((String) it2.next()) <= 86400000) {
                                                i++;
                                            }
                                            if (i >= i2) {
                                                enumC745120TKs = EnumC745120TKs.FREQUENCY_CONTROL;
                                            }
                                        }
                                    }
                                }
                                if (enumC745120TKs != null) {
                                    return enumC745120TKs;
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        if (c1aca != null && (liveRoomStruct3 = c1aca.LIZJ) != null) {
                            lValueOf = Long.valueOf(liveRoomStruct3.id);
                        }
                        return (EnumC745120TKs) ((LinkedHashMap) C745040TKk.LIZ).get(lValueOf);
                    }
                }
                return EnumC745120TKs.GAME_ROOM;
            }
        }
        return EnumC745120TKs.AI_SUMMARY_NOT_FETCHED;
    }
}
