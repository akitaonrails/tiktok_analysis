package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F1V, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F1V extends C09AY implements Function1<C348100Dkm, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F1V(int i, long j, long j2, String str) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C348100Dkm c348100Dkm) {
        c348100Dkm.LIZIZ.getMediaRuntimeApi().sendEffectMsg(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
