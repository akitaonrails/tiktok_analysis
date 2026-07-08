package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0t42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650960t42 {
    public static final /* synthetic */ int LJII = 0;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C1650990t45 LIZ = new C1650990t45();
    public final List<CharSequence> LIZLLL = new ArrayList();
    public String LJ = "";
    public final HashMap<Integer, String> LJFF = new HashMap<>();
    public final HashMap<Integer, String> LJI = new HashMap<>();

    public final String LIZ(int i) {
        HashMap<Integer, String> map = this.LJFF;
        Integer numValueOf = Integer.valueOf(i);
        String strLJI = map.get(numValueOf);
        if (strLJI == null) {
            strLJI = C20642515q3.LJI(i);
            map.put(numValueOf, strLJI);
        }
        return strLJI;
    }

    public final String LIZIZ(int i) {
        HashMap<Integer, String> map = this.LJI;
        Integer numValueOf = Integer.valueOf(i);
        String strLIZ = map.get(numValueOf);
        if (strLIZ == null) {
            if (i > 0) {
                strLIZ = C1356620lPI.LIZ(LIZ(2131823333), C2097908Jt.LIZJ(new Pair("number", String.valueOf(i))));
            } else {
                strLIZ = null;
            }
            map.put(numValueOf, strLIZ);
        }
        return strLIZ;
    }
}
