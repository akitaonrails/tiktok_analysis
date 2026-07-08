package X;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0jq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296310jq1 extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296310jq1(long j, String str) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        String message;
        Throwable th2 = th;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" composition LOAD FAILED at T+");
        sbLIZ.append(jElapsedRealtime);
        sbLIZ.append("ms: ");
        if (th2 != null) {
            message = th2.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C20441214yg.LJFF("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ), th2);
        return Unit.LIZ;
    }
}
