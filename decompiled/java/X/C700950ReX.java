package X;

import java.util.List;

/* JADX INFO: renamed from: X.0ReX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700950ReX {
    public static final /* synthetic */ int LJFF = 0;
    public final List<C700970ReZ> LIZ;
    public final List<C700970ReZ> LIZIZ;
    public final List<C700970ReZ> LIZJ;
    public final List<C700970ReZ> LIZLLL;
    public AbstractC701310Rf7 LJ;

    public /* synthetic */ C700950ReX(List list, List list2, List list3, List list4) {
        this(list, list2, list3, list4, null);
    }

    public C700950ReX(List<C700970ReZ> list, List<C700970ReZ> list2, List<C700970ReZ> list3, List<C700970ReZ> list4, AbstractC701310Rf7 abstractC701310Rf7) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = list4;
        this.LJ = abstractC701310Rf7;
    }

    public static C700950ReX LIZ(C700950ReX c700950ReX, List list, List list2, List list3, List list4, int i) {
        AbstractC701310Rf7 abstractC701310Rf7;
        List list5 = list4;
        List list6 = list3;
        List list7 = list2;
        List list8 = list;
        if ((i & 1) != 0) {
            list8 = c700950ReX.LIZ;
        }
        if ((i & 2) != 0) {
            list7 = c700950ReX.LIZIZ;
        }
        if ((i & 4) != 0) {
            list6 = c700950ReX.LIZJ;
        }
        if ((i & 8) != 0) {
            list5 = c700950ReX.LIZLLL;
        }
        if ((i & 16) != 0) {
            abstractC701310Rf7 = c700950ReX.LJ;
        } else {
            abstractC701310Rf7 = null;
        }
        return new C700950ReX(list8, list7, list6, list5, abstractC701310Rf7);
    }
}
