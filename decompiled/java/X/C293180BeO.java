package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0BeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293180BeO {
    public static final ConcurrentHashMap<String, C293180BeO> LJ = new ConcurrentHashMap<>();
    public static final C01GW<InterfaceC307670C4f> LJFF = C452501pT.LIZIZ(new C293170BeN());
    public final String LIZ;
    public volatile String LIZIZ;
    public volatile C293230BeT LIZJ;
    public final C01GW LIZLLL;

    public final C293230BeT LIZIZ() {
        String strLJI = C292560BdO.LJI();
        if (!Intrinsics.LJFF(this.LIZIZ, strLJI)) {
            this.LIZIZ = strLJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('{');
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("__extra_for_");
            sbLIZ2.append(this.LIZ);
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            sbLIZ.append("}_{");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append('}');
            this.LIZJ = new C293230BeT(new C293200BeQ(C2188811AlT.LIZIZ(sbLIZ)));
        }
        return this.LIZJ;
    }

    public C293180BeO(String str) {
        this.LIZ = str;
        ConcurrentHashMap<String, C293180BeO> concurrentHashMap = LJ;
        if (!concurrentHashMap.contains(str)) {
            concurrentHashMap.put(str, this);
            this.LIZLLL = C452501pT.LIZIZ(new C293190BeP(this));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key ");
            sbLIZ.append(str);
            sbLIZ.append(" has been used");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static List LIZJ(String str) {
        List listLJJLIIIJILLIZJL;
        ArrayList arrayList = null;
        if (str != null && str.length() > 0 && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final void LIZ(String str, boolean z) {
        List<String> listLIZJ = LIZJ(str);
        if (listLIZJ != null) {
            if (z) {
                C293230BeT c293230BeTLIZIZ = LIZIZ();
                if (c293230BeTLIZIZ != null) {
                    c293230BeTLIZIZ.LIZ(listLIZJ);
                }
            } else {
                ((C293230BeT) this.LIZLLL.getValue()).LIZ(listLIZJ);
            }
            C292560BdO.LJ();
        }
    }
}
