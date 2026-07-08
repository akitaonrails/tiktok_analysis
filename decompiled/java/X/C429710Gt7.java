package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Gt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C429710Gt7 extends RecyclerView.ViewHolder {
    public final ViewGroup LL;
    public InterfaceC429730Gt9 LLILLJJLI;
    public C1617906Vd LLILLL;

    public final void LJJJJL() {
        InterfaceC429730Gt9 interfaceC429730Gt9 = this.LLILLJJLI;
        if (interfaceC429730Gt9 != null) {
            interfaceC429730Gt9.LJJJJL();
        }
    }

    public final void LJLJLJ() {
        InterfaceC429730Gt9 interfaceC429730Gt9 = this.LLILLJJLI;
        InterfaceC429730Gt9 interfaceC429730Gt92 = interfaceC429730Gt9;
        if (interfaceC429730Gt9 == null) {
            C429680Gt4 c429680Gt4LIZ = ((InterfaceC429720Gt8) C1706490uVb.LIZ(InterfaceC429720Gt8.class)).LIZ();
            c429680Gt4LIZ.LIZ(C786410Ut5.ne(this.itemView.getContext()), this.LL);
            interfaceC429730Gt92 = c429680Gt4LIZ;
        }
        this.LLILLJJLI = interfaceC429730Gt92;
        interfaceC429730Gt92.LJLJLJ();
    }

    public void I5(boolean z) {
        FrameLayout frameLayout;
        int i;
        if (z) {
            C1617906Vd c1617906VdLIZ = this.LLILLL;
            if (c1617906VdLIZ == null) {
                c1617906VdLIZ = C1617906Vd.LIZ(C786410Ut5.ne(this.itemView.getContext()), this.LL);
            }
            this.LLILLL = c1617906VdLIZ;
        }
        C1617906Vd c1617906Vd = this.LLILLL;
        if (c1617906Vd != null && (frameLayout = c1617906Vd.LL) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZ(i, frameLayout);
        }
    }

    public C429710Gt7(ViewGroup viewGroup, FrameLayout frameLayout) {
        super(frameLayout);
        this.LL = viewGroup;
    }
}
