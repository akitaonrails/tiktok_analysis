package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18JP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18JP extends C09AY implements Function0<Keva> {
    public C18JP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        try {
            return Keva.getRepo("poi_play_count");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21312918at.LIZ(EnumC1205980hUK.POI_REALTIME_FEATURE, "get_poi_play_num_repo", new LinkedHashMap(), e);
            return null;
        }
    }
}
