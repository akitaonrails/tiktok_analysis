package X;

import com.ss.android.ugc.tools.chat.input.model.ActionBarButtonConfBusiness;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zF4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.input.model.AiChatActionBarRepositoryImpl$getAiChatActionBarConfig$1$1", f = "AiChatActionBarRepository.kt", l = {}, m = "invokeSuspend")
public final class C1888440zF4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1888480zF8 LL;
    public final /* synthetic */ List<ActionBarButtonConfBusiness> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1888440zF4(C1888480zF8 c1888480zF8, List<ActionBarButtonConfBusiness> list, InterfaceC1364105Vn<? super C1888440zF4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1888480zF8;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1888440zF4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatActionBarRepositoryImpl@b11c.getAiChatActionBarConfig$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ.LIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatActionBarRepositoryImpl@b11c.getAiChatActionBarConfig$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
