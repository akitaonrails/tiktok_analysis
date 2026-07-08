package X;

import Y.ACListenerS118S0200000_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935870aSf extends AbstractC960460b6K<InterfaceC935960aSo, C935890aSh> {
    public final Function0<Unit> LIZIZ;

    public C935870aSf(C935830aSb c935830aSb) {
        this.LIZIZ = c935830aSb;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        C935890aSh c935890aSh = new C935890aSh(context, viewGroup) { // from class: X.0aSg
            @Override // X.C935890aSh, X.AbstractC960470b6L
            public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
                I5((InterfaceC935960aSo) obj, i);
            }

            @Override // X.C935890aSh
            /* JADX INFO: renamed from: L5 */
            public final void I5(InterfaceC935960aSo interfaceC935960aSo, int i) {
                super.I5(interfaceC935960aSo, i);
                if (interfaceC935960aSo.getEnable()) {
                    C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.kc;
                    if (!c20337914i1.LIZIZ().booleanValue()) {
                        c20337914i1.LJFF(Boolean.TRUE);
                    }
                }
                if (interfaceC935960aSo instanceof C935850aSd) {
                    C935850aSd c935850aSd = (C935850aSd) interfaceC935960aSo;
                    if (c935850aSd.LJ) {
                        C786410Ut5.Pd(ObjectAnimator.ofFloat(this.itemView, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L));
                        c935850aSd.LJ = false;
                    }
                }
            }
        };
        c935890aSh.LLILLJJLI.setIcon(C20736316Cj.LIZLLL(R.attr.e86, viewGroup.getContext()));
        C786410Ut5.I7(new ACListenerS118S0200000_15(c935890aSh, this, 35), c935890aSh.itemView);
        return c935890aSh;
    }
}
