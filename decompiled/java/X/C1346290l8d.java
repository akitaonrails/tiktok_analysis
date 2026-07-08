package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0l8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1346290l8d extends C1346330l8h {
    public String LIZIZ;
    public Integer LIZJ;
    public String LIZLLL;
    public Function0<Unit> LJ;
    public final C1346310l8f LJFF;
    public final Function1<InterfaceC2234608pE, Unit> LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C1346290l8d() {
        this((String) null, (Integer) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Function0) (0 == true ? 1 : 0), (C1346310l8f) (0 == true ? 1 : 0), 63);
    }

    public /* synthetic */ C1346290l8d(String str, Integer num, String str2, Function0 function0, C1346310l8f c1346310l8f, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (Function0<Unit>) ((i & 8) != 0 ? null : function0), (i & 16) != 0 ? new C1346310l8f(0, false, null, 7) : c1346310l8f, (Function1<? super InterfaceC2234608pE, Unit>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1346290l8d(String str, Integer num, String str2, Function0<Unit> function0, C1346310l8f c1346310l8f, Function1<? super InterfaceC2234608pE, Unit> function1) {
        super(0);
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = str2;
        this.LJ = function0;
        this.LJFF = c1346310l8f;
        this.LJI = function1;
    }
}
