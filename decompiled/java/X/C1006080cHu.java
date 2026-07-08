package X;

import Y.AgS297S0100000_16;
import com.ss.android.ugc.aweme.minis.feed.instantplay.vh.MiniGameInstantPlayContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.feed.instantplay.vh.MiniGameInstantPlayContentAssem$subscribeColorFlow$1", f = "MiniGameInstantPlayContentAssem.kt", l = {197}, m = "invokeSuspend")
public final class C1006080cHu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1006440cIU LLILLJJLI;
    public final /* synthetic */ MiniGameInstantPlayContentAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006080cHu(C1006440cIU c1006440cIU, MiniGameInstantPlayContentAssem miniGameInstantPlayContentAssem, InterfaceC1364105Vn<? super C1006080cHu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1006440cIU;
        this.LLILLL = miniGameInstantPlayContentAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1006080cHu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiniGameInstantPlayContentAssem@90b7.subscribeColorFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(this.LLILLJJLI.LJIILLIIL);
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILLL, 24);
            this.LL = 1;
            if (anonymousClass0951LIZIZ.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("MiniGameInstantPlayContentAssem@90b7.subscribeColorFlow$1");
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
