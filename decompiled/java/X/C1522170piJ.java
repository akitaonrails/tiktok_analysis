package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0piJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522170piJ<T> {
    public static int LIZIZ;
    public static final C01GW<ExecutorService> LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(109));
    public static final C01GW<C1522170piJ<C1520560pfi>> LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(108));
    public final InterfaceC1522180piK<T> LIZ;

    public C1522170piJ() {
        throw null;
    }

    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    public final void LIZ(T t) {
        this.LIZ.LIZ(t);
    }

    public C1522170piJ(InterfaceC1522240piQ interfaceC1522240piQ, C1521450ph9 c1521450ph9, int i) {
        int i2;
        InterfaceC1522180piK<T> c1522220piO;
        if ((i & 2) != 0) {
            i2 = LSPassThroughRecordSizeConfig.DEFAULT;
        } else {
            i2 = 0;
        }
        c1521450ph9 = (i & 4) != 0 ? null : c1521450ph9;
        int i3 = LIZIZ;
        if (i3 != 1) {
            if (i3 != 2) {
                c1522220piO = new C1522230piP<>(interfaceC1522240piQ, i2, c1521450ph9);
            } else {
                c1522220piO = new C1522210piN<>(interfaceC1522240piQ, i2, c1521450ph9);
            }
        } else {
            c1522220piO = new C1522220piO<>(interfaceC1522240piQ, i2, c1521450ph9);
        }
        this.LIZ = c1522220piO;
    }
}
