package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import njp.a;

/* JADX INFO: renamed from: X.0JCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepViewModel$doExecute$2", f = "WalletCommonStepViewModel.kt", l = {32}, m = "invokeSuspend")
public final class C488150JCj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC1718270uob LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ WalletCommonStepViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C488150JCj(AbstractC1718270uob abstractC1718270uob, C19EG c19eg, WalletCommonStepViewModel walletCommonStepViewModel, InterfaceC1364105Vn<? super C488150JCj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC1718270uob;
        this.LLILZ = c19eg;
        this.LLILZIL = walletCommonStepViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C488150JCj c488150JCj = new C488150JCj(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c488150JCj.LLILLJJLI = obj;
        return c488150JCj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("WalletCommonStepViewModel@5682.doExecute$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                AbstractC1718270uob abstractC1718270uob = this.LLILLL;
                C19EG c19eg = this.LLILZ;
                final WalletCommonStepViewModel walletCommonStepViewModel = this.LLILZIL;
                InterfaceC1718330uoh interfaceC1718330uoh = new InterfaceC1718330uoh() { // from class: X.0JCi
                    @Override // X.InterfaceC1718330uoh
                    public final void LIZ(EnumC488180JCm enumC488180JCm, Object obj2) {
                        int i2 = C488170JCl.LIZ[enumC488180JCm.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    WalletCommonStepViewModel walletCommonStepViewModel2 = walletCommonStepViewModel;
                                    walletCommonStepViewModel2.withState(new AwS373S0200000_7(walletCommonStepViewModel2, obj2, 61));
                                    return;
                                }
                                throw new C1954807lC();
                            }
                            WalletCommonStepViewModel walletCommonStepViewModel3 = walletCommonStepViewModel;
                            walletCommonStepViewModel3.withState(new AwS373S0200000_7(walletCommonStepViewModel3, obj2, 60));
                            return;
                        }
                        WalletCommonStepViewModel walletCommonStepViewModel4 = walletCommonStepViewModel;
                        walletCommonStepViewModel4.withState(new AwS586S0100000_7(walletCommonStepViewModel4, 406));
                    }
                };
                this.LL = 1;
                if (abstractC1718270uob.LJIIL(c19eg, interfaceC1718330uoh, this) == objLJFF) {
                    C1C7U.LIZIZ("WalletCommonStepViewModel@5682.doExecute$2");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        WalletCommonStepViewModel walletCommonStepViewModel2 = this.LLILZIL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            walletCommonStepViewModel2.withState(new AwS586S0100000_7(walletCommonStepViewModel2, 405));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WalletCommonStepViewModel@5682.doExecute$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
