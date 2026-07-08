package X;

import Y.ARunnableS109S0100000_9;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.feed.IFeedRequestExService;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.intervention.ContentInfoStruct;
import com.ss.android.ugc.aweme.feed.model.intervention.InterventionInfoStruct;
import com.ss.android.ugc.aweme.feed.model.video.TranslatedVideo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import defpackage.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS39S0200100_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NET, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NET {
    public static volatile FeedItemList LIZLLL;
    public static FeedItemList LJ;
    public static volatile FeedItemList LJFF;
    public static volatile boolean LJI;
    public static volatile boolean LJII;
    public static volatile boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static volatile boolean LJIIJ;
    public static volatile boolean LJIIJJI;
    public static volatile boolean LJIIL;
    public static boolean LJIILJJIL;
    public static Aweme LJIILL;
    public static int LJIILLIIL;
    public static int LJIIZILJ;
    public static boolean LJIJ;
    public static boolean LJIJI;
    public static boolean LJIJJ;
    public static int LJIL;
    public static final C0NET LIZ = new C0NET();
    public static final CountDownLatch LIZIZ = new CountDownLatch(1);
    public static final Object LIZJ = new Object();
    public static final C01GW LJIILIIL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C0NEZ());
    public static final List<Aweme> LJIJJLI = new ArrayList();

    public static String LJ() {
        C590420NDs.LIZ.getClass();
        String string = C590420NDs.LJI().getString("feed_video_cache_current_uid", "");
        return string != null ? string : "";
    }

    public static void LJIIL() {
        if (((Boolean) C1230104rb.LIZIZ.getValue()).booleanValue() && ((Boolean) C1243404tk.LIZIZ.getValue()).booleanValue()) {
            C592890NNf.LIZIZ().LIZJ();
        }
    }

    public static void LJIILIIL() {
        synchronized (LIZJ) {
            try {
                try {
                    C0X35.LIZ("feed_get_cache_duration", true);
                    if (C797930VRv.LIZ()) {
                        C590420NDs.LIZ.getClass();
                        C590420NDs.LJI().storeInt("key_session_count", C590420NDs.LJI().getInt("key_session_count", 0) + 1);
                        C797930VRv.LIZIZ("sessionCountAdd");
                    }
                    boolean zBooleanValue = ((Boolean) C0BL2.LIZ.getValue()).booleanValue();
                    C313520CQs c313520CQs = C313530CQt.LIZ;
                    int i = zBooleanValue ? 1 : 2;
                    c313520CQs.getClass();
                    C313520CQs.LIZ(i, "live_revenue_disable_cache_experiment");
                    if (zBooleanValue) {
                        C313520CQs.LIZ(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("key_disable_feed_cache") ? 1 : 2, "live_revenue_contains_key");
                        boolean z = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("key_disable_feed_cache", false);
                        C313520CQs.LIZ(z ? 1 : 2, "live_revenue_disable_cache_webcast");
                        if (z) {
                            C1150504el.LIZ().LIZIZ(1, "cache_unused_reason");
                            C313520CQs.LIZ(1, "cache_unused_reason");
                            LIZ.getClass();
                            if (LIZLLL == null) {
                                LJIIL();
                            }
                            return;
                        }
                    }
                    if (((Boolean) C0AOV.LIZ.getValue()).booleanValue()) {
                        LIZ.getClass();
                        if (LIZLLL == null) {
                            LJIIL();
                        }
                        return;
                    }
                    LIZ.getClass();
                    LJIILL();
                    if (LIZLLL != null && ComplianceServiceProvider.LJI().LJIIJ(false) && (((Boolean) AFwS195S0000000_9.get$arr$(640).invoke()).booleanValue() ^ C1567040qsg.LIZIZ())) {
                        LIZLLL = null;
                        C1150504el.LIZ().LJJIFFI = C0NEV.NON_PERSONALIZED;
                    }
                    C0X35.LJIIJJI("feed_get_cache_duration", true);
                    C0X35.LIZ("feed_get_cache_to_use_cache", false);
                    C0X35.LIZ("feed_get_cache_to_prerender", true);
                    if (LIZLLL == null) {
                        LJIIL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (LIZLLL == null) {
                        LIZ.getClass();
                        LJIIL();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static void LJIILJJIL() {
        if (LJIIIZ) {
            return;
        }
        LJIIIZ = true;
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0NEX
            public static void LIZ() {
                try {
                    C0NET.LIZ.getClass();
                    C0NET.LJIILIIL();
                    C0NET.LJII = true;
                    C0NET.LIZIZ.countDown();
                    if (!C285090BFj.LJIIJ()) {
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C805380Via.LIZIZ(th);
                        C0NET.LIZ.getClass();
                        C0NET.LJII = true;
                        C0NET.LIZIZ.countDown();
                        if (!C285090BFj.LJIIJ()) {
                            return;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C0NET.LIZ.getClass();
                        C0NET.LJII = true;
                        C0NET.LIZIZ.countDown();
                        if (C285090BFj.LJIIJ()) {
                            C0NET.LJIILLIIL();
                        }
                        throw th2;
                    }
                }
                C0NET.LJIILLIIL();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedCacheLoader@a3e3.preloadCacheAsync$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedCacheLoader@a3e3.preloadCacheAsync$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x039b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL() {
        /*
            Method dump skipped, instruction units count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NET.LJIILL():void");
    }

    public static void LJIILLIIL() {
        FeedItemList feedItemList;
        List<Aweme> items;
        Aweme aweme;
        List<Aweme> items2;
        FeedItemList feedItemList2 = LIZLLL;
        if ((feedItemList2 != null && (items2 = feedItemList2.getItems()) != null && items2.isEmpty()) || (feedItemList = LIZLLL) == null || (items = feedItemList.getItems()) == null || (aweme = (Aweme) ListProtector.get(items, 0)) == null) {
            return;
        }
        LJIILL = aweme;
        C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(aweme, 228));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.FeedItemList LJIJJ() {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NET.LJIJJ():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:186|169|(6:171|(1:173)(1:175)|174|389|187|190)|393|191|(13:193|(1:195)|198|(2:200|202)(1:201)|203|(2:205|207)(1:206)|208|214|(1:216)(1:245)|217|(2:226|(2:228|(1:244)(1:232)))|233|(8:235|(1:237)(1:243)|238|(1:240)(1:242)|241|402|246|249))(1:196)|395|197|198|(0)(0)|203|(0)(0)|208|214|(0)(0)|217|(5:219|222|224|226|(0))|233|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04fc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0500, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r13 = java.lang.Integer.valueOf(X.C1498560p6E.LIZIZ(r0, null));
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04aa A[Catch: Exception -> 0x04fe, TryCatch #2 {Exception -> 0x04fe, blocks: (B:191:0x0451, B:193:0x04aa), top: B:393:0x0451 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 2209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NET.LIZ():void");
    }

    @InterfaceC1294060jmO
    public static boolean LJI() {
        String str;
        List listLJJLIIIJILLIZJL;
        if (C0X35.LJIILIIL()) {
            return true;
        }
        if (((Boolean) C1EKD.LJFF.getValue()).booleanValue()) {
            return LJIIZILJ(true);
        }
        C590420NDs.LIZ.getClass();
        if (C590420NDs.LJIIJ().length() == 0 || C0NEU.LIZIZ() == null) {
            return false;
        }
        String strLIZJ = C0NFP.LIZJ(C590420NDs.LJIIJ());
        if (strLIZJ == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZJ, new String[]{","}, 0, 6)) == null || (str = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0)) == null) {
            str = "";
        }
        return new C0VSJ(str).exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0579 A[PHI: r1
      0x0579: PHI (r1v25 java.lang.String) = (r1v16 java.lang.String), (r1v15 java.lang.String) binds: [B:175:0x0577, B:108:0x042e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x072c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJII() {
        /*
            Method dump skipped, instruction units count: 2106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NET.LJII():boolean");
    }

    public static boolean LJIIIZ() {
        return C0CD2.LIZ() ? C587860N3w.LIZJ : Intrinsics.LJFF(C587860N3w.LIZIZ, Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public static boolean LJIIJ() {
        ?? r2;
        int i;
        if (C1ES5.LIZIZ()) {
            C590420NDs.LIZ.getClass();
            if (C590420NDs.LJIIIZ() > 0) {
                if (C590420NDs.LJIIIZ() == 1) {
                    x0.LIZ.getClass();
                    x0.LJIIIIZZ();
                }
                return true;
            }
        }
        C01GW c01gw = C285090BFj.LJJJJIZL;
        if (((Boolean) c01gw.getValue()).booleanValue() && !C0CN5.LJII() && (i = LJIIZILJ) > 0) {
            return i == 1;
        }
        C590420NDs.LIZ.getClass();
        long jLIZJ = C590420NDs.LIZJ();
        String strLJIIJ = C590420NDs.LJIIJ();
        boolean z = System.currentTimeMillis() - jLIZJ >= C0NEU.LIZ();
        boolean zIsEmpty = TextUtils.isEmpty(strLJIIJ);
        if (z || zIsEmpty) {
            r2 = 1;
            x0.LIZ.getClass();
            x0.LJIIIIZZ();
        } else {
            r2 = 0;
        }
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            LJIIZILJ = r2 != 0 ? 1 : 2;
        }
        if (zIsEmpty) {
            C1150504el.LIZ().LJJIFFI = C0NEV.ALL_KEVA_EMPTY;
        } else if (z) {
            C1150504el.LIZ().LJJIFFI = C0NEV.ALL_TIME_OUT;
        }
        C1150504el.LIZ().LIZIZ(zIsEmpty ? 1 : 0, "feed_cache_keva_empty_when_used");
        C1150504el.LIZ().LIZIZ((zIsEmpty || !z) ? 0 : 1, "feed_cache_expired_when_used");
        C1150504el.LIZ().LIZIZ(r2, "feed_origin_cache_expired_when_used");
        return r2;
    }

    public static void LIZIZ(FeedItemList feedItemList) {
        TranslatedVideo translatedVideo;
        String languageCode;
        Audio audio;
        List<TtsInfos> ttsInfos;
        Integer numValueOf;
        List<TtsInfos> ttsInfos2;
        List<TtsInfos> ttsInfos3;
        if (feedItemList != null && !C086I.LIZIZ(feedItemList.getItems()) && feedItemList.getItems() != null) {
            Iterator<Aweme> it2 = feedItemList.getItems().iterator();
            while (it2.hasNext()) {
                Aweme next = it2.next();
                if (next != null) {
                    if (AwemeSaaSExtKt.isLive(next)) {
                        it2.remove();
                        C797930VRv.LIZIZ("fetchFeeds, filter by isLive");
                    } else if (C729510SjV.LJJIJIL(next)) {
                        it2.remove();
                        C797930VRv.LIZIZ("fetchFeeds, filter by belong story");
                    } else if (((Boolean) C1856707Oz.LIZIZ.getValue()).booleanValue() && next.isAd()) {
                        it2.remove();
                        C797930VRv.LIZIZ("fetchFeeds, filter by is ad");
                    } else if (((Boolean) C1856707Oz.LIZLLL.getValue()).booleanValue() && next.getAwemeType() == 150) {
                        it2.remove();
                    } else {
                        C01GW c01gw = C0A82.LIZ;
                        if (((Number) c01gw.getValue()).longValue() > 0 && next.getVideo() != null && next.getVideo().getDuration() > ((Number) c01gw.getValue()).longValue()) {
                            it2.remove();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("fetchFeeds, filter by long video duration ");
                            sbLIZ.append(next.getVideo().getDuration());
                            C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            String languageCode2 = null;
                            numValueOf = null;
                            Integer numValueOf2 = null;
                            if (C1481040ody.LIZ() && (audio = next.getAudio()) != null && (ttsInfos = audio.getTtsInfos()) != null && (!ttsInfos.isEmpty())) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("fetchFeeds filter auto dubbing video with ttsInfos ");
                                Audio audio2 = next.getAudio();
                                if (audio2 != null && (ttsInfos3 = audio2.getTtsInfos()) != null) {
                                    numValueOf = Integer.valueOf(ttsInfos3.size());
                                } else {
                                    numValueOf = null;
                                }
                                sbLIZ2.append(numValueOf);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                it2.remove();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("fetchFeeds, filter by auto dubbing video with ttsInfos ");
                                Audio audio3 = next.getAudio();
                                if (audio3 != null && (ttsInfos2 = audio3.getTtsInfos()) != null) {
                                    numValueOf2 = Integer.valueOf(ttsInfos2.size());
                                }
                                sbLIZ3.append(numValueOf2);
                                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            } else if (C287430BOj.LIZ() && (translatedVideo = next.getTranslatedVideo()) != null && translatedVideo.getVideo() != null) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("fetchFeeds filter ECom dubbing video with language code ");
                                TranslatedVideo translatedVideo2 = next.getTranslatedVideo();
                                if (translatedVideo2 != null) {
                                    languageCode = translatedVideo2.getLanguageCode();
                                } else {
                                    languageCode = null;
                                }
                                sbLIZ4.append(languageCode);
                                C2188811AlT.LIZIZ(sbLIZ4);
                                it2.remove();
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("fetchFeeds, filter by ECom dubbing video with language code ");
                                TranslatedVideo translatedVideo3 = next.getTranslatedVideo();
                                if (translatedVideo3 != null) {
                                    languageCode2 = translatedVideo3.getLanguageCode();
                                }
                                sbLIZ5.append(languageCode2);
                                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5));
                            } else if (((Boolean) C0A80.LIZ.getValue()).booleanValue() && a0.LJJIIZI(C590440NDu.LIZ(), next.getAid(), false)) {
                                it2.remove();
                                C797930VRv.LIZIZ("fetchFeeds, filter by is duplicate");
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(FeedItemList feedItemList) {
        if (C590440NDu.LJIIIIZZ || feedItemList == null || feedItemList.getItems() == null || feedItemList.getItems().size() <= 1 || C0NES.LIZ()) {
            return;
        }
        Object objLJJJJZI = C13LP.LJJJJZI(feedItemList.getItems());
        if (((Number) C283780BAi.LIZ.getValue()).intValue() > 0 && C0NHD.LIZIZ()) {
            ArrayList arrayList = new ArrayList(feedItemList.getItems().subList(1, feedItemList.getItems().size() - 1));
            String requestId = feedItemList.getRequestId();
            if (requestId != null && requestId.length() > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Aweme) it2.next()).setRequestId(requestId);
                }
            }
            C0S4J c0s4j = C0NH6.LJIILLIIL;
            C591300NHc.LIZ().LJIILJJIL("cold_cache_remain", new ArrayList(arrayList), null);
        }
        List<Aweme> items = feedItemList.getItems();
        items.clear();
        items.add(objLJJJJZI);
        C797930VRv.LIZIZ("fetchFeeds, filter by foreground, keep only 1");
    }

    public static void LIZLLL(FeedItemList feedItemList) {
        List<ContentInfoStruct> originContentInfo;
        try {
            InterventionInfoStruct interventionInfoStruct = feedItemList.interventionInfo;
            if (interventionInfoStruct != null && (originContentInfo = interventionInfoStruct.getOriginContentInfo()) != null) {
                Iterator<ContentInfoStruct> it2 = originContentInfo.iterator();
                while (it2.hasNext()) {
                    ContentInfoStruct next = it2.next();
                    List<Aweme> items = feedItemList.getItems();
                    Aweme aweme = null;
                    if (items != null) {
                        Iterator<Aweme> it3 = items.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Aweme next2 = it3.next();
                            if (Intrinsics.LJFF(next2.getAid(), next.awemeId)) {
                                aweme = next2;
                                break;
                            }
                        }
                        if (aweme == null) {
                        }
                    }
                    it2.remove();
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static long LJFF(String str) {
        Iterator it2 = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6).iterator();
        long length = 0;
        while (it2.hasNext()) {
            String strLIZJ = C0NFP.LIZJ((String) it2.next());
            if (!TextUtils.isEmpty(strLIZJ)) {
                C0VSJ c0vsj = new C0VSJ(String.valueOf(strLIZJ));
                if (c0vsj.exists()) {
                    length += c0vsj.length();
                }
            }
        }
        return length / ((long) 1024);
    }

    public static boolean LJIIIIZZ(String str) {
        String str2 = C590440NDu.LIZ;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && a0.LJJIIZI(str2, str, false)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(String str) {
        String str2;
        Boolean boolValueOf;
        if (str == null || C590440NDu.LIZ == null || (str2 = C590440NDu.LIZ) == null || (boolValueOf = Boolean.valueOf(a0.LJJIIZI(str2, str, false))) == null) {
            return false;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean LJIIZILJ(boolean z) {
        int i;
        int i2 = 1;
        if (z && C0X35.LJIILIIL()) {
            return true;
        }
        boolean z2 = false;
        if (C0CD2.LIZIZ() && (i = LJIILLIIL) > 0) {
            if (i == 1) {
                return true;
            }
            return false;
        }
        if ((C590390NDp.LIZ() && !LJIIJ()) || (C07JO.LIZ() && C590440NDu.LJFF().length() > 0)) {
            z2 = true;
        }
        if (C0CD2.LIZIZ()) {
            if (!z2) {
                i2 = 2;
            }
            LJIILLIIL = i2;
        }
        return z2;
    }

    public static void LJIJ(boolean z) {
        if (C0CD2.LIZ()) {
            C587860N3w.LIZJ = z;
            LJ = null;
        } else {
            if (C587860N3w.LIZIZ != null) {
                return;
            }
            C587860N3w.LIZIZ = Boolean.valueOf(z);
            FeedItemList feedItemList = LJ;
            if (feedItemList != null && z) {
                C587860N3w.LIZ(feedItemList);
            }
            LJ = null;
        }
    }

    public static void LJIJI(final boolean z) {
        C797930VRv.LIZIZ("startCache head, background " + z + " isCaching:" + LJIIIIZZ);
        if (z) {
            ICommonFeedAppDiffProtocol.LIZ.getClass();
            C1865480ye2.LIZ().LJ();
        }
        if (((Boolean) C0AOY.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (C590410NDr.LIZIZ && !z) {
            return;
        }
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LIZJ(1L) && ((Boolean) C827740WdY.LIZ.getValue()).booleanValue()) {
            C590420NDs.LIZ.getClass();
            if (C590390NDp.LIZIZ(C0NEW.ORIGIN.getValue(), C590420NDs.LJIIJ()) && !((Boolean) C257690A7z.LIZ.getValue()).booleanValue()) {
                return;
            }
        }
        if (C1336210ksN.LIZ() && ((Boolean) C2250201D5m.LJIILJJIL.getValue()).booleanValue()) {
            return;
        }
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0NDq
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0 */
            /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r15v2 */
            /* JADX WARN: Type inference failed for: r1v97, types: [T, java.util.ArrayList] */
            public final void LIZ() {
                boolean z2;
                List<C590280NDe> arrayList;
                C0NET c0net = C0NET.LIZ;
                boolean z3 = z;
                c0net.getClass();
                C590440NDu.LJIIL("startCacheImplV2");
                C590410NDr.LIZ.getClass();
                IFeedRequestExService iFeedRequestExService = (IFeedRequestExService) PluggableExtentionKt.pluggableSpi$default(IFeedRequestExService.class, false, false, false, 14, null);
                if (iFeedRequestExService != null) {
                    iFeedRequestExService.LIZIZ();
                }
                C01GW c01gw = C2281291ERb.LJIIJ;
                boolean z4 = ((Number) c01gw.getValue()).intValue() == 0 && z3 && !C036E.LIZ.LIZJ();
                if (((Number) c01gw.getValue()).intValue() == 1 && !z3 && !C036E.LIZ.LIZJ()) {
                    z4 = true;
                }
                if ((((Number) c01gw.getValue()).intValue() == 2 && !C036E.LIZ.LIZJ()) || z4) {
                    C797930VRv.LIZIZ("interceptFetchFeedWithNetworkStatus true");
                } else if (((Boolean) C2281291ERb.LIZLLL.getValue()).booleanValue() && z3 && C590410NDr.LIZJ >= 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("interceptFetchFeed backgroundFetchCount ");
                    sbLIZ.append(C590410NDr.LIZJ);
                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    if (!((Boolean) C2281291ERb.LJ.getValue()).booleanValue() || C590410NDr.LIZLLL + C590410NDr.LIZJ < 1) {
                        if (z3 ? ((Boolean) C2281291ERb.LJI.getValue()).booleanValue() : ((Boolean) C2281291ERb.LJFF.getValue()).booleanValue()) {
                            if (C590410NDr.LJI) {
                                C797930VRv.LIZIZ("hadScatter and scatterOnlyOneTimes");
                            } else {
                                C590410NDr.LJI = true;
                                if (!C590410NDr.LJ) {
                                    C797930VRv.LIZIZ("interceptFetchFeedWithScatter hadFetchOtherFeed is false");
                                    C590410NDr.LIZIZ(z3);
                                } else if (C590410NDr.LJ) {
                                    long jCurrentTimeMillis = System.currentTimeMillis() - C590410NDr.LJFF;
                                    if (jCurrentTimeMillis < ((Number) C2281291ERb.LJII.getValue()).longValue()) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("interceptFetchFeedWithScatter ");
                                        sbLIZ2.append(jCurrentTimeMillis);
                                        sbLIZ2.append(" too short");
                                        C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                        C590410NDr.LIZIZ(z3);
                                    }
                                }
                            }
                        }
                        C590420NDs.LIZ.getClass();
                        long jLIZJ = C590420NDs.LIZJ();
                        String strLJIIJ = C590420NDs.LJIIJ();
                        ?? r15 = 0;
                        if (System.currentTimeMillis() - jLIZJ >= C0NEU.LIZ() || TextUtils.isEmpty(strLJIIJ)) {
                            z2 = true;
                            C590420NDs.LJIIZILJ("");
                        } else {
                            z2 = false;
                        }
                        boolean z5 = !C590390NDp.LIZ();
                        if (C07JO.LIZ()) {
                            C593360NPa.LIZIZ(AFwS195S0000000_9.get$arr$(577));
                        }
                        C01GW c01gw2 = C1867660yhY.LIZLLL;
                        if (((Number) c01gw2.getValue()).intValue() >= 0) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - (((long) (((Number) c01gw2.getValue()).intValue() * 3600)) * 1000);
                            C0NDV c0ndv = C0NDV.LIZ;
                            C0NDM c0ndm = C0NDM.ALL_CACHE;
                            c0ndv.getClass();
                            C259800zU c259800zU = new C259800zU();
                            c259800zU.element = new ArrayList();
                            if (C0NDV.LJIIJ()) {
                                C0NDV.LJIILIIL(new AwS39S0200100_9(c259800zU, (C259800zU<List<C590280NDe>>) c0ndm, (C0NDM) jCurrentTimeMillis2, 0L));
                                arrayList = (List) c259800zU.element;
                            } else {
                                arrayList = new ArrayList();
                            }
                            for (C590280NDe c590280NDe : arrayList) {
                                if (c590280NDe.LIZ.length() > 0) {
                                    C590420NDs c590420NDs = C590420NDs.LIZ;
                                    x0 x0Var = x0.LIZ;
                                    c590420NDs.getClass();
                                    String strLJIILJJIL = C590420NDs.LJIILJJIL();
                                    String str = c590280NDe.LIZ;
                                    x0Var.getClass();
                                    C590420NDs.LJIJI(x0.LIZJ(strLJIILJJIL, str));
                                    C590420NDs.LJIJ(x0.LIZJ(C590420NDs.LJIILIIL(), c590280NDe.LIZ));
                                    C590480NDy c590480NDy = C590480NDy.LIZ;
                                    String str2 = c590280NDe.LIZ;
                                    C0NE1 c0ne1 = C0NE1.REMOVE;
                                    c590480NDy.getClass();
                                    C590480NDy.LJIILL(str2, c0ne1);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("selfCheckExpiredKeva deleteExpired ");
                                    sbLIZ3.append(c590280NDe.LIZ);
                                    sbLIZ3.append(" , ");
                                    sbLIZ3.append(c590280NDe.LJIIIZ);
                                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                }
                            }
                        }
                        x0.LIZ.getClass();
                        if (InterfaceC288420BSe.LIZ) {
                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(C590440NDu.LIZ(), new String[]{x0.LIZIZ}, 0, 6);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : listLJJLIIIJILLIZJL) {
                                if (((String) obj).length() > 0) {
                                    arrayList2.add(obj);
                                }
                            }
                            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
                            C590420NDs.LIZ.getClass();
                            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(C590420NDs.LJFF(), new String[]{x0.LIZIZ}, 0, 6);
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : listLJJLIIIJILLIZJL2) {
                                if (((String) obj2).length() > 0) {
                                    arrayList3.add(obj2);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : arrayList3) {
                                String str3 = (String) obj3;
                                if (setLLIIJI.contains(a0.LJJZ(str3, ":", str3))) {
                                    arrayList4.add(obj3);
                                }
                            }
                            C590420NDs c590420NDs2 = C590420NDs.LIZ;
                            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList4, x0.LIZIZ, null, null, 0, null, null, 62);
                            c590420NDs2.getClass();
                            C590420NDs.LJI().storeString("incomplete_video_group_db", strLJJLIIIJ);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj4 : arrayList3) {
                                if (!arrayList4.contains(obj4)) {
                                    arrayList5.add(obj4);
                                }
                            }
                            r15 = 0;
                            C13LP.LJJLIIIJ(arrayList5, x0.LIZIZ, null, null, 0, null, null, 62).getClass();
                        }
                        if (!C07MO.LIZ()) {
                            C590420NDs.LIZ.getClass();
                            Keva kevaLJI = C590420NDs.LJI();
                            if (kevaLJI != 0) {
                                kevaLJI.storeInt("key_ready_new_cache_path", r15);
                            }
                        }
                        if (!C1ES5.LIZIZ()) {
                            C590420NDs.LIZ.getClass();
                            Keva kevaLJI2 = C590420NDs.LJI();
                            if (kevaLJI2 != 0) {
                                kevaLJI2.storeInt("using_db_simplify_old", r15);
                            }
                        }
                        if (C0NET.LJIIIIZZ) {
                            return;
                        }
                        if (z2 || z5) {
                            if (C279830Axx.LIZ()) {
                                C0NEA.LIZ.getClass();
                                Iterator<C0NE9> it2 = C0NEA.LIZJ.iterator();
                                while (it2.hasNext()) {
                                    if (it2.next().LIZIZ) {
                                        return;
                                    }
                                }
                            }
                            C590570NEh.LIZ.getClass();
                            if (C590570NEh.LJ) {
                                return;
                            }
                            if (!C1ES5.LIZ() || (C590440NDu.LJ() < C590440NDu.LJIIJ() && C590440NDu.LJIIIIZZ(z3) >= ((Number) C1ES5.LJI.getValue()).intValue())) {
                                C0NET.LJIIIIZZ = true;
                                C590440NDu.LJIIIIZZ = z3;
                                if (!z3) {
                                    try {
                                        C590410NDr.LIZIZ = true;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C0NET.LJIIIIZZ = r15;
                                        throw th;
                                    }
                                }
                                c0net.LIZ();
                                C0NET.LJIIIIZZ = r15;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("interceptFetchFeed globalFetchCount ");
                    sbLIZ4.append(C590410NDr.LIZJ + C590410NDr.LIZLLL);
                    C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("interceptFetchFeed ");
                sbLIZ5.append(z3);
                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedCacheLoader@a3e3.startCache$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedCacheLoader@a3e3.startCache$1");
            }
        });
    }
}
