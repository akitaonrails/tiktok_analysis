package X;

import Y.ARunnableS36S1200000_34;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.segment.SegmentApplyException;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.1B7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199711B7h implements InterfaceC2200001B8k {
    public final DownloadInfo LIZ;
    public final C1B8E LIZIZ;
    public final C1B89 LIZJ;
    public final InterfaceC2200111B8v LIZLLL;
    public final C2199731B7j LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public C2199861B7w LJIIIZ;
    public C2199861B7w LJIIJ;
    public long LJIIL;
    public int LJIILL;
    public BaseException LJIILLIIL;
    public final C1B8H LJIJ;
    public final C1700040uLC LJIJI;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public float LJJI;
    public int LJJIFFI;
    public final boolean LJJII;
    public final List<RunnableC2199701B7g> LJII = new ArrayList();
    public final List<C2199791B7p> LJIIIIZZ = new ArrayList();
    public volatile boolean LJIIJJI = true;
    public final LinkedList<C2199811B7r> LJIILIIL = new LinkedList<>();
    public final List<C2199811B7r> LJIILJJIL = new ArrayList();
    public final Object LJIIZILJ = new Object();
    public volatile boolean LJIJJ = false;
    public final C1B81 LJJIII = new InterfaceC1700050uLD() { // from class: X.1B81
        public int LIZ;

        @Override // X.InterfaceC1700050uLD
        public final long LIZ() {
            if (this.LIZIZ.LJFF || this.LIZIZ.LJI) {
                return -1L;
            }
            synchronized (this.LIZIZ) {
                try {
                    C2199711B7h c2199711B7h = this.LIZIZ;
                    if (c2199711B7h.LJIIIZ != null || c2199711B7h.LJIIJ != null) {
                        return -1L;
                    }
                    long j = c2199711B7h.LJIJJLI;
                    if (j <= 0) {
                        return -1L;
                    }
                    this.LIZ++;
                    RunnableC2199701B7g runnableC2199701B7gLJIIL = c2199711B7h.LJIIL(System.currentTimeMillis(), j, false);
                    if (runnableC2199701B7gLJIIL == null) {
                        return j;
                    }
                    if (C1490830otl.LIZ()) {
                        C1490830otl.LIZLLL(this.LIZIZ.LIZ.getId(), "SegmentDispatcher", "onScheduleWatch", "connectWatcher: switchUrl and reconnect");
                    }
                    this.LIZIZ.LJJIIZI(runnableC2199701B7gLJIIL);
                    runnableC2199701B7gLJIIL.LJIIJJI(false);
                    return ((long) ((this.LIZ / ((ArrayList) this.LIZIZ.LJIIIIZZ).size()) + 1)) * j;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    };
    public final C1B88 LJJIIJ = new InterfaceC1700050uLD() { // from class: X.1B88
        @Override // X.InterfaceC1700050uLD
        public final long LIZ() {
            C2199711B7h c2199711B7h = this.LIZ;
            if (c2199711B7h.LJFF || c2199711B7h.LJI) {
                return -1L;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (c2199711B7h) {
                try {
                    c2199711B7h.LJIL(jCurrentTimeMillis);
                    long jOptInt = c2199711B7h.LIZIZ.LIZ.optInt("read_timeout", -1);
                    if (jOptInt >= 4000 && jOptInt > 0) {
                        long j = c2199711B7h.LJJ;
                        if (j > 0 && jCurrentTimeMillis - j > jOptInt && c2199711B7h.LJIILJJIL(jCurrentTimeMillis, jOptInt)) {
                            c2199711B7h.LJJ = jCurrentTimeMillis;
                            c2199711B7h.LJJIFFI++;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return 2000L;
        }
    };

    public final C2199791B7p LJJI() {
        C2199791B7p c2199791B7p;
        synchronized (this) {
            try {
                int size = this.LJIILL % ((ArrayList) this.LJIIIIZZ).size();
                if (this.LIZIZ.LIZ.optInt("url_balance", 2) > 0) {
                    this.LJIILL++;
                }
                c2199791B7p = (C2199791B7p) ((ArrayList) this.LJIIIIZZ).get(size);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c2199791B7p;
    }

    public final void LJIIIIZZ() {
        int size;
        if (this.LJIIL > 0 && (size = ((ArrayList) this.LJIILJJIL).size()) > 1) {
            ArrayList arrayList = null;
            int i = 0;
            for (int i2 = 1; i2 < size; i2++) {
                C2199811B7r c2199811B7r = (C2199811B7r) ListProtector.get(this.LJIILJJIL, i);
                C2199811B7r c2199811B7r2 = (C2199811B7r) ListProtector.get(this.LJIILJJIL, i2);
                if (c2199811B7r.LIZIZ() > c2199811B7r2.LIZ && c2199811B7r2.LIZJ() <= 0 && c2199811B7r2.LJFF == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(c2199811B7r2);
                    if (this.LJJII && C1490830otl.LIZ()) {
                        int id = this.LIZ.getId();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("covered = ");
                        sbLIZ.append(c2199811B7r2);
                        sbLIZ.append(", prev = ");
                        sbLIZ.append(c2199811B7r);
                        C1490830otl.LIZLLL(id, "SegmentDispatcher", "clearCoveredSegmentLocked", C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (c2199811B7r2.LIZIZ() > c2199811B7r.LIZIZ()) {
                    i++;
                }
            }
            if (arrayList != null) {
                for (Object obj : arrayList) {
                    ((ArrayList) this.LJIILJJIL).remove(obj);
                    for (RunnableC2199701B7g runnableC2199701B7g : (ArrayList) this.LJII) {
                        if (runnableC2199701B7g.LLIZLLLIL == obj) {
                            if (this.LJJII && C1490830otl.LIZ()) {
                                int id2 = this.LIZ.getId();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("reconnect, segment = ");
                                sbLIZ2.append(obj);
                                sbLIZ2.append(", threadIndex = ");
                                sbLIZ2.append(runnableC2199701B7g.LLJJIJIL);
                                C1490830otl.LIZLLL(id2, "SegmentDispatcher", "clearCoveredSegmentLocked", C2188811AlT.LIZIZ(sbLIZ2));
                            }
                            runnableC2199701B7g.LJIIJJI(true);
                        }
                    }
                }
            }
        }
    }

    public final void LJIIJ() {
        int i;
        if (this.LJIIL <= 0 || this.LJIIJJI) {
            i = 1;
        } else {
            C1B8E c1b8e = this.LIZIZ;
            i = c1b8e.LIZIZ;
            long j = this.LJIIL;
            long jOptInt = ((long) c1b8e.LIZ.optInt("segment_min_init_mb", 10)) * 1048576;
            if (jOptInt < 5242880) {
                jOptInt = 5242880;
            }
            int i2 = (int) (j / jOptInt);
            if (i > i2) {
                i = i2;
            }
        }
        if (C1490830otl.LIZ()) {
            int id = this.LIZ.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TotalLength = ");
            sbLIZ.append(this.LJIIL);
            sbLIZ.append(", threadCount = ");
            sbLIZ.append(i);
            C1490830otl.LIZLLL(id, "SegmentDispatcher", "dispatchReadThread", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i <= 0) {
            i = 1;
        }
        synchronized (this) {
            while (((ArrayList) this.LJII).size() < i) {
                try {
                    if (this.LJI || this.LJFF) {
                        return;
                    }
                    LJIIJJI(LJJI());
                    if (this.LIZIZ.LIZ.optInt("segment_mode", 1) == 0) {
                        break;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJIIZILJ() {
        List<String> backUpUrls;
        int iOptInt = this.LIZIZ.LIZ.optInt("ip_strategy", 0);
        if (iOptInt <= 0) {
            this.LJIIJJI = false;
            LJIIJ();
            return;
        }
        final C2199871B7x c2199871B7x = C1B8Y.LIZ;
        final String url = this.LIZ.getUrl();
        C786410Ut5.LJJZZIII(c2199871B7x.LIZIZ, new Runnable() { // from class: X.1B7s
            public final /* synthetic */ long LLILLL = 2000;

            public final void LIZ() {
                C1B8K c1b8k;
                List<InetAddress> listLIZ;
                C2199871B7x c2199871B7x2 = c2199871B7x;
                String str = url;
                InterfaceC2200001B8k interfaceC2200001B8k = this;
                long j = this.LLILLL;
                c2199871B7x2.getClass();
                try {
                    String host = UriProtector.parse(str).getHost();
                    synchronized (c2199871B7x2.LIZ) {
                        try {
                            c1b8k = c2199871B7x2.LIZ.get(host);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    if (c1b8k != null) {
                        if (System.currentTimeMillis() - c1b8k.LIZIZ < C2199751B7l.LJFF.LJIIIIZZ("dns_expire_min", 10) * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
                            if (interfaceC2200001B8k != null) {
                                ((C2199711B7h) interfaceC2200001B8k).LJJII(str, c1b8k.LIZ);
                                return;
                            }
                            return;
                        }
                    }
                    ARunnableS36S1200000_34 aRunnableS36S1200000_34 = new ARunnableS36S1200000_34(c1b8k, str, interfaceC2200001B8k, 3);
                    C786410Ut5.LJLIIL(j, c2199871B7x2.LIZJ, aRunnableS36S1200000_34);
                    if (C2199751B7l.LJFF.LJIIIIZZ("use_host_dns", 1) == 1) {
                        Context context = C2199681B7e.LIZ;
                    }
                    try {
                        ((C1B8U) C2199681B7e.LJIIIIZZ()).getClass();
                        listLIZ = InterfaceC1487320oo6.LIZ.LIZ(host);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        listLIZ = null;
                    }
                    if (listLIZ != null && !listLIZ.isEmpty()) {
                        c2199871B7x2.LIZ(host, listLIZ);
                    } else if (c1b8k != null) {
                        listLIZ = c1b8k.LIZ;
                    }
                    c2199871B7x2.LIZJ.removeCallbacks(aRunnableS36S1200000_34);
                    if (interfaceC2200001B8k != null) {
                        ((C2199711B7h) interfaceC2200001B8k).LJJII(str, listLIZ);
                    }
                } catch (Throwable th2) {
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DownloadDnsManager@9b19.resolveDnsAsync$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DownloadDnsManager@9b19.resolveDnsAsync$1");
            }
        });
        if (iOptInt <= 2 || (backUpUrls = this.LIZ.getBackUpUrls()) == null) {
            return;
        }
        for (final String str : backUpUrls) {
            if (!TextUtils.isEmpty(str)) {
                C786410Ut5.LJJZZIII(c2199871B7x.LIZIZ, new Runnable() { // from class: X.1B7s
                    public final /* synthetic */ long LLILLL = 2000;

                    public final void LIZ() {
                        C1B8K c1b8k;
                        List<InetAddress> listLIZ;
                        C2199871B7x c2199871B7x2 = c2199871B7x;
                        String str2 = str;
                        InterfaceC2200001B8k interfaceC2200001B8k = this;
                        long j = this.LLILLL;
                        c2199871B7x2.getClass();
                        try {
                            String host = UriProtector.parse(str2).getHost();
                            synchronized (c2199871B7x2.LIZ) {
                                try {
                                    c1b8k = c2199871B7x2.LIZ.get(host);
                                } finally {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                            if (c1b8k != null) {
                                if (System.currentTimeMillis() - c1b8k.LIZIZ < C2199751B7l.LJFF.LJIIIIZZ("dns_expire_min", 10) * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
                                    if (interfaceC2200001B8k != null) {
                                        ((C2199711B7h) interfaceC2200001B8k).LJJII(str2, c1b8k.LIZ);
                                        return;
                                    }
                                    return;
                                }
                            }
                            ARunnableS36S1200000_34 aRunnableS36S1200000_34 = new ARunnableS36S1200000_34(c1b8k, str2, interfaceC2200001B8k, 3);
                            C786410Ut5.LJLIIL(j, c2199871B7x2.LIZJ, aRunnableS36S1200000_34);
                            if (C2199751B7l.LJFF.LJIIIIZZ("use_host_dns", 1) == 1) {
                                Context context = C2199681B7e.LIZ;
                            }
                            try {
                                ((C1B8U) C2199681B7e.LJIIIIZZ()).getClass();
                                listLIZ = InterfaceC1487320oo6.LIZ.LIZ(host);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                listLIZ = null;
                            }
                            if (listLIZ != null && !listLIZ.isEmpty()) {
                                c2199871B7x2.LIZ(host, listLIZ);
                            } else if (c1b8k != null) {
                                listLIZ = c1b8k.LIZ;
                            }
                            c2199871B7x2.LIZJ.removeCallbacks(aRunnableS36S1200000_34);
                            if (interfaceC2200001B8k != null) {
                                ((C2199711B7h) interfaceC2200001B8k).LJJII(str2, listLIZ);
                            }
                        } catch (Throwable th2) {
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DownloadDnsManager@9b19.resolveDnsAsync$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DownloadDnsManager@9b19.resolveDnsAsync$1");
                    }
                });
            }
        }
    }

    public final void LJIJI() {
        ((ArrayList) this.LJIIIIZZ).add(new C2199791B7p(this.LIZ.getUrl(), true));
        List<String> backUpUrls = this.LIZ.getBackUpUrls();
        if (backUpUrls != null) {
            for (String str : backUpUrls) {
                if (!TextUtils.isEmpty(str)) {
                    ((ArrayList) this.LJIIIIZZ).add(new C2199791B7p(str, false));
                }
            }
        }
        this.LIZIZ.LIZ(((ArrayList) this.LJIIIIZZ).size());
    }

    public final void LJIJJ() {
        C1B8E c1b8e = this.LIZIZ;
        long jOptInt = c1b8e.LIZ.optInt("connect_timeout", -1);
        if (jOptInt < 2000) {
            jOptInt = -1;
        }
        this.LJIJJLI = jOptInt;
        long jOptInt2 = c1b8e.LIZ.optInt("read_timeout", -1);
        this.LJIL = jOptInt2 >= 4000 ? jOptInt2 : -1L;
        this.LJJI = Math.min(Math.max(0.0f, (float) c1b8e.LIZ.optDouble("poor_speed_ratio", 0.0d)), 1.0f);
        int i = this.LJJIFFI;
        if (i > 0) {
            this.LJIJI.LIZ(this.LJJIII, i);
        }
    }

    public final boolean LJIJJLI() {
        long j = this.LJIIL;
        long jLIZIZ = 0;
        if (j <= 0) {
            return false;
        }
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) this.LJIILJJIL;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C2199811B7r c2199811B7r = (C2199811B7r) ListProtector.get(arrayList, i);
                    if (c2199811B7r.LIZ > jLIZIZ) {
                        break;
                    }
                    if (c2199811B7r.LIZIZ() > jLIZIZ) {
                        jLIZIZ = c2199811B7r.LIZIZ();
                    }
                }
                if (C1490830otl.LIZ()) {
                    int id = this.LIZ.getId();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FirstOffset: ");
                    sbLIZ.append(jLIZIZ);
                    C1490830otl.LIZLLL(id, "SegmentDispatcher", "isAllContentDownloaded", C2188811AlT.LIZIZ(sbLIZ));
                }
                return jLIZIZ >= j;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL() throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199711B7h.LJJIJIIJIL():void");
    }

    public final void LJFF() {
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "cancel", "Run");
        }
        this.LJFF = true;
        synchronized (this) {
            try {
                Iterator it2 = ((ArrayList) this.LJII).iterator();
                while (it2.hasNext()) {
                    ((RunnableC2199701B7g) it2.next()).LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C2199731B7j c2199731B7j = this.LJ;
        c2199731B7j.LJIIJ = true;
        c2199731B7j.LJIIIIZZ = true;
        this.LIZJ.LIZIZ();
    }

    public final void LJJIFFI() {
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "onComplete", "Run");
        }
        this.LIZJ.LIZIZ();
        synchronized (this.LJIIZILJ) {
            try {
                this.LJIIZILJ.notify();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIIZ() {
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "pause", "Run");
        }
        this.LJI = true;
        synchronized (this) {
            try {
                Iterator it2 = ((ArrayList) this.LJII).iterator();
                while (it2.hasNext()) {
                    ((RunnableC2199701B7g) it2.next()).LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C2199731B7j c2199731B7j = this.LJ;
        c2199731B7j.LJIIIZ = true;
        c2199731B7j.LJIIIIZZ = true;
        this.LIZJ.LIZIZ();
    }

    public final void LJI(List<C2199811B7r> list) {
        long j;
        long jLIZ;
        long totalBytes = 0;
        loop0: while (true) {
            j = -1;
            jLIZ = -1;
            for (C2199811B7r c2199811B7r : list) {
                if (j == -1) {
                    if (c2199811B7r.LIZJ() > 0) {
                        j = c2199811B7r.LIZ;
                        jLIZ = c2199811B7r.LIZ();
                    }
                } else if (c2199811B7r.LIZ <= jLIZ) {
                    if (c2199811B7r.LIZ() > jLIZ) {
                        jLIZ = c2199811B7r.LIZ();
                    }
                } else {
                    totalBytes += jLIZ - j;
                    if (c2199811B7r.LIZJ() > 0) {
                        j = c2199811B7r.LIZ;
                        jLIZ = c2199811B7r.LIZ();
                    }
                }
            }
        }
        if (j >= 0 && jLIZ > j) {
            totalBytes += jLIZ - j;
        }
        if (C1490830otl.LIZ()) {
            int id = this.LIZ.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GetCurBytes = ");
            sbLIZ.append(this.LIZ.getCurBytes());
            sbLIZ.append(", totalBytes = ");
            sbLIZ.append(this.LIZ.getTotalBytes());
            sbLIZ.append(", downloadedBytes = ");
            sbLIZ.append(totalBytes);
            C1490830otl.LIZLLL(id, "SegmentDispatcher", "checkDownloadedBytesLocked", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (totalBytes > this.LIZ.getTotalBytes() && this.LIZ.getTotalBytes() > 0) {
            totalBytes = this.LIZ.getTotalBytes();
        }
        if (this.LIZ.getCurBytes() != this.LIZ.getTotalBytes() && this.LIZ.getCurBytes() != totalBytes) {
            this.LIZ.setCurBytes(totalBytes);
        }
    }

    public final C1B8N LJIIIZ(C2199811B7r c2199811B7r) {
        C1B8N c1b8n;
        synchronized (this) {
            try {
                C2199831B7t c2199831B7t = new C2199831B7t(this.LIZ, this.LIZJ, c2199811B7r);
                this.LJ.LIZ(c2199831B7t);
                c1b8n = c2199831B7t.LIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1b8n;
    }

    public final void LJIIJJI(C2199791B7p c2199791B7p) {
        RunnableC2199701B7g runnableC2199701B7g = new RunnableC2199701B7g(this.LIZ, this, this.LIZJ, c2199791B7p, ((ArrayList) this.LJII).size());
        ((ArrayList) this.LJII).add(runnableC2199701B7g);
        if (C2199681B7e.LJIILLIIL == null) {
            synchronized (C2199681B7e.class) {
                try {
                    if (C2199681B7e.LJIILLIIL == null) {
                        int i = C2199681B7e.LJJIJIL;
                        C822650WOx c822650WOx = new C822650WOx(i, i, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C08UL("DownloadThreadPool-chunk-fixed"));
                        try {
                            c822650WOx.allowCoreThreadTimeOut(true);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        C2199681B7e.LJIILLIIL = c822650WOx;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        runnableC2199701B7g.LLJJ = C2199681B7e.LJIILLIIL.submit(runnableC2199701B7g);
    }

    public final C2199791B7p LJIILIIL(RunnableC2199701B7g runnableC2199701B7g) {
        C2199791B7p c2199791B7p;
        boolean z;
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        C2199791B7p c2199791B7p2 = null;
        while (true) {
            if (it2.hasNext()) {
                c2199791B7p = (C2199791B7p) it2.next();
                if (c2199791B7p != runnableC2199701B7g.LLJ) {
                    synchronized (c2199791B7p) {
                        z = c2199791B7p.LJI;
                    }
                    if (z) {
                        continue;
                    } else {
                        if (c2199791B7p2 == null) {
                            c2199791B7p2 = c2199791B7p;
                        }
                        if (c2199791B7p.LIZ() <= 0) {
                            break;
                        }
                    }
                }
            } else {
                c2199791B7p = null;
                break;
            }
        }
        if (this.LIZIZ.LIZ.optInt("url_balance", 2) > 0) {
            if (c2199791B7p != null) {
                return c2199791B7p;
            }
            if (this.LIZIZ.LIZ.optInt("url_balance", 2) == 1) {
                return null;
            }
        }
        return c2199791B7p2;
    }

    public final void LJIILL(List<C2199811B7r> list) {
        C2199811B7r c2199811B7r = (C2199811B7r) ListProtector.get(list, 0);
        long startOffset = this.LIZ.getStartOffset();
        if (startOffset < 0) {
            startOffset = 0;
        }
        long j = c2199811B7r.LIZ;
        if (j > startOffset) {
            C2199811B7r c2199811B7r2 = new C2199811B7r(startOffset, j - 1);
            if (C1490830otl.LIZ()) {
                int id = this.LIZ.getId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("First = ");
                sbLIZ.append(c2199811B7r);
                sbLIZ.append(", add new first = ");
                sbLIZ.append(c2199811B7r2);
                C1490830otl.LIZLLL(id, "SegmentDispatcher", "fixSegmentsLocked", C2188811AlT.LIZIZ(sbLIZ));
            }
            LIZLLL(list, c2199811B7r2, true);
        }
        Iterator<C2199811B7r> it2 = list.iterator();
        if (it2.hasNext()) {
            C2199811B7r next = it2.next();
            while (it2.hasNext()) {
                C2199811B7r next2 = it2.next();
                if (next.LIZLLL < next2.LIZ - 1) {
                    if (C1490830otl.LIZ()) {
                        int id2 = this.LIZ.getId();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Segment = ");
                        sbLIZ2.append(next);
                        sbLIZ2.append(", new end = ");
                        sbLIZ2.append(next2.LIZ - 1);
                        C1490830otl.LIZLLL(id2, "SegmentDispatcher", "fixSegmentsLocked", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    next.LJ(next2.LIZ - 1);
                }
                next = next2;
            }
        }
        C2199811B7r c2199811B7r3 = (C2199811B7r) ListProtector.get(list, ((LinkedList) list).size() - 1);
        long endOffset = this.LIZ.getEndOffset();
        if (endOffset > 0 && endOffset > startOffset) {
            c2199811B7r3.LJ(endOffset);
            return;
        }
        long totalBytes = this.LIZ.getTotalBytes();
        if (totalBytes > 0) {
            long j2 = c2199811B7r3.LIZLLL;
            if (j2 == -1 || j2 >= totalBytes - 1) {
                return;
            }
        }
        if (C1490830otl.LIZ()) {
            int id3 = this.LIZ.getId();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Last segment = ");
            sbLIZ3.append(c2199811B7r3);
            sbLIZ3.append(", new end=-1");
            C1490830otl.LIZLLL(id3, "SegmentDispatcher", "fixSegmentsLocked", C2188811AlT.LIZIZ(sbLIZ3));
        }
        c2199811B7r3.LJ(-1L);
    }

    public final long LJIILLIIL(C2199811B7r c2199811B7r) {
        long jLIZIZ;
        long j = c2199811B7r.LIZLLL;
        if (j >= c2199811B7r.LIZ) {
            jLIZIZ = (j - c2199811B7r.LIZIZ()) + 1;
            if (jLIZIZ != -1) {
                return jLIZIZ;
            }
        } else {
            jLIZIZ = -1;
        }
        long j2 = this.LJIIL;
        if (j2 > 0) {
            return j2 - c2199811B7r.LIZIZ();
        }
        return jLIZIZ;
    }

    public final void LJIJ(List<C2199811B7r> list) {
        long totalBytes = this.LIZ.getTotalBytes();
        this.LJIIL = totalBytes;
        if (totalBytes <= 0) {
            this.LJIIL = this.LIZ.getExpectFileLength();
            if (C1490830otl.LIZ()) {
                int id = this.LIZ.getId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GetExpectFileLength: ");
                sbLIZ.append(this.LJIIL);
                C1490830otl.LIZLLL(id, "SegmentDispatcher", "initSegments", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        synchronized (this) {
            try {
                this.LJIILIIL.clear();
                if (list != null && !list.isEmpty()) {
                    Iterator<C2199811B7r> it2 = list.iterator();
                    while (it2.hasNext()) {
                        LIZLLL(this.LJIILIIL, new C2199811B7r(it2.next()), false);
                    }
                    LJIILL(this.LJIILIIL);
                    LJI(this.LJIILIIL);
                } else {
                    long startOffset = this.LIZ.getStartOffset();
                    long endOffset = this.LIZ.getEndOffset();
                    if (startOffset < 0) {
                        startOffset = 0;
                    }
                    if (endOffset > 0 && endOffset < startOffset) {
                        int id2 = this.LIZ.getId();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("DownloadInfo.getEndOffset invalid, start = ");
                        sbLIZ2.append(startOffset);
                        sbLIZ2.append(", end = ");
                        sbLIZ2.append(endOffset);
                        C1490830otl.LJ(id2, "SegmentDispatcher", "initSegments", C2188811AlT.LIZIZ(sbLIZ2));
                        endOffset = -1;
                    }
                    LIZLLL(this.LJIILIIL, new C2199811B7r(startOffset, endOffset), false);
                }
                if (C1490830otl.LIZ()) {
                    C1490830otl.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "initSegments", "TotalLength: " + this.LJIIL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIL(long j) {
        this.LJIJ.LIZIZ(this.LIZ.getCurBytes(), j);
        for (RunnableC2199701B7g runnableC2199701B7g : (ArrayList) this.LJII) {
            long j2 = runnableC2199701B7g.LLJILJILJ;
            C1B8H c1b8h = runnableC2199701B7g.LLJLLIL;
            if (j2 >= 0 && c1b8h != null) {
                if (C1490830otl.LIZ()) {
                    int id = runnableC2199701B7g.LLILLL.getId();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CurSegmentReadOffset = ");
                    sbLIZ.append(j2);
                    sbLIZ.append(", threadIndex = ");
                    sbLIZ.append(runnableC2199701B7g.LLJJIJIL);
                    C1490830otl.LIZLLL(id, "SegmentReader", "markProgress", C2188811AlT.LIZIZ(sbLIZ));
                }
                c1b8h.LIZIZ(j2, j);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x038c, code lost:
    
        if (X.C1490830otl.LIZ() == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x038e, code lost:
    
        r13 = r33.LIZ.getId();
        r1 = X.C2188811AlT.LIZ();
        r1.append("TotalSpeed = ");
        r1.append(r10);
        r1.append(", threadAvgSpeed = ");
        r1.append(r4);
        r1.append(", poorSpeed = ");
        r1.append(500L);
        r1.append(", speed = ");
        r1.append(r2);
        r1.append(",threadIndex = ");
        r1.append(r8.LLJJIJIL);
        X.C1490830otl.LIZLLL(r13, "SegmentDispatcher", "isDownloadSpeedPoor", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03cf, code lost:
    
        if (r33.LJJII == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03d5, code lost:
    
        if (X.C1490830otl.LIZ() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03d7, code lost:
    
        r3 = r33.LIZ.getId();
        r1 = X.C2188811AlT.LIZ();
        r1.append("IsDownloadSpeedPoor segment = ");
        r1.append(r9);
        r1.append(", owner.threadIndex = ");
        r1.append(r8.LLJJIJIL);
        X.C1490830otl.LIZLLL(r3, "SegmentDispatcher", "obtainSegmentWhenNoNewSegment", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0443 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x041b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2199811B7r LJJ(X.RunnableC2199701B7g r34) {
        /*
            Method dump skipped, instruction units count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199711B7h.LJJ(X.1B7g):X.1B7r");
    }

    public final void LJJIII(BaseException baseException) {
        int id = this.LIZ.getId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exception: ");
        sbLIZ.append(baseException);
        C1490830otl.LJ(id, "SegmentDispatcher", "onError", C2188811AlT.LIZIZ(sbLIZ));
        this.LJIILLIIL = baseException;
        this.LIZJ.LIZIZ();
        synchronized (this) {
            try {
                Iterator it2 = ((ArrayList) this.LJII).iterator();
                while (it2.hasNext()) {
                    ((RunnableC2199701B7g) it2.next()).LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIIJ(RunnableC2199701B7g runnableC2199701B7g) {
        if (C1490830otl.LIZ()) {
            int id = this.LIZ.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ThreadIndex = ");
            sbLIZ.append(runnableC2199701B7g.LLJJIJIL);
            C1490830otl.LIZLLL(id, "SegmentDispatcher", "onReaderExit", C2188811AlT.LIZIZ(sbLIZ));
        }
        synchronized (this) {
            try {
                runnableC2199701B7g.getClass();
                ((ArrayList) this.LJII).remove(runnableC2199701B7g);
                LJIIIIZZ();
                if (((ArrayList) this.LJII).isEmpty()) {
                    LJJIFFI();
                } else if (LJIJJLI()) {
                    if (C1490830otl.LIZ()) {
                        C1490830otl.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "onReaderExit", "allContentDownloaded");
                    }
                    Iterator it2 = ((ArrayList) this.LJII).iterator();
                    while (it2.hasNext()) {
                        ((RunnableC2199701B7g) it2.next()).LIZ();
                    }
                    LJJIFFI();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIIZI(RunnableC2199701B7g runnableC2199701B7g) {
        synchronized (this) {
            try {
                C2199791B7p c2199791B7pLJIILIIL = LJIILIIL(runnableC2199701B7g);
                if (c2199791B7pLJIILIIL == null) {
                    return;
                }
                int i = runnableC2199701B7g.LLJL;
                if (i < 30) {
                    runnableC2199701B7g.LLJL = i + 1;
                    C2199791B7p c2199791B7p = runnableC2199701B7g.LLJ;
                    if (c2199791B7p != null) {
                        c2199791B7p.LIZLLL(runnableC2199701B7g);
                    }
                    c2199791B7pLJIILIIL.LJ(runnableC2199701B7g);
                    runnableC2199701B7g.LLJ = c2199791B7pLJIILIIL;
                    runnableC2199701B7g.LJIILIIL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJJIJIIJI(C2199811B7r c2199811B7r) {
        synchronized (this) {
            try {
                c2199811B7r.LJI--;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ(String str, List<C2199791B7p> list) {
        if (this.LJJII) {
            for (C2199791B7p c2199791B7p : list) {
                if (C1490830otl.LIZ()) {
                    int id = this.LIZ.getId();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UrlRecord: ");
                    sbLIZ.append(c2199791B7p);
                    C1490830otl.LIZLLL(id, "SegmentDispatcher", "addIpListLocked", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        int i = 0;
        int iOptInt = this.LIZIZ.LIZ.optInt("ip_strategy", 0);
        if (iOptInt == 1 || iOptInt == 3) {
            int size = ((ArrayList) this.LJIIIIZZ).size();
            while (true) {
                if (i >= size) {
                    break;
                }
                if (TextUtils.equals(((C2199791B7p) ListProtector.get(this.LJIIIIZZ, i)).LIZ, str)) {
                    if (i >= 0 && i < ((ArrayList) this.LJIIIIZZ).size()) {
                        ((ArrayList) this.LJIIIIZZ).addAll(i + 1, list);
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
        ((ArrayList) this.LJIIIIZZ).addAll(list);
    }

    public final void LIZIZ(RunnableC2199701B7g runnableC2199701B7g, C2199811B7r c2199811B7r) {
        synchronized (this) {
            try {
                LIZJ(runnableC2199701B7g, c2199811B7r);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.RunnableC2199701B7g r21, X.C2199811B7r r22) throws com.ss.android.socialbase.downloader.segment.SegmentApplyException {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199711B7h.LIZJ(X.1B7g, X.1B7r):void");
    }

    public final List<C2199791B7p> LJ(String str, List<InetAddress> list) throws Throwable {
        boolean z;
        if (list != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (InetAddress inetAddress : list) {
                if (inetAddress != null) {
                    String strD0 = C2204961BRm.d0(inetAddress, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisoenH5FIXDBMOe2WEVPpVhE5fSJOU5U4mbsU=", null));
                    if (!TextUtils.isEmpty(strD0)) {
                        if (this.LJJII && C1490830otl.LIZ()) {
                            int id = this.LIZ.getId();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Ip: ");
                            sbLIZ.append(strD0);
                            C1490830otl.LIZLLL(id, "SegmentDispatcher", "assembleIpAddress", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        C2199791B7p c2199791B7p = new C2199791B7p(str, strD0);
                        LinkedList linkedList = (LinkedList) linkedHashMap.get(c2199791B7p.LIZJ);
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            linkedHashMap.put(c2199791B7p.LIZJ, linkedList);
                        }
                        linkedList.add(c2199791B7p);
                        i++;
                    }
                }
            }
            if (i > 0) {
                ArrayList arrayList = new ArrayList();
                do {
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    z = false;
                    while (it2.hasNext()) {
                        LinkedList linkedList2 = (LinkedList) ((Map.Entry) it2.next()).getValue();
                        if (linkedList2 != null && !linkedList2.isEmpty()) {
                            arrayList.add(linkedList2.pollFirst());
                            i--;
                            z = true;
                        }
                    }
                    if (i <= 0) {
                        break;
                    }
                } while (z);
                return arrayList;
            }
        }
        return null;
    }

    public final boolean LJIILJJIL(long j, long j2) {
        long j3 = j - j2;
        long jLIZ = this.LJIJ.LIZ(j3, j);
        int size = ((ArrayList) this.LJII).size();
        if (size > 0) {
            jLIZ /= (long) size;
        }
        long jMax = (long) Math.max(10.0f, jLIZ * this.LJJI);
        int i = size / 2;
        long jLIZ2 = Long.MAX_VALUE;
        RunnableC2199701B7g runnableC2199701B7g = null;
        int i2 = 0;
        for (RunnableC2199701B7g runnableC2199701B7g2 : (ArrayList) this.LJII) {
            long j4 = jLIZ2;
            if (runnableC2199701B7g2.LLJZIJLIL > 0) {
                i2++;
                if (runnableC2199701B7g2.LLJZIJLIL < j3) {
                    C1B8H c1b8h = runnableC2199701B7g2.LLJLLIL;
                    if (c1b8h == null) {
                        jLIZ2 = -1;
                    } else {
                        jLIZ2 = c1b8h.LIZ(j3, j);
                    }
                    if (this.LJJII && C1490830otl.LIZ()) {
                        int id = this.LIZ.getId();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Speed = ");
                        sbLIZ.append(jLIZ2);
                        sbLIZ.append(", threadIndex = ");
                        sbLIZ.append(runnableC2199701B7g2.LLJJIJIL);
                        C1490830otl.LIZLLL(id, "SegmentDispatcher", "findPoorReadThread", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (jLIZ2 >= 0 && jLIZ2 < j4) {
                        runnableC2199701B7g = runnableC2199701B7g2;
                    }
                }
            }
            jLIZ2 = j4;
        }
        if (runnableC2199701B7g != null && i2 >= i && jLIZ2 < jMax) {
            if (C1490830otl.LIZ()) {
                int id2 = this.LIZ.getId();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MinSpeed = ");
                sbLIZ2.append(jLIZ2);
                sbLIZ2.append(", threadIndex = ");
                sbLIZ2.append(runnableC2199701B7g.LLJJIJIL);
                C1490830otl.LIZLLL(id2, "SegmentDispatcher", "findPoorReadThread", C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            runnableC2199701B7g = null;
        }
        if (runnableC2199701B7g != null) {
            LJJIIZI(runnableC2199701B7g);
            if (C1490830otl.LIZ()) {
                int id3 = this.LIZ.getId();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("HandlePoorReadThread: reconnect for poor speed, threadIndex = ");
                sbLIZ3.append(runnableC2199701B7g.LLJJIJIL);
                C1490830otl.LIZLLL(id3, "SegmentDispatcher", "findPoorReadThreadAndReconnect", C2188811AlT.LIZIZ(sbLIZ3));
            }
            runnableC2199701B7g.LJIIJJI(false);
            return true;
        }
        RunnableC2199701B7g runnableC2199701B7gLJIIL = LJIIL(j, j2, true);
        if (runnableC2199701B7gLJIIL != null) {
            LJJIIZI(runnableC2199701B7gLJIIL);
            if (C1490830otl.LIZ()) {
                int id4 = this.LIZ.getId();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("handlePoorReadThread: reconnect for connect timeout, threadIndex = ");
                sbLIZ4.append(runnableC2199701B7gLJIIL.LLJJIJIL);
                C1490830otl.LIZLLL(id4, "SegmentDispatcher", "findPoorReadThreadAndReconnect", C2188811AlT.LIZIZ(sbLIZ4));
            }
            runnableC2199701B7gLJIIL.LJIIJJI(false);
            return true;
        }
        return false;
    }

    public final void LJJII(String str, List<InetAddress> list) {
        List<C2199791B7p> listLJ;
        if (!this.LJI && !this.LJFF) {
            try {
                listLJ = LJ(str, list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                listLJ = null;
            }
            synchronized (this) {
                if (listLJ != null) {
                    try {
                        LIZ(str, listLJ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                this.LJIIJJI = false;
                this.LIZIZ.LIZ(((ArrayList) this.LJIIIIZZ).size());
                if (C1490830otl.LIZ()) {
                    C1490830otl.LIZLLL(this.LIZ.getId(), "SegmentDispatcher", "onDnsResolved", "DispatchReadThread");
                }
                LJIIJ();
            }
        }
    }

    public final void LJJIJ(RunnableC2199701B7g runnableC2199701B7g, C2199811B7r c2199811B7r) {
        synchronized (this) {
            try {
                if (c2199811B7r.LJFF == runnableC2199701B7g) {
                    if (C1490830otl.LIZ()) {
                        int id = this.LIZ.getId();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Segment: ");
                        sbLIZ.append(c2199811B7r);
                        C1490830otl.LIZLLL(id, "SegmentDispatcher", "unApplySegment", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    long j = runnableC2199701B7g.LLJILJILJ;
                    if (j >= c2199811B7r.LIZIZ.get()) {
                        c2199811B7r.LIZJ = j;
                    }
                    c2199811B7r.LJFF = null;
                    runnableC2199701B7g.LJIILJJIL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1B81] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.1B88] */
    public C2199711B7h(DownloadInfo downloadInfo, C1B8E c1b8e, InterfaceC2200111B8v interfaceC2200111B8v) {
        this.LIZ = downloadInfo;
        this.LIZIZ = c1b8e;
        C1B89 c1b89 = new C1B89(c1b8e.LIZ.optInt("buffer_count", 512), c1b8e.LIZ.optInt("buffer_size", 8192));
        this.LIZJ = c1b89;
        this.LIZLLL = interfaceC2200111B8v;
        this.LJ = new C2199731B7j(downloadInfo, interfaceC2200111B8v, c1b89);
        this.LJIJI = new C1700040uLC();
        this.LJIJ = new C1B8H();
        this.LJJII = C2199751B7l.LJFF(downloadInfo.getId(), null).LJIIIIZZ("debug", 0) == 1;
    }

    public static void LIZLLL(List list, C2199811B7r c2199811B7r, boolean z) {
        long j = c2199811B7r.LIZ;
        int size = list.size();
        int i = 0;
        while (i < size && j >= ((C2199811B7r) ListProtector.get(list, i)).LIZ) {
            i++;
        }
        ListProtector.add(list, i, c2199811B7r);
        if (z) {
            c2199811B7r.LJ = size;
        }
    }

    public final RunnableC2199701B7g LJIIL(long j, long j2, boolean z) {
        RunnableC2199701B7g runnableC2199701B7g = null;
        for (RunnableC2199701B7g runnableC2199701B7g2 : (ArrayList) this.LJII) {
            if (runnableC2199701B7g2.LLJJIJIL != 0 || z) {
                if (runnableC2199701B7g2.LLJLLL > 0 && runnableC2199701B7g2.LLJZ <= 0 && j - runnableC2199701B7g2.LLJLLL > j2 && (runnableC2199701B7g == null || runnableC2199701B7g2.LLJLLL < runnableC2199701B7g.LLJLLL)) {
                    runnableC2199701B7g = runnableC2199701B7g2;
                }
            }
        }
        return runnableC2199701B7g;
    }

    public final void LJJIIJZLJL(RunnableC2199701B7g runnableC2199701B7g, C2199811B7r c2199811B7r, BaseException baseException) {
        synchronized (this) {
            try {
                int id = this.LIZ.getId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Segment: ");
                sbLIZ.append(c2199811B7r);
                sbLIZ.append(" e:");
                sbLIZ.append(baseException);
                C1490830otl.LJ(id, "SegmentDispatcher", "onSegmentFailed", C2188811AlT.LIZIZ(sbLIZ));
                runnableC2199701B7g.LLJLL = true;
                if (runnableC2199701B7g.LLJJIJIL == 0) {
                    this.LJIILLIIL = baseException;
                }
                Iterator it2 = ((ArrayList) this.LJII).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((RunnableC2199701B7g) it2.next()).LLJLL) {
                            break;
                        }
                    } else {
                        if (this.LJIILLIIL == null) {
                            this.LJIILLIIL = baseException;
                        }
                        this.LJIJJ = true;
                        LJJIII(this.LJIILLIIL);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJII(RunnableC2199701B7g runnableC2199701B7g, C2199811B7r c2199811B7r, C2199791B7p c2199791B7p, C2199861B7w c2199861B7w) throws BaseException {
        RunnableC2199701B7g runnableC2199701B7g2 = c2199811B7r.LJFF;
        if (runnableC2199701B7g2 != null && runnableC2199701B7g2 != runnableC2199701B7g) {
            throw new SegmentApplyException(1, "segment already has an owner");
        }
        if (runnableC2199701B7g.LLJI == c2199811B7r.LIZIZ()) {
            if (!c2199861B7w.LIZ()) {
                if (c2199811B7r.LIZIZ() <= 0) {
                    int id = this.LIZ.getId();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Segment.getCurrentOffsetRead = ");
                    sbLIZ.append(c2199811B7r.LIZIZ());
                    C1490830otl.LJ(id, "SegmentDispatcher", "checkSegmentHttpResponseLocked", C2188811AlT.LIZIZ(sbLIZ));
                    int i = c2199861B7w.LIZJ;
                    String str = C2199661B7c.LIZ;
                    if (i != 200 && i != 201 && i != 0) {
                        int i2 = c2199861B7w.LIZJ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("2: response code error : ");
                        sbLIZ2.append(c2199861B7w.LIZJ);
                        sbLIZ2.append(" segment=");
                        sbLIZ2.append(c2199811B7r);
                        throw new DownloadHttpException(1004, i2, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    int i3 = c2199861B7w.LIZJ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("1: response code error : ");
                    sbLIZ3.append(c2199861B7w.LIZJ);
                    sbLIZ3.append(" segment=");
                    sbLIZ3.append(c2199811B7r);
                    throw new DownloadHttpException(1004, i3, C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            if (this.LIZLLL != null) {
                RunnableC2199651B7b.LJFF(this.LIZ.getMaxBytes(), c2199861B7w.LIZLLL());
            }
            if (c2199791B7p.LIZLLL) {
                if (this.LJIIIZ == null) {
                    this.LJIIIZ = c2199861B7w;
                    synchronized (this.LJIIZILJ) {
                        try {
                            this.LJIIZILJ.notify();
                        } finally {
                        }
                    }
                    InterfaceC2200111B8v interfaceC2200111B8v = this.LIZLLL;
                    if (interfaceC2200111B8v != null) {
                        ((RunnableC2199651B7b) interfaceC2200111B8v).LJJIFFI(c2199791B7p.LIZ, c2199861B7w.LIZIZ, c2199811B7r.LIZIZ());
                    }
                    long jLIZLLL = c2199861B7w.LIZLLL();
                    if (jLIZLLL > 0) {
                        for (C2199811B7r c2199811B7r2 : (ArrayList) this.LJIILJJIL) {
                            long j = c2199811B7r2.LIZLLL;
                            if (j <= 0 || j > jLIZLLL - 1) {
                                c2199811B7r2.LJ(jLIZLLL - 1);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C2199861B7w c2199861B7w2 = this.LJIIIZ;
            if (c2199861B7w2 != null || (c2199861B7w2 = this.LJIIJ) != null) {
                long jLIZLLL2 = c2199861B7w.LIZLLL();
                long jLIZLLL3 = c2199861B7w2.LIZLLL();
                if (jLIZLLL2 != jLIZLLL3) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Total len not equals,len=");
                    sbLIZ4.append(jLIZLLL2);
                    sbLIZ4.append(",sLen=");
                    sbLIZ4.append(jLIZLLL3);
                    sbLIZ4.append(",code=");
                    sbLIZ4.append(c2199861B7w.LIZJ);
                    sbLIZ4.append(",sCode=");
                    sbLIZ4.append(c2199861B7w2.LIZJ);
                    sbLIZ4.append(",range=");
                    sbLIZ4.append(C2199671B7d.LJIILJJIL(c2199861B7w.LIZIZ, "Content-Range"));
                    sbLIZ4.append(",sRange = ");
                    sbLIZ4.append(C2199671B7d.LJIILJJIL(c2199861B7w2.LIZIZ, "Content-Range"));
                    sbLIZ4.append(",url = ");
                    sbLIZ4.append(c2199861B7w.LIZ);
                    sbLIZ4.append(",sUrl=");
                    sbLIZ4.append(c2199861B7w2.LIZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    C1490830otl.LJ(this.LIZ.getId(), "SegmentDispatcher", "validateHttpResponse", strLIZIZ);
                    if (jLIZLLL2 > 0 && jLIZLLL3 > 0) {
                        throw new BaseException(1074, strLIZIZ);
                    }
                }
                String strLIZIZ2 = c2199861B7w.LIZIZ.LIZIZ("Etag");
                String strLIZIZ3 = c2199861B7w2.LIZIZ.LIZIZ("Etag");
                if (!TextUtils.equals(strLIZIZ2, strLIZIZ3)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Etag not equals with main url, etag = ");
                    sbLIZ5.append(strLIZIZ2);
                    sbLIZ5.append(", mainEtag = ");
                    sbLIZ5.append(strLIZIZ3);
                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
                    C1490830otl.LJ(this.LIZ.getId(), "SegmentDispatcher", "validateHttpResponse", strLIZIZ4);
                    if (!TextUtils.isEmpty(strLIZIZ2) && !TextUtils.isEmpty(strLIZIZ3) && !strLIZIZ2.equalsIgnoreCase(strLIZIZ3)) {
                        throw new BaseException(1074, strLIZIZ4);
                    }
                }
            }
            if (this.LJIIJ == null) {
                this.LJIIJ = c2199861B7w;
                if (this.LIZ.getTotalBytes() <= 0) {
                    long jLIZLLL4 = c2199861B7w.LIZLLL();
                    if (C1490830otl.LIZ()) {
                        int id2 = this.LIZ.getId();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Len=");
                        sbLIZ6.append(jLIZLLL4);
                        sbLIZ6.append(",url=");
                        sbLIZ6.append(c2199791B7p.LIZ);
                        C1490830otl.LIZLLL(id2, "SegmentDispatcher", "checkSegmentHttpResponseLocked", C2188811AlT.LIZIZ(sbLIZ6));
                    }
                    this.LIZ.setTotalBytes(jLIZLLL4);
                }
                synchronized (this.LJIIZILJ) {
                    try {
                        this.LJIIZILJ.notify();
                    } finally {
                    }
                }
                return;
            }
            return;
        }
        throw new SegmentApplyException(5, "applySegment");
    }
}
