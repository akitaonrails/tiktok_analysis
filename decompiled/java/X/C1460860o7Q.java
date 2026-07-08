package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0o7Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460860o7Q extends AbstractC1643610ssB<FTCEditCornerViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final C01GW LLJ;
    public final AFwS210S0000000_22 LLJI;

    @Override // X.AbstractC1643600ssA
    public final void o2() {
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FTCEditCornerViewModel> W1() {
        return this.LLJI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C1460860o7Q(C1DRG c1drg, C19A3 c19a3) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(810));
        this.LLJ = c01gwLIZIZ;
        this.LLJI = AFwS210S0000000_22.get$arr$(555);
        c19a3.add(R.id.gpa, (Scene) c01gwLIZIZ.getValue(), "FTCEditCornerScene");
    }
}
