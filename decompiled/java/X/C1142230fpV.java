package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142230fpV extends C09AY implements Function1<C1142020fpA, C1142020fpA> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142230fpV(long j, long j2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1142020fpA invoke(C1142020fpA c1142020fpA) {
        C1142020fpA c1142020fpA2 = c1142020fpA;
        EnumC1142140fpM enumC1142140fpM = c1142020fpA2.LIZJ;
        if (enumC1142140fpM == EnumC1142140fpM.PLAYING || enumC1142140fpM == EnumC1142140fpM.LOADING) {
            C1142070fpF c1142070fpF = C1142070fpF.LIZ;
            long j = this.LL;
            long j2 = this.LLILLJJLI;
            c1142070fpF.getClass();
            return C1142070fpF.LJJIII(c1142020fpA2, j, j2);
        }
        return c1142020fpA2;
    }
}
