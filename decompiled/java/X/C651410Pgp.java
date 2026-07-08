package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C651410Pgp {
    public static final int LIZ = C0C64.LJIILLIIL().LJIJ(31744, 6, "adjust_search_result_activity_limit", true);
    public static final CopyOnWriteArrayList<CopyOnWriteArrayList<C19EG>> LIZIZ = new CopyOnWriteArrayList<>();

    public static C19EG LIZJ() {
        try {
            CopyOnWriteArrayList<CopyOnWriteArrayList<C19EG>> copyOnWriteArrayList = LIZIZ;
            ListIterator<CopyOnWriteArrayList<C19EG>> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (listIterator.hasPrevious()) {
                CopyOnWriteArrayList<C19EG> copyOnWriteArrayListPrevious = listIterator.previous();
                ListIterator<C19EG> listIterator2 = copyOnWriteArrayListPrevious.listIterator(copyOnWriteArrayListPrevious.size());
                while (listIterator2.hasPrevious()) {
                    C19EG c19egPrevious = listIterator2.previous();
                    SAFHelper.LIZ.getClass();
                    if (!SAFHelper.LJJJJJ(SAFHelper.LJJJ(c19egPrevious), c19egPrevious)) {
                        return c19egPrevious;
                    }
                }
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C19EG LIZLLL() {
        List arrayList = (CopyOnWriteArrayList) C13LP.LJJLIIIJL(LIZIZ);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C19EG) ListProtector.get(arrayList, arrayList.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C19EG LIZIZ() {
        if (C1105904Uf.LIZ()) {
            return LIZLLL();
        }
        Collection arrayList = (CopyOnWriteArrayList) C13LP.LJJLIIIJL(LIZIZ);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            for (IndexedValue indexedValue : C13LP.LJLJJLL(C13LP.LLIIL(arrayList))) {
                C19EG c19eg = (C19EG) indexedValue.LIZIZ;
                SAFHelper.LIZ.getClass();
                if (!SAFHelper.LJJJJJ(SAFHelper.LJJJ(c19eg), c19eg)) {
                    return (C19EG) indexedValue.LIZIZ;
                }
            }
        }
        return null;
    }

    public static void LIZ(C19EG c19eg) {
        for (CopyOnWriteArrayList<C19EG> copyOnWriteArrayList : LIZIZ) {
            Iterator<C19EG> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), c19eg)) {
                    for (C19EG c19eg2 : copyOnWriteArrayList) {
                        if (!Intrinsics.LJFF(c19eg2, c19eg)) {
                            copyOnWriteArrayList.remove(c19eg2);
                            SAFHelper.LIZ.getClass();
                            SAFHelper.LIZJ(SAFHelper.LJJJ(c19eg2), c19eg2);
                        }
                    }
                    return;
                }
            }
        }
    }

    public static boolean LJ(C19EG c19eg) {
        for (CopyOnWriteArrayList<C19EG> copyOnWriteArrayList : LIZIZ) {
            Iterator<C19EG> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), c19eg)) {
                    if (copyOnWriteArrayList.size() > 1) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
