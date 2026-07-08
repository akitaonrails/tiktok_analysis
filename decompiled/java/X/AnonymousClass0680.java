package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.IChatNoticeApiHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0680, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$sendNoticeAck$1", f = "BaseCommonChatNoticeViewModel.kt", l = {565}, m = "invokeSuspend")
public final class AnonymousClass0680 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ SessionInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0680(BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, String str, int i, SessionInfo sessionInfo, InterfaceC1364105Vn<? super AnonymousClass0680> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseCommonChatNoticeViewModel;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = sessionInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0680(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.sendNoticeAck$1");
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
            IChatNoticeApiHelper iChatNoticeApiHelper = this.LLILLJJLI.LLIZ;
            String str = this.LLILLL;
            int i2 = this.LLILZ;
            SessionInfo sessionInfo = this.LLILZIL;
            this.LL = 1;
            if (iChatNoticeApiHelper.LIZIZ(str, i2, sessionInfo, this) == objLJFF) {
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.sendNoticeAck$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.sendNoticeAck$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
