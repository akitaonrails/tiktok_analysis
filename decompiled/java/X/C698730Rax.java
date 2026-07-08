package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0Rax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698730Rax {
    public final List<C1264104x5> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final LinkedHashSet<String> LIZJ;
    public final LinkedHashMap<String, C698760Rb0> LIZLLL;
    public Object LJ;
    public Function1<? super C698760Rb0, Unit> LJFF;

    public C698730Rax() {
        this(null, 3);
    }

    public final void LIZ(Object obj) {
        if (obj == null) {
            this.LIZLLL.clear();
        } else {
            C19719612Di.LJJIII(this.LIZLLL.entrySet(), new AwS590S0100000_11(obj, 398), true);
        }
    }

    public final List<C1264104x5> LIZIZ(String str) {
        List<C1264104x5> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C1264104x5 c1264104x5 : list) {
            if (c1264104x5.LIZ.contains(str)) {
                arrayList.add(c1264104x5);
            }
        }
        return arrayList;
    }

    public final boolean LIZJ(String str) {
        List<C1264104x5> listLIZIZ = LIZIZ(str);
        if (listLIZIZ.isEmpty()) {
            return false;
        }
        Iterator<C1264104x5> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            Set<String> set = it2.next().LIZJ;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it3 = set.iterator();
                while (it3.hasNext()) {
                    if (this.LIZJ.contains(it3.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public C698730Rax(AwS555S0100000_11 awS555S0100000_11, int i) {
        List<C1264104x5> listSingletonList;
        if ((i & 1) != 0) {
            listSingletonList = Collections.singletonList(new C1264104x5(Collections.singleton("bottom_banner"), C13LQ.LJLIIL(new String[]{"tiktokec_extra_info_show", "multi_anchor_entrance_expand"})));
        } else {
            listSingletonList = null;
        }
        awS555S0100000_11 = (i & 2) != 0 ? null : awS555S0100000_11;
        this.LIZ = listSingletonList;
        this.LIZIZ = awS555S0100000_11;
        this.LIZJ = new LinkedHashSet<>();
        this.LIZLLL = new LinkedHashMap<>();
    }
}
