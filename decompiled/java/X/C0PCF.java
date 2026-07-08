package X;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PCF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCF {
    public static final /* synthetic */ int LIZ = 0;

    public static RecyclerView.ViewHolder LIZ(RecyclerView recyclerView) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C2873019j c2873019j;
        Fragment fragmentLIZ = C946803n0.LIZ(recyclerView);
        if (fragmentLIZ == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentLIZ, null), "source_default_key", C2873019j.class, null)) == null || (c2873019j = (C2873019j) interfaceC1555100qZQLIZIZ.getSource()) == null) {
            return null;
        }
        return c2873019j.LLILLJJLI;
    }

    public static final boolean LIZIZ(RecyclerView recyclerView) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C2873019j c2873019j;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        RecyclerView.ViewHolder viewHolder;
        Fragment fragmentLIZ = C946803n0.LIZ(recyclerView);
        if (fragmentLIZ == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragmentLIZ, null), "source_default_key", C2873019j.class, null)) == null || (c2873019j = (C2873019j) interfaceC1555100qZQLIZIZ.getSource()) == null || (viewHolderFindContainingViewHolder = c2873019j.LL.findContainingViewHolder(recyclerView)) == null || (viewHolder = c2873019j.LLILLJJLI) == null) {
            return false;
        }
        return !Intrinsics.LJFF(viewHolderFindContainingViewHolder, viewHolder);
    }

    public static void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        C2873019j c2873019j;
        Fragment fragmentLIZ = C946803n0.LIZ(recyclerView);
        if (fragmentLIZ != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null);
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLJFF, "source_default_key", C2873019j.class, null);
            if (interfaceC1555100qZQLIZIZ != null && (c2873019j = (C2873019j) interfaceC1555100qZQLIZIZ.getSource()) != null) {
                c2873019j.LLILLJJLI = viewHolder;
            } else {
                C1554960qZC.LIZ(interfaceC665370Q7zLJFF, new C2873019j(recyclerView, viewHolder), C2873019j.class, "source_default_key");
            }
        }
    }
}
