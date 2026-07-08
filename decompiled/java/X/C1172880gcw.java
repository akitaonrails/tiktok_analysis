package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.poi.experiment.PoiOrderStatusPollingConfigData;

/* JADX INFO: renamed from: X.0gcw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172880gcw {
    public final InterfaceC736910SvR<InterfaceC1172870gcv> LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final InterfaceC1172910gcz LIZLLL;
    public long LJ;
    public final long LJFF;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1172880gcw.LIZ(X.05Vn):java.lang.Object");
    }

    public C1172880gcw(InterfaceC736910SvR<InterfaceC1172870gcv> interfaceC736910SvR, int i, String str, InterfaceC1172910gcz interfaceC1172910gcz) {
        long jLongValue;
        Long l;
        this.LIZ = interfaceC736910SvR;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = interfaceC1172910gcz;
        PoiOrderStatusPollingConfigData poiOrderStatusPollingConfigData = (PoiOrderStatusPollingConfigData) SettingsManager.LIZLLL().LJIIIIZZ("poi_order_status_polling_config", PoiOrderStatusPollingConfigData.class, C1172900gcy.LIZ);
        if (poiOrderStatusPollingConfigData != null && (l = poiOrderStatusPollingConfigData.ospPollingTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 2000;
        }
        this.LJFF = jLongValue;
    }
}
