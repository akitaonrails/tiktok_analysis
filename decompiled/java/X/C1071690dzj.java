package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071690dzj {
    public final Context LIZ;
    public final C19EG LIZIZ;
    public EnumC1073320e2M LIZJ;
    public InterfaceC497601wk LIZLLL;
    public final C1073080e1y LJ;
    public final C1071130dyp LJFF;
    public final C1071160dys LJI;

    public final InterfaceC1264610j0t LIZ() {
        return C1071540dzU.LIZIZ.LIZ().LIZIZ(new C1071630dzd(this.LIZ, this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJ, this.LJFF, this.LJI));
    }

    public C1071690dzj(Context context) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        this.LIZ = context;
        this.LIZIZ = c19egLIZIZ;
        this.LIZJ = EnumC1073320e2M.UNKNOWN;
        this.LIZLLL = C2296808zG.LIZ(C0PEM.LIZ);
        this.LJ = new C1073080e1y(0);
        this.LJFF = new C1071130dyp(0);
        this.LJI = new C1071160dys(0);
    }

    public final void LIZIZ(Function1<? super C1071160dys, Unit> function1) {
        function1.invoke(this.LJI);
    }
}
