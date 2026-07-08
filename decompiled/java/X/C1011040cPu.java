package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0cPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011040cPu extends AbstractC1010700cPM {
    public final EnumC658790Psj LLILZIL;
    public ViewGroup LLILZLL;

    @Override // X.AbstractC1010700cPM
    public final void LIZIZ() {
        List<AbstractC1010710cPN<View>> list = this.LLILLL;
        if (!C0Q1P.LIZIZ(this.LLILZIL) && !C0Q1P.LIZJ(this.LLILZIL)) {
            ((ArrayList) list).add(new C1010150cOT(this.LL));
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new C1010510cP3(this.LL));
        int i = C658150Prh.LIZ[this.LL.LIZJ.ordinal()];
        if (i == 1) {
            arrayList.add(new C1011140cQ4(this.LL));
        } else if (i == 2) {
            final C1010580cPA c1010580cPA = this.LL;
            arrayList.add(new AbstractC1010710cPN<TuxIconView>(c1010580cPA) { // from class: X.0cQE
                public final TuxIconView LLILZLL;

                @Override // X.AbstractC1010710cPN, X.C0PPF
                public final void bind() {
                    TuxIconView tuxIconView = this.LLILZLL;
                    if (tuxIconView != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    }
                }

                @Override // X.AbstractC1010710cPN
                public final /* bridge */ /* synthetic */ View LIZIZ() {
                    return this.LLILZLL;
                }

                {
                    TuxIconView tuxIconView;
                    super(c1010580cPA);
                    ViewGroup viewGroup = c1010580cPA.LIZ;
                    if (viewGroup != null) {
                        tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.p_v);
                    } else {
                        tuxIconView = null;
                    }
                    this.LLILZLL = tuxIconView;
                }

                @Override // X.AbstractC1010710cPN
                public final boolean LJFF(C1010580cPA c1010580cPA2) {
                    Aweme aweme = c1010580cPA2.LJI.getAweme();
                    if (aweme != null) {
                        return C1010120cOQ.LJIL(aweme);
                    }
                    return false;
                }
            });
        }
    }

    @Override // X.AbstractC1010700cPM
    public final void LIZJ() {
        ViewGroup viewGroup = this.LL.LIZIZ;
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

    public C1011040cPu(C1010580cPA c1010580cPA, EnumC658790Psj enumC658790Psj) {
        super(c1010580cPA);
        this.LLILZIL = enumC658790Psj;
    }
}
