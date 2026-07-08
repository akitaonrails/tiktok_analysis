package X;

import Y.ARunnableS57S0300000_24;
import Y.ARunnableS79S0200000_10;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.feed.platform.performance.ScopePerformanceVM;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0qrE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566140qrE {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends AbstractC738140SxQ & InterfaceC1565950qqv & InterfaceC1565640qqQ> void LIZ(final T t) {
        ScopePerformanceVM scopePerformanceVMLIZ = C640940PCa.LIZ(C724240Sb0.LJI(t));
        if (C299750Boz.LIZ() && scopePerformanceVMLIZ != null) {
            scopePerformanceVMLIZ.vQ2().add(t);
        }
        if (((Number) C299750Boz.LIZ.getValue()).intValue() == 2) {
            if (scopePerformanceVMLIZ == null) {
                C1558520qew.LIZLLL(t);
                LIZIZ(t);
                return;
            }
            C1558520qew.LIZLLL(t);
            AbstractRunnableC789380Uxs abstractRunnableC789380Uxs = new AbstractRunnableC789380Uxs() { // from class: X.0qrD
                /* JADX WARN: Type inference failed for: r0v0, types: [X.0SxQ, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v2, types: [X.0SxQ, java.lang.Object] */
                @Override // X.AbstractRunnableC789380Uxs
                public final void LIZ() {
                    if (C1578630rBN.LJIIIZ(t)) {
                        return;
                    }
                    C1566140qrE.LIZIZ(t);
                }
            };
            C786410Ut5.LJL(C799570VYd.LIZIZ(), abstractRunnableC789380Uxs);
            C2254708sT actionHandler = t.getActionHandler();
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) actionHandler.LIZJ.getValue()).get("simple_action_key_parent_set_buck_up");
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
            }
            if (((ConcurrentHashMap) actionHandler.LIZJ.getValue()).get("simple_action_key_parent_set_buck_up") == null) {
                ((ConcurrentHashMap) actionHandler.LIZJ.getValue()).put("simple_action_key_parent_set_buck_up", copyOnWriteArraySet);
            }
            copyOnWriteArraySet.add(abstractRunnableC789380Uxs);
            return;
        }
        C1558520qew.LIZLLL(t);
        LIZIZ(t);
    }

    public static final <T extends AbstractC738140SxQ & InterfaceC1565640qqQ & InterfaceC1565950qqv> void LIZIZ(T t) {
        C0RJN panelContext = t.getPanelContext();
        C0RD6 c0rd6 = new C0RD6();
        t.eventInit(c0rd6);
        if (!c0rd6.LIZJ().isEmpty()) {
            if (!C2252408s6.LJI()) {
                C786410Ut5.LJL(C799570VYd.LIZJ(), new ARunnableS79S0200000_10(c0rd6, panelContext, 44));
                return;
            }
            Iterator<T> it2 = c0rd6.LIZJ().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                panelContext.LIZIZ.yQ2((String) entry.getKey(), (Observer) entry.getValue(), false);
            }
        }
    }

    public static final <R extends AbstractC738140SxQ & InterfaceC1565950qqv, T> void LIZJ(R r, C630740Ooa<? extends T> c630740Ooa) {
        C786410Ut5.LJL(C799570VYd.LIZIZ(), new ARunnableS57S0300000_24(r, r, c630740Ooa, 7));
    }
}
