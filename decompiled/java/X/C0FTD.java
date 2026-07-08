package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0FTD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTD {
    public final /* synthetic */ C390790FTx LIZ;
    public final /* synthetic */ C0FTH LIZIZ;

    public final void LIZ(int i) {
        C0FTC c0ftc = this.LIZIZ.LJIIIIZZ;
        if (c0ftc != null) {
            c0ftc.LIZ(i);
        }
        this.LIZ.LLILZIL.LJJIL(false);
    }

    public C0FTD(C390790FTx c390790FTx, C0FTH c0fth) {
        this.LIZ = c390790FTx;
        this.LIZIZ = c0fth;
    }

    public final void LIZIZ(int i, int i2) {
        this.LIZ.LLILZIL.LJJIL(false);
        C0FTC c0ftc = this.LIZIZ.LJIIIIZZ;
        if (c0ftc != null) {
            c0ftc.LIZIZ(i, i2);
        }
    }

    public final void LIZJ(int i, boolean z, boolean z2) {
        C0FTJ c0ftjLIZ;
        C0FTC c0ftc = this.LIZIZ.LJIIIIZZ;
        if (c0ftc != null && (c0ftjLIZ = C0FKU.LIZ(i, c0ftc.LIZ.LJIIL)) != null) {
            List<C0FTB> list = c0ftc.LIZ.LJIILIIL;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) list) {
                if (C13LQ.LJIILLIIL(c0ftjLIZ.getStickerType(), ((C0FTB) obj).LJJIJIL())) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C0FTB) it2.next()).LJJIIJZLJL(c0ftjLIZ.LJLI(), z, z2);
            }
        }
    }
}
