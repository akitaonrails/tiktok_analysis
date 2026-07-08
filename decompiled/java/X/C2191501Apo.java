package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Apo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191501Apo {
    public static int LJI;
    public static int LJII;
    public static final C2191501Apo LIZ = new C2191501Apo();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2191111ApB());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1307490k83());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C2191551Apt());
    public static final C01GW LJ = C452501pT.LIZIZ(new C2190301Ans());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C2191591Apx());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C2191571Apv());
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C2191581Apw());
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C2191491Apn());
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(new C2191561Apu());

    public static C2190281Anq LIZIZ() {
        return (C2190281Anq) LJ.getValue();
    }

    public static void LIZ(C2191511App c2191511App) {
        String host;
        C1513780pUm c1513780pUm;
        long jLIZ;
        String host2 = c2191511App.getHost();
        boolean z = true;
        LJII++;
        if (((AbstractC19994813Le) LJFF.getValue()).nextFloat() <= C2191131ApD.LIZ().trackerSample) {
            String url = c2191511App.getUrl();
            C2190281Anq c2190281AnqLIZIZ = LIZIZ();
            Uri uri = UriProtector.parse(url);
            long contentLength = 0;
            if (C2191131ApD.LIZ().enable && (host = uri.getHost()) != null && (c1513780pUm = (C1513780pUm) ((ConcurrentHashMap) LIZLLL.getValue()).get(host)) != null) {
                String str = C2191131ApD.LIZ().calculateSpeedStrategyName;
                if (str != null && str.length() != 0) {
                    z = false;
                }
                if (z) {
                    LJIIIIZZ.getValue();
                    jLIZ = C2191531Apr.LIZ(c1513780pUm, ((Number) LIZIZ.getValue()).intValue(), c2190281AnqLIZIZ, null);
                } else {
                    LJIIIZ.getValue();
                    jLIZ = C2191541Aps.LIZ(c1513780pUm, ((Number) LIZIZ.getValue()).intValue(), c2190281AnqLIZIZ, null);
                }
                if (jLIZ != 0) {
                    int iLIZLLL = (C582130MsN.LIZ().LJ().LIZLLL() * 1024) / LSPassThroughRecordSizeConfig.DEFAULT;
                    long speed = c2191511App.getSpeed();
                    if (speed != 0) {
                        C2190281Anq c2190281AnqLIZIZ2 = LIZIZ();
                        c2190281AnqLIZIZ2.LIZIZ().put("file_size", Long.valueOf(c2191511App.getContentLength()));
                        c2190281AnqLIZIZ2.LIZIZ().put("dns_time", Long.valueOf(c2191511App.getDnsTime()));
                        c2190281AnqLIZIZ2.LIZIZ().put("connect_time", Long.valueOf(c2191511App.getConnectTime()));
                        c2190281AnqLIZIZ2.LIZIZ().put("ssl_time", Long.valueOf(c2191511App.getSslTime()));
                        c2190281AnqLIZIZ2.LIZIZ().put("is_hit_cdn", Integer.valueOf(c2191511App.getHitCdnCache() ? 1 : 0));
                        C2190281Anq c2190281AnqLIZIZ3 = LIZIZ();
                        c2190281AnqLIZIZ3.LIZ(Long.valueOf(speed), "real_speed");
                        c2190281AnqLIZIZ3.LIZ(Integer.valueOf(iLIZLLL), "vod_speed");
                        c2190281AnqLIZIZ3.LIZ(Long.valueOf(jLIZ), "predict_speed");
                        c2190281AnqLIZIZ3.LIZ(Long.valueOf(c2191511App.getTotalTime()), "real_cost");
                        if (iLIZLLL != 0) {
                            contentLength = c2191511App.getContentLength() / ((long) iLIZLLL);
                        }
                        c2190281AnqLIZIZ3.LIZ(Long.valueOf(contentLength), "vod_cost");
                        c2190281AnqLIZIZ3.LIZ(Long.valueOf(c2191511App.getContentLength() / jLIZ), "predict_cost");
                        c2190281AnqLIZIZ3.LIZ(Float.valueOf(LJII / LJI), "sample_filter_ratio");
                        c2190281AnqLIZIZ3.LIZ(Long.valueOf(((long) iLIZLLL) / speed), "vod_speed_accuracy_ratio");
                        c2190281AnqLIZIZ3.LIZ(Long.valueOf(jLIZ / speed), "predict_speed_accuracy_ratio");
                        c2190281AnqLIZIZ3.LIZ(Long.valueOf(Math.abs(speed - jLIZ)), "deviation_value");
                        c2190281AnqLIZIZ3.LIZ(0, "error_code");
                        C20684815ws.LJIJ("measure_download_image_speed", new JSONObject(C2097608Jq.LJIIZILJ(c2190281AnqLIZIZ3.LIZIZ())));
                        c2190281AnqLIZIZ3.LIZIZ().clear();
                    }
                }
            }
        }
        C01GW c01gw = LIZLLL;
        if (((ConcurrentHashMap) c01gw.getValue()).get(host2) == null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c01gw.getValue();
            C1513780pUm c1513780pUm2 = new C1513780pUm(((Number) LIZIZ.getValue()).intValue());
            c1513780pUm2.LIZIZ(c2191511App, Long.valueOf(c2191511App.getSpeed()));
            concurrentHashMap.put(host2, c1513780pUm2);
            return;
        }
        C1513780pUm c1513780pUm3 = (C1513780pUm) ((ConcurrentHashMap) c01gw.getValue()).get(host2);
        if (c1513780pUm3 == null) {
            return;
        }
        c1513780pUm3.LIZIZ(c2191511App, Long.valueOf(c2191511App.getSpeed()));
    }
}
