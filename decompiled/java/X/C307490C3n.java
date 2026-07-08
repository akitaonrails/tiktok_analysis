package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.video.experiment.DynamicOptionConfig;
import com.ss.android.ugc.aweme.video.experiment.DynamicOptionModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307490C3n extends C09AY implements Function0<List<? extends C308310C6r>> {
    public C307490C3n() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List<? extends X.0C6r>] */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C308310C6r> invoke() {
        try {
            ArrayList arrayList = new ArrayList();
            C844470XAv.LIZ.getClass();
            String strLJ = C1480970odr.LJ(C844470XAv.LIZ(), "player/dynamic_option_keys.json");
            DynamicOptionConfig dynamicOptionConfig = strLJ != null ? (DynamicOptionConfig) new Gson().LJII(strLJ, DynamicOptionConfig.class) : null;
            if ((dynamicOptionConfig != null ? dynamicOptionConfig.dynamicOptionModelList : null) == null || dynamicOptionConfig.dynamicOptionModelList.isEmpty()) {
                return null;
            }
            for (DynamicOptionModel dynamicOptionModel : dynamicOptionConfig.dynamicOptionModelList) {
                int i = dynamicOptionModel.scene;
                if (i == 2 || i == 3) {
                    C308310C6r c308310C6rLIZ = dynamicOptionModel.LIZ();
                    C307500C3o c307500C3o = C307500C3o.LIZ;
                    String str = dynamicOptionModel.libraKey;
                    c307500C3o.getClass();
                    if (c308310C6rLIZ.LIZ(C307500C3o.LIZLLL(str, true))) {
                        arrayList.add(c308310C6rLIZ);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C307500C3o.LIZ.getClass();
        return C307500C3o.LJFF.getValue();
    }
}
