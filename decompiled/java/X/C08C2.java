package X;

import X.C2021307vv;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08C2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08C2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ UIAssem LL;
    public final /* synthetic */ Assembler LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08C2(Assembler assembler, UIAssem uIAssem) {
        super(0);
        this.LL = uIAssem;
        this.LLILLJJLI = assembler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LifecycleRegistry lifecycle = this.LL.getLifecycle();
        final Assembler assembler = this.LLILLJJLI;
        final UIAssem uIAssem = this.LL;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.arch.extensions.assemble.UIAssemAssembleExtKt$uiAssemAssembleInitOnline$supervisor$1$2$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (C2021307vv.LIZ[event.ordinal()] == 1) {
                    assembler.xQ2(uIAssem);
                }
            }
        });
        return Unit.LIZ;
    }
}
