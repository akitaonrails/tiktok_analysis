package X;

import java.util.LinkedList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129430fUr extends AbstractC214823195h {
    public final Function0<LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1129430fUr(Function0<? extends LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>>> function0) {
        this.LJ = function0;
    }

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedListInvoke = this.LJ.invoke();
        if (linkedListInvoke == null) {
            return 1;
        }
        Integer numValueOf = null;
        if (!(!linkedListInvoke.isEmpty()) || i >= linkedListInvoke.size()) {
            return 1;
        }
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = linkedListInvoke.get(i);
        if (abstractC1126600fQI != null) {
            numValueOf = Integer.valueOf(abstractC1126600fQI.LIZ);
        }
        if (!C01AW.LIZ(numValueOf)) {
            return 1;
        }
        return 4;
    }
}
