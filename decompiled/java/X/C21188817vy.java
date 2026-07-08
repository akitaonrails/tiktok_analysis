package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.container.lifecycle.IEcommerceRoomLifecycle;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.annotation.EcommerceRegion;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.service.IECommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.17vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21188817vy implements InterfaceC469100IaS {
    public static final C01GW<C21188817vy> LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(170));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(171));

    @Override // X.InterfaceC469100IaS
    public final C0IHN LIZ() {
        return new C0IHN() { // from class: X.17vx
            @Override // X.C0IHN
            public final void LIZ(Fragment fragment, Room room) {
                EnumC21189117w1 enumC21189117w1Region;
                for (IEcommerceRoomLifecycle iEcommerceRoomLifecycle : (List) this.LIZ.LIZ.getValue()) {
                    Annotation[] annotations = iEcommerceRoomLifecycle.getClass().getAnnotations();
                    ArrayList arrayList = new ArrayList();
                    for (Annotation annotation : annotations) {
                        if (annotation instanceof EcommerceRegion) {
                            arrayList.add(annotation);
                        }
                    }
                    EcommerceRegion ecommerceRegion = (EcommerceRegion) C13LP.LJJJLL(arrayList);
                    if (ecommerceRegion != null) {
                        IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
                        if (iEcommerceRegionService != null) {
                            enumC21189117w1Region = iEcommerceRegionService.region();
                        } else {
                            enumC21189117w1Region = null;
                        }
                        if (enumC21189117w1Region == ecommerceRegion.region()) {
                        }
                    }
                    iEcommerceRoomLifecycle.LIZ(room);
                }
            }

            @Override // X.C0IHN
            public final void LIZIZ(LivePlayFragment livePlayFragment, Room room, long j, String str, boolean z, String str2, C0IIF c0iif, HashMap map) {
                EnumC21189117w1 enumC21189117w1Region;
                IECommerceRegionService iECommerceRegionService = (IECommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IECommerceRegionService.class, false, false, false, 14, null);
                if (iECommerceRegionService != null && iECommerceRegionService.isEnable()) {
                    OecInitData oecInitDataLIZ = C1733990vDx.LIZ(room);
                    if (oecInitDataLIZ != null) {
                        iECommerceRegionService.LJI(EnumC21192017wU.ROOM, oecInitDataLIZ.regionInfo, room.getRequestId(), null);
                    }
                    iECommerceRegionService.LIZIZ(room.getIdStr(), false);
                }
                for (IEcommerceRoomLifecycle iEcommerceRoomLifecycle : (List) this.LIZ.LIZ.getValue()) {
                    Annotation[] annotations = iEcommerceRoomLifecycle.getClass().getAnnotations();
                    ArrayList arrayList = new ArrayList();
                    for (Annotation annotation : annotations) {
                        if (annotation instanceof EcommerceRegion) {
                            arrayList.add(annotation);
                        }
                    }
                    EcommerceRegion ecommerceRegion = (EcommerceRegion) C13LP.LJJJLL(arrayList);
                    if (ecommerceRegion != null) {
                        IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
                        if (iEcommerceRegionService != null) {
                            enumC21189117w1Region = iEcommerceRegionService.region();
                        } else {
                            enumC21189117w1Region = null;
                        }
                        if (enumC21189117w1Region == ecommerceRegion.region()) {
                        }
                    }
                    iEcommerceRoomLifecycle.LIZIZ(livePlayFragment, room, j, str, z, str2, c0iif, map);
                }
            }
        };
    }

    public C21188817vy() {
        for (Object obj : ServiceManager.get().getServices(IEcommerceRoomLifecycle.class)) {
            if (!((List) this.LIZ.getValue()).contains(obj)) {
                ((List) this.LIZ.getValue()).add(obj);
            }
        }
    }
}
