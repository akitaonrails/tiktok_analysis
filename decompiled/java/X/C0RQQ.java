package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS66S0100100_11;

/* JADX INFO: renamed from: X.0RQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQQ implements InterfaceC705840RmQ {
    public final /* synthetic */ Function0<String> LIZ;
    public final /* synthetic */ EnumC697290RWt LIZIZ;
    public final /* synthetic */ View LIZJ;

    @Override // X.InterfaceC705840RmQ
    public final void LIZ(long j) {
        String strInvoke = this.LIZ.invoke();
        C697790RYr c697790RYr = C697790RYr.LIZ;
        String end = this.LIZIZ.getEnd();
        c697790RYr.getClass();
        C697790RYr.LIZJ(strInvoke, end, null, null, null, null);
        new AwS66S0100100_11(j, this.LIZJ, 3);
        C695630RQj.LIZ();
    }

    public C0RQQ(View view, EnumC697290RWt enumC697290RWt, Function0 function0) {
        this.LIZ = function0;
        this.LIZIZ = enumC697290RWt;
        this.LIZJ = view;
    }
}
