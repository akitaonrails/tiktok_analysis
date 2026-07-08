package X;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19901812ts {
    public final AbstractC19901712tr LIZ;

    public C19901812ts(AbstractC19901712tr abstractC19901712tr) {
        Charset charset = C19856912md.LIZ;
        if (abstractC19901712tr != null) {
            this.LIZ = abstractC19901712tr;
            abstractC19901712tr.LIZ = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void LIZIZ(int i, Object obj) {
        if (obj instanceof AbstractC19854812mI) {
            this.LIZ.LJIIJ(i, (AbstractC19854812mI) obj);
        } else {
            this.LIZ.LJFF(i, (InterfaceC19901112tl) obj);
        }
    }

    public final void LIZ(int i, InterfaceC19900112tb interfaceC19900112tb, Object obj) {
        AbstractC19901712tr abstractC19901712tr = this.LIZ;
        abstractC19901712tr.LJJ(i, 3);
        interfaceC19900112tb.LIZLLL(obj, abstractC19901712tr.LIZ);
        abstractC19901712tr.LJJ(i, 4);
    }
}
