package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z5O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882440z5O extends C09AY implements Function0<InterfaceC1881340z3c> {
    public final /* synthetic */ AbstractC1882430z5N LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882440z5O(AbstractC1882430z5N abstractC1882430z5N) {
        super(0);
        this.LL = abstractC1882430z5N;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1881340z3c invoke() {
        AbstractC1882430z5N abstractC1882430z5N = this.LL;
        abstractC1882430z5N.getClass();
        C1882980z6G c1882980z6G = new C1882980z6G(abstractC1882430z5N.LL, abstractC1882430z5N, abstractC1882430z5N.LLILLJJLI);
        AbstractC1882430z5N abstractC1882430z5N2 = this.LL;
        abstractC1882430z5N2.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC1882430z5N2.LLILLJJLI);
        sbLIZ.append(": onPageCreated");
        C20441214yg.LIZIZ("AbsBaseMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        return c1882980z6G;
    }
}
