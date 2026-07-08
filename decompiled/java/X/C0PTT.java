package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PTT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PTT<T> {
    public final RecyclerView LIZ;
    public final ExecutorService LIZIZ;
    public final Function2<RecyclerView.ViewHolder, Integer, Unit> LIZJ;
    public final C0PTY<T> LIZLLL;
    public final Set<Integer> LJ;
    public final Function2<Integer, Integer, Boolean> LJFF;
    public final InterfaceC1631630sYr<Integer, Integer, Integer, Boolean, Boolean> LJI;
    public final C0PT6 LJII;
    public final C0PTC LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0PTT(RecyclerView recyclerView, ExecutorService executorService, Function2<? super RecyclerView.ViewHolder, ? super Integer, Unit> function2, C0PTY<T> c0pty, Set<Integer> set, Function2<? super Integer, ? super Integer, Boolean> function22, InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Boolean, Boolean> interfaceC1631630sYr, C0PT6 c0pt6, C0PTC c0ptc) {
        this.LIZ = recyclerView;
        this.LIZIZ = executorService;
        this.LIZJ = function2;
        this.LIZLLL = c0pty;
        this.LJ = set;
        this.LJFF = function22;
        this.LJI = interfaceC1631630sYr;
        this.LJII = c0pt6;
        this.LJIIIIZZ = c0ptc;
    }
}
