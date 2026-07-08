package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.common.model.GroupLayoutPopupResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06bM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.newhandler.GroupChatInvalidBannerHandlerV2$refreshConversation$1", f = "GroupChatInvalidBannerHandlerV2.kt", l = {105}, m = "invokeSuspend")
public final class C1639006bM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;
    public final /* synthetic */ C1638806bK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639006bM(C0Y8T c0y8t, C1638806bK c1638806bK, InterfaceC1364105Vn<? super C1639006bM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y8t;
        this.LLILLL = c1638806bK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1639006bM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int status;
        C1DWA c1dwa;
        C1C7U.LIZ("GroupChatInvalidBannerHandlerV2@c22e.refreshConversation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                long conversationShortId = this.LLILLJJLI.getConversationShortId();
                this.LL = 1;
                obj = ((TikTokImApi) C1477105qL.LIZIZ.getValue()).getFanGroupRemovedPopup(1, conversationShortId, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GroupChatInvalidBannerHandlerV2@c22e.refreshConversation$1");
                    return objLJFF;
                }
            }
            GroupLayoutPopupResponse groupLayoutPopupResponse = (GroupLayoutPopupResponse) obj;
            if (groupLayoutPopupResponse != null) {
                status = groupLayoutPopupResponse.getStatus();
            } else {
                status = 0;
            }
            C12860051m.LIZ().storeInt(this.LLILLJJLI.getConversationId(), status);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (status == 0) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GroupChatInvalidBannerHandlerV2@c22e.refreshConversation$1");
            return unit;
        }
        View view = this.LLILLL.LLILLL;
        if (view instanceof C1DWA) {
            c1dwa = (C1DWA) view;
        } else {
            c1dwa = null;
        }
        if (c1dwa != null) {
            C1260120ite.LIZIZ(new C1DW9(c1dwa, this.LLILLJJLI, new C1639606bS(this.LLILLL), new C1639406bQ(this.LLILLL), new C1639206bO(this.LLILLL), null));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupChatInvalidBannerHandlerV2@c22e.refreshConversation$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
