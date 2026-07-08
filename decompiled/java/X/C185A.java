package X;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.185A, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185A extends C185J<C18QS, C212276185i> {
    public final boolean LIZLLL;
    public final Map<String, String> LJ;
    public final List<String> LJFF;
    public String LJI;
    public String LJII;

    public C185A(C18QS c18qs) {
        super(c18qs);
        this.LIZLLL = false;
        this.LJ = new LinkedHashMap();
        this.LJFF = new ArrayList();
        this.LJI = "";
        this.LJII = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.C212276185i r13) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C185A.LJIIJ(X.185i):void");
    }

    public final void LJIIJJI(int i) {
        if (i != ((TextView) this.LIZ).getMaxLines()) {
            ((TextView) this.LIZ).setMaxLines(i);
        }
    }
}
