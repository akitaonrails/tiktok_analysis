package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.interactioncard.api.InteractionCardApi;
import com.ss.android.ugc.aweme.im.message.template.card.InteractionCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.FortuneCookieInfoComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel$syncFortuneCookieStateToRemote$1", f = "InteractionCardViewModel.kt", l = {100}, m = "invokeSuspend")
public final class C898450ZMl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InteractionCardTemplate LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898450ZMl(InteractionCardTemplate interactionCardTemplate, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C898450ZMl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interactionCardTemplate;
        this.LLILLL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C898450ZMl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        FortuneCookieInfoComponent fortuneCookieInfoComponent;
        C1C7U.LIZ("InteractionCardViewModel@87d.syncFortuneCookieStateToRemote$1");
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
                FortuneCookieInfoComponent fortuneCookieInfoComponent2 = this.LLILLJJLI.fortuneCookieInfoComponent;
                if (fortuneCookieInfoComponent2 != null) {
                    fortuneCookieInfoComponent = new FortuneCookieInfoComponent(fortuneCookieInfoComponent2.messageTips, true);
                } else {
                    fortuneCookieInfoComponent = null;
                }
                ByteString byteStringEncode = InteractionCardTemplate.LIZ(this.LLILLJJLI, fortuneCookieInfoComponent, null, null, null, 254).encode();
                C869590Y9l c869590Y9l = this.LLILLL;
                InteractionCardApi interactionCardApi = (InteractionCardApi) C06LT.LIZ.getValue();
                long conversationShortId = c869590Y9l.getConversationShortId();
                long msgId = c869590Y9l.getMsgId();
                String strBase64 = byteStringEncode.base64();
                String conversationId = c869590Y9l.getConversationId();
                this.LL = 1;
                obj = interactionCardApi.updateInteractionCard(conversationShortId, msgId, strBase64, conversationId, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InteractionCardViewModel@87d.syncFortuneCookieStateToRemote$1");
                    return objLJFF;
                }
            }
            c098200Yq = (BaseResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractionCardViewModel@87d.syncFortuneCookieStateToRemote$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
