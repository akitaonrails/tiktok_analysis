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

/* JADX INFO: renamed from: X.0YXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.jsb.impl.EcimSetMessageFlightStatusMethodIDL$handle$1$1", f = "EcimSetMessageFlightStatusMethodIDL.kt", l = {31}, m = "invokeSuspend")
public final class C875820YXk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PigeonConversationDetailContainer LLILLJJLI;
    public final /* synthetic */ CompletionBlock<C0YYV> LLILLL;
    public final /* synthetic */ C0YY6 LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875820YXk(PigeonConversationDetailContainer pigeonConversationDetailContainer, CompletionBlock<C0YYV> completionBlock, C0YY6 c0yy6, String str, InterfaceC1364105Vn<? super C875820YXk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonConversationDetailContainer;
        this.LLILLL = completionBlock;
        this.LLILZ = c0yy6;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875820YXk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        C1C7U.LIZ("EcimSetMessageFlightStatusMethodIDL@7cfc.handle$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C414301jJ c414301jJLJJIII = ((PigeonMessageListComponentApi) this.LLILLJJLI.LJJJJL(C13LE.LIZ(PigeonMessageListComponentApi.class))).LJJIII();
            this.LL = 1;
            obj = C09IC.LJIIZILJ(c414301jJLJJIII, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcimSetMessageFlightStatusMethodIDL@7cfc.handle$1$1");
                return objLJFF;
            }
        }
        C0YY6 c0yy6 = this.LLILZ;
        Iterator it2 = ((Iterable) obj).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C869590Y9l) next).getUuid(), c0yy6.getUuid())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C869590Y9l c869590Y9l = (C869590Y9l) next;
        if (c869590Y9l == null) {
            C2382909Vj.LIZ(this.LLILLL, 1006, "message not found", null, 4);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcimSetMessageFlightStatusMethodIDL@7cfc.handle$1$1");
            return unit;
        }
        int iIntValue = this.LLILZ.getFlightStatus().intValue();
        if (iIntValue != 100) {
            if (iIntValue != 200) {
                i2 = 3;
            } else {
                i2 = 2;
            }
        }
        c869590Y9l.setMsgStatus(i2);
        ((PigeonMessageSenderComponentApi) this.LLILLJJLI.LJJJJL(C13LE.LIZ(PigeonMessageSenderComponentApi.class))).LIZJ(c869590Y9l, new C914110ZtZ(this.LLILLL, this.LLILZIL, 0));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcimSetMessageFlightStatusMethodIDL@7cfc.handle$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
