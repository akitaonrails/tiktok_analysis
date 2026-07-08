package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SDO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDO extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ ReusedUIAssem<?> LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ InterfaceC719640SKs LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SDO(ReusedUIAssem<?> reusedUIAssem, View view, InterfaceC719640SKs interfaceC719640SKs, LifecycleOwner lifecycleOwner) {
        super(1);
        this.LL = reusedUIAssem;
        this.LLILLJJLI = view;
        this.LLILLL = interfaceC719640SKs;
        this.LLILZ = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        ReusedUIAssem<?> reusedUIAssem = this.LL;
        reusedUIAssem.LLJJI = this.LLILLJJLI;
        if (reusedUIAssem instanceof ReusedUISlotAssem) {
            if (this.LLILLL.PO1()) {
                View view = this.LLILLJJLI;
                if ((view instanceof ViewGroup) && view != null) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) this.LL;
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), reusedUISlotAssem.Oo(), viewGroup, false);
                    if (viewTd != null) {
                        viewGroup.addView(viewTd);
                        reusedUISlotAssem.LLJJJJJIL = viewTd;
                    }
                }
            } else {
                ((ReusedUISlotAssem) this.LL).LLJJJJJIL = this.LLILLJJLI;
            }
        }
        ReusedUIAssem<?> reusedUIAssem2 = this.LL;
        reusedUIAssem2.LLJJIII = true;
        AssemSupervisor assemSupervisorCQ2 = assembler2.CQ2(this.LLILZ);
        if (assemSupervisorCQ2 != null) {
            reusedUIAssem2.setSupervisor(assemSupervisorCQ2);
            this.LL.setParent(this.LLILLL);
            return Unit.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
