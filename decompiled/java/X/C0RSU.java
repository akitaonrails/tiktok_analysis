package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0RSU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0RSU {
    public final int LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;

    public String LIZ(float f, Context context) {
        return context.getResources().getString(this.LIZ);
    }

    public C0RSU(int i, boolean z, int i2, boolean z2, boolean z3, int i3, int i4) {
        z = (i4 & 2) != 0 ? false : z;
        i2 = (i4 & 4) != 0 ? 0 : i2;
        z2 = (i4 & 8) != 0 ? false : z2;
        z3 = (i4 & 16) != 0 ? false : z3;
        if ((i4 & 64) != 0) {
            if (C281310B0v.LIZ()) {
                i3 = R.attr.e7;
            } else {
                i3 = R.attr.e4;
            }
        }
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = i2;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = i3;
    }
}
