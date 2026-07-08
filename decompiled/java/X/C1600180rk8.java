package X;

import com.ss.android.ugc.aweme.item.StoryCacheData;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600180rk8 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1600200rkA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600180rk8(C1600200rkA c1600200rkA) {
        super(1);
        this.LL = c1600200rkA;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        if (this.LL.LIZ.LIZIZ(2)) {
            if (zBooleanValue || !zBooleanValue) {
                int i = C2187451AjH.LIZ;
                boolean zLIZ = C1209404oG.LIZ();
                boolean z = C1600360rkQ.LIZ().enablePreRequest;
                if (zLIZ && z && this.LL.LIZ.LIZIZ(3)) {
                    long millis = TimeUnit.SECONDS.toMillis(C1600360rkQ.LIZ().requestDelayTime);
                    boolean zBooleanValue2 = ((Boolean) C135900fV.LIZ.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) C135800fU.LIZ.getValue()).booleanValue();
                    if (zBooleanValue2) {
                        if (millis < 0) {
                            millis = 0;
                        }
                        C1600200rkA c1600200rkA = this.LL;
                        C05O0 c05o0 = c1600200rkA.LJ;
                        if (c05o0 == null) {
                            c05o0 = new C05O0(c1600200rkA.LIZJ, millis, new C1600330rkN(this.LL), true);
                            this.LL.LJ = c05o0;
                        }
                        c05o0.LIZIZ();
                    } else if (zBooleanValue3) {
                        if (millis < 0) {
                            millis = 0;
                        }
                        C1600200rkA c1600200rkA2 = this.LL;
                        C05O0 c05o02 = c1600200rkA2.LJ;
                        if (c05o02 == null) {
                            c05o02 = new C05O0(c1600200rkA2.LIZJ, millis, new C1600340rkO(this.LL), false);
                            this.LL.LJ = c05o02;
                        }
                        c05o02.LIZIZ();
                    } else if (millis <= 0) {
                        this.LL.LJIIL();
                    } else {
                        C1600200rkA c1600200rkA3 = this.LL;
                        C23250099c.LIZLLL(c1600200rkA3.LIZJ, null, null, new C01UD(millis, c1600200rkA3, null), 3);
                    }
                }
            } else {
                throw new C1954807lC();
            }
        } else if (this.LL.LIZ.LIZ == 10) {
            StoryCacheData storyCacheData = this.LL.LJII;
            int i2 = C2187451AjH.LIZ;
            InterfaceC1600170rk7 interfaceC1600170rk7 = this.LL.LIZIZ;
            if (interfaceC1600170rk7 != null) {
                interfaceC1600170rk7.LIZ(storyCacheData);
            }
            this.LL.LIZ.LIZIZ(100);
            C1600200rkA c1600200rkA4 = this.LL;
            if (c1600200rkA4.LJI != null) {
                c1600200rkA4.LJIILIIL();
            } else {
                C1600200rkA.LIZIZ(c1600200rkA4, false, 3);
            }
        }
        return Unit.LIZ;
    }
}
