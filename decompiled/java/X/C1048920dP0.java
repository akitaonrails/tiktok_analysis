package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dP0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048920dP0 {
    public final String LIZ;
    public final String LIZIZ;
    public final UrlModel LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1048920dP0)) {
            return false;
        }
        C1048920dP0 c1048920dP0 = (C1048920dP0) obj;
        return Intrinsics.LJFF(this.LIZ, c1048920dP0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1048920dP0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1048920dP0.LIZJ) && this.LIZLLL == c1048920dP0.LIZLLL && this.LJ == c1048920dP0.LJ && Intrinsics.LJFF(this.LJFF, c1048920dP0.LJFF) && this.LJI == c1048920dP0.LJI && this.LJII == c1048920dP0.LJII;
    }

    public static C1048920dP0 LIZ(C1048920dP0 c1048920dP0, boolean z, int i, boolean z2, boolean z3, int i2) {
        String str;
        String str2;
        UrlModel urlModel;
        boolean z4 = z2;
        int i3 = i;
        boolean z5 = z3;
        boolean z6 = z;
        String str3 = null;
        if ((i2 & 1) != 0) {
            str = c1048920dP0.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = c1048920dP0.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            urlModel = c1048920dP0.LIZJ;
        } else {
            urlModel = null;
        }
        if ((i2 & 8) != 0) {
            z6 = c1048920dP0.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            i3 = c1048920dP0.LJ;
        }
        if ((i2 & 32) != 0) {
            str3 = c1048920dP0.LJFF;
        }
        if ((i2 & 64) != 0) {
            z4 = c1048920dP0.LJI;
        }
        if ((i2 & 128) != 0) {
            z5 = c1048920dP0.LJII;
        }
        c1048920dP0.getClass();
        return new C1048920dP0(str, str2, urlModel, z6, i3, str3, z4, z5);
    }

    public C1048920dP0(String str, String str2, UrlModel urlModel, boolean z, int i, String str3, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = urlModel;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = str3;
        this.LJI = z2;
        this.LJII = z3;
    }
}
