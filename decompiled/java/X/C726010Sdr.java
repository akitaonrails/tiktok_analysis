package X;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726010Sdr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ UIAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C726010Sdr(UIAssem uIAssem, View view) {
        super(0);
        this.LL = uIAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final UIAssem uIAssem = this.LL;
        final View view = this.LLILLJJLI;
        InterfaceC738360Sxm<Object, Unit> interfaceC738360Sxm = new InterfaceC738360Sxm() { // from class: X.0Sds
            @Override // X.InterfaceC738360Sxm
            public final Unit apply(Object obj) {
                uIAssem.onViewCreated(view);
                uIAssem.vo(view);
                return Unit.LIZ;
            }
        };
        if (uIAssem.isOverrideOnViewCreatedAsync()) {
            uIAssem.asyncLifecycle$assem_release(interfaceC738360Sxm, new C738290Sxf(view));
        } else {
            uIAssem.asyncLifecycle$assem_release(interfaceC738360Sxm, null);
        }
        this.LL.wo(this.LLILLJJLI);
        this.LL.setAssemViewCreated$assem_release(true);
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this.LL);
        if (assemSupervisorLJ != null) {
            assemSupervisorLJ.LLJILJILJ = true;
            List<AbstractC738140SxQ> listLIZLLL = assemSupervisorLJ.LIZLLL();
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLIZLLL) {
                if (((AbstractC738140SxQ) obj).getLifecycle().getCurrentState().compareTo(Lifecycle.State.CREATED) >= 0) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((AbstractC738140SxQ) it2.next()).handleOnParentViewCreated$assem_release();
            }
        }
        return Unit.LIZ;
    }
}
