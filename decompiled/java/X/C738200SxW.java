package X;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738200SxW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC738140SxQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C738200SxW(AbstractC738140SxQ abstractC738140SxQ) {
        super(0);
        this.LL = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final AbstractC738140SxQ abstractC738140SxQ = this.LL;
        InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm = new InterfaceC738360Sxm() { // from class: X.0Sxb
            @Override // X.InterfaceC738360Sxm
            public final Unit apply(Object obj) {
                abstractC738140SxQ.onStart();
                return Unit.LIZ;
            }
        };
        if (abstractC738140SxQ.isOverrideOnStartAsync()) {
            abstractC738140SxQ.asyncLifecycle$assem_release(interfaceC738360Sxm, new C738280Sxe());
        } else {
            abstractC738140SxQ.asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
        this.LL.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        return Unit.LIZ;
    }
}
