package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.poi.experiment.LSFeedCardInsetConfig;
import com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS126S0101000_18;
import kotlin.jvm.internal.AwS32S0001000_18;
import kotlin.jvm.internal.AwS8S1001000_18;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202060hO0 implements ILSFeedCardService {
    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
    public final List<C0TRR> getLSCardInsertExecutor() {
        List<C0TRR> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C0TRR() { // from class: X.15b3
            public final ConcurrentHashMap<Integer, Boolean> LIZJ = new ConcurrentHashMap<>();

            @Override // X.C0TRR
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.C0TRR
            public final List<CardTypeRequest> LIZJ(C0TRR c0trr, FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list) {
                List<LSFeedCardInsetConfig.LSCardConfig> list2;
                CardShowInfo next;
                LSFeedCardInsetConfig.Config config = (LSFeedCardInsetConfig.Config) LSFeedCardInsetConfig.LIZIZ.getValue();
                if (config == null || (list2 = config.cardConfig) == null || list2.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (LSFeedCardInsetConfig.LSCardConfig lSCardConfig : list2) {
                    Integer num = lSCardConfig.cardType;
                    if (num != null) {
                        num.intValue();
                        List<CardShowInfo> list3 = feedCardInsertData.showInfoList;
                        if (list3 != null) {
                            Iterator<CardShowInfo> it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    CardShowInfo cardShowInfo = next;
                                    int i = cardShowInfo.cardType;
                                    Integer num2 = lSCardConfig.cardType;
                                    if (num2 != null && i == num2.intValue() && cardShowInfo.flowIndex > 0 && cardShowInfo.timeInterval > 0 && cardShowInfo.intervalMaxShowCount > 0) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            CardShowInfo cardShowInfo2 = next;
                            if (cardShowInfo2 != null) {
                                int i2 = cardShowInfo2.flowIndex;
                                int i3 = cardShowInfo2.flowInterval;
                                int i4 = feedCardInsertData.LIZ;
                                if (this.LIZJ.get(lSCardConfig.cardType) == null) {
                                    if (i4 == i2) {
                                        this.LIZJ.put(lSCardConfig.cardType, Boolean.TRUE);
                                        int iIntValue = lSCardConfig.cardType.intValue();
                                        C0TXY c0txy = C0TXY.LIZ;
                                        int iIntValue2 = lSCardConfig.cardType.intValue();
                                        List<String> list4 = lSCardConfig.subCardType;
                                        c0txy.getClass();
                                        CardTypeRequest cardTypeRequest = new CardTypeRequest(iIntValue, C786410Ut5.J3(C0TXY.LIZIZ(iIntValue2, list4)), "");
                                        arrayList.add(cardTypeRequest);
                                        C1202070hO1 c1202070hO1 = C1202070hO1.LIZ;
                                        int iIntValue3 = lSCardConfig.cardType.intValue();
                                        c1202070hO1.getClass();
                                        c1202070hO1.LIZJ("commit_insert_param", new AwS32S0001000_18(iIntValue3, 6));
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("startInsertRecord: type: ");
                                        sbLIZ.append(lSCardConfig.cardType);
                                        sbLIZ.append(", biz: ");
                                        sbLIZ.append(cardTypeRequest.bizInfo);
                                        C2188811AlT.LIZIZ(sbLIZ);
                                    }
                                } else if ((i4 - i2) % i3 == 0) {
                                    int iIntValue4 = lSCardConfig.cardType.intValue();
                                    C0TXY c0txy2 = C0TXY.LIZ;
                                    int iIntValue5 = lSCardConfig.cardType.intValue();
                                    List<String> list5 = lSCardConfig.subCardType;
                                    c0txy2.getClass();
                                    CardTypeRequest cardTypeRequest2 = new CardTypeRequest(iIntValue4, C786410Ut5.J3(C0TXY.LIZIZ(iIntValue5, list5)), "");
                                    arrayList.add(cardTypeRequest2);
                                    C1202070hO1 c1202070hO12 = C1202070hO1.LIZ;
                                    int iIntValue6 = lSCardConfig.cardType.intValue();
                                    c1202070hO12.getClass();
                                    c1202070hO12.LIZJ("commit_insert_param", new AwS32S0001000_18(iIntValue6, 6));
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("secondInsertRecord: type: ");
                                    sbLIZ2.append(lSCardConfig.cardType);
                                    sbLIZ2.append(", biz: ");
                                    sbLIZ2.append(cardTypeRequest2.bizInfo);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                }
                            }
                        }
                    }
                }
                return arrayList;
            }
        });
        if (C297490BlL.LIZ() > 0) {
            listLJIILJJIL.add(new C0TRR() { // from class: X.15b2
                public final ConcurrentHashMap<Integer, Boolean> LIZJ = new ConcurrentHashMap<>();

                @Override // X.C0TRR
                public final int LIZIZ() {
                    return 0;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x0059 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:86:? A[LOOP:0: B:9:0x0030->B:86:?, LOOP_END, SYNTHETIC] */
                @Override // X.C0TRR
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.util.List<com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest> LIZJ(X.C0TRR r16, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData r17, java.util.List<com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo> r18) {
                    /*
                        Method dump skipped, instruction units count: 446
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20549415b2.LIZJ(X.0TRR, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData, java.util.List):java.util.List");
                }
            });
        }
        return listLJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
    public final Function2<String, JSONObject, Unit> getEventHandler() {
        return new C0TXZ();
    }

    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
    public final void requestInsertCardTrack(List<CardTypeRequest> list, int i) {
        C1202070hO1 c1202070hO1 = C1202070hO1.LIZ;
        c1202070hO1.getClass();
        for (CardTypeRequest cardTypeRequest : list) {
            if (((Set) C1202070hO1.LIZJ.getValue()).contains(Integer.valueOf(cardTypeRequest.cardType))) {
                c1202070hO1.LIZJ("request_insert_param", new AwS32S0001000_18(cardTypeRequest.cardType, 7));
            }
        }
        C1202090hO3.LIZ.getClass();
        for (CardTypeRequest cardTypeRequest2 : list) {
            C1202090hO3 c1202090hO3 = C1202090hO3.LIZ;
            int i2 = cardTypeRequest2.cardType;
            c1202090hO3.getClass();
            int[] iArr = (int[]) C1202080hO2.LIZIZ.getValue();
            if (iArr == null) {
                iArr = C1202080hO2.LIZ;
            }
            if (C13LQ.LJJIJ(i2, iArr) >= 0) {
                c1202090hO3.LIZJ("request_insert_param", new AwS126S0101000_18(cardTypeRequest2, i, 6));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.feedcard.ILSFeedCardService
    public final void insertCardResultTrack(int i, String str, int i2) {
        C1202070hO1 c1202070hO1 = C1202070hO1.LIZ;
        c1202070hO1.getClass();
        if (((Set) C1202070hO1.LIZJ.getValue()).contains(Integer.valueOf(i))) {
            c1202070hO1.LIZJ("insert_card_result", new AwS8S1001000_18(i, str, 0));
        }
        C1202090hO3 c1202090hO3 = C1202090hO3.LIZ;
        c1202090hO3.getClass();
        int[] iArr = (int[]) C1202080hO2.LIZIZ.getValue();
        if (iArr == null) {
            iArr = C1202080hO2.LIZ;
        }
        if (C13LQ.LJJIJ(i, iArr) >= 0) {
            c1202090hO3.LIZJ("insert_card_result", new C1202050hNz(str, i, i2));
        }
    }
}
