package X;

import Y.ARunnableS127S0100000_27;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y9P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846490y9P extends AbstractC1585810rMx {
    public final RecyclerView LL;
    public final Function1<Integer, Unit> LLILLJJLI;
    public int LLILLL = 50;
    public boolean LLILZ = true;
    public boolean[] LLILZIL = new boolean[0];
    public boolean LLILZLL;
    public final AbstractC21673619ry<?> LLIZ;

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846490y9P.LJJIJIIJIL():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1846490y9P(RecyclerView recyclerView, Function1<? super Integer, Unit> function1) {
        this.LL = recyclerView;
        this.LLILLJJLI = function1;
        if (recyclerView.getAdapter() != null) {
            AbstractC21673619ry<?> adapter = recyclerView.getAdapter();
            this.LLIZ = adapter;
            ViewOnAttachStateChangeListenerC1864670ycj viewOnAttachStateChangeListenerC1864670ycj = new ViewOnAttachStateChangeListenerC1864670ycj(this, 1);
            recyclerView.removeOnScrollListener(this);
            recyclerView.addOnScrollListener(this);
            recyclerView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864670ycj);
            recyclerView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1864670ycj);
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0y9Q
                @Override // X.AbstractC471570IeR
                public final void LIZ() {
                    C1846490y9P c1846490y9P = this.LIZ;
                    c1846490y9P.LLILZIL = new boolean[c1846490y9P.LLIZ.getItemCount()];
                    this.LIZ.LJJIJIIJIL();
                }

                @Override // X.AbstractC471570IeR
                public final void LIZIZ(int i, int i2) {
                    this.LIZ.getClass();
                }

                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    try {
                        boolean[] zArr = this.LIZ.LLILZIL;
                        boolean[] zArr2 = new boolean[zArr.length + i2];
                        System.arraycopy(zArr, 0, zArr2, 0, i);
                        boolean[] zArr3 = this.LIZ.LLILZIL;
                        System.arraycopy(zArr3, i, zArr2, i2 + i, zArr3.length - i);
                        C1846490y9P c1846490y9P = this.LIZ;
                        c1846490y9P.LLILZIL = zArr2;
                        c1846490y9P.LJJIJIIJIL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // X.AbstractC471570IeR
                public final void LJ(int i, int i2) {
                    if (i == i2) {
                        return;
                    }
                    C1846510y9R c1846510y9R = C1846520y9S.LLILZ;
                    int iLJI = Intrinsics.LJI(i2, i);
                    c1846510y9R.getClass();
                    C1846520y9S c1846520y9S = new C1846520y9S(i, i2, iLJI);
                    int i3 = c1846520y9S.LLILLJJLI;
                    int i4 = c1846520y9S.LLILLL;
                    if (i4 <= 0 ? !(i4 >= 0 || i3 > i) : i <= i3) {
                        int i5 = i;
                        while (true) {
                            boolean[] zArr = this.LIZ.LLILZIL;
                            boolean z = zArr[i];
                            zArr[i] = zArr[i5];
                            zArr[i5] = z;
                            if (i5 == i3) {
                                break;
                            }
                            i = i5;
                            i5 += i4;
                        }
                    }
                    this.LIZ.LJJIJIIJIL();
                }

                @Override // X.AbstractC471570IeR
                public final void LJFF(int i, int i2) {
                    try {
                        boolean[] zArr = this.LIZ.LLILZIL;
                        int length = zArr.length - i2;
                        if (length > 0) {
                            boolean[] zArr2 = new boolean[length];
                            System.arraycopy(zArr, 0, zArr2, 0, i);
                            boolean[] zArr3 = this.LIZ.LLILZIL;
                            System.arraycopy(zArr3, i + i2, zArr2, i, (zArr3.length - i) - i2);
                            this.LIZ.LLILZIL = zArr2;
                        }
                        this.LIZ.LJJIJIIJIL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            });
            HandlerHook.viewPost(this.LL, new ARunnableS127S0100000_27(this, 57));
            return;
        }
        throw new RuntimeException("recyclerview adapter was not set");
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.LLILZLL = z;
        if (i == 0) {
            LJJIJIIJIL();
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (!this.LLILZ || this.LLILZLL) {
            LJJIJIIJIL();
        }
    }
}
