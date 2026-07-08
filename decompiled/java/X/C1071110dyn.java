package X;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071110dyn {
    public final Context LIZ;
    public final C19EG LIZIZ;
    public InterfaceC497601wk LIZJ;
    public final C1071130dyp LIZLLL;
    public final C1071160dys LJ;
    public EnumC1073320e2M LJFF;
    public Bundle LJI;

    public final InterfaceC1070020dx2 LIZ() {
        return C1071540dzU.LIZIZ.LIZ().LIZ(new C1071620dzc(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI));
    }

    public C1071110dyn(Context context) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        this.LIZ = context;
        this.LIZIZ = c19egLIZIZ;
        this.LIZJ = C2296808zG.LIZ(C0PEM.LIZ);
        this.LIZLLL = new C1071130dyp(0);
        this.LJ = new C1071160dys(0);
        this.LJFF = EnumC1073320e2M.UNKNOWN;
    }

    public final void LIZIZ(Function1<? super Bundle, Unit> function1) {
        Bundle bundle = new Bundle();
        function1.invoke(bundle);
        this.LJI = bundle;
    }

    public final void LIZJ(Function1<? super C1071130dyp, Unit> function1) {
        if (C1071170dyt.LIZIZ.LIZ(this.LIZLLL)) {
            return;
        }
        function1.invoke(this.LIZLLL);
    }

    public final void LIZLLL(Function1<? super C1071160dys, Unit> function1) {
        function1.invoke(this.LJ);
    }
}
