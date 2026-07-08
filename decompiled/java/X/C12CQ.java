package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.image.progressbar.ImageProgressViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.12CQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CQ extends AbstractC1643610ssB<ImageProgressViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ;
    public final C1462760oAU LLJI;
    public final int LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final Function0<Boolean> LLJJIII;
    public final C01GW LLJJIJI;

    public C12CQ() {
        throw null;
    }

    public final void G2() {
        View viewFindViewById;
        View viewFindViewById2;
        if (this.LLJJIII.invoke().booleanValue()) {
            View view = w2().mView;
            if (!(view instanceof ViewGroup) || view == null || (viewFindViewById2 = view.findViewById(R.id.g3k)) == null) {
                return;
            }
            int visibility = viewFindViewById2.getVisibility();
            viewFindViewById2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, viewFindViewById2);
            return;
        }
        View view2 = w2().mView;
        if (!(view2 instanceof ViewGroup) || view2 == null || (viewFindViewById = view2.findViewById(R.id.g3k)) == null) {
            return;
        }
        int visibility2 = viewFindViewById.getVisibility();
        viewFindViewById.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, viewFindViewById);
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<ImageProgressViewModel> W1() {
        return AFwS218S0000000_29.get$arr$(460);
    }

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        this.LLIZLLLIL.hide(w2());
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        if (!this.LLIZLLLIL.isAdded(w2())) {
            this.LLIZLLLIL.add(this.LLJ, w2(), "ImageProgressScene");
        }
        this.LLIZLLLIL.show(w2());
        G2();
    }

    public final C12CY w2() {
        return (C12CY) this.LLJJIJI.getValue();
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        this.LLIZLLLIL.add(this.LLJ, w2(), "ImageProgressScene");
        G2();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C12CQ(C1DRG c1drg, BaseScreenAdaptScene baseScreenAdaptScene, int i, C1462760oAU c1462760oAU, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AwS566S0100000_22 awS566S0100000_22, int i3) {
        i2 = (i3 & 16) != 0 ? 0 : i2;
        z2 = (i3 & 64) != 0 ? false : z2;
        z3 = (i3 & 128) != 0 ? false : z3;
        z4 = (i3 & 256) != 0 ? false : z4;
        z5 = (i3 & 512) != 0 ? false : z5;
        z6 = (i3 & 1024) != 0 ? true : z6;
        Function0<Boolean> function0 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? AFwS217S0000000_28.get$arr$(768) : awS566S0100000_22;
        this.LLIZ = c1drg;
        this.LLIZLLLIL = baseScreenAdaptScene;
        this.LLJ = i;
        this.LLJI = c1462760oAU;
        this.LLJIJIL = i2;
        this.LLJILJIL = z2;
        this.LLJILJILJ = z3;
        this.LLJILLL = z4;
        this.LLJJ = z5;
        this.LLJJI = z6;
        this.LLJJIII = function0;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1114));
    }
}
