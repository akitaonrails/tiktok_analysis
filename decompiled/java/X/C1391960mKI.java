package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.sheet.intro.internal.TuxIntroPanelFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS387S0200000_21;

/* JADX INFO: renamed from: X.0mKI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391960mKI {
    public C419910GdJ LIZIZ;
    public Integer LIZJ;
    public Drawable LIZLLL;
    public Function1<? super ImageView, Unit> LJ;
    public View LJFF;
    public int LJI;
    public CharSequence LJII;
    public CharSequence LJIIIIZZ;
    public List<C1391890mKB> LJIIIZ;
    public List<? extends AbstractC1391920mKE> LJIIJ;
    public C1391990mKL LJIIJJI;
    public C1391990mKL LJIILIIL;
    public boolean LJIILJJIL;
    public View LJIILL;
    public Integer LJIILLIIL;
    public boolean LIZ = true;
    public boolean LJIIL = true;

    public final C439850HMp LIZ() {
        C1391990mKL c1391990mKL;
        CharSequence charSequence;
        TuxIntroPanelFragment tuxIntroPanelFragment = new TuxIntroPanelFragment();
        tuxIntroPanelFragment.LL = this;
        C1391990mKL c1391990mKL2 = this.LJIIJJI;
        CharSequence charSequence2 = c1391990mKL2 != null ? c1391990mKL2.LJ : null;
        tuxIntroPanelFragment.LLILLJJLI = ((charSequence2 == null || charSequence2.length() == 0) && ((c1391990mKL = this.LJIILIIL) == null || (charSequence = c1391990mKL.LJ) == null || charSequence.length() == 0) && this.LJIILL == null) ? false : true;
        C439850HMp c439850HMp = new C439850HMp();
        boolean z = this.LIZ;
        TuxPanel tuxPanel = c439850HMp.LIZ;
        tuxPanel.LLJ = z;
        tuxPanel.LLILLJJLI = tuxIntroPanelFragment;
        c439850HMp.LIZ.LLILZ = new AwS387S0200000_21(this, tuxIntroPanelFragment, 6);
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(408)));
        TuxPanel tuxPanel2 = c439850HMp.LIZ;
        tuxPanel2.LLIZ = numValueOf;
        tuxPanel2.LL = this.LJIILLIIL;
        return c439850HMp;
    }

    public final void LIZIZ(CharSequence charSequence, Function2 function2) {
        C1391990mKL c1391990mKL = new C1391990mKL();
        c1391990mKL.LIZ(charSequence);
        c1391990mKL.LIZJ = function2;
        this.LJIIJJI = c1391990mKL;
    }

    public final void LIZJ(CharSequence charSequence, Function2 function2) {
        C1391990mKL c1391990mKL = new C1391990mKL();
        c1391990mKL.LIZ(charSequence);
        c1391990mKL.LIZJ = function2;
        this.LJIILIIL = c1391990mKL;
    }
}
