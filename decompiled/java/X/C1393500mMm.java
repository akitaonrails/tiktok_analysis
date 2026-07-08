package X;

import Y.ACallableS249S0200000_21;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393500mMm implements InterfaceC704770Rkh, ViewModelStoreOwner {
    public static final ArrayList<InterfaceC1393680mN4> LLJ = new ArrayList<>();
    public ViewModelStore LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public LifecycleOwner LLILLL;
    public final C1393590mMv LLILZ = new C1393590mMv();
    public final C1393580mMu LLILZIL = new C1393580mMu();
    public C712520RxC LLILZLL;
    public AnchorEventCenter LLIZ;
    public int LLIZLLLIL;

    @Override // X.InterfaceC704770Rkh
    public final void LJJJJZI() {
        this.LLILZLL = null;
    }

    @Override // X.InterfaceC704770Rkh
    public final List<AnchorCommonStruct> Ea() {
        List<InterfaceC1393560mMs> listLJIILL;
        ArrayList arrayList = new ArrayList();
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null && (listLJIILL = c712520RxC.LJIILL()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC1393560mMs interfaceC1393560mMs : listLJIILL) {
                if (interfaceC1393560mMs instanceof AbstractC1066890drz) {
                    arrayList2.add(interfaceC1393560mMs);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AnchorCommonStruct anchorCommonStruct = ((AbstractC1066890drz) it2.next()).LLIZ;
                if (anchorCommonStruct != null) {
                    arrayList.add(anchorCommonStruct);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC704770Rkh
    public final void LIZ() {
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null) {
            LIZIZ().LIZJ(c712520RxC);
        }
    }

    public final C1393570mMt LIZIZ() {
        C712520RxC c712520RxC = this.LLILZLL;
        C1393570mMt c1393570mMt = (c712520RxC == null || !C1392650mLP.LIZIZ(c712520RxC)) ? this.LLILZIL : this.LLILZ;
        c1393570mMt.LIZ = this.LLIZ;
        return c1393570mMt;
    }

    @Override // X.InterfaceC704770Rkh
    public final void LJJJJZ() {
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null) {
            C15O7.LIZIZ(new ACallableS249S0200000_21(this, c712520RxC, 4), C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC704770Rkh
    public final InterfaceC1393560mMs LJJJLZIJ() {
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null) {
            return c712520RxC.LJIILLIIL();
        }
        return null;
    }

    @Override // X.InterfaceC704770Rkh
    public final boolean LJJJZ() {
        List<InterfaceC1393560mMs> listLJIILL;
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC == null || (listLJIILL = c712520RxC.LJIILL()) == null) {
            return false;
        }
        return !listLJIILL.isEmpty();
    }

    @Override // X.InterfaceC704770Rkh
    public final Aweme LJJLIIIJJIZ() {
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null) {
            return c712520RxC.LIZIZ.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC704770Rkh
    public final Map<String, String> getStayTimeBizExtraMap() {
        InterfaceC1393560mMs interfaceC1393560mMsLJIILLIIL;
        C1400390mXt anchorMobConfiguration;
        Function0<? extends Map<String, String>> function0;
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC == null || (interfaceC1393560mMsLJIILLIIL = c712520RxC.LJIILLIIL()) == null || (anchorMobConfiguration = interfaceC1393560mMsLJIILLIIL.getAnchorMobConfiguration()) == null || (function0 = anchorMobConfiguration.LIZLLL) == null) {
            return null;
        }
        return function0.invoke();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore = this.LL;
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.LL = viewModelStore2;
        return viewModelStore2;
    }

    @Override // X.InterfaceC704770Rkh
    public final void onBind() {
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null) {
            C15O7.LIZIZ(new ACallableS249S0200000_21(this, c712520RxC, 3), C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC704770Rkh
    public final void onDestroy() {
        ViewModelStore viewModelStore = this.LL;
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC704770Rkh
    public final Map<String, String> yi() {
        InterfaceC1393560mMs interfaceC1393560mMsLJIILLIIL;
        C1400390mXt anchorMobConfiguration;
        Function0<? extends Map<String, String>> function0;
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC == null || (interfaceC1393560mMsLJIILLIIL = c712520RxC.LJIILLIIL()) == null || (anchorMobConfiguration = interfaceC1393560mMsLJIILLIIL.getAnchorMobConfiguration()) == null || (function0 = anchorMobConfiguration.LJ) == null) {
            return null;
        }
        return function0.invoke();
    }

    @Override // X.InterfaceC704770Rkh
    public final void LJJLIIIJILLIZJL() {
        LIZIZ().LJIIJ();
    }

    @Override // X.InterfaceC704770Rkh
    public final int LJJLIIIJJI() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC704770Rkh
    public final void LJJJLL(final InterfaceC705550Rlx interfaceC705550Rlx) {
        final C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null) {
            C15O7.LIZIZ(new Callable() { // from class: X.0mMo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("TagMultiHandler@6c09.onCurPhotoIndexChange$1$1");
                    this.LL.LIZIZ().LIZLLL(interfaceC705550Rlx, c712520RxC);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TagMultiHandler@6c09.onCurPhotoIndexChange$1$1");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC704770Rkh
    public final void LJJL(final InterfaceC705550Rlx interfaceC705550Rlx) {
        final C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null) {
            c712520RxC.LIZIZ.LIZ.getAid();
            C15O7.LIZIZ(new Callable() { // from class: X.0mMn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("TagMultiHandler@6c09.onVideoViewHolderPageSelected$1$1");
                    this.LL.LIZIZ().LIZLLL(interfaceC705550Rlx, c712520RxC);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TagMultiHandler@6c09.onVideoViewHolderPageSelected$1$1");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC704770Rkh
    public final void LJJLI(boolean z) {
        List<InterfaceC1393560mMs> listLJIILL;
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null && (listLJIILL = c712520RxC.LJIILL()) != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1393560mMs interfaceC1393560mMs : listLJIILL) {
                if (interfaceC1393560mMs instanceof AbstractC1066890drz) {
                    arrayList.add(interfaceC1393560mMs);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((AbstractC1066890drz) it2.next()).LJJI(z);
            }
        }
    }

    @Override // X.InterfaceC704770Rkh
    public final int LJJLIIIIJ(InterfaceC705550Rlx interfaceC705550Rlx) {
        Aweme awemeLJJLIIIJJIZ = LJJLIIIJJIZ();
        if (awemeLJJLIIIJJIZ != null) {
            awemeLJJLIIIJJIZ.getAid();
        }
        new AwS565S0100000_21(interfaceC705550Rlx, 827);
        C712520RxC c712520RxC = this.LLILZLL;
        if (c712520RxC != null) {
            if (!interfaceC705550Rlx.LJIIIZ()) {
                this.LLIZLLLIL = c712520RxC.LJIIJ();
            }
            int i = this.LLIZLLLIL;
            if (i != 0) {
                if (i != 1) {
                    LIZIZ().LJ(interfaceC705550Rlx, c712520RxC);
                } else {
                    LIZIZ().LJFF(interfaceC705550Rlx, c712520RxC);
                }
                return this.LLIZLLLIL;
            }
        }
        return 0;
    }

    @Override // X.InterfaceC704770Rkh
    public final void LJJJLIIL(LifecycleOwner lifecycleOwner, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = lifecycleOwner;
        if (this.LLIZ == null) {
            AnchorEventCenter anchorEventCenter = (AnchorEventCenter) new ViewModelProvider(this).get(AnchorEventCenter.class);
            anchorEventCenter.LLILLL = lifecycleOwner;
            this.LLIZ = anchorEventCenter;
        }
    }

    @Override // X.InterfaceC704770Rkh
    public final int LJJLIIIJ(C712510RxB c712510RxB, InterfaceC704550RkL interfaceC704550RkL) {
        C712520RxC c712520RxCLIZ = C712530RxD.LIZ(this.LLILLJJLI, c712510RxB, "video_anchor", C1392650mLP.LIZ(c712510RxB), interfaceC704550RkL);
        c712510RxB.LIZ.getAid();
        AnchorEventCenter anchorEventCenter = this.LLIZ;
        if (anchorEventCenter != null) {
            anchorEventCenter.CQ2();
            c712520RxCLIZ.LJIIZILJ(anchorEventCenter);
        }
        int iLJIIJ = c712520RxCLIZ.LJIIJ();
        this.LLIZLLLIL = iLJIIJ;
        if (iLJIIJ == 0) {
            this.LLILZLL = null;
            return 0;
        }
        this.LLILZLL = c712520RxCLIZ;
        return C386801es.DEFAULT;
    }
}
