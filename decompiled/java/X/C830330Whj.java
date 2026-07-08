package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Whj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830330Whj implements C0CS6 {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ Function2<Boolean, Long, Unit> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C830330Whj(Context context, Function2<? super Boolean, ? super Long, Unit> function2) {
        this.LIZ = context;
        this.LIZIZ = function2;
    }

    @Override // X.C0CS6
    public final void LIZ(long j, boolean z) {
        C830320Whi.LIZIZ = true;
        long jLJFF = C0WYJ.LJFF(this.LIZ);
        if (z) {
            C1232140iAW c1232140iAW = C1232140iAW.LIZ;
            Context context = this.LIZ;
            Long lValueOf = Long.valueOf(j);
            Boolean bool = Boolean.TRUE;
            c1232140iAW.getClass();
            C1232140iAW.LIZJ(context, "handleCleanCache success", lValueOf, bool, jLJFF, null);
            this.LIZIZ.invoke(bool, Long.valueOf(j));
            return;
        }
        Function2<Boolean, Long, Unit> function2 = this.LIZIZ;
        Boolean bool2 = Boolean.FALSE;
        function2.invoke(bool2, Long.valueOf(j));
        C1232140iAW c1232140iAW2 = C1232140iAW.LIZ;
        Context context2 = this.LIZ;
        c1232140iAW2.getClass();
        C1232140iAW.LIZJ(context2, "handleCleanCache failed", -1L, bool2, jLJFF, null);
    }
}
