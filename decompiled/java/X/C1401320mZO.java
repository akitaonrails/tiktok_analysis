package X;

import Y.ACallableS18S2100000_8;
import Y.AObjectS122S0000000_21;
import Y.AObjectS362S0100000_19;
import Y.ARunnableS88S0200000_19;
import Y.AfS138S0000000_16;
import Y.AfS190S0100000_21;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicAwemeListRequestModel;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mZO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401320mZO extends AbstractC1255880imo<Aweme, MusicAwemeList> {
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public long LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public MusicAwemeListRequestModel LLJIJIL;
    public C1400860mYe LLJJJ;
    public MusicDetail LLJJJIL;
    public List<Aweme> LLJJJJ;
    public final String LL = "MusicDetailPage";
    public String LLJI = "";
    public final HashSet<String> LLJILJILJ = new HashSet<>();
    public final HashSet<String> LLJILLL = new HashSet<>();
    public final C199494133s<MusicAwemeList> LLJJ = new C199494133s<>();
    public boolean LLJJI = false;
    public boolean LLJJIII = false;
    public boolean LLJJIJI = true;
    public boolean LLJJIJIIJIL = false;
    public final C11NJ LLJJIJIL = new C11NJ();
    public boolean LLJJJJJIL = false;
    public boolean LLJJJJLIIL = false;
    public boolean LLJJL = false;
    public final C628510Okz LLJILJIL = new C628510Okz(new AObjectS362S0100000_19(this, 12), new AObjectS122S0000000_21(2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0 || ((MusicAwemeList) t).items == null) {
            return null;
        }
        Iterator<Aweme> it2 = ((MusicAwemeList) t).items.iterator();
        while (it2.hasNext()) {
            it2.next().setLogPbBean(((MusicAwemeList) this.mData).logPb);
        }
        return ((MusicAwemeList) this.mData).items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        T t = this.mData;
        return (t == 0 || !((MusicAwemeList) t).isHasMore()) && C086I.LIZIZ(getItems());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((MusicAwemeList) t).isHasMore();
    }

    @Override // X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJIILJJIL, reason: merged with bridge method [inline-methods] */
    public final MusicAwemeList getData() {
        return (MusicAwemeList) super.getData();
    }

    public static void LJIILL(String str) {
        C1399330mWB.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(1, "aweme_load_failed");
        c2344009Gk.LJIIIIZZ("fail_reason", str);
        C20684815ws.LJIILLIIL("tool_performance_music_detail_tracker", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, 1024);
            }
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("music_id", str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C794240VDq.LIZJ("music_id_has_space", jSONObject);
    }

    public final String LJIIJ(MusicAwemeList musicAwemeList) {
        VideoUrlModel playAddr;
        String uri;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < musicAwemeList.items.size(); i++) {
            Aweme aweme = (Aweme) ListProtector.get(musicAwemeList.items, i);
            String aid = aweme.getAid();
            Video video = aweme.getVideo();
            if (video == null || (playAddr = video.getPlayAddr()) == null || (uri = playAddr.getUri()) == null || !TextUtils.isEmpty(uri)) {
                this.LLJILLL.add(aid);
            }
            if (i > 0) {
                sb.append(",");
                sb.append(aid);
            } else {
                sb.append(aid);
            }
        }
        return sb.toString();
    }

    public final void LJIL(MusicAwemeList musicAwemeList) {
        if (musicAwemeList.items.isEmpty()) {
            this.LLJJI = true;
            return;
        }
        for (int i = 0; i < musicAwemeList.items.size(); i++) {
            String aid = ((Aweme) ListProtector.get(musicAwemeList.items, i)).getAid();
            if (aid != null) {
                this.LLJILLL.remove(aid);
            }
        }
    }

    @Override // X.AbstractC666100QAu
    public boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 3) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final boolean deleteItem(Aweme aweme) {
        return C729980SkG.LIZIZ(getItems(), aweme, this.mNotifyListeners);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x035a, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r7, r0, r5);
        r0 = r0 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.ss.android.ugc.aweme.music.model.MusicAwemeList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, com.ss.android.ugc.aweme.music.model.MusicAwemeList, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC666100QAu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1401320mZO.handleData(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public void loadMoreList(Object... objArr) {
        Music music;
        T t;
        List<Aweme> list;
        boolean z;
        AbstractC683510QrV abstractC683510QrV;
        T t2 = this.mData;
        long cursor = 0;
        if (t2 != 0 && ((MusicAwemeList) t2).containSquareData && C636090OxD.LIZ()) {
            String str = (String) objArr[1];
            if (!isDataEmpty()) {
                cursor = ((MusicAwemeList) this.mData).getCursor("square");
            }
            int i = this.LLIZLLLIL;
            T t3 = this.mData;
            if (t3 != 0 && ((MusicAwemeList) t3).getHasMore("square") == 1) {
                z = true;
            } else {
                z = false;
            }
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadMoreMusicSquareList-->hasMore:");
            sbLIZ.append(z);
            sbLIZ.append(" isHasMore:");
            sbLIZ.append(((MusicAwemeList) this.mData).isHasMore());
            C201955140j.LJIILIIL(str2, C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                LJIILIIL(i, cursor, str);
                return;
            }
            C1400860mYe c1400860mYe = this.LLJJJ;
            if (c1400860mYe != null) {
                C1261230ivR c1261230ivR = c1400860mYe.LIZ.LLJJJJ;
                if (c1261230ivR != null) {
                    c1261230ivR.setShowFooter(true);
                }
                RecyclerView recyclerView = c1400860mYe.LIZ.LLJJIJIIJIL;
                AbstractC21673619ry adapter = null;
                if (recyclerView != null) {
                    adapter = recyclerView.getAdapter();
                }
                if ((adapter instanceof AbstractC654930PmV) && (abstractC683510QrV = (AbstractC683510QrV) adapter) != null) {
                    abstractC683510QrV.resetLoadMoreState();
                }
            }
            this.mListQueryType = 2;
            this.mIsNewDataEmpty = true;
            List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
            if (list2 == null) {
                return;
            }
            Iterator<InterfaceC1526205yG> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().onSuccess();
            }
            return;
        }
        MusicDetail musicDetail = this.LLJJJIL;
        if (musicDetail != null && (music = musicDetail.music) != null && (t = this.mData) != 0 && C1400680mYM.LIZJ(music, ((MusicAwemeList) t).items, Integer.valueOf(music.getUserCount()), true) && (list = ((MusicAwemeList) this.mData).foldAidItems) != null && !list.isEmpty()) {
            return;
        }
        String str3 = (String) objArr[1];
        if (!isDataEmpty()) {
            cursor = ((MusicAwemeList) this.mData).cursor;
        }
        LJIIL(this.LLIZLLLIL, ((Integer) objArr[2]).intValue(), false, str3, cursor);
    }

    @Override // X.AbstractC1255880imo
    public void refreshList(Object... objArr) {
        C636120OxG.LIZ.getClass();
        C636120OxG.LIZIZ.put("normal_refresh", Long.valueOf(System.currentTimeMillis()));
        C633100OsO.LIZ.getClass();
        this.LLJILJILJ.clear();
        this.LLJILLL.clear();
        this.LLJJI = false;
        if (C0C0Z.LIZ() && C306580C0a.LIZ()) {
            if (objArr.length > 7) {
                this.LLILZLL = (String) objArr[7];
            }
            String str = this.LLILZLL;
            if (str == null || str.isEmpty()) {
                this.LLILZLL = this.LLILZIL;
            }
            if (objArr.length >= 6) {
                LJIIJJI(20, (String) objArr[1], this.LLILZLL, ((Integer) objArr[2]).intValue(), 0L, ((Boolean) objArr[5]).booleanValue());
                return;
            }
            LJIIJJI(20, (String) objArr[1], this.LLILZLL, ((Integer) objArr[2]).intValue(), 0L, false);
            return;
        }
        if (objArr.length >= 6) {
            LJIIL(20, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[5]).booleanValue(), (String) objArr[1], 0L);
        } else {
            LJIIL(20, ((Integer) objArr[2]).intValue(), false, (String) objArr[1], 0L);
        }
    }

    @Override // X.AbstractC666100QAu
    public final void resetLoadingStatus(Message message) {
        super.resetLoadingStatus(message);
        C633100OsO.LIZ.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.ss.android.ugc.aweme.music.model.MusicAwemeList] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<Aweme> list) {
        if (this.mData == 0) {
            this.mData = new MusicAwemeList();
        }
        ((MusicAwemeList) this.mData).setHasMore(1);
        ((MusicAwemeList) this.mData).items = list;
    }

    public static void LJIJJLI(String str, ArrayList arrayList) {
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((Aweme) it2.next()).getAid().equals(str)) {
                it2.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(com.ss.android.ugc.aweme.music.model.MusicAwemeList r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1401320mZO.LJIJJ(com.ss.android.ugc.aweme.music.model.MusicAwemeList, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILIIL(int i, long j, String str) {
        T t = this.mData;
        if (t != 0) {
            ((MusicAwemeList) t).requestingSquareData = true;
        }
        C201955140j.LJIILIIL(this.LL, "fetchMusicSquareList-->begin");
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        C1401370mZT c1401370mZT = new C1401370mZT();
        c1401370mZT.LIZ.LJFF("music_id", str);
        C1401550mZl c1401550mZl = C1401550mZl.LIZ;
        C1401330mZP c1401330mZP = new C1401330mZP(this, c1401370mZT, lValueOf, j);
        c1401550mZl.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C635930Owx(str, j, i, c1401330mZP, null), 3);
    }

    public final void LJIJI(String str, String str2, String str3) {
        String str4 = str3;
        if (C0C0Z.LIZ() && C306580C0a.LIZ() && (str4 == null || str4.isEmpty())) {
            C201955140j.LIZIZ("wqh_test", "preFetchList, matchedSongId is null, so return");
            return;
        }
        C636120OxG.LIZ.getClass();
        C636120OxG.LIZIZ.put("normal_refresh", Long.valueOf(System.currentTimeMillis()));
        this.LLILZIL = str;
        this.LLIZ = 0L;
        this.LLIZLLLIL = 20;
        this.LLILLJJLI = 0;
        if (str2 != null) {
            this.LLJI = str2;
        } else {
            this.LLJI = "";
        }
        this.LLJJJJJIL = false;
        if (C0C0Z.LIZ() && C306580C0a.LIZ()) {
            if (str4 == null || str4.isEmpty()) {
                this.LLILZLL = str;
                str4 = str;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preFetchList, matchedSongId = ");
            sbLIZ.append(str4);
            C201955140j.LIZIZ("wqh_test", C2188811AlT.LIZIZ(sbLIZ));
            LJIIJJI(this.LLIZLLLIL, str, str4, this.LLILLJJLI, this.LLIZ, false);
            return;
        }
        LJIIL(this.LLIZLLLIL, this.LLILLJJLI, false, str, this.LLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(int i, int i2, boolean z, String str, long j) {
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        this.LLILZIL = str;
        this.LLIZ = j;
        this.LLIZLLLIL = i;
        this.LLILLJJLI = i2;
        if (!TextUtils.isEmpty(str) && str.endsWith(" ")) {
            LJIILLIIL(str);
        }
        if (this.LLILLL && j == 0 && !z) {
            C633100OsO c633100OsO = C633100OsO.LIZ;
            String str2 = this.LLJI;
            c633100OsO.getClass();
            MusicAwemeList musicAwemeListLIZIZ = C633100OsO.LIZIZ(i, str, j, i2, str2);
            if (musicAwemeListLIZIZ != null) {
                C19371010qS.LIZIZ(System.currentTimeMillis() - C633100OsO.LIZJ(i, j, i2, str, this.LLJI), "md_hit_cache");
                if (musicAwemeListLIZIZ != null) {
                    if (musicAwemeListLIZIZ.items != null) {
                        String str3 = this.LL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchList-->fetch cache, awemeList.item:");
                        sbLIZ.append(musicAwemeListLIZIZ.items.size());
                        sbLIZ.append(" awemeList:");
                        sbLIZ.append(musicAwemeListLIZIZ);
                        C201955140j.LJIILIIL(str3, C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        String str4 = this.LL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fetchList-->fetch cache, awemeList.item is empty:");
                        sbLIZ2.append(musicAwemeListLIZIZ);
                        C201955140j.LJIILIIL(str4, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    this.LLILZ = false;
                    Message message = new Message();
                    message.obj = musicAwemeListLIZIZ;
                    this.LLJJJJJIL = false;
                    T t = this.mData;
                    if (t != 0) {
                        ((MusicAwemeList) t).lastDataFrom = "normal";
                    }
                    C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS88S0200000_19(this, message, 18));
                    return;
                }
            } else {
                C19371010qS.LIZIZ(-1L, "md_hit_cache");
            }
        }
        String str5 = this.LL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("cursor:");
        sbLIZ3.append(j);
        sbLIZ3.append(" isFirstRequest:");
        sbLIZ3.append(this.LLJJIJI);
        sbLIZ3.append(" isPullToRefresh:");
        sbLIZ3.append(z);
        C201955140j.LIZIZ(str5, C2188811AlT.LIZIZ(sbLIZ3));
        if (j == 0) {
            this.LLILZ = true;
        }
        T t2 = this.mData;
        if (t2 != 0) {
            ((MusicAwemeList) t2).requestingNormalData = true;
        }
        C1401550mZl c1401550mZl = C1401550mZl.LIZ;
        RunnableC1401340mZQ runnableC1401340mZQ = new RunnableC1401340mZQ(this, j, str, i, i2);
        c1401550mZl.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01LZ(runnableC1401340mZQ, null), 3);
    }

    public final void LJIIJJI(final int i, final String str, String str2, final int i2, final long j, final boolean z) {
        if (this.LLJJJJJIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchCombinedResult return , matchedSongId = ");
            sbLIZ.append(str2);
            C201955140j.LIZIZ("wqh_test", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLJJJJJIL = true;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("do fetchCombinedResult matchedSongId = ");
        sbLIZ2.append(str2);
        C201955140j.LIZIZ("wqh_test", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILZIL = str;
        this.LLIZ = j;
        this.LLIZLLLIL = i;
        this.LLILLJJLI = i2;
        if (!TextUtils.isEmpty(str) && str.endsWith(" ")) {
            LJIILLIIL(str);
        }
        this.LLJJIJIL.LIZ(C11NZ.LJIIJ(C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0mZR
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ c09aj) throws Exception {
                MusicAwemeList musicAwemeListLIZIZ;
                boolean z2;
                String strLIZLLL;
                MusicAwemeList musicAwemeListLIZIZ2;
                C1401320mZO c1401320mZO = this.LIZ;
                long j2 = j;
                boolean z3 = z;
                String str3 = str;
                int i3 = i;
                int i4 = i2;
                c1401320mZO.getClass();
                C1C7U.LIZ("MusicAwemeModel@3103.fetchCombinedResult$1L");
                if (c1401320mZO.LLILLL && j2 == 0 && !z3) {
                    C633100OsO c633100OsO = C633100OsO.LIZ;
                    String str4 = c1401320mZO.LLJI;
                    c633100OsO.getClass();
                    musicAwemeListLIZIZ = C633100OsO.LIZIZ(i3, str3, j2, i4, str4);
                    if (musicAwemeListLIZIZ != null) {
                        C19371010qS.LIZIZ(System.currentTimeMillis() - C633100OsO.LIZJ(i3, j2, i4, str3, c1401320mZO.LLJI), "md_hit_cache");
                    } else {
                        C19371010qS.LIZIZ(-1L, "md_hit_cache");
                    }
                } else {
                    musicAwemeListLIZIZ = null;
                }
                if (musicAwemeListLIZIZ != null) {
                    String str5 = c1401320mZO.LL;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("fetchCombinedResult-->fetch cache, awemeList:");
                    sbLIZ3.append(musicAwemeListLIZIZ);
                    C201955140j.LJIILIIL(str5, C2188811AlT.LIZIZ(sbLIZ3));
                    c1401320mZO.LLILZ = false;
                    c1401320mZO.LLJJJJJIL = false;
                    c09aj.onNext(musicAwemeListLIZIZ);
                    c09aj.onComplete();
                } else {
                    if (j2 == 0) {
                        c1401320mZO.LLILZ = true;
                    }
                    new MusicAwemeList();
                    try {
                        ITemplateService iTemplateService = (ITemplateService) PluggableExtentionKt.pluggableSpi(ITemplateService.class);
                        if (iTemplateService == null) {
                            strLIZLLL = "";
                        } else {
                            strLIZLLL = iTemplateService.LIZLLL();
                        }
                        if (!C297030Bkb.LIZ()) {
                            strLIZLLL = null;
                        }
                    } catch (Exception e) {
                        e = e;
                        z2 = false;
                    }
                    try {
                        if (j2 == 0 && c1401320mZO.LLJJIJI && c1401320mZO.LLJJIJIIJIL && C297090Bkh.LIZ()) {
                            c1401320mZO.LLJJIJI = false;
                            C632130Oqp.LIZ.getClass();
                            musicAwemeListLIZIZ2 = C632130Oqp.LIZIZ();
                            if (musicAwemeListLIZIZ2 == null) {
                                z2 = false;
                                musicAwemeListLIZIZ2 = MusicAwemeApi.LIZIZ(str3, j2, i3, i4, c1401320mZO.LLJI, strLIZLLL, c1401320mZO.LLJIJIL);
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                            musicAwemeListLIZIZ2 = MusicAwemeApi.LIZIZ(str3, j2, i3, i4, c1401320mZO.LLJI, strLIZLLL, c1401320mZO.LLJIJIL);
                        }
                        c1401320mZO.LLJJJJJIL = z2;
                        if (musicAwemeListLIZIZ2 != null && musicAwemeListLIZIZ2.needLazyLoading) {
                            String strLJIIJ = c1401320mZO.LJIIJ(musicAwemeListLIZIZ2);
                            String str6 = musicAwemeListLIZIZ2.lazyLoadingCtx;
                            int i5 = musicAwemeListLIZIZ2.hasMore;
                            boolean z4 = musicAwemeListLIZIZ2.canPinVideo;
                            long j3 = musicAwemeListLIZIZ2.cursor;
                            c1401320mZO.LLJJIII = true;
                            C1399330mWB c1399330mWB = C1399330mWB.LIZ;
                            List<Aweme> list = musicAwemeListLIZIZ2.items;
                            c1399330mWB.getClass();
                            C1399330mWB.LIZ(list);
                            c09aj.onNext(c1401320mZO.LJIJ(j2, j3, i3, z4, i4, strLJIIJ, i5, str6));
                            c09aj.onComplete();
                        } else {
                            if (musicAwemeListLIZIZ2 != null) {
                            }
                            c09aj.onNext(musicAwemeListLIZIZ2);
                            c09aj.onComplete();
                        }
                        if (musicAwemeListLIZIZ2.items != null) {
                            String str7 = c1401320mZO.LL;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("fetchCombinedResult result-->size:");
                            sbLIZ4.append(musicAwemeListLIZIZ2.items.size());
                            sbLIZ4.append(" hasMore:");
                            sbLIZ4.append(musicAwemeListLIZIZ2.isHasMore());
                            C201955140j.LJIILIIL(str7, C2188811AlT.LIZIZ(sbLIZ4));
                        }
                        if (musicAwemeListLIZIZ2.logPb != null) {
                            String str8 = c1401320mZO.LL;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("fetchCombinedResult result-->log_id:");
                            sbLIZ5.append(musicAwemeListLIZIZ2.logPb.getImprId());
                            C201955140j.LJIILIIL(str8, C2188811AlT.LIZIZ(sbLIZ5));
                        }
                        c09aj.onNext(musicAwemeListLIZIZ2);
                        c09aj.onComplete();
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        c1401320mZO.LLJJJJJIL = z2;
                        C632130Oqp.LIZ.getClass();
                        String strLIZLLL2 = C632130Oqp.LIZLLL(e);
                        C1401320mZO.LJIILL(strLIZLLL2);
                        C636120OxG.LIZ.getClass();
                        C636120OxG.LIZ("normal_refresh", strLIZLLL2, z2);
                        throw e;
                    }
                }
                C1C7U.LIZIZ("MusicAwemeModel@3103.fetchCombinedResult$1L");
            }
        }).LJL(C11S5.LIZ()), C11NZ.LJJJJI(new ACallableS18S2100000_8(this, str2, str, 0)).LJL(C11S5.LIZ()).LJLJI(((Number) C286200BJq.LIZ.getValue()).longValue(), TimeUnit.MILLISECONDS).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.0mZU
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return 0;
            }
        }).LJJLIL(-1), new InterfaceC500500Jk0() { // from class: X.0mZV
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return new Pair(obj, obj2);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS190S0100000_21(this, 13), new AfS138S0000000_16(9)));
    }

    public final MusicAwemeList LJIJ(long j, long j2, int i, boolean z, int i2, String str, int i3, String str2) {
        MusicAwemeList musicAwemeList = new MusicAwemeList();
        try {
            musicAwemeList = MusicAwemeApi.LIZJ(this.LLILZIL, i, j, this.LLJI, str, i2, str2);
            if (musicAwemeList != null && musicAwemeList.items != null) {
                musicAwemeList.setHasMore(i3);
                musicAwemeList.setCursor(j2);
                musicAwemeList.canPinVideo = z;
                LJIL(musicAwemeList);
                musicAwemeList.skipFiltering = true;
                C1399330mWB c1399330mWB = C1399330mWB.LIZ;
                List<Aweme> list = musicAwemeList.items;
                c1399330mWB.getClass();
                C1399330mWB.LIZIZ(list);
            } else {
                this.LLJJI = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLJJI = true;
            C1399330mWB.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(1, "lazy_load_failed");
            C20684815ws.LJIILLIIL("tool_performance_music_detail_tracker", c2344009Gk.LIZ);
            C632130Oqp.LIZ.getClass();
            LJIILL(C632130Oqp.LIZLLL(e));
        }
        this.LLJJIII = false;
        return musicAwemeList;
    }
}
