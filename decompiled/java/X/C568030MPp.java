package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.creative.model.forward.SimpleAweme;
import com.ss.android.ugc.aweme.story.celebration.CelebrationExtraParams;
import com.ss.android.ugc.aweme.story.celebration.CelebrationRenderedVideo;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data.CelebrationMaterialData;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data.RecentCelebrationData;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568030MPp {
    public static RecentCelebrationData LJ;
    public static final C568030MPp LIZ = new C568030MPp();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(344));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(343));
    public static String LIZLLL = "";
    public static final HashMap<String, CelebrationExtraParams> LJFF = new HashMap<>();
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2867));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(342));

    public static long LIZJ() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static Keva LJIIIIZZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZIZ() {
        String strValueOf = String.valueOf(LIZJ());
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CeleMaterialKeva, generateTodayUniqueNum: key = ");
        sbLIZ.append(strValueOf);
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        return strValueOf;
    }

    public static List LJIIJ() {
        LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), LIZIZ());
        RecentCelebrationData recentCelebrationData = LJ;
        if (recentCelebrationData != null) {
            return recentCelebrationData.getTodayCelebration();
        }
        return null;
    }

    public static Keva LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("celebration_material_aweme_cache_");
        sbLIZ.append(str);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Keva LJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("celebration_material_");
        sbLIZ.append(str);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Keva LJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("celebration_render_video_");
        sbLIZ.append(str);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(String str, String str2) {
        boolean z;
        String date;
        Object c098200Yq;
        RecentCelebrationData recentCelebrationData = LJ;
        if (recentCelebrationData == null) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (recentCelebrationData != null) {
            date = recentCelebrationData.getDate();
        } else {
            date = null;
        }
        boolean z2 = !Intrinsics.LJFF(str2, date);
        if (!Intrinsics.LJFF(str, LIZLLL) || z2) {
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CeleMaterialKevaensureCacheRecentCeleData: read from keva, isDateChanged = ");
            sbLIZ.append(z2);
            C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            LIZLLL = str;
            String string = LJIIIIZZ().getString(str, null);
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = C1227904rF.LIZIZ(string, RecentCelebrationData.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            RecentCelebrationData recentCelebrationData2 = (RecentCelebrationData) obj;
            if (recentCelebrationData2 != null) {
                if (z2 && !z) {
                    recentCelebrationData2.setDate(str2);
                    recentCelebrationData2.setTodayCelebration(new ArrayList());
                    recentCelebrationData2.setReadyCelebration(new ArrayList());
                }
            } else {
                recentCelebrationData2 = new RecentCelebrationData(null, null, null, new ConcurrentHashMap(), str2, "", null);
            }
            LJ = recentCelebrationData2;
        }
    }

    public static List LJ(int i, String str) {
        Object obj;
        if (str == null) {
            return new ArrayList();
        }
        Keva kevaLIZLLL = LIZLLL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme_cache_time_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(i);
        Object obj2 = null;
        if (System.currentTimeMillis() > kevaLIZLLL.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L)) {
            return null;
        }
        try {
            Type type = new TypeToken<List<? extends SimpleAweme>>() { // from class: X.04Za
            }.getType();
            String string = kevaLIZLLL.getString(String.valueOf(i), "");
            C1227904rF.LIZ.getClass();
            List list = (List) C1227904rF.LIZJ(string, type);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C568110MPx.LIZ((SimpleAweme) it2.next()));
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (List) obj2;
    }

    public static CelebrationMaterialData LJFF(int i, String str) {
        Object c098200Yq;
        if (str == null) {
            str = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        }
        Object obj = null;
        String string = LJI(str).getString(String.valueOf(i), null);
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LIZIZ(string, CelebrationMaterialData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (CelebrationMaterialData) obj;
    }

    public static CelebrationRenderedVideo LJIIIZ(C568030MPp c568030MPp, int i) {
        Object c098200Yq;
        boolean z;
        c568030MPp.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        c568030MPp.getClass();
        Object obj = null;
        String string = LJII(curUserId).getString(String.valueOf(i), null);
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = C1227904rF.LIZIZ(string, CelebrationRenderedVideo.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        CelebrationRenderedVideo celebrationRenderedVideo = (CelebrationRenderedVideo) obj;
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sb = new StringBuilder("CeleMaterialKeva, getRenderVideoInfo for celebrationType: ");
        sb.append(i);
        sb.append(", hasVideo: ");
        if (celebrationRenderedVideo != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C201955140j.LIZJ(c554890LpX, sb.toString());
        return celebrationRenderedVideo;
    }
}
