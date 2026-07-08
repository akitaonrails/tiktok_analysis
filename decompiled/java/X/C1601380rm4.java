package X;

import Y.ACallableS416S0100000_9;
import Y.ACallableS429S0100000_24;
import Y.AObjectS398S0100000_24;
import Y.ARunnableS2S2000000_9;
import Y.ARunnableS37S0300000_4;
import Y.ARunnableS88S0000000_9;
import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.midad.IPostRollAdService;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.ab.FeedResponseFilterRoutingConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.ss.android.ugc.aweme.util.IStartupFeedAwemesService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1601380rm4 extends AbstractC1255880imo<Aweme, FeedItemList> implements InterfaceC606900NrE {
    public static int LLJJJ;
    public static boolean LLJJJIL;
    public static boolean LLJJJJ;
    public C1601390rm5 LL;
    public int LLILLJJLI;
    public int LLILLL;
    public FeedItemList LLILZ;
    public C1566410qrf LLILZIL;
    public C1212490hep LLILZLL;
    public boolean LLIZLLLIL;
    public InterfaceC1864007Ru LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final boolean LLJJ;
    public final C1601400rm6 LLJJI;
    public final C0S4J LLJJIII;
    public final IStartupFeedAwemesService LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLIZ = true;
    public final boolean LLJILJIL = ((IPostRollAdService) ServiceManager.get().getService(IPostRollAdService.class)).LIZ();
    public final AtomicBoolean LLJILJILJ = new AtomicBoolean(false);
    public final List<InterfaceC1601540rmK> LLJILLL = new ArrayList();

    public void LJJIJIIJIL(List<Aweme> list, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJJIJL() {
        for (int i = 0; i < ((FeedItemList) this.mData).getItems().size(); i++) {
            AwemeBizExtKt.setAwemePosition((Aweme) ListProtector.get(((FeedItemList) this.mData).getItems(), i), i);
        }
    }

    public static boolean LJJII() {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
        return iLiveOuterService != null && iLiveOuterService.S3().LJIIIIZZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJJIZ() {
        T t;
        int size;
        if (((Boolean) C300500BqC.LJ.getValue()).booleanValue()) {
            int i = this.mListQueryType;
            if ((i != 4 && i != 16) || (t = this.mData) == 0 || ((FeedItemList) t).getItems() == null) {
                return;
            }
            int iLIZIZ = C300500BqC.LIZIZ();
            int iLIZ = C300500BqC.LIZ();
            if (iLIZIZ <= 0 || iLIZ <= 0 || (size = ((FeedItemList) this.mData).getItems().size()) <= iLIZIZ) {
                return;
            }
            ((FeedItemList) this.mData).setItems(new ArrayList(((FeedItemList) this.mData).getItems().subList(Math.min(iLIZ, size), size)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((FeedItemList) t).getItems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((FeedItemList) t).isHasMore();
    }

    @Override // X.AbstractC1255880imo
    public final boolean needCheckEmptyForQueryType() {
        return 9 != this.mListQueryType;
    }

    public C1601380rm4() {
        boolean z = ((Number) C269510AhJ.LIZ.getValue()).intValue() == 2;
        this.LLJJ = z;
        this.LLJJI = null;
        this.LLJJIII = new C0S4J("FeedFetchModel");
        this.LLJJIJI = (IStartupFeedAwemesService) PluggableExtentionKt.pluggableSpi(IStartupFeedAwemesService.class);
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = -1;
        this.mCount = 6;
        if (z) {
            this.LLJJI = new C1601400rm6(this);
        }
    }

    @Override // X.AbstractC1255880imo
    public int getListCount() {
        List<Aweme> items = getItems();
        if (items == null) {
            return 0;
        }
        return items.size();
    }

    public static boolean LJJIII(Message message) {
        if (message != null && message.getData() != null && message.getData().getBoolean("is_from_feed_cache")) {
            return true;
        }
        return false;
    }

    public static void LJJIIJZLJL(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("invoke", str);
            C20684815ws.LJIILLIIL("feed_model_monitor", c2344009Gk.LIZ);
            C1AF0.LIZJ("feed_model_monitor");
        }
    }

    public static void LJJIIZ(C0J8D c0j8d) {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
        if (iLiveOuterService != null) {
            iLiveOuterService.S3().LIZIZ(c0j8d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIIJ(List<Aweme> list) {
        try {
            ((FeedItemList) this.mData).getItems().addAll(list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((FeedItemList) this.mData).setItems(list);
        }
    }

    public int LJIIJJI(Aweme aweme) {
        return C729980SkG.LIZ(aweme, getItems());
    }

    @Override // X.AbstractC1255880imo
    /* JADX INFO: renamed from: LJIIL, reason: merged with bridge method [inline-methods] */
    public final boolean deleteItem(Aweme aweme) {
        LJJIIJZLJL("deleteItem");
        if (SplashSettingServiceImpl.LIZJ().LIZ() && this.mData == 0 && C1030680cva.LJIIJJI(aweme) && C1030680cva.LJ) {
            C1440005kM.LIZ(new C034H(aweme));
            return true;
        }
        int iLJIIJJI = LJIIJJI(aweme);
        C729980SkG.LJIIL(aweme, this.mNotifyListeners, iLJIIJJI);
        if (iLJIIJJI >= 0) {
            return true;
        }
        return false;
    }

    public void LJIILJJIL(List<Aweme> list) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            LJIIJJI((Aweme) ListProtector.get(list, i));
        }
    }

    public final void LJIILLIIL(FeedItemList feedItemList) {
        List<Aweme> items;
        boolean zBooleanValue;
        if (feedItemList != null && (items = feedItemList.getItems()) != null && !items.isEmpty()) {
            ListIterator<Aweme> listIterator = items.listIterator();
            try {
                zBooleanValue = C0CLW.LIZIZ.LIZ.getDiscardRefreshTopDsp().booleanValue();
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
                zBooleanValue = true;
            }
            InterfaceC582800MtS interfaceC582800MtSLJI = C1029590ctp.LJI();
            int i = 0;
            while (listIterator.hasNext()) {
                Aweme next = listIterator.next();
                if (next == null) {
                    listIterator.remove();
                } else {
                    interfaceC582800MtSLJI.getClass();
                    if (C1045220dJ2.LJIIIZ(next) || C1045220dJ2.LJIIIIZZ(next)) {
                        if (this.mListQueryType == 1 && i < 3 && C1019620cdk.LIZIZ(3, next)) {
                            if (zBooleanValue) {
                                listIterator.remove();
                            } else {
                                C1045220dJ2.LJIIJ(next, null, null, true);
                                if (C1019620cdk.LIZ(next, false)) {
                                    listIterator.remove();
                                }
                            }
                        } else {
                            C1045220dJ2.LJIIJ(next, C15O7.LJI, null, false);
                        }
                    }
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARN: Type inference failed for: r0v58, types: [X.0rmF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(final X.C1601460rmC r27) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601380rm4.LJIJ(X.0rmC):void");
    }

    public final void LJIJI(FeedItemList feedItemList) {
        if (!C1594710rbJ.LIZ() || feedItemList == null || C086I.LIZIZ(feedItemList.getItems()) || feedItemList.getItems() == null || feedItemList.isLiveTopGifterColdStart) {
            return;
        }
        Iterator<Aweme> it2 = feedItemList.getItems().iterator();
        ArrayList arrayList = new ArrayList();
        while (it2.hasNext()) {
            Aweme next = it2.next();
            if (C1594680rbG.LIZ(next)) {
                it2.remove();
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            LJJIIZI(feedItemList, arrayList, "filter_duplicate_live");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x04d2, code lost:
    
        r6 = r26.getItems().iterator();
        r2 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04e3, code lost:
    
        if (r6.hasNext() == false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04e5, code lost:
    
        r1 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04f7, code lost:
    
        if (((com.ss.android.ugc.aweme.compliance.api.services.amberalert.IAmberAlertService) com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJJII.getValue()).LIZ(r1) == false) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04f9, code lost:
    
        r6.remove();
        r2.add(r1);
        X.C20684815ws.onEventV3("tt_amber_alert_data_invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0505, code lost:
    
        LJJIIZI(r26, r2, "filter_illegal_amber_alert");
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(final com.ss.android.ugc.aweme.feed.model.FeedItemList r26) {
        /*
            Method dump skipped, instruction units count: 2496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601380rm4.LJIJJ(com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }

    public final void LJIL(List<Aweme> list) {
        LJIILJJIL(list);
        ArrayList arrayList = new ArrayList(this.LLJILLL);
        for (int i = 0; i < arrayList.size(); i++) {
            ((InterfaceC1601540rmK) ListProtector.get(arrayList, i)).LJIIIZ(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0628  */
    /* JADX WARN: Type inference failed for: r1v68, types: [T, com.ss.android.ugc.aweme.feed.model.FeedItemList] */
    @Override // X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJJI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleData(com.ss.android.ugc.aweme.feed.model.FeedItemList r18) {
        /*
            Method dump skipped, instruction units count: 2007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601380rm4.handleData(com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }

    public void LJJIFFI(C0PN1<Aweme> c0pn1) {
        LJJIIJZLJL("insertItems");
        List items = getItems();
        int i = c0pn1.LIZIZ;
        List<Aweme> list = c0pn1.LIZ;
        if (items == null) {
            items = new ArrayList();
        }
        if (i >= 0 && i <= items.size()) {
            items.addAll(i, list);
            if (items.size() == 1) {
                setItems(items);
            }
            C1030680cva.LJIJI = true;
            C584470Mw9.LJIIZILJ.put("has_splash", "1");
            C0PN0 c0pn0 = new C0PN0(c0pn1, items);
            List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
            if (list2 != null && list2.size() != 0) {
                for (InterfaceC1526205yG interfaceC1526205yG : this.mNotifyListeners) {
                    if (interfaceC1526205yG instanceof InterfaceC1255940imu) {
                        InterfaceC1255940imu interfaceC1255940imu = (InterfaceC1255940imu) interfaceC1526205yG;
                        if (!interfaceC1255940imu.B1(c0pn0)) {
                            interfaceC1255940imu.w(c0pn0.LIZIZ, c0pn0.LJFF);
                        }
                    }
                }
            }
            if (C295980Biu.LIZ()) {
                List<Aweme> items2 = getItems();
                C1347505Pd c1347505Pd = C1347505Pd.LIZ;
                if (items2 != null) {
                    ArrayList arrayList = new ArrayList(items2);
                    C1347505Pd.LIZ.getClass();
                    C23250099c.LIZLLL(C1347505Pd.LIZIZ(), null, null, new C1347405Pc(arrayList, null), 3);
                    return;
                }
                return;
            }
            return;
        }
        throw new C646010PVn(i, items.size());
    }

    public final void LJJJ(FeedItemList feedItemList) {
        List<Aweme> items;
        if (feedItemList != null && (items = feedItemList.getItems()) != null && !items.isEmpty()) {
            if (this.LLJ == null) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("FEED_UR_DOWNGRADE", "[ERROR] tryInsertRecommendUserCard - recUserBigCardController is null");
                return;
            }
            int i2 = this.mListQueryType;
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[FeedFetchModel] queryType = ");
            sbLIZ.append(i2);
            sbLIZ.append(" and aweme size is ");
            sbLIZ.append(items.size());
            c2276471E8n.d("TTRecUser", C2188811AlT.LIZIZ(sbLIZ));
            if (i2 != 1 && i2 != 2) {
                if (i2 != 4) {
                    return;
                } else {
                    this.LLJJIJIL++;
                }
            } else {
                this.LLJJIJIL = 0;
            }
            Pair<Integer, Aweme> pairLIZIZ = this.LLJ.LIZIZ(this.LLJJIJIL, items, feedItemList.getRequestId(), new AObjectS398S0100000_24(this, 19));
            if (pairLIZIZ != null) {
                LJJIJ(feedItemList, pairLIZIZ.getSecond(), pairLIZIZ.getFirst().intValue(), "friend_recommend_card");
            }
        }
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 2 && (objArr[1] instanceof C1601460rmC)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final void clearNotifyListener(InterfaceC1526205yG interfaceC1526205yG) {
        super.clearNotifyListener(interfaceC1526205yG);
        ((ArrayList) this.LLJILLL).clear();
        if (((FeedResponseFilterRoutingConfig) C162700jp.LIZIZ.getValue()).enable) {
            C1601060rlY.LIZ = null;
            C1589420rSm.LIZ.LIZ = null;
        }
    }

    @Override // X.AbstractC1255880imo
    public int deleteItems(List<Aweme> list) {
        LJJIIJZLJL("deleteItems");
        if (C086I.LIZIZ(list)) {
            return 0;
        }
        List<Aweme> items = getItems();
        List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
        if (!C086I.LIZIZ(items) && !C086I.LIZIZ(list)) {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                int iLIZ = C729980SkG.LIZ(aweme, items);
                if (iLIZ >= 0) {
                    arrayList.add(aweme);
                    map.put(Integer.valueOf(iLIZ), aweme);
                }
            }
            C729980SkG.LJIILIIL(list2, arrayList);
            if (!map.isEmpty()) {
                return map.size();
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x049e A[Catch: Exception -> 0x050e, TryCatch #0 {Exception -> 0x050e, blocks: (B:226:0x0483, B:228:0x0489, B:230:0x048f, B:231:0x0498, B:233:0x049e, B:235:0x04b1, B:237:0x04b6, B:239:0x04bd, B:242:0x04c3, B:244:0x04cd, B:245:0x04dd, B:247:0x04e6, B:249:0x04ee, B:253:0x0504, B:255:0x050a, B:250:0x04fd), top: B:266:0x0483 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04fd A[Catch: Exception -> 0x050e, TryCatch #0 {Exception -> 0x050e, blocks: (B:226:0x0483, B:228:0x0489, B:230:0x048f, B:231:0x0498, B:233:0x049e, B:235:0x04b1, B:237:0x04b6, B:239:0x04bd, B:242:0x04c3, B:244:0x04cd, B:245:0x04dd, B:247:0x04e6, B:249:0x04ee, B:253:0x0504, B:255:0x050a, B:250:0x04fd), top: B:266:0x0483 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0417 A[EDGE_INSN: B:279:0x0417->B:199:0x0417 BREAK  A[LOOP:2: B:192:0x03fe->B:205:0x0437], SYNTHETIC] */
    @Override // X.AbstractC666100QAu, com.bytedance.common.utility.collection.WeakHandler.IHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMsg(android.os.Message r16) {
        /*
            Method dump skipped, instruction units count: 1323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601380rm4.handleMsg(android.os.Message):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadCache(Object... objArr) {
        T t;
        C104100aN.LIZ().isNewUser();
        if (C1601370rm3.LIZ && ((Boolean) C10VV.LIZ.getValue()).booleanValue() && (t = this.mData) != 0) {
            FeedItemList feedItemListM202clone = ((FeedItemList) t).m202clone();
            C590950NFt c590950NFt = C590950NFt.LIZ;
            getItems();
            LinkedList<Aweme> linkedList = C590950NFt.LJIIIZ;
            if (linkedList.size() > 0) {
                feedItemListM202clone.setItems(linkedList);
                C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS416S0100000_9(feedItemListM202clone, 13), 0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadLatestList(Object... objArr) {
        long j;
        C1601460rmC c1601460rmC = (C1601460rmC) objArr[1];
        this.LLILLJJLI = c1601460rmC.LIZ;
        this.LLILLL = c1601460rmC.LIZIZ;
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = -1;
        }
        long j2 = ((FeedItemList) this.mData).minCursor;
        C1601440rmA c1601440rmA = new C1601440rmA(c1601460rmC);
        c1601440rmA.LIZIZ(this.mCount);
        c1601440rmA.LIZJ(j);
        c1601440rmA.LIZLLL(j2);
        c1601440rmA.LJIILJJIL = false;
        c1601440rmA.LJJIFFI = false;
        c1601440rmA.LJJI = false;
        LJIJ(c1601440rmA.LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        long j;
        T t;
        C1601460rmC c1601460rmC = (C1601460rmC) objArr[1];
        int i = c1601460rmC.LIZ;
        this.LLILLJJLI = i;
        int i2 = c1601460rmC.LIZIZ;
        this.LLILLL = i2;
        this.mSmartType = c1601460rmC.LJJIIJZLJL;
        if (i2 == 2 && i == 0 && (t = this.mData) != 0) {
            c1601460rmC.LJJIJIIJI = ((FeedItemList) t).getRequestId();
        }
        T t2 = this.mData;
        if (t2 == 0) {
            j = 0;
        } else {
            j = ((FeedItemList) t2).maxCursor;
        }
        C1601440rmA c1601440rmA = new C1601440rmA(c1601460rmC);
        c1601440rmA.LIZJ(j);
        c1601440rmA.LIZLLL(-1L);
        c1601440rmA.LJJIFFI = false;
        c1601440rmA.LIZIZ(this.mCount);
        LJIJ(c1601440rmA.LIZ());
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        C1601460rmC c1601460rmC = (C1601460rmC) objArr[1];
        int i = c1601460rmC.LIZ;
        this.LLILLJJLI = i;
        this.LLILLL = c1601460rmC.LIZIZ;
        boolean z = c1601460rmC.LJJIIJ;
        this.LLJI = z;
        this.LLJIJIL = c1601460rmC.LJJJJL;
        if (i == 0) {
            this.LLIZ = false;
        }
        if (z) {
            C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS429S0100000_24(this, 9), 0);
        } else {
            LJIJ(c1601460rmC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    @Override // X.AbstractC1255880imo, X.AbstractC666100QAu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean sendRequest(java.lang.Object... r7) {
        /*
            r6 = this;
            r0 = 137703(0x219e7, float:1.92963E-40)
            boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r6.checkParams(r7)
            r4 = 0
            if (r0 != 0) goto L14
            if (r5 == 0) goto L13
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L13:
            return r4
        L14:
            r2 = 1
            r6.mIsLoading = r2
            r3 = r7[r2]
            X.0rmC r3 = (X.C1601460rmC) r3
            int r1 = X.C1601380rm4.LLJJJ
            int r0 = r1 + 1
            X.C1601380rm4.LLJJJ = r0
            r3.LJJJJ = r1
            X.0rmP r3 = r3.LJJJ
            if (r3 == 0) goto L34
            int r1 = r6.getListCount()
            if (r1 <= 0) goto L34
            X.0qrf r0 = r6.LLILZIL
            int r0 = r0.LIZIZ
            int r1 = r1 - r0
            r3.LIZIZ = r1
        L34:
            r0 = r7[r4]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r6.mListQueryType = r0
            boolean r0 = r6.needCheckEmptyForQueryType()
            if (r0 == 0) goto L4c
            boolean r0 = r6.isDataEmpty()
            if (r0 == 0) goto L4c
            r6.mListQueryType = r2
        L4c:
            int r1 = r6.mListQueryType
            if (r1 == r2) goto L83
            r0 = 2
            if (r1 == r0) goto L7f
            r0 = 4
            if (r1 == r0) goto L7b
            r0 = 16
            if (r1 == r0) goto L77
            r0 = 8
            if (r1 == r0) goto L7b
            r0 = 9
            if (r1 != r0) goto L71
            r1 = r7[r2]
            X.0rmC r1 = (X.C1601460rmC) r1
            int r0 = r1.LIZ
            r6.LLILLJJLI = r0
            int r0 = r1.LIZIZ
            r6.LLILLL = r0
            r6.LJIJ(r1)
        L71:
            if (r5 == 0) goto L76
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L76:
            return r2
        L77:
            r6.loadCache(r7)
            goto L71
        L7b:
            r6.loadMoreList(r7)
            goto L71
        L7f:
            r6.loadLatestList(r7)
            goto L71
        L83:
            r6.refreshList(r7)
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1601380rm4.sendRequest(java.lang.Object[]):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public void setItems(List<Aweme> list) {
        T t = this.mData;
        if (t != 0) {
            ((FeedItemList) t).setItems(list);
        }
    }

    public static final boolean LJIILL(Aweme aweme, Aweme aweme2) {
        if (C1594720rbK.LIZIZ(aweme)) {
            C301980Bsa.LIZ.getClass();
            if (!C1594720rbK.LIZJ(aweme2, C301980Bsa.LIZ())) {
                return false;
            }
            return true;
        }
        if (!aweme.isAd()) {
            return true;
        }
        if (aweme.getAwemeRawAd() == null) {
            return false;
        }
        return aweme.getAwemeRawAd().isEnableFilterSameVideo();
    }

    public static Aweme LJIJJLI(Aweme aweme, List list) {
        if (list == null) {
            return null;
        }
        C290400BZu.LIZ.getClass();
        if (((Number) C290400BZu.LIZIZ.getValue()).intValue() == 1) {
            for (int size = list.size() - 1; size > -1; size--) {
                Aweme aweme2 = (Aweme) ListProtector.get(list, size);
                if (aweme2 != null) {
                    if (TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                        return aweme2;
                    }
                    if (!TextUtils.isEmpty(aweme.getGroupId()) && TextUtils.equals(aweme.getGroupId(), aweme2.getGroupId()) && !aweme2.isAd() && !AwemeSaaSExtKt.isLive(aweme2)) {
                        return aweme2;
                    }
                }
            }
        } else {
            int iLJIIJ = C729980SkG.LJIIJ(aweme, list);
            if (iLJIIJ >= 0) {
                return (Aweme) ListProtector.get(list, iLJIIJ);
            }
        }
        return null;
    }

    public static boolean LJJIIJ(Aweme aweme, List list) {
        if (list == null) {
            return false;
        }
        for (int size = list.size() - 1; size > -1; size--) {
            Aweme aweme2 = (Aweme) ListProtector.get(list, size);
            if (aweme2 != null && C2245741Cv6.LIZJ(aweme2) && aweme2.getAwemeRawAd() != null && aweme2.getAwemeRawAd().getCreativeId() != null) {
                HashMap<String, Aweme> map = C0N6Z.LIZ;
                Aweme awemeLIZ = C0N6Z.LIZ(aweme2.getAwemeRawAd().getCreativeId().toString());
                if (awemeLIZ != null && aweme != null && TextUtils.equals(awemeLIZ.getAid(), aweme.getAid())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJJIJLIJ(int i, FeedItemList feedItemList) {
        if (C798410VTr.LIZ()) {
            HashMap map = new HashMap();
            map.put("monitor_scene", "scene_feed_data");
            map.put("vv_code", Integer.valueOf(i));
            map.put("data_query_type", Integer.valueOf(this.mListQueryType));
            if (feedItemList != null && feedItemList.getItems() != null && feedItemList.getItems().size() != 0) {
                map.put("data_is_null_or_empty", 0);
                if (i == 6210) {
                    map.put("data_process_size", Integer.valueOf(feedItemList.getItems().size()));
                } else {
                    map.put("data_receive_size", Integer.valueOf(feedItemList.getItems().size()));
                }
                if (C1220604q4.LIZ() && !((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJII()) {
                    map.put("first_feed_type", Integer.valueOf(((Aweme) ListProtector.get(feedItemList.getItems(), 0)).getAwemeType()));
                }
            } else {
                map.put("data_is_null_or_empty", 1);
            }
            C798410VTr.LJFF(map);
        }
    }

    public final void LJJIIZI(FeedItemList feedItemList, List<Aweme> list, String str) {
        if (feedItemList != null && list != null) {
            if (C04VM.LIZ()) {
                String requestId = feedItemList.getRequestId();
                for (int i = 0; i < list.size(); i++) {
                    Aweme aweme = (Aweme) ListProtector.get(list, i);
                    String aid = aweme.getAid();
                    if (aid != null) {
                        C20684815ws.LJFF().submit(new C01YZ(aid, requestId, aweme));
                    }
                }
            }
            C606470NqX.LIZ(list.size(), str, feedItemList.getRequestId());
            C0S4J c0s4j = this.LLJJIII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onResponseItemBatchDeleted] by ");
            sbLIZ.append(str);
            sbLIZ.append(" items: ");
            sbLIZ.append(list.size());
            c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            ArrayList arrayList = new ArrayList(this.LLJILLL);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((InterfaceC1601540rmK) arrayList.get(i2)).LJI(feedItemList, list, str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "feedapi");
        }
    }

    public List LJJIJIIJI(int i, int i2, List list) {
        List items = getItems();
        if (C086I.LIZIZ(items)) {
            items = new ArrayList();
        }
        List listSubList = items.subList(i, i2);
        ArrayList arrayList = new ArrayList(listSubList);
        listSubList.clear();
        listSubList.addAll(list);
        setItems(items);
        return arrayList;
    }

    public final void LJJIJIL(Message message, Message message2, boolean z) {
        Activity topActivity;
        Activity topActivity2;
        int iIntValue;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
        if (z && iLiveOuterService != null && LJJII()) {
            iLiveOuterService.S3().LJIILJJIL(message);
            return;
        }
        if (message != null && message.getData() != null && message.getData().getBoolean("is_from_change_uid_used_cache") && (iIntValue = ((Number) C257600A7q.LIZ.getValue()).intValue()) > 0) {
            this.mHandler.sendMessageDelayed(message, iIntValue);
            return;
        }
        if (C052X.LIZ()) {
            if (((Boolean) C1601700rma.LIZ.getValue()).booleanValue() && LJJIII(message) && ((IOptimizerHelperService) ServiceManager.get().getService(IOptimizerHelperService.class)).LJFF() && (topActivity2 = ActivityStack.getTopActivity()) != null) {
                topActivity2.getWindow().getDecorView().postOnAnimation(new ARunnableS88S0000000_9(25));
            }
            if (C0BSR.LIZ && LJJIII(message) && (topActivity = ActivityStack.getTopActivity()) != null) {
                topActivity.getWindow().getDecorView().postOnAnimation(new ARunnableS37S0300000_4(this, message, message2, 19));
                return;
            } else {
                C20639086r.LIZLLL(new ARunnableS37S0300000_4(this, message, message2, 20));
                return;
            }
        }
        this.mHandler.sendMessageAtFrontOfQueue(message);
    }

    public final void LJJIJ(FeedItemList feedItemList, Aweme aweme, int i, String str) {
        if (feedItemList != null) {
            C20684815ws.LJFF().execute(new ARunnableS2S2000000_9(str, feedItemList.getRequestId(), 1));
            C0S4J c0s4j = this.LLJJIII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onResponseItemInsert] by ");
            sbLIZ.append(str);
            sbLIZ.append(" pos: ");
            sbLIZ.append(i);
            c0s4j.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), aweme);
        }
        try {
            ArrayList arrayList = new ArrayList(this.LLJILLL);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((InterfaceC1601540rmK) arrayList.get(i2)).LJ(feedItemList, aweme, i, str);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "feedapi");
        }
    }

    @Override // X.InterfaceC606900NrE
    public final List fF(int i, int i2, String str, List list) {
        int listCount = getListCount();
        if (i >= 0 && i < listCount && i <= i2 && i2 <= listCount) {
            List listLJJIJIIJI = LJJIJIIJI(i, i2, list);
            List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
            if (list2 != null && list2.size() != 0) {
                for (InterfaceC1526205yG interfaceC1526205yG : this.mNotifyListeners) {
                    if (interfaceC1526205yG instanceof InterfaceC1255940imu) {
                        ((InterfaceC1255940imu) interfaceC1526205yG).LLLZZIL(getItems());
                    }
                }
            }
            this.LLJJIII.LJIIIZ("[replace items] " + i + "," + C207200r0.LIZ(list));
            if (C295980Biu.LIZ()) {
                List<Aweme> items = getItems();
                C1347505Pd c1347505Pd = C1347505Pd.LIZ;
                if (items != null) {
                    ArrayList arrayList = new ArrayList(items);
                    C1347505Pd.LIZ.getClass();
                    C23250099c.LIZLLL(C1347505Pd.LIZIZ(), null, null, new C1347405Pc(arrayList, null), 3);
                }
            }
            return listLJJIJIIJI;
        }
        list.size();
        return null;
    }

    public final void LJIILIIL(C1601460rmC c1601460rmC, final int i, final int i2, String str, final String str2, Lock lock, boolean z, String str3, boolean z2) {
        boolean z3;
        boolean z4;
        Lock lock2 = lock;
        boolean zLJI = MethodIDManager.LJI(137660);
        if (i == 0 && i2 == 0 && lock2 != null && C1514430pVp.LIZLLL().booleanValue()) {
            if (!LLJJJJ && !z2) {
                LLJJJJ = true;
                lock2.tryLock();
            }
            z3 = true;
        } else {
            z3 = false;
        }
        C0S4J c0s4j = this.LLJJIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[doFetchFeedList] type=");
        sbLIZ.append(i);
        sbLIZ.append(",pullType=");
        sbLIZ.append(i2);
        sbLIZ.append(",awemeId=");
        sbLIZ.append(str2);
        sbLIZ.append(",isFeedSuspended=");
        sbLIZ.append(z3);
        sbLIZ.append(",isFeedCacheSuspended=");
        sbLIZ.append(z2);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (C18026074e.LIZ(str2, str, str3, z) || C18165079n.LIZ(str2, str, str3, z) || (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str))) {
            z4 = true;
        } else {
            z4 = false;
        }
        c1601460rmC.getClass();
        final C1601440rmA c1601440rmA = new C1601440rmA(c1601460rmC);
        c1601440rmA.LJJI = false;
        List<Aweme> items = getItems();
        if (items != null) {
            c1601440rmA.LJJJJIZL = new ArrayList(items);
        }
        WeakHandler weakHandler = this.mHandler;
        Callable callable = new Callable() { // from class: X.0rlw
            /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instruction units count: 415
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.CallableC1601300rlw.call():java.lang.Object");
            }
        };
        if (!z3) {
            lock2 = null;
        }
        Feed0VVManager.LIZIZ(i, i2, weakHandler, callable, 0, z4, lock2);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
