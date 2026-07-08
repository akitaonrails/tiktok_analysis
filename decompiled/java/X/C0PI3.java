package X;

import Y.ARunnableS110S0100000_10;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0PI3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0PI3 extends C0PN2<SearchMixFeed, SearchMixFeedList> implements C0PDP, InterfaceC666850QDr, InterfaceC642940PJs, InterfaceC582690MtH {
    public static final ArrayDeque<WeakReference<C0PHT>> LLJZ = new ArrayDeque<>();
    public final /* synthetic */ C0P5Y LLJJIJIL;
    public final C0PI7 LLJJJ;
    public final List<SearchMixFeed> LLJJJIL;
    public final C0PHT LLJJJJ;
    public final C0PSG LLJJJJJIL;
    public final InterfaceC642370PHn LLJJJJLIIL;
    public boolean LLJJL;
    public C641260PDg LLJJLIIIJLLLLLLLZ;
    public C641280PDi LLJL;
    public final int LLJLIL = 3;
    public C642250PHb LLJLILLLLZIIL;
    public C0PJE LLJLL;
    public InterfaceC1209780haS LLJLLIL;
    public final HashSet<String> LLJLLL;

    @Override // X.InterfaceC642940PJs
    public String LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC582690MtH
    public final void LIZLLL(long j, String str) {
        this.LLJJIJIL.LIZLLL(j, str);
    }

    @Override // X.InterfaceC666850QDr
    public void LJ(int i, int i2, Aweme aweme) {
    }

    @Override // X.InterfaceC642940PJs
    public Long LJI() {
        return null;
    }

    @Override // X.InterfaceC666850QDr
    public void LJII() {
    }

    public abstract boolean LJJI(int i, Aweme aweme);

    public void LJJII(Aweme aweme, AbstractC19875512pd abstractC19875512pd) {
    }

    public void LJJIIJ(SearchMixFeedList searchMixFeedList) {
    }

    public void LJJIIZ(int i, float f, int i2, Aweme aweme) {
    }

    public void LJJIJ(int i) {
    }

    public void LJJIJIL() {
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL() {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PI3.LJJIIJZLJL():void");
    }

    public void LJJIJIIJIL() {
        C0PHT c0pht = this.LLJJJJ;
        ArrayDeque<WeakReference<C0PHT>> arrayDeque = LLJZ;
        synchronized (arrayDeque) {
            try {
                C19719612Di.LJJIII(arrayDeque, new AwS589S0100000_10(c0pht, 298), true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t == 0 || ((SearchMixFeedList) t).hasMore;
    }

    public final void LJJIFFI() {
        AwemeRawAd awemeRawAd;
        Map<String, String> searchAdExtraParams;
        HashMap<String, String> searchExtraParams;
        HashMap<String, String> searchExtraParams2;
        HashMap<String, String> searchExtraParams3;
        HashMap<String, String> searchExtraParams4;
        HashMap<String, String> searchExtraParams5;
        for (SearchMixFeed searchMixFeed : getItems()) {
            if (!C1839607Ik.LIZ()) {
                Aweme aweme = searchMixFeed.getAweme();
                if (aweme != null && (searchExtraParams5 = AwemeBizExtKt.getSearchExtraParams(aweme)) != null) {
                    searchExtraParams5.remove("dual_stream_inner_item_mark");
                }
                Aweme aweme2 = searchMixFeed.getAweme();
                if (aweme2 != null && (searchExtraParams4 = AwemeBizExtKt.getSearchExtraParams(aweme2)) != null) {
                    searchExtraParams4.remove("dual_stream_enter_aid");
                }
                Aweme aweme3 = searchMixFeed.getAweme();
                if (aweme3 != null && (searchExtraParams3 = AwemeBizExtKt.getSearchExtraParams(aweme3)) != null) {
                    searchExtraParams3.remove("dual_stream_inner_item_enter_scene");
                }
                C0PIF c0pif = C0PIF.LIZ;
                Aweme aweme4 = searchMixFeed.getAweme();
                c0pif.getClass();
                if (aweme4 != null) {
                    HashMap<String, String> mobParams = aweme4.getMobParams();
                    if (mobParams != null) {
                        mobParams.remove("inner_search_id");
                    }
                    HashMap<String, String> mobParams2 = aweme4.getMobParams();
                    if (mobParams2 != null) {
                        mobParams2.remove("is_inner");
                    }
                    HashMap<String, String> mobParams3 = aweme4.getMobParams();
                    if (mobParams3 != null) {
                        mobParams3.remove("rank_inner");
                    }
                    HashMap<String, String> mobParams4 = aweme4.getMobParams();
                    if (mobParams4 != null) {
                        mobParams4.remove("rank");
                    }
                }
            }
            Aweme aweme5 = searchMixFeed.getAweme();
            if (aweme5 != null && (searchExtraParams2 = AwemeBizExtKt.getSearchExtraParams(aweme5)) != null) {
                searchExtraParams2.remove("dual_stream_inner_search_id");
            }
            Aweme aweme6 = searchMixFeed.getAweme();
            if (aweme6 != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme6)) != null) {
                searchExtraParams.remove("dual_stream_no_continue_play");
            }
            Aweme aweme7 = searchMixFeed.getAweme();
            if (aweme7 != null && (awemeRawAd = aweme7.getAwemeRawAd()) != null && (searchAdExtraParams = awemeRawAd.getSearchAdExtraParams()) != null) {
                searchAdExtraParams.remove("inner_ad_position");
                searchAdExtraParams.remove("inner_ad_from_inner_network_request");
            }
        }
        C0PIF c0pif2 = C0PIF.LIZ;
        List<Aweme> awemeList = ((C0PJH) this).getAwemeList();
        c0pif2.getClass();
        C0PIF.LJIIIIZZ(awemeList);
    }

    @Override // X.AbstractC1255880imo
    public void onModelBound() {
        super.onModelBound();
        C0PHT c0pht = this.LLJJJJ;
        ArrayDeque<WeakReference<C0PHT>> arrayDeque = LLJZ;
        synchronized (arrayDeque) {
            try {
                C19719612Di.LJJIII(arrayDeque, new AwS589S0100000_10(c0pht, 297), true);
                arrayDeque.addLast(new WeakReference<>(c0pht));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0PN2
    public final int LJIJ() {
        return this.LLJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f2 A[PHI: r1
      0x01f2: PHI (r1v52 X.0PIB) = (r1v51 X.0PIB), (r1v61 X.0PIB) binds: [B:100:0x01c9, B:107:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03dd  */
    @Override // X.C0PN2, X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJJIII, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleData(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PI3.LJIJI(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x009f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme r14, X.AbstractC19875512pd r15, X.AbstractC19875512pd r16) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PI3.LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme, X.12pd, X.12pd):void");
    }

    public List<SearchMixFeed> LJJIJIIJI(Aweme aweme, C0PN8 c0pn8, int i) {
        C0PHR c0phr = C0PHR.LIZ;
        C0PHT c0pht = this.LLJJJJ;
        c0phr.getClass();
        C0PHR.LJ(c0pht);
        C0PHR.LIZLLL(c0phr, this.LLJJJJ, false, 6);
        C0PHT c0pht2 = this.LLJJJJ;
        c0pht2.LIZJ = null;
        c0pht2.LIZLLL = null;
        c0pht2.LJ = null;
        return C13BV.INSTANCE;
    }

    public C0PI3(C0PI7 c0pi7, AbstractC19875512pd abstractC19875512pd, C0PHT c0pht, C0PSG c0psg, InterfaceC642370PHn interfaceC642370PHn) {
        this.LLJJIJIL = new C0P5Y(c0pi7);
        this.LLJJJ = c0pi7;
        this.LLJJJIL = abstractC19875512pd;
        this.LLJJJJ = c0pht;
        this.LLJJJJJIL = c0psg;
        this.LLJJJJLIIL = interfaceC642370PHn;
        if (C292480BdG.LIZ()) {
            C823050WQl.LIZJ().execute(new ARunnableS110S0100000_10((C0PJH) this, 68));
        } else {
            LJJIIJZLJL();
        }
        this.LLJLLL = new HashSet<>();
    }
}
