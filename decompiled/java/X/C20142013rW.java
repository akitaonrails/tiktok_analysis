package X;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13rW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20142013rW {
    public final String LIZ;
    public final Typeface LIZIZ;
    public final ByteBuffer LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20142013rW)) {
            return false;
        }
        C20142013rW c20142013rW = (C20142013rW) obj;
        return Intrinsics.LJFF(this.LIZ, c20142013rW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20142013rW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20142013rW.LIZJ) && this.LIZLLL == c20142013rW.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        ByteBuffer byteBuffer = this.LIZJ;
        return ((iHashCode + (byteBuffer == null ? 0 : byteBuffer.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseAsset(realPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", baseTypeface=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fontBuffer=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isVariable=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C20142013rW LIZ(C20142013rW c20142013rW, ByteBuffer byteBuffer) {
        return new C20142013rW(c20142013rW.LIZ, c20142013rW.LIZIZ, byteBuffer, true);
    }

    public C20142013rW(String str, Typeface typeface, ByteBuffer byteBuffer, boolean z) {
        this.LIZ = str;
        this.LIZIZ = typeface;
        this.LIZJ = byteBuffer;
        this.LIZLLL = z;
    }
}
