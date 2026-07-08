package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738210SxX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC738140SxQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C738210SxX(AbstractC738140SxQ abstractC738140SxQ) {
        super(0);
        this.LL = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final AbstractC738140SxQ abstractC738140SxQ = this.LL;
        abstractC738140SxQ.uiThreadTaskExecutor.LIZ(new C738490Sxz(abstractC738140SxQ, new InterfaceC738360Sxm() { // from class: X.0Sdw
            @Override // X.InterfaceC738360Sxm
            public final Unit apply(Object obj) {
                abstractC738140SxQ.onCreate();
                abstractC738140SxQ.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
                abstractC738140SxQ.onAssemPostCreate();
                return Unit.LIZ;
            }
        }, null));
        return Unit.LIZ;
    }
}
