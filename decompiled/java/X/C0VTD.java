package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VTD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0VTD(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL != null) {
            if (C0VTC.LIZIZ == null) {
                synchronized (C0VTC.class) {
                    try {
                        if (C0VTC.LIZIZ == null) {
                            C0VTC.LIZIZ = new C0VTC();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C0VTC.LIZIZ.LIZ(this.LL);
        }
        return Unit.LIZ;
    }
}
