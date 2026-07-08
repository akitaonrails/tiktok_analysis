package X;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Toi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758220Toi {
    public final int LIZ;
    public final List<Long> LIZIZ;
    public final List<Long> LIZJ;
    public final List<Long> LIZLLL;
    public final List<Pair<String, String>> LJ;

    public static C758220Toi LIZ(C758220Toi c758220Toi, int i) {
        return new C758220Toi(i, c758220Toi.LIZIZ, c758220Toi.LIZJ, c758220Toi.LIZLLL, c758220Toi.LJ);
    }

    public /* synthetic */ C758220Toi(int i, List list, List list2, List list3, int i2) {
        this(i, (List<Long>) ((i2 & 2) != 0 ? null : list), (List<Long>) null, (List<Long>) ((i2 & 8) != 0 ? null : list2), (List<Pair<String, String>>) ((i2 & 16) != 0 ? null : list3));
    }

    public C758220Toi(int i, List<Long> list, List<Long> list2, List<Long> list3, List<Pair<String, String>> list4) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
        this.LJ = list4;
    }
}
