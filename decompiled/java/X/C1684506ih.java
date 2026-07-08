package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.06ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1684506ih {
    public Integer LIZ;
    public WeakReference<Context> LIZIZ;
    public String LIZJ;
    public Long LIZLLL;
    public C869590Y9l LJ;
    public Object LJFF;
    public C1708206mW LJI = new C1708206mW();

    public final C1736606r6 LIZIZ() {
        Integer num = this.LIZ;
        return new C1736606r6(num != null ? num.intValue() : -1, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
    }

    public final void LIZ(Object obj) {
        this.LJI.LIZIZ(C1685406iq.LIZ, obj);
    }

    public final void LIZJ(Context context) {
        if (context == null) {
            return;
        }
        this.LIZIZ = new WeakReference<>(context);
    }

    public final void LIZLLL(int i) {
        this.LIZ = Integer.valueOf(i);
    }
}
