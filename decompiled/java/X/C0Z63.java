package X;

import com.bytedance.im.core.proto.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Z63, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z63 extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ InterfaceC863600XuI<Response> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z63(C914120Zta c914120Zta) {
        super(1);
        this.LL = c914120Zta;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        InterfaceC863600XuI<Response> interfaceC863600XuI = this.LL;
        C0Z64.LIZ.getClass();
        interfaceC863600XuI.LIZIZ(C0Z64.LIZIZ(th));
        return Unit.LIZ;
    }
}
