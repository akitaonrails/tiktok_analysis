package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uF4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696240uF4 extends AbstractC20055413dY {
    public long LLJJ;
    public long LLJJI;
    public Function1<? super C20059513eD, Unit> LLJJIII;
    public C20059013e8 LLJJIJI;

    public final void LLJJ() {
        C20059013e8 c20059013e8 = this.LLJJIJI;
        if (c20059013e8 != null) {
            c20059013e8.LIZIZ();
        }
        long j = this.LLJJ;
        long j2 = this.LLJJI;
        Function1<? super C20059513eD, Unit> function1 = this.LLJJIII;
        C20053713dH c20053713dHLJFF = C20052513d5.LJFF(this);
        int i = c20053713dHLJFF.LLILLJJLI;
        C20059113e9 c20059113e9 = C1696120uEs.LIZ(c20053713dHLJFF).getRectManager().LIZIZ;
        c20059113e9.getClass();
        if (j2 == 0) {
            j2 = j;
        }
        C20029713Yp<C20059013e8> c20029713Yp = c20059113e9.LIZ;
        C20059013e8 c20059013e82 = new C20059013e8(c20059113e9, i, j, j2, this, function1);
        C20059013e8 c20059013e8LIZIZ = c20029713Yp.LIZIZ(i);
        if (c20059013e8LIZIZ == null) {
            c20029713Yp.LJII(i, c20059013e82);
            c20059013e8LIZIZ = c20059013e82;
        }
        C20059013e8 c20059013e83 = c20059013e8LIZIZ;
        if (c20059013e83 != c20059013e82) {
            while (true) {
                C20059013e8 c20059013e84 = c20059013e83.LJFF;
                if (c20059013e84 == null) {
                    break;
                } else {
                    c20059013e83 = c20059013e84;
                }
            }
            c20059013e83.LJFF = c20059013e82;
        }
        this.LLJJIJI = c20059013e82;
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        C20059013e8 c20059013e8 = this.LLJJIJI;
        if (c20059013e8 != null) {
            c20059013e8.LIZIZ();
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLILZIL() {
        LLJJ();
    }

    public C1696240uF4(long j, long j2, Function1<? super C20059513eD, Unit> function1) {
        this.LLJJ = j;
        this.LLJJI = j2;
        this.LLJJIII = function1;
    }
}
