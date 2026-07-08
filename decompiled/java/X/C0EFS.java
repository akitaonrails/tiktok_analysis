package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS406S0200000_5;

/* JADX INFO: renamed from: X.0EFS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFS extends AbstractC21688119uJ {
    public final float LIZJ = C418440Gaw.LIZIZ(1);
    public final float LIZLLL = C418440Gaw.LIZIZ(4);
    public final float LJ = C418440Gaw.LIZIZ(24);
    public final C01GW LJFF;
    public boolean LJI;
    public Pair<Integer, Integer> LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public final /* synthetic */ C0EFO LJIIJ;

    @Override // X.AbstractC21688119uJ
    public final float LJ() {
        return 0.75f;
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILL() {
    }

    public C0EFS(C0EFO c0efo) {
        this.LJIIJ = c0efo;
        this.LJFF = C452501pT.LIZIZ(new AwS406S0200000_5(c0efo, this, 68));
    }

    @Override // X.AbstractC21688119uJ
    public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.LIZJ(recyclerView, viewHolder);
        this.LJI = false;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearView,position:");
        sbLIZ.append(viewHolder.getBindingAdapterPosition());
        C201955140j.LIZLLL(c563650M8t, "FreeLayerPanelScene", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC21688119uJ
    public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return AbstractC21688119uJ.LJIIIZ(3, 0);
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        Integer numValueOf;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelectedChanged,actionState:");
        sbLIZ.append(i);
        sbLIZ.append("  position:");
        Integer numValueOf2 = null;
        if (viewHolder != null) {
            numValueOf = Integer.valueOf(viewHolder.getBindingAdapterPosition());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C201955140j.LIZLLL(c563650M8t, "FreeLayerPanelScene", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 0) {
            if (i == 2) {
                if (viewHolder != null) {
                    numValueOf2 = Integer.valueOf(viewHolder.getBindingAdapterPosition());
                }
                this.LJIIIIZZ = numValueOf2;
                if (numValueOf2 != null) {
                    this.LJIIJ.LLLLIL().LJ.invoke(Integer.valueOf(numValueOf2.intValue()));
                    return;
                }
                return;
            }
            return;
        }
        Integer num = this.LJIIIIZZ;
        Integer num2 = this.LJIIIZ;
        if (num != null && num2 != null) {
            this.LJIIJ.LLLLIL().LJFF.invoke(num, num2);
        }
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
    }

    @Override // X.AbstractC21688119uJ
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        Integer numValueOf;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChildDraw---2 .onMove,from:");
        sbLIZ.append(viewHolder.getBindingAdapterPosition());
        sbLIZ.append(" to:");
        sbLIZ.append(viewHolder2.getBindingAdapterPosition());
        C201955140j.LIZLLL(c563650M8t, "FreeLayerPanelScene", C2188811AlT.LIZIZ(sbLIZ));
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
        C0EFL c0efl = this.LJIIJ.LLJJJIL;
        C352950Dsb c352950Dsb = (C352950Dsb) C13LP.LJJJLZIJ(bindingAdapterPosition, c0efl.LL);
        Integer numValueOf2 = null;
        if (c352950Dsb != null) {
            numValueOf2 = Integer.valueOf(c352950Dsb.LIZLLL);
        }
        C352950Dsb c352950Dsb2 = (C352950Dsb) C13LP.LJJJLZIJ(bindingAdapterPosition2, c0efl.LL);
        if (c352950Dsb2 != null && (numValueOf = Integer.valueOf(c352950Dsb2.LIZLLL)) != null) {
            int iIntValue = numValueOf.intValue();
            C352950Dsb c352950Dsb3 = (C352950Dsb) C13LP.LJJJLZIJ(bindingAdapterPosition, c0efl.LL);
            if (c352950Dsb3 != null) {
                c352950Dsb3.LIZLLL = iIntValue;
            }
            c0efl.notifyItemChanged(bindingAdapterPosition, C0EFQ.LAYER_UPDATE);
        }
        if (numValueOf2 != null) {
            int iIntValue2 = numValueOf2.intValue();
            C352950Dsb c352950Dsb4 = (C352950Dsb) C13LP.LJJJLZIJ(bindingAdapterPosition2, c0efl.LL);
            if (c352950Dsb4 != null) {
                c352950Dsb4.LIZLLL = iIntValue2;
            }
            c0efl.notifyItemChanged(bindingAdapterPosition2, C0EFQ.LAYER_UPDATE);
        }
        List<C352950Dsb> list = c0efl.LL;
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition2 >= 0) {
            ArrayList arrayList = (ArrayList) list;
            if (bindingAdapterPosition < arrayList.size() && bindingAdapterPosition2 < arrayList.size() && bindingAdapterPosition != bindingAdapterPosition2) {
                Object obj = ListProtector.get(arrayList, bindingAdapterPosition);
                ListProtector.set(arrayList, bindingAdapterPosition, ListProtector.get(arrayList, bindingAdapterPosition2));
                ListProtector.set(arrayList, bindingAdapterPosition2, obj);
            }
        }
        c0efl.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        viewHolder2.itemView.getBottom();
        this.LJIIIZ = Integer.valueOf(bindingAdapterPosition2);
        this.LJI = true;
        this.LJII = new Pair<>(Integer.valueOf(bindingAdapterPosition), Integer.valueOf(bindingAdapterPosition2));
        Context context = recyclerView.getContext();
        if (context != null) {
            new C0ZDN(context).LIZ(0);
        }
        return true;
    }

    @Override // X.AbstractC21688119uJ
    public final RecyclerView.ViewHolder LIZIZ(RecyclerView.ViewHolder viewHolder, List<? extends RecyclerView.ViewHolder> list, int i, int i2) {
        if (list.size() == 1) {
            return (RecyclerView.ViewHolder) ListProtector.get(list, 0);
        }
        return super.LIZIZ(viewHolder, list, i, i2);
    }

    @Override // X.AbstractC21688119uJ
    public final int LJI(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        float fLIZIZ;
        int iLJI = super.LJI(recyclerView, i, i2, i3, j);
        if (Math.abs(iLJI) < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))) {
            if (iLJI < 0) {
                fLIZIZ = C418440Gaw.LIZIZ(-3);
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(3);
            }
            return C814420VxA.LIZIZ(fLIZIZ);
        }
        return iLJI;
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        boolean z2;
        boolean z3;
        RecyclerView recyclerView2;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2;
        View view2;
        Canvas canvas2 = canvas;
        if (this.LJI) {
            Pair<Integer, Integer> pair = this.LJII;
            if (pair == null) {
                return;
            }
            int iIntValue = pair.getFirst().intValue();
            int iIntValue2 = pair.getSecond().intValue();
            int width = 0;
            if (iIntValue2 > iIntValue) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (iIntValue2 < iIntValue) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2) {
                RecyclerView recyclerView3 = this.LJIIJ.LLJJJJ;
                if (recyclerView3 != null && (viewHolderFindViewHolderForAdapterPosition2 = recyclerView3.findViewHolderForAdapterPosition(iIntValue2 + 1)) != null && (view2 = viewHolderFindViewHolderForAdapterPosition2.itemView) != null) {
                    float top = view2.getTop() - this.LIZLLL;
                    RecyclerView recyclerView4 = this.LJIIJ.LLJJJJ;
                    if (recyclerView4 != null) {
                        width = recyclerView4.getWidth();
                    }
                    float f3 = this.LJ;
                    float f4 = width - f3;
                    if (f4 > 0.0f) {
                        canvas2 = canvas2;
                        canvas2.drawLine(f3, top, f4, top, (Paint) this.LJFF.getValue());
                    }
                }
            } else if (z3 && (recyclerView2 = this.LJIIJ.LLJJJJ) != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iIntValue2 - 1)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                float bottom = view.getBottom() + this.LIZLLL;
                RecyclerView recyclerView5 = this.LJIIJ.LLJJJJ;
                if (recyclerView5 != null) {
                    width = recyclerView5.getWidth();
                }
                float f5 = this.LJ;
                float f6 = width - f5;
                if (f6 > 0.0f) {
                    canvas2 = canvas2;
                    canvas2.drawLine(f5, bottom, f6, bottom, (Paint) this.LJFF.getValue());
                }
            }
        }
        super.LJIIJ(canvas2, recyclerView, viewHolder, f, f2, i, z);
    }
}
