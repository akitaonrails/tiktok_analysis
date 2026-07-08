package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0DHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336550DHh {
    public final View LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final RecyclerView LIZLLL;
    public final Fragment LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final C321610Cj9 LJIIIIZZ;
    public final boolean LJIIIZ;

    public static C336550DHh LIZ(C336550DHh c336550DHh, View view, int i, String str, int i2, int i3, C321610Cj9 c321610Cj9, int i4) {
        RecyclerView recyclerView;
        boolean z;
        boolean z2;
        int i5 = i3;
        int i6 = i2;
        String str2 = str;
        C321610Cj9 c321610Cj92 = c321610Cj9;
        int i7 = i;
        View view2 = view;
        if ((i4 & 1) != 0) {
            view2 = c336550DHh.LIZ;
        }
        if ((i4 & 2) != 0) {
            i7 = c336550DHh.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            str2 = c336550DHh.LIZJ;
        }
        Fragment fragment = null;
        if ((i4 & 8) != 0) {
            recyclerView = c336550DHh.LIZLLL;
        } else {
            recyclerView = null;
        }
        if ((i4 & 16) != 0) {
            fragment = c336550DHh.LJ;
        }
        if ((i4 & 32) != 0) {
            i6 = c336550DHh.LJFF;
        }
        if ((i4 & 64) != 0) {
            i5 = c336550DHh.LJI;
        }
        if ((i4 & 128) != 0) {
            z = c336550DHh.LJII;
        } else {
            z = false;
        }
        if ((i4 & 256) != 0) {
            c321610Cj92 = c336550DHh.LJIIIIZZ;
        }
        if ((i4 & 512) != 0) {
            z2 = c336550DHh.LJIIIZ;
        } else {
            z2 = false;
        }
        c336550DHh.getClass();
        return new C336550DHh(view2, i7, str2, recyclerView, fragment, i6, i5, z, c321610Cj92, z2);
    }

    public C336550DHh(View view, int i, String str, RecyclerView recyclerView, Fragment fragment, int i2, int i3, boolean z, C321610Cj9 c321610Cj9, boolean z2) {
        this.LIZ = view;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = recyclerView;
        this.LJ = fragment;
        this.LJFF = i2;
        this.LJI = i3;
        this.LJII = z;
        this.LJIIIIZZ = c321610Cj9;
        this.LJIIIZ = z2;
    }
}
