package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.sfv.special.LiveSfvPostCardViewHolder;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0RxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712720RxW implements InterfaceC712730RxX {
    public static final C01GW<C712720RxW> LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(314));

    @Override // X.InterfaceC712730RxX
    public final C0TRR LIZ() {
        return new C0TRR() { // from class: X.0TQm
            @Override // X.C0TRR
            public final int LIZ() {
                throw null;
            }

            @Override // X.C0TRR
            public final int LIZIZ() {
                return 0;
            }

            @Override // X.C0TRR
            public final List<CardTypeRequest> LIZJ(C0TRR c0trr, FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list) {
                boolean z;
                CardShowInfo next;
                CardInsertResultInfo cardInsertResultInfo;
                List<CardShowInfo> list2;
                final CardInsertResultInfo next2;
                CardInsertResultInfo next3;
                if (((Number) C279320Ax8.LIZ.getValue()).intValue() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C20441214yg.LIZIZ("SfvHighlightCardInsertExecutor", "LiveSfvHighlightSpecialCardExperiment is disabled");
                } else {
                    InterfaceC1457290o1f interfaceC1457290o1f = (InterfaceC1457290o1f) PluggableExtentionKt.pluggableSpi$default(InterfaceC1457290o1f.class, false, false, false, 14, null);
                    if (interfaceC1457290o1f != null && interfaceC1457290o1f.LIZ()) {
                        C20441214yg.LIZIZ("SfvHighlightCardInsertExecutor", "isChildrenMode");
                        return null;
                    }
                    List<CardShowInfo> list3 = feedCardInsertData.showInfoList;
                    if (list3 != null) {
                        Iterator<CardShowInfo> it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next.cardType == 122) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        CardShowInfo cardShowInfo = next;
                        if (cardShowInfo != null) {
                            if (list != null) {
                                Iterator<CardInsertResultInfo> it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next3 = it3.next();
                                        if (next3.cardType == 122) {
                                            break;
                                        }
                                    } else {
                                        next3 = null;
                                        break;
                                    }
                                }
                                cardInsertResultInfo = next3;
                            } else {
                                cardInsertResultInfo = null;
                            }
                            C20550115b9 c20550115b9 = C20550115b9.LIZ;
                            Integer numValueOf = Integer.valueOf(feedCardInsertData.LIZ);
                            c20550115b9.getClass();
                            EnumC20550015b8 enumC20550015b8LJIIL = C20550115b9.LJIIL(c0trr, 122, numValueOf, cardShowInfo, cardInsertResultInfo);
                            if (enumC20550015b8LJIIL != EnumC20550015b8.STATE_FREQ_SUCCESS) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("CardFreqCheckState:");
                                sbLIZ.append(enumC20550015b8LJIIL);
                                C20441214yg.LIZIZ("SfvHighlightCardInsertExecutor", C2188811AlT.LIZIZ(sbLIZ));
                                return null;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("toBeInsert true: CardFreqCheckState:");
                            sbLIZ2.append(enumC20550015b8LJIIL);
                            C20441214yg.LIZIZ("SfvHighlightCardInsertExecutor", C2188811AlT.LIZIZ(sbLIZ2));
                            if (((Number) C279320Ax8.LIZ.getValue()).intValue() > 0 && (list2 = feedCardInsertData.showInfoList) != null) {
                                final int i = feedCardInsertData.LIZ;
                                for (final CardShowInfo cardShowInfo2 : list2) {
                                    if (cardShowInfo2.ruleType == 0 && 122 == cardShowInfo2.cardType) {
                                        if (list != null && !list.isEmpty()) {
                                            Iterator<CardInsertResultInfo> it4 = list.iterator();
                                            while (it4.hasNext()) {
                                                next2 = it4.next();
                                                if (next2.cardType == 122) {
                                                    break;
                                                }
                                            }
                                            next2 = null;
                                            C692030RCn.LIZ.add(new C0RAH() { // from class: X.0TQn
                                                @Override // X.C0RAH
                                                public final void LIZ() {
                                                    C20550115b9 c20550115b92 = C20550115b9.LIZ;
                                                    getClass();
                                                    int i2 = i;
                                                    CardShowInfo cardShowInfo3 = cardShowInfo2;
                                                    CardInsertResultInfo cardInsertResultInfo2 = next2;
                                                    c20550115b92.getClass();
                                                    C20550115b9.LJIIZILJ(122, i2, cardShowInfo3, cardInsertResultInfo2);
                                                    C692030RCn.LIZ.remove(this);
                                                }
                                            });
                                        } else {
                                            next2 = null;
                                            C692030RCn.LIZ.add(new C0RAH() { // from class: X.0TQn
                                                @Override // X.C0RAH
                                                public final void LIZ() {
                                                    C20550115b9 c20550115b92 = C20550115b9.LIZ;
                                                    getClass();
                                                    int i2 = i;
                                                    CardShowInfo cardShowInfo3 = cardShowInfo2;
                                                    CardInsertResultInfo cardInsertResultInfo2 = next2;
                                                    c20550115b92.getClass();
                                                    C20550115b9.LJIIZILJ(122, i2, cardShowInfo3, cardInsertResultInfo2);
                                                    C692030RCn.LIZ.remove(this);
                                                }
                                            });
                                        }
                                    }
                                }
                            }
                            return Collections.singletonList(new CardTypeRequest(122, "", ""));
                        }
                    }
                }
                return null;
            }
        };
    }

    @Override // X.InterfaceC712730RxX
    public final View LIZIZ(Context context) {
        return C786410Ut5.Sd(R.layout.dhg, C786410Ut5.ne(context), null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0RAa] */
    @Override // X.InterfaceC712730RxX
    public final Object LIZJ(InterfaceC691450RAh interfaceC691450RAh) {
        if (!(interfaceC691450RAh instanceof C0RF0)) {
            return null;
        }
        return new LiveSfvPostCardViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<LiveSfvPostCardViewHolder, VideoItemParams>() { // from class: X.0RAa
            @Override // X.C0SZL
            public final String LIZLLL(VideoItemParams videoItemParams) {
                String aid = videoItemParams.getAweme().getAid();
                if (aid == null) {
                    return "";
                }
                return aid;
            }
        });
    }
}
