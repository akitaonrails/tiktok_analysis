package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getconversationinfo.GetConversationInfoListWithoutMsgUseCase$getAndSave$2$1", f = "GetConversationInfoListWithoutMsgUseCase.kt", l = {}, m = "invokeSuspend")
public final class C863500Xu8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0Y1O LL;
    public final /* synthetic */ C0Y8T LLILLJJLI;
    public final /* synthetic */ List<C0YAE> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863500Xu8(C0Y1O c0y1o, C0Y8T c0y8t, List<C0YAE> list, InterfaceC1364105Vn<? super C863500Xu8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y1o;
        this.LLILLJJLI = c0y8t;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863500Xu8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetConversationInfoListWithoutMsgUseCase@511d.getAndSave$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.LJIIZILJ().LIZLLL().LIZLLL().LJII(this.LLILLJJLI.getConversationId(), this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GetConversationInfoListWithoutMsgUseCase@511d.getAndSave$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
