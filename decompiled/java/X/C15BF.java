package X;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15BF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BF {
    public final String LIZ;
    public final String LIZIZ;
    public final Pair<Integer, Integer> LIZJ;
    public final Pair<Integer, Integer> LIZLLL;
    public final List<String> LJ;
    public final C20345814jI LJFF;
    public final C20345714jH LJI;

    public C15BF(String str, String str2, Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, List<String> list, C20345814jI c20345814jI, C20345714jH c20345714jH) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = pair;
        this.LIZLLL = pair2;
        this.LJ = list;
        this.LJFF = c20345814jI;
        this.LJI = c20345714jH;
    }

    public C15BF(String str, String str2, Pair pair, Pair pair2, List list, C20345814jI c20345814jI, int i) {
        this(str, str2, (Pair<Integer, Integer>) pair, (Pair<Integer, Integer>) pair2, (List<String>) list, (i & 32) != 0 ? C20345814jI.LIZJ : c20345814jI, (C20345714jH) null);
    }
}
