package X;

import Y.AObjectS404S0100000_30;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19983813Gy implements InterfaceC19983313Gt, InterfaceC1865240yde {
    public final String LIZ;
    public final C13GW LIZIZ;
    public final int LIZJ;
    public final List<Annotation> LIZLLL;
    public final Set<String> LJ;
    public final String[] LJFF;
    public final InterfaceC19983313Gt[] LJI;
    public final List<Annotation>[] LJII;
    public final boolean[] LJIIIIZZ;
    public final Map<String, Integer> LJIIIZ;
    public final InterfaceC19983313Gt[] LJIIJ;
    public final C01GW LJIIJJI;

    @Override // X.InterfaceC19983313Gt
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC19983313Gt
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.LJIIJJI.getValue()).intValue();
    }

    public final String toString() {
        return C19983713Gx.LIZIZ(this);
    }

    @Override // X.InterfaceC19983313Gt
    public final C13GW LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1865240yde
    public final Set<String> LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC19983313Gt
    public final String LJI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC19983313Gt
    public final List<Annotation> getAnnotations() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC19983313Gt
    public final String LIZJ(int i) {
        return this.LJFF[i];
    }

    @Override // X.InterfaceC19983313Gt
    public final List<Annotation> LJFF(int i) {
        return this.LJII[i];
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJII(String str) {
        Integer num = this.LJIIIZ.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // X.InterfaceC19983313Gt
    public final InterfaceC19983313Gt LJIIIIZZ(int i) {
        return this.LJI[i];
    }

    @Override // X.InterfaceC19983313Gt
    public final boolean LJIIIZ(int i) {
        return this.LJIIIIZZ[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19983813Gy) {
            InterfaceC19983313Gt interfaceC19983313Gt = (InterfaceC19983313Gt) obj;
            if (Intrinsics.LJFF(LJI(), interfaceC19983313Gt.LJI()) && Arrays.equals(this.LJIIJ, ((C19983813Gy) obj).LJIIJ) && LJ() == interfaceC19983313Gt.LJ()) {
                int iLJ = LJ();
                for (int i = 0; i < iLJ; i++) {
                    if (Intrinsics.LJFF(LJIIIIZZ(i).LJI(), interfaceC19983313Gt.LJIIIIZZ(i).LJI()) && Intrinsics.LJFF(LJIIIIZZ(i).LIZIZ(), interfaceC19983313Gt.LJIIIIZZ(i).LIZIZ())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C19983813Gy(String str, C13GW c13gw, int i, List<? extends InterfaceC19983313Gt> list, C13GJ c13gj) {
        this.LIZ = str;
        this.LIZIZ = c13gw;
        this.LIZJ = i;
        this.LIZLLL = c13gj.LIZIZ;
        this.LJ = C13LP.LLIFFJFJJ(c13gj.LIZJ);
        String[] strArr = (String[]) ((ArrayList) c13gj.LIZJ).toArray(new String[0]);
        this.LJFF = strArr;
        this.LJI = C13GE.LIZIZ(c13gj.LJ);
        this.LJII = (List[]) ((ArrayList) c13gj.LJFF).toArray(new List[0]);
        this.LJIIIIZZ = C13LP.LLF(c13gj.LJI);
        C717620SCy c717620SCy = new C717620SCy(new AObjectS404S0100000_30(strArr, 4));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c717620SCy, 10));
        Iterator it2 = c717620SCy.iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (c717610SCx.hasNext()) {
                IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                arrayList.add(new Pair(indexedValue.LIZIZ, Integer.valueOf(indexedValue.LIZ)));
            } else {
                this.LJIIIZ = C2097608Jq.LJIILLIIL(arrayList);
                this.LJIIJ = C13GE.LIZIZ(list);
                this.LJIIJJI = C452501pT.LIZIZ(new AObjectS404S0100000_30(this, 0));
                return;
            }
        }
    }
}
