package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n2.k1;

/* JADX INFO: renamed from: X.0tzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1686530tzP implements InterfaceC1678850tn1 {
    public int LL;
    public int LLILLJJLI;
    public long LLILLL;
    public long LLILZ = k1.LIZIZ;
    public long LLILZIL = 0;

    public /* synthetic */ Object LJJJ() {
        return null;
    }

    public abstract void LJJLIIIJJIZ(long j, float f, Function1<? super InterfaceC1679550to9, Unit> function1);

    public int LJJL() {
        return (int) (this.LLILLL & 4294967295L);
    }

    public int LJJLI() {
        return (int) (this.LLILLL >> 32);
    }

    public final void LJJLIIIJ() {
        this.LL = C13LZ.LJ((int) (this.LLILLL >> 32), C1682380tsi.LJIIJ(this.LLILZ), C1682380tsi.LJIIIIZZ(this.LLILZ));
        int iLJ = C13LZ.LJ((int) (this.LLILLL & 4294967295L), C1682380tsi.LJIIIZ(this.LLILZ), C1682380tsi.LJII(this.LLILZ));
        this.LLILLJJLI = iLJ;
        int i = this.LL;
        long j = this.LLILLL;
        this.LLILZIL = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iLJ - ((int) (j & 4294967295L))) / 2)));
    }

    public AbstractC1686530tzP() {
        long j = 0;
        this.LLILLL = (j & 4294967295L) | (j << 32);
    }

    public final void LJJLIIJ(long j) {
        if (!C1682900ttY.LIZIZ(this.LLILLL, j)) {
            this.LLILLL = j;
            LJJLIIIJ();
        }
    }

    public final void LJJLJ(long j) {
        if (!C1682380tsi.LIZJ(this.LLILZ, j)) {
            this.LLILZ = j;
            LJJLIIIJ();
        }
    }

    public void LJJLIIIJJI(long j, float f, C1695970uEd c1695970uEd) {
        LJJLIIIJJIZ(j, f, null);
    }
}
