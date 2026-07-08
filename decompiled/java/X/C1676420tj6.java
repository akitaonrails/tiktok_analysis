package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p2.j1;

/* JADX INFO: renamed from: X.0tj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676420tj6 extends AbstractC20055413dY implements InterfaceC20056813dm {
    public Function1<? super C1682900ttY, Unit> LLJJ;
    public final boolean LLJJI = true;
    public long LLJJIII;

    @Override // X.InterfaceC20056813dm
    public final /* synthetic */ void LLFF(j1 j1Var) {
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return this.LLJJI;
    }

    public C1676420tj6(Function1<? super C1682900ttY, Unit> function1) {
        this.LLJJ = function1;
        long j = Integer.MIN_VALUE;
        this.LLJJIII = (j & 4294967295L) | (j << 32);
    }

    @Override // X.InterfaceC20056813dm
    public final void LJJLJ(long j) {
        if (!C1682900ttY.LIZIZ(this.LLJJIII, j)) {
            this.LLJJ.invoke(new C1682900ttY(j));
            this.LLJJIII = j;
        }
    }
}
