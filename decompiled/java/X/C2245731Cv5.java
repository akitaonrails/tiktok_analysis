package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdVM;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245731Cv5 extends C09AY implements Function1<C2245781CvA, C2245781CvA> {
    public final /* synthetic */ MidAdVM LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2245731Cv5(MidAdVM midAdVM, long j, long j2) {
        super(1);
        this.LL = midAdVM;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2245781CvA invoke(C2245781CvA c2245781CvA) {
        long j;
        C2245781CvA c2245781CvA2 = c2245781CvA;
        boolean zLIZ = C2245741Cv6.LIZ(this.LL.LL);
        long j2 = this.LLILLJJLI;
        if (!zLIZ) {
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            j = (j2 / j3) - (this.LLILLL / j3);
        } else {
            j = ((j2 - this.LLILLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 1;
        }
        return C2245781CvA.LIZ(c2245781CvA2, null, new C291001Au(Integer.valueOf((int) j)), null, null, null, null, null, 125);
    }
}
