package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06vR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.actionbar.BusinessChatActionBarVM$getCacheDataAndFetchLatest$1", f = "BusinessChatActionBarVM.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C1763506vR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BusinessChatActionBarVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1763506vR(BusinessChatActionBarVM businessChatActionBarVM, InterfaceC1364105Vn<? super C1763506vR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = businessChatActionBarVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1763506vR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        boolean z;
        boolean z2;
        SessionInfo sessionInfoXQ2;
        String conversationId;
        String strLJFF;
        C1C7U.LIZ("BusinessChatActionBarVM@a852.getCacheDataAndFetchLatest$1");
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
            BusinessChatActionBarVM businessChatActionBarVM = this.LLILLJJLI;
            businessChatActionBarVM.getClass();
            boolean z3 = false;
            try {
                sessionInfoXQ2 = businessChatActionBarVM.xQ2();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                businessChatActionBarVM.wQ2().LIZIZ = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse business chat action bar cache error: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (sessionInfoXQ2 != null && (conversationId = sessionInfoXQ2.getConversationId()) != null && (strLJFF = C0YNP.LJFF(conversationId, "business_chat_action_bar_btn_conf_cache")) != null) {
                list = (List) C051M.LIZJ(strLJFF, new AbstractC1905540zge<List<? extends ActionBarButtonConfBusiness>>() { // from class: X.06vT
                }.getType());
            } else {
                list = null;
            }
            C1745106sT c1745106sTWQ2 = businessChatActionBarVM.wQ2();
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            c1745106sTWQ2.LIZIZ = !z;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((ActionBarButtonConfBusiness) it2.next()).businessBtnId, "ad:form_card")) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    z3 = true;
                }
            }
            if (z3 && !businessChatActionBarVM.LLILLJJLI) {
                businessChatActionBarVM.LLILLJJLI = true;
                C1548820qPI.LIZLLL("chat_room_form_card_submitted", businessChatActionBarVM);
            }
            businessChatActionBarVM.setState(new AwS581S0100000_2(list, (List<ActionBarButtonConfBusiness>) 552));
            BusinessChatActionBarVM businessChatActionBarVM2 = this.LLILLJJLI;
            this.LL = 1;
            if (businessChatActionBarVM2.vQ2(this) == objLJFF) {
                C1C7U.LIZIZ("BusinessChatActionBarVM@a852.getCacheDataAndFetchLatest$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BusinessChatActionBarVM@a852.getCacheDataAndFetchLatest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
