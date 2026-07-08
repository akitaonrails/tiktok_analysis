package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MCE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MCE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C0MCC LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ CreativeModel LLILZ;
    public final /* synthetic */ C0MCA LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MCE(long j, C0MCC c0mcc, long j2, CreativeModel creativeModel, C0MCA c0mca) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = c0mcc;
        this.LLILLL = j2;
        this.LLILZ = creativeModel;
        this.LLILZIL = c0mca;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyMaterial time out, timeoutMillis=");
        sbLIZ.append(this.LL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String tag = this.LLILLJJLI.getTag();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", duration=");
        sbLIZ2.append(System.currentTimeMillis() - this.LLILLL);
        C559010LwB.LIZ(tag, C2188811AlT.LIZIZ(sbLIZ2));
        C558950Lw5.LIZ(this.LLILLJJLI.getTag(), this.LLILLJJLI.o2(), this.LLILZ);
        this.LLILLJJLI.q3(this.LLILZIL, this.LLILZ, true);
        C554440Loo c554440Loo = C554440Loo.LIZ;
        long j = this.LLILLL;
        c554440Loo.getClass();
        C554440Loo.LIZ(j, strLIZIZ, false);
        return Unit.LIZ;
    }
}
