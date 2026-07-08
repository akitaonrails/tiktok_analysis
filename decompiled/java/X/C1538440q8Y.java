package X;

import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q8Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538440q8Y extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1537710q7N LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1538440q8Y(C1537710q7N c1537710q7N, String str, long j) {
        super(0);
        this.LL = c1537710q7N;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJJIJIIJI();
        C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(this.LL.getHybridContext(), false, null, 3);
        if (c1533020pzoLJIILJJIL != null) {
            this.LL.LJJ(this.LLILLJJLI, this.LLILLL, c1533020pzoLJIILJJIL);
        } else {
            C1537710q7N c1537710q7N = this.LL;
            IResourceServiceX iResourceServiceX = c1537710q7N.LLIZ;
            if (iResourceServiceX != null) {
                c1537710q7N.LJIJJ(this.LLILLJJLI, this.LLILLL, iResourceServiceX);
            } else {
                c1537710q7N.LJIJI(this.LLILLJJLI);
            }
        }
        return Unit.LIZ;
    }
}
