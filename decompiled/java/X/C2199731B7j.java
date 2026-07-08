package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1B7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199731B7j {
    public final DownloadInfo LIZJ;
    public final C2199751B7l LJ;
    public final InterfaceC2200111B8v LJFF;
    public final InterfaceC2200051B8p LJI;
    public BaseException LJII;
    public final boolean LJIIL;
    public final long LJIILIIL;
    public final long LJIILJJIL;
    public final long LJIILL;
    public final boolean LJIIZILJ;
    public long LJIJ;
    public final List<C2199831B7t> LIZ = new LinkedList();
    public final List<C2199831B7t> LIZIZ = new ArrayList();
    public volatile boolean LJIIIIZZ = false;
    public volatile boolean LJIIIZ = false;
    public volatile boolean LJIIJ = false;
    public boolean LJIILLIIL = true;
    public volatile long LJIJI = 0;
    public volatile long LJIJJ = 0;
    public final InterfaceC2199141B5c LIZLLL = C2199681B7e.LJIIJJI();
    public final C1490910ott LJIIJJI = C1490860oto.LIZ;

    public final void LIZLLL() {
        boolean z;
        boolean z2 = this.LJIIZILJ;
        long jNanoTime = z2 ? System.nanoTime() : 0L;
        DownloadInfo downloadInfo = this.LIZJ;
        InterfaceC2199141B5c interfaceC2199141B5c = this.LIZLLL;
        List<C2199831B7t> list = this.LIZ;
        List<C2199831B7t> list2 = this.LIZIZ;
        Map<Long, C2199811B7r> mapX = interfaceC2199141B5c.x(downloadInfo.getId());
        if (mapX == null) {
            mapX = new HashMap<>(4);
        }
        synchronized (this) {
            try {
                Iterator<C2199831B7t> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ.LL.flush();
                }
                try {
                    if (this.LJIILLIIL) {
                        Iterator<C2199831B7t> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().LIZIZ.LL.LIZ();
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    z = false;
                }
                LJI(list, mapX);
                ArrayList arrayList = (ArrayList) list2;
                if (arrayList.size() > 0) {
                    LIZJ(arrayList);
                    list.removeAll(arrayList);
                    arrayList.clear();
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (z) {
            downloadInfo.updateRealDownloadTime(true);
            interfaceC2199141B5c.LLLLII(downloadInfo.getId(), mapX);
            interfaceC2199141B5c.updateDownloadInfo(downloadInfo);
            this.LJIJI = downloadInfo.getCurBytes();
        }
        if (z2) {
            this.LJIJ += System.nanoTime() - jNanoTime;
        }
    }

    public static void LIZJ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C2199671B7d.LJJIIJ(((C2199831B7t) it2.next()).LIZIZ);
        }
    }

    public final void LIZ(C2199831B7t c2199831B7t) {
        synchronized (this) {
            try {
                ((LinkedList) this.LIZ).add(c2199831B7t);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fb, code lost:
    
        if (r8 <= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fe, code lost:
    
        ((X.RunnableC2199651B7b) r5).LJJIJ(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0104, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e6 A[Catch: all -> 0x02b1, TryCatch #9 {all -> 0x02b1, blocks: (B:153:0x01df, B:155:0x01e6, B:157:0x01ea, B:159:0x01f0, B:160:0x020b, B:161:0x0211, B:163:0x0213, B:164:0x0218, B:166:0x021b), top: B:316:0x01df, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021b A[Catch: all -> 0x02b1, TRY_LEAVE, TryCatch #9 {all -> 0x02b1, blocks: (B:153:0x01df, B:155:0x01e6, B:157:0x01ea, B:159:0x01f0, B:160:0x020b, B:161:0x0211, B:163:0x0213, B:164:0x0218, B:166:0x021b), top: B:316:0x01df, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[Catch: all -> 0x00ef, BaseException -> 0x00f1, StreamClosedException -> 0x01cb, TRY_ENTER, TRY_LEAVE, TryCatch #28 {StreamClosedException -> 0x01cb, blocks: (B:16:0x0048, B:17:0x004c, B:19:0x0052), top: B:341:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ca A[Catch: all -> 0x038f, TryCatch #42 {all -> 0x038f, blocks: (B:204:0x02bd, B:206:0x02ca, B:208:0x02ce, B:211:0x02d4), top: B:353:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0371 A[Catch: all -> 0x0392, TryCatch #44 {all -> 0x0392, blocks: (B:245:0x036b, B:247:0x0371, B:248:0x038c, B:249:0x038e), top: B:355:0x036b }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x022a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x006b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C1B89 r31) {
        /*
            Method dump skipped, instruction units count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199731B7j.LJ(X.1B89):void");
    }

    public final void LJFF(InterfaceC2199941B8e interfaceC2199941B8e) {
        synchronized (this) {
            try {
                ((ArrayList) this.LIZIZ).add((C2199831B7t) interfaceC2199941B8e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJI(List list, Map map) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C2199811B7r c2199811B7r = ((C2199831B7t) it2.next()).LIZ;
            C2199811B7r c2199811B7r2 = (C2199811B7r) map.get(Long.valueOf(c2199811B7r.LIZ));
            if (c2199811B7r2 == null) {
                map.put(Long.valueOf(c2199811B7r.LIZ), new C2199811B7r(c2199811B7r));
            } else {
                c2199811B7r2.LIZLLL(c2199811B7r.LIZ());
                c2199811B7r2.LJ(c2199811B7r.LIZLLL);
            }
        }
    }

    public final void LIZIZ(long j, boolean z) {
        long j2;
        long j3 = j - this.LJIJJ;
        if (this.LJIIL) {
            if (this.LJIIJJI.LIZJ()) {
                j2 = this.LJIILIIL;
            } else {
                j2 = this.LJIILJJIL;
            }
            if (j3 > j2) {
                LIZLLL();
                this.LJIJJ = j;
                return;
            }
            return;
        }
        long curBytes = this.LIZJ.getCurBytes() - this.LJIJI;
        if (!z && (curBytes <= 65536 || j3 <= 500)) {
            return;
        }
        LIZLLL();
        this.LJIJJ = j;
    }

    public C2199731B7j(DownloadInfo downloadInfo, InterfaceC2200111B8v interfaceC2200111B8v, C1B89 c1b89) {
        boolean z;
        this.LIZJ = downloadInfo;
        this.LJFF = interfaceC2200111B8v;
        this.LJI = c1b89;
        C2199751B7l c2199751B7lLJFF = C2199751B7l.LJFF(downloadInfo.getId(), null);
        this.LJ = c2199751B7lLJFF;
        if (c2199751B7lLJFF.LJIIIIZZ("sync_strategy", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIL = z;
        if (z) {
            long jLJIIIIZZ = c2199751B7lLJFF.LJIIIIZZ("sync_interval_ms_fg", 5000);
            long jLJIIIIZZ2 = c2199751B7lLJFF.LJIIIIZZ("sync_interval_ms_bg", LSPassThroughRecordSizeConfig.DEFAULT);
            this.LJIILIIL = Math.max(jLJIIIIZZ, 500L);
            this.LJIILJJIL = Math.max(jLJIIIIZZ2, 500L);
            this.LJIILL = c2199751B7lLJFF.LJIIJ("sync_min_length", 10485760L);
        } else {
            this.LJIILIIL = 0L;
            this.LJIILJJIL = 0L;
            this.LJIILL = 0L;
        }
        this.LJIIZILJ = c2199751B7lLJFF.LJIIIIZZ("monitor_rw", 0) == 1;
    }
}
