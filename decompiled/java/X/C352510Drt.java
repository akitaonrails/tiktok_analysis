package X;

import com.ss.android.vesdk.VEEditor;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Drt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352510Drt {
    public final AnonymousClass0957<Unit> LIZ;
    public VEEditor LIZIZ;

    public final void LIZ() {
        C352470Drp c352470Drp = C352470Drp.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResizeJob: ");
        sbLIZ.append(this);
        sbLIZ.append(" cancel");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c352470Drp.getClass();
        C352470Drp.LIZLLL(strLIZIZ);
        this.LIZ.LIZIZ(null);
        VEEditor vEEditor = this.LIZIZ;
        if (vEEditor != null) {
            vEEditor.LJIILIIL();
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResizeJob: job = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", editor = ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C352510Drt(C099G c099g, VEEditor vEEditor) {
        this.LIZ = c099g;
        this.LIZIZ = vEEditor;
    }
}
