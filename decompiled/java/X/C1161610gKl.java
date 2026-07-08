package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenEventAbility;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0gKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161610gKl extends AbstractC1161490gKZ implements InterfaceC1161450gKV {
    public int LLILLJJLI = -1;
    public RecyclerView LLILLL;

    @Override // X.InterfaceC1161450gKV
    public final void LIZIZ(int i, int i2) {
        int iFindFirstVisibleItemPosition;
        int iLJIIIIZZ;
        Object c098200Yq;
        InterfaceC1891350zJl interfaceC1891350zJlLJI;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLt;
        C20600815jK<InterfaceC1891350zJl> state;
        IRavenEventAbility iRavenEventAbilityLd1;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLt2;
        C20600815jK<InterfaceC1891350zJl> state2;
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = this.LLILLL;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            } else {
                iFindFirstVisibleItemPosition = -1;
            }
            if (iFindFirstVisibleItemPosition != this.LLILLJJLI) {
                this.LLILLJJLI = iFindFirstVisibleItemPosition;
                InterfaceC1161620gKm interfaceC1161620gKm = this.LL;
                if (interfaceC1161620gKm != null && (viewOnAttachStateChangeListenerC20604515jvLt2 = interfaceC1161620gKm.Lt()) != null && (state2 = viewOnAttachStateChangeListenerC20604515jvLt2.getState()) != null) {
                    iLJIIIIZZ = state2.LJIIIIZZ();
                } else {
                    iLJIIIIZZ = 0;
                }
                if (iFindFirstVisibleItemPosition < iLJIIIIZZ) {
                    try {
                        InterfaceC1161620gKm interfaceC1161620gKm2 = this.LL;
                        if (interfaceC1161620gKm2 != null && (viewOnAttachStateChangeListenerC20604515jvLt = interfaceC1161620gKm2.Lt()) != null && (state = viewOnAttachStateChangeListenerC20604515jvLt.getState()) != null) {
                            interfaceC1891350zJlLJI = state.LJI(iFindFirstVisibleItemPosition);
                        } else {
                            interfaceC1891350zJlLJI = null;
                        }
                        if (interfaceC1891350zJlLJI instanceof BaseComponentData) {
                            c098200Yq = (BaseComponentData) interfaceC1891350zJlLJI;
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m7isFailureimpl(c098200Yq);
                }
                InterfaceC1161620gKm interfaceC1161620gKm3 = this.LL;
                if (interfaceC1161620gKm3 != null && (iRavenEventAbilityLd1 = interfaceC1161620gKm3.Ld1()) != null) {
                    iRavenEventAbilityLd1.dZ1(new RavenEvent("RavenScrollPositionEvent", -1L, new AbstractC1258404wA() { // from class: X.04wB
                        @Override // X.AbstractC1258404wA
                        public final String getEventName() {
                            return "RavenScrollPositionEvent";
                        }
                    }));
                }
            }
        }
    }

    @Override // X.InterfaceC1161450gKV
    public final void LLF(RecyclerView recyclerView, int i) {
        this.LLILLL = recyclerView;
    }
}
