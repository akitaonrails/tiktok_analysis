package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageListComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.api.PigeonMessageSenderComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0YXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.jsb.impl.EcimRemoveLocalMessageMethodIDL$handle$1$1", f = "EcimRemoveLocalMessageMethodIDL.kt", l = {30}, m = "invokeSuspend")
public final class C875830YXl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PigeonConversationDetailContainer LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC2399309ah> LLILLL;
    public final /* synthetic */ C0YYJ LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875830YXl(PigeonConversationDetailContainer pigeonConversationDetailContainer, CompletionBlock<InterfaceC2399309ah> completionBlock, C0YYJ c0yyj, String str, InterfaceC1364105Vn<? super C875830YXl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonConversationDetailContainer;
        this.LLILLL = completionBlock;
        this.LLILZ = c0yyj;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875830YXl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        C1C7U.LIZ("EcimRemoveLocalMessageMethodIDL@46cb.handle$1$1");
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
            PigeonMessageListComponentApi pigeonMessageListComponentApi = (PigeonMessageListComponentApi) C876050YYh.LIZLLL(this.LLILLJJLI, C13LE.LIZ(PigeonMessageListComponentApi.class));
            if (pigeonMessageListComponentApi == null) {
                C2382909Vj.LIZ(this.LLILLL, 9998, "messageListComponent not found", null, 4);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EcimRemoveLocalMessageMethodIDL@46cb.handle$1$1");
                return unit;
            }
            C414301jJ c414301jJLJJIII = pigeonMessageListComponentApi.LJJIII();
            this.LL = 1;
            obj = C09IC.LJIIZILJ(c414301jJLJJIII, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcimRemoveLocalMessageMethodIDL@46cb.handle$1$1");
                return objLJFF;
            }
        }
        C0YYJ c0yyj = this.LLILZ;
        Iterator it2 = ((Iterable) obj).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C869590Y9l) next).getUuid(), c0yyj.getUuid())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C869590Y9l c869590Y9l = (C869590Y9l) next;
        if (c869590Y9l == null) {
            C2382909Vj.LIZ(this.LLILLL, 1006, "msg not found", null, 4);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EcimRemoveLocalMessageMethodIDL@46cb.handle$1$1");
            return unit2;
        }
        ((PigeonMessageSenderComponentApi) this.LLILLJJLI.LJJJJL(C13LE.LIZ(PigeonMessageSenderComponentApi.class))).LIZ(c869590Y9l, true, new C914110ZtZ(this.LLILLL, this.LLILZIL, 4));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EcimRemoveLocalMessageMethodIDL@46cb.handle$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
