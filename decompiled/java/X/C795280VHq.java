package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0VHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795280VHq extends AbstractC795300VHs {
    public final C0VI1 LIZ;
    public final String LIZIZ;
    public final C0VI0 LIZJ;
    public final List<? extends AbstractC795370VHz> LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public final List<C795280VHq> LJI;
    public boolean LJII;
    public C795230VHl LJIIIIZZ;

    public C795280VHq() {
        throw null;
    }

    static {
        C0VI8.LIZIZ("WorkContinuationImpl");
    }

    public final InterfaceC795220VHk LIZ() {
        if (this.LJII) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.LJ)});
            c0vi8LIZ.getClass();
        } else {
            RunnableC795270VHp runnableC795270VHp = new RunnableC795270VHp(this);
            ((C0VG9) this.LIZ.LIZLLL).LIZ(runnableC795270VHp);
            this.LJIIIIZZ = runnableC795270VHp.LLILLJJLI;
        }
        return this.LJIIIIZZ;
    }

    public static Set<String> LIZJ(C795280VHq c795280VHq) {
        HashSet hashSet = new HashSet();
        List<C795280VHq> list = c795280VHq.LJI;
        if (list != null && !list.isEmpty()) {
            Iterator<C795280VHq> it2 = list.iterator();
            while (it2.hasNext()) {
                hashSet.addAll(it2.next().LJ);
            }
        }
        return hashSet;
    }

    public static boolean LIZIZ(C795280VHq c795280VHq, Set<String> set) {
        set.addAll(c795280VHq.LJ);
        Set<String> setLIZJ = LIZJ(c795280VHq);
        Iterator it2 = ((HashSet) set).iterator();
        while (it2.hasNext()) {
            if (((HashSet) setLIZJ).contains(it2.next())) {
                return true;
            }
        }
        List<C795280VHq> list = c795280VHq.LJI;
        if (list != null && !list.isEmpty()) {
            Iterator<C795280VHq> it3 = list.iterator();
            while (it3.hasNext()) {
                if (LIZIZ(it3.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c795280VHq.LJ);
        return false;
    }

    public C795280VHq(C0VI1 c0vi1, String str, C0VI0 c0vi0, List<? extends AbstractC795370VHz> list) {
        this(c0vi1, str, c0vi0, list, 0);
    }

    public C795280VHq(C0VI1 c0vi1, String str, C0VI0 c0vi0, List list, int i) {
        this.LIZ = c0vi1;
        this.LIZIZ = str;
        this.LIZJ = c0vi0;
        this.LIZLLL = list;
        this.LJI = null;
        this.LJ = new ArrayList(list.size());
        this.LJFF = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String string = ((AbstractC795370VHz) ListProtector.get(list, i2)).LIZ.toString();
            ((ArrayList) this.LJ).add(string);
            ((ArrayList) this.LJFF).add(string);
        }
    }
}
