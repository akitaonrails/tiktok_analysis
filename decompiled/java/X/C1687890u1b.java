package X;

import android.view.View;

/* JADX INFO: renamed from: X.0u1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1687890u1b {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public boolean LJFF;
    public final int LJI;
    public final boolean LJII;
    public final View.OnClickListener LJIIIIZZ;

    public C1687890u1b() {
        this(0, 0, 0, false, null, false, 0, false, null, 511);
    }

    public C1687890u1b(int i, int i2, int i3, boolean z, String str, boolean z2, int i4, boolean z3, View.OnClickListener onClickListener, int i5) {
        i = (i5 & 1) != 0 ? 0 : i;
        i2 = (i5 & 2) != 0 ? 0 : i2;
        i3 = (i5 & 4) != 0 ? 0 : i3;
        z = (i5 & 8) != 0 ? false : z;
        str = (i5 & 16) != 0 ? "" : str;
        z2 = (i5 & 32) != 0 ? false : z2;
        i4 = (i5 & 64) != 0 ? 0 : i4;
        z3 = (i5 & 128) != 0 ? false : z3;
        onClickListener = (i5 & 256) != 0 ? new View.OnClickListener() { // from class: X.0u1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        } : onClickListener;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = z2;
        this.LJI = i4;
        this.LJII = z3;
        this.LJIIIIZZ = onClickListener;
    }
}
