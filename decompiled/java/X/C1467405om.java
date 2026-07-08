package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentCardContainerSharedVM;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.NonMatching;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.05om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1467405om {
    public static final void LIZ(List<? extends InterfaceC1467705op> list, EnumC1467505on enumC1467505on, Lifecycle lifecycle) {
        ICommerceAgentCardProtocol<InterfaceC1467705op> next;
        if (lifecycle != null && list != null && !list.isEmpty()) {
            CommerceAgentCardContainerSharedVM commerceAgentCardContainerSharedVMLIZ = C1467905or.LIZ(lifecycle, enumC1467505on);
            C23250099c.LJ(C23271099x.INSTANCE, new C05FP(commerceAgentCardContainerSharedVMLIZ, null));
            if (!commerceAgentCardContainerSharedVMLIZ.LL.isEmpty()) {
                for (InterfaceC1467705op interfaceC1467705op : list) {
                    ConcurrentHashMap<Integer, ICommerceAgentCardProtocol<InterfaceC1467705op>> concurrentHashMap = commerceAgentCardContainerSharedVMLIZ.LLILLJJLI;
                    Integer numValueOf = Integer.valueOf(System.identityHashCode(interfaceC1467705op));
                    Iterator<ICommerceAgentCardProtocol<InterfaceC1467705op>> it2 = commerceAgentCardContainerSharedVMLIZ.LL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        ICommerceAgentCardProtocol<InterfaceC1467705op> iCommerceAgentCardProtocol = next;
                        if (iCommerceAgentCardProtocol.getDataType().LIZIZ(interfaceC1467705op) && iCommerceAgentCardProtocol.z11(interfaceC1467705op)) {
                            if (next == null) {
                                break;
                            }
                        }
                    }
                    next = NonMatching.LL;
                    concurrentHashMap.put(numValueOf, next);
                }
            }
        }
    }
}
