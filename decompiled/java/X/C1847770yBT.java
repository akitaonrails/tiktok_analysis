package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847770yBT implements InterfaceC1553650qX5 {
    public final C1847740yBQ LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public C1847770yBT LJFF;
    public final WeakReference<View> LJII;
    public C1848300yCK LJIIIIZZ;
    public WeakReference<C1847800yBW> LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public Rect LIZLLL = new Rect();
    public Rect LJ = new Rect();
    public final List<C1847770yBT> LJI = new ArrayList();
    public Pair<String, Boolean> LJIIL = new Pair<>("", Boolean.FALSE);
    public int LJIILIIL = -1;

    @Override // X.InterfaceC1553650qX5
    public final String LIZ() {
        C1848110yC1 c1848110yC1;
        C1848300yCK c1848300yCK = this.LJIIIIZZ;
        if (!(c1848300yCK instanceof C1848110yC1) || (c1848110yC1 = (C1848110yC1) c1848300yCK) == null) {
            return null;
        }
        return c1848110yC1.LJFF;
    }

    public final String LIZIZ() {
        String str = this.LJIIJ;
        return str == null ? this.LIZ.LJIIJ : str;
    }

    public final float LIZJ() {
        return (this.LIZLLL.width() * this.LIZLLL.height()) / (this.LJ.width() * this.LJ.height());
    }

    public final boolean LIZLLL() {
        C1847800yBW c1847800yBW;
        WeakReference<C1847800yBW> weakReference = this.LJIIIZ;
        if (weakReference == null || (c1847800yBW = weakReference.get()) == null) {
            return true;
        }
        return c1847800yBW.LIZLLL;
    }

    public final long LJ() {
        C1159770gHn c1159770gHn;
        Long l;
        C1848300yCK c1848300yCK = this.LJIIIIZZ;
        C07UD c07ud = c1848300yCK != null ? c1848300yCK.LIZLLL : null;
        if (!(c07ud instanceof C1159770gHn) || (c1159770gHn = (C1159770gHn) c07ud) == null || (l = c1159770gHn.LIZJ) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final View LJFF() {
        WeakReference<View> weakReference = this.LJII;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final String LJI() {
        String str = this.LIZ.LIZIZ;
        return str == null ? "" : str;
    }

    public final String LJII() {
        String str = this.LJIIJJI;
        return str == null ? "" : str;
    }

    public final boolean LJIIIIZZ() {
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC1553650qX5
    public final List<String> getMultirefers() {
        C1848110yC1 c1848110yC1;
        List<String> list;
        C1848300yCK c1848300yCK = this.LJIIIIZZ;
        return (!(c1848300yCK instanceof C1848110yC1) || (c1848110yC1 = (C1848110yC1) c1848300yCK) == null || (list = c1848110yC1.LJI) == null) ? C13BV.INSTANCE : list;
    }

    @Override // X.InterfaceC1553650qX5
    public final C2097508Jp getParams() {
        return this.LIZ.LJ.LIZIZ;
    }

    @Override // X.InterfaceC1553650qX5
    public final String getOid() {
        return LJI();
    }

    public final int hashCode() {
        return LIZIZ().hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VTreeNode: hashCode=");
        sbLIZ.append(hashCode());
        sbLIZ.append(", oid=");
        sbLIZ.append(LJI());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1847770yBT) && Intrinsics.LJFF(((C1847770yBT) obj).LIZIZ(), LIZIZ())) {
            return true;
        }
        return false;
    }

    public C1847770yBT(View view, C1847740yBQ c1847740yBQ, boolean z, boolean z2) {
        this.LIZ = c1847740yBQ;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LJII = new WeakReference<>(view);
    }
}
