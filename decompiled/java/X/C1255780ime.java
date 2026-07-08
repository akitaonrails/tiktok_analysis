package X;

import Y.ACallableS247S0200000_19;
import Y.ACallableS411S0100000_3;
import Y.ACallableS416S0100000_9;
import Y.ACallableS424S0100000_19;
import Y.ARunnableS0S2011000_16;
import Y.AfS140S0000000_19;
import Y.AfS188S0100000_19;
import Y.AfS85S0101000_19;
import Y.AkS44S1000000_19;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.l;
import com.google.gson.s;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.theater.model.CameoDraftInfo;
import com.ss.android.ugc.profile.business.profile.tab.api.ProfileTabApi;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0ime, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255780ime extends AbstractC1255890imp<Aweme, FeedItemList> implements C0PDP, InterfaceC1209320hZi {
    public static int LLJLILLLLZIIL = -1;
    public int LL;
    public int LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public User LLIZLLLIL;
    public final Object LLJJJJLIIL;
    public String LLILZLL = "";
    public volatile Map<Integer, String> LLIZ = new HashMap();
    public int LLJ = 0;
    public int LLJI = 0;
    public String LLJIJIL = "";
    public String LLJILJIL = "";
    public int LLJILJILJ = 0;
    public C1255790imf LLJILLL = null;
    public volatile int LLJJ = 0;
    public volatile int LLJJI = 0;
    public String LLJJIII = "";
    public String LLJJIJI = "";
    public String LLJJIJIIJIL = "unknow";
    public FeedItemList LLJJIJIL = null;
    public final LinkedHashSet<String> LLJJJ = new LinkedHashSet<>();
    public C11NJ LLJJJIL = null;
    public final AtomicBoolean LLJJJJ = new AtomicBoolean(false);
    public final AtomicBoolean LLJJJJJIL = new AtomicBoolean(false);
    public int LLJJL = 0;
    public CameoDraftInfo LLJJLIIIJLLLLLLLZ = null;
    public String LLJL = null;
    public boolean LLJLIL = false;

    @Override // X.AbstractC1255880imo
    public final boolean isNewDataEmpty() {
        return false;
    }

    public final boolean LJIILLIIL() {
        User user = this.LLIZLLLIL;
        boolean z = false;
        if (user != null && user.getCommerceUserInfo() != null && this.LLIZLLLIL.getCommerceUserInfo().getAdRevenueRits() != null) {
            for (Integer num : this.LLIZLLLIL.getCommerceUserInfo().getAdRevenueRits()) {
                if (num != null && num.intValue() == C00BJ.PROFILE_RIT.getTYPE()) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJ() {
        T t = this.mData;
        if (t == 0 || ((FeedItemList) t).getItems() == null) {
            return;
        }
        Iterator<Aweme> it2 = ((FeedItemList) this.mData).getItems().iterator();
        int i = 0;
        while (it2.hasNext()) {
            Aweme next = it2.next();
            if (next != null && TextUtils.isEmpty(next.getAid())) {
                it2.remove();
                i++;
            }
        }
        ((FeedItemList) this.mData).placeHolderRemovedCount = i;
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        return this.LL == 1 ? getItems() : getItems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((FeedItemList) t).getItems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean hasLocateItem() {
        T t = this.mData;
        return t != 0 && ((FeedItemList) t).hasLocateItem;
    }

    @Override // X.AbstractC1255880imo
    public final boolean hasMoreUp() {
        return this.LLJJJJJIL.get();
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return this.LLJJJJ.get();
    }

    public C1255780ime() {
        if (C1ELC.LIZIZ()) {
            this.LLJJJJLIIL = this;
        } else {
            this.LLJJJJLIIL = C1253720ijK.LIZ;
        }
    }

    public static C0VSJ LJIILIIL(String str) {
        C844470XAv.LIZ.getClass();
        File fileW2 = C786410Ut5.w2(C844470XAv.LIZ());
        if (fileW2 == null || !fileW2.exists()) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(fileW2.getPath());
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append("aweme_publish");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(fileW2.getPath());
        sbLIZ2.append(str2);
        sbLIZ2.append("aweme_popular");
        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
        C1256130inD.LIZ.getClass();
        if (C1256130inD.LIZ() != 0) {
            c0vsj = c0vsj2;
        }
        try {
            if (!c0vsj.exists()) {
                if (!c0vsj.mkdirs()) {
                    return null;
                }
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c0vsj.getPath());
        sb.append(File.separator);
        Object obj = C1253720ijK.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C1255950imv.LIZ);
        sbLIZ3.append(str);
        sb.append(C2084808Es.LIZ(C2188811AlT.LIZIZ(sbLIZ3)));
        return new C0VSJ(sb.toString());
    }

    public static void LJJIJ(C19EG c19eg) {
        if (LLJLILLLLZIIL != -1 || c19eg == null) {
            return;
        }
        int iLJIIIIZZ = ((int) ((((C12ES.LJIIIIZZ(c19eg) / C12ES.LJIIJ(c19eg)) - 0.3f) / 0.44444445f) + 0.5f)) * 3;
        LLJLILLLLZIIL = iLJIIIIZZ;
        if (iLJIIIIZZ < 12) {
            LLJLILLLLZIIL = 12;
        }
    }

    @Override // X.AbstractC1255890imp
    public final void LJIIJJI(Aweme aweme) {
        this.LLJJIII = aweme.getAid();
        this.LLJJIJI = "";
        this.LLJJIJIL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(FeedItemList feedItemList) {
        if (C086I.LIZIZ(((FeedItemList) this.mData).getItems())) {
            ((FeedItemList) this.mData).setItems(feedItemList.getItems());
        } else {
            LJJIIZ(feedItemList.getItems(), ((FeedItemList) this.mData).getItems());
            ((FeedItemList) this.mData).getItems().addAll(feedItemList.getItems());
        }
    }

    public final FeedItemList LJIILL(String str) {
        C0VSJ c0vsjLJIILIIL;
        if (C1ELC.LIZIZ()) {
            Object obj = C1253720ijK.LIZ;
            c0vsjLJIILIIL = C1255730imZ.LIZ(str);
        } else {
            c0vsjLJIILIIL = LJIILIIL(str);
        }
        if (c0vsjLJIILIIL != null && c0vsjLJIILIIL.exists()) {
            String strLJII = "";
            synchronized (this) {
                try {
                    C2137908Zd.LIZJ.getClass();
                    strLJII = C2137908Zd.LJII(c0vsjLJIILIIL, "UTF-8");
                } catch (IOException e) {
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (!TextUtils.isEmpty(strLJII)) {
                try {
                    return (FeedItemList) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), strLJII, FeedItemList.class);
                } catch (l e2) {
                    return null;
                } catch (s e22) {
                    return null;
                } catch (UnsupportedOperationException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    C2344809Gs.LJI(e3);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJI(FeedItemList feedItemList) {
        List<Aweme> items;
        String strLJJLIIIJ;
        String aid;
        T t;
        C1255790imf c1255790imf = this.LLJILLL;
        if (c1255790imf == null) {
            return;
        }
        if (feedItemList != null && (t = this.mData) != 0) {
            items = ((FeedItemList) t).getItems();
        } else {
            items = null;
        }
        C0HYB.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("profile_tab_search_id", c1255790imf.LJ);
        c2344009Gk.LJIIIIZZ("query", c1255790imf.LIZ);
        c2344009Gk.LJIIIIZZ("query_source", c1255790imf.LIZLLL);
        if (items != null && !items.isEmpty()) {
            int size = items.size();
            List<Aweme> listSubList = items.subList(C13LZ.LJ(c1255790imf.LJII, 0, size), size);
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : listSubList) {
                if (aweme != null && (aid = aweme.getAid()) != null) {
                    arrayList.add(aid);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = "";
        }
        c2344009Gk.LJIIIIZZ("group_id_list", strLJJLIIIJ);
        c2344009Gk.LJIIIIZZ("tab_name", c1255790imf.LJFF);
        c2344009Gk.LJIIIIZZ("enter_from", c1255790imf.LJI);
        C20684815ws.LJIILLIIL("profile_tab_search_result", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
    @Override // X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(com.ss.android.ugc.aweme.feed.model.FeedItemList r24) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255780ime.handleData(com.ss.android.ugc.aweme.feed.model.FeedItemList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L84
            java.lang.String r0 = r11.getAid()
            if (r0 == 0) goto L84
            java.util.List r6 = r10.getItems()
            if (r6 != 0) goto L16
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10.setItems(r6)
        L16:
            r5 = 0
            r9 = -1
            r7 = 0
        L19:
            int r0 = r6.size()
            if (r7 >= r0) goto L60
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.ss.android.ugc.aweme.feed.model.Aweme) r8
            if (r8 == 0) goto L5d
            boolean r0 = X.C729510SjV.LJJIJIL(r11)
            if (r0 == 0) goto L4a
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isTop(r8)
            if (r0 != 0) goto L39
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isScheduleVideo(r8)
            if (r0 == 0) goto L3b
        L39:
            int r9 = r7 + 1
        L3b:
            java.lang.String r1 = r11.getAid()
            java.lang.String r0 = r8.getAid()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5d
            return
        L4a:
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isTop(r8)
            if (r0 != 0) goto L39
            long r3 = r11.getCreateTime()
            long r1 = r8.getCreateTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3b
            goto L39
        L5d:
            int r7 = r7 + 1
            goto L19
        L60:
            if (r9 < 0) goto L63
            r5 = r9
        L63:
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r6, r5, r11)
            java.util.List<X.05yG> r0 = r10.mNotifyListeners
            java.util.Iterator r2 = r0.iterator()
        L6c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r1 = r2.next()
            X.05yG r1 = (X.InterfaceC1526205yG) r1
            if (r1 == 0) goto L6c
            boolean r0 = r1 instanceof X.InterfaceC1255940imu
            if (r0 == 0) goto L6c
            X.0imu r1 = (X.InterfaceC1255940imu) r1
            r1.w(r5, r6)
            goto L6c
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255780ime.LJJIII(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LJJIIJ(List<Aweme> list) {
        String scheduleId;
        if (!C0XQ7.LJFF().getCurUserId().equals(this.LLILLL)) {
            return;
        }
        List<Aweme> publishingAwemesByPermission = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getPublishingAwemesByPermission(Boolean.FALSE);
        int iLIZ = C737200Svu.LIZ(list);
        for (Aweme aweme : publishingAwemesByPermission) {
            if (AwemeBizExtKt.getScheduleId(aweme) != null) {
                scheduleId = AwemeBizExtKt.getScheduleId(aweme);
            } else {
                scheduleId = "";
            }
            if (list.size() == 0) {
                list.add(aweme);
            } else if (C737200Svu.LIZIZ(scheduleId, list) < 0) {
                ListProtector.add(list, iLIZ, aweme);
            }
        }
    }

    public final boolean LJJIIJZLJL(String str) {
        if (this.mListQueryType != 2) {
            return false;
        }
        if (!Objects.equals(str, "load_latest_scroll_dragging") && !Objects.equals(str, "load_latest_fling") && !Objects.equals(str, "load_latest_detail_page_preload")) {
            return false;
        }
        return true;
    }

    public final void LJJIJIIJIL(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("awemeModel setUserId:");
        sbLIZ.append(str);
        C1720106oR.LJI("AwemeModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJIL(boolean z) {
        int size;
        T t = this.mData;
        if (t != 0 && ((FeedItemList) t).getItems() != null) {
            size = ((FeedItemList) this.mData).getItems().size();
        } else {
            size = 0;
        }
        C1020810cff c1020810cff = C1020810cff.LIZ;
        String strLIZ = C1259870itF.LIZ(this.LL);
        String str = this.LLILLL;
        c1020810cff.getClass();
        C1020810cff.LJI.submit(new ARunnableS0S2011000_16(z, strLIZ, size, str, 1));
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 5) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Object obj) {
        ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL;
        Aweme aweme = (Aweme) obj;
        boolean zLIZIZ = C729980SkG.LIZIZ(getItems(), aweme, this.mNotifyListeners);
        if (zLIZIZ && (iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL()) != null && aweme.getAwemeRawAd() != null) {
            iTalentAdRevenueShareServiceLJIIL.LJIIIIZZ(aweme.getAwemeRawAd().getCreativeIdStr());
        }
        return zLIZIZ;
    }

    @Override // X.AbstractC666100QAu, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        boolean z;
        String str;
        String str2;
        String str3;
        resetLoadingStatus(message);
        if (this.LL == 25 && this.LLJJI != this.LLJJ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("AwemeModel", "handleMsg: search seqId mismatch, discarding stale result and re-requesting");
            C1255790imf c1255790imf = this.LLJILLL;
            if (c1255790imf != null && !TextUtils.isEmpty(c1255790imf.LIZIZ)) {
                this.LLJILJILJ = 0;
                this.mListQueryType = 1;
                LJIJJ(false, this.LLILLL, this.LL, -1L, 0L, 20, "", 0, 0, "", null, 0);
                return;
            }
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            HandlerHook.getMessageObj(message.obj);
            if (this.LL == 25) {
                LJJI(null);
            }
            List<InterfaceC1526205yG> list = this.mNotifyListeners;
            if (list != null) {
                Iterator<InterfaceC1526205yG> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().onFailed((Exception) HandlerHook.getMessageObj(message.obj));
                }
                return;
            }
            return;
        }
        FeedItemList feedItemList = (FeedItemList) HandlerHook.getMessageObj(message.obj);
        if (feedItemList != null && (str3 = feedItemList.dataUserId) != null && !str3.equals(this.LLILLL)) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("AwemeModel", "handleData v2, dataUserId not match, return");
            String str4 = this.LLJJIJIIJIL;
            Integer numValueOf = Integer.valueOf(feedItemList.fetchType);
            if (str4 != null && numValueOf != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("source", str4);
                c2344009Gk.LIZJ(numValueOf.intValue(), "tab_type");
                C20684815ws.LJFF().execute(new RunnableC514801zW(c2344009Gk.LIZ, 190));
                return;
            }
            return;
        }
        if (C299890BpD.LIZ() && (((str = this.LLJJIII) != null && this.LLJJIJI != null && !str.isEmpty() && !this.LLJJIJI.isEmpty() && !this.LLJJIJI.equals(this.LLJJIII)) || (feedItemList != null && (str2 = feedItemList.dataUserId) != null && !str2.equals(this.LLILLL)))) {
            int i3 = C2187451AjH.LIZ;
            C1720106oR.LIZ("AwemeModel", "handleData, aweme id or user id not match, return");
            return;
        }
        handleData(feedItemList);
        List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
        if (list2 != null) {
            Iterator<InterfaceC1526205yG> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().onSuccess();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadLatestList(Object... objArr) {
        long j;
        this.LLILLJJLI = ((Integer) C1247760iZi.LIZ(4, Integer.valueOf(this.LLILLJJLI), objArr)).intValue();
        this.LLJJIJIIJIL = (String) C1247760iZi.LIZ(6, "unknow", objArr);
        int iMax = Math.max(((Integer) C1247760iZi.LIZ(7, 10, objArr)).intValue(), 10);
        T t = this.mData;
        long j2 = 0;
        if (t == 0) {
            j = 0;
        } else {
            j = ((FeedItemList) t).minCursor;
        }
        FeedItemList feedItemList = this.LLJJIJIL;
        if (feedItemList != null) {
            j2 = feedItemList.maxCursor;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadLatestList. minCursor:");
        sbLIZ.append(j);
        sbLIZ.append(", maxCursor:");
        sbLIZ.append(j2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (objArr.length >= 6) {
            String str = (String) objArr[2];
            LJIJI(((Integer) objArr[3]).intValue(), iMax, this.LLJ, this.LLJI, j, j2, str, (String) objArr[5]);
            return;
        }
        LJIJI(((Integer) objArr[3]).intValue(), iMax, this.LLJ, this.LLJI, j, j2, (String) objArr[2], "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        long j;
        long j2;
        this.LLILLJJLI = ((Integer) C1247760iZi.LIZ(4, Integer.valueOf(this.LLILLJJLI), objArr)).intValue();
        this.LLJJIJIIJIL = (String) C1247760iZi.LIZ(6, "unknow", objArr);
        int iMax = Math.max(((Integer) C1247760iZi.LIZ(7, 10, objArr)).intValue(), 10);
        if (objArr.length >= 6) {
            String str = (String) objArr[2];
            int iIntValue = ((Integer) objArr[3]).intValue();
            T t = this.mData;
            if (t == 0) {
                j2 = 0;
            } else {
                j2 = ((FeedItemList) t).maxCursor;
            }
            LJIJI(iIntValue, iMax, this.LLJ, this.LLJI, -1L, j2, str, (String) objArr[5]);
            return;
        }
        String str2 = (String) objArr[2];
        int iIntValue2 = ((Integer) objArr[3]).intValue();
        T t2 = this.mData;
        if (t2 == 0) {
            j = 0;
        } else {
            j = ((FeedItemList) t2).maxCursor;
        }
        LJIJI(iIntValue2, iMax, this.LLJ, this.LLJI, -1L, j, str2, "");
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        int i;
        String str;
        int iIntValue;
        String str2;
        String str3;
        this.LLILLJJLI = ((Integer) objArr[4]).intValue();
        if (this.LL == 4) {
            i = 12;
        } else {
            i = 20;
        }
        if (objArr.length >= 7) {
            str = (String) objArr[6];
        } else {
            str = "";
        }
        this.LLJJIII = str;
        try {
            if (objArr.length >= 8) {
                str3 = (String) objArr[7];
            } else {
                str3 = "unknow";
            }
            this.LLJJIJIIJIL = str3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (objArr.length >= 6) {
            if (objArr.length >= 9) {
                iIntValue = ((Integer) objArr[8]).intValue();
            } else {
                iIntValue = 0;
            }
            if (objArr.length >= 10) {
                str2 = (String) objArr[9];
            } else {
                str2 = null;
            }
            LJIJJ(((Boolean) objArr[1]).booleanValue(), (String) objArr[2], ((Integer) objArr[3]).intValue(), -1L, 0L, i, (String) objArr[5], 0, 0, this.LLJJIII, str2, iIntValue);
            return;
        }
        LJIJJ(((Boolean) objArr[1]).booleanValue(), (String) objArr[2], ((Integer) objArr[3]).intValue(), -1L, 0L, i, "", 0, 0, "", null, 0);
    }

    @Override // X.AbstractC1255880imo, X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        String str;
        SystemClock.elapsedRealtime();
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        int iIntValue = ((Integer) objArr[0]).intValue();
        this.mListQueryType = iIntValue;
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 4) {
                    if (iIntValue == 6) {
                        this.LLILLJJLI = ((Integer) objArr[4]).intValue();
                        this.LL = ((Integer) objArr[3]).intValue();
                        this.LLILLL = (String) objArr[2];
                        this.LLJJIJI = (String) objArr[6];
                        try {
                            if (objArr.length >= 8) {
                                str = (String) objArr[7];
                            } else {
                                str = "unknow";
                            }
                            this.LLJJIJIIJIL = str;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS247S0200000_19(this, objArr, 1), 0);
                        return true;
                    }
                } else {
                    loadMoreList(objArr);
                    return true;
                }
            } else {
                loadLatestList(objArr);
                return true;
            }
        } else {
            refreshList(objArr);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.ss.android.ugc.aweme.feed.model.FeedItemList] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        super.setItems(list);
        T t = this.mData;
        if (t == 0) {
            ?? feedItemList = new FeedItemList();
            feedItemList.setItems(list);
            this.mData = feedItemList;
            return;
        }
        ((FeedItemList) t).setItems(list);
    }

    public static void LJJIIZ(List<Aweme> list, List<Aweme> list2) {
        if (list != null && list2 != null) {
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme next = it2.next();
                AwemeBizExtKt.setPlaceHolder(next, false);
                Iterator<Aweme> it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Aweme next2 = it3.next();
                        AwemeBizExtKt.setPlaceHolder(next2, false);
                        if (TextUtils.equals(next.getAid(), next2.getAid())) {
                            it2.remove();
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1209320hZi
    public final void LJFF(int i, String str) {
        ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL();
        if (iTalentAdRevenueShareServiceLJIIL != null && iTalentAdRevenueShareServiceLJIIL.LJFF(i)) {
            LJJIFFI(i, str, EnumC311460CIu.PROFILE_AD_REQUEST_SOURCE_LOAD_MORE);
        }
    }

    public final void LJIILJJIL(FeedItemList feedItemList, String str) {
        C0VSJ c0vsjLJIILIIL;
        synchronized (this.LLJJJJLIIL) {
            if (feedItemList != null) {
                try {
                    if (feedItemList.getAwemeList() != null) {
                        if (C1ELC.LIZIZ()) {
                            Object obj = C1253720ijK.LIZ;
                            c0vsjLJIILIIL = C1255730imZ.LIZ(str);
                        } else {
                            c0vsjLJIILIIL = LJIILIIL(str);
                        }
                        if (c0vsjLJIILIIL == null) {
                            return;
                        }
                        try {
                            if (((Boolean) C267140AdU.LIZ.getValue()).booleanValue() && !C19252910Tv.LIZIZ.o4() && feedItemList.getAwemeList().size() > 9) {
                                feedItemList = feedItemList.m202clone();
                                feedItemList.setItems(feedItemList.getAwemeList().subList(0, 9));
                            }
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new C0VSV(c0vsjLJIILIIL));
                            outputStreamWriter.write(C7740030o.LIZ().getGson().LJIILL(feedItemList));
                            outputStreamWriter.close();
                            if (feedItemList.getAwemeList() != null) {
                                C1250870iej.LIZ.getClass();
                                C1250870iej.LIZ().storeInt("cache_post_aweme_count", feedItemList.getAwemeList().size());
                            }
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJJIJIIJI(Boolean bool, Boolean bool2) {
        if (bool != null) {
            this.LLJJJJ.set(bool.booleanValue());
        }
        if (bool2 != null) {
            this.LLJJJJJIL.set(bool2.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIFFI(int i, String str, EnumC311460CIu enumC311460CIu) {
        ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL;
        T t = this.mData;
        if (t == 0 || ((FeedItemList) t).getItems() == null || TextUtils.isEmpty(str) || i < 0 || i >= ((FeedItemList) this.mData).getItems().size() || !LJIILLIIL() || (iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL()) == null) {
            return;
        }
        iTalentAdRevenueShareServiceLJIIL.LIZJ();
        ArrayList arrayList = new ArrayList();
        List<Aweme> items = ((FeedItemList) this.mData).getItems();
        int i2 = 5;
        for (int i3 = i + 1; i3 < items.size(); i3++) {
            Aweme aweme = (Aweme) ListProtector.get(items, i3);
            if (i2 > 0) {
                arrayList.add(aweme.getAid());
                i2--;
            }
        }
        iTalentAdRevenueShareServiceLJIIL.LJII(str, arrayList, i, enumC311460CIu, new C1057630dd3(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJL(com.ss.android.ugc.aweme.feed.model.FeedItemList r7, boolean r8, int r9, int r10) {
        /*
            if (r7 == 0) goto L95
            java.util.List r0 = r7.getItems()
            if (r0 == 0) goto L95
            java.util.List r0 = r7.getItems()
            int r3 = r0.size()
            r2 = 0
        L11:
            if (r2 >= r3) goto L95
            java.util.List r0 = r7.getItems()
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            if (r5 != 0) goto L74
            r4 = -1
        L20:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.LLILLL(r5)
        L30:
            if (r8 == 0) goto L6e
            if (r4 < 0) goto L6e
            r6.setIsTop(r4)
        L37:
            java.lang.String r0 = r6.getAid()
            if (r0 == 0) goto L71
            java.lang.String r5 = r6.getAid()
        L41:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService.class
            java.lang.Object r4 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r4 = (com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r4
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            int r0 = r10 + r9
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = r7.getRequestId()
            r4.LIZIZ(r2, r1, r0)
            java.util.List r0 = r7.getItems()
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r0, r2, r6)
            int r2 = r2 + 1
            goto L11
        L6e:
            if (r6 == 0) goto L71
            goto L37
        L71:
            java.lang.String r5 = ""
            goto L41
        L74:
            int r4 = r5.getIsTop()
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isSelfSee(r5)
            if (r0 != 0) goto L84
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isProhibited(r5)
            if (r0 == 0) goto L20
        L84:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r0.Ir(r9, r5)
            goto L30
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255780ime.LJJIJL(com.ss.android.ugc.aweme.feed.model.FeedItemList, boolean, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255890imp
    public final void LJIIJ(List list, long j, boolean z, String str) {
        this.LLJILJIL = str;
        setItems(new ArrayList(list));
        ((FeedItemList) this.mData).cursor = list.size();
        LJJIJIIJI(Boolean.valueOf(z), Boolean.FALSE);
        FeedItemList feedItemList = (FeedItemList) this.mData;
        feedItemList.hasMore = z ? 1 : 0;
        feedItemList.cursor = j;
        feedItemList.maxCursor = j;
    }

    public final void LJIJI(int i, int i2, int i3, int i4, long j, long j2, String str, String str2) {
        LJIJJ(false, str, i, j, j2, i2, str2, i3, i4, "", null, 0);
    }

    public final void LJIJJ(final boolean z, final String str, final int i, final long j, final long j2, final int i2, final String str2, final int i3, final int i4, final String str3, final String str4, final int i5) {
        boolean z2;
        C098D c098dLJL;
        this.LL = i;
        this.LLILLL = str;
        this.LLJLIL = false;
        if (i == 0 && j2 == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1256130inD.LIZ.getClass();
        final int iLIZ = C1256130inD.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishPlaceholder -> AwemeModel -> fetchList; isFetchLegacy = ");
        sbLIZ.append(z2);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (z2) {
            C1BVK.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.0imk
                public final /* synthetic */ boolean LLJIJIL = false;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.LL.LJIJJLI(z, str, i, j, j2, i2, str2, i3, i4, this.LLJIJIL, str3, str4, i5, false, false);
                }
            }, 0);
            return;
        }
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = ((IUserProfilePreload) ServiceManager.get().getService(IUserProfilePreload.class)).LJII(str);
        }
        if (((Boolean) C1260030itV.LIZJ.getValue()).booleanValue()) {
            if (!C729510SjV.LJIILJJIL(str) && C1259950itN.LIZ()) {
                if (!C729510SjV.LJIILJJIL(str) && !str.equals(this.LLILZ)) {
                    this.LLILZ = str;
                    LJIL(i, i2, i3, i4, i5, iLIZ, j, j2, ProfileTabApi.LIZ(str2, str, str3, i5, str4, C729510SjV.LJIILJJIL(str), Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(LJJIIJZLJL(this.LLJJIJIIJIL)), 1), null, str, str2, str3, str4, z, false);
                } else {
                    LJJIIZI(z, str, i, j, j2, i2, str2, i3, i4, false, str3, str4, i5, iLIZ, false);
                }
                C11NZ.LJJJJI(new CallableC1258760irS(this, i, str)).LJJJ(new AkS44S1000000_19(str, 0), false).LJL(C11S5.LIZ()).LJJLL(new AfS140S0000000_19(3), new AfS140S0000000_19(4));
                return;
            }
            LJJIIZI(z, str, i, j, j2, i2, str2, i3, i4, false, str3, str4, i5, iLIZ, false);
            return;
        }
        final boolean z3 = !str.equals(this.LLILZ);
        this.LLILZ = str;
        if (C1259950itN.LIZ() && !C729510SjV.LJIILJJIL(str) && z3) {
            final C1256080in8 c1256080in8LIZ = ProfileTabApi.LIZ(str2, str, str3, i5, str4, C729510SjV.LJIILJJIL(str), Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(LJJIIJZLJL(this.LLJJIJIIJIL)), 1);
            c098dLJL = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0imi
                public final /* synthetic */ boolean LJIIJJI = false;

                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ c09aj) {
                    C1255780ime c1255780ime = this.LIZ;
                    C1256080in8 c1256080in8 = c1256080in8LIZ;
                    boolean z4 = z;
                    String str5 = str;
                    int i6 = i;
                    long j3 = j;
                    long j4 = j2;
                    int i7 = i2;
                    String str6 = str2;
                    int i8 = i3;
                    int i9 = i4;
                    boolean z5 = this.LJIIJJI;
                    c1255780ime.LJIL(i6, i7, i8, i9, i5, iLIZ, j3, j4, c1256080in8, (C19482611Ke) c09aj, str5, str6, str3, str4, z4, z5);
                }
            });
            int i6 = C2187451AjH.LIZ;
            C1720106oR.LJI("AwemeModel", "is not Hit enableDecouplePostFromStory");
        } else {
            c098dLJL = C11NZ.LJJJJI(new Callable() { // from class: X.0iml
                public final /* synthetic */ boolean LLJIJIL = false;

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.LL.LJIJJLI(z, str, i, j, j2, i2, str2, i3, i4, this.LLJIJIL, str3, str4, i5, z3, false);
                }
            }).LJL(C11S5.LIZ());
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = C11NZ.LJLLILLLL(c098dLJL, C11NZ.LJJJJI(new CallableC1258760irS(this, i, str)).LJJJ(new AkS44S1000000_19(str, 0), false).LJL(C11S5.LIZ()), new InterfaceC500500Jk0() { // from class: X.0imh
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                C1255780ime c1255780ime = this.LIZ;
                String str5 = str;
                FeedItemList feedItemList = (FeedItemList) obj;
                Aweme aweme = (Aweme) obj2;
                c1255780ime.getClass();
                int i7 = C2187451AjH.LIZ;
                C1720106oR.LJI("AwemeModel", "call back feedList");
                List<Aweme> items = feedItemList.getItems();
                if (items == null) {
                    items = new ArrayList<>();
                }
                if (C1607070rvF.LIZIZ.LIZJ() && !C729510SjV.LJJII(aweme) && C729510SjV.LJIIJ(aweme) >= 1) {
                    int i8 = 0;
                    for (Aweme aweme2 : items) {
                        if (!AwemeExtKt.isTop(aweme2) && !AwemeExtKt.isScheduleVideo(aweme2)) {
                            break;
                        }
                        i8++;
                    }
                    ListProtector.add(items, i8, aweme);
                }
                if (C1ELC.LIZIZ()) {
                    Object obj3 = C1253720ijK.LIZ;
                    C1255730imZ.LJ(str5, items);
                } else {
                    c1255780ime.LJJIIJ(items);
                }
                if (!items.isEmpty()) {
                    feedItemList.setItems(items);
                }
                return feedItemList;
            }
        }).LJJLL(new AfS85S0101000_19(iLIZ, this, 5), new AfS188S0100000_19(this, 89));
        if (this.LLJJJIL == null) {
            this.LLJJJIL = new C11NJ();
        }
        this.LLJJJIL.LIZ(interfaceC420801kMLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.FeedItemList LJIJJLI(boolean r52, java.lang.String r53, int r54, long r55, long r57, int r59, java.lang.String r60, int r61, int r62, boolean r63, java.lang.String r64, java.lang.String r65, int r66, boolean r67, boolean r68) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255780ime.LJIJJLI(boolean, java.lang.String, int, long, long, int, java.lang.String, int, int, boolean, java.lang.String, java.lang.String, int, boolean, boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    public final void LJJIIZI(final boolean z, final String str, final int i, final long j, final long j2, final int i2, final String str2, final int i3, final int i4, final boolean z2, final String str3, final String str4, final int i5, final int i6, final boolean z3) {
        final boolean z4 = !str.equals(this.LLILZIL);
        this.LLILZIL = str;
        C11NZ.LJJJJI(new Callable() { // from class: X.0imj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.LL.LJIJJLI(z, str, i, j, j2, i2, str2, i3, i4, z2, str3, str4, i5, z4, z3);
            }
        }).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0ijO
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1255780ime c1255780ime = this.LL;
                String str5 = str;
                int i7 = i6;
                boolean z5 = z3;
                boolean z6 = z4;
                FeedItemList feedItemList = (FeedItemList) obj;
                c1255780ime.getClass();
                List<Aweme> items = feedItemList.getItems();
                if (items == null) {
                    items = new ArrayList<>();
                }
                if (C1ELC.LIZIZ()) {
                    Object obj2 = C1253720ijK.LIZ;
                    C1255730imZ.LJ(str5, items);
                } else {
                    c1255780ime.LJJIIJ(items);
                }
                if (c1255780ime.LLILZLL.equals(c1255780ime.LLILLL)) {
                    C1256130inD.LIZ.getClass();
                    if (i7 != C1256130inD.LIZ()) {
                        c1255780ime.LLILZLL = c1255780ime.LLILLL;
                        return;
                    }
                }
                c1255780ime.LLILZLL = c1255780ime.LLILLL;
                C1BVK.LIZIZ().LIZ(c1255780ime.mHandler, new ACallableS424S0100000_19(feedItemList, 13), 0);
                if (z5) {
                    C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                    int iOrdinal = EnumC1253390iin.REQUEST_RETRY.ordinal();
                    Boolean bool = Boolean.FALSE;
                    Integer numValueOf = Integer.valueOf(c1255780ime.mListQueryType);
                    Boolean bool2 = Boolean.TRUE;
                    c1250680ieQ.getClass();
                    C1250680ieQ.LJIILJJIL(false, iOrdinal, true, bool, null, numValueOf, bool2);
                    return;
                }
                if (C729510SjV.LJIILJJIL(str5) || c1255780ime.mListQueryType != 1 || !z6) {
                    return;
                }
                C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                int iOrdinal2 = EnumC1253390iin.NO_CHUNK_END_SUCCESS.ordinal();
                Boolean bool3 = Boolean.FALSE;
                Integer numValueOf2 = Integer.valueOf(c1255780ime.mListQueryType);
                c1250680ieQ2.getClass();
                C1250680ieQ.LJIILJJIL(false, iOrdinal2, true, bool3, null, numValueOf2, bool3);
            }
        }, new C09JN() { // from class: X.0iiu
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1255780ime c1255780ime = this.LL;
                boolean z5 = z3;
                String str5 = str;
                boolean z6 = z4;
                Throwable th = (Throwable) obj;
                c1255780ime.getClass();
                C1BVK.LIZIZ().LIZ(c1255780ime.mHandler, new ACallableS411S0100000_3(th, 39), 0);
                if (z5) {
                    C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                    int iOrdinal = EnumC1253390iin.REQUEST_RETRY.ordinal();
                    Boolean bool = Boolean.FALSE;
                    Integer numValueOf = Integer.valueOf(c1255780ime.mListQueryType);
                    Boolean bool2 = Boolean.TRUE;
                    c1250680ieQ.getClass();
                    C1250680ieQ.LJIILJJIL(false, iOrdinal, false, bool, th, numValueOf, bool2);
                } else if (!C729510SjV.LJIILJJIL(str5) && c1255780ime.mListQueryType == 1 && z6) {
                    C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                    int iOrdinal2 = EnumC1253390iin.NO_CHUNK_END_FAILED.ordinal();
                    Boolean bool3 = Boolean.FALSE;
                    Integer numValueOf2 = Integer.valueOf(c1255780ime.mListQueryType);
                    c1250680ieQ2.getClass();
                    C1250680ieQ.LJIILJJIL(false, iOrdinal2, false, bool3, th, numValueOf2, bool3);
                }
                int i7 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestPostAPI error, msg: ");
                sbLIZ.append(th.getMessage());
                sbLIZ.append(" cause: ");
                sbLIZ.append(th.getCause());
                C1720106oR.LIZ("AwemeModel", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
    }

    public final void LJIL(final int i, final int i2, final int i3, final int i4, final int i5, final int i6, final long j, final long j2, final C1256080in8 c1256080in8, final C19482611Ke c19482611Ke, final String str, final String str2, final String str3, final String str4, final boolean z, final boolean z2) {
        try {
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            int iOrdinal = EnumC1253390iin.START_REQUEST.ordinal();
            Boolean bool = Boolean.FALSE;
            Integer numValueOf = Integer.valueOf(this.mListQueryType);
            c1250680ieQ.getClass();
            C1250680ieQ.LJIILJJIL(true, iOrdinal, false, bool, null, numValueOf, bool);
            C15O7<C1515820pY4<FeedItemList>> c15o7LIZIZ = ProfileTabApi.LIZIZ(c1256080in8);
            if (c15o7LIZIZ == null) {
                int i7 = C2187451AjH.LIZ;
                C1720106oR.LIZ("AwemeModel", "fetchPublicPostChunk publicPostChunk is null");
                C1250680ieQ.LJIILJJIL(true, EnumC1253390iin.REQUEST_PERIOD.ordinal(), false, bool, null, Integer.valueOf(this.mListQueryType), bool);
                return;
            }
            final int[] iArr = {EnumC1253390iin.SMALL_PACKAGE.ordinal()};
            try {
                c15o7LIZIZ.LIZLLL(new InterfaceC2385309Wh() { // from class: X.0iis
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        final C1255780ime c1255780ime = this.LIZ;
                        final int[] iArr2 = iArr;
                        final C09AJ c09aj = c19482611Ke;
                        final C1256080in8 c1256080in82 = c1256080in8;
                        final boolean z3 = z;
                        final String str5 = str;
                        final int i8 = i;
                        final long j3 = j;
                        final long j4 = j2;
                        final int i9 = i2;
                        final String str6 = str2;
                        final int i10 = i3;
                        final int i11 = i4;
                        final boolean z4 = z2;
                        final String str7 = str3;
                        final String str8 = str4;
                        final int i12 = i5;
                        final int i13 = i6;
                        c1255780ime.getClass();
                        C1515820pY4 c1515820pY4 = (C1515820pY4) c15o7.LJIIL();
                        if (c1515820pY4 != null) {
                            c1515820pY4.LIZLLL(new C0POE<FeedItemList>() { // from class: X.0ijN
                                @Override // X.C0POE
                                public final void onComplete() {
                                    int i14 = C2187451AjH.LIZ;
                                    C1720106oR.LJI("AwemeModel", "fetPublicPostChunk onComplete");
                                }

                                @Override // X.C0POE
                                public final void onFailed(Throwable th) {
                                    c1255780ime.LJJIIZI(z3, str5, i8, j3, j4, i9, str6, i10, i11, z4, str7, str8, i12, i13, true);
                                    C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                                    int i14 = iArr2[0];
                                    Boolean bool2 = Boolean.FALSE;
                                    Integer numValueOf2 = Integer.valueOf(c1255780ime.mListQueryType);
                                    c1250680ieQ2.getClass();
                                    C1250680ieQ.LJIILJJIL(true, i14, false, bool2, th, numValueOf2, bool2);
                                    int i15 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("fetPublicPostChunk stream error, msg: ");
                                    sbLIZ.append(th.getMessage());
                                    sbLIZ.append(" cause: ");
                                    sbLIZ.append(th.getCause());
                                    C1720106oR.LIZ("AwemeModel", C2188811AlT.LIZIZ(sbLIZ));
                                }

                                @Override // X.C0POE
                                public final void onNext(FeedItemList feedItemList) {
                                    FeedItemList feedItemList2 = feedItemList;
                                    if (feedItemList2 != null) {
                                        if (feedItemList2.chunkIndex == 1) {
                                            int i14 = C2187451AjH.LIZ;
                                            C1720106oR.LJI("AwemeModel", "fetPublicPostChunk chunk index 1");
                                            ProfileTabApi.LIZJ(feedItemList2, false);
                                            C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                                            int iOrdinal2 = EnumC1253390iin.SMALL_PACKAGE.ordinal();
                                            Boolean bool2 = Boolean.FALSE;
                                            Integer numValueOf2 = Integer.valueOf(c1255780ime.mListQueryType);
                                            c1250680ieQ2.getClass();
                                            C1250680ieQ.LJIILJJIL(true, iOrdinal2, true, bool2, null, numValueOf2, bool2);
                                            iArr2[0] = EnumC1253390iin.BIG_PACKAGE.ordinal();
                                        }
                                        if (feedItemList2.chunkIndex == 0 && c09aj == null) {
                                            int i15 = C2187451AjH.LIZ;
                                            C1720106oR.LJI("AwemeModel", "fetPublicPostChunk chunk index 0");
                                            List<Aweme> items = feedItemList2.getItems();
                                            if (items == null) {
                                                items = new ArrayList<>();
                                            }
                                            if (C1ELC.LIZIZ()) {
                                                String str9 = c1255780ime.LLILLL;
                                                Object obj = C1253720ijK.LIZ;
                                                C1255730imZ.LJ(str9, items);
                                            } else {
                                                c1255780ime.LJJIIJ(items);
                                            }
                                            C1255780ime c1255780ime2 = c1255780ime;
                                            if (c1255780ime2.LLILZLL.equals(c1255780ime2.LLILLL)) {
                                                int iIntValue = c1256080in82.sortType.intValue();
                                                C1256130inD.LIZ.getClass();
                                                if (iIntValue != C1256130inD.LIZ()) {
                                                    C1255780ime c1255780ime3 = c1255780ime;
                                                    c1255780ime3.LLILZLL = c1255780ime3.LLILLL;
                                                    return;
                                                }
                                            }
                                            C1255780ime c1255780ime4 = c1255780ime;
                                            c1255780ime4.LLILZLL = c1255780ime4.LLILLL;
                                            C1BVK.LIZIZ().LIZ(c1255780ime.mHandler, new ACallableS416S0100000_9(feedItemList2, 17), 0);
                                            C1250680ieQ c1250680ieQ3 = C1250680ieQ.LIZ;
                                            int iOrdinal3 = EnumC1253390iin.BIG_PACKAGE.ordinal();
                                            Boolean bool3 = Boolean.FALSE;
                                            Integer numValueOf3 = Integer.valueOf(c1255780ime.mListQueryType);
                                            c1250680ieQ3.getClass();
                                            C1250680ieQ.LJIILJJIL(true, iOrdinal3, true, bool3, null, numValueOf3, bool3);
                                            return;
                                        }
                                        if (feedItemList2.chunkIndex != 0 || c09aj == null) {
                                            return;
                                        }
                                        int i16 = C2187451AjH.LIZ;
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("emitter: ");
                                        sbLIZ.append(c09aj);
                                        sbLIZ.append("isDisposed: ");
                                        sbLIZ.append(c09aj.isDisposed());
                                        C1720106oR.LJI("AwemeModel", C2188811AlT.LIZIZ(sbLIZ));
                                        if (!c09aj.isDisposed()) {
                                            c09aj.onNext(feedItemList2);
                                            c09aj.onComplete();
                                            C1250680ieQ c1250680ieQ4 = C1250680ieQ.LIZ;
                                            int iOrdinal4 = EnumC1253390iin.BIG_PACKAGE.ordinal();
                                            Boolean bool4 = Boolean.FALSE;
                                            Integer numValueOf4 = Integer.valueOf(c1255780ime.mListQueryType);
                                            c1250680ieQ4.getClass();
                                            C1250680ieQ.LJIILJJIL(true, iOrdinal4, true, bool4, null, numValueOf4, bool4);
                                            return;
                                        }
                                        Exception exc = new Exception("isDisposed");
                                        c09aj.onError(exc);
                                        C1250680ieQ c1250680ieQ5 = C1250680ieQ.LIZ;
                                        int i17 = iArr2[0];
                                        Boolean bool5 = Boolean.FALSE;
                                        Integer numValueOf5 = Integer.valueOf(c1255780ime.mListQueryType);
                                        c1250680ieQ5.getClass();
                                        C1250680ieQ.LJIILJJIL(true, i17, false, bool5, exc, numValueOf5, bool5);
                                    }
                                }
                            });
                            return null;
                        }
                        Exception exc = new Exception("request post stream is null");
                        c1255780ime.LJJIIZI(z3, str5, i8, j3, j4, i9, str6, i10, i11, z4, str7, str8, i12, i13, true);
                        C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                        int iOrdinal2 = EnumC1253390iin.REQUEST_PERIOD.ordinal();
                        Boolean bool2 = Boolean.FALSE;
                        Integer numValueOf2 = Integer.valueOf(c1255780ime.mListQueryType);
                        c1250680ieQ2.getClass();
                        C1250680ieQ.LJIILJJIL(true, iOrdinal2, false, bool2, exc, numValueOf2, bool2);
                        return null;
                    }
                });
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                C1BVK.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.01om
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Exception {
                        Exception exc = e;
                        if (exc instanceof Exception) {
                            throw exc;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("AwemeModel.fetPublicPostChunk: ");
                        sbLIZ.append(exc.getMessage());
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }, 0);
                C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                int iOrdinal2 = EnumC1253390iin.REQUEST_CATCH.ordinal();
                Boolean bool2 = Boolean.FALSE;
                Integer numValueOf2 = Integer.valueOf(this.mListQueryType);
                c1250680ieQ2.getClass();
                C1250680ieQ.LJIILJJIL(true, iOrdinal2, false, bool2, e, numValueOf2, bool2);
                int i8 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetPublicPostChunk error, msg: ");
                sbLIZ.append(e.getMessage());
                sbLIZ.append(" cause: ");
                sbLIZ.append(e.getCause());
                C1720106oR.LIZ("AwemeModel", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
