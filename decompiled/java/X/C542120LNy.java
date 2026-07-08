package X;

import com.ss.android.ugc.aweme.aikit.api.common.task.TaskLifecycleInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542120LNy {
    public static final /* synthetic */ int LIZLLL = 0;
    public final InterfaceC546090LbL LIZ;
    public final List<AbstractC542080LNu> LIZIZ;
    public final TaskLifecycleInfo LIZJ;

    static {
        new C542070LNt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C542120LNy)) {
            return false;
        }
        C542120LNy c542120LNy = (C542120LNy) obj;
        return Intrinsics.LJFF(this.LIZ, c542120LNy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c542120LNy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c542120LNy.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        TaskLifecycleInfo taskLifecycleInfo = this.LIZJ;
        return iHashCode + (taskLifecycleInfo == null ? 0 : taskLifecycleInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthResult(businessKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        List<AbstractC542080LNu> list = this.LIZIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AbstractC542080LNu> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof C542050LNr) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LIZIZ() {
        List<AbstractC542080LNu> list = this.LIZIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AbstractC542080LNu abstractC542080LNu : list) {
                if (Intrinsics.LJFF(abstractC542080LNu, C542100LNw.LIZLLL) || Intrinsics.LJFF(abstractC542080LNu, C542110LNx.LIZLLL)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LIZJ() {
        List<AbstractC542080LNu> list = this.LIZIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AbstractC542080LNu> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), C542100LNw.LIZLLL)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LIZLLL() {
        List<AbstractC542080LNu> list = this.LIZIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AbstractC542080LNu> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), C542110LNx.LIZLLL)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LJ() {
        return this.LIZIZ.size() == 1 && this.LIZIZ.contains(C542090LNv.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C542120LNy(InterfaceC546090LbL interfaceC546090LbL, List<? extends AbstractC542080LNu> list, TaskLifecycleInfo taskLifecycleInfo) {
        this.LIZ = interfaceC546090LbL;
        this.LIZIZ = list;
        this.LIZJ = taskLifecycleInfo;
    }
}
