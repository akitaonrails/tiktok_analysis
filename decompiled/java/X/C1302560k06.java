package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k06, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession$maybeSwitchToSpeakerOnCallStart$2", f = "CallSession.kt", l = {216, 225}, m = "invokeSuspend")
public final class C1302560k06 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1302520k02 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302560k06(C1302520k02 c1302520k02, InterfaceC1364105Vn<? super C1302560k06> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1302520k02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302560k06(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1302520k02 c1302520k02 = this.LLILLJJLI;
            AnonymousClass0957[] anonymousClass0957Arr = {c1302520k02.LLJJI, c1302520k02.LLJJIII};
            this.LL = 1;
            if (C1D9F.LIZIZ(anonymousClass0957Arr, this) == objLJFF) {
                return objLJFF;
            }
        }
        C1302410jzr c1302410jzrLIZLLL = C1302460jzw.LIZLLL(this.LLILLJJLI.LLJILLL);
        if (C1302460jzw.LJ(this.LLILLJJLI.LLJILJILJ) && c1302410jzrLIZLLL != null) {
            C1302520k02 c1302520k022 = this.LLILLJJLI;
            this.LL = 2;
            if (c1302520k022.LIZLLL(c1302410jzrLIZLLL, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
