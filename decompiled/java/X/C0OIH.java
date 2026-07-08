package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0OIH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OIH<T> {
    public final String LIZ;
    public final Function1<T, Boolean> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C0OIH(String str, AFwS240S0000000_9 aFwS240S0000000_9, boolean z, int i) {
        aFwS240S0000000_9 = (i & 2) != 0 ? AFwS229S0000000_2.get$arr$(356) : aFwS240S0000000_9;
        z = (i & 4) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = aFwS240S0000000_9;
        this.LIZJ = z;
        this.LIZLLL = false;
    }
}
