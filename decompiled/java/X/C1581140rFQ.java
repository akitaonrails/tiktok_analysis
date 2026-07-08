package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainRootFragmentBase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0rFQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581140rFQ {
    public static final List<InterfaceC1593530rZP> LIZ(MainRootFragmentBase mainRootFragmentBase, MainActivity mainActivity) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorCQ2 = C0RPA.LIZ(mainActivity).CQ2(mainRootFragmentBase);
        ArrayList arrayList = null;
        if (assemSupervisorCQ2 != null && (copyOnWriteArrayList = assemSupervisorCQ2.LLJILLL) != null) {
            arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC1593530rZP) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
        }
        return arrayList;
    }
}
