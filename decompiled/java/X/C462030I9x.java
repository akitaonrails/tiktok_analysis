package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462030I9x extends C0IA3 {
    public final PublishModel LIZLLL;
    public Bitmap LJ;
    public final C1434650nR9 LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462030I9x)) {
            return false;
        }
        C462030I9x c462030I9x = (C462030I9x) obj;
        return Intrinsics.LJFF(this.LIZLLL, c462030I9x.LIZLLL) && Intrinsics.LJFF(this.LJ, c462030I9x.LJ) && Intrinsics.LJFF(this.LJFF, c462030I9x.LJFF) && Intrinsics.LJFF(this.LJI, c462030I9x.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZLLL.hashCode() * 31;
        Bitmap bitmap = this.LJ;
        return ((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed(publishModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", coverBitmap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJI);
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

    public C462030I9x(PublishModel publishModel, Bitmap bitmap, C1434650nR9 c1434650nR9, String str) {
        super(EnumC429240GsM.FAILED, publishModel, bitmap);
        this.LIZLLL = publishModel;
        this.LJ = bitmap;
        this.LJFF = c1434650nR9;
        this.LJI = str;
    }
}
