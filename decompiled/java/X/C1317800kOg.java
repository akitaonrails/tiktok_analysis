package X;

import android.graphics.Rect;
import android.util.SparseArray;
import com.bytedance.sdui.serializedData.common.operations.Glyph;
import com.bytedance.sdui.serializedData.common.operations.IRect;

/* JADX INFO: renamed from: X.0kOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317800kOg {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final SparseArray<C1317850kOl> LIZLLL = new SparseArray<>();

    public final String toString() {
        return C786410Ut5.j4("Font{imageMaxZero=%d, imageMinFF=%d, hash=%08x}", new Object[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ)});
    }

    public final void LIZ(Glyph glyph) {
        int i = glyph.LIZ;
        int i2 = glyph.LIZIZ;
        IRect iRect = glyph.LIZJ;
        if (iRect == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("no bound for glyph ");
            sbLIZ.append(i);
            sbLIZ.append(" in font ");
            sbLIZ.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1317870kOn.LIZ();
            this.LIZLLL.put(i, null);
            return;
        }
        AbstractC1322720kWc abstractC1322720kWc = glyph.LIZLLL;
        if (abstractC1322720kWc == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("no image for glyph ");
            sbLIZ2.append(i);
            sbLIZ2.append(" in font ");
            sbLIZ2.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1317870kOn.LIZ();
            this.LIZLLL.put(i, null);
            return;
        }
        this.LIZLLL.put(i, new C1317850kOl(i2, this.LIZ, this.LIZIZ, new Rect(iRect.LIZ, iRect.LIZIZ, iRect.LIZJ, iRect.LIZLLL), abstractC1322720kWc.toByteArray()));
    }

    public C1317800kOg(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
