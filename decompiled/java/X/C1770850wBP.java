package X;

import android.os.Looper;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0wBP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770850wBP<R> {
    public boolean LIZ;
    public Function2<? super R, ? super R, Boolean> LIZIZ = new C330440CxO();
    public boolean LIZJ = true;
    public boolean LIZLLL;
    public CoroutineContext LJ;
    public boolean LJFF;
    public C11HA LJI;

    public C1770850wBP() {
        C2151808bs.LIZJ("fast-main", AnonymousClass0850.LIZ(Looper.getMainLooper(), true));
    }

    public final void LIZ(boolean z) {
        this.LIZJ = z;
        this.LIZLLL = true;
    }
}
