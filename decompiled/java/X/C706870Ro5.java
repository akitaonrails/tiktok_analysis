package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ab.FeedSpecialShapedCardExtraTrackConfigModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ro5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C706870Ro5 {
    public static final ConcurrentHashMap<String, Pair<Integer, Integer>> LIZ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<String> LIZIZ = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public static volatile int LIZLLL;
    public static volatile boolean LJ;

    public static void LIZ(final Aweme aweme, final String str, final Map map) {
        FeedSpecialShapedCardExtraTrackConfigModel feedSpecialShapedCardExtraTrackConfigModelLIZIZ;
        final String aid;
        FeedSpecialShapedCardExtraTrackConfigModel feedSpecialShapedCardExtraTrackConfigModelLIZIZ2 = C706880Ro6.LIZIZ();
        if (feedSpecialShapedCardExtraTrackConfigModelLIZIZ2 != null && Intrinsics.LJFF(feedSpecialShapedCardExtraTrackConfigModelLIZIZ2.enable, Boolean.TRUE) && (feedSpecialShapedCardExtraTrackConfigModelLIZIZ = C706880Ro6.LIZIZ()) != null && Intrinsics.LJFF(feedSpecialShapedCardExtraTrackConfigModelLIZIZ.enableReportContainerAppear, Boolean.TRUE) && aweme != null && (aid = aweme.getAid()) != null) {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = LIZIZ;
            if (copyOnWriteArrayList.contains(aid)) {
                return;
            }
            copyOnWriteArrayList.add(aid);
            C0T5M c0t5m = C0T5M.LIZ;
            Callable callable = new Callable() { // from class: X.0Ro2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CardInsertInfo cardInsertInfo;
                    C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerAppearOnce$1$1");
                    Aweme aweme2 = aweme;
                    int cardType = (aweme2 == null || (cardInsertInfo = aweme2.getCardInsertInfo()) == null) ? 0 : cardInsertInfo.getCardType();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(cardType, "card_type");
                    c2344009Gk.LJIIIIZZ("type", str);
                    Pair<Integer, Integer> pair = C706870Ro5.LIZ.get(aid);
                    if (pair != null) {
                        c2344009Gk.LIZJ(pair.getFirst().intValue(), "feed_count");
                        c2344009Gk.LIZJ(pair.getSecond().intValue(), "insert_index");
                    }
                    Map<String, String> map2 = map;
                    if (map2 != null) {
                        c2344009Gk.LJII(map2);
                    }
                    C20684815ws.LJIILLIIL("rd_tiktokec_special_shaped_card_client_container_show", c2344009Gk.LIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerAppearOnce$1$1");
                    return unit;
                }
            };
            c0t5m.getClass();
            C0T5M.LIZIZ(callable);
        }
    }

    public static final void LIZLLL(Integer num, String str, List list) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (((Boolean) C077M.LIZ.getValue()).booleanValue()) {
            if (list != null) {
                try {
                    copyOnWriteArrayList = new CopyOnWriteArrayList(list);
                } catch (ConcurrentModificationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    copyOnWriteArrayList = null;
                }
            } else {
                copyOnWriteArrayList = null;
            }
            C0S78.LIZJ(new AwS127S1200000_11(copyOnWriteArrayList, (CopyOnWriteArrayList<Aweme>) str, (String) num, (Integer) 16), true);
        }
    }

    public static void LIZIZ(final Aweme aweme, final String str, final String str2, final Map map) {
        FeedSpecialShapedCardExtraTrackConfigModel feedSpecialShapedCardExtraTrackConfigModelLIZIZ;
        final String aid;
        FeedSpecialShapedCardExtraTrackConfigModel feedSpecialShapedCardExtraTrackConfigModelLIZIZ2 = C706880Ro6.LIZIZ();
        if (feedSpecialShapedCardExtraTrackConfigModelLIZIZ2 != null && Intrinsics.LJFF(feedSpecialShapedCardExtraTrackConfigModelLIZIZ2.enable, Boolean.TRUE) && (feedSpecialShapedCardExtraTrackConfigModelLIZIZ = C706880Ro6.LIZIZ()) != null && Intrinsics.LJFF(feedSpecialShapedCardExtraTrackConfigModelLIZIZ.enableReportLoadProcess, Boolean.TRUE) && aweme != null && (aid = aweme.getAid()) != null) {
            if (!Intrinsics.LJFF(str2, "start") && !Intrinsics.LJFF(str2, "end")) {
                return;
            }
            if (Intrinsics.LJFF(str2, "start")) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZJ;
                if (concurrentHashMap.get(aid) != null) {
                    return;
                } else {
                    concurrentHashMap.put(aid, Boolean.FALSE);
                }
            }
            if (Intrinsics.LJFF(str2, "end")) {
                ConcurrentHashMap<String, Boolean> concurrentHashMap2 = LIZJ;
                Boolean bool = concurrentHashMap2.get(aid);
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2)) {
                    return;
                } else {
                    concurrentHashMap2.put(aid, bool2);
                }
            }
            C0T5M c0t5m = C0T5M.LIZ;
            Callable callable = new Callable() { // from class: X.0Ro3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CardInsertInfo cardInsertInfo;
                    C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerLoadProcess$1$1");
                    Aweme aweme2 = aweme;
                    int cardType = (aweme2 == null || (cardInsertInfo = aweme2.getCardInsertInfo()) == null) ? 0 : cardInsertInfo.getCardType();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(cardType, "card_type");
                    c2344009Gk.LJIIIIZZ("type", str);
                    Pair<Integer, Integer> pair = C706870Ro5.LIZ.get(aid);
                    if (pair != null) {
                        c2344009Gk.LIZJ(pair.getFirst().intValue(), "feed_count");
                        c2344009Gk.LIZJ(pair.getSecond().intValue(), "insert_index");
                    }
                    c2344009Gk.LJFF("has_cache", C706870Ro5.LJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                    Map<String, String> map2 = map;
                    if (map2 != null) {
                        c2344009Gk.LJII(map2);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("rd_tiktokec_special_shaped_card_client_load_");
                    sbLIZ.append(str2);
                    C20684815ws.LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ), c2344009Gk.LIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerLoadProcess$1$1");
                    return unit;
                }
            };
            c0t5m.getClass();
            C0T5M.LIZIZ(callable);
        }
    }

    public static void LIZJ(final Aweme aweme, final int i, final String str, final Boolean bool, final Boolean bool2) {
        C0T5M c0t5m = C0T5M.LIZ;
        Callable callable = new Callable() { // from class: X.0Ro4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String aid;
                Pair<Integer, Integer> pair;
                CardInsertInfo cardInsertInfo;
                C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerLoadResult$1");
                Aweme aweme2 = aweme;
                int cardType = (aweme2 == null || (cardInsertInfo = aweme2.getCardInsertInfo()) == null) ? 0 : cardInsertInfo.getCardType();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(cardType, "card_type");
                c2344009Gk.LIZJ(i, "code");
                c2344009Gk.LJIIIIZZ("msg", str);
                Aweme aweme3 = aweme;
                if (aweme3 != null && (aid = aweme3.getAid()) != null && (pair = C706870Ro5.LIZ.get(aid)) != null) {
                    c2344009Gk.LIZJ(pair.getFirst().intValue(), "feed_count");
                    c2344009Gk.LIZJ(pair.getSecond().intValue(), "insert_index");
                }
                Boolean bool3 = bool;
                if (bool3 != null) {
                    bool3.booleanValue();
                    c2344009Gk.LIZJ(Intrinsics.LJFF(bool3, Boolean.TRUE) ? 1 : 0, "has_fallback");
                }
                Boolean bool4 = bool2;
                if (bool4 != null) {
                    bool4.booleanValue();
                    c2344009Gk.LJ(Boolean.valueOf(Intrinsics.LJFF(bool4, Boolean.TRUE)), "is_roll_back");
                }
                c2344009Gk.LJFF("has_cache", C706870Ro5.LJ ? "1" : CardStruct.IStatusCode.DEFAULT);
                C20684815ws.LJIILLIIL("rd_feed_lynx_card_load_result", c2344009Gk.LIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerLoadResult$1");
                return unit;
            }
        };
        c0t5m.getClass();
        C0T5M.LIZIZ(callable);
    }
}
