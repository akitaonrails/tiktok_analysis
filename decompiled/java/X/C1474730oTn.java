package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.player.sdk.api.IPortraitService;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474730oTn {
    public final IPortraitService LIZ;
    public final Map<String, List<String>> LIZIZ = new HashMap();

    public C1474730oTn() {
        IPortraitService iPortraitService = (IPortraitService) InjectedConfigManager.getConfig(IPortraitService.class);
        this.LIZ = iPortraitService == null ? IPortraitService.LIZ : iPortraitService;
    }

    public static C1473210oRL LIZ(String str) {
        SimVideoUrlModel simVideoUrlModelLIZIZ;
        if (TextUtils.isEmpty(str) || (simVideoUrlModelLIZIZ = C1474710oTl.LIZ.LIZIZ(str)) == null || TextUtils.isEmpty(simVideoUrlModelLIZIZ.getMeta())) {
            return null;
        }
        return C1473210oRL.from(simVideoUrlModelLIZIZ.getMeta());
    }
}
