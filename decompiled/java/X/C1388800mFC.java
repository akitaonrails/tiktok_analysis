package X;

import Y.AgS302S0100000_21;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mFC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.view.MentionPanelViewDelegate$registerObserver$1$1$1$5", f = "MentionPanelViewDelegate.kt", l = {208}, m = "invokeSuspend")
public final class C1388800mFC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MentionPanelViewModel LLILLJJLI;
    public final /* synthetic */ C1388820mFE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388800mFC(MentionPanelViewModel mentionPanelViewModel, C1388820mFE c1388820mFE, InterfaceC1364105Vn<? super C1388800mFC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mentionPanelViewModel;
        this.LLILLL = c1388820mFE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1388800mFC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionPanelViewDelegate@dcd0.registerObserver$1$1$1$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.LLJJ;
            AgS302S0100000_21 agS302S0100000_21 = new AgS302S0100000_21(this.LLILLL, 4);
            this.LL = 1;
            if (anonymousClass0950.collect(agS302S0100000_21, this) == objLJFF) {
                C1C7U.LIZIZ("MentionPanelViewDelegate@dcd0.registerObserver$1$1$1$5");
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
