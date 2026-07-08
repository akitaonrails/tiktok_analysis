package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.NonMatching;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PH8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PH8 {
    public static List LIZIZ(C0NMY c0nmy) {
        LifecycleOwner lifecycleOwnerLIZLLL = C651290Pgd.LIZLLL();
        if (lifecycleOwnerLIZLLL == null) {
            return C13BV.INSTANCE;
        }
        if (C04SX.LIZ()) {
            C0PKD.LIZIZ.getClass();
            return C0PKD.LIZ();
        }
        SearchCardContainerSharedVM searchCardContainerSharedVMLIZIZ = C0PHD.LIZIZ(lifecycleOwnerLIZLLL, c0nmy);
        searchCardContainerSharedVMLIZIZ.vQ2();
        return searchCardContainerSharedVMLIZIZ.LL;
    }

    public static List LIZJ(C0NMY c0nmy) {
        LifecycleOwner lifecycleOwnerLIZLLL = C651290Pgd.LIZLLL();
        if (lifecycleOwnerLIZLLL == null) {
            return C13BV.INSTANCE;
        }
        if (C04SX.LIZ()) {
            C0PKD.LIZIZ.getClass();
            C0PKD.LJII.getClass();
            return C0PHG.LIZ();
        }
        SearchCardContainerSharedVM searchCardContainerSharedVMLIZIZ = C0PHD.LIZIZ(lifecycleOwnerLIZLLL, c0nmy);
        searchCardContainerSharedVMLIZIZ.vQ2();
        return searchCardContainerSharedVMLIZIZ.LLILZIL.LIZ;
    }

    public static List LIZ(InterfaceC594520NTm interfaceC594520NTm, C0NMY c0nmy) {
        C0PHI<T> config;
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF = LJFF(interfaceC594520NTm, c0nmy, C651290Pgd.LIZLLL(), true);
        if (iSearchCardProtocolLJFF == null || (config = iSearchCardProtocolLJFF.getConfig()) == 0) {
            return null;
        }
        return config.LIZJ(interfaceC594520NTm, new C0PHT(null, 511));
    }

    public static boolean LJ(InterfaceC594520NTm interfaceC594520NTm, C0NMY c0nmy) {
        C0PHM c0phmLIZLLL;
        C0PHI<T> config;
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF = LJFF(interfaceC594520NTm, c0nmy, C651290Pgd.LIZLLL(), false);
        if (iSearchCardProtocolLJFF != null && (config = iSearchCardProtocolLJFF.getConfig()) != 0) {
            c0phmLIZLLL = config.LIZLLL();
        } else {
            c0phmLIZLLL = null;
        }
        if (c0phmLIZLLL != C0PHM.ONE_COLUMN) {
            return false;
        }
        return true;
    }

    public static void LJII(List list, C0NMY c0nmy) {
        LifecycleOwner lifecycleOwnerLIZLLL = C651290Pgd.LIZLLL();
        if (lifecycleOwnerLIZLLL != null && list != null && !list.isEmpty()) {
            if (C04SX.LIZ()) {
                C0PKD.LIZIZ.getClass();
                if (!C0PKD.LIZ().isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC594520NTm interfaceC594520NTm = (InterfaceC594520NTm) it2.next();
                        C0PKD.LIZIZ.getClass();
                        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLIZJ = C0PKD.LIZJ(interfaceC594520NTm);
                        C0PKD.LJI.put(Integer.valueOf(System.identityHashCode(interfaceC594520NTm)), iSearchCardProtocolLIZJ);
                        if (Intrinsics.LJFF(iSearchCardProtocolLIZJ, NonMatching.LL)) {
                            C0PKD.LJII.getClass();
                            C0PHG.LJI.put(Integer.valueOf(System.identityHashCode(interfaceC594520NTm)), C0PHG.LIZJ(interfaceC594520NTm));
                        }
                    }
                    return;
                }
                return;
            }
            SearchCardContainerSharedVM searchCardContainerSharedVMLIZIZ = C0PHD.LIZIZ(lifecycleOwnerLIZLLL, c0nmy);
            searchCardContainerSharedVMLIZIZ.vQ2();
            if (!searchCardContainerSharedVMLIZIZ.LL.isEmpty()) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    InterfaceC594520NTm interfaceC594520NTm2 = (InterfaceC594520NTm) it3.next();
                    ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolWQ2 = searchCardContainerSharedVMLIZIZ.wQ2(interfaceC594520NTm2);
                    searchCardContainerSharedVMLIZIZ.LLILLJJLI.put(Integer.valueOf(System.identityHashCode(interfaceC594520NTm2)), iSearchCardProtocolWQ2);
                    if (Intrinsics.LJFF(iSearchCardProtocolWQ2, NonMatching.LL)) {
                        C0PH9 c0ph9 = searchCardContainerSharedVMLIZIZ.LLILZIL;
                        c0ph9.LIZIZ.put(Integer.valueOf(System.identityHashCode(interfaceC594520NTm2)), c0ph9.LIZ(interfaceC594520NTm2));
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIIIZZ(Fragment fragment, C0NMY c0nmy) {
        String strLJJLIIIJ;
        Fragment parentFragment;
        Fragment parentFragment2;
        ComponentCallbacks2 componentCallbacks2LJFF;
        Fragment parentFragment3;
        FragmentManager childFragmentManager;
        List<Fragment> listLJJLIIIJL;
        LifecycleOwner lifecycleOwnerLIZIZ;
        ComponentCallbacks2 componentCallbacks2LJFF2;
        Fragment parentFragment4 = fragment;
        SAFHelper.LIZ.getClass();
        Fragment fragment2 = null;
        if (SAFHelper.LJIIJJI()) {
            try {
                C0PE2 c0pe2LJFF = C0PHF.LJFF(parentFragment4);
                if (c0pe2LJFF != null) {
                    lifecycleOwnerLIZIZ = C0PHF.LIZ(c0pe2LJFF);
                } else {
                    lifecycleOwnerLIZIZ = null;
                }
                if (C1210904oV.LIZ()) {
                    if (lifecycleOwnerLIZIZ == null && (lifecycleOwnerLIZIZ = C0PHE.LIZIZ(parentFragment4)) == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (lifecycleOwnerLIZIZ == null) {
                    Context context = parentFragment4.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF2 = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF2 = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF2).getEnableSAF()) : (componentCallbacks2LJFF2 instanceof InterfaceC214897198d)) {
                        Fragment parentFragment5 = parentFragment4;
                        while (true) {
                            if (parentFragment5 == 0) {
                                break;
                            }
                            if (parentFragment5 instanceof InterfaceC214902198i) {
                                Object obj = (InterfaceC214902198i) parentFragment5;
                                if (obj != null && (lifecycleOwnerLIZIZ = (Fragment) obj) != null) {
                                }
                            } else {
                                parentFragment5 = parentFragment5.getParentFragment();
                            }
                        }
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                EnumC654470Pll enumC654470Pll = EnumC654470Pll.COMMON;
                EnumC664420Q4i enumC664420Q4i = EnumC664420Q4i.CONTAINERIZATION;
                Pair[] pairArr = new Pair[7];
                pairArr[0] = new Pair("targetFragment", String.valueOf(parentFragment4));
                pairArr[1] = new Pair("targetFragmentActivity", String.valueOf(parentFragment4.getActivity()));
                pairArr[2] = new Pair("targetFragmentParentFragment", String.valueOf(parentFragment4.getParentFragment()));
                Fragment parentFragment6 = parentFragment4.getParentFragment();
                if (parentFragment6 != null && (childFragmentManager = parentFragment6.getChildFragmentManager()) != null && (listLJJLIIIJL = childFragmentManager.LJJLIIIJL()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Fragment fragment3 : listLJJLIIIJL) {
                        if (C13LE.LIZ(parentFragment4.getClass().getClass()).LIZIZ(fragment3)) {
                            arrayList.add(fragment3);
                        }
                    }
                    strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, AFwS241S0000000_10.get$arr$(170), 31);
                } else {
                    strLJJLIIIJ = null;
                }
                pairArr[3] = new Pair("fragmentManager", String.valueOf(strLJJLIIIJ));
                Fragment parentFragment7 = parentFragment4.getParentFragment();
                if (parentFragment7 != null) {
                    parentFragment = parentFragment7.getParentFragment();
                } else {
                    parentFragment = null;
                }
                pairArr[4] = new Pair("targetFragmentParent2Fragment", String.valueOf(parentFragment));
                Fragment parentFragment8 = parentFragment4.getParentFragment();
                if (parentFragment8 != null && (parentFragment3 = parentFragment8.getParentFragment()) != null) {
                    parentFragment2 = parentFragment3.getParentFragment();
                } else {
                    parentFragment2 = null;
                }
                pairArr[5] = new Pair("targetFragmentParent3Fragment", String.valueOf(parentFragment2));
                Context context2 = parentFragment4.getContext();
                if (context2 != null) {
                    componentCallbacks2LJFF = SAFExtensionKt.LJFF(context2);
                } else {
                    componentCallbacks2LJFF = null;
                }
                if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    while (true) {
                        if (parentFragment4 == null) {
                            break;
                        }
                        if (parentFragment4 instanceof InterfaceC214902198i) {
                            fragment2 = parentFragment4;
                            break;
                        }
                        parentFragment4 = parentFragment4.getParentFragment();
                    }
                }
                pairArr[6] = new Pair("SAFFragment", String.valueOf(fragment2));
                C664410Q4h.LIZIZ(enumC654470Pll, enumC664420Q4i, th, "setupSearchContainer", C2097608Jq.LJIIIIZZ(pairArr), C2097608Jq.LJ(), "search");
                return;
            }
        } else {
            lifecycleOwnerLIZIZ = parentFragment4.requireActivity();
        }
        SearchCardContainerSharedVM searchCardContainerSharedVMLIZIZ = C0PHD.LIZIZ(lifecycleOwnerLIZIZ, c0nmy);
        if (((Number) C18059075l.LIZ.getValue()).intValue() == 1) {
            new AwS554S0100000_10(parentFragment4, 282);
        } else if (((Number) C18157079f.LIZ.getValue()).intValue() != 1) {
            List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF(parentFragment4, null), ISearchCardProtocol.class, false);
            if (listLIZIZ != null) {
                ((ArrayList) listLIZIZ).size();
            }
            Objects.toString(C1554610qYd.LIZIZ(C1558360qeg.LJFF(parentFragment4, null), ISearchCardProtocol.class, false));
        }
        if (C04SX.LIZ()) {
            C0PKD.LIZIZ.getClass();
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0PFW(null), 2);
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(parentFragment4, null);
        synchronized (searchCardContainerSharedVMLIZIZ) {
            if (searchCardContainerSharedVMLIZIZ.LLILLL != null) {
                return;
            }
            searchCardContainerSharedVMLIZIZ.LLILLL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(searchCardContainerSharedVMLIZIZ), C0PEM.LIZJ, null, new C0PHA(interfaceC665370Q7zLJFF, searchCardContainerSharedVMLIZIZ, null), 2);
        }
    }

    public static Boolean LIZLLL(InterfaceC594520NTm interfaceC594520NTm, C0NMY c0nmy, int i) {
        LifecycleOwner lifecycleOwnerLIZLLL;
        boolean z;
        C0PHI<T> config;
        C642240PHa c642240PHaLJFF;
        if ((i & 1) != 0) {
            c0nmy = C0NMY.GENERAL_SEARCH;
        }
        if ((i & 2) != 0) {
            lifecycleOwnerLIZLLL = C651290Pgd.LIZLLL();
        } else {
            lifecycleOwnerLIZLLL = null;
        }
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLJFF = LJFF(interfaceC594520NTm, c0nmy, lifecycleOwnerLIZLLL, z);
        if (iSearchCardProtocolLJFF == null || (config = iSearchCardProtocolLJFF.getConfig()) == 0 || (c642240PHaLJFF = config.LJFF()) == null) {
            return null;
        }
        return Boolean.valueOf(c642240PHaLJFF.LJIIIIZZ);
    }

    public static final ISearchCardProtocol<InterfaceC594520NTm> LJFF(InterfaceC594520NTm interfaceC594520NTm, C0NMY c0nmy, LifecycleOwner lifecycleOwner, boolean z) {
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolPutIfAbsent;
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolPutIfAbsent2;
        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolPutIfAbsent3;
        if (lifecycleOwner == null) {
            return null;
        }
        if (C04SX.LIZ()) {
            C0PKD.LIZIZ.getClass();
            if (!C0PKD.LIZ().isEmpty()) {
                ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC594520NTm>> concurrentHashMap = C0PKD.LJI;
                Integer numValueOf = Integer.valueOf(System.identityHashCode(interfaceC594520NTm));
                ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLIZJ = concurrentHashMap.get(numValueOf);
                if (iSearchCardProtocolLIZJ == null && (iSearchCardProtocolPutIfAbsent3 = concurrentHashMap.putIfAbsent(numValueOf, (iSearchCardProtocolLIZJ = C0PKD.LIZJ(interfaceC594520NTm)))) != null) {
                    iSearchCardProtocolLIZJ = iSearchCardProtocolPutIfAbsent3;
                }
                ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocol = iSearchCardProtocolLIZJ;
                NonMatching nonMatching = NonMatching.LL;
                if (Intrinsics.LJFF(iSearchCardProtocol, nonMatching)) {
                    if (z) {
                        C0PKD.LJII.getClass();
                        ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC594520NTm>> concurrentHashMap2 = C0PHG.LJI;
                        Integer numValueOf2 = Integer.valueOf(System.identityHashCode(interfaceC594520NTm));
                        ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLIZJ2 = concurrentHashMap2.get(numValueOf2);
                        if (iSearchCardProtocolLIZJ2 == null) {
                            C0PHG.LIZIZ.getClass();
                            iSearchCardProtocolLIZJ2 = C0PHG.LIZJ(interfaceC594520NTm);
                            ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolPutIfAbsent4 = concurrentHashMap2.putIfAbsent(numValueOf2, iSearchCardProtocolLIZJ2);
                            if (iSearchCardProtocolPutIfAbsent4 != null) {
                                iSearchCardProtocolLIZJ2 = iSearchCardProtocolPutIfAbsent4;
                            }
                        }
                        iSearchCardProtocol = iSearchCardProtocolLIZJ2;
                        if (Intrinsics.LJFF(iSearchCardProtocol, nonMatching)) {
                        }
                    }
                }
                return iSearchCardProtocol;
            }
            return null;
        }
        SearchCardContainerSharedVM searchCardContainerSharedVMLIZIZ = C0PHD.LIZIZ(lifecycleOwner, c0nmy);
        searchCardContainerSharedVMLIZIZ.vQ2();
        if (!searchCardContainerSharedVMLIZIZ.LL.isEmpty()) {
            ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC594520NTm>> concurrentHashMap3 = searchCardContainerSharedVMLIZIZ.LLILLJJLI;
            Integer numValueOf3 = Integer.valueOf(System.identityHashCode(interfaceC594520NTm));
            ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolWQ2 = concurrentHashMap3.get(numValueOf3);
            if (iSearchCardProtocolWQ2 == null && (iSearchCardProtocolPutIfAbsent2 = concurrentHashMap3.putIfAbsent(numValueOf3, (iSearchCardProtocolWQ2 = searchCardContainerSharedVMLIZIZ.wQ2(interfaceC594520NTm)))) != null) {
                iSearchCardProtocolWQ2 = iSearchCardProtocolPutIfAbsent2;
            }
            ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolWQ22 = iSearchCardProtocolWQ2;
            if (((Number) C04SW.LIZ.getValue()).intValue() == 0 && !Intrinsics.LJFF(iSearchCardProtocolWQ22, NonMatching.LL) && iSearchCardProtocolWQ22.getDataType().LIZIZ(interfaceC594520NTm) && !iSearchCardProtocolWQ22.Hd1(interfaceC594520NTm)) {
                iSearchCardProtocolWQ22 = searchCardContainerSharedVMLIZIZ.wQ2(interfaceC594520NTm);
                searchCardContainerSharedVMLIZIZ.LLILLJJLI.put(Integer.valueOf(System.identityHashCode(interfaceC594520NTm)), iSearchCardProtocolWQ22);
            }
            NonMatching nonMatching2 = NonMatching.LL;
            if (Intrinsics.LJFF(iSearchCardProtocolWQ22, nonMatching2)) {
                if (z) {
                    C0PH9 c0ph9 = searchCardContainerSharedVMLIZIZ.LLILZIL;
                    ConcurrentHashMap<Integer, ISearchCardProtocol<InterfaceC594520NTm>> concurrentHashMap4 = c0ph9.LIZIZ;
                    Integer numValueOf4 = Integer.valueOf(System.identityHashCode(interfaceC594520NTm));
                    ISearchCardProtocol<InterfaceC594520NTm> iSearchCardProtocolLIZ = concurrentHashMap4.get(numValueOf4);
                    if (iSearchCardProtocolLIZ == null && (iSearchCardProtocolPutIfAbsent = concurrentHashMap4.putIfAbsent(numValueOf4, (iSearchCardProtocolLIZ = c0ph9.LIZ(interfaceC594520NTm)))) != null) {
                        iSearchCardProtocolLIZ = iSearchCardProtocolPutIfAbsent;
                    }
                    iSearchCardProtocolWQ22 = iSearchCardProtocolLIZ;
                    if (Intrinsics.LJFF(iSearchCardProtocolWQ22, nonMatching2)) {
                    }
                }
            }
            return iSearchCardProtocolWQ22;
        }
        return null;
    }
}
