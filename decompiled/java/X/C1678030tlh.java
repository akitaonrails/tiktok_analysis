package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import h0.n2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tlh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678030tlh {
    public C1677580tky<Float, C1677280tkU> LIZ;

    public C1678030tlh() {
        C1677610tl1 c1677610tl1 = n2.LIZ;
        Float fValueOf = Float.valueOf(0.0f);
        this.LIZ = C1677590tkz.LIZIZ(c1677610tl1, fValueOf, fValueOf);
    }

    public final void LIZ(float f, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC497601wk interfaceC497601wk) {
        Function1<Object, Unit> function1LJ;
        if (f <= interfaceC1690500u5o.LJJJJLL(C1678060tlk.LIZ)) {
            return;
        }
        C13YG c13ygLIZ = C13YI.LIZ();
        if (c13ygLIZ != null) {
            function1LJ = c13ygLIZ.LJ();
        } else {
            function1LJ = null;
        }
        C13YG c13ygLIZIZ = C13YI.LIZIZ(c13ygLIZ);
        try {
            float fFloatValue = this.LIZ.getValue().floatValue();
            C1677580tky<Float, C1677280tkU> c1677580tky = this.LIZ;
            if (c1677580tky.LLILZLL) {
                this.LIZ = C1677590tkz.LIZJ(c1677580tky, fFloatValue - f, 0.0f, 30);
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1678040tli(this, null), 3);
            } else {
                this.LIZ = new C1677580tky<>(n2.LIZ, Float.valueOf(-f), null, 60);
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1678050tlj(this, null), 3);
            }
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
            throw th;
        }
    }
}
