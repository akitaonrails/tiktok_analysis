package X;

import com.bytedance.im.core.proto.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YUQ extends C09AY implements Function1<Response, Unit> {
    public final /* synthetic */ InterfaceC863600XuI<Response> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YUQ(C914120Zta c914120Zta) {
        super(1);
        this.LL = c914120Zta;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Response response) {
        this.LL.onSuccess(response);
        return Unit.LIZ;
    }
}
