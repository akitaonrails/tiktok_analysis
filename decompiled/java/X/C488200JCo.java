package X;

import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepAssem;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepAssem$doExecute$1$1$1", f = "WalletCommonStepAssem.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C488200JCo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1718270uob LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ WalletCommonStepAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C488200JCo(AbstractC1718270uob abstractC1718270uob, C19EG c19eg, WalletCommonStepAssem walletCommonStepAssem, InterfaceC1364105Vn<? super C488200JCo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1718270uob;
        this.LLILLL = c19eg;
        this.LLILZ = walletCommonStepAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C488200JCo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WalletCommonStepAssem@75b9.doExecute$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AbstractC1718270uob abstractC1718270uob = this.LLILLJJLI;
            C19EG c19eg = this.LLILLL;
            final WalletCommonStepAssem walletCommonStepAssem = this.LLILZ;
            InterfaceC1718330uoh interfaceC1718330uoh = new InterfaceC1718330uoh() { // from class: X.0JCp
                @Override // X.InterfaceC1718330uoh
                public final void LIZ(EnumC488180JCm enumC488180JCm, Object obj2) {
                    int i2 = C488190JCn.LIZ[enumC488180JCm.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            C817503Hh c817503Hh = C817503Hh.LL;
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C488220JCq(walletCommonStepAssem, obj2, null), 2);
                            return;
                        }
                        return;
                    }
                    C817503Hh c817503Hh2 = C817503Hh.LL;
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    C23250099c.LIZLLL(c817503Hh2, C2107308Nj.LIZ, null, new C1222000huA(walletCommonStepAssem, null), 2);
                }
            };
            this.LL = 1;
            if (abstractC1718270uob.LJIIL(c19eg, interfaceC1718330uoh, this) == objLJFF) {
                C1C7U.LIZIZ("WalletCommonStepAssem@75b9.doExecute$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WalletCommonStepAssem@75b9.doExecute$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
