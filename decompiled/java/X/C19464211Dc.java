package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19464211Dc<VH> {
    public final Function1<ViewGroup, VH> LIZ;
    public final Function1<Integer, Boolean> LIZIZ;
    public final int LIZJ;
    public final Function2<Integer, RecyclerView, Unit> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C19464211Dc(Function1<? super ViewGroup, ? extends VH> function1, Function1<? super Integer, Boolean> function12, int i, Function2<? super Integer, ? super RecyclerView, Unit> function2) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = i;
        this.LIZLLL = function2;
    }
}
