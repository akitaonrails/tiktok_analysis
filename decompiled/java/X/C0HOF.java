package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HOF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HOF {
    public static C0HOE LIZ(C0HOM c0hom, String str) {
        if (!(c0hom instanceof C1372405Ys)) {
            return C0HOE.SA_SELF;
        }
        C0HOE c0hoe = null;
        for (C440440HOw c440440HOw : (List) ((C1372405Ys) c0hom).LIZIZ) {
            int i = c440440HOw.LJ;
            if (i != 0) {
                if (i == 1) {
                    if (c0hoe == null) {
                        if (Intrinsics.LJFF(c440440HOw.LIZJ, str)) {
                            c0hoe = C0HOE.AISELF_SELF;
                        } else {
                            c0hoe = C0HOE.AISELF_MUF;
                        }
                    } else {
                        c0hoe = C0HOE.SA_MIXED;
                    }
                }
            } else if (c0hoe == null) {
                if (Intrinsics.LJFF(c440440HOw.LIZJ, str)) {
                    c0hoe = C0HOE.SA_SELF;
                } else {
                    c0hoe = C0HOE.SA_MUF;
                }
            } else {
                c0hoe = C0HOE.SA_MIXED;
            }
        }
        return c0hoe;
    }
}
