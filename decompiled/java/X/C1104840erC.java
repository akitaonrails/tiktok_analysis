package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0erC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104840erC extends C09AY implements Function1<Context, Unit> {
    public final /* synthetic */ C1104820erA LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104840erC(C1104820erA c1104820erA, long j, long j2, long j3) {
        super(1);
        this.LL = c1104820erA;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Context context) {
        this.LL.getClass();
        C1104820erA.LJ();
        C500460Jjw.LIZIZ(Long.valueOf(this.LLILLJJLI), Long.valueOf(this.LLILLL), "opponent_claim");
        C1104820erA c1104820erA = this.LL;
        long j = this.LLILZ;
        long j2 = this.LLILLJJLI;
        long j3 = this.LLILLL;
        c1104820erA.getClass();
        C1104820erA.LJFF(context, j, j2, j3);
        return Unit.LIZ;
    }
}
