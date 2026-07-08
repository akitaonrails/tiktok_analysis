package X;

import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.lynxcard.dynamic.RealTimeCardModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.LynxTemplate;
import com.ss.android.ugc.aweme.fetch.OutreachCategoryParams;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardInsertRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertConfig;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15bQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20551815bQ {
    public static String LIZJ;
    public static DataLayerAbility LIZLLL;
    public static IViewPagerComponentAbility LJ;
    public static int LJFF;
    public static RealTimeCardModel LJI;
    public static final HandlerThread LJIIJJI;
    public static final C01GW LJIIL;
    public static final C20552015bS LJIILIIL;
    public static final C20551715bP LJIILJJIL;
    public static final C20552415bW LJIILL;
    public static final C20551815bQ LIZ = new C20551815bQ();
    public static final Map<String, Set<Integer>> LIZIZ = new LinkedHashMap();
    public static final Map<Integer, RealTimeCardModel> LJII = new LinkedHashMap();
    public static final List<Integer> LJIIIIZZ = new ArrayList();
    public static final HashSet<String> LJIIIZ = new HashSet<>();
    public static final HashSet<String> LJIIJ = new HashSet<>();

    /* JADX WARN: Type inference failed for: r0v10, types: [X.15bS] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.15bP] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.15bW] */
    static {
        HandlerThread handlerThread = new HandlerThread("RealTimeLynxCardManager");
        handlerThread.start();
        LJIIJJI = handlerThread;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(513));
        LJIIL = c01gwLIZIZ;
        if (!C0B35.LIZ) {
            c01gwLIZIZ.getValue();
        }
        LJIILIIL = new AbstractC637410OzL() { // from class: X.15bS
            @Override // X.AbstractC637410OzL
            public final OutreachCategoryParams LIZ() {
                String strValueOf;
                C20551815bQ.LIZ.getClass();
                if (!C1533950q1J.LJ(C20551815bQ.LIZJ)) {
                    return null;
                }
                if (C1533950q1J.LJ(C20551815bQ.LIZJ)) {
                    strValueOf = String.valueOf(C20551815bQ.LIZJ);
                    C20551815bQ.LIZJ = null;
                } else {
                    strValueOf = C20551815bQ.LIZJ;
                }
                return new OutreachCategoryParams(strValueOf, null);
            }
        };
        LJIILJJIL = new InterfaceC20684015wk() { // from class: X.15bP
            @Override // X.InterfaceC20684015wk
            public final boolean LIZ(String str) {
                Aweme awemeRh;
                String groupId;
                boolean z;
                Map<Integer, CardShowInfo> map;
                Aweme aweme;
                CardInsertInfo cardInsertInfo;
                Set set = (Set) ((LinkedHashMap) C20551815bQ.LIZIZ).get(str);
                if (set != null && !set.isEmpty()) {
                    IViewPagerComponentAbility iViewPagerComponentAbility = C20551815bQ.LJ;
                    if (iViewPagerComponentAbility != null) {
                        awemeRh = iViewPagerComponentAbility.Rh(iViewPagerComponentAbility.LJIIIIZZ());
                    } else {
                        awemeRh = null;
                    }
                    C20551815bQ c20551815bQ = C20551815bQ.LIZ;
                    if (awemeRh != null) {
                        groupId = awemeRh.getGroupId();
                    } else {
                        groupId = null;
                    }
                    c20551815bQ.getClass();
                    if (groupId != null && (C20551815bQ.LJIIIZ.contains(groupId) || C20551815bQ.LJIIJ.contains(groupId))) {
                        C20571615ec.LIZ.getClass();
                        C20571615ec.LIZJ("RealTimeCard shouldIntercept, is not in new video");
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            C080G.LIZJ(C080C.REALTIME_SPECIAL_CARD, "fetch_intercept", str, String.valueOf(((Number) it2.next()).intValue()), 60002, "next aweme consumed", null, 192);
                        }
                        return true;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        int iIntValue = ((Number) it3.next()).intValue();
                        RealTimeCardModel realTimeCardModel = C20551815bQ.LJI;
                        if (realTimeCardModel != null && (aweme = realTimeCardModel.feedCard) != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == iIntValue) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            C20571615ec c20571615ec = C20571615ec.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("RealTimeCard shouldIntercept, filter wait insert card: ");
                            sbLIZ.append(iIntValue);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c20571615ec.getClass();
                            C20571615ec.LIZJ(strLIZIZ);
                            C080C c080c = C080C.REALTIME_SPECIAL_CARD;
                            String strValueOf = String.valueOf(iIntValue);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("card ");
                            sbLIZ2.append(iIntValue);
                            sbLIZ2.append(" is waiting to insert");
                            C080G.LIZJ(c080c, "fetch_intercept", str, strValueOf, 60003, C2188811AlT.LIZIZ(sbLIZ2), null, 192);
                        } else if (C20551815bQ.LJII.containsKey(Integer.valueOf(iIntValue))) {
                            C20571615ec c20571615ec2 = C20571615ec.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("RealTimeCard shouldIntercept, filter wait consume card: ");
                            sbLIZ3.append(iIntValue);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                            c20571615ec2.getClass();
                            C20571615ec.LIZJ(strLIZIZ2);
                            C080C c080c2 = C080C.REALTIME_SPECIAL_CARD;
                            String strValueOf2 = String.valueOf(iIntValue);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("card ");
                            sbLIZ4.append(iIntValue);
                            sbLIZ4.append(" is waiting to consume");
                            C080G.LIZJ(c080c2, "fetch_intercept", str, strValueOf2, 60004, C2188811AlT.LIZIZ(sbLIZ4), null, 192);
                        } else if (((ArrayList) C20551815bQ.LJIIIIZZ).contains(Integer.valueOf(iIntValue))) {
                            C20571615ec c20571615ec3 = C20571615ec.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("RealTimeCard shouldIntercept, filter wait fetching card: ");
                            sbLIZ5.append(iIntValue);
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                            c20571615ec3.getClass();
                            C20571615ec.LIZJ(strLIZIZ3);
                            C080C c080c3 = C080C.REALTIME_SPECIAL_CARD;
                            String strValueOf3 = String.valueOf(iIntValue);
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("card ");
                            sbLIZ6.append(iIntValue);
                            sbLIZ6.append(" is waiting to fetch");
                            C080G.LIZJ(c080c3, "fetch_intercept", str, strValueOf3, 60005, C2188811AlT.LIZIZ(sbLIZ6), null, 192);
                        } else {
                            FeedCardInsertConfig feedCardInsertConfigLIZ = C20551415bM.LIZ();
                            if (feedCardInsertConfigLIZ != null && (map = feedCardInsertConfigLIZ.cardInfo) != null) {
                                CardShowInfo value = null;
                                for (Map.Entry<Integer, CardShowInfo> entry : map.entrySet()) {
                                    if (entry.getValue().cardType == iIntValue) {
                                        value = entry.getValue();
                                    }
                                }
                                if (value != null) {
                                    C20550115b9.LIZ.getClass();
                                    EnumC20550015b8 enumC20550015b8LJIIL = C20550115b9.LJIIL(null, iIntValue, null, value, null);
                                    if (EnumC20550015b8.STATE_FREQ_SUCCESS == enumC20550015b8LJIIL) {
                                        arrayList.add(Integer.valueOf(iIntValue));
                                    } else {
                                        C20571615ec c20571615ec4 = C20571615ec.LIZ;
                                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                        sbLIZ7.append("RealTimeCard shouldIntercept, freq check result: ");
                                        sbLIZ7.append(enumC20550015b8LJIIL.getState());
                                        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ7);
                                        c20571615ec4.getClass();
                                        C20571615ec.LIZJ(strLIZIZ4);
                                        C080C c080c4 = C080C.REALTIME_SPECIAL_CARD;
                                        String strValueOf4 = String.valueOf(iIntValue);
                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                        sbLIZ8.append("freq state: ");
                                        sbLIZ8.append(enumC20550015b8LJIIL.getState());
                                        C080G.LIZJ(c080c4, "fetch_intercept", str, strValueOf4, 60007, C2188811AlT.LIZIZ(sbLIZ8), null, 192);
                                    }
                                }
                            }
                            C20571615ec.LIZ.getClass();
                            C20571615ec.LIZJ("RealTimeCard shouldIntercept, no show info");
                            C080C c080c5 = C080C.REALTIME_SPECIAL_CARD;
                            String strValueOf5 = String.valueOf(iIntValue);
                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                            sbLIZ9.append("no show info for cardType: ");
                            sbLIZ9.append(iIntValue);
                            C080G.LIZJ(c080c5, "fetch_intercept", str, strValueOf5, 60006, C2188811AlT.LIZIZ(sbLIZ9), null, 192);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        C20571615ec c20571615ec5 = C20571615ec.LIZ;
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("RealTimeCard shouldIntercept, after filter, no card type for timing: ");
                        sbLIZ10.append(str);
                        String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ10);
                        c20571615ec5.getClass();
                        C20571615ec.LIZIZ(strLIZIZ5);
                        return true;
                    }
                    ArrayList arrayList2 = (ArrayList) C20551815bQ.LJIIIIZZ;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    C20551815bQ.LIZ.getClass();
                    C1616470sAP.LIZ.getClass();
                    int iLIZ = C1616470sAP.LIZ("FYP").LIZ();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            copyOnWriteArrayList.add(new CardTypeRequest(((Number) it4.next()).intValue(), "", ""));
                        }
                    }
                    if (!copyOnWriteArrayList.isEmpty()) {
                        CardInsertRequest cardInsertRequest = new CardInsertRequest(iLIZ, copyOnWriteArrayList);
                        C1227904rF.LIZ.getClass();
                        C20551815bQ.LIZJ = String.valueOf(C1227904rF.LJI(cardInsertRequest));
                        C20571615ec c20571615ec6 = C20571615ec.LIZ;
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("RealTimeCard, add fetch param: ");
                        sbLIZ11.append(C20551815bQ.LIZJ);
                        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ11);
                        c20571615ec6.getClass();
                        C20571615ec.LIZJ(strLIZIZ6);
                    }
                    return false;
                }
                C20571615ec c20571615ec7 = C20571615ec.LIZ;
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("RealTimeCard shouldIntercept, before filter, no card type for timing: ");
                sbLIZ12.append(str);
                String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ12);
                c20571615ec7.getClass();
                C20571615ec.LIZJ(strLIZIZ7);
                C080C c080c6 = C080C.REALTIME_SPECIAL_CARD;
                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                sbLIZ13.append("no card type registered for timing: ");
                sbLIZ13.append(str);
                C080G.LIZJ(c080c6, "fetch_intercept", str, null, 60001, C2188811AlT.LIZIZ(sbLIZ13), null, 200);
                return true;
            }
        };
        LJIILL = new AbstractC637050Oyl() { // from class: X.15bW
            @Override // X.AbstractC637050Oyl
            public final void LIZ(C20554115bn c20554115bn, String str, n nVar, Map<String, Object> map) {
                Object c098200Yq;
                final Aweme aweme;
                String cardInsertStatus;
                CardInsertInfo cardInsertInfo;
                CardInsertInfo cardInsertInfo2;
                Integer numValueOf;
                CardInsertResultInfo cardInsertResultInfo;
                CardInsertResultInfo cardInsertResultInfo2;
                CardInsertResultInfo cardInsertResultInfo3;
                CardInsertInfo cardInsertInfo3;
                final String showTiming;
                final String string;
                final String fetchLogId;
                C20571615ec c20571615ec = C20571615ec.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RealTimeCard, onFetchTimingResult: ");
                sbLIZ.append(c20554115bn.LIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c20571615ec.getClass();
                C20571615ec.LIZJ(strLIZIZ);
                String str2 = c20554115bn.LIZJ;
                if (c20554115bn.LIZ != 0) {
                    C080G.LIZLLL("outreach_data_parse", str, EnumC20654715s1.SPECIAL_CARD.getTypeName(), 40001, c20554115bn.LIZIZ, str2, null, 136);
                } else {
                    try {
                        C1227904rF.LIZ.getClass();
                        c098200Yq = (RealTimeCardModel) C1227904rF.LIZLLL().LIZJ(nVar, RealTimeCardModel.class);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C20571615ec c20571615ec2 = C20571615ec.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("RealTimeCard, fromJson failed: ");
                        sbLIZ2.append(thM5exceptionOrNullimpl);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c20571615ec2.getClass();
                        C20571615ec.LIZIZ(strLIZIZ2);
                        String typeName = EnumC20654715s1.SPECIAL_CARD.getTypeName();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fromJson failed: ");
                        sbLIZ3.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
                        C080G.LIZLLL("outreach_data_parse", str, typeName, 40002, C2188811AlT.LIZIZ(sbLIZ3), str2, null, 136);
                    }
                    Integer numValueOf2 = null;
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    final RealTimeCardModel realTimeCardModel = (RealTimeCardModel) c098200Yq;
                    if (realTimeCardModel != null) {
                        aweme = realTimeCardModel.feedCard;
                        if (realTimeCardModel != null) {
                            if (aweme != null && (cardInsertInfo3 = aweme.getCardInsertInfo()) != null && cardInsertInfo3.getCardImplType() == 2) {
                                C080A.LIZIZ("outreach_data_parse", str, EnumC20654715s1.SPECIAL_CARD.getTypeName(), String.valueOf(aweme.getCardInsertInfo().getCardType()), null);
                                aweme.getCardInsertInfo().setRealTime(1);
                                aweme.getCardInsertInfo().setShowTiming(str);
                                aweme.getCardInsertInfo().setFetchLogId(str2);
                                C20551815bQ.LJI = realTimeCardModel;
                                C20551815bQ.LIZ.getClass();
                                if (aweme.getAwemeType() == 105) {
                                    CardInsertInfo cardInsertInfo4 = aweme.getCardInsertInfo();
                                    if (cardInsertInfo4 != null) {
                                        showTiming = cardInsertInfo4.getShowTiming();
                                    } else {
                                        showTiming = null;
                                    }
                                    CardInsertInfo cardInsertInfo5 = aweme.getCardInsertInfo();
                                    if (cardInsertInfo5 != null) {
                                        string = Integer.valueOf(cardInsertInfo5.getCardType()).toString();
                                    } else {
                                        string = null;
                                    }
                                    CardInsertInfo cardInsertInfo6 = aweme.getCardInsertInfo();
                                    if (cardInsertInfo6 != null) {
                                        fetchLogId = cardInsertInfo6.getFetchLogId();
                                    } else {
                                        fetchLogId = null;
                                    }
                                    final C013C c013c = new C013C();
                                    Activity activityLIZ = C2421209eE.LIZ();
                                    if (activityLIZ != null) {
                                        C20553215be c20553215be = C20553215be.LIZ;
                                        AbstractC20552515bX abstractC20552515bX = new AbstractC20552515bX() { // from class: X.15bU
                                            @Override // X.AbstractC20553815bk
                                            public final void LIZ() {
                                                C20571615ec.LIZ.getClass();
                                                C20571615ec.LIZ("lynx card load: onFirstScreen");
                                            }

                                            @Override // X.AbstractC20553815bk
                                            public final void LIZJ() {
                                                CardInsertInfo cardInsertInfo7;
                                                LynxTemplate lynxTemplate;
                                                IViewPagerComponentAbility iViewPagerComponentAbility;
                                                C20571615ec.LIZ.getClass();
                                                C20571615ec.LIZJ("RealTimeCard lynx card load: onLoadFinish");
                                                if (!C305450ByB.LIZ) {
                                                    IViewPagerComponentAbility iViewPagerComponentAbility2 = C20551815bQ.LJ;
                                                    if (iViewPagerComponentAbility2 == null || iViewPagerComponentAbility2.LLLIIIL() != 0) {
                                                        return;
                                                    }
                                                    C013C c013c2 = c013c;
                                                    if (!c013c2.element) {
                                                        c013c2.element = true;
                                                        C080A.LIZ(C080C.REALTIME_SPECIAL_CARD, "load_lynx", showTiming, string);
                                                    }
                                                    C20551815bQ c20551815bQ = C20551815bQ.LIZ;
                                                    RealTimeCardModel realTimeCardModel2 = realTimeCardModel;
                                                    c20551815bQ.getClass();
                                                    C20551815bQ.LIZJ(realTimeCardModel2);
                                                    return;
                                                }
                                                Aweme aweme2 = realTimeCardModel.feedCard;
                                                if (aweme2 == null || (cardInsertInfo7 = aweme2.getCardInsertInfo()) == null || (lynxTemplate = cardInsertInfo7.getLynxTemplate()) == null || lynxTemplate.getLoadEntranceType() != 1 || (iViewPagerComponentAbility = C20551815bQ.LJ) == null || iViewPagerComponentAbility.LLLIIIL() != 0) {
                                                    return;
                                                }
                                                C013C c013c3 = c013c;
                                                if (!c013c3.element) {
                                                    c013c3.element = true;
                                                    C080A.LIZ(C080C.REALTIME_SPECIAL_CARD, "load_lynx", showTiming, string);
                                                }
                                                C20551815bQ c20551815bQ2 = C20551815bQ.LIZ;
                                                RealTimeCardModel realTimeCardModel3 = realTimeCardModel;
                                                c20551815bQ2.getClass();
                                                C20551815bQ.LIZJ(realTimeCardModel3);
                                            }

                                            @Override // X.AbstractC20553815bk
                                            public final void LIZLLL() {
                                                C20571615ec.LIZ.getClass();
                                                C20571615ec.LIZ("lynx card load: onLoadStart");
                                            }

                                            @Override // X.AbstractC20553815bk
                                            public final void LJ() {
                                                C20571615ec.LIZ.getClass();
                                                C20571615ec.LIZ("lynx card load: onReceivedError");
                                            }

                                            @Override // X.AbstractC20552515bX
                                            public final void LJFF() {
                                                Aweme aweme2;
                                                CardInsertInfo cardInsertInfo7;
                                                LynxTemplate lynxTemplate;
                                                IViewPagerComponentAbility iViewPagerComponentAbility;
                                                C20571615ec.LIZ.getClass();
                                                C20571615ec.LIZJ("RealTimeCard lynx card load: onCardTypeLynxLoadFinish");
                                                if (!C305450ByB.LIZ || (aweme2 = realTimeCardModel.feedCard) == null || (cardInsertInfo7 = aweme2.getCardInsertInfo()) == null || (lynxTemplate = cardInsertInfo7.getLynxTemplate()) == null || lynxTemplate.getLoadEntranceType() != 2 || (iViewPagerComponentAbility = C20551815bQ.LJ) == null || iViewPagerComponentAbility.LLLIIIL() != 0) {
                                                    return;
                                                }
                                                C013C c013c2 = c013c;
                                                if (!c013c2.element) {
                                                    c013c2.element = true;
                                                    C080A.LIZ(C080C.REALTIME_SPECIAL_CARD, "load_lynx", showTiming, string);
                                                }
                                                C20551815bQ c20551815bQ = C20551815bQ.LIZ;
                                                RealTimeCardModel realTimeCardModel2 = realTimeCardModel;
                                                c20551815bQ.getClass();
                                                C20551815bQ.LIZJ(realTimeCardModel2);
                                            }

                                            @Override // X.AbstractC20553815bk
                                            public final void LIZIZ(String str3, C1542120qEU c1542120qEU) {
                                                C20571615ec.LIZ.getClass();
                                                C20571615ec.LIZ("lynx card load: onLoadFailed");
                                                C080C c080c = C080C.REALTIME_SPECIAL_CARD;
                                                String str4 = showTiming;
                                                String str5 = string;
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("url=");
                                                sbLIZ4.append(str3);
                                                sbLIZ4.append(", code=");
                                                sbLIZ4.append(c1542120qEU.LIZ);
                                                sbLIZ4.append(", msg=");
                                                sbLIZ4.append(c1542120qEU.LIZIZ);
                                                C080G.LIZJ(c080c, "load_lynx", str4, str5, 60101, C2188811AlT.LIZIZ(sbLIZ4), fetchLogId, 128);
                                            }
                                        };
                                        c20553215be.getClass();
                                        C20553215be.LIZ(activityLIZ, "homepage_hot", aweme, null, abstractC20552515bX);
                                    }
                                }
                                C20571615ec.LIZ.getClass();
                                C20571615ec.LIZJ("RealTimeCard, load spark");
                                C0T5M c0t5m = C0T5M.LIZ;
                                Callable callable = new Callable() { // from class: X.15bY
                                    public final /* synthetic */ String LLILLJJLI = "homepage_hot";

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        Unit unit;
                                        C1C7U.LIZ("MutantCardMobHelper@6495.cardMob4Server$1");
                                        CardInsertInfo cardInsertInfo7 = aweme.getCardInsertInfo();
                                        if (cardInsertInfo7 != null) {
                                            String str3 = this.LLILLJJLI;
                                            Aweme aweme2 = aweme;
                                            int cardSource = cardInsertInfo7.getCardSource();
                                            if (cardSource == 1) {
                                                C2344009Gk c2344009Gk = new C2344009Gk();
                                                c2344009Gk.LJIIIIZZ("enter_from", str3);
                                                c2344009Gk.LIZJ(cardInsertInfo7.getCardType(), "card_id");
                                                c2344009Gk.LJIIIIZZ("aweme_id", aweme2.getAid());
                                                c2344009Gk.LJIIIIZZ("business_type", C20552315bV.LJI(1, String.valueOf(cardInsertInfo7.getCardType())));
                                                c2344009Gk.LJIIIIZZ("card_type", C20552315bV.LJIIIZ(aweme2));
                                                c2344009Gk.LJIIIIZZ("card_source", "fcp");
                                                c2344009Gk.LIZJ(0, "is_uninsertion_card");
                                                LynxTemplate lynxTemplate = cardInsertInfo7.getLynxTemplate();
                                                c2344009Gk.LJIIIIZZ("biz_info", lynxTemplate != null ? lynxTemplate.getBizInfo() : null);
                                                CardInsertInfo cardInsertInfo8 = aweme2.getCardInsertInfo();
                                                c2344009Gk.LIZJ(cardInsertInfo8 != null ? cardInsertInfo8.isRealTime() : 0, "is_realtime");
                                                CardInsertInfo cardInsertInfo9 = aweme2.getCardInsertInfo();
                                                c2344009Gk.LJIIIIZZ("show_timing", cardInsertInfo9 != null ? cardInsertInfo9.getShowTiming() : null);
                                                C20684815ws.LJIILLIIL("special_shaped_card_server", c2344009Gk.LIZ);
                                            } else if (cardSource == 2) {
                                                C2344009Gk c2344009Gk2 = new C2344009Gk();
                                                c2344009Gk2.LJIIIIZZ("enter_from", str3);
                                                c2344009Gk2.LJIIIIZZ("card_id", "fyp_server");
                                                c2344009Gk2.LJIIIIZZ("aweme_id", aweme2.getAid());
                                                c2344009Gk2.LJIIIIZZ("business_type", C20552315bV.LJI(2, "fyp_server"));
                                                c2344009Gk2.LJIIIIZZ("card_type", C20552315bV.LJIIIZ(aweme2));
                                                c2344009Gk2.LJIIIIZZ("card_source", "fyp");
                                                c2344009Gk2.LIZJ(0, "is_uninsertion_card");
                                                LynxTemplate lynxTemplate2 = cardInsertInfo7.getLynxTemplate();
                                                c2344009Gk2.LJIIIIZZ("biz_info", lynxTemplate2 != null ? lynxTemplate2.getBizInfo() : null);
                                                CardInsertInfo cardInsertInfo10 = aweme2.getCardInsertInfo();
                                                c2344009Gk2.LIZJ(cardInsertInfo10 != null ? cardInsertInfo10.isRealTime() : 0, "is_realtime");
                                                CardInsertInfo cardInsertInfo11 = aweme2.getCardInsertInfo();
                                                c2344009Gk2.LJIIIIZZ("show_timing", cardInsertInfo11 != null ? cardInsertInfo11.getShowTiming() : null);
                                                C20684815ws.LJIILLIIL("special_shaped_card_server", c2344009Gk2.LIZ);
                                            }
                                            unit = Unit.LIZ;
                                        } else {
                                            unit = null;
                                        }
                                        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMob4Server$1");
                                        return unit;
                                    }
                                };
                                c0t5m.getClass();
                                C0T5M.LIZIZ(callable);
                            } else {
                                List<CardInsertResultInfo> list = realTimeCardModel.cardInsertResults;
                                if (list == null || (cardInsertResultInfo3 = (CardInsertResultInfo) ListProtector.get(list, 0)) == null || cardInsertResultInfo3.cardInsertStatus != 20000) {
                                    C20571615ec c20571615ec3 = C20571615ec.LIZ;
                                    StringBuilder sb = new StringBuilder("RealTimeCard, cardInsertStatus not 20000, card_insert_status: ");
                                    List<CardInsertResultInfo> list2 = realTimeCardModel.cardInsertResults;
                                    if (list2 != null && (cardInsertResultInfo2 = (CardInsertResultInfo) ListProtector.get(list2, 0)) != null) {
                                        numValueOf = Integer.valueOf(cardInsertResultInfo2.cardInsertStatus);
                                    } else {
                                        numValueOf = null;
                                    }
                                    sb.append(numValueOf);
                                    String string2 = sb.toString();
                                    c20571615ec3.getClass();
                                    C20571615ec.LIZIZ(string2);
                                    String typeName2 = EnumC20654715s1.SPECIAL_CARD.getTypeName();
                                    StringBuilder sb2 = new StringBuilder("cardInsertStatus not 20000, card_insert_status: ");
                                    List<CardInsertResultInfo> list3 = realTimeCardModel.cardInsertResults;
                                    if (list3 != null && (cardInsertResultInfo = (CardInsertResultInfo) ListProtector.get(list3, 0)) != null) {
                                        numValueOf2 = Integer.valueOf(cardInsertResultInfo.cardInsertStatus);
                                    }
                                    sb2.append(numValueOf2);
                                    C080G.LIZLLL("outreach_data_parse", str, typeName2, 40004, sb2.toString(), str2, null, 136);
                                }
                            }
                        }
                    } else {
                        aweme = null;
                    }
                    C20571615ec.LIZ.getClass();
                    C20571615ec.LIZIZ("RealTimeCard, fetch no valid card content");
                    String typeName3 = EnumC20654715s1.SPECIAL_CARD.getTypeName();
                    StringBuilder sb3 = new StringBuilder("no valid card content, cardInsertStatus=");
                    if (aweme != null && (cardInsertInfo2 = aweme.getCardInsertInfo()) != null) {
                        cardInsertStatus = cardInsertInfo2.getCardInsertStatus();
                    } else {
                        cardInsertStatus = null;
                    }
                    sb3.append(cardInsertStatus);
                    sb3.append(", cardImplType=");
                    if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
                        numValueOf2 = Integer.valueOf(cardInsertInfo.getCardImplType());
                    }
                    sb3.append(numValueOf2);
                    C080G.LIZLLL("outreach_data_parse", str, typeName3, 40003, sb3.toString(), str2, null, 136);
                }
                ((ArrayList) C20551815bQ.LJIIIIZZ).clear();
            }
        };
    }

    public static void LIZ(String str) {
        HashSet<String> hashSet = LJIIIZ;
        if (!hashSet.contains(str)) {
            HashSet<String> hashSet2 = LJIIJ;
            if (!hashSet2.contains(str)) {
                if (hashSet.size() > 100) {
                    hashSet2.clear();
                    hashSet2.addAll(hashSet);
                    hashSet.clear();
                }
                hashSet.add(str);
            }
        }
    }

    public static void LIZJ(RealTimeCardModel realTimeCardModel) {
        C786410Ut5.LJJZZIII((Handler) LJIIL.getValue(), new ARunnableS131S0100000_31(realTimeCardModel, 179));
    }

    @C14EU
    public final void onDeleteAwemeEvent(C1210880hcE c1210880hcE) {
        String groupId;
        CardInsertInfo cardInsertInfo;
        String groupId2;
        RealTimeCardModel realTimeCardModel = LJI;
        if (realTimeCardModel != null) {
            Aweme aweme = realTimeCardModel.feedCard;
            if (aweme != null) {
                groupId2 = aweme.getGroupId();
            } else {
                groupId2 = null;
            }
            if (Intrinsics.LJFF(groupId2, c1210880hcE.LIZ.getGroupId())) {
                C20571615ec c20571615ec = C20571615ec.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RealTimeCard: delete waitInsertCardModel: ");
                sbLIZ.append(c1210880hcE.LIZ.getGroupId());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c20571615ec.getClass();
                C20571615ec.LIZJ(strLIZIZ);
                LJI = null;
            }
        }
        Integer numValueOf = null;
        for (Map.Entry entry : ((LinkedHashMap) LJII).entrySet()) {
            Aweme aweme2 = ((RealTimeCardModel) entry.getValue()).feedCard;
            if (aweme2 != null) {
                groupId = aweme2.getGroupId();
            } else {
                groupId = null;
            }
            if (Intrinsics.LJFF(groupId, c1210880hcE.LIZ.getGroupId())) {
                Aweme aweme3 = ((RealTimeCardModel) entry.getValue()).feedCard;
                if (aweme3 != null && (cardInsertInfo = aweme3.getCardInsertInfo()) != null) {
                    numValueOf = Integer.valueOf(cardInsertInfo.getCardType());
                } else {
                    numValueOf = null;
                }
                C20571615ec c20571615ec2 = C20571615ec.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RealTimeCard: delete waitConsumeCardModel: ");
                sbLIZ2.append(c1210880hcE.LIZ.getGroupId());
                sbLIZ2.append(", cardType: ");
                sbLIZ2.append(numValueOf);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c20571615ec2.getClass();
                C20571615ec.LIZJ(strLIZIZ2);
            }
        }
        if (numValueOf != null) {
            LJII.remove(Integer.valueOf(numValueOf.intValue()));
        }
    }

    public static void LIZIZ(int i, String str, String str2, String str3, Integer num) {
        String string;
        C080C c080c = C080C.REALTIME_SPECIAL_CARD;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C080G.LIZJ(c080c, "card_insert", str, string, i, str3, str2, 128);
    }
}
