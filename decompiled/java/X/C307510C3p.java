package X;

import com.ss.android.ugc.aweme.video.experiment.DynamicOptionConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307510C3p extends C09AY implements Function0<List<C308310C6r>> {
    public C307510C3p() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<C308310C6r> invoke() {
        DynamicOptionConfig dynamicOptionConfig = (DynamicOptionConfig) C0C64.LJIILLIIL().LJJII(DynamicOptionConfig.class, null, "player_dynamic_option_config", true);
        List list = C13BV.INSTANCE;
        if (dynamicOptionConfig == null || dynamicOptionConfig.dynamicOptionModelList == null || dynamicOptionConfig.dynamicOptionModelList.isEmpty()) {
            if (!C07JK.LIZ()) {
                return null;
            }
            list = C337750DLx.LJ.LIZLLL;
        }
        boolean z = C0TKA.LJ && C0C5P.LIZJ().LIZ != null;
        boolean zBooleanValue = ((Boolean) C283360B8s.LIZ.getValue()).booleanValue();
        if (!z || !zBooleanValue) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C307500C3o.LIZ.getClass();
        C307500C3o.LIZIZ(arrayList, list, false);
        C307500C3o.LIZ(arrayList, dynamicOptionConfig);
        C307500C3o.LIZ(arrayList, (DynamicOptionConfig) C307600C3y.LIZ.getValue());
        C307500C3o.LIZ(arrayList, (DynamicOptionConfig) C307580C3w.LIZ.getValue());
        return arrayList;
    }
}
