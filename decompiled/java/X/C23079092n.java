package X;

import X.C1554530qYV;
import X.C1558520qew;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.092n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23079092n extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ Class<? extends InterfaceC494301wD>[] LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23079092n(LifecycleOwner lifecycleOwner, Class<? extends InterfaceC494301wD>[] clsArr) {
        super(0);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = clsArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle lifecycle = this.LL.getLifecycle();
        final Class<? extends InterfaceC494301wD>[] clsArr = this.LLILLJJLI;
        final LifecycleOwner lifecycleOwner = this.LL;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.provider.LogicAssemExtKt$loadAbility$runnable$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) throws IllegalAccessException {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    Class<? extends InterfaceC494301wD>[] clsArr2 = clsArr;
                    LifecycleOwner lifecycleOwner3 = lifecycleOwner;
                    for (Class<? extends InterfaceC494301wD> cls : clsArr2) {
                        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1558520qew.LJ(lifecycleOwner3, C1554530qYV.LIZIZ(cls));
                        if (interfaceC665370Q7zLJ != null) {
                            C1558520qew.LJIIJJI(interfaceC665370Q7zLJ, cls, null);
                        }
                    }
                }
            }
        });
        return Unit.LIZ;
    }
}
