package X;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Kqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530290Kqx extends AbstractC21688119uJ {
    public final AbstractC529520Kpi LIZJ;
    public boolean LIZLLL;

    @Override // X.AbstractC21688119uJ
    public final void LJIILL() {
    }

    public C530290Kqx(AbstractC529520Kpi abstractC529520Kpi) {
        this.LIZJ = abstractC529520Kpi;
    }

    @Override // X.AbstractC21688119uJ
    public final boolean LIZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (this.LIZJ.LLLLII(viewHolder2.getBindingAdapterPosition())) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC21688119uJ
    public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        InterfaceC528100KnQ interfaceC528100KnQ;
        AbstractC529520Kpi abstractC529520Kpi = this.LIZJ;
        if (abstractC529520Kpi.LLILLL != -1) {
            C529620Kps c529620Kps = (C529620Kps) viewHolder;
            if (c529620Kps.LLJILLL != null) {
                FrameLayout frameLayout = c529620Kps.LLJILLL;
                if (frameLayout != null) {
                    C786410Ut5.qc(frameLayout, 1.0f);
                }
                FrameLayout frameLayout2 = c529620Kps.LLJILLL;
                if (frameLayout2 != null) {
                    C786410Ut5.Pb(frameLayout2, 1.0f);
                }
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int i = abstractC529520Kpi.LLILLL;
            if (adapterPosition != i && (interfaceC528100KnQ = abstractC529520Kpi.LLILZLL) != null) {
                interfaceC528100KnQ.LIZ(i, adapterPosition);
            }
            abstractC529520Kpi.LLILLL = -1;
        }
        super.LIZJ(recyclerView, viewHolder);
    }

    @Override // X.AbstractC21688119uJ
    public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (this.LIZJ.LLLLII(viewHolder.getBindingAdapterPosition())) {
            return AbstractC21688119uJ.LJIIIZ(0, 0);
        }
        return AbstractC21688119uJ.LJIIIZ(15, 0);
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        if (i != 0) {
            if (viewHolder != null) {
                C322070Cjt.LIZ.getClass();
                C322070Cjt.LIZ(100L);
                AbstractC529520Kpi abstractC529520Kpi = this.LIZJ;
                abstractC529520Kpi.getClass();
                C529620Kps c529620Kps = (C529620Kps) viewHolder;
                if (c529620Kps.LLJILLL != null) {
                    FrameLayout frameLayout = c529620Kps.LLJILLL;
                    if (frameLayout != null) {
                        C786410Ut5.Pb(frameLayout, 1.0f);
                    }
                    FrameLayout frameLayout2 = c529620Kps.LLJILLL;
                    if (frameLayout2 != null) {
                        C786410Ut5.qc(frameLayout2, 1.0f);
                    }
                }
                abstractC529520Kpi.LLILLL = viewHolder.getAdapterPosition();
                return;
            }
            return;
        }
        if (viewHolder == null) {
        }
    }

    @Override // X.AbstractC21688119uJ
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (this.LIZJ.LLLLII(viewHolder2.getBindingAdapterPosition())) {
            return false;
        }
        C322070Cjt.LIZ.getClass();
        C322070Cjt.LIZ(50L);
        this.LIZJ.LJLZ(viewHolder, viewHolder2);
        return true;
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        float height = f2;
        View view = viewHolder.itemView;
        double height2 = (((double) view.getHeight()) * 0.25d) / ((double) 2);
        double top = (((double) viewHolder.itemView.getTop()) - height2) + ((double) height);
        double height3 = ((double) (viewHolder.itemView.getHeight() * 1.25f)) + top;
        if (top < 0.0d) {
            height = -((float) (((double) viewHolder.itemView.getTop()) - height2));
        } else if (height3 > recyclerView.getHeight()) {
            height = (float) (((double) recyclerView.getHeight()) - (((double) view.getBottom()) + height2));
        }
        if (i == 2 && !z) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                this.LIZJ.getClass();
                viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(AbstractC21688119uJ.LIZLLL(recyclerView, 8)).start();
                return;
            }
            return;
        }
        super.LJIIJ(canvas, recyclerView, viewHolder, f, height, i, z);
        this.LIZLLL = true;
    }
}
