package X;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D3B, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3B {
    public final int LIZ;
    public final HashMap<String, C1D3A> LIZIZ = new HashMap<>();
    public final C1D3A LIZJ;
    public final C1D3A LIZLLL;

    public C1D3B(int i) {
        this.LIZ = i;
        C1D3A c1d3a = new C1D3A(null, null);
        this.LIZJ = c1d3a;
        C1D3A c1d3a2 = new C1D3A(null, null);
        this.LIZLLL = c1d3a2;
        c1d3a.LIZJ = c1d3a2;
        c1d3a2.LIZLLL = c1d3a;
    }

    public final C2252061DCq LIZ(String str) {
        C1D3A c1d3a;
        if (!this.LIZIZ.containsKey(str) || (c1d3a = this.LIZIZ.get(str)) == null) {
            return null;
        }
        return c1d3a.LIZIZ;
    }

    public final ArrayList<C2252061DCq> LIZIZ(int i) {
        C2252061DCq c2252061DCq;
        if (i >= this.LIZIZ.size()) {
            i = this.LIZIZ.size();
        }
        ArrayList<C2252061DCq> arrayList = new ArrayList<>();
        C1D3A c1d3a = this.LIZLLL.LIZLLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.LJFF(c1d3a, this.LIZJ)) {
                return arrayList;
            }
            if (c1d3a == null || (c2252061DCq = c1d3a.LIZIZ) == null) {
                break;
            }
            arrayList.add(c2252061DCq);
            if (c1d3a != null) {
                c1d3a = c1d3a.LIZLLL;
            } else {
                c1d3a = null;
            }
        }
        return arrayList;
    }

    public final void LIZJ(String str, C2252061DCq c2252061DCq) {
        C1D3A c1d3a;
        C1D3A c1d3a2;
        if (this.LIZIZ.containsKey(str) && (c1d3a2 = this.LIZIZ.get(str)) != null) {
            C1D3A c1d3a3 = c1d3a2.LIZJ;
            C1D3A c1d3a4 = c1d3a2.LIZLLL;
            if (c1d3a3 != null && c1d3a4 != null) {
                c1d3a4.LIZJ = c1d3a3;
                c1d3a3.LIZLLL = c1d3a4;
            }
        }
        C1D3A c1d3a5 = new C1D3A(str, c2252061DCq);
        C1D3A c1d3a6 = this.LIZLLL;
        C1D3A c1d3a7 = c1d3a6.LIZLLL;
        if (c1d3a7 != null) {
            c1d3a7.LIZJ = c1d3a5;
            c1d3a5.LIZLLL = c1d3a7;
            c1d3a5.LIZJ = c1d3a6;
            c1d3a6.LIZLLL = c1d3a5;
        }
        this.LIZIZ.put(str, c1d3a5);
        if (this.LIZIZ.size() <= this.LIZ || (c1d3a = this.LIZJ.LIZJ) == null) {
            return;
        }
        C1D3A c1d3a8 = c1d3a.LIZJ;
        C1D3A c1d3a9 = c1d3a.LIZLLL;
        if (c1d3a8 != null && c1d3a9 != null) {
            c1d3a9.LIZJ = c1d3a8;
            c1d3a8.LIZLLL = c1d3a9;
        }
        C19719512Dh.LIZJ(this.LIZIZ).remove(c1d3a.LIZ);
    }
}
