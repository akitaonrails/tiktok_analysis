package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.relation.experiment.TTRecommendBigCardFCPAvoidConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1A8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174611A8t implements InterfaceC1864007Ru {
    public static final Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public final InterfaceC19229810Ky LIZ;
    public int LIZIZ;
    public int LIZJ;

    @Override // X.InterfaceC1864007Ru
    public final void LIZ() {
        if (C0BLR.LIZ()) {
            return;
        }
        if (!(!C2174651A8x.LIZ() ? false : !this.LIZ.pc("homepage_hot"))) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("RecSwipeViewModel", "[fetchRecUserData] is not match fetch condition");
            return;
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("RecSwipeViewModel", "[fetchRecUserData] start");
        this.LIZ.a22("homepage_hot", null);
        if (C293070BeD.LIZ()) {
            C0CVA.LIZ();
        }
    }

    public C2174611A8t(InterfaceC19229810Ky interfaceC19229810Ky) {
        this.LIZ = interfaceC19229810Ky;
    }

    @Override // X.InterfaceC1864007Ru
    public final Pair<Integer, Aweme> LIZIZ(int i, List<? extends Aweme> list, String str, Function0<Boolean> function0) {
        boolean z;
        boolean z2;
        boolean z3;
        Boolean bool;
        Boolean bool2;
        boolean z4;
        boolean z5;
        CardInsertInfo cardInsertInfo;
        int iIntValue = 2;
        if (C0BLR.LIZ()) {
            C07N5.LIZ.getClass();
            Boolean bool3 = Boolean.FALSE;
            C443120HZe c443120HZe = new C443120HZe(bool3, 0, bool3);
            for (Aweme aweme : list) {
                if (!((Boolean) c443120HZe.getFirst()).booleanValue() && !C2277891EDz.LIZIZ.LJIILJJIL().LIZJ(aweme)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z4);
                Integer numValueOf = Integer.valueOf(((Number) c443120HZe.getSecond()).intValue() + (aweme.isAd() ? 1 : 0));
                if (((Boolean) c443120HZe.getThird()).booleanValue() || ((cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == 49)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c443120HZe = new C443120HZe(boolValueOf, numValueOf, Boolean.valueOf(z5));
            }
            boolean zBooleanValue = ((Boolean) c443120HZe.getFirst()).booleanValue();
            int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
            if (((Boolean) c443120HZe.getThird()).booleanValue()) {
                C01GW c01gw = C2174661A8y.LIZIZ;
                Integer num = ((TTRecommendBigCardFCPAvoidConfig) c01gw.getValue()).adsCount;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                if (iIntValue2 >= iIntValue) {
                    z = true;
                } else {
                    z = false;
                }
                C2174581A8q.LIZ.getClass();
                C1910890zpH c1910890zpHLJIIJ = C2174581A8q.LJIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ads count: ");
                sbLIZ.append(iIntValue2);
                sbLIZ.append(", has recommend user video: ");
                sbLIZ.append(zBooleanValue);
                c1910890zpHLJIIJ.LIZ("fcp_insert_manager", C2188811AlT.LIZIZ(sbLIZ));
                if (z && ((bool2 = ((TTRecommendBigCardFCPAvoidConfig) c01gw.getValue()).enableAdsAvoid) == null || bool2.booleanValue())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (zBooleanValue && ((bool = ((TTRecommendBigCardFCPAvoidConfig) c01gw.getValue()).enableMafVideoAvoid) == null || bool.booleanValue())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 || z3) {
                    C07N5.LIZIZ.set(true);
                    ArrayList<Aweme> arrayList = new ArrayList();
                    for (Object obj : list) {
                        CardInsertInfo cardInsertInfo2 = ((Aweme) obj).getCardInsertInfo();
                        if (cardInsertInfo2 != null && cardInsertInfo2.getCardType() == 49) {
                            arrayList.add(obj);
                        }
                    }
                    if (C19719512Dh.LJI(list)) {
                        list.removeAll(arrayList);
                    }
                    for (Aweme aweme2 : arrayList) {
                        if (aweme2 != null) {
                            C0T5M c0t5m = C0T5M.LIZ;
                            AwemeBizExtKt.setContentDiffType(aweme2, "big_card_maf_video_ads_filter");
                        }
                        C0T5M.LJFF(aweme2, "big_card_maf_video_ads_filter", str);
                    }
                }
                C07N5 c07n5 = C07N5.LIZ;
                AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(this, 89);
                c07n5.getClass();
                C2174581A8q.LIZ.getClass();
                C2174581A8q.LJIIJ().LIZ("fcp_insert_manager", "try iterate through Aweme list");
                for (Aweme aweme3 : list) {
                    CardInsertInfo cardInsertInfo3 = aweme3.getCardInsertInfo();
                    if (cardInsertInfo3 != null && cardInsertInfo3.getCardType() == 49) {
                        C2174581A8q.LIZ.getClass();
                        C2174581A8q.LJIIJ().LIZ("fcp_insert_manager", "handle big card aweme");
                        awS612S0100000_33.invoke(aweme3);
                    }
                }
            }
            return null;
        }
        if (!this.LIZ.pc("homepage_hot")) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("RecSwipeViewModel", "[swipe][tryInsertRecUserInData] the rec maf user list is empty, so we increase the insert page offset");
            this.LIZIZ++;
            return null;
        }
        if (C0BSU.LIZ) {
            int i3 = C2187451AjH.LIZ;
        } else {
            if (i == 0) {
                this.LIZIZ = 0;
            }
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[calculateInsertPosition] indexOfFlow is ");
            sbLIZ2.append(i);
            sbLIZ2.append(" aweme list size is ");
            sbLIZ2.append(list.size());
            C1720106oR.LJI("RecSwipeViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            int i5 = C1A9E.LIZ().fypConfig.flowIndex - 1;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[isMeetBatch]\n current indexOfFlow       = ");
            sbLIZ3.append(i);
            sbLIZ3.append("\n config  configIndexOfFlow = ");
            sbLIZ3.append(i5);
            sbLIZ3.append("\n insert Page Offset         = ");
            sbLIZ3.append(this.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (i == i5 + this.LIZIZ) {
                if (!C2174651A8x.LIZ()) {
                    C1720106oR.LJI("RecSwipeViewModel", "[calculateInsertPosition] is not match insert common condition");
                    return null;
                }
                if (!C1A9E.LIZ().isOtherFreInEffect && function0.invoke().booleanValue()) {
                    C1720106oR.LJI("RecSwipeViewModel", "[calculateInsertPosition] last data contains maf videos");
                    return null;
                }
                if (!list.isEmpty()) {
                    Iterator<? extends Aweme> it2 = list.iterator();
                    int i6 = 0;
                    while (it2.hasNext()) {
                        if (((Aweme) it2.next()).isAd() && (i6 = i6 + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                    if (i6 >= 2) {
                        int i7 = C2187451AjH.LIZ;
                        C1720106oR.LJI("RecSwipeViewModel", "[calculateInsertPosition] the count of ad aweme >= 2, so we increase the insert page offset");
                        this.LIZIZ++;
                        return null;
                    }
                }
                int i8 = C1A9E.LIZ().fypConfig.flowPosition - 1;
                if (i8 >= 0 && i8 < list.size() && ((Aweme) ListProtector.get(list, i8)).isAd()) {
                    int i9 = C2187451AjH.LIZ;
                    C1720106oR.LJI("RecSwipeViewModel", "[calculateInsertPos current aweme is ad, so we choose the backup insert position");
                    i8 = C1A9E.LIZ().fypConfig.backUpFlowPosition - 1;
                }
                int size = list.size();
                if (i8 > size) {
                    i8 = size;
                }
                int i10 = C2187451AjH.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[calculateInsertPos] insertIndex = ");
                sbLIZ4.append(i8);
                C1720106oR.LJI("RecSwipeViewModel", C2188811AlT.LIZIZ(sbLIZ4));
                this.LIZJ = i8;
                if (i8 < 0) {
                    C1720106oR.LJI("RecSwipeViewModel", "[calculateInsertPosition] insertPos = " + this.LIZJ + " illegal");
                    return null;
                }
                if (C1A9E.LIZ().isOtherFreInEffect) {
                    if (!list.isEmpty()) {
                        Iterator<? extends Aweme> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (C2277891EDz.LIZIZ.LJIILJJIL().LIZJ((Aweme) it3.next())) {
                                int i11 = C2187451AjH.LIZ;
                                C1720106oR.LJI("RecSwipeViewModel", "[calculateInsertPosition] current refresh data contains maf video, so we increase the insert page offset");
                                this.LIZIZ++;
                                return null;
                            }
                        }
                    }
                } else {
                    Iterator<? extends Aweme> it4 = list.iterator();
                    int i12 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            if (C2277891EDz.LIZIZ.LJIILJJIL().LIZJ((Aweme) it4.next())) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    int i13 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("[calculateInsertPosition] firstMafIndex = ");
                    sbLIZ5.append(i12);
                    C1720106oR.LJI("RecSwipeViewModel", C2188811AlT.LIZIZ(sbLIZ5));
                    if (i12 >= 0 && i12 <= this.LIZJ) {
                        C1720106oR.LJI("RecSwipeViewModel", "[calculateInsertPosition]  Before that came the unfollow maf video");
                        return null;
                    }
                }
            } else {
                C1720106oR.LJI("RecSwipeViewModel", "[calculateInsertPosition] is not meet batch");
                return null;
            }
        }
        if (!C19719512Dh.LJI(list)) {
            return null;
        }
        Aweme aweme4 = new Aweme();
        aweme4.setAid(UUID.randomUUID().toString());
        AwemeBizExtKt.setRecBigCardFakeAweme(aweme4, true);
        aweme4.setAwemeType(4004);
        this.LIZ.dI1(this.LIZJ);
        this.LIZ.P22(i);
        aweme4.setRequestId(str);
        C0OF0.LIZIZ(aweme4, "friend_recommend_card");
        ListProtector.add(list, this.LIZJ, aweme4);
        int i14 = C2187451AjH.LIZ;
        C1720106oR.LJI("RecSwipeViewModel", "[tryInsertRecUserInData] finish rec big card insert");
        C0T5M.LIZ.getClass();
        AwemeBizExtKt.setContentDiffType(aweme4, "friend_recommend_card");
        C0T5M.LJFF(aweme4, "friend_recommend_card", str);
        if (C0BLS.LIZ()) {
            CopyOnWriteArrayList<C1261860iwS> copyOnWriteArrayListR20 = this.LIZ.R20("homepage_hot");
            if (copyOnWriteArrayListR20.size() > 0) {
                InterfaceC19229810Ky interfaceC19229810Ky = this.LIZ;
                int size2 = copyOnWriteArrayListR20.size();
                if (size2 > 5) {
                    size2 = 5;
                }
                interfaceC19229810Ky.Xn1(copyOnWriteArrayListR20.subList(0, size2));
            }
        }
        return new Pair<>(Integer.valueOf(this.LIZJ), aweme4);
    }
}
