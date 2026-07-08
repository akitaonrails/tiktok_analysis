package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645260PSq {
    public final Function2<ViewGroup, Integer, RecyclerView.ViewHolder> LIZ;
    public final ExecutorService LIZIZ;
    public final Set<Integer> LIZJ;
    public final InterfaceC1631630sYr<Integer, Integer, Integer, Boolean, Boolean> LIZLLL;
    public final C0PTC LJ;

    public C645260PSq(Function2 function2, ExecutorService executorService, Set set, InterfaceC1631630sYr interfaceC1631630sYr, C0PTC c0ptc) {
        this.LIZ = function2;
        this.LIZIZ = executorService;
        this.LIZJ = set;
        this.LIZLLL = interfaceC1631630sYr;
        this.LJ = c0ptc;
    }
}
