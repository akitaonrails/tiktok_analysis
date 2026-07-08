package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.engine.MessageRequestNoticeAbility;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestListAssemV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestListAssemV2$initSubscribe$5", f = "MessageRequestListAssemV2.kt", l = {115}, m = "invokeSuspend")
public final class C427201lO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageRequestListAssemV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C427201lO(MessageRequestListAssemV2 messageRequestListAssemV2, InterfaceC1364105Vn<? super C427201lO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageRequestListAssemV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C427201lO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951LIZIZ;
        C1C7U.LIZ("MessageRequestListAssemV2@40af.initSubscribe$5");
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
            if (C300860Bqm.LIZ()) {
                AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MessageRequestListAssemV2.LLJJI;
                anonymousClass0951LIZIZ = C09IC.LIZIZ(((MessageRequestPageVM) assemVMLazy.getValue()).LLILLL);
            } else {
                anonymousClass0951LIZIZ = C09IC.LIZIZ(((MessageRequestRootPageVM) this.LLILLJJLI.LLJIJIL.getValue()).LL);
            }
            C346901Wh c346901Wh = new C346901Wh(null);
            this.LL = 1;
            if (C09IC.LJIJ(anonymousClass0951LIZIZ, this, c346901Wh) == objLJFF) {
                C1C7U.LIZIZ("MessageRequestListAssemV2@40af.initSubscribe$5");
                return objLJFF;
            }
        }
        MessageRequestNoticeAbility messageRequestNoticeAbility = (MessageRequestNoticeAbility) this.LLILLJJLI.LLJILJIL.getValue();
        if (messageRequestNoticeAbility != null) {
            messageRequestNoticeAbility.pZ1();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestListAssemV2@40af.initSubscribe$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
