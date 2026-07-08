package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yBW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847800yBW implements InterfaceC1848550yCj {
    public final C1847770yBT LIZ;
    public final WeakHashMap<View, C1847770yBT> LIZIZ;
    public final C1847770yBT LIZJ;
    public boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1847800yBW)) {
            return false;
        }
        C1847800yBW c1847800yBW = (C1847800yBW) obj;
        return Intrinsics.LJFF(this.LIZ, c1847800yBW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1847800yBW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1847800yBW.LIZJ);
    }

    public final int hashCode() {
        C1847770yBT c1847770yBT = this.LIZ;
        int iHashCode = (((c1847770yBT == null ? 0 : c1847770yBT.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31;
        C1847770yBT c1847770yBT2 = this.LIZJ;
        return iHashCode + (c1847770yBT2 != null ? c1847770yBT2.hashCode() : 0);
    }

    public final String toString() {
        if (!C1847960yBm.LJIIIIZZ) {
            return super.toString();
        }
        C1847770yBT c1847770yBT = this.LIZ;
        if (c1847770yBT == null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(Each floor goes from left to right)");
        LIZIZ(0, sb, C1697810uHb.LJIILJJIL(c1847770yBT));
        return sb.toString();
    }

    @Override // X.InterfaceC1848550yCj
    public final /* bridge */ /* synthetic */ C1847770yBT LIZ() {
        return this.LIZJ;
    }

    public C1847800yBW(C1847770yBT c1847770yBT, WeakHashMap<View, C1847770yBT> weakHashMap, C1847770yBT c1847770yBT2) {
        this.LIZ = c1847770yBT;
        this.LIZIZ = weakHashMap;
        this.LIZJ = c1847770yBT2;
    }

    public final void LIZIZ(int i, StringBuilder sb, List list) {
        String strLJI;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n  ");
        sbLIZ.append(i);
        sbLIZ.append(":[");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1847770yBT c1847770yBT = (C1847770yBT) it2.next();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("\n      {oid=");
            sbLIZ2.append(c1847770yBT.LJI());
            sbLIZ2.append(", parent=");
            C1847770yBT c1847770yBT2 = c1847770yBT.LJFF;
            if (c1847770yBT2 != null) {
                strLJI = c1847770yBT2.LJI();
            } else {
                strLJI = null;
            }
            sbLIZ2.append(strLJI);
            sbLIZ2.append(", type=");
            sbLIZ2.append(c1847770yBT.LIZ.LIZJ);
            sbLIZ2.append(", visible=");
            sbLIZ2.append(c1847770yBT.LIZIZ);
            sbLIZ2.append('}');
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            if (c1847770yBT.LIZJ) {
                sb.append(", virtual=true");
            }
            if (this.LIZJ == c1847770yBT) {
                sb.append(", rootNode=true");
            }
            arrayList.addAll(c1847770yBT.LJI);
        }
        sb.append("\n    ]");
        LIZIZ(i + 1, sb, arrayList);
    }
}
