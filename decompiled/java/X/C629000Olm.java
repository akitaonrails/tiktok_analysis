package X;

import X.C1558520qew;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Olm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629000Olm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ InterfaceC665370Q7z LLILLJJLI;
    public final /* synthetic */ Class<? extends InterfaceC494301wD> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629000Olm(LifecycleOwner lifecycleOwner, InterfaceC665370Q7z interfaceC665370Q7z, Class<? extends InterfaceC494301wD> cls) {
        super(0);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle lifecycle = this.LL.getLifecycle();
        final InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
        final Class<? extends InterfaceC494301wD> cls = this.LLILLL;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.provider.LogicAssemExtKt$bindLifecycle$runnable$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C1558520qew.LJIIJJI(interfaceC665370Q7z, cls, null);
                }
            }
        });
        return Unit.LIZ;
    }
}
