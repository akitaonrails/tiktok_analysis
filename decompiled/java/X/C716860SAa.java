package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716860SAa implements C0SFO {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C716860SAa(String str, boolean z, boolean z2) {
        boolean z3;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.LIZLLL = z3;
    }

    @Override // X.C0SFO
    public final void LIZ(String str, Throwable th, Function0<String> function0) {
        if (!this.LIZLLL) {
            return;
        }
        function0.invoke();
        if (this.LIZJ) {
            C2344809Gs.LIZLLL(2, this.LIZ, function0.invoke());
            if (th != null) {
                C2344809Gs.LJI(th);
            }
        }
    }

    @Override // X.C0SFO
    public final void LIZIZ(String str, Throwable th, Function0<String> function0) {
        if (!this.LIZLLL) {
            return;
        }
        function0.invoke();
        if (this.LIZJ) {
            C2344809Gs.LIZLLL(4, this.LIZ, function0.invoke());
            if (th != null) {
                C2344809Gs.LJI(th);
            }
        }
    }

    @Override // X.C0SFO
    public final void LIZJ(String str, Throwable th, Function0<String> function0) {
        if (!this.LIZLLL) {
            return;
        }
        function0.invoke();
        if (this.LIZJ) {
            C2344809Gs.LIZLLL(6, this.LIZ, function0.invoke());
            if (th != null) {
                C2344809Gs.LJI(th);
            }
        }
    }

    @Override // X.C0SFO
    public final void LIZLLL(String str, Throwable th, Function0<String> function0) {
        if (!this.LIZLLL) {
            return;
        }
        function0.invoke();
        if (this.LIZJ) {
            C2344809Gs.LIZLLL(3, this.LIZ, function0.invoke());
            if (th != null) {
                C2344809Gs.LJI(th);
            }
        }
        if (this.LIZIZ && th == null) {
            function0.invoke();
        }
    }
}
