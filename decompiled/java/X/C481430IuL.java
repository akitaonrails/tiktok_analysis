package X;

import Y.AgS198S0200000_7;
import com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.MGModuleInteraction;

/* JADX INFO: renamed from: X.0IuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem$startCollectingMatchState$1", f = "HangoutInteractModuleV2Assem.kt", l = {497}, m = "invokeSuspend")
public final class C481430IuL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ HangoutInteractModuleV2Assem LLILLJJLI;
    public final /* synthetic */ MGModuleInteraction LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481430IuL(HangoutInteractModuleV2Assem hangoutInteractModuleV2Assem, MGModuleInteraction mGModuleInteraction, InterfaceC1364105Vn<? super C481430IuL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = hangoutInteractModuleV2Assem;
        this.LLILLL = mGModuleInteraction;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C481430IuL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HangoutInteractModuleV2Assem@14fa.startCollectingMatchState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.ip().LLILLJJLI;
            AgS198S0200000_7 agS198S0200000_7 = new AgS198S0200000_7(this.LLILLJJLI, this.LLILLL, 1);
            this.LL = 1;
            if (anonymousClass0951.collect(agS198S0200000_7, this) == objLJFF) {
                C1C7U.LIZIZ("HangoutInteractModuleV2Assem@14fa.startCollectingMatchState$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
