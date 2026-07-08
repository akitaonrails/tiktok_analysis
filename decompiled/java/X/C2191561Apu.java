package X;

import android.net.Uri;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS323S0000000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1Apu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191561Apu extends C09AY implements Function0<C2191521Apq> {
    public C2191561Apu() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Apq] */
    @Override // kotlin.jvm.functions.Function0
    public final C2191521Apq invoke() {
        final AFwS323S0000000_34 aFwS323S0000000_34 = AFwS323S0000000_34.get$arr$(44);
        return new AbstractC2191091Ap9(aFwS323S0000000_34) { // from class: X.1Apq
            {
                String str = C2191131ApD.LIZ().generateSamplesStrategyName;
                if (str != null) {
                    C326690CrL.LIZ.registerStrategyCallback(new C1306400k6I(str), new AwS613S0100000_34(aFwS323S0000000_34, 169));
                }
            }

            @Override // X.AbstractC2191091Ap9
            public final void LIZIZ(Uri uri, long j, boolean z, C1494850p0F c1494850p0F) {
                IStarShipStrategy iStarShipStrategy = C326690CrL.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("url", uri.toString());
                linkedHashMap.put("download_duration", Long.valueOf(c1494850p0F.LJIILLIIL));
                linkedHashMap.put("file_size", Long.valueOf(j));
                long j2 = c1494850p0F.LJIIJ;
                long j3 = 0;
                if (j2 < 0) {
                    j2 = 0;
                }
                linkedHashMap.put("dns_time", Long.valueOf(j2));
                long j4 = c1494850p0F.LJIIL;
                if (j4 < 0) {
                    j4 = 0;
                }
                linkedHashMap.put("ssl_time", Long.valueOf(j4));
                long j5 = c1494850p0F.LJIIJJI;
                if (j5 >= 0) {
                    j3 = j5;
                }
                linkedHashMap.put("timing_timing_connect", Long.valueOf(j3));
                linkedHashMap.put("is_hit_cdn", Boolean.valueOf(z));
                iStarShipStrategy.sendEvent("measure_speed_sample_image_loaded", linkedHashMap);
            }
        };
    }
}
