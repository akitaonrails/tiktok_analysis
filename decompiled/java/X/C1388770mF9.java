package X;

import com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mF9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.view.MentionPanelViewDelegate$registerObserver$1$1$1", f = "MentionPanelViewDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1388770mF9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MentionPanelViewModel LLILLJJLI;
    public final /* synthetic */ C1388820mFE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388770mF9(MentionPanelViewModel mentionPanelViewModel, C1388820mFE c1388820mFE, InterfaceC1364105Vn<? super C1388770mF9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mentionPanelViewModel;
        this.LLILLL = c1388820mFE;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1388770mF9 c1388770mF9 = new C1388770mF9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1388770mF9.LL = obj;
        return c1388770mF9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionPanelViewDelegate@dcd0.registerObserver$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1388760mF8(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1388750mF7(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1388780mFA(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1388790mFB(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1388800mFC(this.LLILLJJLI, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionPanelViewDelegate@dcd0.registerObserver$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
