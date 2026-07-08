package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461990I9t extends C0IA3 {
    public final PublishModel LIZLLL;
    public Bitmap LJ;
    public final Aweme LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C461990I9t)) {
            return false;
        }
        C461990I9t c461990I9t = (C461990I9t) obj;
        return Intrinsics.LJFF(this.LIZLLL, c461990I9t.LIZLLL) && Intrinsics.LJFF(this.LJ, c461990I9t.LJ) && Intrinsics.LJFF(this.LJFF, c461990I9t.LJFF);
    }

    public final int hashCode() {
        int iHashCode = this.LIZLLL.hashCode() * 31;
        Bitmap bitmap = this.LJ;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Aweme aweme = this.LJFF;
        return iHashCode2 + (aweme != null ? aweme.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Complete(publishModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", coverBitmap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", aweme=");
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

    public C461990I9t(PublishModel publishModel, Bitmap bitmap, Aweme aweme) {
        super(EnumC429240GsM.COMPLETE, publishModel, bitmap);
        this.LIZLLL = publishModel;
        this.LJ = bitmap;
        this.LJFF = aweme;
    }
}
