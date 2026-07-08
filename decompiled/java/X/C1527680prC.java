package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0prC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527680prC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1527670prB LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527680prC(C1527670prB c1527670prB, long j) {
        super(0);
        this.LL = c1527670prB;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            this.LL.LJLILLLLZI().LJIILIIL(this.LLILLJJLI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.getClass();
            C1527890prX.LIZIZ(Intrinsics.LJIIJJI(Log.getStackTraceString(e), "[DBServiceImplV4] "));
        }
        return Unit.LIZ;
    }
}
