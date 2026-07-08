package X;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C391901fh extends AbstractC392801fq {
    public final Rect LIZ;
    public final String LIZIZ = "attach_item_view";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C391901fh) && Intrinsics.LJFF(this.LIZ, ((C391901fh) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AttachItemView(frame=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC392801fq
    public final String LIZ() {
        return this.LIZIZ;
    }

    public C391901fh(Rect rect) {
        this.LIZ = rect;
    }
}
