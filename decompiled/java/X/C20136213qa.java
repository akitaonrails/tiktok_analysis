package X;

import Y.AObjectS109S0000000_3;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS126S0201000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import tiktok.communication.ComposeScope;
import tiktok.compose.scopedviewmodel.ViewModelStoreOwnerViewModel;

/* JADX INFO: renamed from: X.13qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20136213qa {
    public static final C20136313qb LIZ = new InterfaceC665370Q7z() { // from class: X.13qb
        public final C1554890qZ5 LL = new C1554890qZ5(this);
        public final String LLILLJJLI = "default scope";

        @Override // X.InterfaceC665370Q7z
        public final Object getHost() {
            return null;
        }

        @Override // X.InterfaceC665370Q7z
        public final String getKey() {
            return this.LLILLJJLI;
        }

        @Override // X.InterfaceC665370Q7z
        public final C1554890qZ5 getTree() {
            return this.LL;
        }
    };
    public static final C13DQ LIZIZ = C13ZT.LIZJ(AFwS219S0000000_30.get$arr$(218));

    /* JADX WARN: Type inference failed for: r2v6, types: [T, androidx.lifecycle.Lifecycle] */
    public static final void LIZ(ComposeScope composeScope, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        AbstractC903280Zc6 defaultViewModelCreationExtras;
        Pair pair;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1926816998);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(composeScope)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) c13zcLJIIJ.LJJIL(LIZIZ);
            if (!Intrinsics.LJFF(interfaceC665370Q7z, LIZ)) {
                composeScope.LL = interfaceC665370Q7z;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rememberViewModelStoreOwner#");
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            CharsKt__CharJVMKt.checkRadix(36);
            sbLIZ.append(Integer.toString(iLIZ, 36));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13zcLJIIJ.LJJIIJZLJL(695776504);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("rememberViewModelStoreOwner#");
            int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
            CharsKt__CharJVMKt.checkRadix(36);
            sbLIZ2.append(Integer.toString(iLIZ2, 36));
            final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            Lifecycle lifecycle = ((LifecycleOwner) c13zcLJIIJ.LJJIL(C13GF.LIZ)).getLifecycle();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new AObjectS109S0000000_3(10);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIJIIJIL(419377738);
            ViewModelStoreOwner viewModelStoreOwnerLIZ = C1685320txS.LIZ(c13zcLJIIJ);
            if (viewModelStoreOwnerLIZ != null) {
                C19566211gq c19566211gq = new C19566211gq();
                c19566211gq.LIZ(function1, C13LE.LIZ(ViewModelStoreOwnerViewModel.class));
                C19566011go c19566011goLIZIZ = c19566211gq.LIZIZ();
                if (viewModelStoreOwnerLIZ instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZ).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = C903300Zc8.LIZJ;
                }
                ViewModel viewModelLIZIZ = C1674760tgQ.LIZIZ(ViewModelStoreOwnerViewModel.class, viewModelStoreOwnerLIZ, c19566011goLIZIZ, defaultViewModelCreationExtras, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
                final ViewModelStoreOwnerViewModel viewModelStoreOwnerViewModel = (ViewModelStoreOwnerViewModel) viewModelLIZIZ;
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                if (c13zcLJIIJ.LJJ() == c1680520tpi) {
                    c13zcLJIIJ.LJJIJIIJI(new InterfaceC20035313aJ() { // from class: X.08iP
                        @Override // X.InterfaceC20035313aJ
                        public final void LIZLLL() {
                            viewModelStoreOwnerViewModel.vQ2(strLIZIZ2);
                        }

                        @Override // X.InterfaceC20035313aJ
                        public final void LJ() {
                            viewModelStoreOwnerViewModel.vQ2(strLIZIZ2);
                        }

                        @Override // X.InterfaceC20035313aJ
                        public final void LJFF() {
                            ViewModelStoreOwnerViewModel viewModelStoreOwnerViewModel2 = viewModelStoreOwnerViewModel;
                            C2192208iO c2192208iO = viewModelStoreOwnerViewModel2.LL.get(strLIZIZ2);
                            if (c2192208iO != null) {
                                C2192408iQ c2192408iQ = c2192208iO.LIZLLL;
                                c2192408iQ.LL.setCurrentState(Lifecycle.State.RESUMED);
                                C23250099c.LIZLLL(c2192208iO.LJFF, null, null, new C2182908gt(c2192208iO, null), 3);
                            }
                        }
                    });
                }
                c13zcLJIIJ.LJJJJL(false);
                C2192208iO c2192208iO = viewModelStoreOwnerViewModel.LL.get(strLIZIZ2);
                if (c2192208iO != null) {
                    if (!Intrinsics.LJFF(strLIZIZ, c2192208iO.LIZIZ)) {
                        c2192208iO.LIZIZ = strLIZIZ;
                        c2192208iO.LIZJ.LL.clear();
                    }
                    C2252321DDq c2252321DDq = c2192208iO.LJI;
                    while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), lifecycle)) {
                    }
                    pair = new Pair(c2192208iO.LIZJ, c2192208iO.LIZLLL);
                } else {
                    C2192208iO c2192208iO2 = new C2192208iO(viewModelStoreOwnerViewModel, strLIZIZ2, strLIZIZ, lifecycle);
                    viewModelStoreOwnerViewModel.LL = C2097608Jq.LJIILIIL(viewModelStoreOwnerViewModel.LL, new Pair(strLIZIZ2, c2192208iO2));
                    pair = new Pair(c2192208iO2.LIZJ, c2192208iO2.LIZLLL);
                }
                Object first = pair.getFirst();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) pair.getSecond();
                c13zcLJIIJ.LJJJJL(false);
                ?? lifecycle2 = lifecycleOwner.getLifecycle();
                C20136513qd c20136513qd = composeScope.LLILLJJLI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ComposeScope.LLILZ;
                c20136513qd.LL = lifecycle2;
                C13ZT.LIZIZ(new C13DO[]{LIZIZ.LIZJ(C1558420qem.LIZIZ(composeScope)), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().LIZJ(lifecycleOwner), C1685320txS.LIZ.LIZJ(first)}, function2, c13zcLJIIJ, (i2 & 112) | 8);
            } else {
                "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString();
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS126S0201000_30(composeScope, (ComposeScope) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, 8);
        }
    }
}
