package X;

import com.ss.android.ugc.aweme.poi.detail.worldcup.PoiWorldCupScheduleCell;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.PoiWorldCupScheduleModule;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupDateMatchGroup;
import com.ss.android.ugc.aweme.poi.detail.worldcup.model.WorldCupMatch;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0gvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184370gvT implements InterfaceC1181600gr0 {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1181600gr0
    public final void LIZJ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1180920gpu c1180920gpu) {
    }

    @Override // X.InterfaceC1181600gr0
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiWorldCupScheduleModule> LIZIZ() {
        return new C1208890hZ1(53);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiWorldCupScheduleCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PoiWorldCupScheduleModule poiWorldCupScheduleModule;
        List<WorldCupDateMatchGroup> matchList;
        if (baseComponentData instanceof PoiWorldCupScheduleModule) {
            poiWorldCupScheduleModule = (PoiWorldCupScheduleModule) baseComponentData;
        } else {
            poiWorldCupScheduleModule = null;
        }
        if (poiWorldCupScheduleModule == null || (matchList = poiWorldCupScheduleModule.getMatchList()) == null || matchList.isEmpty()) {
            return false;
        }
        Iterator<WorldCupDateMatchGroup> it2 = matchList.iterator();
        while (it2.hasNext()) {
            List<WorldCupMatch> list = it2.next().matches;
            if (list != null && !list.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
