package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.performance.AutoMusicDiskCacheOpt;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Kw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533510Kw9 {
    public static volatile long LJ;
    public static List<? extends MusicModel> LJFF;
    public static final C533510Kw9 LIZ = new C533510Kw9();
    public static final ReentrantLock LIZIZ = new ReentrantLock();
    public static final Map<Long, List<MusicModel>> LIZJ = new LinkedHashMap();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(514));

    public static List LIZLLL() {
        Object c098200Yq;
        String musicId;
        MusicModel musicModel;
        try {
            String string = LIZJ().getString("auto_music_disk_cache_data", null);
            if (string == null || a0.LJJJIL(string)) {
                c098200Yq = null;
            } else {
                C1227904rF.LIZ.getClass();
                c098200Yq = Collections.singletonList((MusicModel) C1227904rF.LIZIZ(string, MusicModel.class));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        List<? extends MusicModel> list = (List) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (list == null || (musicModel = (MusicModel) C13LP.LJJJLL(list)) == null || (musicId = musicModel.getMusicId()) == null) {
            musicId = "NULL";
        }
        C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", "autoMusicDiskCache getDiskCache : musicCache: ".concat(musicId));
        LJFF = list;
        return list;
    }

    public static void LIZIZ() {
        ReentrantLock reentrantLock = LIZIZ;
        reentrantLock.lock();
        try {
            ((LinkedHashMap) LIZJ).clear();
            LJ = 0L;
            LIZLLL.set(false);
            reentrantLock.unlock();
            C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", "useCacheAndClear");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static Keva LIZJ() {
        return (Keva) LJI.getValue();
    }

    public static boolean LIZ() {
        if (!C255900A1c.LIZ()) {
            return false;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - LJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkMusicCacheValid cost:");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", goal:");
        sbLIZ.append(C283100B7s.LIZ());
        C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        if (LJ > 0 && jCurrentTimeMillis < C283100B7s.LIZ()) {
            return true;
        }
        if (LJ <= 0) {
            return false;
        }
        LIZIZ();
        C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", "checkMusicCacheValid  cache is invalid and clear");
        return false;
    }

    public static List LJ() {
        if (LIZ()) {
            Map<Long, List<MusicModel>> map = LIZJ;
            if (!map.isEmpty()) {
                return (List) C13LP.LJJJLIIL(((LinkedHashMap) map).values());
            }
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isNotNeedPreRequestMusic the time has exceeded the set threshold :");
        sbLIZ.append(C283100B7s.LIZ());
        C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public static void LJI(Long l) {
        if (!C255900A1c.LIZ()) {
            return;
        }
        if (l == null) {
            C201955140j.LJFF("AIMusicPreRequestCacheManager", "useCacheAndClear musicId is null");
            return;
        }
        boolean zContainsKey = LIZJ.containsKey(l);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1341705Mx(l, zContainsKey, null), 2);
        LIZIZ();
        if (!zContainsKey) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("useCacheAndClear musicId:");
            sbLIZ.append(l);
            C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJFF(long j, List list) {
        MusicModel musicModel;
        if (!C255900A1c.LIZ()) {
            return;
        }
        ReentrantLock reentrantLock = LIZIZ;
        reentrantLock.lock();
        try {
            Map<Long, List<MusicModel>> map = LIZJ;
            ((LinkedHashMap) map).clear();
            map.put(Long.valueOf(j), list);
            LIZLLL.set(false);
            LJ = System.currentTimeMillis();
            if (AutoMusicDiskCacheOpt.LIZ() && list != null && (musicModel = (MusicModel) C13LP.LJJJLL(list)) != null) {
                LIZ.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C527620Kme(musicModel, null), 3);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setCache id:");
            sbLIZ.append(j);
            sbLIZ.append(", musicList:");
            sbLIZ.append(list);
            C201955140j.LJIILIIL("AIMusicPreRequestCacheManager", C2188811AlT.LIZIZ(sbLIZ));
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(Long l, Activity activity) {
        LJI(l);
        if (C290920Bak.LIZ() && activity != 0 && (activity instanceof C19EG)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), C0PEM.LIZJ, null, new C526800KlK(new WeakReference(activity), l, null), 2);
        }
    }
}
