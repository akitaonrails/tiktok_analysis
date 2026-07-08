package X;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.12qS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19880612qS<K, V> extends C19880412qQ<K, V> {
    public transient long[] LLJIJIL;
    public transient int LLJILJIL;
    public transient int LLJILJILJ;
    public final boolean LLJILLL;

    public C19880612qS() {
        this(3);
    }

    @Override // X.C19880412qQ
    public final int LIZJ() {
        int iLIZJ = super.LIZJ();
        this.LLJIJIL = new long[iLIZJ];
        return iLIZJ;
    }

    @Override // X.C19880412qQ
    public final Map<K, V> LIZLLL() {
        Map<K, V> mapLIZLLL = super.LIZLLL();
        this.LLJIJIL = null;
        return mapLIZLLL;
    }

    @Override // X.C19880412qQ, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (LJIILLIIL()) {
            return;
        }
        this.LLJILJIL = -2;
        this.LLJILJILJ = -2;
        long[] jArr = this.LLJIJIL;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // X.C19880412qQ
    public final int LJI() {
        return this.LLJILJIL;
    }

    public C19880612qS(int i) {
        super(i);
        this.LLJILLL = false;
    }

    @Override // X.C19880412qQ
    public final void LIZ(int i) {
        if (this.LLJILLL) {
            Objects.requireNonNull(this.LLJIJIL);
            LJJII(((int) (r0[i] >>> 32)) - 1, LJII(i));
            LJJII(this.LLJILJILJ, i);
            LJJII(i, -2);
            LJIIIIZZ();
        }
    }

    @Override // X.C19880412qQ
    public final Map<K, V> LJ(int i) {
        return new LinkedHashMap(i, 1.0f, this.LLJILLL);
    }

    @Override // X.C19880412qQ
    public final int LJII(int i) {
        Objects.requireNonNull(this.LLJIJIL);
        return ((int) r0[i]) - 1;
    }

    @Override // X.C19880412qQ
    public final void LJIIJJI(int i) {
        super.LJIIJJI(i);
        this.LLJILJIL = -2;
        this.LLJILJILJ = -2;
    }

    @Override // X.C19880412qQ
    public final void LJJ(int i) {
        super.LJJ(i);
        long[] jArr = this.LLJIJIL;
        Objects.requireNonNull(jArr);
        this.LLJIJIL = Arrays.copyOf(jArr, i);
    }

    @Override // X.C19880412qQ
    public final int LIZIZ(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    @Override // X.C19880412qQ
    public final void LJIILL(int i, int i2) {
        int size = size() - 1;
        super.LJIILL(i, i2);
        Objects.requireNonNull(this.LLJIJIL);
        LJJII(((int) (r0[i] >>> 32)) - 1, LJII(i));
        if (i < size) {
            Objects.requireNonNull(this.LLJIJIL);
            LJJII(((int) (r0[size] >>> 32)) - 1, i);
            LJJII(i, LJII(size));
        }
        long[] jArr = this.LLJIJIL;
        Objects.requireNonNull(jArr);
        jArr[size] = 0;
    }

    public final void LJJII(int i, int i2) {
        if (i == -2) {
            this.LLJILJIL = i2;
        } else {
            long[] jArr = this.LLJIJIL;
            Objects.requireNonNull(jArr);
            long j = (jArr[i] & (-4294967296L)) | (((long) (i2 + 1)) & 4294967295L);
            long[] jArr2 = this.LLJIJIL;
            Objects.requireNonNull(jArr2);
            jArr2[i] = j;
        }
        if (i2 == -2) {
            this.LLJILJILJ = i;
            return;
        }
        long[] jArr3 = this.LLJIJIL;
        Objects.requireNonNull(jArr3);
        long j2 = (4294967295L & jArr3[i2]) | (((long) (i + 1)) << 32);
        long[] jArr4 = this.LLJIJIL;
        Objects.requireNonNull(jArr4);
        jArr4[i2] = j2;
    }

    @Override // X.C19880412qQ
    public final void LJIIL(int i, int i2, int i3, Object obj, Object obj2) {
        super.LJIIL(i, i2, i3, obj, obj2);
        LJJII(this.LLJILJILJ, i);
        LJJII(i, -2);
    }
}
