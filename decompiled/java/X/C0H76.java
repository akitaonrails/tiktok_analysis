package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H76, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0H76 extends RecyclerView.ViewHolder {
    public final View LL;
    public final ViewGroup LLILLJJLI;
    public final C01GW LLILLL;

    public final void I5(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            return;
                        }
                    } else {
                        ((C0H77) this.LLILLL.getValue()).LIZLLL();
                        return;
                    }
                } else {
                    ((C0H77) this.LLILLL.getValue()).LIZJ();
                    return;
                }
            } else {
                ((C0H77) this.LLILLL.getValue()).LIZ();
                return;
            }
        }
        ((C0H77) this.LLILLL.getValue()).LIZIZ();
    }

    public C0H76(View view, ViewGroup viewGroup) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1391));
    }
}
