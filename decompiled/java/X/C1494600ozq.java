package X;

import X.C1494160oz8;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1494600ozq<T extends C1494160oz8> implements InterfaceC1494730p03 {
    public static volatile InterfaceC1494140oz6 LJJJJZ = new InterfaceC1494140oz6() { // from class: X.0p0C
        @Override // X.InterfaceC1494140oz6
        public final C1494600ozq create() {
            return new C1494600ozq();
        }
    };
    public boolean LIZ;
    public T LIZJ;
    public long LJ;
    public long LJFF;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public URL LJIIZILJ;
    public String LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public boolean LJJI;
    public String LJJIIZI;
    public String LJJIJ;
    public boolean LJJJ;
    public String LJJJJIZL;
    public C1494110oz3 LJJJJL;
    public long LJJJJLI;
    public int LIZIZ = -1;
    public C1494570ozn LIZLLL = new C1494570ozn(this);
    public long LJI = System.currentTimeMillis();
    public long LJIJJLI = -1;
    public long LJIL = -1;
    public final int LJJ = -1;
    public int LJJIFFI = -1;
    public int LJJII = -1;
    public String LJJIII = "";
    public String LJJIIJ = "";
    public JSONObject LJJIIJZLJL = new JSONObject();
    public boolean LJJIIZ = false;
    public String LJJIJIIJI = "";
    public String LJJIJIIJIL = "";
    public boolean LJJIJIL = false;
    public C1494210ozD LJJIJL = new C1494210ozD();
    public long LJJIJLIJ = -1;
    public long LJJIL = -1;
    public final C1494310ozN LJJIZ = new C1494310ozN();
    public boolean LJJJI = false;
    public boolean LJJJIL = false;
    public int LJJJJ = 0;
    public long LJJJJI = -1;
    public long LJJJJJ = -1;
    public boolean LJJJJJL = false;
    public final AtomicBoolean LJJJJLL = new AtomicBoolean(false);

    @Override // X.InterfaceC1494730p03
    public final void LJFF(long j) {
    }

    @Override // X.InterfaceC1494730p03
    public final void LIZ(long j) {
        this.LJIILIIL = j;
    }

    @Override // X.InterfaceC1494730p03
    public final void LIZIZ(long j) {
        this.LJIIJ = j;
    }

    @Override // X.InterfaceC1494730p03
    public final void LIZJ(long j) {
        this.LJIIIZ = j;
    }

    @Override // X.InterfaceC1494730p03
    public final void LIZLLL(long j) {
        this.LJIILLIIL = j;
    }

    @Override // X.InterfaceC1494730p03
    public final void LJ(long j) {
        this.LJIL = j;
    }

    @Override // X.InterfaceC1494730p03
    public final void LJI(long j) {
        this.LJIIL = j;
    }

    @Override // X.InterfaceC1494730p03
    public final void LJII(JSONObject jSONObject) throws JSONException {
        long jLongValue;
        jSONObject.put("requestStart", this.LJI);
        jSONObject.put("responseBack", this.LJII);
        jSONObject.put("completeReadResponse", this.LJIIIIZZ);
        jSONObject.put("appLevelRequestStart", this.LJ);
        jSONObject.put("beforeAllInterceptors", this.LJFF);
        jSONObject.put("requestEnd", this.LJIIIZ);
        jSONObject.put("recycleCount", this.LJJ);
        jSONObject.put("timing_dns", this.LJIIJ);
        jSONObject.put("timing_connect", this.LJIIJJI);
        jSONObject.put("timing_ssl", this.LJIIL);
        jSONObject.put("timing_send", this.LJIILIIL);
        jSONObject.put("timing_waiting", this.LJIILJJIL);
        jSONObject.put("timing_receive", this.LJIILL);
        jSONObject.put("timing_total", this.LJIILLIIL);
        jSONObject.put("timing_isSocketReused", this.LJJI);
        jSONObject.put("timing_totalSendBytes", this.LJIJI);
        jSONObject.put("timing_totalReceivedBytes", this.LJIJJ);
        jSONObject.put("timing_remoteIP", this.LJIJ);
        jSONObject.put("request_log", this.LJJIIJ);
        Object obj = this.LJJIIJZLJL;
        if (obj != null) {
            jSONObject.put("req_info", obj);
        }
        jSONObject.put("download", this.LJJIIZ);
        jSONObject.put("addExecutorToAllInterceptors", this.LJFF - this.LJ);
        jSONObject.put("addExecutorTime", this.LJ);
        jSONObject.put("allInterceptorsTime", this.LJFF);
        jSONObject.put("fallback", this.LJJII);
        jSONObject.put("requestHeader", this.LJJIIZI);
        jSONObject.put("responseHeader", this.LJJIJ);
        if (this.LJJIJIL) {
            jSONObject.put("hit_rules", 1);
        }
        jSONObject.put("use_deprecated_api", false);
        T t = this.LIZJ;
        if (t != null) {
            long j = t.LJIIIIZZ;
            if (j > 0) {
                jSONObject.put("protect_timeout", j);
                jSONObject.put("connect_timeout", this.LIZJ.LJFF);
                jSONObject.put("read_timeout", this.LIZJ.LJII);
                jSONObject.put("write_timeout", this.LIZJ.LJI);
            } else {
                jSONObject.put("connect_timeout", t.LIZJ);
                jSONObject.put("read_timeout", this.LIZJ.LIZLLL);
                jSONObject.put("write_timeout", this.LIZJ.LJ);
            }
        }
        C1494570ozn c1494570ozn = this.LIZLLL;
        if (c1494570ozn != null) {
            jSONObject.put("resp_comp", c1494570ozn.LJJLIIIJL);
            jSONObject.put("req_comp", this.LIZLLL.LJJLIIIJLJLI);
            Long l = (Long) ((ConcurrentHashMap) this.LIZLLL.LJJJ).get("CallServerInterceptor");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("parse_time", jLongValue);
            jSONObject.put("priority_level", this.LIZLLL.LJJLIIIJJI);
            jSONObject.put("req_priority_level", this.LIZLLL.LJJLIIIJJIZ);
            jSONObject.put("thread_priority", C786410Ut5.u3().getPriority());
            C1494570ozn c1494570ozn2 = this.LIZLLL;
            long j2 = c1494570ozn2.LJIL;
            if (j2 > 0) {
                jSONObject.put("biz_before_time", j2 - c1494570ozn2.LJIJJ);
                C1494570ozn c1494570ozn3 = this.LIZLLL;
                jSONObject.put("queue_time", c1494570ozn3.LJJIIZI - c1494570ozn3.LJIL);
                C1494570ozn c1494570ozn4 = this.LIZLLL;
                jSONObject.put("preprocess_time", c1494570ozn4.LJJIJIIJIL - c1494570ozn4.LJJIIZI);
                C1494570ozn c1494570ozn5 = this.LIZLLL;
                jSONObject.put("realcall_time", c1494570ozn5.LJJIJIL - c1494570ozn5.LJJIJIIJIL);
                jSONObject.put("is_async", 0);
                if (this.LJJIIZ) {
                    C1494570ozn c1494570ozn6 = this.LIZLLL;
                    if (c1494570ozn6.LJJLIIIJILLIZJL > 0) {
                        if (((ArrayList) c1494570ozn6.LJLIL).size() > 0) {
                            C1494570ozn c1494570ozn7 = this.LIZLLL;
                            jSONObject.put("postprocess_time", c1494570ozn7.LJJLIIIJILLIZJL - ((C1494800p0A) ListProtector.get(c1494570ozn7.LJLIL, 0)).LIZIZ);
                        }
                        C1494570ozn c1494570ozn8 = this.LIZLLL;
                        jSONObject.put("cb_time", c1494570ozn8.LJJIJIL - c1494570ozn8.LJJLIIIJILLIZJL);
                    } else {
                        jSONObject.put("postprocess_time", -1);
                        jSONObject.put("cb_time", -1);
                        jSONObject.put("executeCallEndTime", this.LIZLLL.LJJIJIL);
                        jSONObject.put("executeEndTime", this.LIZLLL.LJJLIIIJILLIZJL);
                    }
                    C1494570ozn c1494570ozn9 = this.LIZLLL;
                    jSONObject.put("biz_total_time", c1494570ozn9.LJJIJIL - c1494570ozn9.LJIJJ);
                } else {
                    C1494570ozn c1494570ozn10 = this.LIZLLL;
                    jSONObject.put("postprocess_time", c1494570ozn10.LJJLIIIJILLIZJL - c1494570ozn10.LJJIJIL);
                    C1494570ozn c1494570ozn11 = this.LIZLLL;
                    jSONObject.put("biz_total_time", c1494570ozn11.LJJLIIIJILLIZJL - c1494570ozn11.LJIJJ);
                }
            } else {
                long j3 = c1494570ozn2.LJIJJLI;
                if (j3 > 0) {
                    jSONObject.put("biz_before_time", j3 - c1494570ozn2.LJIJJ);
                    C1494570ozn c1494570ozn12 = this.LIZLLL;
                    jSONObject.put("queue_time", c1494570ozn12.LJJIIZI - c1494570ozn12.LJIJJLI);
                    C1494570ozn c1494570ozn13 = this.LIZLLL;
                    jSONObject.put("preprocess_time", c1494570ozn13.LJJIJIIJIL - c1494570ozn13.LJJIIZI);
                    C1494570ozn c1494570ozn14 = this.LIZLLL;
                    jSONObject.put("realcall_time", c1494570ozn14.LJJIJIL - c1494570ozn14.LJJIJIIJIL);
                    jSONObject.put("is_async", 1);
                    if (this.LJJIIZ) {
                        C1494570ozn c1494570ozn15 = this.LIZLLL;
                        if (c1494570ozn15.LJJLIIIIJ > 0) {
                            if (((ArrayList) c1494570ozn15.LJLIL).size() > 0) {
                                C1494570ozn c1494570ozn16 = this.LIZLLL;
                                jSONObject.put("postprocess_time", c1494570ozn16.LJJLIIIIJ - ((C1494800p0A) ListProtector.get(c1494570ozn16.LJLIL, 0)).LIZIZ);
                            }
                            C1494570ozn c1494570ozn17 = this.LIZLLL;
                            jSONObject.put("cb_time", c1494570ozn17.LJJIJIL - c1494570ozn17.LJJLIIIIJ);
                        } else {
                            jSONObject.put("postprocess_time", -1);
                            jSONObject.put("cb_time", -1);
                            jSONObject.put("enqueueCallbackStartTime", this.LIZLLL.LJJLIIIIJ);
                            jSONObject.put("executeCallEndTime", this.LIZLLL.LJJIJIL);
                        }
                        C1494570ozn c1494570ozn18 = this.LIZLLL;
                        jSONObject.put("biz_total_time", c1494570ozn18.LJJIJIL - c1494570ozn18.LJIJJ);
                    } else {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        C1494570ozn c1494570ozn19 = this.LIZLLL;
                        jSONObject.put("postprocess_time", c1494570ozn19.LJJLIIIIJ - c1494570ozn19.LJJIJIL);
                        jSONObject.put("cb_time", jUptimeMillis - this.LIZLLL.LJJLIIIIJ);
                        jSONObject.put("biz_total_time", jUptimeMillis - this.LIZLLL.LJIJJ);
                    }
                }
            }
            if (((ArrayList) this.LIZLLL.LJLIIL).size() > 0) {
                HashMap map = new HashMap();
                for (int i = 0; i < ((ArrayList) this.LIZLLL.LJLIIL).size(); i++) {
                    C1494800p0A c1494800p0A = (C1494800p0A) ListProtector.get(this.LIZLLL.LJLIIL, i);
                    long j4 = c1494800p0A.LIZJ - c1494800p0A.LIZIZ;
                    Long l2 = (Long) map.get(c1494800p0A.LIZ);
                    if (l2 == null) {
                        map.put(c1494800p0A.LIZ, Long.valueOf(j4));
                    } else {
                        map.put(c1494800p0A.LIZ, Long.valueOf(l2.longValue() + j4));
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                for (String str : map.keySet()) {
                    jSONObject2.put(str, map.get(str));
                }
                jSONObject.put("request_interceptors_time", jSONObject2);
                HashMap map2 = new HashMap();
                for (int i2 = 0; i2 < ((ArrayList) this.LIZLLL.LJLIL).size(); i2++) {
                    C1494800p0A c1494800p0A2 = (C1494800p0A) ListProtector.get(this.LIZLLL.LJLIL, i2);
                    long j5 = c1494800p0A2.LIZJ - c1494800p0A2.LIZIZ;
                    Long l3 = (Long) map2.get(c1494800p0A2.LIZ);
                    if (l3 == null) {
                        map2.put(c1494800p0A2.LIZ, Long.valueOf(j5));
                    } else {
                        map2.put(c1494800p0A2.LIZ, Long.valueOf(l3.longValue() + j5));
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                for (String str2 : map2.keySet()) {
                    jSONObject3.put(str2, map2.get(str2));
                }
                jSONObject.put("response_interceptors_time", jSONObject3);
            }
        }
    }

    @Override // X.InterfaceC1494730p03
    public final void LJIIIIZZ(long j) {
        this.LJIILJJIL = j;
    }

    @Override // X.InterfaceC1494730p03
    public final void LJIIIZ(String str) {
        this.LJJIIJ = str;
    }

    @Override // X.InterfaceC1494730p03
    public final void LJIIJ(long j) {
        this.LJJJJI = j;
    }

    @Override // X.InterfaceC1494730p03
    public final void LJIIJJI(long j) {
        this.LJIIJJI = j;
    }

    @Override // X.InterfaceC1494730p03
    public final void LJIIL(long j) {
        this.LJIILL = j;
    }

    public final void LJIILIIL(C1494570ozn c1494570ozn) {
        c1494570ozn.LIZIZ = new WeakReference<>(this);
        this.LIZLLL = c1494570ozn;
        C1494700p00 c1494700p00 = c1494570ozn.LJLILLLLZI.LIZ;
        long j = c1494700p00.LJIIJJI;
        this.LJI = j;
        this.LJ = j;
        this.LJFF = c1494570ozn.LIZ(c1494700p00.LJIILIIL);
        this.LJIJJLI = c1494570ozn.LJLILLLLZI.LJ.LJ;
    }
}
