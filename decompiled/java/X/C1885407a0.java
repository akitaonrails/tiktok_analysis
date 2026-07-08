package X;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07a0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1885407a0 {
    public static final /* synthetic */ int LJ = 0;
    public final Set<String> LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final List<Pattern> LIZLLL;

    public final boolean LIZ(String str) {
        if (this.LIZ.contains(str)) {
            return true;
        }
        Iterator<String> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(str, it2.next(), false)) {
                return true;
            }
        }
        Iterator<String> it3 = this.LIZJ.iterator();
        while (it3.hasNext()) {
            if (u.LJIIZILJ(str, it3.next(), false)) {
                return true;
            }
        }
        Iterator<Pattern> it4 = this.LIZLLL.iterator();
        while (it4.hasNext()) {
            if (it4.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public C1885407a0(Set set, List list, List list2, List list3) {
        this.LIZ = set;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = list3;
    }
}
