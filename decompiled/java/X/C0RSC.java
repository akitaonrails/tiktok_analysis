package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.proxy.MixUseReusedContainer;

/* JADX INFO: renamed from: X.0RSC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RSC {
    public static final MixUseReusedContainer LIZ(LifecycleOwner lifecycleOwner, Assembler assembler, C0RTC<?> c0rtc) {
        AbstractC738140SxQ abstractC738140SxQ;
        AssemSupervisor assemSupervisorCQ2;
        boolean z = lifecycleOwner instanceof C19EG;
        if (z && (lifecycleOwner instanceof Fragment) && (lifecycleOwner instanceof AbstractC738140SxQ)) {
            "assemble ReusedAssem only support in Activity/Fragment/Assem".toString();
            throw new IllegalStateException("assemble ReusedAssem only support in Activity/Fragment/Assem");
        }
        if (z) {
            C19EG c19eg = (C19EG) lifecycleOwner;
            AssemSupervisor assemSupervisorCQ22 = assembler.CQ2(c19eg);
            if (assemSupervisorCQ22 != null) {
                View view = assemSupervisorCQ22.LLJJIII;
                if (view != null) {
                    return new MixUseReusedContainer(c19eg, c19eg, view, c0rtc, C1558360qeg.LJI(c19eg, null));
                }
                "Can not assemble UIAssem before setContentView()".toString();
                throw new IllegalArgumentException("Can not assemble UIAssem before setContentView()");
            }
        } else if (lifecycleOwner instanceof Fragment) {
            Fragment fragment = (Fragment) lifecycleOwner;
            AssemSupervisor assemSupervisorCQ23 = assembler.CQ2(fragment);
            if (assemSupervisorCQ23 != null) {
                View view2 = assemSupervisorCQ23.LLJJIII;
                if (view2 != null) {
                    return new MixUseReusedContainer(fragment.getActivity(), fragment, view2, c0rtc, C1558360qeg.LJFF(fragment, null));
                }
                "Can not assemble UIAssem before onViewCreated()".toString();
                throw new IllegalArgumentException("Can not assemble UIAssem before onViewCreated()");
            }
        } else if ((lifecycleOwner instanceof AbstractC738140SxQ) && (assemSupervisorCQ2 = assembler.CQ2((abstractC738140SxQ = (AbstractC738140SxQ) lifecycleOwner))) != null) {
            View view3 = assemSupervisorCQ2.LLJJIII;
            if (view3 != null) {
                return new MixUseReusedContainer(C724240Sb0.LIZ(abstractC738140SxQ), abstractC738140SxQ, view3, c0rtc, abstractC738140SxQ.getVAssemScope());
            }
            "Can not assemble UIAssem before onViewCreated()".toString();
            throw new IllegalArgumentException("Can not assemble UIAssem before onViewCreated()");
        }
        return null;
    }
}
