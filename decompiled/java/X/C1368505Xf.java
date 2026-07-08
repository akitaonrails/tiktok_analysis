package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.component.AiChatMessageActionComponent$observeRunningActionState$1$1", f = "AiChatMessageActionComponent.kt", l = {176, 176}, m = "invokeSuspend")
public final class C1368505Xf extends C09AX implements Function2<InterfaceC346701Wf<? super C189200o6<? extends Unit>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<C189200o6<Unit>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368505Xf(AnonymousClass0957<C189200o6<Unit>> anonymousClass0957, InterfaceC1364105Vn<? super C1368505Xf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1368505Xf c1368505Xf = new C1368505Xf(this.LLILLL, interfaceC1364105Vn);
        c1368505Xf.LLILLJJLI = obj;
        return c1368505Xf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("AiChatMessageActionComponent@634.observeRunningActionState$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AiChatMessageActionComponent@634.observeRunningActionState$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            AnonymousClass0957<C189200o6<Unit>> anonymousClass0957 = this.LLILLL;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AiChatMessageActionComponent@634.observeRunningActionState$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(obj, this) == objLJFF) {
            C1C7U.LIZIZ("AiChatMessageActionComponent@634.observeRunningActionState$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatMessageActionComponent@634.observeRunningActionState$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C189200o6<? extends Unit>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
