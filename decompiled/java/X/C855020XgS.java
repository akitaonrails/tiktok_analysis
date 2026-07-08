package X;

import Y.AObjectS357S0100000_14;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855020XgS {
    public final /* synthetic */ Bundle LIZ;
    public final /* synthetic */ Function1<String, Unit> LIZIZ;

    public final void LIZ() {
        if (C1433730nPf.LJIILL() == 0) {
            C577950Mld.LIZ("PublishParallel previous task is finished, start pre publish task");
            String strLJJIIJZLJL = C1433730nPf.LJJIIJZLJL(this.LIZ);
            Function1<String, Unit> function1 = this.LIZIZ;
            if (function1 != null) {
                function1.invoke(strLJJIIJZLJL);
            }
            C1433730nPf.LJIIIIZZ = null;
        }
    }

    public C855020XgS(Bundle bundle, AObjectS357S0100000_14 aObjectS357S0100000_14) {
        this.LIZ = bundle;
        this.LIZIZ = aObjectS357S0100000_14;
    }
}
