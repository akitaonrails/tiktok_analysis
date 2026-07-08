package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0QMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669200QMs {
    public final ViewGroup LIZ;
    public final C0QN0 LIZIZ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 13));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 12));
    public final C669190QMr LIZJ = new AbstractC669180QMq() { // from class: X.0QMr
        @Override // X.AbstractC669180QMq
        public final RecyclerView.ViewHolder LIZ() {
            C669200QMs c669200QMs = this.LIZJ;
            C0QN0 c0qn0 = c669200QMs.LIZIZ;
            ViewGroup viewGroup = c669200QMs.LIZ;
            c0qn0.getClass();
            int i = C669240QMw.LL;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f04, viewGroup, false);
            C01V1.LIZ(new AwS407S0200000_6(viewTd, viewGroup, 54));
            return new C669240QMw(viewTd);
        }
    };

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0QMr] */
    public C669200QMs(ViewGroup viewGroup, C0QN0 c0qn0) {
        this.LIZ = viewGroup;
        this.LIZIZ = c0qn0;
    }
}
