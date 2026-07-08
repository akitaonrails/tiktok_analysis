package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;

/* JADX INFO: renamed from: X.12G2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12G2 extends AbstractC21688119uJ {
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final /* synthetic */ C12G1 LJFF;

    @Override // X.AbstractC21688119uJ
    public final void LJIILL() {
    }

    public C12G2(C12G1 c12g1) {
        this.LJFF = c12g1;
    }

    public final boolean LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        if (this.LJFF.LLLLLL().LLLII(viewHolder.getBindingAdapterPosition()) && !this.LJFF.LLLLIL().LJIIIZ.invoke().booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165 A[PHI: r9
      0x0165: PHI (r9v1 boolean) = (r9v0 boolean), (r9v3 boolean) binds: [B:82:0x0161, B:43:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC21688119uJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(androidx.recyclerview.widget.RecyclerView r11, androidx.recyclerview.widget.RecyclerView.ViewHolder r12) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12G2.LIZJ(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
    }

    @Override // X.AbstractC21688119uJ
    public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (!LJIILLIIL(viewHolder)) {
            return 0;
        }
        C12G1 c12g1 = this.LJFF;
        C1461820o8y c1461820o8y = c12g1.LLLII;
        VideoPublishEditModel videoPublishEditModelLLLLLLIL = c12g1.LLLLLLIL();
        c1461820o8y.getClass();
        if (C1461820o8y.LIZ(videoPublishEditModelLLLLLLIL)) {
            this.LJFF.LLLLZIL(AFwS273S0000000_29.get$arr$(83));
            return 0;
        }
        return AbstractC21688119uJ.LJIIIZ(15, 0);
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        View view;
        View view2;
        if (viewHolder == null || !LJIILLIIL(viewHolder)) {
            return;
        }
        C12G1 c12g1 = this.LJFF;
        C1461820o8y c1461820o8y = c12g1.LLLII;
        VideoPublishEditModel videoPublishEditModelLLLLLLIL = c12g1.LLLLLLIL();
        c1461820o8y.getClass();
        if (C1461820o8y.LIZ(videoPublishEditModelLLLLLLIL)) {
            this.LJFF.LLLLZIL(AFwS273S0000000_29.get$arr$(84));
            return;
        }
        TuxIconView tuxIconView = this.LJFF.LLJJJJLIIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C337180DJs.LIZ(tuxIconView);
        InterfaceC19726212Fw interfaceC19726212Fw = this.LJFF.LLJLLIL;
        if (interfaceC19726212Fw != null && (view2 = interfaceC19726212Fw.getView()) != null) {
            C337180DJs.LIZ(view2);
        }
        C12GJ c12gjLLLLLL = this.LJFF.LLLLLL();
        c12gjLLLLLL.getClass();
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        c12gjLLLLLL.LLJI = Integer.valueOf(bindingAdapterPosition);
        C12GI c12gi = c12gjLLLLLL.LLJ;
        if (c12gi != null) {
            c12gi.LIZJ(bindingAdapterPosition);
        }
        c12gjLLLLLL.LLJIJIL = true;
        c12gjLLLLLL.LLILZIL = c12gjLLLLLL.LLILZLL;
        C421030Gf7 c421030Gf7 = c12gjLLLLLL.LLIZ;
        if (c421030Gf7 != null && (view = c421030Gf7.itemView) != null) {
            C368610Ecl.LIZ(view);
        }
        if (i != 0) {
            C786410Ut5.T4(viewHolder.itemView, 0.9f);
        }
    }

    @Override // X.AbstractC21688119uJ
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C12GJ c12gjLLLLLL = this.LJFF.LLLLLL();
        c12gjLLLLLL.getClass();
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
        if (!c12gjLLLLLL.LLLII(bindingAdapterPosition) || !c12gjLLLLLL.LLLII(bindingAdapterPosition2)) {
            return false;
        }
        int i = c12gjLLLLLL.LLILZLL;
        if (bindingAdapterPosition == i) {
            c12gjLLLLLL.LLILZLL = bindingAdapterPosition2;
        } else if (bindingAdapterPosition <= bindingAdapterPosition2) {
            if (bindingAdapterPosition <= i && i <= bindingAdapterPosition2) {
                c12gjLLLLLL.LLILZLL = i - 1;
            }
        } else if (bindingAdapterPosition2 <= i && i <= bindingAdapterPosition) {
            c12gjLLLLLL.LLILZLL = i + 1;
        }
        List<C12GP> list = c12gjLLLLLL.LLILZ;
        ListProtector.add(list, bindingAdapterPosition2, ListProtector.remove(list, bindingAdapterPosition));
        c12gjLLLLLL.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C12GI c12gi = c12gjLLLLLL.LLJ;
        if (c12gi != null) {
            c12gi.LIZLLL();
        }
        return true;
    }

    @Override // X.AbstractC21688119uJ
    public final int LJI(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        if (this.LIZJ) {
            return 0;
        }
        return super.LJI(recyclerView, i, i2, i3, j);
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        boolean z2 = true;
        C1295960jpS c1295960jpS = null;
        View view = null;
        View view2 = null;
        float f3 = 1.0f;
        if (z) {
            View view3 = this.LJFF.LLJJJJ;
            if (view3 == null) {
                view3 = null;
            }
            if (C1428310nGv.LIZLLL(view3).top == 0.0f) {
                View view4 = this.LJFF.LLJJJJ;
                if (view4 != null) {
                    view = view4;
                }
                C337180DJs.LIZJ(view);
                C01TT.LIZJ(new AwS273S0300000_29(this, this.LJFF, viewHolder, 3));
            } else {
                this.LIZJ = this.LJFF.LLLLLLLLLL(viewHolder);
                float f4 = C1428310nGv.LIZLLL(viewHolder.itemView).bottom;
                View view5 = this.LJFF.LLJJJJ;
                if (view5 != null) {
                    view2 = view5;
                }
                if (f4 <= C1428310nGv.LIZLLL(view2).top) {
                    z2 = false;
                }
                this.LJ = z2;
                this.LJFF.LLLLLLLZIL(this.LIZJ);
            }
            if (this.LIZJ) {
                f3 = 0.8f;
            } else if (viewHolder.itemView.getWidth() == C12GK.LLJJ) {
                f3 = 1.4f;
            } else if (viewHolder.itemView.getWidth() == C12GK.LLJILLL) {
                f3 = 1.1667f;
            }
            C786410Ut5.Ob(viewHolder.itemView, f3);
            C786410Ut5.pc(viewHolder.itemView, f3);
        } else {
            C786410Ut5.Ob(viewHolder.itemView, 1.0f);
            C786410Ut5.pc(viewHolder.itemView, 1.0f);
            if (this.LJ) {
                this.LJ = false;
                int i2 = C12GK.LLJJJ;
                if (((ArrayList) this.LJFF.LLLLLL().LLILZ).size() - 1 <= i2) {
                    this.LJFF.LLLLLZL(i2);
                }
            }
            if (this.LIZJ) {
                this.LIZJ = false;
                C12G1 c12g1 = this.LJFF;
                C1295960jpS c1295960jpS2 = c12g1.LLJJL;
                if (c1295960jpS2 == null) {
                    c1295960jpS2 = null;
                }
                c1295960jpS2.setMinAndMaxProgress(0.46153846f, 1.0f);
                C1295960jpS c1295960jpS3 = c12g1.LLJJL;
                if (c1295960jpS3 != null) {
                    c1295960jpS = c1295960jpS3;
                }
                c1295960jpS.playAnimation();
                this.LIZLLL = true;
                C786410Ut5.T4(viewHolder.itemView, 0.0f);
            }
        }
        super.LJIIJ(canvas, recyclerView, viewHolder, f, f2, i, z);
    }
}
