package X;

import android.os.Build;

/* JADX INFO: renamed from: X.0VgR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C804050VgR {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public C804050VgR() {
        int i = Build.VERSION.SDK_INT;
        this.LIZ = i <= 23 ? 25 : i <= 27 ? 20 : 15;
        this.LIZIZ = 50000;
        this.LIZJ = true;
        this.LIZLLL = true;
        this.LJ = true;
        this.LJFF = true;
        this.LJI = false;
    }
}
