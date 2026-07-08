package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Of8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624880Of8 extends C09AY implements Function1<C616100OEm, C616100OEm> {
    public final /* synthetic */ double LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C624880Of8(double d) {
        super(1);
        this.LL = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C616100OEm invoke(C616100OEm c616100OEm) {
        return C616100OEm.LIZ(c616100OEm, this.LL / ((double) 1024), 0, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, 65534);
    }
}
