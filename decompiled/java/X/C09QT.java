package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09QT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function2<String, Context, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09QT(long j, long j2, String str, Function2 function2) {
        super(0);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = function2;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            C2369309Qd.LIZ(Long.valueOf(System.currentTimeMillis() - this.LLILLJJLI), "pdp_out_share", "jump_pdp", String.valueOf(this.LL));
            this.LLILLL.invoke(this.LLILZ, C08AH.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return Unit.LIZ;
    }
}
