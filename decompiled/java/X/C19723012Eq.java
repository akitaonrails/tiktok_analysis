package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19723012Eq {
    public final C19722712En LIZ;
    public final boolean LIZIZ;
    public final Bitmap LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final InterfaceC19571111hd LJII;

    public C19723012Eq() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19723012Eq)) {
            return false;
        }
        C19723012Eq c19723012Eq = (C19723012Eq) obj;
        return Intrinsics.LJFF(this.LIZ, c19723012Eq.LIZ) && this.LIZIZ == c19723012Eq.LIZIZ && Intrinsics.LJFF(this.LIZJ, c19723012Eq.LIZJ) && this.LIZLLL == c19723012Eq.LIZLLL && this.LJ == c19723012Eq.LJ && this.LJFF == c19723012Eq.LJFF && this.LJI == c19723012Eq.LJI && Intrinsics.LJFF(this.LJII, c19723012Eq.LJII);
    }

    public final int hashCode() {
        C19722712En c19722712En = this.LIZ;
        int iHashCode = (((c19722712En == null ? 0 : c19722712En.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Bitmap bitmap = this.LIZJ;
        int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        InterfaceC19571111hd interfaceC19571111hd = this.LJII;
        return iHashCode2 + (interfaceC19571111hd != null ? interfaceC19571111hd.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtractFramesStates(videoInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", editorReady=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentFrameBitmap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", videoDuration=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", currentPosition=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isError=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", coverDataSource=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C19723012Eq(int i) {
        this(null, false, null, 0, 0, false, false, null);
    }

    public C19723012Eq(C19722712En c19722712En, boolean z, Bitmap bitmap, int i, int i2, boolean z2, boolean z3, InterfaceC19571111hd interfaceC19571111hd) {
        this.LIZ = c19722712En;
        this.LIZIZ = z;
        this.LIZJ = bitmap;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = interfaceC19571111hd;
    }

    public static C19723012Eq LIZ(C19723012Eq c19723012Eq, C19722712En c19722712En, boolean z, Bitmap bitmap, int i, int i2, boolean z2, boolean z3, C19571011hc c19571011hc, int i3) {
        InterfaceC19571111hd interfaceC19571111hd = c19571011hc;
        boolean z4 = z3;
        boolean z5 = z2;
        int i4 = i2;
        int i5 = i;
        Bitmap bitmap2 = bitmap;
        boolean z6 = z;
        C19722712En c19722712En2 = c19722712En;
        if ((i3 & 1) != 0) {
            c19722712En2 = c19723012Eq.LIZ;
        }
        if ((i3 & 2) != 0) {
            z6 = c19723012Eq.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            bitmap2 = c19723012Eq.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i5 = c19723012Eq.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            i4 = c19723012Eq.LJ;
        }
        if ((i3 & 32) != 0) {
            z5 = c19723012Eq.LJFF;
        }
        if ((i3 & 64) != 0) {
            z4 = c19723012Eq.LJI;
        }
        if ((i3 & 128) != 0) {
            interfaceC19571111hd = c19723012Eq.LJII;
        }
        c19723012Eq.getClass();
        return new C19723012Eq(c19722712En2, z6, bitmap2, i5, i4, z5, z4, interfaceC19571111hd);
    }
}
