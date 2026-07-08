package X;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.components.model.Component;
import com.ss.android.ugc.aweme.components.model.ComponentData;
import com.ss.android.ugc.aweme.components.tabs.TabParams;
import com.ss.android.ugc.aweme.layout.VerticalComponentViewModel;
import com.ss.android.ugc.aweme.service.IPgcComponentManagementService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS1S0502000_25;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674010tfD {
    public static final void LIZ(FragmentManager fragmentManager, InterfaceC1665500tRU<Component> interfaceC1665500tRU, Function1<? super AbstractC1556970qcR, Unit> function1, VerticalComponentViewModel verticalComponentViewModel, C1615420s8i c1615420s8i, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        AbstractC903280Zc6 defaultViewModelCreationExtras;
        boolean z;
        boolean z2;
        TabParams tabParams;
        int i7;
        int i8;
        C1615420s8i c1615420s8i2 = c1615420s8i;
        VerticalComponentViewModel verticalComponentViewModel2 = verticalComponentViewModel;
        Function1<? super AbstractC1556970qcR, Unit> function12 = function1;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-638576639);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(fragmentManager)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1665500tRU)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0 && c13zcLJIIJ.LJII(verticalComponentViewModel2)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJII(c1615420s8i2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
            } else {
                if (i9 != 0) {
                    function12 = null;
                }
                if ((i2 & 8) != 0) {
                    c13zcLJIIJ.LJJIJIIJIL(1729797275);
                    ViewModelStoreOwner viewModelStoreOwnerLIZ = C1685320txS.LIZ(c13zcLJIIJ);
                    if (viewModelStoreOwnerLIZ != null) {
                        if (viewModelStoreOwnerLIZ instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerLIZ).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = C903300Zc8.LIZJ;
                        }
                        ViewModel viewModelLIZIZ = C1674760tgQ.LIZIZ(VerticalComponentViewModel.class, viewModelStoreOwnerLIZ, null, defaultViewModelCreationExtras, c13zcLJIIJ);
                        c13zcLJIIJ.LJJJJL(false);
                        verticalComponentViewModel2 = (VerticalComponentViewModel) viewModelLIZIZ;
                    } else {
                        "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString();
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                }
                if ((i2 & 16) != 0) {
                    c1615420s8i2 = new C1615420s8i(0);
                }
            }
            c13zcLJIIJ.LJJJJLI();
            if (function12 != null) {
                C2252321DDq c2252321DDq = verticalComponentViewModel2.LL;
                c2252321DDq.getValue().getClass();
                c2252321DDq.setValue(new C1674040tfG(function12));
            }
            int i10 = 1849434622;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = AFwS214S0000000_25.get$arr$(119);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ((Function0) objLJJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                float f = 16;
                C1665790tRx.LIZ(c.LJI(c1685760tyA, f), c13zcLJIIJ);
                Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
                c13zcLJIIJ.LJJIIJZLJL(-969391534);
                for (Component component : interfaceC1665500tRU) {
                    if (C1674020tfE.LIZ[component.componentKey.ordinal()] == 1) {
                        c13zcLJIIJ.LJJIIJZLJL(13722335);
                        ComponentData componentData = component.data;
                        if (componentData != null && (tabParams = componentData.tabsComponent) != null) {
                            c13zcLJIIJ.LJJIIJZLJL(i10);
                            Object objLJJ2 = c13zcLJIIJ.LJJ();
                            InterfaceC1680500tpg.LIZ.getClass();
                            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                            Object obj = objLJJ2;
                            if (objLJJ2 == c1680520tpi) {
                                C20247014Ke c20247014Ke = new C20247014Ke(context);
                                c20247014Ke.setId(View.generateViewId());
                                c13zcLJIIJ.LJJIJIIJI(c20247014Ke);
                                obj = c20247014Ke;
                            }
                            C20247014Ke c20247014Ke2 = (C20247014Ke) obj;
                            c13zcLJIIJ.LJJJJL(false);
                            c13zcLJIIJ.LJJIIJZLJL(5004770);
                            boolean zLJII = c13zcLJIIJ.LJII(c20247014Ke2);
                            Object objLJJ3 = c13zcLJIIJ.LJJ();
                            if (zLJII || objLJJ3 == c1680520tpi) {
                                objLJJ3 = new AwS588S0100000_9(c20247014Ke2, 244);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            C20084413iE.LIZ(48, 4, c13zcLJIIJ, c.LIZLLL(InterfaceC1685750ty9.LIZ), (Function1) objLJJ3, null);
                            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                            boolean zLJII2 = c13zcLJIIJ.LJII(tabParams) | c13zcLJIIJ.LJII(fragmentManager) | c13zcLJIIJ.LJII(c20247014Ke2);
                            Object objLJJ4 = c13zcLJIIJ.LJJ();
                            if (zLJII2 || objLJJ4 == c1680520tpi) {
                                objLJJ4 = new C638530P2t(fragmentManager, tabParams, c20247014Ke2, null);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                            }
                            z2 = false;
                            c13zcLJIIJ.LJJJJL(false);
                            C1680540tpk.LJFF(c20247014Ke2, (Function2) objLJJ4, c13zcLJIIJ);
                        } else {
                            z2 = false;
                        }
                        c13zcLJIIJ.LJJJJL(z2);
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(15225401);
                        ComponentData componentData2 = component.data;
                        if (componentData2 == null) {
                            z = false;
                        } else {
                            IPgcComponentManagementService iPgcComponentManagementService = (IPgcComponentManagementService) c01gwLIZIZ.getValue();
                            C1674030tfF c1674030tfF = new C1674050tfH(component.componentKey, componentData2).LIZ;
                            c1674030tfF.LIZJ = c1615420s8i2;
                            c1674030tfF.LIZLLL = function12;
                            z = false;
                            iPgcComponentManagementService.LIZ(c1674030tfF, c13zcLJIIJ, 0);
                        }
                        c13zcLJIIJ.LJJJJL(z);
                    }
                    C1665790tRx.LIZ(c.LJI(InterfaceC1685750ty9.LIZ, f), c13zcLJIIJ);
                    i10 = 1849434622;
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS1S0502000_25(fragmentManager, (FragmentManager) interfaceC1665500tRU, (InterfaceC1665500tRU<Component>) function12, (Function1<? super AbstractC1556970qcR, Unit>) verticalComponentViewModel2, (VerticalComponentViewModel) c1615420s8i2, (C1615420s8i) i, i2, 0);
        }
    }
}
