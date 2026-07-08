package X;

import Y.AObserverS181S0200000_17;
import com.bytedance.android.live.CommentForceIconStyle;
import com.bytedance.android.live.CommentWidgetStyleChangeEvent;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.dataChannel.ShowAudienceInteractionFeatureToolbarChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveAudienceToolbarTimeConsumingOptimizeSetting;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0enT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102530enT extends AbstractC1102590enZ {
    public final C1099960ejK LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 600));
    public final Set<EnumC1102740eno> LIZLLL = new LinkedHashSet();
    public final Set<EnumC1102740eno> LJ = new LinkedHashSet();
    public final Set<EnumC1102740eno> LJFF = new LinkedHashSet();
    public final Set<EnumC1102740eno> LJI = new LinkedHashSet();
    public final Set<EnumC1102740eno> LJII = new LinkedHashSet();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(308));
    public final Set<EnumC1102740eno> LJIIIZ = C13LQ.LJLIIL(new EnumC1102740eno[]{EnumC1102740eno.MULTI_GUEST_MIC, EnumC1102740eno.MULTI_GUEST_VIDEO});
    public final Set<EnumC1102740eno> LJIIJ = C13LQ.LJLIIL(new EnumC1102740eno[]{EnumC1102740eno.FAST_GIFT, EnumC1102740eno.DUMMY_FAST_GIFT});
    public final Set<EnumC1102740eno> LJIIJJI = C13LQ.LJLIIL(new EnumC1102740eno[]{EnumC1102740eno.AUDIENCE_PARTNERSHIP, EnumC1102740eno.ICON_SLOT});
    public EnumC1102560enW LJIIL = EnumC1102560enW.LLILLJJLI;

    public final void LIZJ() {
        Set setLLIIIZ = C13LP.LLIIIZ(C13LP.LJLLJ(C13LP.LJJL(this.LIZLLL, this.LJIIJJI)));
        if (setLLIIIZ.size() > 1) {
            Iterator it2 = setLLIIIZ.iterator();
            while (it2.hasNext() && setLLIIIZ.size() > 1) {
                Object next = it2.next();
                this.LIZLLL.remove(next);
                this.LJII.add((EnumC1102740eno) next);
                it2.remove();
            }
            return;
        }
        if (setLLIIIZ.size() < 1) {
            Iterator<EnumC1102740eno> it3 = this.LJII.iterator();
            while (it3.hasNext() && setLLIIIZ.size() < 1) {
                EnumC1102740eno next2 = it3.next();
                this.LIZLLL.add(next2);
                setLLIIIZ.add(next2);
                it3.remove();
            }
        }
    }

    public final void LIZLLL() {
        int iLJIIIZ;
        int size;
        Set setLLIIIZ = C13LP.LLIIIZ(C13LP.LJLLJ(C13LP.LJJL(C13LP.LLIIJLIL(this.LIZLLL, this.LJ), (Set) this.LJIIIIZZ.getValue())));
        int i = C1102580enY.LIZ[this.LIZ.ordinal()];
        if (i == 1) {
            iLJIIIZ = LJIIIZ();
            size = this.LJI.size();
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            iLJIIIZ = LJIIIZ() - this.LJFF.size();
            size = this.LJI.size();
        }
        int i2 = iLJIIIZ - size;
        if (this.LIZLLL.size() > i2 && setLLIIIZ.size() > 1) {
            for (Object obj : C13LP.LJLLJ(setLLIIIZ)) {
                if (this.LIZLLL.size() >= i2) {
                    this.LIZLLL.remove(obj);
                    this.LJ.add((EnumC1102740eno) obj);
                }
            }
            if (this.LJ.size() > 1) {
                this.LIZLLL.add(EnumC1102740eno.AUDIENCE_INTERACTION_FEATURES);
                return;
            }
            this.LIZLLL.addAll(this.LJ);
            this.LIZLLL.remove(EnumC1102740eno.AUDIENCE_INTERACTION_FEATURES);
            this.LJ.clear();
            return;
        }
        if (this.LIZLLL.size() < i2 || this.LJ.size() <= 1) {
            for (Object obj2 : C13LP.LLIIIZ(C13LP.LJLLL(this.LJ))) {
                if (this.LIZLLL.size() < i2) {
                    this.LIZLLL.add((EnumC1102740eno) obj2);
                    this.LJ.remove(obj2);
                }
            }
            if (this.LJ.size() > 1) {
                this.LIZLLL.add(EnumC1102740eno.AUDIENCE_INTERACTION_FEATURES);
                return;
            }
            this.LIZLLL.addAll(this.LJ);
            this.LIZLLL.remove(EnumC1102740eno.AUDIENCE_INTERACTION_FEATURES);
            this.LJ.clear();
        }
    }

    public final void LJ() {
        if (this.LIZLLL.size() > LJIIIZ()) {
            for (Object obj : C13LP.LJLLJ(C13LP.LJLLJ(C13LP.LJJL(this.LIZLLL, this.LJIIJ)))) {
                if (this.LIZLLL.size() > LJIIIZ()) {
                    this.LIZLLL.remove(obj);
                    this.LJI.add((EnumC1102740eno) obj);
                }
            }
            return;
        }
        if (this.LIZLLL.size() < LJIIIZ()) {
            for (Object obj2 : C13LP.LLIIIZ(C13LP.LJLLL(this.LJI))) {
                if (this.LIZLLL.size() < LJIIIZ()) {
                    this.LIZLLL.add((EnumC1102740eno) obj2);
                    this.LJI.remove(obj2);
                }
            }
        }
    }

    public final void LJFF() {
        if (this.LIZLLL.size() > LJIIIZ()) {
            for (Object obj : C13LP.LJLLJ(C13LP.LJLLJ(C13LP.LJJL(this.LIZLLL, this.LJIIIZ)))) {
                if (this.LIZLLL.size() > LJIIIZ()) {
                    this.LIZLLL.remove(obj);
                    this.LJFF.add((EnumC1102740eno) obj);
                }
            }
            return;
        }
        if (this.LIZLLL.size() < LJIIIZ()) {
            for (Object obj2 : C13LP.LLIIIZ(C13LP.LJLLL(this.LJFF))) {
                if (this.LIZLLL.size() < LJIIIZ()) {
                    this.LIZLLL.add((EnumC1102740eno) obj2);
                    this.LJFF.remove(obj2);
                }
            }
        }
    }

    public final int LJIIIZ() {
        if (LiveAudienceToolbarTimeConsumingOptimizeSetting.INSTANCE.optimizeCalculate()) {
            return ((Number) this.LIZJ.getValue()).intValue();
        }
        int iLJIIZILJ = ((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(C1099910ejF.LJFF(this.LIZIZ.LIZ())))) / ((int) C497740JfY.LIZIZ(C1099730eix.LIZ(this.LIZIZ.LIZLLL)))) - 1;
        if (iLJIIZILJ > 6) {
            return 6;
        }
        return iLJIIZILJ;
    }

    public C1102530enT(C1099960ejK c1099960ejK) {
        this.LIZIZ = c1099960ejK;
        if (c1099960ejK.LIZJ.gg0(CommentForceIconStyle.class) != null) {
            LJIIIIZZ(false);
        }
        c1099960ejK.LIZJ.BQ2(c1099960ejK.LIZIZ, CommentForceIconStyle.class, new AwS596S0100000_17(this, 654));
    }

    @Override // X.AbstractC1102590enZ
    public final boolean LIZ(EnumC1102740eno enumC1102740eno) {
        return this.LJ.contains(enumC1102740eno);
    }

    public final void LJI(EnumC1102570enX enumC1102570enX) {
        int iOrdinal = enumC1102570enX.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                LIZJ();
                LIZLLL();
                LJ();
                LJFF();
            } else {
                throw new C1954807lC();
            }
        } else {
            LIZJ();
            LIZLLL();
            LJFF();
            LJ();
        }
        LJIIIIZZ(false);
        if (this.LJ.isEmpty()) {
            TBViewModel viewModel = EnumC1102740eno.AUDIENCE_INTERACTION_FEATURES.getViewModel(this.LIZIZ.LIZJ);
            if (viewModel != null) {
                viewModel.zQ2(false, false);
            }
            this.LIZIZ.LIZJ.zW(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.FALSE);
        } else {
            Iterator<EnumC1102740eno> it2 = this.LJ.iterator();
            while (it2.hasNext()) {
                TBViewModel viewModel2 = it2.next().getViewModel(this.LIZIZ.LIZJ);
                if (viewModel2 != null) {
                    viewModel2.zQ2(false, false);
                }
            }
            TBViewModel viewModel3 = EnumC1102740eno.AUDIENCE_INTERACTION_FEATURES.getViewModel(this.LIZIZ.LIZJ);
            if (viewModel3 != null) {
                viewModel3.zQ2(true, false);
            }
            this.LIZIZ.LIZJ.zW(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.TRUE);
        }
        Iterator<EnumC1102740eno> it3 = this.LJFF.iterator();
        while (it3.hasNext()) {
            TBViewModel viewModel4 = it3.next().getViewModel(this.LIZIZ.LIZJ);
            if (viewModel4 != null) {
                viewModel4.zQ2(false, false);
            }
        }
        Iterator<EnumC1102740eno> it4 = this.LJI.iterator();
        while (it4.hasNext()) {
            TBViewModel viewModel5 = it4.next().getViewModel(this.LIZIZ.LIZJ);
            if (viewModel5 != null) {
                viewModel5.zQ2(false, false);
            }
        }
        Iterator<EnumC1102740eno> it5 = this.LJII.iterator();
        while (it5.hasNext()) {
            TBViewModel viewModel6 = it5.next().getViewModel(this.LIZIZ.LIZJ);
            if (viewModel6 != null) {
                viewModel6.zQ2(false, false);
            }
        }
        Iterator<EnumC1102740eno> it6 = this.LIZLLL.iterator();
        while (it6.hasNext()) {
            TBViewModel viewModel7 = it6.next().getViewModel(this.LIZIZ.LIZJ);
            if (viewModel7 != null) {
                viewModel7.zQ2(true, false);
            }
        }
    }

    public final void LJII(EnumC1102570enX enumC1102570enX) {
        int iOrdinal = enumC1102570enX.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            LIZJ();
            LIZLLL();
            LJ();
            LJIIIIZZ(false);
            if (this.LJ.isEmpty()) {
                TBViewModel viewModel = EnumC1102740eno.AUDIENCE_INTERACTION_FEATURES.getViewModel(this.LIZIZ.LIZJ);
                if (viewModel != null) {
                    viewModel.zQ2(false, false);
                }
                this.LIZIZ.LIZJ.zW(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.FALSE);
            } else {
                Iterator<EnumC1102740eno> it2 = this.LJ.iterator();
                while (it2.hasNext()) {
                    TBViewModel viewModel2 = it2.next().getViewModel(this.LIZIZ.LIZJ);
                    if (viewModel2 != null) {
                        viewModel2.zQ2(false, false);
                    }
                }
                TBViewModel viewModel3 = EnumC1102740eno.AUDIENCE_INTERACTION_FEATURES.getViewModel(this.LIZIZ.LIZJ);
                if (viewModel3 != null) {
                    viewModel3.zQ2(true, false);
                }
                this.LIZIZ.LIZJ.zW(ShowAudienceInteractionFeatureToolbarChannel.class, Boolean.TRUE);
            }
            Iterator<EnumC1102740eno> it3 = this.LJI.iterator();
            while (it3.hasNext()) {
                TBViewModel viewModel4 = it3.next().getViewModel(this.LIZIZ.LIZJ);
                if (viewModel4 != null) {
                    viewModel4.zQ2(false, false);
                }
            }
            Iterator<EnumC1102740eno> it4 = this.LJII.iterator();
            while (it4.hasNext()) {
                TBViewModel viewModel5 = it4.next().getViewModel(this.LIZIZ.LIZJ);
                if (viewModel5 != null) {
                    viewModel5.zQ2(false, false);
                }
            }
            Iterator<EnumC1102740eno> it5 = this.LIZLLL.iterator();
            while (it5.hasNext()) {
                TBViewModel viewModel6 = it5.next().getViewModel(this.LIZIZ.LIZJ);
                if (viewModel6 != null) {
                    viewModel6.zQ2(true, false);
                }
            }
            return;
        }
        throw new C1954807lC();
    }

    public final void LJIIIIZZ(boolean z) {
        float fLJFF;
        boolean zBooleanValue;
        EnumC1102560enW enumC1102560enW;
        if (LiveAudienceToolbarTimeConsumingOptimizeSetting.INSTANCE.optimizeCalculate()) {
            fLJFF = C1099910ejF.LIZJ(this.LIZIZ.LIZ()) * 2;
        } else {
            fLJFF = C1099910ejF.LJFF(this.LIZIZ.LIZ());
        }
        float fLJJI = (C497740JfY.LJJI(C497740JfY.LJIIZILJ()) - fLJFF) - (C1099730eix.LIZ(this.LIZIZ.LIZLLL) * this.LIZLLL.size());
        Pair pair = (Pair) this.LIZIZ.LIZJ.gg0(CommentForceIconStyle.class);
        if (pair != null) {
            zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (fLJJI >= 72.0f && !zBooleanValue) {
            EnumC1102560enW enumC1102560enW2 = this.LJIIL;
            enumC1102560enW = EnumC1102560enW.LLILLJJLI;
            if (enumC1102560enW2 != enumC1102560enW || z) {
                this.LIZIZ.LIZJ.LC0(CommentWidgetStyleChangeEvent.class, Boolean.FALSE);
            }
        } else {
            EnumC1102560enW enumC1102560enW3 = this.LJIIL;
            enumC1102560enW = EnumC1102560enW.LL;
            if (enumC1102560enW3 != enumC1102560enW || z) {
                this.LIZIZ.LIZJ.LC0(CommentWidgetStyleChangeEvent.class, Boolean.TRUE);
            }
        }
        this.LJIIL = enumC1102560enW;
    }

    @Override // X.AbstractC1102590enZ
    public final void LIZIZ(EnumC1102740eno enumC1102740eno, TBViewModel tBViewModel) {
        tBViewModel.LLIZ.observe(this.LIZIZ.LIZIZ, new AObserverS181S0200000_17(this, enumC1102740eno, 11));
    }
}
