package X;

import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0clY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1024460clY extends AbstractC1552040qUU {
    @Override // X.AbstractC1552040qUU
    public final void LJIJJ() {
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            iAdLandPagePreloadService.G0();
            C1024380clQ.LJIIL();
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJFF(UpdatePackage updatePackage) {
        JSONObject jSONObjectLJJI = LJJI(updatePackage.getVersion(), null);
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_service_gecko_activate_rate", 0, jSONObjectLJJI);
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            iAdLandPagePreloadService.G0();
            updatePackage.getVersion();
            C1024380clQ.LJI(updatePackage.getChannel());
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIL(UpdatePackage updatePackage) {
        LJJII(updatePackage, true);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIILJJIL(UpdatePackage updatePackage) {
        LJJII(updatePackage, false);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIILL(UpdatePackage updatePackage) {
        JSONObject jSONObjectLJJI = LJJI(updatePackage.getVersion(), null);
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_service_gecko_download_rate", 0, jSONObjectLJJI);
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            iAdLandPagePreloadService.G0();
            C1024380clQ.LJIIIZ(updatePackage.getVersion(), updatePackage.getFullPackage().getLength(), updatePackage.getChannel());
        }
        C1440005kM.LIZ(new AnonymousClass0325(updatePackage.getChannel()));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            iAdLandPagePreloadService.G0().getClass();
            C1024380clQ.LJIIZILJ(localPackageModel.getChannel());
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJJLI(UpdatePackage updatePackage) {
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            iAdLandPagePreloadService.G0();
            C1024380clQ.LJIIJJI(updatePackage.getChannel(), updatePackage.isPatchUpdate());
        }
    }

    public static JSONObject LJJI(long j, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        if (j != -1) {
            try {
                jSONObject.put("gecko_id", String.valueOf(j));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (th != null) {
            jSONObject.put("errorDesc", th.toString());
            return jSONObject;
        }
        return jSONObject;
    }

    public static void LJJIFFI(Map map, C1551680qTu c1551680qTu) {
        JSONObject jSONObjectLJJI = LJJI(-1L, null);
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_service_gecko_check_update_rate", 0, jSONObjectLJJI);
        if (map != null && !map.isEmpty()) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                List<UpdatePackage> list = (List) ((Map.Entry) it2.next()).getValue();
                if (!C1256140inE.LIZ(list)) {
                    ArrayList arrayList = new ArrayList();
                    for (UpdatePackage updatePackage : list) {
                        arrayList.add(new Pair(updatePackage.getChannel(), Long.valueOf(updatePackage.getVersion())));
                    }
                    IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    if (iAdLandPagePreloadService != null) {
                        iAdLandPagePreloadService.G0();
                        C1024380clQ.LJII(arrayList, true, c1551680qTu);
                    }
                }
            }
        }
    }

    public static void LJJII(UpdatePackage updatePackage, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (updatePackage != null) {
            arrayList.add(updatePackage.getChannel());
        }
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            iAdLandPagePreloadService.G0();
            C1024380clQ.LJIIJ(arrayList, z);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJ(UpdatePackage updatePackage, Throwable th) {
        JSONObject jSONObjectLJJI = LJJI(updatePackage.getVersion(), th);
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_service_gecko_activate_rate", 1, jSONObjectLJJI);
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            iAdLandPagePreloadService.G0();
            updatePackage.getVersion();
            C1024380clQ.LJFF(updatePackage.getChannel(), th);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJII(Throwable th, Map map) {
        JSONObject jSONObjectLJJI = LJJI(-1L, th);
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_service_gecko_check_update_rate", 1, jSONObjectLJJI);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService != null) {
                    iAdLandPagePreloadService.G0();
                    C1024380clQ.LJII((List) entry.getValue(), false, null);
                }
            }
        }
    }

    @Override // X.AbstractC1552040qUU
    public void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        LJJIFFI(map2, null);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
        JSONObject jSONObjectLJJI = LJJI(updatePackage.getVersion(), th);
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_service_gecko_download_rate", 1, jSONObjectLJJI);
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null) {
            iAdLandPagePreloadService.G0();
            C1024380clQ.LJIIIIZZ(updatePackage.getVersion(), updatePackage.getFullPackage().getLength(), updatePackage.getChannel(), th);
        }
        C1440005kM.LIZ(new AnonymousClass0356(updatePackage.getChannel(), th.toString()));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
        LJJIFFI(map2, c1551680qTu);
    }
}
