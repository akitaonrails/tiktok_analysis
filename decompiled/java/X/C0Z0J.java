package X;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Z0J, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z0J implements InterfaceC882520Yji {
    public volatile InterfaceC882520Yji LIZ;
    public final CopyOnWriteArrayList<C0Z0J> LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public AnonymousClass0956 LIZLLL;

    @Override // X.InterfaceC882520Yji
    public final void LIZ(C892820Z0u c892820Z0u) {
        LIZJ(new AwS593S0100000_14(c892820Z0u, 247));
    }

    @Override // X.InterfaceC882520Yji
    public final void LIZIZ(Map<String, ? extends Object> map) {
        InterfaceC882520Yji interfaceC882520Yji;
        if (!this.LIZJ.get() && (interfaceC882520Yji = this.LIZ) != null) {
            interfaceC882520Yji.LIZIZ(map);
        }
    }

    public final void LIZJ(Function1<? super InterfaceC882520Yji, Unit> function1) {
        if (this.LIZJ.compareAndSet(false, true)) {
            InterfaceC882520Yji interfaceC882520Yji = this.LIZ;
            AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LIZ = null;
            this.LIZIZ.remove(this);
            if (interfaceC882520Yji != null) {
                function1.invoke(interfaceC882520Yji);
            }
        }
    }

    @Override // X.InterfaceC882520Yji
    public final void onSuccess(Object obj) {
        LIZJ(new AwS593S0100000_14(obj, 248));
    }

    public C0Z0J(InterfaceC882520Yji interfaceC882520Yji, CopyOnWriteArrayList<C0Z0J> copyOnWriteArrayList) {
        this.LIZ = interfaceC882520Yji;
        this.LIZIZ = copyOnWriteArrayList;
    }
}
