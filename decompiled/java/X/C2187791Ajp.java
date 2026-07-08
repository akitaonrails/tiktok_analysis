package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Ajp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187791Ajp extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2187791Ajp(int i, int i2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        try {
            Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
            C2187801Ajq.LIZIZ(i, Process.getThreadPriority(i), i2);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Unit.LIZ;
    }
}
