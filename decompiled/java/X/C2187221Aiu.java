package X;

import Y.AfS172S0100000_3;
import com.ss.android.ugc.aweme.ad.feed.model.AppAdsDetectAppModel;
import com.ss.android.ugc.aweme.ad.feed.task.detect.DetectConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1Aiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187221Aiu {
    public static final C2187221Aiu LIZ = new C2187221Aiu();
    public static volatile boolean LIZIZ;

    public final void LIZ() {
        if (((Boolean) C2187271Aiz.LIZJ.getValue()).booleanValue()) {
            C01GW c01gw = C2187271Aiz.LJ;
            if (((List) c01gw.getValue()).isEmpty()) {
                return;
            }
            synchronized (this) {
                if (LIZIZ) {
                    return;
                }
                AppAdsDetectAppModel appAdsDetectAppModel = C2187231Aiv.LIZIZ;
                if (appAdsDetectAppModel != null) {
                    Long l = appAdsDetectAppModel.version;
                    long jLongValue = ((Number) C2187271Aiz.LIZLLL.getValue()).longValue();
                    if (l != null && l.longValue() == jLongValue) {
                        Long l2 = ((DetectConfig) C2187271Aiz.LJFF.getValue())._detectIntervalMs;
                        long jLongValue2 = l2 != null ? l2.longValue() : 86400000L;
                        Long l3 = appAdsDetectAppModel.timeStamp;
                        if (l3 != null) {
                            if (Math.abs(System.currentTimeMillis() - l3.longValue()) <= jLongValue2) {
                                return;
                            }
                        }
                    }
                }
                LIZIZ = true;
                List list = (List) c01gw.getValue();
                final List listSynchronizedList = Collections.synchronizedList(new ArrayList());
                final DetectConfig detectConfig = (DetectConfig) C2187271Aiz.LJFF.getValue();
                Integer num = detectConfig._detectChunkSize;
                C11NZ.LJJJJIZL(C13LP.LJJJIL(list, num != null ? num.intValue() : 10)).LJIJ(new InterfaceC1487280oo2() { // from class: X.0TlD
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        long jLongValue3;
                        C11JN c11jnLJJIJIIJIL = C11NZ.LJJJJZ(obj).LJJIJIIJIL(new AfS172S0100000_3(listSynchronizedList, 71));
                        Long l4 = detectConfig._detectChunkInterval;
                        if (l4 != null) {
                            jLongValue3 = l4.longValue();
                        } else {
                            jLongValue3 = Mp4ScreenVideoLoadTimeout.CONTROL;
                        }
                        return c11jnLJJIJIIJIL.LJJI(jLongValue3, TimeUnit.MILLISECONDS);
                    }
                }).LJJIIJZLJL(new C2189721Amw(listSynchronizedList, 1)).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.1Aix
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        C2187221Aiu.LIZIZ = false;
                    }
                }).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLJ();
            }
        }
    }
}
