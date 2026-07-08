package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0OwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635510OwH extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final Function0<Boolean> LLILLJJLI;
    public final Function1<Integer, Unit> LLILLL;
    public EnumC635540OwK LLILZ;

    public final void I5() {
        int i = C635530OwJ.LIZ[this.LLILZ.ordinal()];
        if (i == 1) {
            TuxTextView tuxTextView = this.LL;
            tuxTextView.setSelected(true);
            tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a04, tuxTextView.getContext()));
        } else if (i == 2) {
            TuxTextView tuxTextView2 = this.LL;
            tuxTextView2.setSelected(false);
            tuxTextView2.setTextColor(C960203pA.LIZ(R.attr.a1h, tuxTextView2.getContext()));
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            TuxTextView tuxTextView3 = this.LL;
            tuxTextView3.setSelected(false);
            tuxTextView3.setTextColor(C960203pA.LIZ(R.attr.a1p, tuxTextView3.getContext()));
        }
    }

    public C635510OwH(TuxTextView tuxTextView, AwS553S0100000_9 awS553S0100000_9, AwS588S0100000_9 awS588S0100000_9) {
        super(tuxTextView);
        this.LL = tuxTextView;
        this.LLILLJJLI = awS553S0100000_9;
        this.LLILLL = awS588S0100000_9;
        this.LLILZ = EnumC635540OwK.UNSELECTED;
    }
}
