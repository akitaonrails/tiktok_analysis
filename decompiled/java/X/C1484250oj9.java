package X;

import Y.ACallableS428S0100000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS4S0111000_23;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import com.ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484250oj9 {
    public PreloadStrategyConfig LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final InterfaceC739770T0d LJ;
    public final PreloadStrategyConfig LJFF;

    public C1484250oj9(InterfaceC739770T0d interfaceC739770T0d, PreloadStrategyConfig preloadStrategyConfig) {
        this.LJ = interfaceC739770T0d;
        this.LJFF = preloadStrategyConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(boolean z, String str, long j, long j2, C0SR4 c0sr4, int i, boolean z2) {
        Video video;
        VideoUrlModel properPlayAddr;
        String sourceId;
        int i2;
        boolean z3;
        int i3;
        InterfaceC739770T0d interfaceC739770T0d;
        InterfaceC739770T0d interfaceC739770T0d2;
        if (C1481060oe0.LJFF()) {
            if (j == j2) {
                if (z) {
                    InterfaceC739770T0d interfaceC739770T0d3 = this.LJ;
                    if (interfaceC739770T0d3 != null) {
                        interfaceC739770T0d3.km(str, z);
                        return;
                    }
                    return;
                }
                if (j <= 0 || (interfaceC739770T0d2 = this.LJ) == null) {
                    return;
                }
                interfaceC739770T0d2.km(str, z);
                return;
            }
            return;
        }
        if (j == j2 && (interfaceC739770T0d = this.LJ) != null) {
            interfaceC739770T0d.km(str, z);
        }
        Aweme item = c0sr4.getItem(i);
        if (item == null || item.getVideo() == null || (video = item.getVideo()) == null) {
            return;
        }
        if (InterfaceC274530ApP.LIZ) {
            LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
            properPlayAddr = C1481230oeH.LJIIJ(C607330Nrv.LIZ.LIZ().getVideoPlayAddr(C1481230oeH.LJI(video), C1480850odf.LIZJ.getPlayerType()));
        } else {
            properPlayAddr = video.getProperPlayAddr();
        }
        if (properPlayAddr == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            sourceId = properPlayAddr.getBitRatedRatioUri();
        } else {
            sourceId = properPlayAddr.getSourceId();
        }
        if (!TextUtils.equals(str, sourceId)) {
            return;
        }
        if (!TextUtils.equals(sourceId, this.LIZIZ)) {
            this.LIZLLL = false;
            this.LIZJ = true;
            this.LIZIZ = sourceId;
            PreloadStrategyConfig preloadStrategyConfig = this.LIZ;
            if (preloadStrategyConfig != null) {
                preloadStrategyConfig.clearFlag();
            }
        } else {
            this.LIZJ = false;
        }
        LinkedList linkedList = null;
        if (j2 == j && !this.LIZLLL) {
            this.LIZLLL = true;
            final String sourceId2 = properPlayAddr.getSourceId();
            if (InterfaceC2529909vl.LIZ == 1) {
                final int iLJII = C1479130oat.LJII();
                C844470XAv.LIZ.getClass();
                final String strC3 = C786410Ut5.c3(C844470XAv.LIZ());
                final int iLIZIZ = C801110Vbh.LIZ(C844470XAv.LIZ()).LIZIZ(C844470XAv.LIZ());
                final C1478850oaR[] c1478850oaRArrLJFF = C1479130oat.LJIIIIZZ().LJFF();
                if (c1478850oaRArrLJFF != null) {
                    C15O7.LIZIZ(new Callable() { // from class: X.0oap
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws JSONException {
                            JSONArray jSONArray;
                            int length;
                            C1478850oaR c1478850oaR;
                            C1478850oaR[] c1478850oaRArr = c1478850oaRArrLJFF;
                            Object obj = sourceId2;
                            int i4 = iLJII;
                            Object obj2 = strC3;
                            int i5 = iLIZIZ;
                            C1C7U.LIZ("BaseFeedListPreloadHandler@7d3b.reportVideoSpeed$1L");
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONArray = new JSONArray();
                                length = c1478850oaRArr.length;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            while (true) {
                                length--;
                                if (length < 0) {
                                    break;
                                }
                                C1478850oaR c1478850oaR2 = c1478850oaRArr[length];
                                if (c1478850oaR2 != null) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("file_size", c1478850oaR2.LLILLJJLI);
                                    jSONObject2.put("cost_time", c1478850oaR2.LLILLL);
                                    if (length <= 0 || (c1478850oaR = c1478850oaRArr[length - 1]) == null) {
                                        jSONObject2.put("interval_time", 0);
                                    } else {
                                        jSONObject2.put("interval_time", c1478850oaR2.LLILZ - c1478850oaR.LLILZ);
                                    }
                                    jSONArray.put(jSONObject2);
                                }
                                C20684815ws.LJIJJ("video_speed_monitor", jSONObject);
                                C1481030odx.LIZIZ("video_speed_monitor", jSONObject);
                                C1C7U.LIZIZ("BaseFeedListPreloadHandler@7d3b.reportVideoSpeed$1L");
                                return null;
                            }
                            jSONObject.put("group_id", obj);
                            jSONObject.put("speed_record", jSONArray);
                            jSONObject.put("internet_speed", i4);
                            jSONObject.put("strategy", 0);
                            jSONObject.put("access", obj2);
                            jSONObject.put("signal", i5);
                            jSONObject.put("qsize", C1479130oat.LIZJ);
                            C20684815ws.LJIJJ("video_speed_monitor", jSONObject);
                            C1481030odx.LIZIZ("video_speed_monitor", jSONObject);
                            C1C7U.LIZIZ("BaseFeedListPreloadHandler@7d3b.reportVideoSpeed$1L");
                            return null;
                        }
                    }, C20684815ws.LJFF(), null);
                }
            }
            C1478850oaR[] c1478850oaRArrLJFF2 = C1479130oat.LJIIIIZZ().LJFF();
            if (c1478850oaRArrLJFF2 != null) {
                C15O7.LIZIZ(new ACallableS428S0100000_23(c1478850oaRArrLJFF2, 7), C20684815ws.LJFF(), null);
            }
        }
        if (this.LIZJ) {
            List<PreloadStrategyConfig> smartPreloadStrategyExperimentValue = SmartFeedPreloadService.instance().getSmartPreloadStrategyExperimentValue();
            if (smartPreloadStrategyExperimentValue != null && smartPreloadStrategyExperimentValue.size() > 0) {
                long jMin = Math.min(Math.max(Math.max(((PreloadStrategyConfig) ListProtector.get(smartPreloadStrategyExperimentValue, 0)).getNetworkLower(), 0L), C1479130oat.LJII()), Math.min(((PreloadStrategyConfig) ListProtector.get(smartPreloadStrategyExperimentValue, smartPreloadStrategyExperimentValue.size() - 1)).getNetworkUpper(), 25000L));
                Iterator<PreloadStrategyConfig> it2 = smartPreloadStrategyExperimentValue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    PreloadStrategyConfig next = it2.next();
                    if (next != null && jMin >= next.getNetworkLower() && jMin <= next.getNetworkUpper()) {
                        this.LIZ = next;
                        break;
                    }
                }
            } else {
                this.LIZ = SmartFeedPreloadService.instance().getCurrentSmartPreloadStrategyConfig();
            }
        }
        if (this.LIZ == null) {
            this.LIZ = this.LJFF;
        }
        List<PreloadTask> listEmptyList = Collections.emptyList();
        for (PreloadTask preloadTask : this.LIZ.getTasks()) {
            if (!preloadTask.alreadyPreload && 100 * j2 >= ((long) preloadTask.progress) * j) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList();
                }
                listEmptyList.add(preloadTask);
                preloadTask.alreadyPreload = true;
            }
        }
        if (listEmptyList.isEmpty()) {
            return;
        }
        if (z2) {
            List<Aweme> listFg = c0sr4.Fg();
            int i4 = i + 1;
            if (i4 < listFg.size() && ListProtector.get(listFg, i4) != null && C0NFP.LJFF(C0NFP.LIZJ(((Aweme) ListProtector.get(listFg, i4)).getAid()))) {
                i3 = 1;
            } else if (i < listFg.size() && ListProtector.get(listFg, i) != null && C0NFP.LJFF(C0NFP.LIZJ(((Aweme) ListProtector.get(listFg, i)).getAid()))) {
                i3 = 0;
            }
            Iterator it3 = listEmptyList.iterator();
            while (it3.hasNext()) {
                ((PreloadTask) it3.next()).offset = i3;
            }
        }
        List<Aweme> listFg2 = c0sr4.Fg();
        LruCache<String, SimVideoUrlModel> lruCache2 = C1483340ohg.LIZ;
        for (PreloadTask preloadTask2 : listEmptyList) {
            if (preloadTask2.count > 0) {
                if (preloadTask2.offset >= 0) {
                    if (C0XJ9.LIZ() == 2) {
                        i2 = 1;
                    } else {
                        i2 = preloadTask2.count;
                    }
                    preloadTask2.count = i2;
                    int i5 = preloadTask2.offset;
                    Aweme[] awemeArr = new Aweme[i2];
                    int i6 = 0;
                    if (z2) {
                        while (i6 < i2) {
                            int i7 = i + 1 + i6 + i5;
                            if (i7 < listFg2.size()) {
                                awemeArr[i6] = ListProtector.get(listFg2, i7);
                            }
                            i6++;
                        }
                    } else {
                        while (i6 < i2) {
                            int i8 = ((i - 1) - i6) - i5;
                            if (i8 >= 0 && i8 < listFg2.size()) {
                                awemeArr[i6] = ListProtector.get(listFg2, i8);
                            }
                            i6++;
                        }
                    }
                    if (C1475000oUE.LIZIZ().isDebug()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i9 = 0; i9 < i2; i9++) {
                            C1D1F c1d1f = awemeArr[i9];
                            if (c1d1f != 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(c1d1f.getDesc());
                                sbLIZ.append("\n");
                                arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    }
                    int videoPreloadSize = preloadTask2.getVideoPreloadSize();
                    if (i2 > 0) {
                        LinkedList linkedList2 = linkedList;
                        LinkedList linkedList3 = linkedList;
                        int i10 = 0;
                        do {
                            C1D1F c1d1f2 = awemeArr[i10];
                            if (!((ArrayList) C1483340ohg.LIZLLL(c1d1f2)).isEmpty() && C0C64.LJIILLIIL().LJIJ(31744, 0, "player_preload_subtitles_delay", true) == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (Looper.myLooper() == Looper.getMainLooper() && ((Boolean) C1221504qD.LIZJ.getValue()).booleanValue()) {
                                if (linkedList == null) {
                                    linkedList = new LinkedList();
                                }
                                linkedList.add(new ARunnableS4S0111000_23(c1d1f2, videoPreloadSize, z3, 1));
                                if (z3) {
                                    if (linkedList2 == null) {
                                        linkedList2 = new LinkedList();
                                    }
                                    linkedList2.add(new ARunnableS123S0100000_23(c1d1f2, 46));
                                }
                            } else {
                                C1483340ohg.LJIILJJIL(c1d1f2, videoPreloadSize, z3);
                                if (z3) {
                                    if (linkedList3 == null) {
                                        linkedList3 = new LinkedList();
                                    }
                                    linkedList3.add(c1d1f2);
                                }
                            }
                            i10++;
                        } while (i10 < i2);
                        if (linkedList != null) {
                            if (linkedList2 != null) {
                                linkedList.addAll(linkedList2);
                            }
                            final LinkedList linkedList4 = new LinkedList(linkedList);
                            final int i11 = 30;
                            C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.01Qz
                                @Override // android.os.MessageQueue.IdleHandler
                                public final boolean queueIdle() {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    int i12 = i11 / 2;
                                    int i13 = 0;
                                    while (!linkedList4.isEmpty()) {
                                        Runnable runnablePoll = linkedList4.poll();
                                        if (runnablePoll != null) {
                                            runnablePoll.run();
                                        }
                                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                        if (jCurrentTimeMillis2 > i11) {
                                            break;
                                        }
                                        i13++;
                                        if (jCurrentTimeMillis2 / ((long) i13) > i12) {
                                            break;
                                        }
                                    }
                                    return !linkedList4.isEmpty();
                                }
                            }, Looper.myQueue());
                        }
                        if (linkedList3 != null) {
                            Iterator it4 = linkedList3.iterator();
                            while (it4.hasNext()) {
                                C1483340ohg.LJJIII((Aweme) it4.next());
                            }
                        }
                    }
                }
            }
            linkedList = null;
        }
    }
}
