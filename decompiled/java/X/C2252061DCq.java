package X;

import com.ss.android.ugc.aweme.tako.model.TakoProductCartSignal;
import com.ss.android.ugc.aweme.tako.model.TakoProductOrderSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252061DCq {
    public final String LIZ;
    public Integer LIZIZ;
    public Boolean LIZJ;
    public Boolean LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJIIJ;
    public Boolean LJIIJJI;
    public Boolean LJIIL;
    public Long LJIILIIL;
    public Long LJIILJJIL;
    public Long LJIILL;
    public Long LJIILLIIL;
    public String LJIIZILJ;
    public Boolean LJIJ;
    public Boolean LJIJI;
    public Boolean LJIJJ;
    public Boolean LJIJJLI;
    public Boolean LJIL;
    public Boolean LJJ;
    public Boolean LJJI;
    public Boolean LJJIFFI;
    public Boolean LJJII;
    public Boolean LJJIII;
    public Boolean LJJIIJ;
    public Boolean LJJIIJZLJL;
    public Long LJJIIZ;
    public Long LJJIIZI;
    public String LJJIJ;
    public Long LJJIJIIJI;
    public Boolean LJJIJIIJIL;
    public Long LJJIJIL;
    public Boolean LJJJ;
    public Boolean LJJJI;
    public Long LJJJIL;
    public Long LJJJJ;
    public Long LJJJJI;
    public Long LJJJJIZL;
    public Long LJJJJJ;
    public Long LJJJJJL;
    public Long LJJJJL;
    public Long LJJJJLI;
    public Long LJJJJLL;
    public Long LJJJJZ;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public final Map<String, LinkedHashSet<String>> LJJIJL = new LinkedHashMap();
    public final Map<String, LinkedHashSet<String>> LJJIJLIJ = new LinkedHashMap();
    public final Map<String, LinkedHashSet<String>> LJJIL = new LinkedHashMap();
    public final HashMap<EnumC2252111DCv, Object> LJJIZ = new HashMap<>();
    public final List<TakoProductCartSignal> LJJJJZI = new ArrayList();
    public final List<TakoProductOrderSignal> LJJJLIIL = new ArrayList();
    public final List<EnumC20290114aJ> LJJJLL = new CopyOnWriteArrayList();
    public final List<C1DD5> LJJJLZIJ = new ArrayList();

    public C2252061DCq(String str) {
        this.LIZ = str;
    }

    public static Long LIZ(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return Long.valueOf(System.currentTimeMillis());
        }
        return null;
    }

    public final void LIZIZ(Boolean bool) {
        this.LJJIIJZLJL = bool;
        this.LJJJJL = LIZ(bool);
    }

    public final void LIZJ(Boolean bool) {
        this.LJJI = bool;
        LJFF(EnumC20290114aJ.FOLLOW, !Intrinsics.LJFF(bool, Boolean.TRUE));
        this.LJJJJLI = LIZ(bool);
    }

    public final void LIZLLL(Long l) {
        this.LJIILLIIL = l;
        if (l == null || l.longValue() < 3000) {
            LJFF(EnumC20290114aJ.SKIP, false);
        }
    }

    public final void LJ(Boolean bool) {
        this.LJIJ = bool;
        LJFF(EnumC20290114aJ.LIKE, !Intrinsics.LJFF(bool, Boolean.TRUE));
        this.LJJJJ = LIZ(bool);
    }

    public final void LJFF(EnumC20290114aJ enumC20290114aJ, boolean z) {
        if (((CopyOnWriteArrayList) this.LJJJLL).contains(enumC20290114aJ)) {
            if (z) {
                ((CopyOnWriteArrayList) this.LJJJLL).remove(enumC20290114aJ);
            }
        } else if (!z) {
            ((CopyOnWriteArrayList) this.LJJJLL).add(enumC20290114aJ);
        }
        List<EnumC20290114aJ> list = this.LJJJLL;
        for (C1DD5 c1dd5 : (ArrayList) this.LJJJLZIJ) {
            C13LP.LLIIII(list);
            c1dd5.LIZ();
        }
    }
}
