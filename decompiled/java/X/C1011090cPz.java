package X;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0cPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011090cPz extends AbstractC1010700cPM {
    public final ViewGroup LLILZIL;

    @Override // X.AbstractC1010700cPM
    public final void LIZIZ() {
        ((ArrayList) this.LLILLL).add(new C1011110cQ1(this.LL));
    }

    @Override // X.AbstractC1010700cPM
    public final void LIZJ() {
        ViewGroup viewGroup = this.LLILZIL;
        if (viewGroup != null) {
            C1009940cO8.LJI(viewGroup);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" param.slotView = ");
            sbLIZ.append(this.LL.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C2510609se.LIZ;
        }
    }

    public C1011090cPz(C1010580cPA c1010580cPA) {
        super(c1010580cPA);
        this.LLILZIL = c1010580cPA.LIZIZ;
    }
}
