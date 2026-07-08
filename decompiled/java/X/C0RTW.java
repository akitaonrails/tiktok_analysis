package X;

import X.C2021207vu;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C725080ScM;
import X.InterfaceC723720SaA;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RTW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RTW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC719640SKs LL;
    public final /* synthetic */ Assembler LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RTW(Assembler assembler, InterfaceC719640SKs interfaceC719640SKs) {
        super(0);
        this.LL = interfaceC719640SKs;
        this.LLILLJJLI = assembler;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Lifecycle lifecycle = this.LL.getLifecycle();
        final Assembler assembler = this.LLILLJJLI;
        final InterfaceC719640SKs interfaceC719640SKs = this.LL;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.assem.arch.extensions.assemble.AssembleComponentAssembleExtKt$componentAssembleInit$sp$1$2$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (C2021207vu.LIZ[event.ordinal()] == 1) {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        if (!C725080ScM.LJIILJJIL) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("IAssembleComponent clearAsLifecycleOwner: ");
                            sbLIZ.append(this);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            int i = C2187451AjH.LIZ;
                            interfaceC723720SaA.log("AssemList", strLIZIZ);
                        } else if (C725080ScM.LIZLLL) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("IAssembleComponent clearAsLifecycleOwner: ");
                            sbLIZ2.append(this);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            int i2 = C2187451AjH.LIZ;
                            interfaceC723720SaA.log("AssemList", strLIZIZ2);
                        }
                    }
                    assembler.xQ2(interfaceC719640SKs);
                }
            }
        });
        return Unit.LIZ;
    }
}
