package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214351BlZ extends C09AY implements Function1<InterfaceC2214261BlQ, Unit> {
    public final /* synthetic */ InterfaceC214902198i LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2214351BlZ(InterfaceC214902198i interfaceC214902198i) {
        super(1);
        this.LL = interfaceC214902198i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC2214261BlQ interfaceC2214261BlQ) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        InterfaceC2214261BlQ interfaceC2214261BlQ2 = interfaceC2214261BlQ;
        Object obj = this.LL;
        if (obj instanceof Fragment) {
            AbstractC1387200mCc c1844400y62 = new C1844400y62((Fragment) obj);
            C520050KaR c520050KaR = new C520050KaR(c1844400y62);
            C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
            C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
            if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                c1844400y62 = abstractC1387200mCc2;
            } else {
                synchronized (c830530Wi3) {
                    try {
                        C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                        if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                            c1844400y62 = abstractC1387200mCc;
                        } else {
                            c830530Wi3.put(c520050KaR, c520050KaR);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            interfaceC2214261BlQ2.LIZJ(c1844400y62);
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj);
        sbLIZ.append(" is not a Fragment!");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
