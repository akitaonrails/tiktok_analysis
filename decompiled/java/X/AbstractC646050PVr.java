package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ISearchContextService;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.MusicSearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.signal.impl.SearchContextAbilityImpl;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC646050PVr implements ISearchContextService {
    public static final boolean LIZ = ((Boolean) C07DV.LIZIZ.getValue()).booleanValue();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility LJJI() {
        return new SearchContextAbilityImpl(127, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0050 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility P0() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC646050PVr.P0():com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility");
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final IMusicSearchContextAbility r() {
        return new MusicSearchContextAbilityImpl(null, 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility A() throws Throwable {
        Integer numValueOf;
        Integer numValueOf2;
        C646120PVy c646120PVy;
        C646080PVu c646080PVuLIZLLL = C646070PVt.LIZLLL();
        if (c646080PVuLIZLLL != null) {
            numValueOf = Integer.valueOf(c646080PVuLIZLLL.LIZ);
            numValueOf2 = c646080PVuLIZLLL.LJ;
            c646120PVy = c646080PVuLIZLLL.LJFF;
        } else {
            numValueOf = null;
            numValueOf2 = null;
            c646120PVy = null;
        }
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIJJI()) {
            Fragment fragmentLIZIZ = C651300Pge.LIZIZ();
            C19EG activity = fragmentLIZIZ != null ? fragmentLIZIZ.getActivity() : null;
            if (!(fragmentLIZIZ instanceof C0PE2) || activity == null) {
                return new SearchContextAbilityImpl(15, null, 0 == true ? 1 : 0, c646120PVy, c646080PVuLIZLLL, numValueOf2, 0 == true ? 1 : 0);
            }
            C645960PVi c645960PVi = C645960PVi.LIZ;
            c645960PVi.getClass();
            Fragment fragmentLIZIZ2 = C645960PVi.LIZIZ(fragmentLIZIZ, activity);
            c645960PVi.getClass();
            View viewLIZ = C645960PVi.LIZ(fragmentLIZIZ, activity);
            if (fragmentLIZIZ2 == null) {
                return new SearchContextAbilityImpl(9, viewLIZ, fragmentLIZIZ, c646120PVy, c646080PVuLIZLLL, numValueOf, null);
            }
            if (numValueOf2 == null && LIZ) {
                numValueOf2 = Integer.valueOf(fragmentLIZIZ2.hashCode());
            }
            return new SearchContextAbilityImpl(9, viewLIZ, fragmentLIZIZ2, c646120PVy, c646080PVuLIZLLL, numValueOf2, null);
        }
        C19EG c19egLIZJ = C651290Pgd.LIZJ();
        Fragment fragmentLIZIZ3 = C651300Pge.LIZIZ();
        InterfaceC214902198i interfaceC214902198i = fragmentLIZIZ3 instanceof InterfaceC214902198i ? (InterfaceC214902198i) fragmentLIZIZ3 : null;
        if (c19egLIZJ == null) {
            return new SearchContextAbilityImpl(15, null, 0 == true ? 1 : 0, c646120PVy, c646080PVuLIZLLL, numValueOf2, 0 == true ? 1 : 0);
        }
        Fragment fragment = interfaceC214902198i != null ? (Fragment) interfaceC214902198i : null;
        C645960PVi c645960PVi2 = C645960PVi.LIZ;
        c645960PVi2.getClass();
        Fragment fragmentLIZIZ4 = C645960PVi.LIZIZ(fragment, c19egLIZJ);
        c645960PVi2.getClass();
        View viewLIZ2 = C645960PVi.LIZ(fragment, c19egLIZJ);
        if (fragmentLIZIZ4 != null) {
            if (numValueOf2 == null && LIZ) {
                numValueOf2 = Integer.valueOf(fragmentLIZIZ4.hashCode());
            }
            return new SearchContextAbilityImpl(9, viewLIZ2, fragmentLIZIZ4, c646120PVy, c646080PVuLIZLLL, numValueOf2, null);
        }
        if (!C07H5.LIZ() || !SAFHelper.LJJJJLL(interfaceC214902198i, c19egLIZJ)) {
            return new SearchContextAbilityImpl(9, viewLIZ2, c19egLIZJ, c646120PVy, c646080PVuLIZLLL, numValueOf, null);
        }
        SAFHelper.LJJJJZI(c19egLIZJ, interfaceC214902198i);
        return new SearchContextAbilityImpl(9, viewLIZ2, SAFHelper.LJJJ(c19egLIZJ), c646120PVy, c646080PVuLIZLLL, numValueOf, null);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final Boolean LJIILLIIL() {
        C646080PVu c646080PVuLIZLLL = C646070PVt.LIZLLL();
        if (c646080PVuLIZLLL != null) {
            return Boolean.valueOf(c646080PVuLIZLLL.LIZJ());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0PVu] */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0PVu, X.0PVy, android.view.View, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility A0(LifecycleOwner lifecycleOwner) throws Throwable {
        Fragment fragment;
        WeakReference weakReference;
        ?? LIZJ = 0;
        Integer numValueOf = null;
        if (lifecycleOwner instanceof C19EG) {
            C19EG c19eg = (C19EG) lifecycleOwner;
            SAFHelper.LIZ.getClass();
            SAFHelper.LJJJJZI(c19eg, null);
            C645960PVi.LIZ.getClass();
            Fragment fragmentLIZIZ = C645960PVi.LIZIZ(null, c19eg);
            if (fragmentLIZIZ != null && Intrinsics.LJFF(fragmentLIZIZ.getActivity(), lifecycleOwner)) {
                return new SearchContextAbilityImpl(123, LIZJ, fragmentLIZIZ, LIZJ, LIZJ, LIZJ, LIZJ);
            }
            if (C07H5.LIZ() && SAFHelper.LJJJJJL((Activity) lifecycleOwner)) {
                return new SearchContextAbilityImpl(123, LIZJ, SAFHelper.LJJJ(c19eg), LIZJ, LIZJ, LIZJ, LIZJ);
            }
        }
        if ((lifecycleOwner instanceof C0PE2) && (lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null && fragment.getActivity() != null) {
            C645960PVi c645960PVi = C645960PVi.LIZ;
            Fragment fragment2 = (Fragment) lifecycleOwner;
            C19EG activity = fragment2.getActivity();
            if (activity != null) {
                c645960PVi.getClass();
                Fragment fragmentLIZIZ2 = C645960PVi.LIZIZ(fragment2, activity);
                if (fragmentLIZIZ2 != null && Intrinsics.LJFF(C651580Ph6.LJ(fragmentLIZIZ2), lifecycleOwner)) {
                    int iHashCode = lifecycleOwner.hashCode();
                    if (lifecycleOwner instanceof C0PE2) {
                        weakReference = new WeakReference(lifecycleOwner);
                    } else {
                        weakReference = null;
                    }
                    C646080PVu c646080PVuLIZJ = C646070PVt.LIZJ(iHashCode, weakReference);
                    if (c646080PVuLIZJ != null) {
                        numValueOf = c646080PVuLIZJ.LJ;
                    }
                    View view = null;
                    boolean z = false;
                    boolean z2 = false;
                    if (numValueOf == null && LIZ) {
                        numValueOf = Integer.valueOf(fragmentLIZIZ2.hashCode());
                    }
                    return new SearchContextAbilityImpl(11, view, fragmentLIZIZ2, z2 ? 1 : 0, c646080PVuLIZJ, numValueOf, z ? 1 : 0);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C0PE2 c0pe2LIZ = C645110PSb.LIZ(lifecycleOwner);
        if (c0pe2LIZ != null) {
            CopyOnWriteArrayList<CopyOnWriteArrayList<C646080PVu>> copyOnWriteArrayList = C646070PVt.LIZ;
            LIZJ = C646070PVt.LIZJ(c0pe2LIZ.hashCode(), new WeakReference(c0pe2LIZ));
        }
        return new SearchContextAbilityImpl(11, null, lifecycleOwner, false ? 1 : 0, LIZJ, Integer.valueOf(lifecycleOwner.hashCode()), false ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility D(Aweme aweme) {
        return new SearchContextAbilityImpl(126, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, aweme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility LLJJI(Object obj) {
        return new SearchContextAbilityImpl(126, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, obj);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final IMusicSearchContextAbility LLLLII(LifecycleOwner lifecycleOwner) {
        return new MusicSearchContextAbilityImpl(lifecycleOwner, 59);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[PHI: r3
      0x0048: PHI (r3v12 androidx.fragment.app.Fragment) = (r3v1 androidx.fragment.app.Fragment), (r3v13 androidx.fragment.app.Fragment) binds: [B:34:0x00a5, B:12:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168  */
    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility d0(android.view.View r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC646050PVr.d0(android.view.View):com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility l(InterfaceC2753014t interfaceC2753014t) {
        return new SearchContextAbilityImpl(126, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC2753014t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.ISearchContextService
    public final ISearchContextAbility p0(SearchResultParam searchResultParam) {
        return new SearchContextAbilityImpl(126, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, searchResultParam);
    }
}
