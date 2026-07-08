package X;

import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponentApi;
import com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.message.PigeonMessageListComponent$startFetchMessageList$2", f = "PigeonMessageListComponent.kt", l = {183, 190}, m = "invokeSuspend")
public final class C0NZ9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<C0Y8T> LLILLL;
    public final /* synthetic */ PigeonMessageListComponent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NZ9(C259800zU<C0Y8T> c259800zU, PigeonMessageListComponent pigeonMessageListComponent, InterfaceC1364105Vn<? super C0NZ9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = pigeonMessageListComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NZ9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<C0Y8T> c259800zU;
        T t;
        C1C7U.LIZ("PigeonMessageListComponent@9fc5.startFetchMessageList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            c259800zU = this.LL;
            C155000ia.LIZIZ(obj);
            t = obj;
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = this.LLILLL;
            PigeonConversationComponentApi pigeonConversationComponentApi = (PigeonConversationComponentApi) this.LLILZ.LLILZLL.getValue();
            C0NZA c0nza = new C0NZA(this.LLILZ, null);
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            Object objLJJL = pigeonConversationComponentApi.LJJL(c0nza, this);
            t = objLJJL;
            if (objLJJL == objLJFF) {
                C1C7U.LIZIZ("PigeonMessageListComponent@9fc5.startFetchMessageList$2");
                return objLJFF;
            }
        }
        c259800zU.element = t;
        if (this.LLILLL.element == null) {
            this.LLILZ.LLJILJILJ.setValue(new C0NZD(C0NZC.CONVERSATION_NOT_FOUND));
        }
        PigeonMessageListComponent pigeonMessageListComponent = this.LLILZ;
        this.LL = null;
        this.LLILLJJLI = 2;
        if (pigeonMessageListComponent.LJJLIIIJJI(this) == objLJFF) {
            C1C7U.LIZIZ("PigeonMessageListComponent@9fc5.startFetchMessageList$2");
            return objLJFF;
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
