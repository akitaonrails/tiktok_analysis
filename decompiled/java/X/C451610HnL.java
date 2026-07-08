package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451610HnL extends C09AY implements Function0<C724710Sbl> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451610HnL(AbstractC738140SxQ abstractC738140SxQ, boolean z, boolean z2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = abstractC738140SxQ;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C724710Sbl invoke() {
        try {
            if (this.LL) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILLJJLI);
                if (c19egLIZ != null) {
                    return Assembler.BQ2(C0RPA.LIZ(c19egLIZ), c19egLIZ);
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            Fragment fragmentLJI = C724240Sb0.LJI(this.LLILLJJLI);
            if (fragmentLJI != null) {
                return Assembler.BQ2(C0RPA.LIZ(fragmentLJI.requireActivity()), fragmentLJI);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LLILLL) {
                return null;
            }
            throw th;
        }
    }
}
