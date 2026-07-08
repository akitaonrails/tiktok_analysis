package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134610fdD extends C09AY implements Function2<Integer, Throwable, Unit> {
    public final /* synthetic */ C05XL<TaskInfoResponse.Data> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134610fdD(int i, long j, long j2, String str, C099F c099f, boolean z) {
        super(2);
        this.LL = c099f;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = z;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Throwable th) {
        int statusCode;
        int iIntValue = num.intValue();
        Throwable th2 = th;
        this.LL.LJIIZILJ(null);
        C1134320fck c1134320fck = C1134320fck.LIZ;
        String str = this.LLILLJJLI;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLL;
        long j = this.LLILZ;
        c1134320fck.getClass();
        if (th2 instanceof C501470JlZ) {
            statusCode = ((C501520Jle) th2).getErrorCode();
        } else if (th2 instanceof IllegalStateException) {
            statusCode = -8;
        } else if (th2 instanceof C1549560qQU) {
            statusCode = -9;
        } else if (th2 instanceof C1494450ozb) {
            statusCode = ((C1494450ozb) th2).getCronetInternalErrorCode();
        } else if (th2 instanceof C1811850xFX) {
            statusCode = ((C1811850xFX) th2).statusCode;
        } else if (th2 instanceof C1494690ozz) {
            statusCode = ((C1494690ozz) th2).getStatusCode();
        } else {
            statusCode = -1;
        }
        C1134320fck.LIZLLL(c1134320fck, str, false, jElapsedRealtime, iIntValue, j, CardStruct.IStatusCode.DEFAULT, statusCode, false, null, this.LLILZIL, this.LLILZLL);
        return Unit.LIZ;
    }
}
