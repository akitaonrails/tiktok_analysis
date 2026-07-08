package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0ZwL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915830ZwL {
    public Rect LIZ;
    public final int LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalLinkMicWindowShapeDescriptor(rect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", radius=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C915830ZwL(int i, Rect rect) {
        this.LIZ = rect;
        this.LIZIZ = i;
    }
}
