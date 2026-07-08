package Y;

import X.C2262001DgE;
import X.C470590Icr;
import X.C501470JlZ;
import X.C501520Jle;
import X.InterfaceC2262041DgI;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes36.dex */
public class AObjectS6S1101100_35 implements Function2 {
    public final int $t;
    public int i2;
    public long j3;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS6S1101100_35 aObjectS6S1101100_35, Object obj, Object obj2) {
        C2262001DgE c2262001DgE = (C2262001DgE) aObjectS6S1101100_35.l1;
        int i = aObjectS6S1101100_35.i2;
        String str = aObjectS6S1101100_35.s0;
        long j = aObjectS6S1101100_35.j3;
        C470590Icr c470590Icr = (C470590Icr) obj;
        Integer num = (Integer) obj2;
        InterfaceC2262041DgI interfaceC2262041DgI = c2262001DgE.LIZIZ;
        if (interfaceC2262041DgI != null) {
            interfaceC2262041DgI.Ze(0, "ping_anchor", C2262001DgE.LJFF(i, c470590Icr));
        }
        if (i == 2) {
            c2262001DgE.LJII = false;
        }
        C2262001DgE.LJIIJ(System.currentTimeMillis() - j, str, i, -100, num.intValue(), true);
        return null;
    }

    public static final Object invoke$1(AObjectS6S1101100_35 aObjectS6S1101100_35, Object obj, Object obj2) {
        int errorCode;
        C2262001DgE c2262001DgE = (C2262001DgE) aObjectS6S1101100_35.l1;
        String str = aObjectS6S1101100_35.s0;
        int i = aObjectS6S1101100_35.i2;
        long j = aObjectS6S1101100_35.j3;
        Throwable th = (Throwable) obj;
        Integer num = (Integer) obj2;
        InterfaceC2262041DgI interfaceC2262041DgI = c2262001DgE.LIZIZ;
        boolean z = th instanceof C501470JlZ;
        if (z) {
            errorCode = ((C501520Jle) th).getErrorCode();
        } else {
            errorCode = 0;
        }
        if (interfaceC2262041DgI != null) {
            if (z) {
                if (!c2262001DgE.LIZLLL) {
                    C501520Jle c501520Jle = (C501520Jle) th;
                    interfaceC2262041DgI.Ze(c501520Jle.getErrorCode(), "ping_anchor", false);
                    if (c501520Jle.getErrorCode() == 30001 || c501520Jle.getErrorCode() == 50002 || c501520Jle.getErrorCode() == 30003 || c501520Jle.getErrorCode() == 30003001) {
                        c2262001DgE.LIZLLL = true;
                    }
                }
            } else {
                interfaceC2262041DgI.Ze(0, "ping_anchor", false);
            }
        }
        C2262001DgE.LJIIJ(System.currentTimeMillis() - j, str, errorCode, i, num.intValue(), true);
        return null;
    }

    public AObjectS6S1101100_35(int i, long j, C2262001DgE c2262001DgE, String str, int i2) {
        this.$t = i2;
        if (i2 != 0) {
            this.l1 = c2262001DgE;
            this.s0 = str;
            this.i2 = i;
            this.j3 = j;
            return;
        }
        this.l1 = c2262001DgE;
        this.i2 = i;
        this.s0 = str;
        this.j3 = j;
    }
}
