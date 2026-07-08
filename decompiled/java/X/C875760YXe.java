package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageSenderComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.jsb.impl.EcimSendMessageMethodIDL$handle$1$1", f = "EcimSendMessageMethodIDL.kt", l = {40, 64}, m = "invokeSuspend")
public final class C875760YXe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PigeonMessageSenderComponentApi LL;
    public int LLILLJJLI;
    public final /* synthetic */ PigeonConversationDetailContainer LLILLL;
    public final /* synthetic */ CompletionBlock<InterfaceC875780YXg> LLILZ;
    public final /* synthetic */ C0YYA LLILZIL;
    public final /* synthetic */ C0YXO LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C0YYB LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875760YXe(PigeonConversationDetailContainer pigeonConversationDetailContainer, CompletionBlock<InterfaceC875780YXg> completionBlock, C0YYA c0yya, C0YXO c0yxo, String str, C0YYB c0yyb, InterfaceC1364105Vn<? super C875760YXe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pigeonConversationDetailContainer;
        this.LLILZ = completionBlock;
        this.LLILZIL = c0yya;
        this.LLILZLL = c0yxo;
        this.LLIZ = str;
        this.LLIZLLLIL = c0yyb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875760YXe(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C875760YXe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
