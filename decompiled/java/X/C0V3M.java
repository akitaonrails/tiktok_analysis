package X;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V3M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V3M extends AbstractC791320V2k implements C0N5S {
    public C0V3N LLILLJJLI;

    @Override // X.C0N5S
    public final void LJIIJJI() {
        this.LLILLJJLI = null;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C791390V2r.LJJIII.LJIILLIIL(this);
        }
    }

    @Override // X.C0N5S
    public final void LJFF(C0V3N c0v3n) {
        this.LLILLJJLI = c0v3n;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C791390V2r.LJJIII.LJ(this);
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILJJIL(String str) {
        this.LL = true;
        C0V3N c0v3n = this.LLILLJJLI;
        if (c0v3n != null) {
            c0v3n.LIZ();
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
        this.LL = false;
        C0V3N c0v3n = this.LLILLJJLI;
        if (c0v3n != null) {
            c0v3n.LIZIZ();
        }
    }
}
