package com.bytedance.als.dsl;

import X.C1647230sy1;
import X.C1659700tI8;
import X.C1664660tQ8;
import X.C1DRF;
import X.C1DRG;
import X.C2188811AlT;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes26.dex */
public final class OCAdapterViewModel extends ViewModel {
    public final C1647230sy1 LL;
    public final StackTraceElement[] LLILLJJLI;
    public final C1DRF LLILLL;
    public C1DRG LLILZ;

    public final synchronized C1DRG vQ2() {
        C1DRG c1drgLIZIZ;
        if (this.LLILZ != null) {
            throw new IllegalStateException("data{} or build can only be invoked once");
        }
        C1DRF c1drf = this.LLILLL;
        c1drf.LJIIJ = this.LL.LIZLLL;
        c1drgLIZIZ = c1drf.LIZIZ();
        c1drgLIZIZ.LIZ.LIZJ(this.LLILLJJLI);
        this.LLILZ = c1drgLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" ObjectContainer build successfully");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return c1drgLIZIZ;
    }

    public final synchronized C1DRG wQ2() {
        return this.LLILZ;
    }

    public OCAdapterViewModel(String str, C1DRG c1drg, C1647230sy1 c1647230sy1, StackTraceElement[] stackTraceElementArr) {
        C1DRF c1drf;
        this.LL = c1647230sy1;
        this.LLILLJJLI = stackTraceElementArr;
        if (c1drg == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" data{}");
            c1drf = new C1DRF(new C1664660tQ8(C2188811AlT.LIZIZ(sbLIZ)), null);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" data{}");
            c1drf = new C1DRF(new C1664660tQ8(C2188811AlT.LIZIZ(sbLIZ2)), c1drg);
        }
        this.LLILLL = c1drf;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this);
        sbLIZ3.append(" OCAdapterViewModel ");
        sbLIZ3.append(str);
        sbLIZ3.append(" data{} instance init, parentObjectContainer name ");
        sbLIZ3.append(c1drg != null ? c1drg.LIZ : null);
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
