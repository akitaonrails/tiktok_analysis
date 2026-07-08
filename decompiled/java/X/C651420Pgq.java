package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pgq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651420Pgq {
    public static final int LIZ = C0C64.LJIILLIIL().LJIJ(31744, 6, "adjust_search_result_activity_limit", true);
    public static final CopyOnWriteArrayList<CopyOnWriteArrayList<SearchRootFragment>> LIZIZ = new CopyOnWriteArrayList<>();

    public static SearchRootFragment LIZJ() {
        try {
            CopyOnWriteArrayList<CopyOnWriteArrayList<SearchRootFragment>> copyOnWriteArrayList = LIZIZ;
            ListIterator<CopyOnWriteArrayList<SearchRootFragment>> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (listIterator.hasPrevious()) {
                CopyOnWriteArrayList<SearchRootFragment> copyOnWriteArrayListPrevious = listIterator.previous();
                ListIterator<SearchRootFragment> listIterator2 = copyOnWriteArrayListPrevious.listIterator(copyOnWriteArrayListPrevious.size());
                while (listIterator2.hasPrevious()) {
                    SearchRootFragment searchRootFragmentPrevious = listIterator2.previous();
                    if (!SAFExtensionKt.LJIIZILJ(searchRootFragmentPrevious)) {
                        return searchRootFragmentPrevious;
                    }
                }
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @InterfaceC1294060jmO
    public static Fragment LIZLLL() {
        List arrayList = (CopyOnWriteArrayList) C13LP.LJJLIIIJL(LIZIZ);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Fragment) ListProtector.get(arrayList, arrayList.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public static Fragment LIZIZ() {
        if (C1105904Uf.LIZ()) {
            return LIZLLL();
        }
        Collection arrayList = (CopyOnWriteArrayList) C13LP.LJJLIIIJL(LIZIZ);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.isEmpty()) {
            for (IndexedValue indexedValue : C13LP.LJLJJLL(C13LP.LLIIL(arrayList))) {
                if (!SAFExtensionKt.LJIIZILJ((SAFTikTokFragment) indexedValue.LIZIZ)) {
                    return (Fragment) indexedValue.LIZIZ;
                }
            }
        }
        return null;
    }

    public static void LIZ(InterfaceC214902198i interfaceC214902198i) {
        for (CopyOnWriteArrayList<SearchRootFragment> copyOnWriteArrayList : LIZIZ) {
            Iterator<SearchRootFragment> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), interfaceC214902198i)) {
                    for (SearchRootFragment searchRootFragment : copyOnWriteArrayList) {
                        if (!Intrinsics.LJFF(searchRootFragment, interfaceC214902198i)) {
                            copyOnWriteArrayList.remove(searchRootFragment);
                            searchRootFragment.finish();
                        }
                    }
                    return;
                }
            }
        }
    }

    public static boolean LJ(InterfaceC214902198i interfaceC214902198i) {
        for (CopyOnWriteArrayList<SearchRootFragment> copyOnWriteArrayList : LIZIZ) {
            Iterator<SearchRootFragment> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), interfaceC214902198i)) {
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
