package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0yXJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861310yXJ {
    public final View LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final RecyclerView LIZLLL;
    public final Fragment LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final C1861350yXN LJIIIIZZ;
    public final boolean LJIIIZ;

    public C1861310yXJ(View view, int i, String str, RecyclerView recyclerView, Fragment fragment, int i2, int i3, boolean z, C1861350yXN c1861350yXN, boolean z2) {
        this.LIZ = view;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = recyclerView;
        this.LJ = fragment;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = z;
        this.LJIIIIZZ = c1861350yXN;
        this.LJIIIZ = z2;
    }

    public static C1861310yXJ LIZ(C1861310yXJ c1861310yXJ, View view, int i, String str, int i2, int i3, boolean z, C1861350yXN c1861350yXN, boolean z2, int i4) {
        RecyclerView recyclerView;
        int i5 = i3;
        int i6 = i2;
        boolean z3 = z2;
        String str2 = str;
        C1861350yXN c1861350yXN2 = c1861350yXN;
        int i7 = i;
        boolean z4 = z;
        View view2 = view;
        if ((i4 & 1) != 0) {
            view2 = c1861310yXJ.LIZ;
        }
        if ((i4 & 2) != 0) {
            i7 = c1861310yXJ.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            str2 = c1861310yXJ.LIZJ;
        }
        Fragment fragment = null;
        if ((i4 & 8) != 0) {
            recyclerView = c1861310yXJ.LIZLLL;
        } else {
            recyclerView = null;
        }
        if ((i4 & 16) != 0) {
            fragment = c1861310yXJ.LJ;
        }
        if ((i4 & 32) != 0) {
            i6 = c1861310yXJ.LJFF;
        }
        if ((i4 & 64) != 0) {
            i5 = c1861310yXJ.LJI;
        }
        if ((i4 & 128) != 0) {
            z4 = c1861310yXJ.LJII;
        }
        if ((i4 & 256) != 0) {
            c1861350yXN2 = c1861310yXJ.LJIIIIZZ;
        }
        if ((i4 & 512) != 0) {
            z3 = c1861310yXJ.LJIIIZ;
        }
        c1861310yXJ.getClass();
        return new C1861310yXJ(view2, i7, str2, recyclerView, fragment, i6, i5, z4, c1861350yXN2, z3);
    }
}
