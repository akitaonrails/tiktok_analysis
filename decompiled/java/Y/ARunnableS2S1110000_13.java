package Y;

import X.C080U;
import X.C0V81;
import X.C0V8S;
import X.C0X9S;
import X.C1043460dGC;
import X.C1499850p8J;
import X.C1AF0;
import X.C1C7U;
import X.C792190V5t;
import X.C793240V9u;
import X.C823050WQl;
import X.C839620Wwi;
import com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.ISimpleNetworkApi;
import com.ss.android.ugc.aweme.ad.preload.ISimpleNetworkApiV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.multi.maker.AttributionApiV2;
import com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS2S1110000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            if (C839620Wwi.LIZ) {
                AttributionApiV2 attributionApiV2 = (AttributionApiV2) ((I3rdRetrofitFactory) ServiceManager.get().getService(I3rdRetrofitFactory.class)).create().create(AttributionApiV2.class);
                if (!this.z2) {
                    attributionApiV2.monitor(this.s0).execute();
                    return;
                }
                String str = this.s0;
                ((GamingAnchorMaker.AttributionUtil) this.l1).getClass();
                attributionApiV2.monitorWithHeader(str, GamingAnchorMaker.AttributionUtil.LIZ()).execute();
                return;
            }
            C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://view.adjust.com");
            c1499850p8JCreateBuilder.LIZJ = true;
            GamingAnchorMaker.AttributionUtil.AttributionApi attributionApi = (GamingAnchorMaker.AttributionUtil.AttributionApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(GamingAnchorMaker.AttributionUtil.AttributionApi.class);
            if (!this.z2) {
                attributionApi.monitor(this.s0).execute();
                return;
            }
            String str2 = this.s0;
            ((GamingAnchorMaker.AttributionUtil) this.l1).getClass();
            attributionApi.monitorWithHeader(str2, GamingAnchorMaker.AttributionUtil.LIZ()).execute();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ$1() {
        if (((C0V81) this.l1).LLJJIII == null) {
            C792190V5t.LIZ();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0V81 c0v81 = (C0V81) this.l1;
        Map<String, C793240V9u<Long, Long>> map = c0v81.LLILZIL;
        if (map == null) {
            map = new HashMap<>();
        }
        c0v81.LLILZIL = map;
        ((C0V81) this.l1).LLILZIL.put(this.s0, new C793240V9u<>(Long.valueOf(jCurrentTimeMillis), Long.valueOf(((C0V81) this.l1).LLJJI.LIZ())));
        C0V81 c0v812 = (C0V81) this.l1;
        Map<String, C793240V9u<Long, Long>> map2 = c0v812.LLILZLL;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        c0v812.LLILZLL = map2;
        ((C0V81) this.l1).LLILZLL.put(this.s0, new C793240V9u<>(Long.valueOf(jCurrentTimeMillis), Long.valueOf(((C0V81) this.l1).LLJJI.LIZ.LIZLLL())));
        C0V81 c0v813 = (C0V81) this.l1;
        Map<String, C793240V9u<Long, Long>> map3 = c0v813.LLIZ;
        if (map3 == null) {
            map3 = new HashMap<>();
        }
        c0v813.LLIZ = map3;
        ((C0V81) this.l1).LLIZ.put(this.s0, new C793240V9u<>(Long.valueOf(jCurrentTimeMillis), Long.valueOf(((C0V81) this.l1).LLJJI.LIZ.LJ())));
        if (this.z2) {
            C0V8S.LIZ.LJJLIIIJ(this.s0);
        }
    }

    public final void LIZ$2() {
        C0X9S<String> c0x9sDoGetForString;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"));
        arrayList.add(new C080U("referer", "https://www.tiktok.com/"));
        arrayList.add(new C080U("x-tt-pns-dt-pass-id", "268959748"));
        for (Map.Entry entry : ((Map) this.l1).entrySet()) {
            arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
        }
        C1043460dGC c1043460dGC = C1043460dGC.LIZ;
        boolean z = this.z2;
        c1043460dGC.getClass();
        List listLJIIIZ = C1043460dGC.LJIIIZ(z);
        if (listLJIIIZ != null) {
            arrayList.addAll(listLJIIIZ);
        }
        if (C839620Wwi.LIZIZ) {
            c0x9sDoGetForString = ((ISimpleNetworkApiV2) ((I3rdRetrofitFactory) ServiceManager.get().getService(I3rdRetrofitFactory.class)).LIZIZ().LIZ(true).LJFF().create(ISimpleNetworkApiV2.class)).doGetForString(this.s0, arrayList);
        } else {
            C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(this.s0);
            c1499850p8JCreateBuilder.LIZIZ = true;
            c1499850p8JCreateBuilder.LIZJ = true;
            c0x9sDoGetForString = ((ISimpleNetworkApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(ISimpleNetworkApi.class)).doGetForString(false, -1, "", null, arrayList, null);
        }
        try {
            c0x9sDoGetForString.execute().LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "send preload h5 network failed");
        }
    }

    public static final void run$0(ARunnableS2S1110000_13 aRunnableS2S1110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("GamingAnchorMaker$AttributionUtil@e6f8.callAttributionImpressionDelay$1");
        try {
            GamingAnchorMaker.AttributionUtil attributionUtil = (GamingAnchorMaker.AttributionUtil) aRunnableS2S1110000_13.l1;
            String str = aRunnableS2S1110000_13.s0;
            boolean z = aRunnableS2S1110000_13.z2;
            if (!attributionUtil.LIZ) {
                attributionUtil.LIZ = true;
                if (str != null && str.length() != 0) {
                    C823050WQl.LIZLLL().submit(new ARunnableS2S1110000_13(attributionUtil, str, z, 1));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GamingAnchorMaker$AttributionUtil@e6f8.callAttributionImpressionDelay$1");
    }

    public static final void run$1(ARunnableS2S1110000_13 aRunnableS2S1110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("GamingAnchorMaker$AttributionUtil@e6f8.callAttributionUrl$1");
        try {
            aRunnableS2S1110000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GamingAnchorMaker$AttributionUtil@e6f8.callAttributionUrl$1");
    }

    public static final void run$2(ARunnableS2S1110000_13 aRunnableS2S1110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("MainProcessCollector@ccfe.startMetric$1");
        try {
            aRunnableS2S1110000_13.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MainProcessCollector@ccfe.startMetric$1");
    }

    public static final void run$3(ARunnableS2S1110000_13 aRunnableS2S1110000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadUtils@907c.sendHtmlRequest$1");
        try {
            aRunnableS2S1110000_13.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadUtils@907c.sendHtmlRequest$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS2S1110000_13(com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker.AttributionUtil r2, java.lang.String r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.z2 = r4
            r0.s0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            r0.z2 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S1110000_13.<init>(com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker$AttributionUtil, java.lang.String, boolean, int):void");
    }

    public ARunnableS2S1110000_13(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}
