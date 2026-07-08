package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q0G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533300q0G {
    public final String LIZ;
    public final String LIZIZ;
    public final C1533330q0J LIZJ;
    public final Map<String, C1533330q0J> LIZLLL;
    public final C1502310pCH LJ;

    public final C1533330q0J LIZ(String str) {
        String str2;
        C1533330q0J c1533330q0J;
        C1533330q0J c1533330q0J2 = this.LIZJ;
        C1533330q0J c1533330q0J3 = null;
        if (c1533330q0J2 != null) {
            str2 = c1533330q0J2.LIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2)) {
            return this.LIZJ;
        }
        Map<String, C1533330q0J> map = this.LIZLLL;
        if (map != null && (c1533330q0J = map.get(str)) != null) {
            return c1533330q0J;
        }
        C1533310q0H.LIZ.getClass();
        C01GW c01gw = C1533310q0H.LJ;
        Pair pair = (Pair) ((Map) c01gw.getValue()).get(str);
        if (pair != null && (c1533330q0J3 = (C1533330q0J) pair.getFirst()) != null) {
            return c1533330q0J3;
        }
        C1537050q6J.LIZ.getClass();
        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(str);
        if (c1551950qULLIZ == null) {
            return c1533330q0J3;
        }
        C1551530qTf c1551530qTf = c1551950qULLIZ.LIZ;
        String str3 = (String) ListProtector.get(c1551530qTf.LJ, 0);
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String absolutePath = c1551530qTf.LJIIL.getAbsolutePath();
        if (absolutePath != null) {
            str4 = absolutePath;
        }
        ((Map) c01gw.getValue()).put(str, new Pair(new C1533330q0J(str3, str4, false), c1551950qULLIZ));
        return c1533330q0J3;
    }

    public C1533300q0G(String str, String str2, C1533330q0J c1533330q0J, Map<String, C1533330q0J> map, List<String> list) {
        C1502310pCH c1502310pCH;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c1533330q0J;
        this.LIZLLL = map;
        if (list != null) {
            c1502310pCH = new C1502310pCH();
            c1502310pCH.LIZJ(list);
            c1502310pCH.LIZ();
        } else {
            c1502310pCH = null;
        }
        this.LJ = c1502310pCH;
    }

    public /* synthetic */ C1533300q0G(String str, String str2, C1533330q0J c1533330q0J, List list, int i) {
        this(str, str2, (i & 4) != 0 ? null : c1533330q0J, (Map<String, C1533330q0J>) null, (List<String>) ((i & 16) != 0 ? null : list));
    }
}
