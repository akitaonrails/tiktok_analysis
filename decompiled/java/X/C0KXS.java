package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KXS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0KXR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KXS(C0KXR c0kxr) {
        super(0);
        this.LL = c0kxr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Room room;
        C0KXR c0kxr = this.LL;
        Context context = c0kxr.LLILLJJLI;
        if (context != null && (room = c0kxr.LL) != null) {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
            C494790Jan.LJIIJJI(context, room, "sub-only-card-todo", null);
        }
        return Unit.LIZ;
    }
}
