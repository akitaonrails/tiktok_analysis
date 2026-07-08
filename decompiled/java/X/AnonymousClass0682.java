package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0682, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$dismissBannerOnSendMessage$1$1", f = "BaseCommonChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0682 extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0682(C869590Y9l c869590Y9l, BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseCommonChatNoticeViewModel;
        this.LLILLL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0682 anonymousClass0682 = new AnonymousClass0682(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
        anonymousClass0682.LL = obj;
        return anonymousClass0682;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnSendMessage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06OO c06oo = (C06OO) this.LL;
        if (C06NJ.LIZJ()) {
            AnonymousClass0684<C06OO> anonymousClass0684LJIILIIL = this.LLILLJJLI.LL.LJIILIIL(c06oo.LIZ);
            if (anonymousClass0684LJIILIIL == null) {
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnSendMessage$1$1");
                return false;
            }
            Boolean boolValueOf = Boolean.valueOf(anonymousClass0684LJIILIIL.LIZJ(this.LLILLL, c06oo.LIZ));
            C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnSendMessage$1$1");
            return boolValueOf;
        }
        Boolean boolValueOf2 = Boolean.valueOf(c06oo.LIZ.getDismissedByActions().LIZ);
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnSendMessage$1$1");
        return boolValueOf2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
