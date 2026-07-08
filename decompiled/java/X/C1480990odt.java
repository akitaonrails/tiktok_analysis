package X;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.ss.android.ugc.playerkit.model.AutoDubbingConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0odt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480990odt {
    public final Context LIZ;
    public final EnumC1479760obu LIZIZ;
    public final InterfaceC1469840oLu LIZJ;
    public final SparseIntArray LIZLLL;
    public final SparseArray LJ;
    public final AutoDubbingConfig LJFF;
    public final C1481010odv LJI;
    public final C1473340oRY LJII;
    public final List<C308310C6r> LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final int LJIIL;
    public final boolean LJIILIIL;
    public final int LJIILJJIL;
    public final boolean LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final boolean LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final int LJIJJLI;
    public final boolean LJIL;
    public final int LJJ;
    public final int LJJI;
    public final int LJJIFFI;
    public final boolean LJJII;
    public final int LJJIII;
    public final int LJJIIJ;
    public final boolean LJJIIJZLJL;
    public final int LJJIIZ;
    public final int LJJIIZI;
    public final int LJJIJ;
    public final int LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final boolean LJJIJIL;
    public final boolean LJJIJL;
    public final boolean LJJIJLIJ;
    public final int LJJIL;
    public final int LJJIZ;
    public final int LJJJ;
    public final boolean LJJJI;
    public final int LJJJIL;
    public final int LJJJJ;
    public final boolean LJJJJI;
    public final boolean LJJJJIZL;
    public final int LJJJJJ;
    public final int LJJJJJL;

    public C1480990odt(C1480980ods c1480980ods, Context context, EnumC1479760obu enumC1479760obu, C2115308Ql c2115308Ql, InterfaceC1469840oLu interfaceC1469840oLu) {
        SparseIntArray sparseIntArrayClone;
        SparseArray sparseArrayClone;
        C1481010odv c1481010odv;
        C1473340oRY c1473340oRY;
        this.LIZ = context;
        this.LIZIZ = enumC1479760obu;
        this.LIZJ = interfaceC1469840oLu;
        SparseIntArray sparseIntArray = c1480980ods.LJFF;
        if (sparseIntArray == null) {
            sparseIntArrayClone = null;
        } else {
            sparseIntArrayClone = sparseIntArray.clone();
        }
        this.LIZLLL = sparseIntArrayClone;
        SparseArray sparseArray = c1480980ods.LJI;
        if (sparseArray == null) {
            sparseArrayClone = null;
        } else {
            sparseArrayClone = sparseArray.clone();
        }
        this.LJ = sparseArrayClone;
        C1481010odv c1481010odv2 = c1480980ods.LJII;
        if (c1481010odv2 == null) {
            c1481010odv = null;
        } else {
            c1481010odv = new C1481010odv(new C1481020odw(c1481010odv2));
        }
        this.LJI = c1481010odv;
        this.LJFF = c1480980ods.LJIIIIZZ;
        C1473340oRY c1473340oRY2 = c1480980ods.LJJJJIZL;
        if (c1473340oRY2 == null) {
            c1473340oRY = null;
        } else {
            c1473340oRY = new C1473340oRY(new C1473350oRZ(c1473340oRY2));
        }
        this.LJII = c1473340oRY;
        this.LJIIIIZZ = c1480980ods.LJJJJLL != null ? new ArrayList(c1480980ods.LJJJJLL) : null;
        this.LJIIIZ = c1480980ods.LIZJ;
        this.LJIIJ = c1480980ods.LIZLLL;
        this.LJIIJJI = c1480980ods.LJ;
        this.LJIIL = c1480980ods.LJIIIZ;
        this.LJIILIIL = c1480980ods.LJIIJ;
        this.LJIILJJIL = c1480980ods.LJIIJJI;
        this.LJIILL = c1480980ods.LJIILJJIL;
        this.LJIILLIIL = c1480980ods.LJIILL;
        this.LJIIZILJ = c1480980ods.LJIILLIIL;
        this.LJIJ = c1480980ods.LJIIZILJ;
        this.LJIJI = c1480980ods.LJIJ;
        this.LJIJJ = c1480980ods.LJIJI;
        this.LJIJJLI = c1480980ods.LJIJJ;
        this.LJIL = c1480980ods.LJJ;
        this.LJJ = c1480980ods.LJJI;
        this.LJJI = c1480980ods.LJJIFFI;
        this.LJJIFFI = c1480980ods.LJJII;
        this.LJJII = c1480980ods.LJJIII;
        this.LJJIII = c1480980ods.LJJIIJ;
        this.LJJIIJ = c1480980ods.LJJIIJZLJL;
        this.LJJIIJZLJL = c1480980ods.LJJIIZ;
        this.LJJIIZ = c1480980ods.LJJIIZI;
        this.LJJIIZI = c1480980ods.LJJIJ;
        this.LJJIJ = c1480980ods.LJJIJIIJI;
        this.LJJIJIIJI = c1480980ods.LJJIJIIJIL;
        this.LJJIJIIJIL = c1480980ods.LJJIJIL;
        this.LJJIJIL = c1480980ods.LJJIJL;
        this.LJJIJL = c1480980ods.LJJIJLIJ;
        this.LJJIJLIJ = c1480980ods.LJJIL;
        this.LJJIL = c1480980ods.LJJIZ;
        this.LJJIZ = c1480980ods.LJJJ;
        this.LJJJ = c1480980ods.LJJJI;
        this.LJJJI = c1480980ods.LJJJIL;
        this.LJJJIL = c1480980ods.LJJJJ;
        this.LJJJJ = c1480980ods.LJJJJI;
        this.LJJJJI = c1480980ods.LJJJJJ;
        this.LJJJJIZL = c1480980ods.LJJJJJL;
        this.LJJJJJ = c1480980ods.LJJJJL;
        this.LJJJJJL = c1480980ods.LJJJJLI;
    }
}
