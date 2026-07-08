package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0DQP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQP {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, Object> LJ;
    public final List<String> LJFF;
    public final C0DQN LJI;
    public final ArrayList<String> LJII;

    public final List<Aweme> LIZ() {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        for (String str : this.LJII) {
            C651640PhC.LIZIZ.getClass();
            if (C651640PhC.LJI().containsKey(str)) {
                Map mapLJI = C651640PhC.LJI();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('-');
                sbLIZ.append(this.LIZIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Aweme aweme = (Aweme) C651640PhC.LJI().get(str);
                mapLJI.put(strLIZIZ, aweme != null ? aweme.m199clone() : null);
            }
            Map mapLJI2 = C651640PhC.LJI();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append('-');
            sbLIZ2.append(this.LIZIZ);
            Object obj = mapLJI2.get(C2188811AlT.LIZIZ(sbLIZ2));
            if (obj != null || (obj = C651640PhC.LJI().get(str)) != null) {
                c13dvLIZIZ.add(obj);
            }
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    public C0DQP(String str, String str2, String str3, String str4, Map<String, ? extends Object> map, List<String> list, C0DQN c0dqn) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = map;
        this.LJFF = list;
        this.LJI = c0dqn;
        this.LJII = new ArrayList<>(list);
    }
}
