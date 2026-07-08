package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12Pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19750412Pe {
    public final boolean LIZ;
    public final AtomicInteger LIZIZ;
    public Function0<Unit> LIZJ;
    public final List<Function0<Unit>> LIZLLL = new ArrayList();
    public C1397510mTF LJ;

    public final void LIZ() {
        C1397510mTF c1397510mTF;
        C1397510mTF c1397510mTF2 = this.LJ;
        if (c1397510mTF2 == null || c1397510mTF2.LJIIIZ() || (c1397510mTF = this.LJ) == null) {
            return;
        }
        c1397510mTF.LIZLLL();
    }

    public C19750412Pe(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = new AtomicInteger(i);
    }
}
