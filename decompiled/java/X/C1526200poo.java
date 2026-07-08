package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0poo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526200poo extends C09AY implements Function0<List<? extends C0WYV>> {
    public final /* synthetic */ EnumC1525890poJ LL;
    public final /* synthetic */ C1527670prB LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ = -1;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1526200poo(EnumC1525890poJ enumC1525890poJ, C1527670prB c1527670prB, long j, String str) {
        super(0);
        this.LL = enumC1525890poJ;
        this.LLILLJJLI = c1527670prB;
        this.LLILLL = j;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C0WYV> invoke() {
        try {
            C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
            int i = C1525950poP.LIZ[this.LL.ordinal()];
            if (i == 1) {
                return ((InterfaceC1526220poq) this.LLILLJJLI.LLILZLL.getValue()).LIZIZ(c1526010poVLIZIZ.LIZ, c1526010poVLIZIZ.LIZIZ, this.LLILLL, this.LL, this.LLILZ);
            }
            if (i != 2) {
                return i != 3 ? C13BV.INSTANCE : ((InterfaceC1526220poq) this.LLILLJJLI.LLILZLL.getValue()).LIZLLL(c1526010poVLIZIZ.LIZ, c1526010poVLIZIZ.LIZIZ, this.LLILLL, this.LL, this.LLILZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(':');
            sbLIZ.append((Object) this.LLILZIL);
            return ((InterfaceC1526220poq) this.LLILLJJLI.LLILZLL.getValue()).LJ(c1526010poVLIZIZ.LIZ, c1526010poVLIZIZ.LIZIZ, this.LLILLL, this.LL, C2188811AlT.LIZIZ(sbLIZ), this.LLILZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.getClass();
            C1527890prX.LIZIZ(Intrinsics.LJIIJJI(Log.getStackTraceString(th), "[DBServiceImplV4] "));
            return C13BV.INSTANCE;
        }
    }
}
