package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.166N, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C166N {
    public final Bitmap LIZ;
    public final List<C166F> LIZIZ;
    public int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final List<C166T> LJFF;

    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C166O LIZ() {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166N.LIZ():X.166O");
    }

    public C166N(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZJ = 16;
        this.LIZLLL = 12544;
        this.LJ = -1;
        ArrayList arrayList2 = new ArrayList();
        this.LJFF = arrayList2;
        if (bitmap != null && !bitmap.isRecycled()) {
            arrayList2.add(C166O.LJFF);
            this.LIZ = bitmap;
            arrayList.add(C166F.LJ);
            arrayList.add(C166F.LJFF);
            arrayList.add(C166F.LJI);
            arrayList.add(C166F.LJII);
            arrayList.add(C166F.LJIIIIZZ);
            arrayList.add(C166F.LJIIIZ);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }
}
