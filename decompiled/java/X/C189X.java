package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.189X, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.component.AiChatMessageActionComponent$deleteMessage$1", f = "AiChatMessageActionComponent.kt", l = {}, m = "invokeSuspend")
public final class C189X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C18U0 LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ EnumC212372189a LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C189X(C18U0 c18u0, C869590Y9l c869590Y9l, EnumC212372189a enumC212372189a, InterfaceC1364105Vn<? super C189X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c18u0;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = enumC212372189a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C189X(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatMessageActionComponent@634.deleteMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterator<C189Y> it2 = this.LL.LLILZ.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZ(this.LLILLJJLI)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AiChatMessageActionComponent@634.deleteMessage$1");
                return unit;
            }
        }
        int i = C189Z.LIZ[this.LLILLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LL.X1(this.LLILLJJLI);
                } else {
                    throw new C1954807lC();
                }
            } else {
                this.LL.Z1(this.LLILLJJLI);
            }
        } else {
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZ(this.LLILLJJLI, false, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiChatMessageActionComponent@634.deleteMessage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
