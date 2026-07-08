package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.jsb.impl.EcimGetMessageByConversationMethodIDL$handle$1$1", f = "EcimGetMessageByConversationMethodIDL.kt", l = {48, 52}, m = "invokeSuspend")
public final class C875840YXm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public int LLILZ;
    public final /* synthetic */ PigeonConversationDetailContainer LLILZIL;
    public final /* synthetic */ CompletionBlock<InterfaceC875860YXo> LLILZLL;
    public final /* synthetic */ C0YYI LLIZ;
    public final /* synthetic */ C0YYH LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875840YXm(PigeonConversationDetailContainer pigeonConversationDetailContainer, CompletionBlock<InterfaceC875860YXo> completionBlock, C0YYI c0yyi, C0YYH c0yyh, InterfaceC1364105Vn<? super C875840YXm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = pigeonConversationDetailContainer;
        this.LLILZLL = completionBlock;
        this.LLIZ = c0yyi;
        this.LLIZLLLIL = c0yyh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875840YXm(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C875840YXm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
