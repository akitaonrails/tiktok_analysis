package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893310zMv implements ILocalServicePassThroughService {
    public static final C1893310zMv LIZIZ = new C1893310zMv();
    public final /* synthetic */ ILocalServicePassThroughService LIZ = (ILocalServicePassThroughService) ServiceManager.get().getService(ILocalServicePassThroughService.class);

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final List<String> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Object LIZJ(PageFinder pageFinder, String str) {
        return this.LIZ.LIZJ(pageFinder, str);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Map LIZLLL(PageFinder pageFinder, String str, Map map) {
        return this.LIZ.LIZLLL(pageFinder, str, map);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final void LJ(PageFinder pageFinder, String str, JSONObject jSONObject) {
        this.LIZ.LJ(pageFinder, str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Map<String, Object> LJFF(PageFinder pageFinder, List<String> list, String str) {
        return this.LIZ.LJFF(pageFinder, list, str);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final void LJI(PageFinder pageFinder, C2344009Gk c2344009Gk, String str) {
        this.LIZ.LJI(pageFinder, c2344009Gk, str);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final void LJII(PageFinder pageFinder, String str, Map map, Map map2) {
        this.LIZ.LJII(pageFinder, str, map, map2);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Map LJIIIZ(PageFinder pageFinder) {
        return this.LIZ.LJIIIZ(pageFinder);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final boolean LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final List<C1809510xBl> LJIIJJI(C1955807lM c1955807lM) {
        return this.LIZ.LJIIJJI(c1955807lM);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final boolean LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final void LJIILIIL(PageFinder pageFinder, JSONObject jSONObject, boolean z) {
        this.LIZ.LJIILIIL(pageFinder, jSONObject, z);
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final boolean LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.localservice.service.ILocalServicePassThroughService
    public final Map LJIILL(PageFinder pageFinder, String str, Map map) {
        return this.LIZ.LJIILL(pageFinder, str, map);
    }
}
