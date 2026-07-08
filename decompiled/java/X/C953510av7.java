package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0av7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953510av7 extends C0J8P<C953550avB, C953500av6> {
    public final Context LIZIZ;
    public final InterfaceC953490av5 LIZJ;
    public final EnumC952890au7 LIZLLL;
    public final HashSet<Long> LJ;

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C953550avB c953550avB) {
        C953500av6 c953500av6 = (C953500av6) viewHolder;
        c953500av6.getAdapterPosition();
        c953500av6.N5(c953550avB);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        if (C934890aR5.LIZ()) {
            i = R.layout.h_r;
        } else {
            i = R.layout.h_q;
        }
        return new C953500av6(C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), i, viewGroup, false), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public C953510av7(Context context, InterfaceC953490av5 interfaceC953490av5, EnumC952890au7 enumC952890au7, HashSet<Long> hashSet) {
        this.LIZIZ = context;
        this.LIZJ = interfaceC953490av5;
        this.LIZLLL = enumC952890au7;
        this.LJ = hashSet;
    }
}
