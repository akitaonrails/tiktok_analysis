package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.18h0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl$showDialog$2$1$2$1", f = "IMServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C21350818h0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1397620mTQ LL;
    public final /* synthetic */ BaseTemplate LLILLJJLI;
    public final /* synthetic */ IMServiceImpl LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ AIGCSocialModel LLILZIL;
    public final /* synthetic */ C21350518gx LLILZLL;
    public final /* synthetic */ C1397660mTU LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21350818h0(C1397620mTQ c1397620mTQ, BaseTemplate baseTemplate, IMServiceImpl iMServiceImpl, Context context, AIGCSocialModel aIGCSocialModel, C21350518gx c21350518gx, C1397660mTU c1397660mTU, InterfaceC1364105Vn<? super C21350818h0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1397620mTQ;
        this.LLILLJJLI = baseTemplate;
        this.LLILLL = iMServiceImpl;
        this.LLILZ = context;
        this.LLILZIL = aIGCSocialModel;
        this.LLILZLL = c21350518gx;
        this.LLIZ = c1397660mTU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21350818h0(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<MentionDataItem> list;
        String str;
        C1C7U.LIZ("IMServiceImpl@7354.showDialog$2$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C1397650mTT) ListProtector.get(this.LL.LJ, 0)).LIZ(AFwS278S0000000_32.get$arr$(22));
        if (this.LLILLJJLI != null) {
            IMServiceImpl iMServiceImpl = this.LLILLL;
            Context context = this.LLILZ;
            AIGCSocialModel aIGCSocialModel = this.LLILZIL;
            iMServiceImpl.getClass();
            if (!Intrinsics.LJFF(aIGCSocialModel.isGroupChat, Boolean.TRUE) && (list = aIGCSocialModel.peerCameoInfo) != null) {
                IMContactApi.LIZ.getClass();
                C1BGS c1bgsLJ = C069P.LIZ().LJ();
                MentionDataItem mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list);
                if (mentionDataItem != null) {
                    str = mentionDataItem.uid;
                } else {
                    str = null;
                }
                IMUser iMUserLIZLLL = c1bgsLJ.LIZLLL(str, null, "im_chat");
                IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                EnterChatParams enterChatParams = new EnterChatParams(context, iMUserLIZLLL);
                enterChatParams.setQuickChat(true);
                imChatService.LJIILLIIL(enterChatParams, null);
            }
            this.LLILLL.LJIIIIZZ(this.LLILZIL, this.LLILZLL, this.LLILLJJLI);
            this.LLIZ.LIZ().LIZIZ(null);
        } else {
            Activity activityLIZ = C1388190mED.LIZ(this.LLILZ);
            if (activityLIZ != null) {
                C21350518gx c21350518gx = this.LLILZLL;
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(c21350518gx.LJIIJ);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMServiceImpl@7354.showDialog$2$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
