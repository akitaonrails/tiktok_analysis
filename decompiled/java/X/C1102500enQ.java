package X;

import Y.AObserverS181S0200000_17;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorToolbarTimeConsumingOptimizeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0enQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102500enQ extends AbstractC1102590enZ {
    public final C1099960ejK LIZIZ;
    public final Set<EnumC1102740eno> LIZJ = new LinkedHashSet();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(307));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 599));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS561S0100000_17(this, 598));
    public final List<EnumC1102740eno> LJI = new ArrayList();

    public final void LIZJ() {
        int iLIZIZ = (((int) C497740JfY.LIZIZ(C1099730eix.LIZ(this.LIZIZ.LIZLLL))) * this.LIZJ.size()) + ((int) C497740JfY.LIZIZ(LiveAnchorToolbarTimeConsumingOptimizeSetting.INSTANCE.optimizeCalculate() ? C1099910ejF.LIZJ(this.LIZIZ.LIZ()) * 2 : C1099910ejF.LJFF(this.LIZIZ.LIZ())));
        if (this.LIZJ.size() > ((Number) this.LIZLLL.getValue()).intValue() || iLIZIZ > C497740JfY.LJIIZILJ()) {
            EnumC1102740eno enumC1102740eno = (EnumC1102740eno) C13LP.LJJJLL(C13LP.LJLI((Iterable) this.LJFF.getValue(), C13LP.LLIIJI(this.LJI)));
            if (enumC1102740eno == null) {
                return;
            }
            ((ArrayList) this.LJI).add(enumC1102740eno);
            this.LIZJ.remove(enumC1102740eno);
            TBViewModel viewModel = enumC1102740eno.getViewModel(this.LIZIZ.LIZJ);
            if (viewModel != null) {
                viewModel.zQ2(false, false);
                return;
            }
            return;
        }
        if (this.LIZJ.size() >= ((Number) this.LIZLLL.getValue()).intValue() || !(!((ArrayList) this.LJI).isEmpty())) {
            return;
        }
        EnumC1102740eno enumC1102740eno2 = (EnumC1102740eno) C13LP.LJJLIIIJJI(this.LJI);
        ((ArrayList) this.LJI).remove(enumC1102740eno2);
        this.LIZJ.add(enumC1102740eno2);
        TBViewModel viewModel2 = enumC1102740eno2.getViewModel(this.LIZIZ.LIZJ);
        if (viewModel2 != null) {
            viewModel2.zQ2(true, false);
        }
    }

    public C1102500enQ(C1099960ejK c1099960ejK) {
        this.LIZIZ = c1099960ejK;
    }

    @Override // X.AbstractC1102590enZ
    public final boolean LIZ(EnumC1102740eno enumC1102740eno) {
        if (C354201Zc.LJFF((LiveMode) this.LJ.getValue()) && ((ArrayList) this.LJI).contains(enumC1102740eno)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1102590enZ
    public final void LIZIZ(EnumC1102740eno enumC1102740eno, TBViewModel tBViewModel) {
        tBViewModel.LLIZ.observe(this.LIZIZ.LIZIZ, new AObserverS181S0200000_17(this, enumC1102740eno, 10));
    }
}
