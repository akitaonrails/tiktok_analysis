package X;

import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtAuthorPanelVM;
import com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment$onViewCreated$2", f = "SocialThoughtPanelFragment.kt", l = {738}, m = "invokeSuspend")
public final class C341150DYz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialThoughtPanelFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341150DYz(SocialThoughtPanelFragment socialThoughtPanelFragment, InterfaceC1364105Vn<? super C341150DYz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialThoughtPanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C341150DYz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtPanelFragment@3c57.onViewCreated$2");
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
            C346450Di7 c346450Di7 = new C346450Di7(this.LLILLJJLI.SR().LLILLL, 2);
            this.LL = 1;
            if (C09IC.LJIIZILJ(c346450Di7, this) == objLJFF) {
                C1C7U.LIZIZ("SocialThoughtPanelFragment@3c57.onViewCreated$2");
                return objLJFF;
            }
        }
        SocialThoughtAuthorPanelVM socialThoughtAuthorPanelVMSR = this.LLILLJJLI.SR();
        socialThoughtAuthorPanelVMSR.getClass();
        C341220DZg.LJIIIIZZ(socialThoughtAuthorPanelVMSR.LLILLL.getValue(), socialThoughtAuthorPanelVMSR.LL, socialThoughtAuthorPanelVMSR.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtPanelFragment@3c57.onViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
