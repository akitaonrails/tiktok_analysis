package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KXM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0KXL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KXM(C0KXL c0kxl) {
        super(0);
        this.LL = c0kxl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0KXL c0kxl = this.LL;
        Context context = c0kxl.LLILLJJLI;
        if (context != null && c0kxl.LL != null) {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
            C494790Jan.LJIIJJI(context, c0kxl.LL, "sub-only-card-todo", null);
        }
        return Unit.LIZ;
    }
}
