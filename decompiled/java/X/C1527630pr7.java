package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527630pr7 extends C09AY implements Function0<List<? extends C0WYW>> {
    public final /* synthetic */ C1527670prB LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL = 50;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527630pr7(C1527670prB c1527670prB, long j, int i, long j2) {
        super(0);
        this.LL = c1527670prB;
        this.LLILLJJLI = j;
        this.LLILZ = i;
        this.LLILZIL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C0WYW> invoke() {
        try {
            return this.LL.LJLILLLLZI().LIZ(this.LLILLJJLI, this.LLILLL, EnumC1527610pr5.OneByOne, this.LLILZ, this.LLILZIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.getClass();
            C1527890prX.LIZIZ(Intrinsics.LJIIJJI(Log.getStackTraceString(th), "[DBServiceImplV4] "));
            C1526710ppd.LIZJ().ensureNotReachHere(th, th.getMessage());
            return Collections.emptyList();
        }
    }
}
