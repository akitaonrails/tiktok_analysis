package X;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.182h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212197182h extends AbstractC212220183e<C18QS, C212199182j> {
    public final boolean LJ;
    public final Map<String, String> LJFF;
    public final List<String> LJI;
    public String LJII;
    public String LJIIIIZZ;

    public C212197182h(C18QS c18qs) {
        super(c18qs, "fyp_product_info");
        this.LJ = true;
        this.LJFF = new LinkedHashMap();
        this.LJI = new ArrayList();
        this.LJII = "";
        this.LJIIIIZZ = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[PHI: r1
      0x007f: PHI (r1v10 java.util.List<java.lang.String>) = (r1v3 java.util.List<java.lang.String>), (r1v13 java.util.List<java.lang.String>) binds: [B:90:0x017b, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173 A[PHI: r1
      0x0173: PHI (r1v3 java.util.List<java.lang.String>) = 
      (r1v2 java.util.List<java.lang.String>)
      (r1v13 java.util.List<java.lang.String>)
      (r1v13 java.util.List<java.lang.String>)
     binds: [B:87:0x0172, B:27:0x0075, B:29:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.C212199182j r13) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212197182h.LJIIJJI(X.182j):void");
    }

    public final void LJIIL(int i) {
        if (i != ((TextView) this.LIZ).getMaxLines()) {
            ((TextView) this.LIZ).setMaxLines(i);
        }
    }
}
