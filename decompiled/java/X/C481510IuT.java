package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelReq;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IuT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel$cancelRandomMatch$1", f = "MultiTopLiveRandomMatchViewModel.kt", l = {167, 168, 172, 182}, m = "invokeSuspend")
public final class C481510IuT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public RandomMatchGuestCancelReq LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MultiTopLiveRandomMatchViewModel LLILZ;
    public final /* synthetic */ RandomMatchGuestCancelReq LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481510IuT(MultiTopLiveRandomMatchViewModel multiTopLiveRandomMatchViewModel, RandomMatchGuestCancelReq randomMatchGuestCancelReq, InterfaceC1364105Vn<? super C481510IuT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = multiTopLiveRandomMatchViewModel;
        this.LLILZIL = randomMatchGuestCancelReq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C481510IuT c481510IuT = new C481510IuT(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c481510IuT.LLILLL = obj;
        return c481510IuT;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C481510IuT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
