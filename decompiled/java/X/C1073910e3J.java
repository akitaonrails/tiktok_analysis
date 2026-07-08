package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0e3J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073910e3J extends C21674119s3 {
    public final boolean LJIILL;
    public final boolean LJIILLIIL;

    @Override // X.C21674119s3
    public final int LJIILIIL(int i) {
        return 275;
    }

    @Override // X.C21674119s3
    public final int LJIILL() {
        return 1;
    }

    public C1073910e3J(Context context, boolean z, boolean z2) {
        super(context);
        this.LJIILL = z;
        this.LJIILLIIL = z2;
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        int iLIZIZ;
        int iLIZIZ2 = 0;
        if (this.LJIILL) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        } else {
            iLIZIZ = 0;
        }
        if (this.LJIILLIIL) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        }
        return super.LJIIIIZZ(i, i2, i3, i4, i5) - (iLIZIZ + iLIZIZ2);
    }
}
