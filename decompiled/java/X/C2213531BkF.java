package X;

import com.tiktok.strategycenter.TTMStrategyCenter;
import com.tiktok.strategycenter.TTMStrategyResult;
import com.tiktok.ttm.TTMParamData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS648S0100000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213531BkF extends AbstractC2213701BkW {
    public final String LJIIJJI;

    @Override // X.AbstractC2213701BkW, X.InterfaceC830900Wie
    public final boolean LIZ() {
        return TTMStrategyCenter.getInstance().cleanBizCepRule(this.LJIIJJI, LJII().LIZ);
    }

    @Override // X.AbstractC2213701BkW, X.InterfaceC830900Wie
    public final boolean LIZLLL() {
        boolean zUnRegisterBizCepCallback = TTMStrategyCenter.getInstance().unRegisterBizCepCallback(this.LJIIJJI, LJII().LIZ) & TTMStrategyCenter.getInstance().unRegisterRule(this.LJIIJJI, LJII().LIZ);
        super.LIZLLL();
        return zUnRegisterBizCepCallback;
    }

    @Override // X.AbstractC2213701BkW
    public final String LJIIIIZZ() {
        return "se_cep";
    }

    @Override // X.AbstractC2213701BkW
    public final C2213641BkQ LJIIJ(TTMParamData tTMParamData) {
        EnumC1910390zoT enumC1910390zoT;
        Object[] matchedEvents;
        boolean zIsSuccess = false;
        if (LJII().LIZIZ() == EnumC2213841Bkk.TTM_CEP_PACKAGE) {
            TTMStrategyResult tTMStrategyResultSyncProcessBizCepRule = TTMStrategyCenter.getInstance().syncProcessBizCepRule(this.LJIIJJI, LJII().LIZ, tTMParamData, System.currentTimeMillis());
            Exception error = null;
            if (tTMStrategyResultSyncProcessBizCepRule != null && tTMStrategyResultSyncProcessBizCepRule.getError() != null) {
                enumC1910390zoT = EnumC1910390zoT.RunError;
            } else {
                enumC1910390zoT = EnumC1910390zoT.CepResult;
            }
            if (tTMStrategyResultSyncProcessBizCepRule != null) {
                zIsSuccess = tTMStrategyResultSyncProcessBizCepRule.isSuccess();
            }
            Boolean boolValueOf = Boolean.valueOf(zIsSuccess);
            if (tTMStrategyResultSyncProcessBizCepRule != null) {
                error = tTMStrategyResultSyncProcessBizCepRule.getError();
                matchedEvents = tTMStrategyResultSyncProcessBizCepRule.getMatchedEvents();
            } else {
                matchedEvents = null;
            }
            return new C2213641BkQ(enumC1910390zoT, boolValueOf, this, error, matchedEvents, (Map<Object, ? extends Object>) tTMStrategyResultSyncProcessBizCepRule.getCustomVariables());
        }
        return new C2213641BkQ(EnumC1910390zoT.PackageTypeIsNotMatch, (Object) null, this, new Exception("package is not TTMCepPackage"), new Object[]{tTMParamData}, 32);
    }

    @Override // X.AbstractC2213701BkW
    public final void LJIIIZ(List list, AbstractC830880Wic abstractC830880Wic) {
        if (!TTMStrategyCenter.getInstance().registerBizCepCallback(this.LJIIJJI, LJII().LIZ, this.LIZLLL)) {
            return;
        }
        Object objLJ = LJII().LJ(new AwS648S0100000_34(this, 24));
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(objLJ, bool)) {
            super.LJIIIZ(list, abstractC830880Wic);
        }
        this.LJIIIZ = Intrinsics.LJFF(objLJ, bool);
        Intrinsics.LJFF(objLJ, bool);
    }

    public C2213531BkF(String str, AbstractC2213721BkY abstractC2213721BkY, String str2, int i) {
        super(str, str2, i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(hashCode());
        this.LJIIJJI = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIIIZZ = abstractC2213721BkY;
    }
}
