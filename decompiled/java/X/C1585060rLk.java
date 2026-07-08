package X;

import com.ss.android.ugc.aweme.experiment.Candidate;
import com.ss.android.ugc.aweme.experiment.Entrance;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585060rLk {
    public static int LIZ() {
        List<Candidate> list;
        Candidate candidate;
        List<Candidate> list2;
        if (!C343780Ddo.LIZIZ()) {
            return C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "tt_story_tabicon_corner_position", true);
        }
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.STORY;
        c1585070rLl.getClass();
        if (!C1585070rLl.LJ(enumC1584360rKc) && !C1585070rLl.LJ(EnumC1584360rKc.STORY_CAMERA)) {
            return 0;
        }
        EnumC1584360rKc enumC1584360rKc2 = EnumC1584360rKc.TOP_LIVE;
        C0CXN.LIZ.getClass();
        TabConfig tabConfigLIZJ = C0CXN.LIZJ();
        if (Intrinsics.LJFF(tabConfigLIZJ.isJsonIllegal, Boolean.TRUE)) {
            for (EnumC1584360rKc enumC1584360rKc3 : C1584300rKW.LIZIZ) {
                if (Intrinsics.LJFF(enumC1584360rKc3.getKey(), enumC1584360rKc2.getKey())) {
                    new Candidate(enumC1584360rKc3.getKey(), null, null, null);
                    return 1;
                }
            }
        } else {
            Entrance entrance = tabConfigLIZJ.rightEntrance;
            if (entrance != null && (list2 = entrance.candidates) != null) {
                for (Candidate candidate2 : list2) {
                    if (Intrinsics.LJFF(candidate2.entranceKey, enumC1584360rKc2.getKey()) || Intrinsics.LJFF(candidate2.itemKey, enumC1584360rKc2.getKey())) {
                        return 1;
                    }
                }
            }
        }
        C1585070rLl c1585070rLl2 = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc4 = EnumC1584360rKc.TOP_LIVE;
        c1585070rLl2.getClass();
        C0CXN.LIZ.getClass();
        TabConfig tabConfigLIZJ2 = C0CXN.LIZJ();
        if (Intrinsics.LJFF(tabConfigLIZJ2.isJsonIllegal, Boolean.TRUE)) {
            Iterator<Map.Entry<String, List<String>>> it2 = C1584300rKW.LIZJ.entrySet().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getKey(), enumC1584360rKc4.getKey())) {
                    return 5;
                }
            }
            return 4;
        }
        Entrance entrance2 = tabConfigLIZJ2.leftEntrance;
        if (entrance2 == null || (list = entrance2.candidates) == null || (candidate = (Candidate) C13LP.LJJJLL(list)) == null) {
            return 4;
        }
        return (Intrinsics.LJFF(candidate.entranceKey, enumC1584360rKc4.getKey()) || Intrinsics.LJFF(candidate.itemKey, enumC1584360rKc4.getKey())) ? 5 : 4;
    }

    public static boolean LIZIZ() {
        return LIZ() > 0;
    }

    public static boolean LIZJ() {
        return LIZ() == 4 || LIZ() == 5;
    }

    public static boolean LIZLLL() {
        return LIZ() == 5;
    }
}
