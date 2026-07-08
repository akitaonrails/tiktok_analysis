package X;

import com.bytedance.im.core.proto.MessageBody;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y74, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.processmessage.ProcessMessageBodyUseCase$saveNormalMessage$2", f = "ProcessMessageBodyUseCase.kt", l = {}, m = "invokeSuspend")
public final class C0Y74 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y7T>, Object> {
    public final /* synthetic */ C0Y77 LL;
    public final /* synthetic */ MessageBody LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y74(C0Y77 c0y77, MessageBody messageBody, String str, int i, Map<String, String> map, int i2, InterfaceC1364105Vn<? super C0Y74> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y77;
        this.LLILLJJLI = messageBody;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = map;
        this.LLILZLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y74(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProcessMessageBodyUseCase@da90.saveNormalMessage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0Y7T c0y7tLIZJ = this.LL.LIZJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        C1C7U.LIZIZ("ProcessMessageBodyUseCase@da90.saveNormalMessage$2");
        return c0y7tLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y7T> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
