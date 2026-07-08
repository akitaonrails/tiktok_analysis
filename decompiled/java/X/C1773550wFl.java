package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0wFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773550wFl {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final List<Function2<Boolean, C1773550wFl, Unit>> LIZLLL;

    public C1773550wFl() {
        this(0, 0, 31);
    }

    public final void LIZ(boolean z) {
        if (z != this.LIZJ) {
            this.LIZJ = z;
            Iterator<Function2<Boolean, C1773550wFl, Unit>> it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(Boolean.valueOf(z), this);
            }
        }
    }

    public C1773550wFl(int i, int i2, int i3) {
        ArrayList arrayList;
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        if ((i3 & 16) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = false;
        this.LIZLLL = arrayList;
    }
}
