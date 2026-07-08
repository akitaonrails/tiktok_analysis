package X;

import X.AbstractC1111020f1A;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mr0.x;

/* JADX INFO: renamed from: X.0f2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1111810f2R<MODEL extends x, VH extends AbstractC1111020f1A<MODEL>> extends C0J8P<MODEL, VH> {
    public C1109770ez9 LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public AbstractC1111020f1A LJ;

    public abstract int LJIIIIZZ();

    public LayoutInflater LJIIIZ(LayoutInflater layoutInflater) {
        return layoutInflater;
    }

    public String LJIIJ() {
        return "unknown";
    }

    public boolean LJIIL() {
        return this instanceof C1111580f24;
    }

    public abstract VH LJIILJJIL(View view);

    public final C1109770ez9 LJIIJJI() {
        C1109770ez9 c1109770ez9 = this.LIZIZ;
        if (c1109770ez9 != null) {
            return c1109770ez9;
        }
        return null;
    }

    @Override // X.C0J8P
    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        AbstractC1111020f1A<? extends InterfaceC1112060f2q> abstractC1111020f1A = (AbstractC1111020f1A) viewHolder;
        abstractC1111020f1A.LLIILZL();
        LJIIJJI().LJIIJJI.LJJJ(abstractC1111020f1A);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public void LJFF(VH vh) {
        vh.onViewAttachedToWindow();
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJIILLIIL, reason: merged with bridge method [inline-methods] */
    public void LJI(VH vh) {
        vh.onViewDetachedFromWindow();
        this.LIZJ = 0;
        this.LJ = null;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        boolean zLJI = MethodIDManager.LJI(202261);
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) obj;
        boolean zLJI2 = MethodIDManager.LJI(202261);
        LJIIJJI().LJIIJJI.LJJJJ(interfaceC1112060f2q);
        interfaceC1112060f2q.LJJJZ().LIZJ++;
        interfaceC1112060f2q.LJJIJIIJIL();
        ((AbstractC1111020f1A) viewHolder).L5(LJIIJJI(), interfaceC1112060f2q);
        interfaceC1112060f2q.LJZ();
        LJIIJJI().LJIIJJI.LJJJJL(interfaceC1112060f2q);
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewLIZJ;
        LJIIJJI().LJIIJJI.LJJJJIZL(this);
        if (LJIIL()) {
            int iLJIIIIZZ = LJIIIIZZ();
            LayoutInflater layoutInflaterLJIIIZ = LJIIIZ(layoutInflater);
            if (!Intrinsics.LJFF(layoutInflaterLJIIIZ, layoutInflater)) {
                viewLIZJ = C786410Ut5.Td(layoutInflaterLJIIIZ, iLJIIIIZZ, viewGroup, false);
            } else {
                viewLIZJ = C0J3Y.LIZ.LJI(iLJIIIIZZ);
                if (viewLIZJ == null) {
                    viewLIZJ = C500260Jjc.LJIILL(iLJIIIIZZ, viewGroup, false);
                }
            }
            if (viewLIZJ.getLayoutParams() == null && (viewGroup instanceof RecyclerView)) {
                C786410Ut5.W5(viewLIZJ, new RecyclerView.LayoutParams(-1, -2));
            }
        } else {
            viewLIZJ = C485880J3q.LIZ.LIZJ(R.layout.d7n, viewGroup, false);
            ViewGroup viewGroup2 = (ViewGroup) viewLIZJ.findViewById(R.id.eqx);
            int iLJIIIIZZ2 = LJIIIIZZ();
            LayoutInflater layoutInflaterLJIIIZ2 = LJIIIZ(layoutInflater);
            if (!Intrinsics.LJFF(layoutInflaterLJIIIZ2, layoutInflater)) {
                viewGroup2.addView(C786410Ut5.Td(layoutInflaterLJIIIZ2, iLJIIIIZZ2, viewGroup2, false));
            } else {
                View viewLJI = C0J3Y.LIZ.LJI(iLJIIIIZZ2);
                if (viewLJI == null) {
                    viewLJI = C500260Jjc.LJIILL(iLJIIIIZZ2, viewGroup, false);
                }
                viewGroup2.addView(viewLJI);
            }
        }
        LJIIJJI().LJIIJJI.LJJIIZI(this);
        return LJIILJJIL(viewLIZJ);
    }

    @Override // X.C0J8P
    public final /* bridge */ /* synthetic */ void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        boolean zLJI = MethodIDManager.LJI(202261);
        LJIILIIL((AbstractC1111020f1A) viewHolder, (InterfaceC1112060f2q) obj, list);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIILIIL(VH vh, MODEL model, List<Object> list) {
        C1110880f0w c1110880f0wLJJJZ;
        MODEL model2;
        C1110880f0w c1110880f0wLJJJZ2;
        MODEL model3;
        InterfaceC1111830f2T interfaceC1111830f2T;
        boolean zLJI = MethodIDManager.LJI(202261);
        LJIIJJI().LJIIJJI.LJJJJ(model);
        LJIIJJI().LJIIJJI.LJIIL(vh, this);
        this.LJ = vh;
        KeyEvent.Callback callback = vh.itemView;
        if ((callback instanceof InterfaceC1111830f2T) && (interfaceC1111830f2T = (InterfaceC1111830f2T) callback) != null) {
            interfaceC1111830f2T.setViewBinder(this);
        }
        model.LJJJZ().LIZLLL = SystemClock.uptimeMillis();
        model.LJJJZ().LIZJ++;
        model.LJJIJIIJIL();
        if (!Intrinsics.LJFF(vh.LLILLJJLI, model) && (model2 = vh.LLILLJJLI) != null && (c1110880f0wLJJJZ2 = model2.LJJJZ()) != null && c1110880f0wLJJJZ2.LJFF > 0 && (model3 = vh.LLILLJJLI) != null) {
            model3.LJJJJL(true);
        }
        if (vh.itemView.isAttachedToWindow() && (c1110880f0wLJJJZ = model.LJJJZ()) != null && c1110880f0wLJJJZ.LJFF == 0) {
            model.onAttach();
        }
        vh.N5(LJIIJJI(), model, list);
        model.LJZ();
        model.LJJJZ().LJ = SystemClock.uptimeMillis();
        LJIIJJI().LJIIJJI.LJJJJL(model);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
