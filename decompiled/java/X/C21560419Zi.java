package X;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: X.19Zi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21560419Zi implements InterfaceC21560819Zm {
    public PointF LIZ;
    public InterfaceC21560819Zm LIZIZ;
    public boolean LIZJ = true;

    public final boolean LIZ(View view) {
        InterfaceC21560819Zm interfaceC21560819Zm = this.LIZIZ;
        if (interfaceC21560819Zm != null) {
            return ((C21560419Zi) interfaceC21560819Zm).LIZ(view);
        }
        return C19ZZ.LIZ(view, this.LIZ, this.LIZJ);
    }

    public final boolean LIZIZ(View view) {
        InterfaceC21560819Zm interfaceC21560819Zm = this.LIZIZ;
        if (interfaceC21560819Zm != null) {
            return ((C21560419Zi) interfaceC21560819Zm).LIZIZ(view);
        }
        return C19ZZ.LIZIZ(this.LIZ, view);
    }
}
