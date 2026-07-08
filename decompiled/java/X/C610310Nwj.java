package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Nwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610310Nwj extends RecyclerView.ViewHolder {
    public final Fragment LL;
    public final C1765720w38 LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C0N0X LLILZ;
    public final C01GW LLILZIL;

    public final void I5(String str) {
        if (str.length() == 0) {
            C786410Ut5.LLLLZLL(this.LLILLL, 8);
            return;
        }
        if (this.LLILLL.getVisibility() != 0) {
            C786410Ut5.LLLLZLL(this.LLILLL, 0);
        }
        this.LLILLL.setText(str);
    }

    public C610310Nwj(ViewGroup viewGroup, Fragment fragment) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bch, viewGroup, false));
        this.LL = fragment;
        C1765720w38 c1765720w38 = (C1765720w38) this.itemView.findViewById(R.id.q_y);
        this.LLILLJJLI = c1765720w38;
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.q_z);
        this.LLILZIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(64));
        C786410Ut5.LJZI(8, (ImageView) c1765720w38.findViewById(R.id.inu));
        C786410Ut5.LLLLLLLLL((C19736512Jv) c1765720w38.findViewById(R.id.qnd), 8);
        if (C610320Nwk.LIZ == null) {
            C610320Nwk.LIZ = new C1483410ohn();
        }
        this.LLILZ = new C0N0X(this, c1765720w38, C610320Nwk.LIZ);
        this.itemView.setTag(this);
    }
}
