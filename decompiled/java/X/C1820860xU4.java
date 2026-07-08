package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem.OneStopMainContentListAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.assem.OneStopTitleAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1820860xU4 extends C09AY implements Function2<UIAssem, C291001Au<? extends C1821160xUY>, Unit> {
    public final /* synthetic */ OneStopMainContentListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820860xU4(OneStopMainContentListAssem oneStopMainContentListAssem) {
        super(2);
        this.LL = oneStopMainContentListAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends C1821160xUY> c291001Au) {
        final OneStopMainContentListAssem oneStopMainContentListAssem;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C291001Au<? extends C1821160xUY> c291001Au2 = c291001Au;
        if (c291001Au2 != null && c291001Au2.LIZ() != null && (viewOnAttachStateChangeListenerC20604515jv = (oneStopMainContentListAssem = this.LL).LLJJIII) != null) {
            HandlerHook.viewPostDelay(viewOnAttachStateChangeListenerC20604515jv, new Runnable() { // from class: X.0xU3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    LinearLayoutManager linearLayoutManager;
                    C1C7U.LIZ("OneStopMainContentListAssem@a81f.initVM$4$1$1");
                    try {
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = oneStopMainContentListAssem.LLJJIII;
                        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv2 != null ? viewOnAttachStateChangeListenerC20604515jv2.getLayoutManager() : null;
                        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                            int i = oneStopMainContentListAssem.LLJJJ;
                            OneStopTitleAssem.LLJJIJI.getClass();
                            linearLayoutManager.scrollToPositionWithOffset(i, C1338790kwX.LIZ(OneStopTitleAssem.LLJJIJIL));
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("OneStopMainContentListAssem@a81f.initVM$4$1$1");
                }
            }, 150L);
        }
        return Unit.LIZ;
    }
}
