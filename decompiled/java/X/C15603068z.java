package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.068z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel", f = "SingleChatNoticeViewModel.kt", l = {271, 276, 279}, m = "handleChatUnavailableNotice")
public final class C15603068z extends AbstractC23140094w {
    public Function2 LL;
    public EnumC1596306Mv LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SingleChatNoticeViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15603068z(SingleChatNoticeViewModel singleChatNoticeViewModel, InterfaceC1364105Vn<? super C15603068z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = singleChatNoticeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleChatNoticeViewModel@3e8d.handleChatUnavailableNotice$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLILZ.HQ2(null, this, null);
        C1C7U.LIZIZ("SingleChatNoticeViewModel@3e8d.handleChatUnavailableNotice$1");
        return objHQ2;
    }
}
