package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageSenderComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import njp.a;

/* JADX INFO: renamed from: X.0YXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.jsb.impl.EcimSendLocalMessageMethodIDL$handle$1$1", f = "EcimSendLocalMessageMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C875800YXi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PigeonConversationDetailContainer LL;
    public final /* synthetic */ CompletionBlock<InterfaceC875870YXp> LLILLJJLI;
    public final /* synthetic */ C0YXO LLILLL;
    public final /* synthetic */ C0YY9 LLILZ;
    public final /* synthetic */ C0YYD LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875800YXi(PigeonConversationDetailContainer pigeonConversationDetailContainer, CompletionBlock<InterfaceC875870YXp> completionBlock, C0YXO c0yxo, C0YY9 c0yy9, C0YYD c0yyd, InterfaceC1364105Vn<? super C875800YXi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pigeonConversationDetailContainer;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = c0yxo;
        this.LLILZ = c0yy9;
        this.LLILZIL = c0yyd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875800YXi(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0Y8T c0y8t;
        C1C7U.LIZ("EcimSendLocalMessageMethodIDL@5d79.handle$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PigeonConversationComponentApi pigeonConversationComponentApi = (PigeonConversationComponentApi) C876050YYh.LIZLLL(this.LL, C13LE.LIZ(PigeonConversationComponentApi.class));
        if (pigeonConversationComponentApi == null) {
            C2382909Vj.LIZ(this.LLILLJJLI, 9998, "conversationComponent not found", null, 4);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcimSendLocalMessageMethodIDL@5d79.handle$1$1");
            return unit;
        }
        PigeonMessageSenderComponentApi pigeonMessageSenderComponentApi = (PigeonMessageSenderComponentApi) C876050YYh.LIZLLL(this.LL, C13LE.LIZ(PigeonMessageSenderComponentApi.class));
        if (pigeonMessageSenderComponentApi == null) {
            C2382909Vj.LIZ(this.LLILLJJLI, 9998, "messageSender not found", null, 4);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EcimSendLocalMessageMethodIDL@5d79.handle$1$1");
            return unit2;
        }
        C0YX2 c0yx2 = (C0YX2) pigeonConversationComponentApi.LIZIZ().getValue();
        if (c0yx2 != null && (c0y8t = c0yx2.LIZ) != null) {
            C869590Y9l c869590Y9lLIZ = C872800YLu.LIZ(c0y8t, this.LLILLL.LLILZIL, c0y8t, AFwS248S0000000_14.get$arr$(480));
            C0YY9 c0yy9 = this.LLILZ;
            c869590Y9lLIZ.setContent(c0yy9.getMessage().getContent());
            c869590Y9lLIZ.setMsgType(c0yy9.getMessage().getType().intValue());
            for (Map.Entry<String, Object> entry : c0yy9.getMessage().getExt().entrySet()) {
                c869590Y9lLIZ.addExt(entry.getKey(), entry.getValue().toString());
            }
            pigeonMessageSenderComponentApi.LIZJ(c869590Y9lLIZ, new C914120Zta(this.LLILLJJLI, this.LLILZIL, 5));
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("EcimSendLocalMessageMethodIDL@5d79.handle$1$1");
            return unit3;
        }
        C2382909Vj.LIZ(this.LLILLJJLI, 1005, "conversation is null", null, 4);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("EcimSendLocalMessageMethodIDL@5d79.handle$1$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
