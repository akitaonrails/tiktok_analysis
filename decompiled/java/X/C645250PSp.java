package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645250PSp {
    public final Function2<ViewGroup, Integer, RecyclerView.ViewHolder> LIZ;
    public final ExecutorService LIZIZ;
    public final Set<Integer> LIZJ;
    public final InterfaceC1631630sYr<Integer, Integer, Integer, Boolean, Boolean> LIZLLL;
    public final C0PTC LJ;
    public final C0PTU<RecyclerView.ViewHolder> LJFF;

    public C645250PSp(C645260PSq c645260PSq) {
        this.LIZ = c645260PSq.LIZ;
        ExecutorService executorService = c645260PSq.LIZIZ;
        this.LIZIZ = executorService;
        this.LIZJ = c645260PSq.LIZJ;
        InterfaceC1631630sYr<Integer, Integer, Integer, Boolean, Boolean> interfaceC1631630sYr = c645260PSq.LIZLLL;
        this.LIZLLL = interfaceC1631630sYr;
        this.LJ = c645260PSq.LJ;
        this.LJFF = new C0PTU<>(new C0PTX(interfaceC1631630sYr, executorService, "async create"));
    }
}
