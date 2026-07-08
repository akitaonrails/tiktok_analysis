package X;

import com.ss.android.ugc.aweme.commercialize.measurement.mrc.MRCManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS8S0000001_16;

/* JADX INFO: renamed from: X.0csn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028950csn extends C09AY implements Function1<C1028850csd, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028950csn(MRCManager mRCManager, float f, float f2, long j, long j2, long j3) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1028850csd c1028850csd) {
        C1028850csd c1028850csd2 = c1028850csd;
        float f = this.LL;
        float f2 = this.LLILLJJLI;
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        long j3 = this.LLILZIL;
        C1028960cso.LIZ.getClass();
        C1029050csx.LIZ(c1028850csd2, C1028960cso.LIZIZ, Integer.valueOf(((Number) C276260AsC.LIZ.getValue()).intValue()));
        c1028850csd2.getProvidedLogics().put(C1028960cso.LIZJ.LIZ, new AwS8S0000001_16(f, 0));
        c1028850csd2.getProvidedLogics().putAll(new C1028870csf(new C1028880csg(C1028960cso.LIZLLL, new AwS8S0000001_16(f2, 1))).LIZ);
        C1029050csx.LIZ(c1028850csd2, C1028960cso.LJ, Long.valueOf(j));
        c1028850csd2.LIZJ.put(C1028960cso.LJFF.LIZ, Long.valueOf(j2));
        C1029050csx.LIZ(c1028850csd2, C1028960cso.LJI, Long.valueOf(j3));
        return Unit.LIZ;
    }
}
