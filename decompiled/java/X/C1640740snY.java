package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0snY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1640740snY {
    public final int LIZ;
    public final Function2<? super ViewGroup, ? super Function0<Unit>, ? extends RecyclerView.ViewHolder> LIZIZ;
    public final Function2<? super RecyclerView.ViewHolder, ? super EnumC1641470soj, Unit> LIZJ;
    public final Function1<? super C1640060smS, Unit> LIZLLL;

    public C1640740snY(AFwS266S0000000_25 aFwS266S0000000_25, int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        aFwS266S0000000_25 = (i & 8) != 0 ? null : aFwS266S0000000_25;
        this.LIZ = i2;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = aFwS266S0000000_25;
    }
}
