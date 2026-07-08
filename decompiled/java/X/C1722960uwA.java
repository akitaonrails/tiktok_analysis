package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.home.WalletHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0uwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.WalletHomeViewModel$fetchPageData$1", f = "WalletHomeViewModel.kt", l = {76}, m = "invokeSuspend")
public final class C1722960uwA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ WalletHomeViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722960uwA(WalletHomeViewModel walletHomeViewModel, InterfaceC1364105Vn<? super C1722960uwA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = walletHomeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1722960uwA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WalletHomeViewModel@b687.fetchPageData$1");
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
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(330));
                C1722980uwC c1722980uwC = (C1722980uwC) this.LLILLJJLI.LLILZ.getValue();
                WalletHomeViewModel walletHomeViewModel = this.LLILLJJLI;
                C1722790uvt c1722790uvt = walletHomeViewModel.LL;
                C759410Tqd c759410Tqd = walletHomeViewModel.LLILLJJLI;
                this.LL = 1;
                c1722980uwC.getClass();
                obj = C1722980uwC.LIZ(c1722790uvt, c1722980uwC, c759410Tqd, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("WalletHomeViewModel@b687.fetchPageData$1");
                    return objLJFF;
                }
            }
            AbstractC989720brW abstractC989720brW = (AbstractC989720brW) obj;
            if (abstractC989720brW instanceof C989710brV) {
                this.LLILLJJLI.setState(new AwS605S0100000_26(abstractC989720brW, (AbstractC989720brW<C1723000uwE>) 310));
            } else if (abstractC989720brW instanceof C991340bu8) {
                this.LLILLJJLI.setState(new AwS605S0100000_26(abstractC989720brW, (AbstractC989720brW<C1723000uwE>) 311));
            } else if (abstractC989720brW instanceof C989700brU) {
                ((C989700brU) abstractC989720brW).LIZIZ.getMessage();
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(331));
            } else {
                throw new C1954807lC();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(332));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WalletHomeViewModel@b687.fetchPageData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
