package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403130mcJ {
    public static final /* synthetic */ int LIZ = 0;

    public static final AutoCutThemeData LIZJ(CreativeModel creativeModel) {
        return C1416110mxF.LIZJ(creativeModel.autoCutModel);
    }

    public static final Pair LIZ(int i, List list) {
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(i, list);
        if (autoCutThemeData == null) {
            return new Pair(-1, null);
        }
        return new Pair(Integer.valueOf(autoCutThemeData.indexFromSource), autoCutThemeData.LIZIZ());
    }

    public static final int LIZIZ(List<AutoCutThemeData> list, int i, C0MJ9 c0mj9) {
        int i2 = 0;
        for (AutoCutThemeData autoCutThemeData : list) {
            if (autoCutThemeData.indexFromSource == i && autoCutThemeData.LIZIZ() == c0mj9) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final int LIZLLL(List<AutoCutThemeData> list, int i, C0MJ9 c0mj9) {
        AutoCutThemeData autoCutThemeDataLJ = LJ(list, i, c0mj9);
        if (autoCutThemeDataLJ != null && autoCutThemeDataLJ.category != null) {
            int i2 = 0;
            for (AutoCutThemeData autoCutThemeData : list) {
                if (Intrinsics.LJFF(autoCutThemeData, autoCutThemeDataLJ)) {
                    break;
                }
                if (Intrinsics.LJFF(autoCutThemeData.category, autoCutThemeDataLJ.category)) {
                    i2++;
                }
            }
            return i2;
        }
        return LIZIZ(list, i, c0mj9);
    }

    public static final AutoCutThemeData LJ(List<AutoCutThemeData> list, int i, C0MJ9 c0mj9) {
        AutoCutThemeData next;
        Iterator<AutoCutThemeData> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                AutoCutThemeData autoCutThemeData = next;
                if (autoCutThemeData.indexFromSource == i && autoCutThemeData.LIZIZ() == c0mj9) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }
}
