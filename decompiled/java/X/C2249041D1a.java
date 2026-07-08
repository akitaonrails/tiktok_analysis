package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.DisableSparkLynxPrefetchV2;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249041D1a extends C09AY implements Function0<ArrayList<String>> {
    public C2249041D1a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<String> invoke() {
        ArrayList<String> arrayList;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            DisableSparkLynxPrefetchV2.Model model = DisableSparkLynxPrefetchV2.LIZ;
            DisableSparkLynxPrefetchV2.Model model2 = (DisableSparkLynxPrefetchV2.Model) c0c64LJIILLIIL.LJJIIJ(true, "disable_spark_lynx_prefetch_v2", 31744, DisableSparkLynxPrefetchV2.Model.class, model, 2);
            return (model2 == null || (arrayList = model2.denyList) == null) ? model.denyList : arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return DisableSparkLynxPrefetchV2.LIZ.denyList;
        }
    }
}
