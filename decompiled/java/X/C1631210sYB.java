package X;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0sYB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631210sYB implements InterfaceC1631220sYC {
    public final InterfaceC1624480sNK LL;
    public final InterfaceC1625410sOp LLILLJJLI;
    public final C1DRG LLILLL;
    public final InterfaceC1625220sOW LLILZ;
    public final InterfaceC1629880sW2 LLILZIL;
    public final InterfaceC1635560sfC LLILZLL;
    public InterfaceC1446830nkn LLIZ;
    public InterfaceC1636390sgX LLIZLLLIL;
    public InterfaceC1463990oCT LLJ;
    public AwS566S0100000_22 LLJI;
    public final boolean LLJIJIL;
    public InterfaceC1635660sfM<C1642680sqg, Fragment> LLJILJIL;
    public InterfaceC1635870sfh LLJILJILJ;
    public InterfaceC1636820shE LLJILLL;
    public final List<InterfaceC1625960sPi> LLJJ;
    public Function1<? super C1635820sfc, Unit> LLJJI;
    public final C1635820sfc LLJJIII;

    @Override // X.InterfaceC1631220sYC
    public final C1631240sYE LIZ(C19GS c19gs, FrameLayout frameLayout, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager) {
        C1635820sfc c1635820sfc;
        Function1<? super C1635820sfc, Unit> function1 = this.LLJJI;
        if (function1 != null) {
            c1635820sfc = new C1635820sfc(0, 0, null, 0, 0, 0, false, 0L, null, null, false, false, false, 131071);
            function1.invoke(c1635820sfc);
        } else {
            c1635820sfc = this.LLJJIII;
            if (c1635820sfc == null) {
                c1635820sfc = new C1635820sfc(0, 0, null, 0, 0, 0, false, 0L, null, null, false, false, false, 131071);
            }
        }
        InterfaceC1624480sNK interfaceC1624480sNK = this.LL;
        InterfaceC1625410sOp interfaceC1625410sOp = this.LLILLJJLI;
        InterfaceC1625220sOW interfaceC1625220sOW = this.LLILZ;
        InterfaceC1629880sW2 interfaceC1629880sW2 = this.LLILZIL;
        InterfaceC1635560sfC interfaceC1635560sfC = this.LLILZLL;
        C1636520sgk c1636520sgk = c1635820sfc.LJIIJJI;
        C1DRG c1drg = this.LLILLL;
        C1630880sXe c1630880sXe = new C1630880sXe(interfaceC1624480sNK, interfaceC1625410sOp, interfaceC1625220sOW, interfaceC1629880sW2, interfaceC1635560sfC, c1636520sgk, c1drg);
        C1631250sYF c1631250sYF = new C1631250sYF(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, 504);
        InterfaceC1635660sfM<C1642680sqg, Fragment> interfaceC1635660sfM = this.LLJILJIL;
        InterfaceC1635870sfh interfaceC1635870sfh = this.LLJILJILJ;
        boolean z = this.LLJIJIL;
        InterfaceC1636820shE searchStickerViewModel = this.LLJILLL;
        if (searchStickerViewModel == null) {
            searchStickerViewModel = new SearchStickerViewModel(lifecycleOwner, this.LL, this.LLILLJJLI, this.LLILZLL, c1drg);
        }
        C1631240sYE c1631240sYE = new C1631240sYE(c19gs, frameLayout, lifecycleOwner, fragmentManager, c1635820sfc, c1630880sXe, c1631250sYF, interfaceC1635660sfM, interfaceC1635870sfh, z, searchStickerViewModel);
        Iterator it2 = ((ArrayList) this.LLJJ).iterator();
        while (it2.hasNext()) {
            c1631240sYE.LLJIJIL.LIZ((InterfaceC1625960sPi) it2.next());
        }
        return c1631240sYE;
    }

    public C1631210sYB(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, C1DRG c1drg, InterfaceC1625220sOW interfaceC1625220sOW, InterfaceC1629880sW2 interfaceC1629880sW2, InterfaceC1635560sfC interfaceC1635560sfC) {
        this.LL = interfaceC1624480sNK;
        this.LLILLJJLI = interfaceC1625410sOp;
        this.LLILLL = c1drg;
        this.LLILZ = interfaceC1625220sOW;
        this.LLILZIL = interfaceC1629880sW2;
        this.LLILZLL = interfaceC1635560sfC;
        this.LLJIJIL = true;
        this.LLJILJILJ = new C1635720sfS();
        this.LLJJ = new ArrayList();
    }

    @InterfaceC1294060jmO
    public C1631210sYB(C1635820sfc c1635820sfc, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, C1DRG c1drg, InterfaceC1625220sOW interfaceC1625220sOW, InterfaceC1629880sW2 interfaceC1629880sW2, C1635530sf9 c1635530sf9) {
        this(interfaceC1624480sNK, interfaceC1625410sOp, c1drg, interfaceC1625220sOW, interfaceC1629880sW2, c1635530sf9);
        this.LLJJIII = c1635820sfc;
    }
}
