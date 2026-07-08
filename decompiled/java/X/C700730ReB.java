package X;

import java.util.List;

/* JADX INFO: renamed from: X.0ReB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700730ReB {
    public final List<String> LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;

    public C700730ReB(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = list4;
        this.LJ = list5;
    }

    public static C700730ReB LIZ(C700730ReB c700730ReB, List list, List list2, List list3, List list4, List list5, int i) {
        List list6 = list5;
        List list7 = list4;
        List list8 = list3;
        List list9 = list2;
        List list10 = list;
        if ((i & 1) != 0) {
            list10 = c700730ReB.LIZ;
        }
        if ((i & 2) != 0) {
            list9 = c700730ReB.LIZIZ;
        }
        if ((i & 4) != 0) {
            list8 = c700730ReB.LIZJ;
        }
        if ((i & 8) != 0) {
            list7 = c700730ReB.LIZLLL;
        }
        if ((i & 16) != 0) {
            list6 = c700730ReB.LJ;
        }
        c700730ReB.getClass();
        return new C700730ReB(list10, list9, list8, list7, list6);
    }
}
