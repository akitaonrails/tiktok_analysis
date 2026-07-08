package Y;

import X.C094D;
import X.C09AJ;
import X.C09JN;
import X.C0POE;
import X.C118300cf;
import X.C1203960hR4;
import X.C1515820pY4;
import X.C1C7U;
import X.C2188811AlT;
import X.C632140Oqq;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;
import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AfS3S1200100_18 implements C09JN {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS3S1200100_18 afS3S1200100_18, Object obj) {
        C1C7U.LIZ("NearbyRepository@94f4.operator$1$fetchNearbyDataChunk$1$dispose$1");
        C1515820pY4 c1515820pY4 = (C1515820pY4) obj;
        final C118300cf c118300cf = new C118300cf();
        try {
            final C1203960hR4 c1203960hR4 = (C1203960hR4) afS3S1200100_18.l2;
            final long j = afS3S1200100_18.j3;
            final String str = afS3S1200100_18.s0;
            final C094D c094d = (C094D) afS3S1200100_18.l1;
            c1515820pY4.LIZLLL(new C0POE<NearbyRevampResponse>() { // from class: X.0hQv
                @Override // X.C0POE
                public final void onComplete() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchNearbyDataChunk onComplete totalChunks=");
                    sbLIZ.append(c118300cf.element);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c094d.LJIIIIZZ(new C1203910hQz(c118300cf.element));
                    c094d.LJIIJJI(null);
                }

                @Override // X.C0POE
                public final void onFailed(Throwable th) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchNearbyDataChunk onFailed: ");
                    sbLIZ.append(th);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C094D<AbstractC1203920hR0> c094d2 = c094d;
                    if (th == null) {
                        th = new RuntimeException("chunk stream failed");
                    }
                    c094d2.LJIIJJI(th);
                }

                @Override // X.C0POE
                public final void onNext(NearbyRevampResponse nearbyRevampResponse) {
                    Integer numValueOf;
                    boolean z;
                    boolean z2;
                    String imprId;
                    String imprId2;
                    String imprId3;
                    String imprId4;
                    String imprId5;
                    long j2;
                    NearbyRevampResponse nearbyRevampResponse2 = nearbyRevampResponse;
                    if (nearbyRevampResponse2 != null) {
                        C118300cf c118300cf2 = c118300cf;
                        C1203960hR4 c1203960hR42 = c1203960hR4;
                        long j3 = j;
                        String str2 = str;
                        C094D<AbstractC1203920hR0> c094d2 = c094d;
                        boolean zLJFF = Intrinsics.LJFF(nearbyRevampResponse2.LL, "preload");
                        if (c118300cf2.element == 0) {
                            if (c1203960hR42 != null) {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                c1203960hR42.LJFF = jElapsedRealtime;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("setEndNetTs: ");
                                sbLIZ.append(jElapsedRealtime);
                                C2188811AlT.LIZIZ(sbLIZ);
                            } else {
                                c1203960hR42 = null;
                            }
                            if (c1203960hR42 != null) {
                                c1203960hR42.LJIILJJIL = nearbyRevampResponse2.LLILLJJLI;
                            }
                        } else if (c1203960hR42 != null) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            int i = c118300cf2.element;
                            C1203960hR4 c1203960hR43 = new C1203960hR4(c1203960hR42.LIZ);
                            c1203960hR43.LIZIZ = c1203960hR42.LIZIZ;
                            c1203960hR43.LIZJ = c1203960hR42.LIZJ;
                            c1203960hR43.LIZLLL = c1203960hR42.LIZLLL;
                            c1203960hR43.LJ = c1203960hR42.LJ;
                            c1203960hR43.LJFF = jElapsedRealtime2;
                            c1203960hR43.LJI = 0L;
                            c1203960hR43.LJIIIZ = c1203960hR42.LJIIIZ;
                            c1203960hR43.LJIIJ = c1203960hR42.LJIIJ;
                            c1203960hR43.LJIIJJI = c1203960hR42.LJIIJJI;
                            c1203960hR43.LJII = true;
                            c1203960hR43.LJIIIIZZ = false;
                            c1203960hR43.LJIIL = 1;
                            c1203960hR43.LJIILIIL = i;
                            c1203960hR43.LJIILJJIL = c1203960hR42.LJIILJJIL;
                            c1203960hR43.LJIILL = c1203960hR42.LJIILL;
                            c1203960hR42 = c1203960hR43;
                            c1203960hR42.LJIILJJIL = nearbyRevampResponse2.LLILLJJLI;
                        } else {
                            c1203960hR42 = null;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fetchNearbyDataChunk onNext chunkIndex=");
                        sbLIZ2.append(c118300cf2.element);
                        sbLIZ2.append(", awemeListSize=");
                        List<Aweme> list = nearbyRevampResponse2.awemeList;
                        if (list != null) {
                            numValueOf = Integer.valueOf(list.size());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ2.append(numValueOf);
                        sbLIZ2.append(", preload: ");
                        sbLIZ2.append(nearbyRevampResponse2.getPreloadFlag());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        C1201620hNI c1201620hNI = C1201620hNI.LIZ;
                        int i2 = c118300cf2.element;
                        String str3 = nearbyRevampResponse2.dataType;
                        long j4 = nearbyRevampResponse2.LLILLJJLI;
                        c1201620hNI.getClass();
                        Map mapLJ = C1201620hNI.LJ(nearbyRevampResponse2.stageTraceData);
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        if (zLJFF && j4 >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str4 = nearbyRevampResponse2.stageTraceData;
                        if (str4 != null && str4.length() != 0) {
                            try {
                                JSONObject jSONObject = new JSONObject(str4);
                                if (jSONObject.has("nearby_server_total_cost")) {
                                    try {
                                        Long lValueOf = Long.valueOf(jSONObject.optLong("nearby_server_total_cost", -1L));
                                        if (lValueOf.longValue() >= 0) {
                                            if (z) {
                                                j2 = j4;
                                            } else {
                                                j2 = jElapsedRealtime3 - j3;
                                            }
                                            mapLJ.put("inner", lValueOf);
                                            long jLongValue = j2 - lValueOf.longValue();
                                            if (jLongValue < 0) {
                                                jLongValue = 0;
                                            }
                                            mapLJ.put("timing_net", Long.valueOf(jLongValue));
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        if (z) {
                            mapLJ.put("reuse_duration", Long.valueOf(jElapsedRealtime3 - j3));
                        }
                        LocationNetTracker.LIZIZ(null, new C1201150hMX(z, jElapsedRealtime3, j4, j3, str2, i2, str3, mapLJ, zLJFF));
                        C20019113Un c20019113Un = C20019113Un.LIZ;
                        List<Aweme> list2 = nearbyRevampResponse2.awemeList;
                        if (c118300cf2.element == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c20019113Un.getClass();
                        C20019113Un.LJIIIZ(list2, z2);
                        if (Intrinsics.LJFF(nearbyRevampResponse2.dataType, "full")) {
                            IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
                            IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                            List<Aweme> list3 = nearbyRevampResponse2.awemeList;
                            if (list3 != null) {
                                for (Aweme aweme : list3) {
                                    iAwemeService.LLILLL(aweme);
                                    LogPbBean logPbBean = nearbyRevampResponse2.logPb;
                                    if (logPbBean != null) {
                                        imprId = logPbBean.getImprId();
                                    } else {
                                        imprId = null;
                                    }
                                    if (C123100dR.LIZ(imprId) && iRequestIdService != null) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(aweme.getAid());
                                        sbLIZ3.append("32");
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                        LogPbBean logPbBean2 = nearbyRevampResponse2.logPb;
                                        if (logPbBean2 != null) {
                                            imprId5 = logPbBean2.getImprId();
                                        } else {
                                            imprId5 = null;
                                        }
                                        iRequestIdService.LIZIZ(0, strLIZIZ, imprId5);
                                    }
                                    LogPbBean logPbBean3 = nearbyRevampResponse2.logPb;
                                    if (logPbBean3 != null) {
                                        imprId2 = logPbBean3.getImprId();
                                    } else {
                                        imprId2 = null;
                                    }
                                    aweme.setRequestId(imprId2);
                                    LogPbBean logPbBean4 = nearbyRevampResponse2.logPb;
                                    if (logPbBean4 != null) {
                                        imprId3 = logPbBean4.getImprId();
                                    } else {
                                        imprId3 = null;
                                    }
                                    aweme.setLogPbBean(new LogPbBean(imprId3));
                                    C611410NyV c611410NyV = C584850Mwl.LIZ;
                                    LogPbBean logPbBean5 = nearbyRevampResponse2.logPb;
                                    if (logPbBean5 != null) {
                                        imprId4 = logPbBean5.getImprId();
                                    } else {
                                        imprId4 = null;
                                    }
                                    c611410NyV.LJI(imprId4, nearbyRevampResponse2.logPb);
                                }
                            }
                        }
                        c094d2.LJIIIIZZ(new C1203900hQy(c118300cf2.element, nearbyRevampResponse2, c1203960hR42));
                        if (c118300cf2.element == 0) {
                            C1203880hQw.LIZ(nearbyRevampResponse2.awemeList);
                        }
                        c118300cf2.element++;
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchNearbyDataChunk error1: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            ((C094D) afS3S1200100_18.l1).LJIIJJI(e);
        }
        C1C7U.LIZIZ("NearbyRepository@94f4.operator$1$fetchNearbyDataChunk$1$dispose$1");
    }

    public static final void accept$1(AfS3S1200100_18 afS3S1200100_18, Object obj) {
        C1C7U.LIZ("ComplianceBizNetworkMonitorKt@21f4.networkMonitor$1$1");
        ((C09AJ) afS3S1200100_18.l1).onNext(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C632140Oqq.LIZJ(jCurrentTimeMillis - afS3S1200100_18.j3, afS3S1200100_18.s0, (Map) afS3S1200100_18.l2);
        C1C7U.LIZIZ("ComplianceBizNetworkMonitorKt@21f4.networkMonitor$1$1");
    }

    public static final void accept$2(AfS3S1200100_18 afS3S1200100_18, Object obj) {
        C1C7U.LIZ("ComplianceBizNetworkMonitorKt@21f4.networkMonitor$1$2");
        Throwable th = (Throwable) obj;
        ((C09AJ) afS3S1200100_18.l1).onError(th);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C632140Oqq.LIZIZ(jCurrentTimeMillis - afS3S1200100_18.j3, afS3S1200100_18.s0, th, (Map) afS3S1200100_18.l2);
        C1C7U.LIZIZ("ComplianceBizNetworkMonitorKt@21f4.networkMonitor$1$2");
    }

    public AfS3S1200100_18(Object obj, String str, long j, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.j3 = j;
        this.l2 = obj2;
    }
}
