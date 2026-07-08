package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695930RRn {
    public static final boolean LIZIZ(BaseCellTriggerComponent<?> baseCellTriggerComponent) {
        AssemSupervisor assemSupervisorLJI = LJI(baseCellTriggerComponent);
        if (assemSupervisorLJI == null) {
            return true;
        }
        if (!assemSupervisorLJI.LLJJ.containsKey(baseCellTriggerComponent.getType())) {
            CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList = assemSupervisorLJI.LLJILLL;
            if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
                return false;
            }
            Iterator<AbstractC738140SxQ> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getClass(), C09R7.LIZ(baseCellTriggerComponent.getType()))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZJ(ReusedAssem<?> reusedAssem) {
        if (!(reusedAssem instanceof BaseContainer) && !(reusedAssem instanceof C0RWZ)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Collection<? extends Object> collection) {
        boolean z;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final void LJ(AbstractC738140SxQ abstractC738140SxQ) {
        Aweme aweme;
        ReusedAssem reusedAssem;
        VideoItemParams videoItemParams = null;
        if ((abstractC738140SxQ instanceof ReusedAssem) && (reusedAssem = (ReusedAssem) abstractC738140SxQ) != null) {
            videoItemParams = (VideoItemParams) reusedAssem.bo();
        }
        if ((videoItemParams instanceof VideoItemParams) && videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aweme.getAid();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FcpNodeProtocol LJFF(AbstractC738140SxQ abstractC738140SxQ) {
        if (abstractC738140SxQ instanceof DynamicComponent) {
            return ((DynamicComponent) abstractC738140SxQ).Bp();
        }
        if (abstractC738140SxQ.getParent() instanceof BaseCellTriggerComponent) {
            LifecycleOwner parent = abstractC738140SxQ.getParent();
            if (parent instanceof FcpNodeProtocol) {
                return (FcpNodeProtocol) parent;
            }
        } else if (abstractC738140SxQ instanceof FcpNodeProtocol) {
            return (FcpNodeProtocol) abstractC738140SxQ;
        }
        return null;
    }

    public static final AssemSupervisor LJI(AbstractC738140SxQ abstractC738140SxQ) {
        if ((C299830Bp7.LIZIZ() & 16) == 16) {
            return abstractC738140SxQ.getAssemSupervisor();
        }
        return C724240Sb0.LJ(abstractC738140SxQ);
    }

    public static final C699950Rcv LIZ(ReusedAssem reusedAssem, FcpNodeProtocol fcpNodeProtocol, C700170RdH c700170RdH, Function0 function0, boolean z) {
        if (reusedAssem.getParent() instanceof BaseCellTriggerComponent) {
            return null;
        }
        return new C699950Rcv(reusedAssem, fcpNodeProtocol, c700170RdH, function0, z);
    }
}
