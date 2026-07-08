package X;

import Y.ARunnableS123S0100000_23;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.Surface;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.LogoSpotlightVideoModel;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.simkit.model.LoudnessStrategyConfig;
import com.ss.android.ugc.aweme.simkit.model.SceneLoudnessConfig;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.ss.android.ugc.aweme.video.FeedPlayerManagerViewModel;
import com.ss.android.ugc.aweme.video.experiment.LowMemoryClearPlayerExp;
import com.ss.android.ugc.aweme.video.experiment.TTPlayerViewedVideoHistory;
import com.ss.android.ugc.feed.platform.experiment.OpenTikTokOnMuteConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0ohn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483410ohn implements C0N0Y {
    public static C1483410ohn LJIILJJIL = null;
    public static boolean LJIILL = false;
    public static boolean LJIILLIIL = true;
    public static final C588160N5a LJIIZILJ = new LruCache<String, C1483440ohq>() { // from class: X.0N5a
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, C1483440ohq c1483440ohq) {
            return 1;
        }
    };
    public InterfaceC1484830ok5 LIZ;
    public volatile boolean LIZIZ;
    public final InterfaceC1484830ok5 LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public final C1483350ohh LJFF;
    public String LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public Video LJIIIZ;
    public boolean LJIIJ;
    public C0Q6Q LJIIJJI;
    public Long LJIIL;
    public boolean LJIILIIL;

    public C1483410ohn() {
        this(true);
    }

    @Override // X.C0N0Y
    public final void LIZ() {
        LJJLI(false);
    }

    @Override // X.C0N0Y
    public final void LJJJJJ() {
        LJIILL = false;
    }

    @Override // X.C0N0Y
    public final void LJJLIIIJ() {
    }

    @Override // X.InterfaceC583520Muc
    public final int LIZLLL() {
        return this.LIZ.LJIIIZ().LIZLLL();
    }

    @Override // X.C0N0Y
    public final void LJ() {
        this.LJFF.LIZ(false);
    }

    @Override // X.C0N0Y
    public final void LJFF() {
        this.LIZ.LJIILIIL().mute();
    }

    @Override // X.InterfaceC583520Muc
    public final float LJI() {
        return this.LIZ.LJIIIZ().LJI();
    }

    @Override // X.InterfaceC583520Muc
    public final float LJII() {
        return this.LIZ.LJIIIZ().LJII();
    }

    @Override // X.C0N0Y
    public final InterfaceC1483670oiD LJIILL() {
        return this.LIZ.LJIILL();
    }

    @Override // X.C0N0Y
    public final void LJIILLIIL() {
        if (C08MG.LIZ("resumePlay")) {
            return;
        }
        this.LJIIJJI.LIZ();
        String sourceId = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ != null ? ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId() : "null";
        if (InterfaceC1481090oe3.LIZ) {
            C1481030odx.LIZJ("PlayerManager", "resumePlay aid:" + sourceId);
        }
        this.LIZ.resume();
        C583420MuS.LIZJ(sourceId, C0RRP.RESUME);
        this.LIZIZ = false;
    }

    @Override // X.C0N0Y
    public final void LJIJJ() {
        this.LIZ.LJIILIIL().unmute();
    }

    @Override // X.InterfaceC583520Muc
    public final int LJIL() {
        return this.LIZ.LJIIIZ().LJIIJ();
    }

    @Override // X.C0N0Y
    public final void LJJI() {
        this.LIZ = this.LIZJ;
    }

    @Override // X.InterfaceC583520Muc
    public final VideoUrlModel LJJIII() {
        return C1481230oeH.LJIIJ(((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ);
    }

    @Override // X.C0N0Y
    public final Integer LJJIIJ() {
        Long l = (Long) this.LIZ.LIZIZ(C1472580oQK.LIZLLL);
        return Integer.valueOf(l != null ? l.intValue() : 0);
    }

    @Override // X.C0N0Y
    public final void LJJIIJZLJL() {
        this.LIZ.reset();
    }

    @Override // X.C0N0Y
    public final void LJJIIZ() {
        this.LIZ.LJIIIZ().LJJIIZ();
    }

    @Override // X.C0N0Y
    public final void LJJIIZI() {
        this.LIZ.LJIIIZ().LJJIIZI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.00UI] */
    @Override // X.C0N0Y
    public final void LJJIJL() {
        this.LIZ.LJIILL().LJJLJLI(new Object() { // from class: X.00UI
            public final int LIZ = 5;
            public final List<Bitmap> LIZIZ = null;

            public final int hashCode() {
                return Objects.hash(Integer.valueOf(this.LIZ), 1, null, this.LIZIZ, Boolean.FALSE, -1);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EffectInfo{action=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", effectType=");
                sbLIZ.append(1);
                sbLIZ.append(", effectValue=");
                sbLIZ.append((Object) null);
                sbLIZ.append(", lutBitmap=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", isUseEffect=");
                sbLIZ.append(false);
                sbLIZ.append('}');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C00UI.class != obj.getClass()) {
                    return false;
                }
                C00UI c00ui = (C00UI) obj;
                if (this.LIZ == c00ui.LIZ && Objects.equals(this.LIZIZ, c00ui.LIZIZ)) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // X.C0N0Y
    public final void LJJJ() {
        this.LIZ.reset();
        synchronized (TTVideoEngine.class) {
        }
        this.LIZ.LJIILL().LJJJ();
        this.LIZIZ = false;
        this.LJFF.LJ = 1;
    }

    @Override // X.C0N0Y
    public final String LJJJLIIL() {
        return (this.LIZ.getLegacy() == null || ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ == null) ? "" : ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId();
    }

    @Override // X.C0N0Y
    public final Integer LJJLIIIJJI() {
        Integer num = (Integer) this.LIZ.LIZIZ(C1472550oQH.LIZLLL);
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }

    @Override // X.C0N0Y
    public final void LJJLIIIJL() {
        ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJJLIIIJL();
    }

    @Override // X.C0N0Y
    public final void LJJLJLI() {
        String sourceId = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ != null ? ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId() : "null";
        if (InterfaceC1481090oe3.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("render aid:");
            sbLIZ.append(sourceId);
            C1481030odx.LIZJ("PlayerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJJLJLI();
        C583420MuS.LIZJ(sourceId, C0RRP.RENDER);
        if ((!C1486210omJ.LIZIZ() || LJIILLIIL) && !(((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIIZILJ() && C2279641EKs.LIZIZ())) {
            if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIIIZ()) {
                ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJIZ();
            } else if (C818480W8w.LJ("detail_page_startup") && C278410Avf.LIZ()) {
            }
            LJIILL = true;
        } else {
            LJIILL = true;
        }
        LJIILLIIL = false;
    }

    @Override // X.InterfaceC583520Muc
    public final long LJLIIIL() {
        return this.LIZ.LJIIIZ().LJJIJIL();
    }

    @Override // X.InterfaceC583520Muc
    public final float getBitrate() {
        return this.LIZ.LJIIIZ().getBitrate();
    }

    @Override // X.InterfaceC583520Muc
    public final long getCurrentPosition() {
        return this.LIZ.LJIIIZ().getCurrentPosition();
    }

    @Override // X.InterfaceC583520Muc
    public final long getDuration() {
        return this.LIZ.LJIIIZ().getDuration();
    }

    @Override // X.C0N0Y
    public final float getSpeed() {
        return this.LIZ.LJIIIZ().getSpeed();
    }

    @Override // X.InterfaceC583520Muc
    public final int getVideoHeight() {
        return this.LIZ.LJIIIZ().getHeight();
    }

    @Override // X.InterfaceC583520Muc
    public final C1471500oOa getVideoInfo() {
        return this.LIZ.LJIIIZ().getVideoInfo();
    }

    @Override // X.InterfaceC583520Muc
    public final int getVideoWidth() {
        return this.LIZ.LJIIIZ().getWidth();
    }

    @Override // X.InterfaceC583520Muc
    public final boolean isMute() {
        return this.LIZ.LJIIIZ().isMute();
    }

    @Override // X.InterfaceC583520Muc
    public final boolean isPaused() {
        return this.LIZ.getPlayState().isPaused();
    }

    @Override // X.InterfaceC583520Muc
    public final boolean isPlaying() {
        return this.LIZ.getPlayState().isPlaying();
    }

    @Override // X.C0N0Y
    public final void release() {
        this.LIZ.reset();
        this.LIZ.release();
        this.LIZIZ = false;
        this.LJFF.LJ = 1;
    }

    public static C0N0Y LJLJJI() {
        C0N0Y c0n0y;
        TTPlayerViewedVideoHistory.PlaybackHistoryConfig playbackHistoryConfig;
        C0N0Y playerManager;
        Activity activityLJFF = C2214201BlK.LJFF();
        if ((activityLJFF instanceof C19EG) && (playerManager = FeedSharePlayerViewModel.getPlayerManager((C19EG) activityLJFF)) != null) {
            return playerManager;
        }
        if (C1481000odu.LIZIZ || C1481000odu.LIZ) {
            Activity activityLJFF2 = C2214201BlK.LJFF();
            if ((activityLJFF2 instanceof C19EG) && (c0n0y = ((FeedPlayerManagerViewModel) ViewModelProviders.of((C19EG) activityLJFF2).get(FeedPlayerManagerViewModel.class)).LL) != null) {
                return c0n0y;
            }
        }
        if (LJIILJJIL == null) {
            synchronized (C1483410ohn.class) {
                try {
                    if (LJIILJJIL == null) {
                        LJIILJJIL = new C1483410ohn(false);
                        if (C584250Mvn.LJFF || (playbackHistoryConfig = (TTPlayerViewedVideoHistory.PlaybackHistoryConfig) TTPlayerViewedVideoHistory.LIZIZ.getValue()) == null || !playbackHistoryConfig.enableHistory) {
                            C584250Mvn.LJFF = true;
                        } else {
                            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0DqY
                                public static void LIZ() {
                                    Long l;
                                    C584250Mvn.LIZLLL.writeLock().lock();
                                    try {
                                        try {
                                            List<Map.Entry> listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0DmQ
                                                @Override // java.util.Comparator
                                                public final int compare(T t, T t2) {
                                                    return C20085613iQ.LIZIZ((Long) ((Map.Entry) t).getValue(), (Long) ((Map.Entry) t2).getValue());
                                                }
                                            }, C584250Mvn.LIZ.getAll().entrySet());
                                            Map<String, Long> map = C584250Mvn.LIZJ;
                                            for (Map.Entry entry : listLJLLLL) {
                                                Object key = entry.getKey();
                                                Object value = entry.getValue();
                                                map.put((String) key, Long.valueOf((!(value instanceof Long) || (l = (Long) value) == null) ? 0L : l.longValue()));
                                            }
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                        }
                                        C584250Mvn.LIZLLL.writeLock().unlock();
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C584250Mvn.LIZLLL.writeLock().unlock();
                                        throw th;
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("PlaybackHistoryManager@a84c.init$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("PlaybackHistoryManager@a84c.init$1");
                                }
                            });
                        }
                        if (C04QI.LIZ && !C1483490ohv.LIZ) {
                            C1483490ohv.LIZ = true;
                            C1906580ziK.LIZJ().LJIIIIZZ().LJJLJLI(new C09JN() { // from class: X.0oi0
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI;
                                    InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI2;
                                    C1C7U.LIZ("ClearPlayerWhenQuitStrategy@23de.start$subscribe$1");
                                    ListIterator listIterator = ((CopyOnWriteArrayList) C1479990ocH.LIZ.LIZ).listIterator();
                                    while (listIterator.hasNext()) {
                                        InterfaceC1483520ohy interfaceC1483520ohy = (InterfaceC1483520ohy) ((Reference) listIterator.next()).get();
                                        if (interfaceC1483520ohy == null || ((interfaceC1483510ohxLJJJJZI2 = interfaceC1483520ohy.LJJJJZI()) != null && interfaceC1483510ohxLJJJJZI2.LJJIJIIJIL())) {
                                            listIterator.remove();
                                            if (interfaceC1483520ohy != null && (interfaceC1483510ohxLJJJJZI = interfaceC1483520ohy.LJJJJZI()) != null) {
                                                interfaceC1483510ohxLJJJJZI.release();
                                            }
                                        }
                                    }
                                    C1C7U.LIZIZ("ClearPlayerWhenQuitStrategy@23de.start$subscribe$1");
                                }
                            });
                        }
                        if (LowMemoryClearPlayerExp.LIZIZ.enable && !C1483530ohz.LIZ) {
                            C1483530ohz.LIZ = true;
                            C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
                            C1483560oi2 c1483560oi2 = new InterfaceC2188711AlJ() { // from class: X.0oi2
                                @Override // X.InterfaceC2188711AlJ
                                public final void LIZ(C1768270w7F c1768270w7F) {
                                    LowMemoryClearPlayerExp.Config config = LowMemoryClearPlayerExp.LIZIZ;
                                    if (((config.clearBiz >> c1768270w7F.LIZJ.ordinal()) & 1) == 0) {
                                        return;
                                    }
                                    if (config.clearVod) {
                                        C1483530ohz.LIZ(config.clearMax, C1479990ocH.LIZ.LIZ);
                                    }
                                    if (config.clearLive) {
                                        C1483530ohz.LIZ(config.clearMax, C1479990ocH.LIZ.LIZIZ);
                                    }
                                }
                            };
                            c2188561Al4.getClass();
                            C2188561Al4.LJII(c1483560oi2);
                        }
                        if (C04QJ.LIZ && !C1483550oi1.LIZ) {
                            C1483550oi1.LIZ = true;
                            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.06vu
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("BackgroundPlaybackMonitor@9991.start$s$1");
                                    if (((C606810Nr5) obj).LIZIZ) {
                                        C786410Ut5.LJLIIL(C04QH.LIZ, C1483550oi1.LIZIZ, new Runnable() { // from class: X.0oi4
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Map] */
                                            /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
                                            /* JADX WARN: Type inference failed for: r7v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
                                            /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map] */
                                            /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
                                            /* JADX WARN: Type inference failed for: r8v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
                                            public static void LIZ() {
                                                ?? LJ;
                                                Map<String, Object> mapLIZ;
                                                String string;
                                                ?? LJ2;
                                                Map<String, Object> mapLIZ2;
                                                String string2;
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it2 = ((CopyOnWriteArrayList) C1479990ocH.LIZ.LIZ).iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    InterfaceC1483520ohy interfaceC1483520ohy = (InterfaceC1483520ohy) ((Reference) it2.next()).get();
                                                    if (interfaceC1483520ohy != null && C1483550oi1.LIZ(interfaceC1483520ohy)) {
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append("background vod player: ");
                                                        sbLIZ.append(interfaceC1483520ohy);
                                                        sbLIZ.append(", backgroundPlayInfo: ");
                                                        InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI = interfaceC1483520ohy.LJJJJZI();
                                                        sbLIZ.append(interfaceC1483510ohxLJJJJZI != null ? interfaceC1483510ohxLJJJJZI.LIZ() : null);
                                                        C2188811AlT.LIZIZ(sbLIZ);
                                                        arrayList.add(interfaceC1483520ohy);
                                                    }
                                                }
                                                Iterator it3 = ((CopyOnWriteArrayList) C1479990ocH.LIZ.LIZIZ).iterator();
                                                while (it3.hasNext()) {
                                                    InterfaceC1483520ohy interfaceC1483520ohy2 = (InterfaceC1483520ohy) ((Reference) it3.next()).get();
                                                    if (interfaceC1483520ohy2 != null && C1483550oi1.LIZ(interfaceC1483520ohy2)) {
                                                        arrayList.add(interfaceC1483520ohy2);
                                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                        sbLIZ2.append("background live player: ");
                                                        sbLIZ2.append(interfaceC1483520ohy2);
                                                        sbLIZ2.append(", backgroundPlayInfo: ");
                                                        InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI2 = interfaceC1483520ohy2.LJJJJZI();
                                                        sbLIZ2.append(interfaceC1483510ohxLJJJJZI2 != null ? interfaceC1483510ohxLJJJJZI2.LIZ() : null);
                                                        C2188811AlT.LIZIZ(sbLIZ2);
                                                    }
                                                }
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                int size = arrayList.size();
                                                if (size != 0) {
                                                    if (size > 1) {
                                                        Iterator it4 = arrayList.iterator();
                                                        while (it4.hasNext()) {
                                                            InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI3 = ((InterfaceC1483520ohy) it4.next()).LJJJJZI();
                                                            if (interfaceC1483510ohxLJJJJZI3 == null || (mapLIZ2 = interfaceC1483510ohxLJJJJZI3.LIZ()) == null) {
                                                                LJ2 = C2097608Jq.LJ();
                                                            } else {
                                                                LJ2 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZ2.size()));
                                                                Iterator it5 = mapLIZ2.entrySet().iterator();
                                                                while (it5.hasNext()) {
                                                                    Map.Entry entry = (Map.Entry) it5.next();
                                                                    Object key = entry.getKey();
                                                                    Object value = entry.getValue();
                                                                    if (value == null || (string2 = value.toString()) == null) {
                                                                        string2 = "";
                                                                    }
                                                                    LJ2.put(key, string2);
                                                                }
                                                            }
                                                            linkedHashMap.putAll(LJ2);
                                                        }
                                                        linkedHashMap.put("abnormal_cnt", String.valueOf(size));
                                                        linkedHashMap.put("vod_bg_play", String.valueOf(C2281231EQv.LIZIZ.LJIJJLI()));
                                                        linkedHashMap.put("vod_pip_mode", String.valueOf(((IPipFeedService) C1483550oi1.LIZJ.getValue()).md()));
                                                        Npth.reportBizException("abnormal_bg_play", new Throwable(), linkedHashMap.toString(), (Map<String, String>) linkedHashMap, true);
                                                    } else {
                                                        InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI4 = ((InterfaceC1483520ohy) ListProtector.get(arrayList, 0)).LJJJJZI();
                                                        if (interfaceC1483510ohxLJJJJZI4 == null || (mapLIZ = interfaceC1483510ohxLJJJJZI4.LIZ()) == null) {
                                                            LJ = C2097608Jq.LJ();
                                                        } else {
                                                            LJ = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZ.size()));
                                                            Iterator it6 = mapLIZ.entrySet().iterator();
                                                            while (it6.hasNext()) {
                                                                Map.Entry entry2 = (Map.Entry) it6.next();
                                                                Object key2 = entry2.getKey();
                                                                Object value2 = entry2.getValue();
                                                                if (value2 == null || (string = value2.toString()) == null) {
                                                                    string = "";
                                                                }
                                                                LJ.put(key2, string);
                                                            }
                                                        }
                                                        if (Intrinsics.LJFF(LJ.get("bg_player_mode"), "1") || Intrinsics.LJFF(LJ.get("bg_player_mode"), "2") || C2281231EQv.LIZIZ.LJIJJLI() || ((IPipFeedService) C1483550oi1.LIZJ.getValue()).md()) {
                                                            size = 0;
                                                        } else {
                                                            linkedHashMap.putAll(LJ);
                                                            linkedHashMap.put("abnormal_cnt", String.valueOf(size));
                                                            Npth.reportBizException("abnormal_bg_play", new Throwable(), linkedHashMap.toString(), (Map<String, String>) linkedHashMap, true);
                                                        }
                                                    }
                                                    C2344809Gs.LIZLLL(6, "abnormal_bg_play", "abnormalCnt: " + size + ", info: " + linkedHashMap);
                                                }
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean zLIZ;
                                                C1C7U.LIZ("BackgroundPlaybackMonitor@9991.start$s$1$1");
                                                try {
                                                    LIZ();
                                                } finally {
                                                    if (!zLIZ) {
                                                    }
                                                }
                                                C1C7U.LIZIZ("BackgroundPlaybackMonitor@9991.start$s$1$1");
                                            }
                                        });
                                    } else {
                                        C1483550oi1.LIZIZ.removeCallbacksAndMessages(null);
                                    }
                                    C1C7U.LIZIZ("BackgroundPlaybackMonitor@9991.start$s$1");
                                }
                            });
                        }
                        if (C1156780gCy.LIZIZ.enable && !C1163150gNF.LIZ) {
                            C1163150gNF.LIZ = true;
                            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0gNE
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("DisableBackgroundPlayStrategy@3296.start$s$1");
                                    if (((C606810Nr5) obj).LIZIZ) {
                                        C786410Ut5.LJLIIL(C1156780gCy.LIZIZ.delay, C1163150gNF.LIZIZ, new Runnable() { // from class: X.0ohw
                                            public static void LIZ() {
                                                InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI;
                                                Iterator it2 = ((CopyOnWriteArrayList) C1479990ocH.LIZ.LIZ).iterator();
                                                while (it2.hasNext()) {
                                                    InterfaceC1483520ohy interfaceC1483520ohy = (InterfaceC1483520ohy) ((Reference) it2.next()).get();
                                                    if (interfaceC1483520ohy != null) {
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append("background player: ");
                                                        sbLIZ.append(interfaceC1483520ohy);
                                                        sbLIZ.append(", enableBackgroundPlay : ");
                                                        InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI2 = interfaceC1483520ohy.LJJJJZI();
                                                        sbLIZ.append(interfaceC1483510ohxLJJJJZI2 != null ? Boolean.valueOf(interfaceC1483510ohxLJJJJZI2.LIZIZ()) : null);
                                                        C2188811AlT.LIZIZ(sbLIZ);
                                                        InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI3 = interfaceC1483520ohy.LJJJJZI();
                                                        if (interfaceC1483510ohxLJJJJZI3 != null && interfaceC1483510ohxLJJJJZI3.isPlaying() && (interfaceC1483510ohxLJJJJZI = interfaceC1483520ohy.LJJJJZI()) != null && !interfaceC1483510ohxLJJJJZI.LIZIZ()) {
                                                            if (C1156780gCy.LIZIZ.releasePlayer) {
                                                                InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI4 = interfaceC1483520ohy.LJJJJZI();
                                                                if (interfaceC1483510ohxLJJJJZI4 != null) {
                                                                    interfaceC1483510ohxLJJJJZI4.release();
                                                                }
                                                            } else {
                                                                InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI5 = interfaceC1483520ohy.LJJJJZI();
                                                                if (interfaceC1483510ohxLJJJJZI5 != null) {
                                                                    interfaceC1483510ohxLJJJJZI5.pause();
                                                                }
                                                            }
                                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                            sbLIZ2.append("background player disabled: ");
                                                            sbLIZ2.append(interfaceC1483520ohy);
                                                            sbLIZ2.append(", enableBackgroundPlay : ");
                                                            InterfaceC1483510ohx interfaceC1483510ohxLJJJJZI6 = interfaceC1483520ohy.LJJJJZI();
                                                            sbLIZ2.append(interfaceC1483510ohxLJJJJZI6 != null ? Boolean.valueOf(interfaceC1483510ohxLJJJJZI6.LIZIZ()) : null);
                                                            C2188811AlT.LIZIZ(sbLIZ2);
                                                        }
                                                    }
                                                }
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean zLIZ;
                                                C1C7U.LIZ("DisableBackgroundPlayStrategy@3296.start$s$1$1");
                                                try {
                                                    LIZ();
                                                } finally {
                                                    if (!zLIZ) {
                                                    }
                                                }
                                                C1C7U.LIZIZ("DisableBackgroundPlayStrategy@3296.start$s$1$1");
                                            }
                                        });
                                    } else {
                                        C1163150gNF.LIZIZ.removeCallbacksAndMessages(null);
                                    }
                                    C1C7U.LIZIZ("DisableBackgroundPlayStrategy@3296.start$s$1");
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIILJJIL;
    }

    public static void LJLJL() {
        int i = C1150504el.LIZ().LJIIIZ("player_prerender_to_onprepared") ? 1 : 2;
        C08TN.LIZ().LIZ(i, "player_prerender_onprepared_type");
        if (i == 2) {
            C0X35.LIZ("player_prerender_duration_after_tryplay", true);
            C1602860roS.LIZ.getClass();
            if (C1602860roS.LJFF()) {
                C1150504el.LIZ().LIZLLL("player_prerender_duration_after_tryplay_nuj_scene", false);
            }
        }
        C0X35.LJIIJJI("cold_boot_start_to_tryplay", true);
        C0X35.LIZ("player_tryplay_to_first_frame", true);
        if (C1150504el.LIZ().LJIIIIZZ("player_tryplay_to_ui_to_video_end")) {
            return;
        }
        C1150504el.LIZ().LIZLLL("player_tryplay_to_ui_to_video_end", false);
    }

    @Override // X.C0N0Y
    public final void LJIIIZ() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 2, "cold_launch_player_opt_exp", true) == 2) {
            this.LIZ.LJJJLIIL(new C1480630odJ());
        }
    }

    @Override // X.C0N0Y
    public final void LJJL() {
        boolean zLJI = MethodIDManager.LJI(71740);
        String sourceId = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ != null ? ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId() : "null";
        if (InterfaceC1481090oe3.LIZ) {
            C1481030odx.LIZJ("PlayerManager", "stopPlay aid:" + sourceId);
        }
        if (C1483350ohh.LJIIIIZZ) {
            C1483350ohh.LJIIIIZZ = false;
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        LJLJJLL();
        this.LIZ.stop();
        C583420MuS.LIZJ(sourceId, C0RRP.STOP);
        this.LIZIZ = false;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJLJJLL() {
        long currentPosition = getCurrentPosition();
        if (InterfaceC1481090oe3.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("record position ");
            sbLIZ.append(currentPosition);
            sbLIZ.append(" aid:");
            sbLIZ.append(((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ != null ? ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId() : "null");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if ((!this.LIZLLL || this.LJIILIIL) && ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ != null && !TextUtils.isEmpty(((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId()) && currentPosition >= 0) {
            C588160N5a c588160N5a = LJIIZILJ;
            C1483440ohq c1483440ohq = c588160N5a.get(((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId());
            if (c1483440ohq == null) {
                c1483440ohq = new C1483440ohq();
            }
            c1483440ohq.LIZ = currentPosition;
            ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJJLIIJ();
            c588160N5a.put(((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId(), c1483440ohq);
        }
    }

    @Override // X.InterfaceC583520Muc
    public final boolean LJIIZILJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC583520Muc
    public final String LJIJ() {
        return this.LJI;
    }

    @Override // X.C0N0Y
    public final Long LJJZZI() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC583520Muc
    public final EnumC1479760obu getPlayerType() {
        return EnumC1479760obu.TT;
    }

    public C1483410ohn(boolean z) {
        boolean z2;
        this.LJIIJJI = C0Q6P.LIZ;
        this.LJIIL = 0L;
        this.LJIILIIL = false;
        this.LIZLLL = false;
        C1481110oe5.LIZ = InterfaceC1481090oe3.LIZ;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_v3_up_enable", true) == 1 && (!C1481060oe0.LIZLLL() || C1481060oe0.LJ())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_v3_up_force_enable", true) == 1 || (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_v3_up_mtk_enable", true) == 1 && C1481060oe0.LJ())) {
            z2 = true;
        }
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("PlayerManager", "PlayerManager con useV3:" + z2);
        }
        InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZ = 3;
        c1478410oZj.LIZLLL = z2 || C1489670ort.LIZ();
        c1478410oZj.LJ = z;
        c1478410oZj.LJFF = true;
        c1478410oZj.LIZIZ = true;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = interfaceC1484530ojbLIZ.LIZJ(c1478410oZj);
        this.LIZ = interfaceC1484830ok5LIZJ;
        this.LIZJ = interfaceC1484830ok5LIZJ;
        this.LJFF = new C1483350ohh(this, ((C650730Pfj) interfaceC1484830ok5LIZJ.getLegacy()).LIZ.LIZIZ);
    }

    public static C1483440ohq LJLIIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C1483440ohq();
        }
        C1483440ohq c1483440ohq = LJIIZILJ.get(str);
        if (c1483440ohq == null) {
            return new C1483440ohq();
        }
        return c1483440ohq;
    }

    @Override // X.C0N0Y
    public final <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3) {
        InterfaceC1484830ok5 interfaceC1484830ok5 = this.LIZ;
        if (interfaceC1484830ok5 != null) {
            return (T) interfaceC1484830ok5.LIZIZ(abstractC586270Mz3);
        }
        return null;
    }

    @Override // X.InterfaceC583520Muc
    public final void LIZJ(String str) {
        this.LIZ.LJIILIIL().LIZJ(str);
    }

    @Override // X.InterfaceC583520Muc
    public final String LJIIIIZZ(String str) {
        return this.LIZ.LJIIIZ().LJIIIIZZ(str);
    }

    @Override // X.InterfaceC708860RrI
    public final String LJIIJ(String str) {
        C1472440oQ6 c1472440oQ6LJIIIIZZ;
        InterfaceC1479560oba interfaceC1479560oba = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ;
        if (interfaceC1479560oba == null || (c1472440oQ6LJIIIIZZ = interfaceC1479560oba.LJIIIIZZ()) == null) {
            c1472440oQ6LJIIIIZZ = null;
        }
        if (c1472440oQ6LJIIIIZZ == null || TextUtils.isEmpty(c1472440oQ6LJIIIIZZ.LIZ)) {
            return null;
        }
        try {
            return JSONObjectProtectorUtils.getString(new JSONObject(c1472440oQ6LJIIIIZZ.LIZ), str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean LJIIJJI(VideoUrlModel videoUrlModel) {
        String bitRatedRatioUri;
        InterfaceC1483850oiV playState;
        if (videoUrlModel == null) {
            return false;
        }
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkResumePlay aid:");
            sbLIZ.append(videoUrlModel.getSourceId());
            C1481110oe5.LIZIZ("PlayerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ == null || !TextUtils.equals(videoUrlModel.getUri(), ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getUri()) || !TextUtils.equals(videoUrlModel.getRatio(), ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getRatio())) {
            return false;
        }
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            bitRatedRatioUri = videoUrlModel.getDashVideoId();
        } else {
            bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        }
        if (!TextUtils.isEmpty(videoUrlModel.getSourceId()) && ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJLZ(videoUrlModel.getSourceId(), bitRatedRatioUri)) {
            if (!C2523909un.LIZ || (playState = this.LIZ.getPlayState()) == null) {
                return true;
            }
            if (playState.getState() == 0 || playState.getState() == 7) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.C0N0Y
    public final void LJIIL(OnUIPlayListener onUIPlayListener) {
        this.LIZ.LJIILL().LJIIL(onUIPlayListener);
    }

    public final boolean LJIILJJIL(C1472990oQz c1472990oQz) {
        if (c1472990oQz != null && !TextUtils.isEmpty(c1472990oQz.LJ)) {
            InterfaceC1479560oba interfaceC1479560oba = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ;
            String str = c1472990oQz.LJ;
            return interfaceC1479560oba.LJLZ(str, str);
        }
        return false;
    }

    @Override // X.C0N0Y
    public final void LJIJI(String str) {
        this.LIZ.LJIILIIL().LJIJI(str);
    }

    @Override // X.C0N0Y
    public final void LJJ(boolean z) {
        this.LJIIIIZZ = z;
    }

    @Override // X.C0N0Y
    public final String LJJII(C584150Mvd c584150Mvd) {
        boolean z;
        EnumC603220NlI enumC603220NlI;
        boolean z2;
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        Video video = c584150Mvd.LIZ;
        Audio audio = c584150Mvd.LIZIZ;
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("PlayerManager", "tryPlay aid:" + C1481060oe0.LIZIZ(video));
        }
        if (video == null) {
            return null;
        }
        C2407009bw.LIZ();
        int i = c584150Mvd.LIZLLL;
        C581360Mr8 c581360Mr8 = c584150Mvd.LJ;
        boolean z3 = c581360Mr8.LIZ;
        boolean z4 = c581360Mr8.LIZJ;
        boolean z5 = c581360Mr8.LIZIZ;
        EnumC2281141EQm resolution = c584150Mvd.LIZJ.getResolution();
        EnumC1479590obd enumC1479590obd = EnumC1479590obd.Normal;
        C581360Mr8 c581360Mr82 = c584150Mvd.LJ;
        boolean z6 = c581360Mr82.LIZLLL;
        boolean z7 = c581360Mr82.LJ;
        int i2 = c581360Mr82.LJFF;
        String videoAdTag = c581360Mr82.LJII;
        if (!TextUtils.isEmpty(video.getVideoAdTag())) {
            videoAdTag = video.getVideoAdTag();
        }
        String str = c584150Mvd.LJ.LJIIIIZZ;
        enumC1479590obd.setLoop(z6);
        enumC1479590obd.setTag(videoAdTag);
        enumC1479590obd.setSubTag(str);
        if (C1481110oe5.LIZ) {
            C1481110oe5.LIZIZ("PlayerManager", "tryPlay() called with: video = [" + video + "], isRenderReady = [" + z5 + "], resolution = [" + resolution + "], useSuperResolution = [" + z7 + e3.f);
        }
        video.getAid();
        new WeakReference(this);
        if (!LJLJJL(video) && !((Boolean) C290360BZq.LIZ.getValue()).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        C1479720obq c1479720obq = new C1479720obq();
        SimVideo simVideoLJI = C1481230oeH.LJI(video);
        C1479530obX c1479530obX = c1479720obq.LIZ;
        c1479530obX.LIZLLL = simVideoLJI;
        c1479530obX.LJIIJJI = i;
        c1479530obX.LJIJJ = z4;
        c1479530obX.LJIIJ = z5;
        c1479530obX.LJI = resolution;
        c1479530obX.LJIJJLI = enumC1479590obd;
        c1479530obX.LJIILLIIL = z6;
        c1479720obq.LIZIZ(str);
        c1479720obq.LIZ.LJLL = c584150Mvd.LJ.LJIIIZ;
        boolean zIsNeedSetCookie = video.isNeedSetCookie();
        C1479530obX c1479530obX2 = c1479720obq.LIZ;
        c1479530obX2.LJIL = zIsNeedSetCookie;
        c1479530obX2.LJJIJL = z;
        c1479530obX2.LJIILL = z7;
        c1479530obX2.LJLJLLL = i2;
        c1479530obX2.LJIJI = z3;
        List<C1476750oX3> listConvertToSimAudio = Audio.convertToSimAudio(video, audio, "tryPlay", C1481060oe0.LIZIZ(video));
        C1479530obX c1479530obX3 = c1479720obq.LIZ;
        c1479530obX3.LJ = listConvertToSimAudio;
        c1479530obX3.LJFF = c584150Mvd.LJI;
        c1479530obX3.LJJJJZ = c584150Mvd.LJII;
        if (c584150Mvd.LJIILJJIL) {
            enumC603220NlI = EnumC603220NlI.DOWN;
        } else {
            enumC603220NlI = EnumC603220NlI.UP;
        }
        c1479720obq.LIZ.LJJLIIIJJIZ = enumC603220NlI.name();
        long jLongValue = lValueOf.longValue();
        C1479530obX c1479530obX4 = c1479720obq.LIZ;
        c1479530obX4.LJJLIIIJL = jLongValue;
        c1479530obX4.LJLJL = c584150Mvd.LJIJ;
        c1479530obX4.LJLZ = c584150Mvd.LJJIFFI;
        c1479530obX4.LJJJJZI = c584150Mvd.LJIJJLI;
        c1479530obX4.LJLJLJ = c584150Mvd.LJ.LJI;
        c1479530obX4.LJLLL = c584150Mvd.LJJI;
        c1479530obX4.LJLLJ = c584150Mvd.LJJ;
        C1484090oit value = C1484090oit.LIZJ.getValue();
        String strLIZIZ = C1481060oe0.LIZIZ(video);
        Map<String, String> map = c584150Mvd.LJ.LJIIIZ;
        value.getClass();
        c1479720obq.LIZ.LJJLIIIJILLIZJL = C1484090oit.LIZIZ(strLIZIZ, map);
        LoudnessStrategyConfig loudnessStrategyConfig = C588910N7x.LJ;
        Future<Float> futureLIZ = C584180Mvg.LIZ.LIZ(C1481060oe0.LIZIZ(video));
        C1479530obX c1479530obX5 = c1479720obq.LIZ;
        c1479530obX5.LJJLIIIJ = futureLIZ;
        c1479530obX5.LJLLLL = c584150Mvd.LJ.LJIILJJIL;
        c1479720obq.LIZ.LJZL = C0NBI.LIZ(new C586130Myp(Boolean.valueOf(c584150Mvd.LJJIIJ), Integer.valueOf(video.getDuration()), video.getAid(), video.getMeta()));
        if (C07CU.LIZ() && c584150Mvd.LJIIIIZZ && !c584150Mvd.LJIIIZ && (C07CU.LIZIZ() || C07CU.LIZJ(c584150Mvd.LJIIZILJ))) {
            c1479720obq.LIZ.LJLJJI = c584150Mvd.LJ.LJIIL;
        }
        if (c584150Mvd.LJIJ && video.is3DVideo()) {
            c1479720obq.LIZ.LJLLILLLL = true;
            Map<String, String> map2 = c584150Mvd.LJ.LJIIIZ;
            if (map2 != null && !map2.isEmpty()) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    String key = entry.getKey();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(entry.getValue());
                    sbLIZ.append("_is3D");
                    map2.put(key, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        C581750Mrl c581750Mrl = c584150Mvd.LJFF;
        if (c581750Mrl != null) {
            boolean z8 = c581750Mrl.LIZ;
            C1479530obX c1479530obX6 = c1479720obq.LIZ;
            c1479530obX6.LJJJIL = z8;
            c1479530obX6.LJJJJ = c581750Mrl.LIZIZ;
            c1479530obX6.LJJJJI = c581750Mrl.LIZJ;
            c1479530obX6.LJJJI = c581750Mrl.LIZLLL;
            c1479530obX6.LJJJJIZL = c581750Mrl.LJ;
            c1479720obq.LIZ.LJJJJJ = C1481230oeH.LIZ(c581750Mrl.LJFF, video.getPb2AwemeMillis());
        }
        Integer num = c584150Mvd.LJ.LJIIJ;
        if (num != null && z6) {
            c1479720obq.LIZ.LJJJJLI = num.intValue();
            Integer num2 = c584150Mvd.LJ.LJIIJJI;
            if (num2 != null) {
                z2 = true;
                c1479720obq.LIZ.LJJJJLL = num2.intValue();
            } else {
                z2 = false;
            }
            c1479720obq.LIZ.LJIIL = c584150Mvd.LJ.LJIIJ.intValue();
            if (z2) {
                c1479720obq.LIZ.LJIILIIL = c584150Mvd.LJ.LJIIJJI.intValue();
            }
        }
        if (this.LJIIIIZZ) {
            c1479720obq.LIZ.LJJJLL = false;
        }
        int i3 = c584150Mvd.LJIILLIIL;
        C1479530obX c1479530obX7 = c1479720obq.LIZ;
        c1479530obX7.LJJZZI = i3;
        c1479530obX7.LJLJJL = c584150Mvd.LJIIZILJ;
        int i4 = C2551009zA.LIZ;
        if (C2174741A9g.LIZIZ.LJIIZILJ()) {
            c1479720obq.LIZ.LJJJLZIJ = true;
        }
        if (c584150Mvd.LJIIIIZZ) {
            C1479530obX c1479530obX8 = c1479720obq.LIZ;
            c1479530obX8.LJIILJJIL = null;
            c1479530obX8.LJJJLL = false;
        }
        C1EE1 c1ee1 = C1EE1.LIZIZ;
        if (c1ee1.LJJIZ() && c584150Mvd.LJIILIIL) {
            c1479720obq.LIZ.LJJLL = c1ee1.LJJIJIIJI();
        }
        if (((Boolean) C585810MyJ.LIZJ.getValue()).booleanValue()) {
            c1479720obq.LIZ.LJLJI = true;
        }
        if (((Boolean) C1867820yho.LIZLLL.getValue()).booleanValue() && c584150Mvd.LJ.LJIILIIL == C1867820yho.LJIIIIZZ) {
            c1479720obq.LIZ.LJLIIL = ((Number) C1867820yho.LJ.getValue()).intValue();
            c1479720obq.LIZ.LJLIL = ((Number) C1867820yho.LJFF.getValue()).intValue();
            c1479720obq.LIZ.LJLILLLLZI = ((Number) C1867820yho.LJI.getValue()).intValue();
        }
        C583360MuM c583360MuM = c584150Mvd.LJJIII;
        if (c583360MuM != null) {
            C1ET9 c1et9 = c583360MuM.LIZ;
            if (c1et9 != null) {
                c1479720obq.LIZ.LJJIIZ = c1et9;
            }
            InterfaceC1487080oni interfaceC1487080oni = c583360MuM.LIZIZ;
            if (interfaceC1487080oni != null) {
                c1479720obq.LIZ.LJJIIZI = interfaceC1487080oni;
            }
            c1479720obq.LIZ.LJJIIJ = false;
        }
        C2413309cx.LIZ(new C2188251AkZ());
        this.LIZ.LJ(new C691760RBm(c1479720obq.LIZ()));
        C583420MuS.LIZJ(C1481060oe0.LIZIZ(video), C0RRP.P_T_PLAY_1);
        if (!C1486210omJ.LIZIZ()) {
            LJIILL = true;
            return "";
        }
        return "";
    }

    @Override // X.C0N0Y
    public final void LJJIJ(OnUIPlayListener onUIPlayListener) {
        this.LIZ.LJIILL().LJJIJ(onUIPlayListener);
    }

    @Override // X.C0N0Y
    public final void LJJIJIIJI(int i) {
        this.LIZ.LJIIIZ().LJJIJIIJI(i);
    }

    @Override // X.C0N0Y
    public final void LJJIJIIJIL(OnUIPlayListener onUIPlayListener) {
        this.LIZ.LJIILL().LJJIJIIJIL(onUIPlayListener);
    }

    @Override // X.C0N0Y
    public final void LJJIJLIJ(Long l) {
        this.LJIIL = l;
    }

    @Override // X.C0N0Y
    public final void LJJIL(Surface surface) {
        this.LIZ.LJIILL().LJIJJLI(surface, true);
    }

    @Override // X.C0N0Y
    public final void LJJIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchAudioLanguage languageCode:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ.LJIILL().LJJIZ(str);
    }

    @Override // X.C0N0Y
    public final void LJJJI(InterfaceC585470Mxl interfaceC585470Mxl) {
        this.LIZ.LJJLIIIJL(interfaceC585470Mxl);
    }

    @Override // X.C0N0Y
    public final void LJJJIL(InterfaceC1483670oiD interfaceC1483670oiD) {
        InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
        C1478410oZj c1478410oZj = new C1478410oZj();
        c1478410oZj.LIZ = 3;
        c1478410oZj.LJ = true;
        c1478410oZj.LJFF = true;
        c1478410oZj.LIZIZ = true;
        InterfaceC1484830ok5 interfaceC1484830ok5LIZJ = interfaceC1484530ojbLIZ.LIZJ(c1478410oZj);
        interfaceC1484830ok5LIZJ.LJJJI(interfaceC1483670oiD);
        this.LIZ = interfaceC1484830ok5LIZJ;
    }

    @Override // X.C0N0Y
    public final void LJJJJ(C586880N0c c586880N0c) {
        this.LJIIJJI = c586880N0c;
    }

    @Override // X.C0N0Y
    public final void LJJJJZ(Aweme aweme) {
        LJJLIIIJLJLI(aweme, null);
    }

    @Override // X.C0N0Y
    public final void LJJJJZI(HashMap<String, Object> map) {
        C20511081t.LJ().LIZLLL(map);
    }

    @Override // X.C0N0Y
    public final long LJJJLL(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            return LJLIIL(str).LIZ;
        }
        return -2L;
    }

    @Override // X.C0N0Y
    public final void LJJJLZIJ(String str) {
        if (this.LJII == null || ((Boolean) C261990AOn.LIZ.getValue()).booleanValue()) {
            this.LJII = str;
        }
    }

    @Override // X.C0N0Y
    public final void LJJJZ(C1479530obX c1479530obX) {
        SimVideo simVideo;
        String sourceId;
        if (c1479530obX != null && (simVideo = c1479530obX.LIZLLL) != null) {
            SimVideoUrlModel playAddr = simVideo.getPlayAddr();
            if (playAddr != null) {
                if (playAddr.getSourceId() == null) {
                    sourceId = "nullid";
                } else {
                    sourceId = playAddr.getSourceId();
                }
            } else {
                sourceId = "null";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PlayerManager::tryPrepareNext: LoudnessStrategy: enableNativeLoudnessStrategy=");
            sbLIZ.append(C1474810oTv.LJJLIIIJILLIZJL());
            sbLIZ.append(", aid=");
            sbLIZ.append(sourceId);
            C2188811AlT.LIZIZ(sbLIZ);
            LoudnessStrategyConfig loudnessStrategyConfig = C588910N7x.LJ;
            c1479530obX.LJJLIIIJ = C584180Mvg.LIZ.LIZ(sourceId);
            if (((SceneLoudnessConfig) C1483590oi5.LIZIZ.getValue()).isEnabled && c1479530obX.LJLL != null) {
                C1484090oit value = C1484090oit.LIZJ.getValue();
                Map<String, String> map = c1479530obX.LJLL;
                value.getClass();
                c1479530obX.LJJLIIIJILLIZJL = C1484090oit.LIZIZ(sourceId, map);
            }
            if (C1474810oTv.LJJLIIIJILLIZJL() != 0 && !c1479530obX.LJJLIIIJJIZ.equals(EnumC603220NlI.COLD_START.name())) {
                C0NBW.LIZIZ().LIZ(sourceId, "PlayerManager_PRERENDER");
            }
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tryPrepareNext aid:");
                sbLIZ2.append(sourceId);
                C1481110oe5.LIZIZ("PlayerManager", C2188811AlT.LIZIZ(sbLIZ2));
            }
            C2413309cx.LIZ(new C2188261Aka());
            this.LIZ.LJJJIL(new C691760RBm(c1479530obX));
            C583420MuS.LIZJ(sourceId, C0RRP.P_NEXT);
        }
    }

    @Override // X.C0N0Y
    public final void LJJLI(boolean z) {
        String sourceId;
        HashMap<String, Object> map = new HashMap<>();
        map.put("stage", "pause_begin");
        LJJJJZI(map);
        try {
            this.LJIIJJI.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ != null) {
            sourceId = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId();
        } else {
            sourceId = "null";
        }
        if (InterfaceC1481090oe3.LIZ) {
            C1481030odx.LIZJ("PlayerManager", "tryPausePlay 1 aid:" + sourceId);
        }
        this.LIZ.pause();
        C583420MuS.LIZJ(sourceId, C0RRP.PAUSE);
        this.LIZIZ = false;
        LJLJJLL();
        this.LJ = z;
    }

    @Override // X.C0N0Y
    public final void LJJLIIJ(OnUIPlayListener onUIPlayListener) {
        String sourceId;
        HashMap<String, Object> map = new HashMap<>();
        map.put("stage", "pause_begin");
        LJJJJZI(map);
        Objects.toString(onUIPlayListener);
        ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJLJI(onUIPlayListener);
        this.LJIIJJI.LIZIZ();
        if (((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ != null) {
            sourceId = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId();
        } else {
            sourceId = "null";
        }
        if (InterfaceC1481090oe3.LIZ) {
            C1481030odx.LIZJ("PlayerManager", "tryPausePlay 2 aid:" + sourceId);
        }
        if (onUIPlayListener != null && ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJLJI(onUIPlayListener)) {
            this.LIZ.pause();
            C583420MuS.LIZJ(sourceId, C0RRP.PAUSE);
            this.LIZIZ = false;
            LJLJJLL();
        }
    }

    @Override // X.C0N0Y
    public final void LJJLJ(Aweme aweme) {
        LJLL(aweme, EnumC2281141EQm.Undefine, null);
    }

    @Override // X.C0N0Y
    public final String LJJZZIII(C1479530obX c1479530obX) {
        String sourceId;
        Object obj;
        EnumC603220NlI enumC603220NlI;
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (C08MG.LIZ("tryPlayRequest")) {
            return "155";
        }
        SimVideoUrlModel simVideoUrlModel = c1479530obX.LJII;
        C2407009bw.LIZ();
        if (simVideoUrlModel != null) {
            sourceId = simVideoUrlModel.getSourceId();
        } else {
            sourceId = "null";
        }
        if (InterfaceC1481090oe3.LIZ) {
            C1481030odx.LIZJ("PlayerManager", "tryPlayRequest aid:" + sourceId);
        }
        if (simVideoUrlModel == null && c1479530obX.LIZLLL == null) {
            return "161";
        }
        boolean z2 = false;
        if (simVideoUrlModel != null) {
            if (!C1475150oUT.LIZIZ(simVideoUrlModel)) {
                return "156";
            }
            if ((!this.LIZLLL || this.LJIILIIL) && !TextUtils.isEmpty(simVideoUrlModel.getSourceId())) {
                LJIIZILJ.put(simVideoUrlModel.getSourceId(), new C1483440ohq());
            }
            String bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
            String uri = simVideoUrlModel.getUri();
            C1946807ju.LIZ = bitRatedRatioUri;
            C1946807ju.LIZ(bitRatedRatioUri);
            C12861051n.LIZIZ.LIZ(uri);
            if (LJLILLLLZI(simVideoUrlModel.getSourceId()) && !LJIILL) {
                z = true;
            } else {
                z = false;
            }
            c1479530obX.LJJIJL = z;
        }
        SimVideo simVideo = c1479530obX.LIZLLL;
        if (simVideo != null && (obj = simVideo.origin) != null) {
            Video video = (Video) obj;
            if (!TextUtils.isEmpty(video.getVideoAdTag())) {
                c1479530obX.LJIIZILJ = video.getVideoAdTag();
            }
            if (this.LJIIIZ == video) {
                enumC603220NlI = EnumC603220NlI.COLD_START;
            } else {
                enumC603220NlI = EnumC603220NlI.CLICK;
            }
            c1479530obX.LJJLIIIJJIZ = enumC603220NlI.name();
        }
        if (TextUtils.isEmpty(c1479530obX.LJIIZILJ)) {
            c1479530obX.LJIIZILJ = "default";
        }
        if (this.LJFF.LJ == 2) {
            z2 = true;
        }
        c1479530obX.LJJIFFI = z2;
        c1479530obX.LJJLIIIJL = jElapsedRealtime;
        C2413309cx.LIZ(new C2188251AkZ());
        this.LIZ.LJ(new C691760RBm(c1479530obX));
        this.LIZIZ = true;
        C583420MuS.LIZJ(sourceId, C0RRP.P_T_PLAY_2);
        if (!C1486210omJ.LIZIZ()) {
            LJIILL = true;
            return "tryPlayV2";
        }
        return "tryPlayV2";
    }

    public final boolean LJLIL(Video video) {
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            return C1486210omJ.LIZIZ();
        }
        if (C2519509u5.LIZ && video.getPlayAddr() != null && TextUtils.equals(video.getPlayAddr().getSourceId(), this.LJII)) {
            LJIILL = false;
            return true;
        }
        if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIIZILJ()) {
            if (!C2279641EKs.LIZIZ()) {
                return false;
            }
            LJIILL = false;
            return true;
        }
        if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIIIZ()) {
            ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJIZ();
            LJIILL = false;
            return true;
        }
        if (C818480W8w.LJ("detail_page_startup")) {
            return C278410Avf.LIZ();
        }
        if (C818480W8w.LJ("search_mix")) {
            if (C1483470oht.LIZ < 0) {
                C1483470oht.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_video_first_frame_opt", true);
            }
            if (C1483470oht.LIZ == 1) {
                LJIILL = false;
                return true;
            }
        }
        return false;
    }

    public final boolean LJLILLLLZI(String str) {
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            return C1486210omJ.LIZIZ();
        }
        if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIIZILJ()) {
            if (!C2279641EKs.LIZIZ()) {
                return false;
            }
            LJIILL = false;
            return true;
        }
        if (((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIIIZ()) {
            ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJJIZ();
            LJIILL = false;
            return true;
        }
        if (C818480W8w.LJ("detail_page_startup")) {
            return C278410Avf.LIZ();
        }
        if (C2519509u5.LIZ && TextUtils.equals(str, this.LJII)) {
            return true;
        }
        return false;
    }

    @Override // X.C0N0Y
    public final boolean LJLJI(OnUIPlayListener onUIPlayListener) {
        return ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJLJI(onUIPlayListener);
    }

    public final boolean LJLJJL(Video video) {
        if (C1483480ohu.LIZ < 0) {
            C1483480ohu.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "player_first_frame_scheduler_opt", true);
        }
        if (C1483480ohu.LIZ == 1) {
            if (LJLIL(video) && !LJIILL) {
                return true;
            }
            return false;
        }
        if (!LJIILL && LJLIL(video)) {
            return true;
        }
        return false;
    }

    public final void LJLJLLL(C584150Mvd c584150Mvd) {
        Video video;
        boolean z;
        String videoAdTag;
        EnumC603220NlI enumC603220NlI;
        if (c584150Mvd != null && (video = c584150Mvd.LIZ) != null) {
            C2407009bw.LIZ();
            EnumC1479590obd enumC1479590obd = EnumC1479590obd.Normal;
            C581360Mr8 c581360Mr8 = c584150Mvd.LJ;
            boolean z2 = c581360Mr8.LIZLLL;
            String videoAdTag2 = c581360Mr8.LJII;
            if (!TextUtils.isEmpty(video.getVideoAdTag())) {
                videoAdTag2 = video.getVideoAdTag();
            }
            if (c584150Mvd.LJIIIIZZ || (c584150Mvd.LJIIJ && c584150Mvd.LJIIJJI)) {
                c584150Mvd.LIZLLL = c584150Mvd.LJIIL;
            }
            String str = c584150Mvd.LJ.LJIIIIZZ;
            enumC1479590obd.setLoop(z2);
            enumC1479590obd.setTag(videoAdTag2);
            enumC1479590obd.setSubTag(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (InterfaceC1481090oe3.LIZ) {
                C1481030odx.LIZJ("PlayerManager", "tryPlayWithInitialStart aid:" + C1481060oe0.LIZIZ(video));
            }
            video.getAid();
            new WeakReference(this);
            boolean zLJLJJL = LJLJJL(video);
            C1479720obq c1479720obq = new C1479720obq();
            SimVideo simVideoLJI = C1481230oeH.LJI(video);
            C1479530obX c1479530obX = c1479720obq.LIZ;
            c1479530obX.LIZLLL = simVideoLJI;
            C581360Mr8 c581360Mr82 = c584150Mvd.LJ;
            c1479530obX.LJIIJ = c581360Mr82.LIZIZ;
            if (this.LJFF.LJ == 2) {
                z = true;
            } else {
                z = false;
            }
            c1479530obX.LJJIFFI = z;
            c1479530obX.LJIIJJI = c584150Mvd.LIZLLL;
            c1479530obX.LJIJI = c581360Mr82.LIZ;
            boolean zIsNeedSetCookie = video.isNeedSetCookie();
            C1479530obX c1479530obX2 = c1479720obq.LIZ;
            c1479530obX2.LJIL = zIsNeedSetCookie;
            c1479530obX2.LJJIJL = zLJLJJL;
            c1479530obX2.LJIJJ = c584150Mvd.LJ.LIZJ;
            c1479530obX2.LJIJJLI = enumC1479590obd;
            c1479530obX2.LJIILLIIL = z2;
            if (video.getVideoAdTag() == null) {
                videoAdTag = c584150Mvd.LJ.LJII;
            } else {
                videoAdTag = video.getVideoAdTag();
            }
            c1479720obq.LIZJ(videoAdTag);
            c1479720obq.LIZIZ(c584150Mvd.LJ.LJIIIIZZ);
            c1479720obq.LIZ.LJLL = c584150Mvd.LJ.LJIIIZ;
            List<C1476750oX3> listConvertToSimAudio = Audio.convertToSimAudio(video, c584150Mvd.LIZIZ, "tryPlay", C1481060oe0.LIZIZ(video));
            C1479530obX c1479530obX3 = c1479720obq.LIZ;
            c1479530obX3.LJ = listConvertToSimAudio;
            c1479530obX3.LJFF = c584150Mvd.LJI;
            c1479530obX3.LJJJJZ = false;
            if (this.LJIIIZ == video) {
                enumC603220NlI = EnumC603220NlI.COLD_START;
            } else {
                enumC603220NlI = EnumC603220NlI.CLICK;
            }
            String strName = enumC603220NlI.name();
            C1479530obX c1479530obX4 = c1479720obq.LIZ;
            c1479530obX4.LJJLIIIJJIZ = strName;
            c1479530obX4.LJJLIIIJLJLI = c584150Mvd.LJIILL;
            c1479530obX4.LJJLIIIJL = jElapsedRealtime;
            C581360Mr8 c581360Mr83 = c584150Mvd.LJ;
            c1479530obX4.LJIILL = c581360Mr83.LJ;
            c1479530obX4.LJLJLLL = c581360Mr83.LJFF;
            c1479530obX4.LJLLL = c584150Mvd.LJJI;
            c1479530obX4.LJLLJ = c584150Mvd.LJJ;
            c1479530obX4.LJLJL = c584150Mvd.LJIJ;
            c1479530obX4.LJLZ = c584150Mvd.LJJIFFI;
            c1479530obX4.LJLJLJ = c581360Mr83.LJI;
            C1484090oit value = C1484090oit.LIZJ.getValue();
            String strLIZIZ = C1481060oe0.LIZIZ(video);
            Map<String, String> map = c584150Mvd.LJ.LJIIIZ;
            value.getClass();
            c1479720obq.LIZ.LJJLIIIJILLIZJL = C1484090oit.LIZIZ(strLIZIZ, map);
            LoudnessStrategyConfig loudnessStrategyConfig = C588910N7x.LJ;
            Future<Float> futureLIZ = C584180Mvg.LIZ.LIZ(C1481060oe0.LIZIZ(video));
            C1479530obX c1479530obX5 = c1479720obq.LIZ;
            c1479530obX5.LJJLIIIJ = futureLIZ;
            c1479530obX5.LJIIIZ = c584150Mvd.LJJII;
            c1479530obX5.LJLLLL = c584150Mvd.LJ.LJIILJJIL;
            c1479720obq.LIZ.LJZL = C0NBI.LIZ(new C586130Myp(Boolean.valueOf(c584150Mvd.LJJIIJ), Integer.valueOf(video.getDuration()), video.getAid(), video.getMeta()));
            C581750Mrl c581750Mrl = c584150Mvd.LJFF;
            if (C07CU.LIZ() && c584150Mvd.LJIIIIZZ && !c584150Mvd.LJIIIZ && (C07CU.LIZIZ() || C07CU.LIZJ(c584150Mvd.LJIIZILJ))) {
                c1479720obq.LIZ.LJLJJI = c584150Mvd.LJ.LJIIL;
            }
            if (c581750Mrl != null) {
                boolean z3 = c581750Mrl.LIZLLL;
                C1479530obX c1479530obX6 = c1479720obq.LIZ;
                c1479530obX6.LJJJI = z3;
                c1479530obX6.LJJJIL = c581750Mrl.LIZ;
                c1479530obX6.LJJJJ = c581750Mrl.LIZIZ;
                c1479530obX6.LJJJJI = c581750Mrl.LIZJ;
                c1479530obX6.LJJJJIZL = c581750Mrl.LJ;
                c1479720obq.LIZ.LJJJJJ = C1481230oeH.LIZ(c581750Mrl.LJFF, video.getPb2AwemeMillis());
            }
            C1EE1 c1ee1 = C1EE1.LIZIZ;
            if (c1ee1.LJJIZ() && c584150Mvd.LJIILIIL) {
                c1479720obq.LIZ.LJJLL = c1ee1.LJJIJIIJI();
            }
            String str2 = c584150Mvd.LJIIZILJ;
            if (!TextUtils.isEmpty(str2)) {
                c1479720obq.LIZ.LJLJJL = str2;
            }
            if (c584150Mvd.LJIJ && video.is3DVideo()) {
                c1479720obq.LIZ.LJLLILLLL = true;
            }
            boolean z4 = c584150Mvd.LJIJJ;
            if (z4) {
                C1479530obX c1479530obX7 = c1479720obq.LIZ;
                c1479530obX7.LJJL = z4;
                c1479530obX7.LJJJJZI = c584150Mvd.LJIJJLI;
            }
            C581360Mr8 c581360Mr84 = c584150Mvd.LJ;
            Integer num = c581360Mr84.LJIIJ;
            Integer num2 = c581360Mr84.LJIIJJI;
            if (num != null && num2 != null && z2) {
                c1479720obq.LIZ.LJJJJLI = num.intValue();
                c1479720obq.LIZ.LJJJJLL = num2.intValue();
                c1479720obq.LIZ.LJIIL = num.intValue();
                int iIntValue = num2.intValue();
                C1479530obX c1479530obX8 = c1479720obq.LIZ;
                c1479530obX8.LJIILIIL = iIntValue;
                c1479530obX8.LJIILLIIL = true;
            }
            if (c584150Mvd.LJIIIIZZ) {
                C1479530obX c1479530obX9 = c1479720obq.LIZ;
                c1479530obX9.LJIILJJIL = null;
                c1479530obX9.LJJJLL = false;
            }
            int i = C2551009zA.LIZ;
            if (C2174741A9g.LIZIZ.LJIIZILJ()) {
                c1479720obq.LIZ.LJJJLZIJ = true;
            }
            C583360MuM c583360MuM = c584150Mvd.LJJIII;
            if (c583360MuM != null) {
                C1ET9 c1et9 = c583360MuM.LIZ;
                if (c1et9 != null) {
                    c1479720obq.LIZ.LJJIIZ = c1et9;
                }
                InterfaceC1487080oni interfaceC1487080oni = c583360MuM.LIZIZ;
                if (interfaceC1487080oni != null) {
                    c1479720obq.LIZ.LJJIIZI = interfaceC1487080oni;
                }
                c1479720obq.LIZ.LJJIIJ = false;
            }
            C2413309cx.LIZ(new C2188251AkZ());
            if (((Boolean) C1867820yho.LIZLLL.getValue()).booleanValue() && c584150Mvd.LJ.LJIILIIL == C1867820yho.LJIIIIZZ) {
                c1479720obq.LIZ.LJLIIL = ((Number) C1867820yho.LJ.getValue()).intValue();
                c1479720obq.LIZ.LJLIL = ((Number) C1867820yho.LJFF.getValue()).intValue();
                c1479720obq.LIZ.LJLILLLLZI = ((Number) C1867820yho.LJI.getValue()).intValue();
            }
            this.LIZ.LJ(new C691760RBm(c1479720obq.LIZ()));
            C583420MuS.LIZJ(C1481060oe0.LIZIZ(video), C0RRP.P_T_P_W_I_START_2);
            if (!C1486210omJ.LIZIZ()) {
                LJIILL = true;
            }
        }
    }

    @Override // X.C0N0Y
    public final void preload(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1481230oeH.LJI(it2.next().getVideo()));
        }
        boolean z = C1479290ob9.LIZ;
        C1475000oUE.LIZLLL.execute(new ARunnableS123S0100000_23(arrayList, 164));
    }

    @Override // X.C0N0Y
    public final void seek(float f) {
        String sourceId;
        if (((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ != null) {
            sourceId = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZJ.getSourceId();
        } else {
            sourceId = "null";
        }
        if (InterfaceC1481090oe3.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("seek aid:");
            sbLIZ.append(sourceId);
            sbLIZ.append(", progress:");
            sbLIZ.append(f);
            C1481030odx.LIZJ("PlayerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ.seek(f);
        C583420MuS.LIZJ(sourceId, C0RRP.SEEK);
    }

    @Override // X.C0N0Y
    public final void setSpeed(float f) {
        this.LIZ.setSpeed(f);
    }

    @Override // X.C0N0Y
    public final void setSurface(Surface surface) {
        this.LIZ.LJIILL().setSurface(surface);
    }

    @Override // X.C0N0Y
    public final String LJIILIIL(Video video, OnUIPlayListener onUIPlayListener) {
        return LJLLI(video, false, onUIPlayListener, 0);
    }

    @Override // X.C0N0Y
    public final String LJIJJLI(Video video, int i) {
        return LJJLIIIIJ(video, null, false, true, i, true, true, null, null);
    }

    @Override // X.C0N0Y
    public final String LJJIFFI(C584150Mvd c584150Mvd, OnUIPlayListener onUIPlayListener) {
        int i;
        boolean z;
        String sourceId;
        String sourceId2;
        LJLJL();
        if (C08MG.LIZ("tryResumePlay")) {
            return "101";
        }
        String strLIZIZ = C1481060oe0.LIZIZ(c584150Mvd.LIZ);
        if (InterfaceC1481090oe3.LIZ) {
            C1481030odx.LIZJ("PlayerManager", "tryResumePlay aid:" + strLIZIZ);
        }
        this.LJIIJJI.LIZ();
        if (onUIPlayListener == null) {
            return "102";
        }
        if (!((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJLJI(onUIPlayListener)) {
            return "103";
        }
        Video video = c584150Mvd.LIZ;
        if (video == null) {
            return "104";
        }
        VideoUrlModel playAddrBytevc1 = video.getPlayAddrBytevc1();
        VideoUrlModel playAddrH264 = c584150Mvd.LIZ.getPlayAddrH264();
        if (playAddrBytevc1 == null && playAddrH264 == null && ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZLLL == null) {
            return "105";
        }
        boolean z2 = c584150Mvd.LJIJI;
        if (z2) {
            i = 0;
        } else {
            i = c584150Mvd.LIZLLL;
        }
        c584150Mvd.LIZLLL = i;
        if (!z2 && i <= 0) {
            if (LJIILJJIL(((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZLLL)) {
                ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJJLIIIIJ(((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZLLL.LJ);
                C583420MuS.LIZJ(strLIZIZ, C0RRP.RESUME);
                this.LIZIZ = false;
                return "107";
            }
            if (!LJIIJJI(playAddrBytevc1) && !LJIIJJI(playAddrH264)) {
                z = false;
            } else {
                z = true;
            }
            if (c584150Mvd.LJIL) {
                c584150Mvd.LJIL = false;
            } else if (z && (this.LIZ.LJIIIZ() == null || this.LIZ.LJIIIZ().LIZJ() == null || this.LIZ.LJIIIZ().LIZJ().LLJJIII == c584150Mvd.LJJ)) {
                InterfaceC1479560oba interfaceC1479560oba = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ;
                if (playAddrBytevc1 != null) {
                    sourceId = playAddrBytevc1.getSourceId();
                } else {
                    sourceId = playAddrH264.getSourceId();
                }
                interfaceC1479560oba.LJJLIIIIJ(sourceId);
                C583420MuS.LIZJ(strLIZIZ, C0RRP.RESUME);
                this.LIZIZ = false;
                return "108";
            }
            if (this.LJ) {
                this.LJ = false;
                if (playAddrBytevc1 != null) {
                    sourceId2 = playAddrBytevc1.getSourceId();
                } else {
                    sourceId2 = playAddrH264.getSourceId();
                }
                c584150Mvd.LIZLLL = (int) LJLIIL(sourceId2).LIZ;
            }
            LJLJLLL(c584150Mvd);
            return "";
        }
        LJLJLLL(c584150Mvd);
        return "106";
    }

    @Override // X.C0N0Y
    public final void LJJIJIL(Aweme aweme, String str) {
        LJLL(aweme, EnumC2281141EQm.Undefine, str);
    }

    @Override // X.C0N0Y
    public final void LJJJJL(Aweme aweme, EnumC2281141EQm enumC2281141EQm) {
        LJLL(aweme, enumC2281141EQm, null);
    }

    @Override // X.C0N0Y
    public final void LJJJJLI(Aweme aweme, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C581750Mrl c581750MrlLJFF;
        LogoSpotlightVideoModel logoSpotlightVideoModelLJJIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LJJJLZIJ(aweme.getAid());
        if (C0C64.LJIILLIIL().LJIJ(31744, 2, "cold_launch_player_opt_exp", true) == 2 && !AwemeSaaSExtKt.isLive(aweme)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AcceleratePlay tryPrerenderVideoColdStart, aweme: ");
            sbLIZ.append(aweme);
            C2188811AlT.LIZIZ(sbLIZ);
            C1479890oc7 c1479890oc7LIZ = C1483430ohp.LIZ(aweme, "tryPrerenderVideoColdStart");
            Video video = aweme.getVideo();
            Audio audio = aweme.getAudio();
            if (C1017070cZd.LLJJJIL(aweme) && (logoSpotlightVideoModelLJJIZ = C1017070cZd.LJJIZ(aweme)) != null) {
                C1046940dLo c1046940dLo = C1046940dLo.LIZ;
                Video video2 = aweme.getVideo();
                c1046940dLo.getClass();
                video = C1046940dLo.LIZIZ(video2, logoSpotlightVideoModelLJJIZ);
            }
            if (video == null || aweme.getVideo().getProperPlayAddr() == null) {
                return;
            }
            C582010MsB.LIZJ = aweme.getAid();
            video.setRationAndSourceId(aweme.getAid());
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "feed_cold_start_prerender_range_enable", true) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "first_video_skip_av_sync", true) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "first_video_predemux_exp", true) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zBooleanValue = ((Boolean) C585810MyJ.LIZLLL.getValue()).booleanValue();
            int iIntValue = ((Number) C266170Abv.LIZ.getValue()).intValue();
            C1479720obq c1479720obq = new C1479720obq();
            if (!this.LJIIJ && C2174741A9g.LIZIZ.LJ() && ((OpenTikTokOnMuteConfig) C1483450ohr.LIZIZ.getValue()).FIRST_VIDEO_MUTE) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.LJIIJ = true;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryPrerenderVideoColdStart needMute: ");
            sbLIZ2.append(z5);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (aweme.isAd() && video.is3DVideo()) {
                c1479720obq.LIZ.LJLLILLLL = true;
            }
            C1EE1 c1ee1 = C1EE1.LIZIZ;
            if (c1ee1.LJJIZ() && AwemeBizExtKt.getCacheSourceType(aweme) == C0N9C.OFFLINE_MODE.ordinal()) {
                c1479720obq.LIZ.LJJLL = c1ee1.LJJIJIIJI();
            }
            if (C2523209ug.LIZ) {
                z6 = true;
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_enable_surface_surfaceview", true) == 1 && !C582980Mtk.LIZIZ(aweme)) {
                    c1479720obq.LIZ.LJJLIIIJLJLI = true;
                }
            } else {
                z6 = true;
            }
            c1479720obq.LIZ.LIZLLL = C1481230oeH.LJI(video);
            boolean zIsNeedSetCookie = video.isNeedSetCookie();
            C1479530obX c1479530obX = c1479720obq.LIZ;
            c1479530obX.LJIL = zIsNeedSetCookie;
            c1479530obX.LJJIJLIJ = z6;
            c1479530obX.LJJIJIL = z6;
            c1479530obX.LJIIIZ = z;
            c1479530obX.LJJJJJL = z2;
            c1479720obq.LIZJ(video.getVideoAdTag());
            List<C1476750oX3> listConvertToSimAudio = Audio.convertToSimAudio(video, audio, "ColdStart", aweme.getAid());
            C1479530obX c1479530obX2 = c1479720obq.LIZ;
            c1479530obX2.LJ = listConvertToSimAudio;
            c1479530obX2.LJFF = c1479890oc7LIZ;
            c1479530obX2.LJJJJZ = false;
            String strName = EnumC603220NlI.COLD_START.name();
            C1479530obX c1479530obX3 = c1479720obq.LIZ;
            c1479530obX3.LJJLIIIJJIZ = strName;
            c1479530obX3.LJJLIIIJL = jElapsedRealtime;
            c1479530obX3.LJJZ = z3;
            c1479530obX3.LJLI = z4;
            c1479530obX3.LJJJLZIJ = z5;
            c1479530obX3.LJLIIIL = iIntValue;
            c1479530obX3.LJLJI = zBooleanValue;
            c1479530obX3.LJLJLLL = 30;
            if (!C1474810oTv.LLJJLIIIJLLLLLLLZ() && (c581750MrlLJFF = C20702715zl.LJFF(aweme, null)) != null) {
                boolean z7 = c581750MrlLJFF.LIZLLL;
                C1479530obX c1479530obX4 = c1479720obq.LIZ;
                c1479530obX4.LJJJI = z7;
                c1479530obX4.LJJJIL = c581750MrlLJFF.LIZ;
                c1479530obX4.LJJJJ = c581750MrlLJFF.LIZIZ;
                c1479530obX4.LJJJJI = c581750MrlLJFF.LIZJ;
                c1479530obX4.LJJJJIZL = c581750MrlLJFF.LJ;
                c1479720obq.LIZ.LJJJJJ = C1481230oeH.LIZ(c581750MrlLJFF.LJFF, video.getPb2AwemeMillis());
            }
            if (this.LJIIIZ == null) {
                this.LJIIIZ = video;
            }
            LJJJZ(c1479720obq.LIZ());
        }
    }

    @Override // X.C0N0Y
    public final void LJJLIIIJILLIZJL(Aweme aweme, OnPlayerPreparedListener onPlayerPreparedListener) {
        if (aweme != null) {
            this.LJI = aweme.getAid();
            C1483350ohh c1483350ohh = this.LJFF;
            c1483350ohh.LJ = 2;
            c1483350ohh.LIZIZ(aweme, onPlayerPreparedListener);
        }
    }

    @Override // X.C0N0Y
    public final void LJJLIIIJLJLI(Aweme aweme, C1913420ztM c1913420ztM) {
        if (TextUtils.isEmpty(this.LJI) && aweme != null) {
            this.LJI = aweme.getAid();
        }
        this.LJFF.LIZIZ(aweme, c1913420ztM);
    }

    @Override // X.C0N0Y
    public final void LJJLIIIJLLLLLLLZ(Aweme aweme, String str) {
        boolean z;
        if (!C0PVY.LIZ(str, "cold_start_cache") ? !(!C0PVY.LIZ(str, "top_view") || !((Boolean) C1867770yhj.LJFF.getValue()).booleanValue()) : ((Boolean) C1867770yhj.LJ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        LJJJJLI(aweme, z);
    }

    @Override // X.C0N0Y
    public final void LJJLIL(float f, float f2) {
        this.LIZ.LJIILIIL().LJIILLIIL(f, f2);
    }

    @Override // X.C0N0Y
    public final String LJJLL(Video video, OnUIPlayListener onUIPlayListener) {
        return LJLLI(video, false, onUIPlayListener, 0);
    }

    @Override // X.C0N0Y
    public final String LJL(Video video, boolean z) {
        return LJJJJI(video, null, false, z);
    }

    @Override // X.C0N0Y
    public final String LJLI(Video video, int i, C581750Mrl c581750Mrl) {
        return LJJLIIIIJ(video, null, false, false, i, false, false, c581750Mrl, null);
    }

    public final void LJLL(Aweme aweme, EnumC2281141EQm enumC2281141EQm, String str) {
        boolean z;
        boolean z2;
        C581750Mrl c581750MrlLJFF;
        if (aweme != null && !AwemeSaaSExtKt.isLive(aweme)) {
            C1479890oc7 c1479890oc7LIZ = C1483430ohp.LIZ(aweme, "tryPrerenderVideoAcrossPage");
            Video video = aweme.getVideo();
            Audio audio = aweme.getAudio();
            if (video == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AcceleratePlay tryPrerenderVideoAcrossPage, aweme: ");
            sbLIZ.append(aweme);
            C2188811AlT.LIZIZ(sbLIZ);
            if (aweme.getVideo().getProperPlayAddr() == null) {
                return;
            }
            if (str != null) {
                LJJJLZIJ(str);
                video.setRationAndSourceId(str);
            } else {
                LJJJLZIJ(aweme.getAid());
                video.setRationAndSourceId(aweme.getAid());
            }
            C1479720obq c1479720obq = new C1479720obq();
            c1479720obq.LIZ.LIZLLL = C1481230oeH.LJI(video);
            c1479720obq.LIZ.LJIL = video.isNeedSetCookie();
            List<C1476750oX3> listConvertToSimAudio = Audio.convertToSimAudio(video, audio, "AcrossPage", aweme.getAid());
            C1479530obX c1479530obX = c1479720obq.LIZ;
            c1479530obX.LJ = listConvertToSimAudio;
            c1479530obX.LJFF = c1479890oc7LIZ;
            String strName = EnumC603220NlI.CLICK.name();
            C1479530obX c1479530obX2 = c1479720obq.LIZ;
            c1479530obX2.LJJLIIIJJIZ = strName;
            c1479530obX2.LJLJJLL = enumC2281141EQm;
            if (!C1474810oTv.LLJJLIIIJLLLLLLLZ() && (c581750MrlLJFF = C20702715zl.LJFF(aweme, null)) != null) {
                boolean z3 = c581750MrlLJFF.LIZLLL;
                C1479530obX c1479530obX3 = c1479720obq.LIZ;
                c1479530obX3.LJJJI = z3;
                c1479530obX3.LJJJIL = c581750MrlLJFF.LIZ;
                c1479530obX3.LJJJJ = c581750MrlLJFF.LIZIZ;
                c1479530obX3.LJJJJI = c581750MrlLJFF.LIZJ;
                c1479530obX3.LJJJJIZL = c581750MrlLJFF.LJ;
            }
            boolean z4 = false;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_cold_start_pre_decode_not_render", true) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "feed_cold_start_prerender_range_enable", true) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "first_video_predemux_exp", true) == 1) {
                z4 = true;
            }
            C1479530obX c1479530obX4 = c1479720obq.LIZ;
            c1479530obX4.LJJIJLIJ = true;
            c1479530obX4.LJJIJIL = z;
            c1479530obX4.LJJJJJL = z2;
            c1479530obX4.LJLI = z4;
            LJJJZ(c1479720obq.LIZ());
        }
    }

    @Override // X.C0N0Y
    public final String LJJJJI(Video video, Audio audio, boolean z, boolean z2) {
        return LJJLIIIIJ(video, audio, z, z2, 0, true, true, null, null);
    }

    @Override // X.C0N0Y
    public final String LJJJJLL(VideoUrlModel videoUrlModel, boolean z, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7) {
        boolean z2;
        String sourceId;
        EnumC1479590obd enumC1479590obd = EnumC1479590obd.Normal;
        if (C08MG.LIZ("tryPlayWithInitialStart")) {
            return "155";
        }
        C2407009bw.LIZ();
        if (InterfaceC1481090oe3.LIZ) {
            StringBuilder sb = new StringBuilder("tryPlayWithInitialStart aid:");
            if (videoUrlModel != null) {
                sourceId = videoUrlModel.getSourceId();
            } else {
                sourceId = "null";
            }
            sb.append(sourceId);
            C1481030odx.LIZJ("PlayerManager", sb.toString());
        }
        if (!C1475150oUT.LIZIZ(C1481230oeH.LJFF(videoUrlModel))) {
            return "156";
        }
        if ((!this.LIZLLL || this.LJIILIIL) && !TextUtils.isEmpty(videoUrlModel.getSourceId())) {
            LJIIZILJ.put(videoUrlModel.getSourceId(), new C1483440ohq());
        }
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        String uri = videoUrlModel.getUri();
        C1946807ju.LIZ = bitRatedRatioUri;
        C1946807ju.LIZ(bitRatedRatioUri);
        C12861051n.LIZIZ.LIZ(uri);
        if ((!LJLILLLLZI(videoUrlModel.getSourceId()) || LJIILL) && !((Boolean) C290360BZq.LIZ.getValue()).booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C1479720obq c1479720obq = new C1479720obq();
        SimVideoUrlModel simVideoUrlModelLJII = C1481230oeH.LJII(videoUrlModel);
        C1479530obX c1479530obX = c1479720obq.LIZ;
        c1479530obX.LJII = simVideoUrlModelLJII;
        c1479530obX.LJIIJ = true;
        c1479530obX.LJJ = true;
        c1479530obX.LJIJJLI = enumC1479590obd;
        c1479530obX.LJIILLIIL = enumC1479590obd.LLILZ;
        c1479530obX.LJIIJJI = 0;
        c1479530obX.LJIJI = true;
        c1479530obX.LJIL = z;
        c1479530obX.LJFF = c1479890oc7;
        c1479720obq.LIZJ(videoUrlModel.getVideoAdTag());
        C1479530obX c1479530obX2 = c1479720obq.LIZ;
        c1479530obX2.LJJIJL = z2;
        c1479530obX2.LJIIIIZZ = false;
        c1479530obX2.LJJJJZ = false;
        LoudnessStrategyConfig loudnessStrategyConfig = C588910N7x.LJ;
        Future<Float> futureLIZ = C584180Mvg.LIZ.LIZ(videoUrlModel.getSourceId());
        C1479530obX c1479530obX3 = c1479720obq.LIZ;
        c1479530obX3.LJJLIIIJ = futureLIZ;
        if (c581750Mrl != null) {
            c1479530obX3.LJJJI = c581750Mrl.LIZLLL;
            c1479530obX3.LJJJIL = c581750Mrl.LIZ;
            c1479530obX3.LJJJJ = c581750Mrl.LIZIZ;
            c1479530obX3.LJJJJI = c581750Mrl.LIZJ;
            c1479530obX3.LJJJJIZL = c581750Mrl.LJ;
            c1479720obq.LIZ.LJJJJJ = C1481230oeH.LIZ(c581750Mrl.LJFF, videoUrlModel.getPb2AwemeMillis());
        }
        C2413309cx.LIZ(new C2188251AkZ());
        this.LIZ.LJ(new C691760RBm(c1479720obq.LIZ()));
        this.LIZIZ = true;
        C583420MuS.LIZJ(videoUrlModel.getSourceId(), C0RRP.P_T_P_W_I_START_3);
        if (!C1486210omJ.LIZIZ()) {
            LJIILL = true;
            return "prepareWithInitialStart";
        }
        return "prepareWithInitialStart";
    }

    @Override // X.C0N0Y
    public final String LJJLIIIJJIZ(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i) {
        return LJLLI(video, z, onUIPlayListener, i);
    }

    public final String LJLLI(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i) {
        return LJJJJJL(video, z, onUIPlayListener, i, null, null, false, false, null, EnumC2281141EQm.Undefine, "");
    }

    @Override // X.C0N0Y
    public final String LJJZ(Video video, boolean z, int i, boolean z2, HashMap map) {
        return LJLJLJ(video, null, z, true, i, true, true, null, null, z2, map, EnumC2281141EQm.Undefine, "");
    }

    @Override // X.C0N0Y
    public final String LJJLIIIIJ(Video video, Audio audio, boolean z, boolean z2, int i, boolean z3, boolean z4, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7) {
        return LJLJLJ(video, audio, z, z2, i, z3, z4, c581750Mrl, c1479890oc7, false, null, EnumC2281141EQm.Undefine, "");
    }

    @Override // X.C0N0Y
    public final String LJJJJIZL(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i, boolean z2, HashMap map, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7, EnumC2281141EQm enumC2281141EQm, String str) {
        return LJJJJJL(video, z, onUIPlayListener, i, c581750Mrl, c1479890oc7, false, z2, map, enumC2281141EQm, str);
    }

    @Override // X.C0N0Y
    public final String LJJJJJL(Video video, boolean z, OnUIPlayListener onUIPlayListener, int i, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7, boolean z2, boolean z3, HashMap map, EnumC2281141EQm enumC2281141EQm, String str) {
        String sourceId;
        String sourceId2;
        int i2 = i;
        LJLJL();
        if (C08MG.LIZ("tryResumePlay")) {
            return "101";
        }
        String strLIZIZ = C1481060oe0.LIZIZ(video);
        if (InterfaceC1481090oe3.LIZ) {
            C1481030odx.LIZJ("PlayerManager", "tryResumePlay aid:" + strLIZIZ);
        }
        this.LJIIJJI.LIZ();
        if (onUIPlayListener == null) {
            return "102";
        }
        if (!((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJLJI(onUIPlayListener)) {
            return "103";
        }
        if (video == null) {
            return "104";
        }
        VideoUrlModel playAddrBytevc1 = video.getPlayAddrBytevc1();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrBytevc1 == null && playAddrH264 == null && ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZLLL == null) {
            return "105";
        }
        if (z2) {
            i2 = 0;
        } else if (i2 <= 0) {
            if (LJIILJJIL(((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZLLL)) {
                ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ.LJJLIIIIJ(((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZLLL.LJ);
                C583420MuS.LIZJ(strLIZIZ, C0RRP.RESUME);
                this.LIZIZ = false;
                return "107";
            }
            if (!LJIIJJI(playAddrBytevc1) && !LJIIJJI(playAddrH264)) {
                if (this.LJ) {
                    this.LJ = false;
                    if (playAddrBytevc1 != null) {
                        sourceId2 = playAddrBytevc1.getSourceId();
                    } else {
                        sourceId2 = playAddrH264.getSourceId();
                    }
                    LJLJLJ(video, null, z, true, (int) LJLIIL(sourceId2).LIZ, false, true, c581750Mrl, c1479890oc7, z3, map, enumC2281141EQm, str);
                    return "";
                }
                LJLJLJ(video, null, z, true, 0, true, true, c581750Mrl, c1479890oc7, z3, map, enumC2281141EQm, str);
                return "";
            }
            InterfaceC1479560oba interfaceC1479560oba = ((C650730Pfj) this.LIZ.getLegacy()).LIZ.LIZIZ;
            if (playAddrBytevc1 != null) {
                sourceId = playAddrBytevc1.getSourceId();
            } else {
                sourceId = playAddrH264.getSourceId();
            }
            interfaceC1479560oba.LJJLIIIIJ(sourceId);
            C583420MuS.LIZJ(strLIZIZ, C0RRP.RESUME);
            this.LIZIZ = false;
            return "108";
        }
        LJLJLJ(video, null, z, true, i2, true, true, c581750Mrl, c1479890oc7, z3, map, enumC2281141EQm, str);
        return "106";
    }

    public final String LJLJLJ(Video video, Audio audio, boolean z, boolean z2, int i, boolean z3, boolean z4, C581750Mrl c581750Mrl, C1479890oc7 c1479890oc7, boolean z5, HashMap map, EnumC2281141EQm enumC2281141EQm, String str) {
        boolean z6;
        boolean z7;
        EnumC603220NlI enumC603220NlI;
        if (video == null) {
            return null;
        }
        C2407009bw.LIZ();
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        if (InterfaceC1481090oe3.LIZ) {
            C1481030odx.LIZJ("PlayerManager", "tryPlayWithInitialStart aid:" + C1481060oe0.LIZIZ(video));
        }
        video.getAid();
        new WeakReference(this);
        if (!LJLJJL(video) && !((Boolean) C290360BZq.LIZ.getValue()).booleanValue()) {
            z6 = false;
        } else {
            z6 = true;
        }
        C1479720obq c1479720obq = new C1479720obq();
        SimVideo simVideoLJI = C1481230oeH.LJI(video);
        C1479530obX c1479530obX = c1479720obq.LIZ;
        c1479530obX.LIZLLL = simVideoLJI;
        c1479530obX.LJIIJ = z2;
        if (this.LJFF.LJ == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        c1479530obX.LJJIFFI = z7;
        c1479530obX.LJIIJJI = i;
        c1479530obX.LJIJI = z3;
        boolean zIsNeedSetCookie = video.isNeedSetCookie();
        C1479530obX c1479530obX2 = c1479720obq.LIZ;
        c1479530obX2.LJIL = zIsNeedSetCookie;
        c1479530obX2.LJJIJL = z6;
        c1479530obX2.LJIJJ = z4;
        c1479720obq.LIZJ(str);
        List<C1476750oX3> listConvertToSimAudio = Audio.convertToSimAudio(video, audio, "PlayInitial", C1481060oe0.LIZIZ(video));
        C1479530obX c1479530obX3 = c1479720obq.LIZ;
        c1479530obX3.LJ = listConvertToSimAudio;
        c1479530obX3.LJFF = c1479890oc7;
        c1479530obX3.LJJJJZ = false;
        if (this.LJIIIZ == video) {
            enumC603220NlI = EnumC603220NlI.COLD_START;
        } else {
            enumC603220NlI = EnumC603220NlI.CLICK;
        }
        String strName = enumC603220NlI.name();
        C1479530obX c1479530obX4 = c1479720obq.LIZ;
        c1479530obX4.LJJLIIIJJIZ = strName;
        c1479530obX4.LJJLIIIJLJLI = false;
        c1479720obq.LIZ.LJJLIIIJL = lValueOf.longValue();
        LoudnessStrategyConfig loudnessStrategyConfig = C588910N7x.LJ;
        Future<Float> futureLIZ = C584180Mvg.LIZ.LIZ(C1481060oe0.LIZIZ(video));
        C1479530obX c1479530obX5 = c1479720obq.LIZ;
        c1479530obX5.LJJLIIIJ = futureLIZ;
        if (c581750Mrl != null) {
            c1479530obX5.LJJJI = c581750Mrl.LIZLLL;
            c1479530obX5.LJJJIL = c581750Mrl.LIZ;
            c1479530obX5.LJJJJ = c581750Mrl.LIZIZ;
            c1479530obX5.LJJJJI = c581750Mrl.LIZJ;
            c1479530obX5.LJJJJIZL = c581750Mrl.LJ;
            c1479720obq.LIZ.LJJJJJ = C1481230oeH.LIZ(c581750Mrl.LJFF, video.getPb2AwemeMillis());
        }
        C1EE1.LIZIZ.LJJIZ();
        if (z5) {
            C1479530obX c1479530obX6 = c1479720obq.LIZ;
            c1479530obX6.LJJL = z5;
            c1479530obX6.LJJJJZI = map;
        }
        if (z) {
            C1479530obX c1479530obX7 = c1479720obq.LIZ;
            c1479530obX7.LJIILJJIL = null;
            c1479530obX7.LJJJLL = false;
        }
        if (((Boolean) C585810MyJ.LIZJ.getValue()).booleanValue()) {
            c1479720obq.LIZ.LJLJI = true;
        }
        if (enumC2281141EQm != EnumC2281141EQm.Undefine) {
            c1479720obq.LIZ.LJLJJLL = enumC2281141EQm;
        }
        C2413309cx.LIZ(new C2188251AkZ());
        this.LIZ.LJ(new C691760RBm(c1479720obq.LIZ()));
        C583420MuS.LIZJ(C1481060oe0.LIZIZ(video), C0RRP.P_T_P_W_I_START_1);
        if (!C1486210omJ.LIZIZ()) {
            LJIILL = true;
            return "";
        }
        return "";
    }
}
