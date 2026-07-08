package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import njp.a;

/* JADX INFO: renamed from: X.18XE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.preview.component.AiChatPreviewFeatureComponent$show$2", f = "AiChatPreviewFeatureComponent.kt", l = {}, m = "invokeSuspend")
public final class C18XE extends C09AX implements Function2<InterfaceC1157570gEF<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C18XB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18XE(C18XB c18xb, InterfaceC1364105Vn<? super C18XE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c18xb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C18XE c18xe = new C18XE(this.LLILLJJLI, interfaceC1364105Vn);
        c18xe.LL = obj;
        return c18xe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatPreviewFeatureComponent@2042.show$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1157570gEF interfaceC1157570gEF = (InterfaceC1157570gEF) this.LL;
        if (interfaceC1157570gEF instanceof C1157580gEG) {
            this.LLILLJJLI.i3(new AwS611S0100000_32(interfaceC1157570gEF, (InterfaceC1157570gEF<String>) 212));
        } else if (interfaceC1157570gEF instanceof C1157450gE3) {
            this.LLILLJJLI.i3(AFwS278S0000000_32.get$arr$(132));
        } else if (interfaceC1157570gEF instanceof C1155990gBh) {
            this.LLILLJJLI.i3(AFwS278S0000000_32.get$arr$(133));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatPreviewFeatureComponent@2042.show$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends String> interfaceC1157570gEF, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
