package X;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19tK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21682019tK {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int[] LJFF;
    public final /* synthetic */ StaggeredGridLayoutManager LJI;

    public final void LIZ() {
        this.LIZ = -1;
        this.LIZIZ = Integer.MIN_VALUE;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = false;
        int[] iArr = this.LJFF;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }

    public C21682019tK(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.LJI = staggeredGridLayoutManager;
        LIZ();
    }
}
