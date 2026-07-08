package X;

import Y.ACallableS252S0200000_24;
import Y.AObjectS112S0000000_9;
import Y.ARunnableS109S0100000_9;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.cache.FollowingCacheConfigModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import com.ss.android.ugc.aweme.experiment.FollowingRedDotOptExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.follow.LastViewData;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0rRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588840rRq extends AbstractC1588960rS2<FollowFeed, FollowFeedList> implements Cloneable, C0PDP {
    public FeedFollowFragment LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLJILJIL;
    public final String LL = "FollowFeedModel";
    public final String LLILLJJLI = "homepage_follow";
    public final String LLILLL = "extra_follow_type_follow";
    public int LLIZLLLIL = -1;
    public final List<FollowFeed> LLJ = new CopyOnWriteArrayList();
    public FollowFeed LLJI = null;
    public String LLJIJIL = null;
    public boolean LLJILJILJ = true;
    public boolean LLJILLL = false;
    public boolean LLJJ = false;
    public final HashMap<String, Aweme> LLJJI = new HashMap<>();
    public int LLJJIII = -1;
    public int LLJJIJI = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Aweme> LJIILIIL() {
        if (this.mData == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : ((FollowFeedList) this.mData).getItems()) {
            if (followFeed.getFeedType() == 65280) {
                arrayList.add(followFeed.getAweme());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<FollowFeed> getItems() {
        Aweme aweme;
        if (this.mData == 0) {
            return null;
        }
        for (C0PLT c0plt : new ArrayList(((FollowFeedList) this.mData).getItems())) {
            if (c0plt != null && (aweme = c0plt.getAweme()) != null) {
                aweme.setLogPbBean(((FollowFeedList) this.mData).getLogPb());
            }
        }
        return ((FollowFeedList) this.mData).getItems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((FollowFeedList) t).isHasMore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.aweme.follow.presenter.FollowFeedList] */
    public final Object clone() {
        try {
            AbstractC666100QAu abstractC666100QAu = (AbstractC666100QAu) super.clone();
            abstractC666100QAu.mData = ((FollowFeedList) this.mData).m203clone();
            return abstractC666100QAu;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        return LJIILJJIL(getItems());
    }

    public static List<Aweme> LJIILJJIL(List<FollowFeed> list) {
        Aweme aweme;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65280 && (aweme = followFeed.getAweme()) != null && (!AwemeSaaSExtKt.isForwardAweme(aweme) || aweme.getForwardItem() != null)) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x0535, code lost:
    
        if (LJIIJJI(r12.getAweme(), (com.ss.android.ugc.aweme.feed.model.Aweme) com.bytedance.mt.protector.impl.collections.ListProtector.get(LJIILIIL(), X.C729980SkG.LJIIJ(r12.getAweme(), LJIILIIL()))) == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0537, code lost:
    
        r15.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x053e, code lost:
    
        if (r12.getAweme() == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0540, code lost:
    
        r8.add(r12.getAweme().getAid());
        LJIJ(r12.getAweme(), (com.ss.android.ugc.aweme.feed.model.Aweme) com.bytedance.mt.protector.impl.collections.ListProtector.get(LJIILIIL(), X.C729980SkG.LJIIJ(r12.getAweme(), LJIILIIL())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0626, code lost:
    
        if (r12.getRoomStruct() == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0630, code lost:
    
        if (r12.getRoomStruct().getNewLiveRoomData() == null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0632, code lost:
    
        r8.add(java.lang.String.valueOf(r12.getRoomStruct().getNewLiveRoomData().id));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0ba9  */
    @Override // X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r20) {
        /*
            Method dump skipped, instruction units count: 3057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1588840rRq.handleData(com.ss.android.ugc.aweme.follow.presenter.FollowFeedList):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL(FollowFeedList followFeedList) {
        LastViewData lastViewData;
        if (followFeedList != null && (lastViewData = followFeedList.lastViewData) != null) {
            int i = lastViewData.index;
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    List<Aweme> awemeList = getAwemeList();
                    if (((FollowFeedList) this.mData).getLastViewData() == null && i >= 0 && !C086I.LIZIZ(awemeList)) {
                        this.LLIZLLLIL = ((ArrayList) awemeList).size() + i;
                    } else {
                        this.LLIZLLLIL = -1;
                    }
                }
            } else if (i > 0) {
                if (this.LLJILLL) {
                    this.LLIZLLLIL = i + 1;
                } else {
                    this.LLIZLLLIL = i;
                }
            } else {
                this.LLIZLLLIL = -1;
            }
            ((FollowFeedList) this.mData).setLastViewData(followFeedList.getLastViewData());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJ(EnumC1588650rRX enumC1588650rRX) {
        FollowFeedList followFeedList;
        FeedFollowFragment feedFollowFragment;
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT;
        Aweme awemeLLLLLJLJLL;
        String aid;
        Aweme aweme;
        if (!((Boolean) FollowingRedDotOptExp.LJI.getValue()).booleanValue() || this.LLJILJILJ || enumC1588650rRX != EnumC1588650rRX.RED_DOT || (followFeedList = (FollowFeedList) this.mData) == null) {
            return;
        }
        List<FollowFeed> items = followFeedList.getItems();
        if (C086I.LIZIZ(items) || (feedFollowFragment = this.LLILZ) == null || (followFeedFragmentPanelMT = feedFollowFragment.LLJJJ) == null || (awemeLLLLLJLJLL = followFeedFragmentPanelMT.LLLLLJLJLL()) == null || (aid = awemeLLLLLJLJLL.getAid()) == null) {
            return;
        }
        for (FollowFeed followFeed : items) {
            if (followFeed != null && (aweme = followFeed.getAweme()) != null && TextUtils.equals(aweme.getAid(), aid)) {
                this.LLJI = followFeed;
                return;
            }
        }
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            HandlerHook.getMessageObj(message.obj);
            List<InterfaceC1526205yG> list = this.mNotifyListeners;
            if (list != null) {
                Iterator<InterfaceC1526205yG> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().onFailed((Exception) HandlerHook.getMessageObj(message.obj));
                }
            }
            LJIJI(this.LLJJIII, 0, "", ((Throwable) HandlerHook.getMessageObj(message.obj)).getMessage());
            return;
        }
        C15O7.LIZIZ(new ACallableS252S0200000_24(this, Message.obtain(message), 0), C823050WQl.LIZLLL(), null).LJ(new C346480DiA(this, 4), C15O7.LJIIIIZZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        C1588850rRr c1588850rRr;
        long cursor;
        int level;
        if (objArr.length >= 2) {
            Object obj = objArr[1];
            if ((obj instanceof C1588850rRr) && (c1588850rRr = (C1588850rRr) obj) != null) {
                int i = this.LLILZLL;
                T t = this.mData;
                if (t != 0) {
                    cursor = ((FollowFeedList) t).getCursor();
                } else {
                    cursor = 0;
                }
                T t2 = this.mData;
                if (t2 != 0) {
                    level = ((FollowFeedList) t2).getLevel();
                } else {
                    level = 1;
                }
                if (!C086I.LIZIZ(getItems())) {
                    ((FollowFeedList) this.mData).getMaxCursor();
                }
                LJIIL(i, cursor, level, c1588850rRr.LIZ, c1588850rRr.LIZIZ, c1588850rRr.LIZJ, c1588850rRr.LIZLLL, null, null, null, ((FollowFeedList) this.mData).getIsRecommend(), 0, C1489110oqz.LIZ("feed"), ComplianceServiceProvider.LJIILIIL().LJIILL(), ComplianceServiceProvider.LJJI().LJII(), AnonymousClass1440.LIZLLL(), C486660J6q.LJ(), C486660J6q.LIZLLL(), Boolean.valueOf(C1601690rmZ.LIZJ()), new ArrayList(), c1588850rRr.LJIIIIZZ);
                this.LLIZ++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    @Override // X.AbstractC1255880imo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshList(java.lang.Object... r29) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1588840rRq.refreshList(java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.aweme.follow.presenter.FollowFeedList] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<FollowFeed> list) {
        if (this.mData == 0) {
            this.mData = new FollowFeedList();
        }
        ((FollowFeedList) this.mData).setItems(list);
    }

    public static final boolean LJIIJJI(Aweme aweme, Aweme aweme2) {
        if (C1594720rbK.LIZIZ(aweme)) {
            if (aweme2 != null) {
                C301980Bsa.LIZ.getClass();
                if (C1594720rbK.LIZJ(aweme2, C301980Bsa.LIZ())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (!aweme.isAd()) {
            return true;
        }
        return aweme.getAwemeRawAd().isEnableFilterSameVideo();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(java.util.List<com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2.FollowingFeedCheckModel> r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1588840rRq.LJIIJ(java.util.List, boolean):void");
    }

    public final void LJIJ(Aweme aweme, Aweme aweme2) {
        String str;
        int i;
        String creativeIdStr;
        if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
            String creativeIdStr2 = "";
            int i2 = 2;
            if (aweme.isAd()) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "item_repeat", aweme.getAwemeRawAd());
                if (aweme2.isAd()) {
                    i = 1;
                } else {
                    i = 2;
                }
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "filter_reason");
                if (!aweme2.isAd()) {
                    creativeIdStr = "";
                } else {
                    creativeIdStr = aweme2.getAwemeRawAd().getCreativeIdStr();
                }
                c1022820ciuLIZLLL.LIZIZ(creativeIdStr, "repeat_cid");
                c1022820ciuLIZLLL.LIZIZ(1, "repeat_type");
                c1022820ciuLIZLLL.LJII();
            }
            if (LJIIJJI(aweme, aweme2)) {
                if (C1017070cZd.LLL(aweme)) {
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "show_failed", aweme.getAwemeRawAd());
                    c1022820ciuLIZLLL2.LIZIZ("8", "ad_show_fail_type");
                    if (aweme2.isAd()) {
                        creativeIdStr2 = aweme2.getAwemeRawAd().getCreativeIdStr();
                    }
                    c1022820ciuLIZLLL2.LIZIZ(creativeIdStr2, "repeat_cid");
                    if (C1030680cva.LJ) {
                        str = "1";
                    } else {
                        str = "2";
                    }
                    c1022820ciuLIZLLL2.LIZIZ(str, "awemelaunch");
                    c1022820ciuLIZLLL2.LJII();
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (aweme2.isAd()) {
                    i2 = 1;
                }
                c2344009Gk.LIZJ(i2, "failed_reason");
                c2344009Gk.LJIIIIZZ("group_id", aweme2.getAid());
                C20684815ws.LJIILLIIL("vv_failed", c2344009Gk.LIZ);
            }
        }
    }

    public final void LJIJI(int i, int i2, String str, String str2) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("feed_r_type", Integer.valueOf(i));
        c2241008qG.LIZ.put("feed_r_pull_type", Integer.valueOf(this.LLJJIJI));
        c2241008qG.LIZIZ(Integer.valueOf(i2), "origin_count");
        if (!TextUtils.isEmpty(str)) {
            c2241008qG.LIZLLL("request_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c2241008qG.LIZLLL("error_desc", str2);
        }
        C794420VEi.LIZIZ("aweme_feed_fetch_abnormal_log", "", c2241008qG.LJ());
    }

    public final void LJIIL(final int i, final long j, final int i2, final int i3, final int i4, final String str, final String str2, final String str3, final String str4, final String str5, final int i5, final int i6, final String str6, final int i7, final String str7, final String str8, final String str9, final String str10, final Boolean bool, final List list, final EnumC1588650rRX enumC1588650rRX) {
        final String strLIZIZ;
        boolean zLJI = MethodIDManager.LJI(202156);
        if (this.LLJJ) {
            int i8 = C2187451AjH.LIZ;
            C1720106oR.LIZ(this.LL, "fetch skip for isFetchingData");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        this.LLJJ = true;
        boolean zBooleanValue = SharePrefCache.inst().getIsContactsUploaded().LIZ().booleanValue();
        int[] iArrLIZ = C422830Gi1.LIZ(101);
        if (iArrLIZ == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iArrLIZ[0]);
            sbLIZ.append("_");
            sbLIZ.append(iArrLIZ[1]);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1BVK c1bvkLIZIZ = C1BVK.LIZIZ();
        WeakHandler weakHandler = this.mHandler;
        final int i9 = zBooleanValue ? 1 : 0;
        c1bvkLIZIZ.LIZ(weakHandler, new Callable(i3, i4, str, str2, i, j, i2, str3, str4, str5, i9, i5, i6, strLIZIZ, str6, i7, str7, str8, str9, str10, bool, list, enumC1588650rRX) { // from class: X.0rRi
            public final /* synthetic */ int LL;
            public final /* synthetic */ int LLILLJJLI;
            public final /* synthetic */ String LLILLL;
            public final /* synthetic */ String LLILZ;
            public final /* synthetic */ int LLILZIL;
            public final /* synthetic */ long LLILZLL;
            public final /* synthetic */ int LLIZ;
            public final /* synthetic */ String LLIZLLLIL;
            public final /* synthetic */ String LLJ;
            public final /* synthetic */ String LLJI;
            public final /* synthetic */ int LLJIJIL;
            public final /* synthetic */ String LLJILJIL;
            public final /* synthetic */ String LLJILJILJ;
            public final /* synthetic */ int LLJILLL;
            public final /* synthetic */ String LLJJ;
            public final /* synthetic */ String LLJJI;
            public final /* synthetic */ String LLJJIII;
            public final /* synthetic */ String LLJJIJI;
            public final /* synthetic */ Boolean LLJJIJIIJIL;
            public final /* synthetic */ List LLJJIJIL;
            public final /* synthetic */ EnumC1588650rRX LLJJJ;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List listLLIIII;
                FollowFeedList followFeedListLIZ;
                C1C7U.LIZ("FollowFeedModel@b274.fetchList$1");
                try {
                    int i10 = ((AccountUserService) C0XQ7.LJFF()).LIZLLL() ? 1 : 2;
                    if (TextUtils.equals(this.LLJJJIL.LLILLJJLI, "rec_follow")) {
                        int i11 = this.LL;
                        int i12 = this.LLILLJJLI;
                        this.LLJJJIL.getClass();
                        followFeedListLIZ = C615430OBx.LIZIZ.LIZ(20, i11, i12, 0L, this.LLILLL, this.LLILZ).get();
                    } else {
                        IFollowReadService iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi(IFollowReadService.class);
                        List<String> listLIZLLL = (iFollowReadService == null || !FollowRealTimeReadExp.LIZ()) ? null : iFollowReadService.LIZLLL();
                        if (!FollowRealTimeReadExp.LIZ() || this.LLJJJIL.LLIZ == 1) {
                            listLLIIII = null;
                        } else {
                            C607520NsE c607520NsE = C607520NsE.LIZ;
                            EnumC607570NsJ enumC607570NsJ = EnumC607570NsJ.GLOBAL;
                            c607520NsE.getClass();
                            Set set = (Set) C607520NsE.LIZIZ().get(enumC607570NsJ);
                            if (set == null || (listLLIIII = C13LP.LLIIII(set)) == null) {
                                listLLIIII = C13BV.INSTANCE;
                            }
                        }
                        C804900Vho.LIZ.getClass();
                        String strLIZJ = C804900Vho.LIZJ();
                        C607670NsT c607670NsT = C607670NsT.LIZ;
                        int i13 = this.LLILZIL;
                        long j2 = this.LLILZLL;
                        int i14 = this.LLIZ;
                        int i15 = this.LL;
                        int i16 = this.LLILLJJLI;
                        this.LLJJJIL.getClass();
                        T t = this.LLJJJIL.mData;
                        if (t != 0) {
                            ((FollowFeedList) t).getFetchRecommend();
                        }
                        followFeedListLIZ = c607670NsT.LIZ(i13, j2, i14, i15, i16, 0L, this.LLIZLLLIL, this.LLJ, this.LLJI, i10, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL.booleanValue(), this.LLJJIJIL, this.LLJJJ, 0, listLIZLLL, listLLIIII, strLIZJ);
                        this.LLJJJIL.getClass();
                        if (((FollowingCacheConfigModel) C1588820rRo.LIZIZ.getValue()).enable && followFeedListLIZ.getItems() != null && !followFeedListLIZ.getItems().isEmpty()) {
                            C799570VYd.LJFF(false).execute(new ARunnableS109S0100000_9(followFeedListLIZ, 77));
                        }
                        this.LLJJJIL.LLJJIII = 1;
                    }
                    this.LLJJJIL.LLJJIJI = this.LL;
                    if (followFeedListLIZ != null) {
                        ILiveOuterService iLiveOuterServiceQ4 = ((ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class)).q4();
                        iLiveOuterServiceQ4.j3().LJI(followFeedListLIZ.getItems());
                        iLiveOuterServiceQ4.p5().LJIIIIZZ(C2421209eE.LIZ(), followFeedListLIZ.getItems());
                        C1588840rRq c1588840rRq = this.LLJJJIL;
                        followFeedListLIZ.getBlankPanelText();
                        c1588840rRq.getClass();
                        C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.FEED, followFeedListLIZ.getItems(), new AObjectS112S0000000_9(0));
                    }
                    C1588840rRq c1588840rRq2 = this.LLJJJIL;
                    c1588840rRq2.LLJJ = false;
                    if (this.LLILZLL == 0) {
                        c1588840rRq2.LJIJJ(this.LLJJJ);
                    }
                    TabSwitchMetricService.LIZ.getClass();
                    TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                    if (tabSwitchMetricServiceLIZ != null) {
                        tabSwitchMetricServiceLIZ.LJIIJ("Following", EnumC1593290rZ1.VIDEO);
                    }
                    C1C7U.LIZIZ("FollowFeedModel@b274.fetchList$1");
                    return followFeedListLIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LLJJJIL.LLJJ = false;
                    C1C7U.LIZIZ("FollowFeedModel@b274.fetchList$1");
                    return null;
                }
            }

            {
                this.LLJIJIL = i6;
                this.LLJILJIL = strLIZIZ;
                this.LLJILJILJ = str6;
                this.LLJILLL = i7;
                this.LLJJ = str7;
                this.LLJJI = str8;
                this.LLJJIII = str9;
                this.LLJJIJI = str10;
                this.LLJJIJIIJIL = bool;
                this.LLJJIJIL = list;
                this.LLJJJ = enumC1588650rRX;
            }
        }, 0);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
