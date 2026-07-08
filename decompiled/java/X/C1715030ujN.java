package X;

import com.ss.android.ugc.aweme.verify.id.IDVerifyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0ujN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.id.IDVerifyVM$fetchPublicKey$1", f = "IDVerifyVM.kt", l = {67}, m = "invokeSuspend")
public final class C1715030ujN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IDVerifyVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715030ujN(IDVerifyVM iDVerifyVM, InterfaceC1364105Vn<? super C1715030ujN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iDVerifyVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1715030ujN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IDVerifyVM@e43a.fetchPublicKey$1");
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
            C1719290uqF c1719290uqF = C1719290uqF.LIZ;
            IDVerifyVM iDVerifyVM = this.LLILLJJLI;
            C1713570uh1 c1713570uh1 = iDVerifyVM.LL;
            AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(iDVerifyVM, 1388);
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this.LLILLJJLI, 588);
            this.LL = 1;
            if (c1719290uqF.LIZJ(c1713570uh1, awS570S0100000_26, awS605S0100000_26, this) == objLJFF) {
                C1C7U.LIZIZ("IDVerifyVM@e43a.fetchPublicKey$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IDVerifyVM@e43a.fetchPublicKey$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
