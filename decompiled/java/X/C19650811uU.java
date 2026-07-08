package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11uU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19650811uU {
    public final Function1<Boolean, Unit> LIZ;
    public final Function1<Boolean, Unit> LIZIZ;
    public final Function1<Boolean, Unit> LIZJ;
    public final Set<Integer> LIZLLL = new LinkedHashSet();
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public final void LIZ() {
        boolean z = this.LJ && this.LIZLLL.isEmpty();
        if (z != this.LJI) {
            this.LJII = true;
            this.LJI = z;
        }
        if (this.LJIIIIZZ) {
            return;
        }
        if (this.LJII) {
            this.LIZ.invoke(Boolean.valueOf(this.LJI));
            this.LJII = false;
        }
        if (this.LJFF) {
            this.LIZIZ.invoke(Boolean.valueOf(this.LJ));
            this.LJFF = false;
        }
    }

    public C19650811uU(LifecycleCoroutineScope lifecycleCoroutineScope, C160H c160h, C160D c160d, C207054160m c207054160m) {
        this.LIZ = c160h;
        this.LIZIZ = c160d;
        this.LIZJ = c207054160m;
        C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C463201rC(this, null), 3);
    }
}
