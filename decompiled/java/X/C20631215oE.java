package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15oE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20631215oE extends AbstractC712240Rwk implements InterfaceC21676519sR {
    public final AbstractC20603615jm LL;
    public final C20632315oP LLILLJJLI;
    public final RecyclerView LLILLL;
    public PowerCell<?> LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i) {
        PowerCell<?> powerCell;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LLILLL.findViewHolderForAdapterPosition(i);
        if ((viewHolderFindViewHolderForAdapterPosition instanceof PowerCell) && (powerCell = (PowerCell) viewHolderFindViewHolderForAdapterPosition) != 0 && !Intrinsics.LJFF(powerCell, this.LLILZ)) {
            C0SMO c0smo = this.LLILZ;
            if (c0smo instanceof InterfaceC20631915oL) {
                ((InterfaceC20631915oL) c0smo).Z4();
            }
            if (powerCell instanceof InterfaceC20631915oL) {
                ((InterfaceC20631915oL) powerCell).onPageSelected(i);
            }
            this.LLILZ = powerCell;
        }
    }

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
        LIZ(this.LLILLJJLI.getCurrentItem());
    }

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
        C0SMO c0smo;
        RecyclerView.ViewHolder childViewHolder = this.LLILLL.getChildViewHolder(view);
        if ((childViewHolder instanceof PowerCell) && (c0smo = (PowerCell) childViewHolder) != null && Intrinsics.LJFF(c0smo, this.LLILZ)) {
            if (c0smo instanceof InterfaceC20631915oL) {
                ((InterfaceC20631915oL) c0smo).Z4();
            }
            this.LLILZ = null;
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        LIZ(i);
    }

    public C20631215oE(AbstractC20603615jm abstractC20603615jm, C20632315oP c20632315oP, RecyclerView recyclerView) {
        this.LL = abstractC20603615jm;
        this.LLILLJJLI = c20632315oP;
        this.LLILLL = recyclerView;
    }
}
