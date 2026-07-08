package X;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566110qrB<T> {
    public final int LIZ;
    public final HashMap<String, C1566100qrA<T>> LIZIZ = new HashMap<>();
    public final C1566100qrA<T> LIZJ;
    public final C1566100qrA<T> LIZLLL;

    public C1566110qrB(int i) {
        this.LIZ = i;
        C1566100qrA<T> c1566100qrA = new C1566100qrA<>(null, null);
        this.LIZJ = c1566100qrA;
        C1566100qrA<T> c1566100qrA2 = new C1566100qrA<>(null, null);
        this.LIZLLL = c1566100qrA2;
        c1566100qrA.LIZJ = c1566100qrA2;
        c1566100qrA2.LIZLLL = c1566100qrA;
    }

    public final ArrayList<T> LIZ(int i) {
        T t;
        if (i >= this.LIZIZ.size()) {
            i = this.LIZIZ.size();
        }
        ArrayList<T> arrayList = new ArrayList<>();
        C1566100qrA<T> c1566100qrA = this.LIZLLL.LIZLLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.LJFF(c1566100qrA, this.LIZJ)) {
                return arrayList;
            }
            if (c1566100qrA == null || (t = c1566100qrA.LIZIZ) == null) {
                break;
            }
            arrayList.add(t);
            if (c1566100qrA != null) {
                c1566100qrA = c1566100qrA.LIZLLL;
            } else {
                c1566100qrA = null;
            }
        }
        return arrayList;
    }

    public final ArrayList<C1566100qrA<T>> LIZIZ(int i) {
        if (i >= this.LIZIZ.size()) {
            i = this.LIZIZ.size();
        }
        ArrayList<C1566100qrA<T>> arrayList = new ArrayList<>();
        C1566100qrA<T> c1566100qrA = this.LIZLLL.LIZLLL;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.LJFF(c1566100qrA, this.LIZJ)) {
                return arrayList;
            }
            if (c1566100qrA == null) {
                break;
            }
            arrayList.add(c1566100qrA);
            c1566100qrA = c1566100qrA.LIZLLL;
        }
        return arrayList;
    }

    public final void LIZJ(String str, T t) {
        C1566100qrA<T> c1566100qrA;
        C1566100qrA<T> c1566100qrA2;
        if (this.LIZIZ.containsKey(str) && (c1566100qrA2 = this.LIZIZ.get(str)) != null) {
            C1566100qrA<T> c1566100qrA3 = c1566100qrA2.LIZJ;
            C1566100qrA<T> c1566100qrA4 = c1566100qrA2.LIZLLL;
            if (c1566100qrA3 != null && c1566100qrA4 != null) {
                c1566100qrA4.LIZJ = c1566100qrA3;
                c1566100qrA3.LIZLLL = c1566100qrA4;
            }
        }
        C1566100qrA<T> c1566100qrA5 = new C1566100qrA<>(str, t);
        C1566100qrA<T> c1566100qrA6 = this.LIZLLL;
        C1566100qrA<T> c1566100qrA7 = c1566100qrA6.LIZLLL;
        if (c1566100qrA7 != null) {
            c1566100qrA7.LIZJ = c1566100qrA5;
            c1566100qrA5.LIZLLL = c1566100qrA7;
            c1566100qrA5.LIZJ = c1566100qrA6;
            c1566100qrA6.LIZLLL = c1566100qrA5;
        }
        this.LIZIZ.put(str, c1566100qrA5);
        if (this.LIZIZ.size() <= this.LIZ || (c1566100qrA = this.LIZJ.LIZJ) == null) {
            return;
        }
        C1566100qrA<T> c1566100qrA8 = c1566100qrA.LIZJ;
        C1566100qrA<T> c1566100qrA9 = c1566100qrA.LIZLLL;
        if (c1566100qrA8 != null && c1566100qrA9 != null) {
            c1566100qrA9.LIZJ = c1566100qrA8;
            c1566100qrA8.LIZLLL = c1566100qrA9;
        }
        C19719512Dh.LIZJ(this.LIZIZ).remove(c1566100qrA.LIZ);
    }
}
