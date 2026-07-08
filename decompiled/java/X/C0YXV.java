package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YXV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.jsb.impl.EcimGetConversationOnlineMethodIDL$handle$1$1", f = "EcimGetConversationOnlineMethodIDL.kt", l = {38, 39}, m = "invokeSuspend")
public final class C0YXV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PigeonMessageListComponentApi LL;
    public int LLILLJJLI;
    public final /* synthetic */ PigeonConversationDetailContainer LLILLL;
    public final /* synthetic */ CompletionBlock<C0YXW> LLILZ;
    public final /* synthetic */ C0YYQ LLILZIL;
    public final /* synthetic */ C0YXO LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YXV(PigeonConversationDetailContainer pigeonConversationDetailContainer, CompletionBlock<C0YXW> completionBlock, C0YYQ c0yyq, C0YXO c0yxo, String str, InterfaceC1364105Vn<? super C0YXV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pigeonConversationDetailContainer;
        this.LLILZ = completionBlock;
        this.LLILZIL = c0yyq;
        this.LLILZLL = c0yxo;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YXV(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YXV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
