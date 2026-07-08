package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ttm.TTMContext;
import com.tiktok.ttm.TTMParamData;
import kotlin.jvm.internal.AwS469S0200000_34;

/* JADX INFO: renamed from: X.1BkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213541BkG extends AbstractC2213701BkW {
    public final TTMContext LJIIJJI;

    @Override // X.AbstractC2213701BkW
    public final String LJIIIIZZ() {
        return "se_cel";
    }

    @Override // X.AbstractC2213701BkW
    public final void LJFF(C830870Wib c830870Wib) {
        super.LJFF(c830870Wib);
        TTMContext tTMContext = this.LJIIJJI;
        tTMContext.userContextData = this.LJI;
        tTMContext.strategyName = this.LIZIZ;
    }

    @Override // X.AbstractC2213701BkW
    public final C2213641BkQ LJIIJ(TTMParamData tTMParamData) {
        Object c2213641BkQ;
        try {
            if (LJII().LIZIZ() == EnumC2213841Bkk.TTM_RULE_PACKAGE) {
                c2213641BkQ = LJII().LJ(new AwS469S0200000_34(this, tTMParamData, 3));
            } else {
                c2213641BkQ = new C2213641BkQ(EnumC1910390zoT.PackageTypeIsNotMatch, (Object) null, this, new Exception("package is not TTMRulePackage"), new Object[]{tTMParamData}, 32);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c2213641BkQ = null;
        }
        if (!(c2213641BkQ instanceof C2213641BkQ)) {
            return null;
        }
        return (C2213641BkQ) c2213641BkQ;
    }

    public C2213541BkG(String str, AbstractC2213721BkY abstractC2213721BkY, String str2, int i) {
        super(str, str2, i);
        this.LJIIJJI = new TTMContext();
        this.LJIIIIZZ = abstractC2213721BkY;
        this.LJIIIZ = true;
    }
}
