package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0688, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$onGetMessageEvent$1", f = "BaseCommonChatNoticeViewModel.kt", l = {410, 434}, m = "invokeSuspend")
public final class AnonymousClass0688 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C869590Y9l LL;
    public SessionInfo LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1509705vb LLILZ;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0688(C1509705vb c1509705vb, BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, InterfaceC1364105Vn<? super AnonymousClass0688> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1509705vb;
        this.LLILZIL = baseCommonChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0688(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C869590Y9l c869590Y9l;
        SessionInfo sessionInfoRQ2;
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionInfoRQ2 = this.LLILLJJLI;
            c869590Y9l = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c869590Y9l = (C869590Y9l) C13LP.LJJJLL(this.LLILZ.LIZ);
            if (c869590Y9l == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1");
                return unit2;
            }
            sessionInfoRQ2 = this.LLILZIL.RQ2();
            if (sessionInfoRQ2 == null) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1");
                return unit3;
            }
            if (C06NJ.LIZJ()) {
                List<C869590Y9l> list = this.LLILZ.LIZ;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<C869590Y9l> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C869590Y9l next = it2.next();
                        if (!C0ZDX.LJJIJIL(next) && !C068M.LIZ(next) && !C0ZDX.LJJJJL(next)) {
                            BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel = this.LLILZIL;
                            List<C869590Y9l> list2 = this.LLILZ.LIZ;
                            baseCommonChatNoticeViewModel.getClass();
                            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseCommonChatNoticeViewModel), null, null, new C15576067y(baseCommonChatNoticeViewModel, list2, null), 3);
                            break;
                        }
                    }
                }
                IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILZIL.LL;
                AnonymousClass0689 anonymousClass0689 = new AnonymousClass0689(this.LLILZ, null);
                this.LL = c869590Y9l;
                this.LLILLJJLI = sessionInfoRQ2;
                this.LLILLL = 1;
                if (iChatNoticeFlowEngine.LIZ(true, "Get message", anonymousClass0689, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1");
                    return objLJFF;
                }
            }
        }
        this.LLILZIL.yQ2(new AnonymousClass0686(c869590Y9l, null), false);
        C1419505h3.LIZ.getClass();
        if (C1419505h3.LIZLLL) {
            ((IPromptUnifiedFrequencyController) this.LLILZIL.LLILZLL.getValue()).LJI(sessionInfoRQ2.getUuid(), EnumC15599068v.COMMON_CHAT_NOTICE_GET_MESSAGE_EVENT);
        }
        if (!this.LLILZIL.LLJ && sessionInfoRQ2.getChatType() != 1 && sessionInfoRQ2.getChatType() != -1) {
            List<C869590Y9l> list3 = this.LLILZ.LIZ;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (C869590Y9l c869590Y9l2 : list3) {
                    if (Intrinsics.LJFF(c869590Y9l2.getScene(), "stranger_unlimit") || (!C0ZDX.LJJIJIL(c869590Y9l2) && !C068M.LIZ(c869590Y9l2) && !C0ZDX.LJJJJL(c869590Y9l2))) {
                        BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel2 = this.LLILZIL;
                        baseCommonChatNoticeViewModel2.LLJ = true;
                        IChatNoticeFlowEngine iChatNoticeFlowEngine2 = baseCommonChatNoticeViewModel2.LL;
                        AnonymousClass0687 anonymousClass0687 = new AnonymousClass0687(null);
                        this.LL = null;
                        this.LLILLJJLI = null;
                        this.LLILLL = 2;
                        if (iChatNoticeFlowEngine2.LIZ(true, "Request accepted", anonymousClass0687, this) == objLJFF) {
                            C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1");
                            return objLJFF;
                        }
                    }
                }
            }
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
