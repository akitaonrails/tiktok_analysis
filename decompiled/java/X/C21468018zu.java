package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21468018zu {
    public EnumC21467818zs LIZ;
    public EnumC21468418zy LIZIZ;
    public final Fragment LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final List<C21467618zq> LJIIIZ;
    public final List<C21467618zq> LJIIJ;
    public final List<Runnable> LIZLLL = new ArrayList();
    public boolean LJIIIIZZ = true;

    public void LIZIZ() {
        this.LJII = false;
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        Iterator<Runnable> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
    }

    public void LJ() {
        this.LJII = true;
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Operation {");
        sbLIZ.append(hexString);
        sbLIZ.append("} {finalState = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" lifecycleImpact = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" fragment = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(ViewGroup viewGroup) {
        this.LJII = false;
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        if (((ArrayList) this.LJIIIZ).isEmpty()) {
            LIZIZ();
            return;
        }
        for (C21467618zq c21467618zq : C13LP.LLIIII(this.LJIIJ)) {
            if (!c21467618zq.LIZIZ) {
                c21467618zq.LIZIZ(viewGroup);
            }
            c21467618zq.LIZIZ = true;
        }
    }

    public final void LIZJ(C21467618zq c21467618zq) {
        if (((ArrayList) this.LJIIIZ).remove(c21467618zq) && ((ArrayList) this.LJIIIZ).isEmpty()) {
            LIZIZ();
        }
    }

    public final void LIZLLL(EnumC21467818zs enumC21467818zs, EnumC21468418zy enumC21468418zy) {
        int i = C21468318zx.LIZ[enumC21468418zy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && this.LIZ != EnumC21467818zs.REMOVED) {
                    this.LIZ = enumC21467818zs;
                    return;
                }
                return;
            }
            this.LIZ = EnumC21467818zs.REMOVED;
            this.LIZIZ = EnumC21468418zy.REMOVING;
            this.LJIIIIZZ = true;
            return;
        }
        if (this.LIZ != EnumC21467818zs.REMOVED) {
            return;
        }
        this.LIZ = EnumC21467818zs.VISIBLE;
        this.LIZIZ = EnumC21468418zy.ADDING;
        this.LJIIIIZZ = true;
    }

    public C21468018zu(EnumC21467818zs enumC21467818zs, EnumC21468418zy enumC21468418zy, Fragment fragment) {
        this.LIZ = enumC21467818zs;
        this.LIZIZ = enumC21468418zy;
        this.LIZJ = fragment;
        ArrayList arrayList = new ArrayList();
        this.LJIIIZ = arrayList;
        this.LJIIJ = arrayList;
    }
}
