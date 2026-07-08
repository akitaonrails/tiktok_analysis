package X;

import android.view.View;

/* JADX INFO: renamed from: X.0ZQZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQZ<T extends View> {
    public final int LIZ;
    public final InterfaceC899400ZQc LIZIZ;
    public View.OnClickListener LIZJ;

    public final T LIZ() {
        T t = (T) this.LIZIZ.LIZJ(this.LIZ);
        if (t == null) {
            return null;
        }
        View.OnClickListener onClickListener = this.LIZJ;
        if (onClickListener != null) {
            C786410Ut5.I7(onClickListener, t);
        }
        return t;
    }

    public final void LIZIZ() {
        this.LIZIZ.LIZ(this.LIZ);
    }

    public final boolean LIZJ() {
        return this.LIZIZ.LIZIZ();
    }

    public C0ZQZ(int i, InterfaceC899400ZQc interfaceC899400ZQc) {
        this.LIZ = i;
        this.LIZIZ = interfaceC899400ZQc;
    }
}
