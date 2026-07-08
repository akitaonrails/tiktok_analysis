package X;

import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiDetailGPSFrequency;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201370hMt {
    public static final PoiDetailGPSFrequency LIZ = new PoiDetailGPSFrequency(false, 0, 0, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(813));

    public static C1201390hMv LIZ() {
        C1201390hMv c1201390hMv = new C1201390hMv();
        C01GW c01gw = LIZIZ;
        c1201390hMv.LIZ = ((PoiDetailGPSFrequency) c01gw.getValue()).floatNoticeNoCloseFrequencyDays;
        c1201390hMv.LIZIZ = ((PoiDetailGPSFrequency) c01gw.getValue()).floatNoticeFrequencyDays;
        c1201390hMv.LIZJ = ((PoiDetailGPSFrequency) c01gw.getValue()).floatNoticeMaxCloseCount;
        return c1201390hMv;
    }
}
