package X;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0tes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673800tes {
    public final String LIZ;
    public final String LIZIZ;
    public final List<Pair<String, String>> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final boolean LJI;
    public final int LJII;

    public static C1673800tes LIZ(C1673800tes c1673800tes, List list, int i, int i2) {
        String str;
        String str2;
        String str3;
        boolean z;
        int i3;
        int i4 = i;
        List list2 = list;
        String str4 = null;
        if ((i2 & 1) != 0) {
            str = c1673800tes.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = c1673800tes.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            list2 = c1673800tes.LIZJ;
        }
        if ((i2 & 8) != 0) {
            str3 = c1673800tes.LIZLLL;
        } else {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            str4 = c1673800tes.LJ;
        }
        if ((i2 & 32) != 0) {
            i4 = c1673800tes.LJFF;
        }
        if ((i2 & 64) != 0) {
            z = c1673800tes.LJI;
        } else {
            z = false;
        }
        if ((i2 & 128) != 0) {
            i3 = c1673800tes.LJII;
        } else {
            i3 = 0;
        }
        c1673800tes.getClass();
        return new C1673800tes(i4, i3, str, str2, str3, str4, list2, z);
    }

    public C1673800tes(int i, int i2, String str, String str2, String str3, String str4, List list, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = i;
        this.LJI = z;
        this.LJII = i2;
    }
}
