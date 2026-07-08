package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536760q5q extends C1536750q5p {
    public final Function0<C1536750q5p> LIZ;
    public final ArrayList<C1536750q5p> LIZIZ = new ArrayList<>();

    public C1536760q5q(C1536770q5r c1536770q5r) {
        this.LIZ = c1536770q5r;
    }

    @Override // X.C1536750q5p
    public final void LJ(C1533790q13 c1533790q13) {
        C1536750q5p c1536750q5pInvoke = this.LIZ.invoke();
        if (c1536750q5pInvoke != null) {
            c1536750q5pInvoke.LJ(c1533790q13);
        }
        Iterator<C1536750q5p> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(c1533790q13);
        }
    }

    @Override // X.C1536750q5p
    public final void LJFF(C1532310pyf c1532310pyf) {
        C1536750q5p c1536750q5pInvoke = this.LIZ.invoke();
        if (c1536750q5pInvoke != null) {
            c1536750q5pInvoke.LJFF(c1532310pyf);
        }
        Iterator<C1536750q5p> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(c1532310pyf);
        }
    }

    @Override // X.C1536750q5p
    public final void LIZ(String str, C1533790q13 c1533790q13) {
        C1536750q5p c1536750q5pInvoke = this.LIZ.invoke();
        if (c1536750q5pInvoke != null) {
            c1536750q5pInvoke.LIZ(str, c1533790q13);
        }
        Iterator<C1536750q5p> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str, c1533790q13);
        }
    }

    @Override // X.C1536750q5p
    public final void LIZIZ(String str, Map map) {
        C1536750q5p c1536750q5pInvoke = this.LIZ.invoke();
        if (c1536750q5pInvoke != null) {
            c1536750q5pInvoke.LIZIZ(str, map);
        }
        Iterator<C1536750q5p> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(str, map);
        }
    }

    @Override // X.C1536750q5p
    public final void LIZJ(String str, Map map) {
        C1536750q5p c1536750q5pInvoke = this.LIZ.invoke();
        if (c1536750q5pInvoke != null) {
            c1536750q5pInvoke.LIZJ(str, map);
        }
        Iterator<C1536750q5p> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(str, map);
        }
    }

    @Override // X.C1536750q5p
    public final void LIZLLL(String str, C1533790q13 c1533790q13) {
        C1536750q5p c1536750q5pInvoke = this.LIZ.invoke();
        if (c1536750q5pInvoke != null) {
            c1536750q5pInvoke.LIZLLL(str, c1533790q13);
        }
        Iterator<C1536750q5p> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(str, c1533790q13);
        }
    }
}
