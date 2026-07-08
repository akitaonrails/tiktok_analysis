package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.ss.android.ugc.aweme.lancet.jobscheduler.SubJobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: X.0WDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819680WDm extends AbstractC819800WDy {
    public InterfaceC819210WBr<Executor> LL = C819720WDq.LIZ(C0WE5.LIZ);
    public C819780WDw LLILLJJLI;
    public InterfaceC819210WBr LLILLL;
    public C819760WDu LLILZ;
    public InterfaceC819210WBr<C0WCD> LLILZIL;
    public InterfaceC819210WBr<C819200WBq> LLILZLL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0WDu] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0WDf] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0WDo] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0WDr] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0WDp] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0WDw] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0WDk] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0WDn] */
    public C819680WDm(final Context context) {
        if (context != null) {
            final ?? r2 = new C0WE2<T>(context) { // from class: X.0WDw
                public final T LIZ;

                @Override // X.InterfaceC819210WBr
                public final T get() {
                    return this.LIZ;
                }

                {
                    this.LIZ = context;
                }
            };
            this.LLILLJJLI = r2;
            final ?? r1 = new C0WE2<C0WEB>(r2) { // from class: X.0WDr
                public final InterfaceC819210WBr<Context> LIZ;
                public final InterfaceC819210WBr<C0WC2> LIZIZ;
                public final InterfaceC819210WBr<C0WC2> LIZJ;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    return new C0WEB(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get());
                }

                {
                    C0WE0 c0we0 = C0WE9.LIZ;
                    C0WE1 c0we1 = C0WEA.LIZ;
                    this.LIZ = r2;
                    this.LIZIZ = c0we0;
                    this.LIZJ = c0we1;
                }
            };
            this.LLILLL = C819720WDq.LIZ(new C0WE2<C0WEC>(r2, r1) { // from class: X.0WDt
                public final InterfaceC819210WBr<Context> LIZ;
                public final InterfaceC819210WBr<C0WEB> LIZIZ;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    final Context context2 = this.LIZ.get();
                    final C0WEB c0web = this.LIZIZ.get();
                    return new InterfaceC819450WCp(context2, c0web) { // from class: X.0WEC
                        public final C2412909ct LIZ;
                        public final C0WEB LIZIZ;
                        public final Map<String, InterfaceC819390WCj> LIZJ;

                        @Override // X.InterfaceC819450WCp
                        public final synchronized InterfaceC819390WCj get(final String str) {
                            if (((HashMap) this.LIZJ).containsKey(str)) {
                                return (InterfaceC819390WCj) ((HashMap) this.LIZJ).get(str);
                            }
                            C0WEF c0wefLIZ = this.LIZ.LIZ(str);
                            if (c0wefLIZ == null) {
                                return null;
                            }
                            C0WEB c0web2 = this.LIZIZ;
                            final Context context3 = c0web2.LIZ;
                            final C0WC2 c0wc2 = c0web2.LIZIZ;
                            final C0WC2 c0wc22 = c0web2.LIZJ;
                            InterfaceC819390WCj interfaceC819390WCjCreate = c0wefLIZ.create(new C0WEE(context3, c0wc2, c0wc22, str) { // from class: X.0WED
                                public final Context LIZ;
                                public final C0WC2 LIZIZ;
                                public final C0WC2 LIZJ;
                                public final String LIZLLL;

                                public final int hashCode() {
                                    return ((((((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode()) * 1000003) ^ this.LIZJ.hashCode()) * 1000003) ^ this.LIZLLL.hashCode();
                                }

                                public final String toString() {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("CreationContext{applicationContext=");
                                    sbLIZ.append(this.LIZ);
                                    sbLIZ.append(", wallClock=");
                                    sbLIZ.append(this.LIZIZ);
                                    sbLIZ.append(", monotonicClock=");
                                    sbLIZ.append(this.LIZJ);
                                    sbLIZ.append(", backendName=");
                                    sbLIZ.append(this.LIZLLL);
                                    sbLIZ.append("}");
                                    return C2188811AlT.LIZIZ(sbLIZ);
                                }

                                @Override // X.C0WEE
                                public final Context LIZ() {
                                    return this.LIZ;
                                }

                                @Override // X.C0WEE
                                public final String LIZIZ() {
                                    return this.LIZLLL;
                                }

                                @Override // X.C0WEE
                                public final C0WC2 LIZJ() {
                                    return this.LIZJ;
                                }

                                @Override // X.C0WEE
                                public final C0WC2 LIZLLL() {
                                    return this.LIZIZ;
                                }

                                public final boolean equals(Object obj) {
                                    if (obj == this) {
                                        return true;
                                    }
                                    if (!(obj instanceof C0WEE)) {
                                        return false;
                                    }
                                    C0WEE c0wee = (C0WEE) obj;
                                    if (this.LIZ.equals(c0wee.LIZ()) && this.LIZIZ.equals(c0wee.LIZLLL()) && this.LIZJ.equals(c0wee.LIZJ()) && this.LIZLLL.equals(c0wee.LIZIZ())) {
                                        return true;
                                    }
                                    return false;
                                }

                                {
                                    if (context3 != null) {
                                        this.LIZ = context3;
                                        if (c0wc2 != null) {
                                            this.LIZIZ = c0wc2;
                                            if (c0wc22 != null) {
                                                this.LIZJ = c0wc22;
                                                if (str != null) {
                                                    this.LIZLLL = str;
                                                    return;
                                                }
                                                throw new NullPointerException("Null backendName");
                                            }
                                            throw new NullPointerException("Null monotonicClock");
                                        }
                                        throw new NullPointerException("Null wallClock");
                                    }
                                    throw new NullPointerException("Null applicationContext");
                                }
                            });
                            ((HashMap) this.LIZJ).put(str, interfaceC819390WCjCreate);
                            return interfaceC819390WCjCreate;
                        }

                        {
                            C2412909ct c2412909ct = new C2412909ct(context2);
                            this.LIZJ = new HashMap();
                            this.LIZ = c2412909ct;
                            this.LIZIZ = c0web;
                        }
                    };
                }

                {
                    this.LIZ = r2;
                    this.LIZIZ = r1;
                }
            });
            final C819780WDw c819780WDw = this.LLILLJJLI;
            this.LLILZ = new C0WE2<C2211551Bh3>(c819780WDw) { // from class: X.0WDu
                public final InterfaceC819210WBr<Context> LIZ;
                public final InterfaceC819210WBr<String> LIZIZ;
                public final InterfaceC819210WBr<Integer> LIZJ;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    return new C2211551Bh3(this.LIZ.get(), this.LIZJ.get().intValue(), this.LIZIZ.get());
                }

                {
                    C819810WDz c819810WDz = C0WE6.LIZ;
                    C819790WDx c819790WDx = C0WE7.LIZ;
                    this.LIZ = c819780WDw;
                    this.LIZIZ = c819810WDz;
                    this.LIZJ = c819790WDx;
                }
            };
            final InterfaceC819210WBr interfaceC819210WBrLIZ = C819720WDq.LIZ(new C0WE2<String>(c819780WDw) { // from class: X.0WDs
                public final InterfaceC819210WBr<Context> LIZ;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    String packageName = this.LIZ.get().getPackageName();
                    if (packageName != null) {
                        return packageName;
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }

                {
                    this.LIZ = c819780WDw;
                }
            });
            final C819760WDu c819760WDu = this.LLILZ;
            final InterfaceC819210WBr<C0WCD> interfaceC819210WBrLIZ2 = C819720WDq.LIZ(new C0WE2<C0WCD>(c819760WDu, interfaceC819210WBrLIZ) { // from class: X.0WDj
                public final InterfaceC819210WBr<C0WC2> LIZ;
                public final InterfaceC819210WBr<C0WC2> LIZIZ;
                public final InterfaceC819210WBr<AbstractC819510WCv> LIZJ;
                public final InterfaceC819210WBr<C2211551Bh3> LIZLLL;
                public final InterfaceC819210WBr<String> LJ;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    C0WC2 c0wc2 = this.LIZ.get();
                    C0WC2 c0wc22 = this.LIZIZ.get();
                    AbstractC819510WCv abstractC819510WCv = this.LIZJ.get();
                    return new C0WCD(c0wc2, c0wc22, abstractC819510WCv, this.LIZLLL.get(), this.LJ);
                }

                {
                    C0WE0 c0we0 = C0WE9.LIZ;
                    C0WE1 c0we1 = C0WEA.LIZ;
                    C819640WDi c819640WDi = C0WE8.LIZ;
                    this.LIZ = c0we0;
                    this.LIZIZ = c0we1;
                    this.LIZJ = c819640WDi;
                    this.LIZLLL = c819760WDu;
                    this.LJ = interfaceC819210WBrLIZ;
                }
            });
            this.LLILZIL = interfaceC819210WBrLIZ2;
            final ?? r0 = new C0WE2<AbstractC819560WDa>() { // from class: X.0WDf
                public final InterfaceC819210WBr<C0WC2> LIZ = C0WE9.LIZ;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    C0WC2 c0wc2 = this.LIZ.get();
                    C819630WDh c819630WDh = new C819630WDh();
                    EnumC816340W0q enumC816340W0q = EnumC816340W0q.DEFAULT;
                    C819620WDg c819620WDg = new C819620WDg();
                    Set<EnumC819580WDc> setEmptySet = Collections.emptySet();
                    if (setEmptySet == null) {
                        throw new NullPointerException("Null flags");
                    }
                    c819620WDg.LIZJ = setEmptySet;
                    c819620WDg.LIZ = 30000L;
                    c819620WDg.LIZIZ = 86400000L;
                    ((HashMap) c819630WDh.LIZIZ).put(enumC816340W0q, c819620WDg.LIZ());
                    EnumC816340W0q enumC816340W0q2 = EnumC816340W0q.HIGHEST;
                    C819620WDg c819620WDg2 = new C819620WDg();
                    Set<EnumC819580WDc> setEmptySet2 = Collections.emptySet();
                    if (setEmptySet2 == null) {
                        throw new NullPointerException("Null flags");
                    }
                    c819620WDg2.LIZJ = setEmptySet2;
                    c819620WDg2.LIZ = 1000L;
                    c819620WDg2.LIZIZ = 86400000L;
                    ((HashMap) c819630WDh.LIZIZ).put(enumC816340W0q2, c819620WDg2.LIZ());
                    EnumC816340W0q enumC816340W0q3 = EnumC816340W0q.VERY_LOW;
                    C819620WDg c819620WDg3 = new C819620WDg();
                    Set<EnumC819580WDc> setEmptySet3 = Collections.emptySet();
                    if (setEmptySet3 == null) {
                        throw new NullPointerException("Null flags");
                    }
                    c819620WDg3.LIZJ = setEmptySet3;
                    c819620WDg3.LIZ = 86400000L;
                    c819620WDg3.LIZIZ = 86400000L;
                    Set<EnumC819580WDc> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC819580WDc.DEVICE_IDLE)));
                    if (setUnmodifiableSet == null) {
                        throw new NullPointerException("Null flags");
                    }
                    c819620WDg3.LIZJ = setUnmodifiableSet;
                    ((HashMap) c819630WDh.LIZIZ).put(enumC816340W0q3, c819620WDg3.LIZ());
                    c819630WDh.LIZ = c0wc2;
                    if (c0wc2 == null) {
                        throw new NullPointerException("missing required property: clock");
                    }
                    if (((HashMap) c819630WDh.LIZIZ).keySet().size() < EnumC816340W0q.values().length) {
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                    Map<EnumC816340W0q, AbstractC819590WDd> map = c819630WDh.LIZIZ;
                    c819630WDh.LIZIZ = new HashMap();
                    return new AbstractC819560WDa(c819630WDh.LIZ, map) { // from class: X.0WDb
                        public final C0WC2 LIZ;
                        public final Map<EnumC816340W0q, AbstractC819590WDd> LIZIZ;

                        public final int hashCode() {
                            return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("SchedulerConfig{clock=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", values=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append("}");
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        @Override // X.AbstractC819560WDa
                        public final C0WC2 LIZIZ() {
                            return this.LIZ;
                        }

                        @Override // X.AbstractC819560WDa
                        public final Map<EnumC816340W0q, AbstractC819590WDd> LIZLLL() {
                            return this.LIZIZ;
                        }

                        public final boolean equals(Object obj) {
                            if (obj == this) {
                                return true;
                            }
                            if (!(obj instanceof AbstractC819560WDa)) {
                                return false;
                            }
                            AbstractC819560WDa abstractC819560WDa = (AbstractC819560WDa) obj;
                            if (this.LIZ.equals(abstractC819560WDa.LIZIZ()) && this.LIZIZ.equals(abstractC819560WDa.LIZLLL())) {
                                return true;
                            }
                            return false;
                        }

                        {
                            if (c0wc2 != null) {
                                this.LIZ = c0wc2;
                                if (map != null) {
                                    this.LIZIZ = map;
                                    return;
                                }
                                throw new NullPointerException("Null values");
                            }
                            throw new NullPointerException("Null clock");
                        }
                    };
                }
            };
            final C819780WDw c819780WDw2 = this.LLILLJJLI;
            final ?? r8 = new C0WE2<InterfaceC819440WCo>(c819780WDw2, interfaceC819210WBrLIZ2, r0) { // from class: X.0WDn
                public final InterfaceC819210WBr<Context> LIZ;
                public final InterfaceC819210WBr<C0WCP> LIZIZ;
                public final InterfaceC819210WBr<AbstractC819560WDa> LIZJ;
                public final InterfaceC819210WBr<C0WC2> LIZLLL;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    Context context2 = this.LIZ.get();
                    C0WCP c0wcp = this.LIZIZ.get();
                    AbstractC819560WDa abstractC819560WDa = this.LIZJ.get();
                    this.LIZLLL.get();
                    return new InterfaceC819440WCo(context2, c0wcp, abstractC819560WDa) { // from class: X.0W0n
                        public final Context LIZ;
                        public final C0WCP LIZIZ;
                        public final AbstractC819560WDa LIZJ;

                        @Override // X.InterfaceC819440WCo
                        public final void LIZ(AbstractC818550W9d abstractC818550W9d, int i) {
                            try {
                                LIZIZ(abstractC818550W9d, i, false);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }

                        {
                            this.LIZ = context2;
                            this.LIZIZ = c0wcp;
                            this.LIZJ = abstractC819560WDa;
                        }

                        @Override // X.InterfaceC819440WCo
                        public final void LIZIZ(AbstractC818550W9d abstractC818550W9d, int i, boolean z) {
                            long jCurrentTimeMillis;
                            if (((Boolean) C818540W9c.LIZIZ.getValue()).booleanValue()) {
                                try {
                                    Context context3 = this.LIZ;
                                    C0WCP c0wcp2 = this.LIZIZ;
                                    AbstractC819560WDa abstractC819560WDa2 = this.LIZJ;
                                    int iLIZIZ = C816300W0m.LIZIZ(context3, abstractC818550W9d);
                                    if (((Boolean) C818540W9c.LIZJ.getValue()).booleanValue() && iLIZIZ != -565107062 && iLIZIZ != 190064389) {
                                        LIZJ(abstractC818550W9d, i, z);
                                        return;
                                    }
                                    long jLJJJLZIJ = c0wcp2.LJJJLZIJ(abstractC818550W9d);
                                    if (jLJJJLZIJ == 0) {
                                        jCurrentTimeMillis = 900000;
                                    } else {
                                        jCurrentTimeMillis = jLJJJLZIJ - System.currentTimeMillis();
                                    }
                                    JobInfo jobInfoLIZ = C816300W0m.LIZ(abstractC818550W9d, i, z, context3, abstractC819560WDa2, iLIZIZ);
                                    if (jobInfoLIZ == null) {
                                        LIZJ(abstractC818550W9d, i, z);
                                        return;
                                    } else {
                                        Timer timer = new Timer();
                                        timer.schedule(new C0W9W(context3, iLIZIZ, jobInfoLIZ, timer) { // from class: X.0W0O
                                            public final Context LL;
                                            public final int LLILLJJLI;
                                            public final JobInfo LLILLL;
                                            public final Timer LLILZ;

                                            @Override // java.util.TimerTask, java.lang.Runnable
                                            public final void run() {
                                                C1C7U.LIZ("CustomJobInfoSchedulerTimer@a1f5.run");
                                                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                                                try {
                                                    C816300W0m.LIZLLL(this.LL, String.valueOf(this.LLILLJJLI), this.LLILLL);
                                                    this.LLILZ.cancel();
                                                } finally {
                                                }
                                                if (zLJ) {
                                                    C0W9U.LJFF();
                                                }
                                                C1C7U.LIZIZ("CustomJobInfoSchedulerTimer@a1f5.run");
                                            }

                                            {
                                                this.LL = context3;
                                                this.LLILLJJLI = iLIZIZ;
                                                this.LLILLL = jobInfoLIZ;
                                                this.LLILZ = timer;
                                            }
                                        }, jCurrentTimeMillis);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    return;
                                }
                            }
                            if (((Boolean) C818540W9c.LIZLLL.getValue()).booleanValue()) {
                                Context context4 = this.LIZ;
                                ComponentName componentName = new ComponentName(context4, (Class<?>) SubJobInfoSchedulerService.class);
                                JobScheduler jobScheduler = (JobScheduler) C786410Ut5.H2(context4, "jobscheduler");
                                int iLIZIZ2 = C816300W0m.LIZIZ(context4, abstractC818550W9d);
                                boolean zLIZJ = C816300W0m.LIZJ(jobScheduler, iLIZIZ2, i);
                                if (!z && zLIZJ) {
                                    C1894007bO.LIZ("JobInfoScheduler");
                                    return;
                                }
                                long jLJJJLZIJ2 = this.LIZIZ.LJJJLZIJ(abstractC818550W9d);
                                AbstractC819560WDa abstractC819560WDa3 = this.LIZJ;
                                JobInfo.Builder builder = new JobInfo.Builder(iLIZIZ2, componentName);
                                abstractC819560WDa3.LIZ(builder, abstractC818550W9d.LIZLLL(), jLJJJLZIJ2, i);
                                PersistableBundle persistableBundle = new PersistableBundle();
                                persistableBundle.putInt("attemptNumber", i);
                                persistableBundle.putString("backendName", abstractC818550W9d.LIZIZ());
                                persistableBundle.putInt("priority", C816330W0p.LIZ(abstractC818550W9d.LIZLLL()));
                                if (abstractC818550W9d.LIZJ() != null) {
                                    persistableBundle.putString("extras", Base64.encodeToString(abstractC818550W9d.LIZJ(), 0));
                                }
                                builder.setExtras(persistableBundle);
                                abstractC819560WDa3.LIZJ(abstractC818550W9d.LIZLLL(), jLJJJLZIJ2, i);
                                C1894007bO.LIZ("JobInfoScheduler");
                                jobScheduler.schedule(builder.build());
                                return;
                            }
                            LIZJ(abstractC818550W9d, i, z);
                        }

                        public final void LIZJ(AbstractC818550W9d abstractC818550W9d, int i, boolean z) {
                            ComponentName componentName = new ComponentName(this.LIZ, (Class<?>) JobInfoSchedulerService.class);
                            JobScheduler jobScheduler = (JobScheduler) C786410Ut5.H2(this.LIZ, "jobscheduler");
                            Adler32 adler32 = new Adler32();
                            adler32.update(this.LIZ.getPackageName().getBytes(Charset.forName("UTF-8")));
                            adler32.update(abstractC818550W9d.LIZIZ().getBytes(Charset.forName("UTF-8")));
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                            byteBufferAllocate.putInt(C816330W0p.LIZ(abstractC818550W9d.LIZLLL()));
                            adler32.update(byteBufferAllocate.array());
                            if (abstractC818550W9d.LIZJ() != null) {
                                adler32.update(abstractC818550W9d.LIZJ());
                            }
                            int value = (int) adler32.getValue();
                            if (!z) {
                                Iterator<JobInfo> it2 = jobScheduler.getAllPendingJobs().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    JobInfo next = it2.next();
                                    int i2 = next.getExtras().getInt("attemptNumber");
                                    if (next.getId() == value) {
                                        if (i2 >= i) {
                                            C1894007bO.LIZ("JobInfoScheduler");
                                            return;
                                        }
                                    }
                                }
                            }
                            long jLJJJLZIJ = this.LIZIZ.LJJJLZIJ(abstractC818550W9d);
                            AbstractC819560WDa abstractC819560WDa2 = this.LIZJ;
                            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
                            abstractC819560WDa2.LIZ(builder, abstractC818550W9d.LIZLLL(), jLJJJLZIJ, i);
                            PersistableBundle persistableBundle = new PersistableBundle();
                            persistableBundle.putInt("attemptNumber", i);
                            persistableBundle.putString("backendName", abstractC818550W9d.LIZIZ());
                            persistableBundle.putInt("priority", C816330W0p.LIZ(abstractC818550W9d.LIZLLL()));
                            if (abstractC818550W9d.LIZJ() != null) {
                                persistableBundle.putString("extras", Base64.encodeToString(abstractC818550W9d.LIZJ(), 0));
                            }
                            builder.setExtras(persistableBundle);
                            this.LIZJ.LIZJ(abstractC818550W9d.LIZLLL(), jLJJJLZIJ, i);
                            C1894007bO.LIZ("JobInfoScheduler");
                            jobScheduler.schedule(builder.build());
                        }
                    };
                }

                {
                    C0WE1 c0we1 = C0WEA.LIZ;
                    this.LIZ = c819780WDw2;
                    this.LIZIZ = interfaceC819210WBrLIZ2;
                    this.LIZJ = r0;
                    this.LIZLLL = c0we1;
                }
            };
            final InterfaceC819210WBr<Executor> interfaceC819210WBr = this.LL;
            final InterfaceC819210WBr interfaceC819210WBr2 = this.LLILLL;
            final ?? r12 = new C0WE2<C0WCY>(interfaceC819210WBr, interfaceC819210WBr2, r8, interfaceC819210WBrLIZ2, interfaceC819210WBrLIZ2) { // from class: X.0WDo
                public final InterfaceC819210WBr<Executor> LIZ;
                public final InterfaceC819210WBr<InterfaceC819450WCp> LIZIZ;
                public final InterfaceC819210WBr<InterfaceC819440WCo> LIZJ;
                public final InterfaceC819210WBr<C0WCP> LIZLLL;
                public final InterfaceC819210WBr<C0WCM> LJ;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    return new C0WCY(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get(), this.LJ.get());
                }

                {
                    this.LIZ = interfaceC819210WBr;
                    this.LIZIZ = interfaceC819210WBr2;
                    this.LIZJ = r8;
                    this.LIZLLL = interfaceC819210WBrLIZ2;
                    this.LJ = interfaceC819210WBrLIZ2;
                }
            };
            final ?? r4 = new C0WE2<C0WCW>(c819780WDw2, interfaceC819210WBr2, interfaceC819210WBrLIZ2, r8, interfaceC819210WBr, interfaceC819210WBrLIZ2, interfaceC819210WBrLIZ2) { // from class: X.0WDk
                public final InterfaceC819210WBr<Context> LIZ;
                public final InterfaceC819210WBr<InterfaceC819450WCp> LIZIZ;
                public final InterfaceC819210WBr<C0WCP> LIZJ;
                public final InterfaceC819210WBr<InterfaceC819440WCo> LIZLLL;
                public final InterfaceC819210WBr<Executor> LJ;
                public final InterfaceC819210WBr<C0WCM> LJFF;
                public final InterfaceC819210WBr<C0WC2> LJI;
                public final InterfaceC819210WBr<C0WC2> LJII;
                public final InterfaceC819210WBr<InterfaceC819420WCm> LJIIIIZZ;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    return new C0WCW(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get(), this.LJ.get(), this.LJFF.get(), this.LJI.get(), this.LJII.get(), this.LJIIIIZZ.get());
                }

                {
                    C0WE0 c0we0 = C0WE9.LIZ;
                    C0WE1 c0we1 = C0WEA.LIZ;
                    this.LIZ = c819780WDw2;
                    this.LIZIZ = interfaceC819210WBr2;
                    this.LIZJ = interfaceC819210WBrLIZ2;
                    this.LIZLLL = r8;
                    this.LJ = interfaceC819210WBr;
                    this.LJFF = interfaceC819210WBrLIZ2;
                    this.LJI = c0we0;
                    this.LJII = c0we1;
                    this.LJIIIIZZ = interfaceC819210WBrLIZ2;
                }
            };
            final ?? r13 = new C0WE2<C0WCQ>(interfaceC819210WBr, interfaceC819210WBrLIZ2, r8, interfaceC819210WBrLIZ2) { // from class: X.0WDp
                public final InterfaceC819210WBr<Executor> LIZ;
                public final InterfaceC819210WBr<C0WCP> LIZIZ;
                public final InterfaceC819210WBr<InterfaceC819440WCo> LIZJ;
                public final InterfaceC819210WBr<C0WCM> LIZLLL;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    return new C0WCQ(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                }

                {
                    this.LIZ = interfaceC819210WBr;
                    this.LIZIZ = interfaceC819210WBrLIZ2;
                    this.LIZJ = r8;
                    this.LIZLLL = interfaceC819210WBrLIZ2;
                }
            };
            this.LLILZLL = C819720WDq.LIZ(new C0WE2<C819200WBq>(r12, r4, r13) { // from class: X.0WDl
                public final InterfaceC819210WBr<C0WC2> LIZ;
                public final InterfaceC819210WBr<C0WC2> LIZIZ;
                public final InterfaceC819210WBr<InterfaceC819290WBz> LIZJ;
                public final InterfaceC819210WBr<C0WCW> LIZLLL;
                public final InterfaceC819210WBr<C0WCQ> LJ;

                @Override // X.InterfaceC819210WBr
                public final Object get() {
                    return new C819200WBq(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get(), this.LJ.get());
                }

                {
                    C0WE0 c0we0 = C0WE9.LIZ;
                    C0WE1 c0we1 = C0WEA.LIZ;
                    this.LIZ = c0we0;
                    this.LIZIZ = c0we1;
                    this.LIZJ = r12;
                    this.LIZLLL = r4;
                    this.LJ = r13;
                }
            });
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
