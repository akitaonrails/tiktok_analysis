package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.LiveTab;
import webcast.api.feed.LiveTabMG;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.container.model.MultiTopLiveDataCacheManager$initSkylightDataObserver$1$onResult$3$1", f = "MultiTopLiveDataCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C478420IpU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveTab LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478420IpU(LiveTab liveTab, InterfaceC1364105Vn<? super C478420IpU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveTab;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478420IpU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<MGModuleInteraction> list;
        C1C7U.LIZ("MultiTopLiveDataCacheManager@c5a0.initSkylightDataObserver$1$onResult$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            LiveTabMG liveTabMG = (LiveTabMG) C19748512Ol.LIZJ.LJII(this.LL.content, LiveTabMG.class);
            if (liveTabMG != null && liveTabMG.contentType == 2) {
                TabMGTopLive tabMGTopLive = liveTabMG.topLive;
                if (tabMGTopLive != null && (list = tabMGTopLive.interactionModule) != null && !list.isEmpty()) {
                    C478920IqI c478920IqI = C478920IqI.LIZ;
                    TabMGTopLive tabMGTopLive2 = liveTabMG.topLive;
                    c478920IqI.getClass();
                    C478920IqI.LIZIZ(tabMGTopLive2, "requestInteractModules");
                    C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "update TopModuleData from dataListener success");
                } else {
                    C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "update TopModuleData from dataListener, but data is empty");
                }
            } else {
                C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "update TopModuleData from dataListener, but data not found, no topLiveData");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("MultiTopLiveDataCacheManager", "update TopModuleData from dataListener, but exception:", e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveDataCacheManager@c5a0.initSkylightDataObserver$1$onResult$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
