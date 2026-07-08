package X;

/* JADX INFO: renamed from: X.134a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199502134a<T> {
    public Object LIZ;
    public C134Z<T> LIZIZ;
    public C199509134h<Void> LIZJ = new C199509134h<>();
    public boolean LIZLLL;

    public final void finalize() {
        C199509134h<Void> c199509134h;
        C134Z<T> c134z = this.LIZIZ;
        if (c134z != null && !c134z.isDone()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            sbLIZ.append(this.LIZ);
            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Throwable th = new Throwable(strLIZIZ) { // from class: X.134y
                @Override // java.lang.Throwable
                public final synchronized Throwable fillInStackTrace() {
                    return this;
                }
            };
            C199505134d c199505134d = c134z.LLILLJJLI;
            c199505134d.getClass();
            if (C134Y.LLILZLL.LIZIZ(c199505134d, null, new C199524134w(th))) {
                C134Y.LIZIZ(c199505134d);
            }
        }
        if (this.LIZLLL || (c199509134h = this.LIZJ) == null) {
            return;
        }
        c199509134h.LJIIIIZZ(null);
    }

    public final void LIZ(Object obj) {
        this.LIZLLL = true;
        C134Z<T> c134z = this.LIZIZ;
        if (c134z != null) {
            C199505134d c199505134d = c134z.LLILLJJLI;
            c199505134d.getClass();
            if (obj == null) {
                obj = C134Y.LLIZ;
            }
            if (C134Y.LLILZLL.LIZIZ(c199505134d, null, obj)) {
                C134Y.LIZIZ(c199505134d);
                this.LIZ = null;
                this.LIZIZ = null;
                this.LIZJ = null;
            }
        }
    }

    public final void LIZIZ(Throwable th) {
        this.LIZLLL = true;
        C134Z<T> c134z = this.LIZIZ;
        if (c134z != null) {
            C199505134d c199505134d = c134z.LLILLJJLI;
            c199505134d.getClass();
            th.getClass();
            if (C134Y.LLILZLL.LIZIZ(c199505134d, null, new C199524134w(th))) {
                C134Y.LIZIZ(c199505134d);
                this.LIZ = null;
                this.LIZIZ = null;
                this.LIZJ = null;
            }
        }
    }
}
