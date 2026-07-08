package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461970I9r extends C0IA3 {
    public final PublishModel LIZLLL;
    public Bitmap LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C461970I9r)) {
            return false;
        }
        C461970I9r c461970I9r = (C461970I9r) obj;
        return Intrinsics.LJFF(this.LIZLLL, c461970I9r.LIZLLL) && Intrinsics.LJFF(this.LJ, c461970I9r.LJ) && this.LJFF == c461970I9r.LJFF;
    }

    public final int hashCode() {
        int iHashCode = this.LIZLLL.hashCode() * 31;
        Bitmap bitmap = this.LJ;
        return ((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Publishing(publishModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", coverBitmap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0IA3
    public final Bitmap LIZ() {
        return this.LJ;
    }

    @Override // X.C0IA3
    public final PublishModel LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C0IA3
    public final void LIZJ(Bitmap bitmap) {
        this.LJ = bitmap;
    }

    public C461970I9r(PublishModel publishModel, Bitmap bitmap, int i) {
        super(EnumC429240GsM.PUBLISHING, publishModel, bitmap);
        this.LIZLLL = publishModel;
        this.LJ = bitmap;
        this.LJFF = i;
    }
}
