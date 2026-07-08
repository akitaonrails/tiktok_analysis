package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.video.experiment.TTPlayerViewedVideoHistory;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Mvn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584250Mvn {
    public static final Keva LIZ = Keva.getRepo("vod_playback_history");
    public static final Keva LIZIZ = Keva.getRepo("vod_playback_watch_duration");
    public static final Map<String, Long> LIZJ = new LinkedHashMap();
    public static final ReentrantReadWriteLock LIZLLL = new ReentrantReadWriteLock();
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public static boolean LJFF;
    public static String LJI;

    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Object] */
    public static void LIZ(final C0N0Y c0n0y, final String str) {
        int i;
        if (str != null && str.length() != 0 && c0n0y != null) {
            C01GW c01gw = TTPlayerViewedVideoHistory.LIZIZ;
            TTPlayerViewedVideoHistory.PlaybackHistoryConfig playbackHistoryConfig = (TTPlayerViewedVideoHistory.PlaybackHistoryConfig) c01gw.getValue();
            if (playbackHistoryConfig != null && playbackHistoryConfig.enableHistory) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final C259800zU c259800zU = new C259800zU();
                ReentrantReadWriteLock reentrantReadWriteLock = LIZLLL;
                reentrantReadWriteLock.readLock().lock();
                LJI = str;
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                Map<String, Long> map = LIZJ;
                map.put(str, lValueOf);
                int size = map.size();
                TTPlayerViewedVideoHistory.PlaybackHistoryConfig playbackHistoryConfig2 = (TTPlayerViewedVideoHistory.PlaybackHistoryConfig) c01gw.getValue();
                if (playbackHistoryConfig2 != null) {
                    i = playbackHistoryConfig2.maxHistoryCount;
                } else {
                    i = 100;
                }
                if (size > i) {
                    ?? LJJJJZ = C13LP.LJJJJZ(((LinkedHashMap) map).keySet());
                    c259800zU.element = LJJJJZ;
                    map.remove(LJJJJZ);
                }
                reentrantReadWriteLock.readLock().unlock();
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.05Fl
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PlaybackHistoryManager@a84c.add$1");
                        try {
                            Keva keva = C584250Mvn.LIZ;
                            keva.storeLong(str, jCurrentTimeMillis);
                            String str2 = c259800zU.element;
                            if (str2 != null) {
                                keva.erase(str2);
                                C584250Mvn.LIZIZ.erase(c259800zU.element);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PlaybackHistoryManager@a84c.add$1");
                    }
                });
                BPEAHandler bPEAHandler = LJ;
                bPEAHandler.removeCallbacksAndMessages(null);
                C786410Ut5.LJLIIL(2000L, bPEAHandler, new Runnable() { // from class: X.0Mts
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PlaybackHistoryManager@a84c.add$2");
                        try {
                            Keva keva = C584250Mvn.LIZ;
                            final String str2 = str;
                            final C0N0Y c0n0y2 = (C0N0Y) new WeakReference(c0n0y).get();
                            if (str2 != null && str2.length() != 0 && c0n0y2 != null) {
                                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0Mtr
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ2;
                                        C1C7U.LIZ("PlaybackHistoryManager@a84c.updateCurrentVideoWatchDuration$1");
                                        try {
                                            Keva keva2 = C584250Mvn.LIZ;
                                            C584250Mvn.LIZIZ(c0n0y2, str2);
                                        } finally {
                                            if (!zLIZ2) {
                                            }
                                        }
                                        C1C7U.LIZIZ("PlaybackHistoryManager@a84c.updateCurrentVideoWatchDuration$1");
                                    }
                                });
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PlaybackHistoryManager@a84c.add$2");
                    }
                });
            }
        }
    }

    public static void LIZIZ(C0N0Y c0n0y, String str) {
        TTPlayerViewedVideoHistory.PlaybackHistoryConfig playbackHistoryConfig;
        if (str != null && str.length() != 0 && c0n0y != null && (playbackHistoryConfig = (TTPlayerViewedVideoHistory.PlaybackHistoryConfig) TTPlayerViewedVideoHistory.LIZIZ.getValue()) != null && playbackHistoryConfig.enableHistory) {
            String str2 = LJI;
            if ((str2 == null || u.LJIJI(str2, str, false)) && c0n0y.LJLIIIL() > 0) {
                LIZIZ.storeLong(str, c0n0y.LJLIIIL());
                C1322105Fj c1322105Fj = C1322105Fj.LLILLJJLI;
                c1322105Fj.getClass();
                C23250099c.LIZLLL(c1322105Fj, null, null, new C1321905Fh(str, null), 3);
            }
        }
    }
}
