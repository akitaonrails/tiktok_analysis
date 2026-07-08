package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ruZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606650ruZ implements IMiniDramaLynxService {
    public static final C1606650ruZ LIZIZ = new C1606650ruZ();
    public final /* synthetic */ IMiniDramaLynxService LIZ;

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LIZ(String str, ViewGroup viewGroup, Map map, Context context, Function0 function0, Function0 function02) {
        this.LIZ.LIZ(str, viewGroup, map, context, function0, function02);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LIZIZ(JSONObject jSONObject, String str, Map map) {
        this.LIZ.LIZIZ(jSONObject, str, map);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LIZJ(AbstractC1581540rG4 abstractC1581540rG4) {
        this.LIZ.LIZJ(abstractC1581540rG4);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LIZLLL(List<? extends AbstractC1581540rG4> list) {
        this.LIZ.LIZLLL(list);
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.xplatform.service.IMiniDramaLynxService
    public final void clearAll() {
        this.LIZ.clearAll();
    }

    public C1606650ruZ() {
        IMiniDramaLynxService iMiniDramaLynxService = (IMiniDramaLynxService) PluggableExtentionKt.pluggableSpi$default(IMiniDramaLynxService.class, false, false, false, 14, null);
        if (iMiniDramaLynxService != null) {
            this.LIZ = iMiniDramaLynxService;
        } else {
            "no implement IMiniDramaLynxService".toString();
            throw new IllegalStateException("no implement IMiniDramaLynxService");
        }
    }
}
