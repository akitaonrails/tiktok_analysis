package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MCF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MCF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0MCC LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ CreativeModel LLILLL;
    public final /* synthetic */ C0MCA LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MCF(C0MCC c0mcc, long j, CreativeModel creativeModel, C0MCA c0mca) {
        super(0);
        this.LL = c0mcc;
        this.LLILLJJLI = j;
        this.LLILLL = creativeModel;
        this.LLILZ = c0mca;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String tag = this.LL.getTag();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyMaterial success, duration=");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLJJLI);
        C559010LwB.LIZIZ(tag, C2188811AlT.LIZIZ(sbLIZ));
        C558950Lw5.LIZ(this.LL.getTag(), this.LL.o2(), this.LLILLL);
        this.LL.T2(this.LLILZ, this.LLILLL, true);
        C554440Loo c554440Loo = C554440Loo.LIZ;
        long j = this.LLILLJJLI;
        c554440Loo.getClass();
        C554440Loo.LIZ(j, null, true);
        return Unit.LIZ;
    }
}
