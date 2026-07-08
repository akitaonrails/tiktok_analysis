package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.ecommerce.ECHistoryPreparator;

/* JADX INFO: renamed from: X.0Qbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673810Qbr implements ECHistoryPreparator {
    public final ViewGroup LIZ;
    public final InterfaceC673850Qbv LIZIZ;
    public final C673820Qbs LIZJ = new AbstractC673840Qbu() { // from class: X.0Qbs
        @Override // X.AbstractC673840Qbu
        public final RecyclerView.ViewHolder LIZ() {
            C673810Qbr c673810Qbr = this.LIZJ;
            return c673810Qbr.LIZIZ.LJJLI(c673810Qbr.LIZ);
        }
    };
    public final C673830Qbt LIZLLL = new AbstractC673840Qbu() { // from class: X.0Qbt
        @Override // X.AbstractC673840Qbu
        public final RecyclerView.ViewHolder LIZ() {
            C673810Qbr c673810Qbr = this.LIZJ;
            return c673810Qbr.LIZIZ.LLJLIL(c673810Qbr.LIZ);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Qbs] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Qbt] */
    public C673810Qbr(ViewGroup viewGroup, InterfaceC673850Qbv interfaceC673850Qbv) {
        this.LIZ = viewGroup;
        this.LIZIZ = interfaceC673850Qbv;
    }
}
