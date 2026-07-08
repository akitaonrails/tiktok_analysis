package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651300Pge {
    public static final CopyOnWriteArrayList<Fragment> LIZ = new CopyOnWriteArrayList<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C18124077y());

    public static boolean LJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static Fragment LIZ() {
        Fragment c098200Yq;
        Fragment fragmentPrevious;
        if (LJ()) {
            return C651420Pgq.LIZIZ();
        }
        boolean z = true;
        try {
            CopyOnWriteArrayList<Fragment> copyOnWriteArrayList = LIZ;
            ListIterator<Fragment> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fragmentPrevious = null;
                    break;
                }
                fragmentPrevious = listIterator.previous();
                if (!C651310Pgf.LIZ(fragmentPrevious)) {
                    break;
                }
            }
            c098200Yq = fragmentPrevious;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Fragment fragment = (Fragment) c098200Yq;
        Fragment fragmentLIZIZ = C651420Pgq.LIZIZ();
        if (fragmentLIZIZ != null) {
            if (!Intrinsics.LJFF(fragmentLIZIZ, fragment) && fragment != null) {
                z = false;
            }
            Fragment fragment2 = z ? fragmentLIZIZ : null;
            if (fragment2 != null) {
                return fragment2;
            }
        }
        return fragment;
    }

    public static Fragment LIZIZ() {
        Fragment c098200Yq;
        Fragment fragmentPrevious;
        if (LJ()) {
            return C651420Pgq.LIZJ();
        }
        boolean z = true;
        try {
            CopyOnWriteArrayList<Fragment> copyOnWriteArrayList = LIZ;
            ListIterator<Fragment> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    fragmentPrevious = null;
                    break;
                }
                fragmentPrevious = listIterator.previous();
                if (!C651310Pgf.LIZ(fragmentPrevious)) {
                    break;
                }
            }
            c098200Yq = fragmentPrevious;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Fragment fragment = (Fragment) c098200Yq;
        SearchRootFragment searchRootFragmentLIZJ = C651420Pgq.LIZJ();
        if (searchRootFragmentLIZJ != null) {
            if (!Intrinsics.LJFF(searchRootFragmentLIZJ, fragment) && fragment != null) {
                z = false;
            }
            SearchRootFragment searchRootFragment = z ? searchRootFragmentLIZJ : null;
            if (searchRootFragment != null) {
                return searchRootFragment;
            }
        }
        return fragment;
    }

    public static Fragment LIZLLL() {
        if (LJ()) {
            return C651420Pgq.LIZLLL();
        }
        Fragment fragment = (Fragment) C13LP.LJJLIIIJL(LIZ);
        Fragment fragmentLIZLLL = C651420Pgq.LIZLLL();
        return (fragmentLIZLLL == null || !(Intrinsics.LJFF(fragmentLIZLLL, fragment) || fragment == null)) ? fragment : fragmentLIZLLL;
    }

    public static Fragment LIZJ(Class cls) {
        Fragment c098200Yq;
        SearchRootFragment searchRootFragmentPrevious;
        Fragment fragmentPrevious;
        boolean z;
        if (LJ()) {
            return C651420Pgq.LIZJ();
        }
        boolean z2 = false;
        SearchRootFragment searchRootFragment = null;
        try {
            CopyOnWriteArrayList<Fragment> copyOnWriteArrayList = LIZ;
            ListIterator<Fragment> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    fragmentPrevious = listIterator.previous();
                    Fragment fragment = fragmentPrevious;
                    if (C651310Pgf.LIZ(fragment) || !Intrinsics.LJFF(fragment.getClass(), cls)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    fragmentPrevious = null;
                    break;
                }
            }
            c098200Yq = fragmentPrevious;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Fragment fragment2 = (Fragment) c098200Yq;
        try {
            CopyOnWriteArrayList<CopyOnWriteArrayList<SearchRootFragment>> copyOnWriteArrayList2 = C651420Pgq.LIZIZ;
            ListIterator<CopyOnWriteArrayList<SearchRootFragment>> listIterator2 = copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
            loop1: while (listIterator2.hasPrevious()) {
                CopyOnWriteArrayList<SearchRootFragment> copyOnWriteArrayListPrevious = listIterator2.previous();
                ListIterator<SearchRootFragment> listIterator3 = copyOnWriteArrayListPrevious.listIterator(copyOnWriteArrayListPrevious.size());
                while (listIterator3.hasPrevious()) {
                    searchRootFragmentPrevious = listIterator3.previous();
                    if (Intrinsics.LJFF(searchRootFragmentPrevious.getClass(), cls) && !SAFExtensionKt.LJIIZILJ(searchRootFragmentPrevious)) {
                        break loop1;
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        searchRootFragmentPrevious = null;
        if (searchRootFragmentPrevious != null) {
            if (Intrinsics.LJFF(searchRootFragmentPrevious, fragment2) || fragment2 == null) {
                z2 = true;
            }
            if (z2) {
                searchRootFragment = searchRootFragmentPrevious;
            }
            if (searchRootFragment != null) {
                return searchRootFragment;
            }
        }
        return fragment2;
    }
}
