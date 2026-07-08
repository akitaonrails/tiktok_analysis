package X;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: X.0WEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819940WEm {
    public final /* synthetic */ C819930WEl LIZ;

    public C819940WEm(C819930WEl c819930WEl) {
        this.LIZ = c819930WEl;
    }

    public final void LIZ(Writer writer, Object obj) throws IOException {
        C819930WEl c819930WEl = this.LIZ;
        C819950WEn c819950WEn = new C819950WEn(writer, c819930WEl.LIZ, c819930WEl.LIZIZ, c819930WEl.LIZJ, c819930WEl.LIZLLL);
        c819950WEn.LJFF(obj);
        c819950WEn.LJII();
        c819950WEn.LIZIZ.flush();
    }
}
