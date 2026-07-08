package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.0hY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208290hY3 {
    public final Activity LIZ;
    public final Cert LIZIZ;
    public final C1208270hY1 LIZJ;
    public final InterfaceC1207170hWF LIZLLL;
    public final C12Q8 LJ;
    public final InterfaceC1798670wuH LJFF;
    public final long LJI;
    public final Function1<String, Unit> LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 785));

    public static Boolean LIZIZ(Pair pair) {
        EnumC1207930hXT enumC1207930hXT;
        if (pair != null && (enumC1207930hXT = (EnumC1207930hXT) pair.getSecond()) != null) {
            int i = C1208360hYA.LIZ[enumC1207930hXT.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.TRUE;
            }
        }
        return null;
    }

    public final void LIZ(C1208240hXy c1208240hXy, C1208000hXa c1208000hXa, Boolean bool) {
        this.LIZLLL.LIZ(c1208240hXy);
        if (bool != null) {
            C1798660wuG.LIZ(this.LJFF, bool.booleanValue(), "promote_above_s_result");
        } else {
            C1798660wuG.LIZ(this.LJFF, C1194170hBH.LIZIZ(this.LIZ), "promote_above_s_result");
        }
        this.LIZLLL.LIZIZ(c1208000hXa);
    }

    public C1208290hY3(InterfaceC1235640iGA interfaceC1235640iGA, Activity activity, Cert cert, C1208270hY1 c1208270hY1, C1208080hXi c1208080hXi, C12Q8 c12q8, InterfaceC1798670wuH interfaceC1798670wuH, long j, AwS384S0200000_18 awS384S0200000_18) {
        this.LIZ = activity;
        this.LIZIZ = cert;
        this.LIZJ = c1208270hY1;
        this.LIZLLL = c1208080hXi;
        this.LJ = c12q8;
        this.LJFF = interfaceC1798670wuH;
        this.LJI = j;
        this.LJII = awS384S0200000_18;
    }
}
