package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$dismissBannerOnReceiveMessage$1$1", f = "BaseCommonChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C15577067z extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15577067z(BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C15577067z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseCommonChatNoticeViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15577067z c15577067z = new C15577067z(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c15577067z.LL = obj;
        return c15577067z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnReceiveMessage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06OO c06oo = (C06OO) this.LL;
        AnonymousClass0684<C06OO> anonymousClass0684LJIILIIL = this.LLILLJJLI.LL.LJIILIIL(c06oo.LIZ);
        if (anonymousClass0684LJIILIIL == null) {
            C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnReceiveMessage$1$1");
            return false;
        }
        Boolean boolValueOf = Boolean.valueOf(anonymousClass0684LJIILIIL.LIZ(this.LLILLL, c06oo.LIZ));
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.dismissBannerOnReceiveMessage$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
