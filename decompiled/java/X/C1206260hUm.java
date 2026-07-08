package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206260hUm {
    public final C19Y3 LIZ;
    public final LifecycleOwner LIZIZ;
    public C11JF LIZJ;
    public C11JF LIZLLL;
    public final Map<String, Integer> LJ = new LinkedHashMap();
    public boolean LJFF;

    public static String LIZIZ() {
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        return iCommerceMediaService != null ? (iCommerceMediaService.LJ() || iCommerceMediaService.LJIIJ()) ? "commerce" : "" : "";
    }

    public final Integer LIZ(String str) {
        return (Integer) ((LinkedHashMap) this.LJ).get(str);
    }

    public C1206260hUm(C19Y3 c19y3, LifecycleOwner lifecycleOwner) {
        this.LIZ = c19y3;
        this.LIZIZ = lifecycleOwner;
    }
}
