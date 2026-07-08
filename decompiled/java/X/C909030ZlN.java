package X;

import com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: renamed from: X.0ZlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel", f = "SocialActionBarLightInteractionViewModel.kt", l = {411, 416, 423, 425}, m = "fetchLightInteractionActionBarSuspend")
public final class C909030ZlN extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public SessionInfo LLILLL;
    public C0Y8T LLILZ;
    public boolean LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ SocialActionBarLightInteractionViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909030ZlN(SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel, InterfaceC1364105Vn<? super C909030ZlN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = socialActionBarLightInteractionViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialActionBarLightInteractionViewModel@9e54.fetchLightInteractionActionBarSuspend$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLIZ.xQ2(null, null, null, this);
        C1C7U.LIZIZ("SocialActionBarLightInteractionViewModel@9e54.fetchLightInteractionActionBarSuspend$1");
        return objXQ2;
    }
}
