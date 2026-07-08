package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011020cPs extends AbstractC1010700cPM {
    public final ViewGroup LLILZIL;
    public ViewGroup LLILZLL;

    @Override // X.AbstractC1010700cPM
    public final void LIZIZ() {
        ArrayList arrayList = (ArrayList) this.LLILLL;
        arrayList.add(new C1010150cOT(this.LL));
        arrayList.add(new C1011140cQ4(this.LL));
        arrayList.add(new C1011030cPt(this.LL));
        arrayList.add(new C1010510cP3(this.LL));
        arrayList.add(new C1010970cPn(this.LL));
        arrayList.add(new C1011120cQ2(this.LL));
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
            View viewLIZJ = C1009940cO8.LIZJ(viewGroup.getContext(), viewGroup);
            this.LLILZLL = viewLIZJ instanceof ViewGroup ? (ViewGroup) viewLIZJ : null;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("inflate bottom componentGroupView = ");
            sbLIZ2.append(this.LLILZLL);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // X.AbstractC1010700cPM, X.C0PPF
    public final void bind() {
        super.bind();
        InterfaceC1011430cQX interfaceC1011430cQX = this.LL.LIZLLL;
        if (interfaceC1011430cQX != null) {
            interfaceC1011430cQX.LIZLLL(EnumC1011130cQ3.MASK_SHOW, new AwS560S0100000_16(this, 751));
        }
        InterfaceC1011430cQX interfaceC1011430cQX2 = this.LL.LIZLLL;
        if (interfaceC1011430cQX2 != null) {
            interfaceC1011430cQX2.LIZLLL(EnumC1011130cQ3.MASK_HIDE, new AwS560S0100000_16(this, 752));
        }
    }

    public C1011020cPs(C1010580cPA c1010580cPA) {
        super(c1010580cPA);
        this.LLILZIL = c1010580cPA.LIZIZ;
    }
}
