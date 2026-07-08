package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14aX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20291514aX {
    public static final C20291514aX LIZ = new C20291514aX();
    public static final C20293414aq LIZIZ = new C20293414aq("frequency");
    public static final Keva LIZJ;
    public static int LIZLLL;
    public static final HashSet<String> LJ;
    public static final CopyOnWriteArrayList<C20292814ak> LJFF;

    static {
        Keva repo = Keva.getRepo("repo_multi_survey");
        LIZJ = repo;
        long j = repo.getLong("key_last_day_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - j;
        int i = 1;
        if (j2 < 86400000 && j2 > -86400000 && (jCurrentTimeMillis + ((long) TimeZone.getDefault().getOffset(jCurrentTimeMillis))) / 86400000 == (j + ((long) TimeZone.getDefault().getOffset(j))) / 86400000) {
            i = 1 + repo.getInt("key_day_aweme_count", 0);
        }
        LIZLLL = i;
        LJ = new HashSet<>();
        LJFF = new CopyOnWriteArrayList<>();
    }

    public static List LIZ() {
        int i;
        CopyOnWriteArrayList<C20292814ak> copyOnWriteArrayList = LJFF;
        ArrayList arrayList = new ArrayList();
        for (C20292814ak c20292814ak : copyOnWriteArrayList) {
            C20292814ak c20292814ak2 = c20292814ak;
            int i2 = c20292814ak2.LIZIZ;
            if (i2 > 0 && (i = c20292814ak2.LIZ) >= 0 && i == ((int) ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 86400))) % i2) {
                arrayList.add(c20292814ak);
            }
        }
        return arrayList;
    }

    public static boolean LIZIZ(Aweme aweme) {
        FeedSurveyConfig feedSurveyConfig;
        int i;
        int i2;
        C14ZW.LIZ.getClass();
        C14ZG c14zgLJI = C14ZW.LJI(aweme);
        if (c14zgLJI != null && (feedSurveyConfig = c14zgLJI.LJI) != null && (i = feedSurveyConfig.turnsGroupCount) > 0 && (i2 = feedSurveyConfig.turnsGroupId) >= 0 && i2 == ((int) ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 86400))) % i) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme, boolean z) {
        int i;
        FeedSurveyConfig feedSurveyConfig;
        Object next;
        if (z) {
            i = LIZLLL + 1;
        } else {
            i = LIZLLL;
        }
        C14ZW.LIZ.getClass();
        C14ZG c14zgLJI = C14ZW.LJI(aweme);
        if (c14zgLJI == null || (feedSurveyConfig = c14zgLJI.LJI) == null) {
            return false;
        }
        Iterator it2 = ((ArrayList) LIZ()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C20292814ak) next).LIZJ, feedSurveyConfig)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C20292814ak c20292814ak = (C20292814ak) next;
        if (c20292814ak == null) {
            return false;
        }
        if (i < c20292814ak.LIZLLL || i >= c20292814ak.LJ) {
            return true;
        }
        return false;
    }
}
