package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0etJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106150etJ {
    public int LIZ;
    public long LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public Function0<Unit> LJI;
    public Function0<Unit> LJII;
    public Function1<? super C0KAJ, Unit> LJIIIIZZ;
    public String LIZIZ = "";
    public boolean LJFF = true;

    public final C1099800ej4 LIZ() {
        int i = this.LIZ;
        if (i == -1) {
            "componentType must be set".toString();
            throw new IllegalArgumentException("componentType must be set");
        }
        long j = this.LIZJ;
        if (j > 0) {
            return new C1099800ej4(i, this.LIZIZ, j, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ);
        }
        "duration must be positive".toString();
        throw new IllegalArgumentException("duration must be positive");
    }
}
