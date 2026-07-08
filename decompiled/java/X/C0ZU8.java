package X;

import Y.AgS203S0200000_14;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZU8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.data.MediaGridDataRepo$MediaGridConversationDataState$2", f = "MediaGridDataRepo.kt", l = {238}, m = "invokeSuspend")
public final class C0ZU8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0ZU9 LLILLJJLI;
    public final /* synthetic */ C0ZU2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZU8(C0ZU9 c0zu9, C0ZU2 c0zu2, InterfaceC1364105Vn<? super C0ZU8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0zu9;
        this.LLILLL = c0zu2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZU8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaGridDataRepo$MediaGridConversationDataState@dcf8.2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0ZU9 c0zu9 = this.LLILLJJLI;
            AnonymousClass0950 anonymousClass0950 = c0zu9.LIZJ.LLJILJILJ;
            AgS203S0200000_14 agS203S0200000_14 = new AgS203S0200000_14(c0zu9, this.LLILLL, 1);
            this.LL = 1;
            if (anonymousClass0950.collect(agS203S0200000_14, this) == objLJFF) {
                C1C7U.LIZIZ("MediaGridDataRepo$MediaGridConversationDataState@dcf8.2");
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
