package X;

import Y.ARunnableS92S0200000_23;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0ogd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482690ogd extends AbstractC1483700oiG {
    public static final ExecutorService LJJ = C786410Ut5.h4();
    public final InterfaceC1482870ogv LIZLLL;
    public final InterfaceC1482820ogq LJFF;
    public final boolean LJI;
    public C1482520ogM LJII;
    public InterfaceC1483670oiD LJIIIIZZ;
    public final HandlerThread LJIIIZ;
    public volatile BPEAHandler LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public boolean LJIILLIIL;
    public final C1478410oZj LJIJI;
    public C1482840ogs LJIJJ;
    public final C1482750ogj LJ = new C1482750ogj();
    public long LJIILIIL = System.currentTimeMillis();
    public final C1482760ogk LJIILJJIL = new C1482760ogk((List) C1474810oTv.u3.getValue());
    public final C1482760ogk LJIILL = new C1482760ogk((List) C1474810oTv.x3.getValue());
    public final C1058380deG LJIIZILJ = new C1058380deG();
    public final LruCache<String, String> LJIJ = new LruCache<>(10);
    public final C1482710ogf LJIJJLI = new C0S3K() { // from class: X.0ogf
        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onBufferedTimeMs(String str, long j) {
            if (C1474810oTv.LJJLIL()) {
                boolean z = true;
                if (C1474810oTv.LJJLJ()) {
                    long currentPosition = j - this.LL.LJIIIIZZ.LJIIIZ().getCurrentPosition();
                    if (this.LL.LJIILJJIL.LIZIZ(currentPosition)) {
                        if (C1474810oTv.LJL()) {
                            C1477400oY6.LJJJJI.LIZLLL(this.LL.LJIIL, "buffer1");
                        }
                        C1482690ogd c1482690ogd = this.LL;
                        if (currentPosition >= 2500) {
                            z = false;
                        }
                        c1482690ogd.LJIJ(z);
                        return;
                    }
                    return;
                }
                long currentPosition2 = j - this.LL.LJIIIIZZ.LJIIIZ().getCurrentPosition();
                long jLongValue = ((Number) C1474810oTv.s3.getValue()).longValue();
                if (currentPosition2 <= ((Number) C1474810oTv.t3.getValue()).longValue()) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1482690ogd c1482690ogd2 = this.LL;
                if (jCurrentTimeMillis - c1482690ogd2.LJIILIIL <= jLongValue) {
                    return;
                }
                c1482690ogd2.LJIILIIL = System.currentTimeMillis();
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJIIL, "buffer2");
                }
                this.LL.LJIJ(true);
            }
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onCompleteLoaded(String str, boolean z) {
            C786410Ut5.j4("onCompleteLoaded: sourceid:%s, isDash:%s", new Object[]{str, Boolean.valueOf(z)});
            if (!this.LL.LJ.LIZLLL(str)) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                    c1477400oY6.LIZIZ(this.LL.LJIIL);
                    c1477400oY6.LIZJ(this.LL.LJIIL, "loadnotcur");
                    return;
                }
                return;
            }
            C1482840ogs c1482840ogs = this.LL.LJIJJ;
            if (c1482840ogs != null) {
                c1482840ogs.LIZ.LIZ(str);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCompleteLoaded trigger preload, key:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            List<C1482660oga> listLJIIZILJ = this.LL.LJIIZILJ(false);
            if (((ArrayList) listLJIIZILJ).isEmpty()) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6 c1477400oY62 = C1477400oY6.LJJJJI;
                    c1477400oY62.LIZIZ(this.LL.LJIIL);
                    c1477400oY62.LIZJ(this.LL.LJIIL, "loadnotask");
                    return;
                }
                return;
            }
            this.LL.LJIIJJI = str;
            if (C1474810oTv.LJL()) {
                C1477400oY6.LJJJJI.LIZLLL(this.LL.LJIIL, "loaded");
            }
            this.LL.LJIILJJIL(listLJIIZILJ);
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onPlayCompleted(String str, int i) {
            if (!C1474810oTv.LLD() && C1474810oTv.LLLIIIIL()) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJIIL, "playcomplete");
                }
                this.LL.LJIJ(false);
            }
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            if (C1474810oTv.LLD() && C1474810oTv.LLLIIIIL()) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJIIL, "playcomplete1");
                }
                this.LL.LJIJ(false);
            }
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            if (C1474810oTv.LJJLJ()) {
                this.LL.LJIILJJIL.LIZ();
            }
            if (C1474810oTv.LJJJJJ() && !TextUtils.isEmpty(C1482690ogd.LJIILLIIL(str))) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJIIL, "onRenderFirstFrame");
                }
                this.LL.LJIJ(false);
            }
            if (C1474810oTv.LJJLJLI()) {
                this.LL.LJIILL.LIZ();
            }
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onPlayProgressChange(String str, long j, long j2) {
            if (!C1474810oTv.LJJLJLI() || !this.LL.LJIILL.LIZIZ(j) || TextUtils.isEmpty(C1482690ogd.LJIILLIIL(str))) {
                return;
            }
            if (C1474810oTv.LJL()) {
                C1477400oY6.LJJJJI.LIZLLL(this.LL.LJIIL, "onPlayProgressChange");
            }
            this.LL.LJIJ(false);
        }
    };
    public final C1482740ogi LJIL = new InterfaceC1475300oUi() { // from class: X.0ogi
        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void Dd(int i, String str, String str2, String str3) {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void LLLLZLLIL(String str) {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void Sm() {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void T8(List list) {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void Xi(String str, String str2, long j, long j2) {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void Z9() {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void ck() {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void t8(String str, long j, long j2, String str2) {
        }

        @Override // X.InterfaceC1475300oUi
        public final /* synthetic */ void tf(long j, long j2, String str, String str2) {
        }

        @Override // X.InterfaceC1475300oUi
        public final void qc(long j, long j2, String str) {
            if (!this.LL.LJI) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDownloadProgress: not enable preload，return. key:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            if (C1474810oTv.LLD() && j == j2) {
                if (TextUtils.isEmpty(this.LL.LJIJ.get(str))) {
                    this.LL.LJIJ.put(str, str);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onDownloadProgress: already download complete，return. key:");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
            }
            C786410Ut5.j4("onDownloadProgress：key: %s, totalBytes:%s, downloadedBytes:%s", new Object[]{str, Long.valueOf(j), Long.valueOf(j2)});
            C1482750ogj c1482750ogj = this.LL.LJ;
            if (c1482750ogj != null && !c1482750ogj.LIZLLL(str)) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                    c1477400oY6.LIZIZ(this.LL.LJIIL);
                    c1477400oY6.LIZJ(this.LL.LJIIL, "progressnotcur");
                    return;
                }
                return;
            }
            C1482840ogs c1482840ogs = this.LL.LJIJJ;
            if (c1482840ogs != null && j == j2) {
                c1482840ogs.LIZ.LIZ(str);
            }
            this.LL.LJIIJJI = str;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("trigger preload, key:");
            sbLIZ3.append(str);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (C1474810oTv.LJL()) {
                C1477400oY6.LJJJJI.LIZLLL(this.LL.LJIIL, "progress");
            }
            this.LL.LJIILIIL(j, j2);
        }
    };

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LIZJ(InterfaceC1483820oiS interfaceC1483820oiS) {
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJIIJJI(InterfaceC1483820oiS interfaceC1483820oiS) {
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void pause() {
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void resume() {
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void stop() {
    }

    @Override // X.AbstractC1483700oiG
    public final boolean LJIIL() {
        return C582130MsN.LIZ().getConfig().getVideoPreloaderManagerConfig().canPreload() && !this.LJIJI.LJI;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void release() {
        super.release();
        this.LJIIIZ.quit();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0ogf] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0ogi] */
    public C1482690ogd(C1478410oZj c1478410oZj) {
        this.LJFF = null;
        this.LJIJI = c1478410oZj;
        HandlerThread handlerThread = new HandlerThread("preload-strategy");
        this.LJIIIZ = handlerThread;
        handlerThread.start();
        this.LIZLLL = C1478160oZK.LIZ();
        this.LJFF = C582130MsN.LIZ().getConfig().getVideoPreloaderManagerConfig().getPreloadStrategy();
        boolean zCanPreload = C582130MsN.LIZ().getConfig().getVideoPreloaderManagerConfig().canPreload();
        this.LJI = zCanPreload;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload enable:");
        sbLIZ.append(zCanPreload);
        C2188811AlT.LIZIZ(sbLIZ);
        EnumC590140NCq.INS.addModeChangeListener(new InterfaceC590150NCr() { // from class: X.0ogn
            @Override // X.InterfaceC590150NCr
            public final void LIZ(boolean z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PreloadHook setFreedMode Enable:");
                sbLIZ2.append(z);
                C2188811AlT.LIZIZ(sbLIZ2);
                this.LIZ.LIZLLL.LIZ();
                C1475700oVM.LIZ().LJJJJLL(EnumC590140NCq.INS.isEnable());
                this.LIZ.LJIJ(false);
            }
        });
    }

    public static final String LJIILLIIL(String str) {
        if (!C1474810oTv.LLLFF() && C585500Mxo.LIZ > 1) {
            return null;
        }
        return C582130MsN.LIZ().getConfig().getCommonConfig().getLocalVideoPath(str);
    }

    @Override // X.AbstractC1483700oiG
    public final void LIZIZ(C1482520ogM c1482520ogM) {
        this.LJII = c1482520ogM;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        boolean z;
        InterfaceC1479620obg interfaceC1479620obg2;
        InterfaceC1479620obg interfaceC1479620obg3;
        if (!this.LJI) {
            return;
        }
        C1482750ogj c1482750ogj = this.LJ;
        c1482750ogj.LIZIZ = c1482750ogj.LIZJ;
        c1482750ogj.LIZJ = interfaceC1479620obg;
        System.currentTimeMillis();
        int iLIZIZ = c1482750ogj.LIZIZ(c1482750ogj.LIZJ, c1482750ogj.LIZJ());
        c1482750ogj.LJ = iLIZIZ;
        if (iLIZIZ == -1) {
            ListIterator listIterator = new ArrayList(c1482750ogj.LIZ.entrySet()).listIterator(c1482750ogj.LIZ.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) listIterator.previous();
                int iLIZIZ2 = c1482750ogj.LIZIZ(c1482750ogj.LIZJ, (List) entry.getValue());
                if (iLIZIZ2 > -1) {
                    c1482750ogj.LIZLLL = (String) entry.getKey();
                    c1482750ogj.LJ = iLIZIZ2;
                    break;
                }
            }
        }
        System.currentTimeMillis();
        this.LJII.LIZ(this.LJIJJLI);
        if (C1474810oTv.LJL()) {
            String key = interfaceC1479620obg.getKey();
            this.LJIIL = key;
            C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
            int i = this.LJ.LJ;
            c1477400oY6.getClass();
            if (!TextUtils.isEmpty(key)) {
                c1477400oY6.LJJIL.put(key, Integer.valueOf(i));
            }
            String str = this.LJIIL;
            C1482750ogj c1482750ogj2 = this.LJ;
            int size = c1482750ogj2.LIZJ().size() - c1482750ogj2.LJ;
            if (!TextUtils.isEmpty(str)) {
                c1477400oY6.LJJIZ.put(str, Integer.valueOf(size));
            }
            String str2 = this.LJIIL;
            int iLJJII = this.LIZLLL.LJJII();
            if (!TextUtils.isEmpty(str2)) {
                c1477400oY6.LJJJ.put(str2, Integer.valueOf(iLJJII));
            }
            C1481530oel c1481530oel = C1482080ofe.LIZ;
            String key2 = interfaceC1479620obg.getKey();
            SimVideoUrlModel simVideoUrlModelLIZLLL = C1479540obY.LIZLLL(interfaceC1479620obg);
            c1481530oel.getClass();
            int iLIZ = C1481530oel.LIZ(simVideoUrlModelLIZLLL, key2);
            if (iLIZ >= 0) {
                iLIZ /= LSPassThroughRecordSizeConfig.DEFAULT;
            }
            String str3 = this.LJIIL;
            if (!TextUtils.isEmpty(str3)) {
                c1477400oY6.LJJIJL.put(str3, Integer.valueOf(iLIZ));
            }
            C1482750ogj c1482750ogj3 = this.LJ;
            List<InterfaceC1479620obg> listLIZJ = c1482750ogj3.LIZJ();
            int i2 = c1482750ogj3.LJ - 1;
            if (i2 > 0 && i2 < listLIZJ.size() && (interfaceC1479620obg3 = (InterfaceC1479620obg) ListProtector.get(listLIZJ, i2)) != null) {
                String str4 = this.LJIIL;
                int iLJIILL = c1477400oY6.LJIILL(interfaceC1479620obg3.getKey());
                if (!TextUtils.isEmpty(str4)) {
                    c1477400oY6.LJJIJIIJI.put(str4, Integer.valueOf(iLJIILL));
                }
                int iLIZ2 = C1481530oel.LIZ(C1479540obY.LIZLLL(interfaceC1479620obg3), interfaceC1479620obg3.getKey());
                if (iLIZ2 >= 0) {
                    iLIZ2 /= LSPassThroughRecordSizeConfig.DEFAULT;
                }
                String str5 = this.LJIIL;
                if (!TextUtils.isEmpty(str5)) {
                    c1477400oY6.LJJIJIL.put(str5, Integer.valueOf(iLIZ2));
                }
            }
            C1482750ogj c1482750ogj4 = this.LJ;
            List<InterfaceC1479620obg> listLIZJ2 = c1482750ogj4.LIZJ();
            int i3 = c1482750ogj4.LJ + 1;
            if (i3 > 0 && i3 < listLIZJ2.size() && (interfaceC1479620obg2 = (InterfaceC1479620obg) ListProtector.get(listLIZJ2, i3)) != null) {
                String str6 = this.LJIIL;
                int iLJIILL2 = c1477400oY6.LJIILL(interfaceC1479620obg2.getKey());
                if (!TextUtils.isEmpty(str6)) {
                    c1477400oY6.LJJIJIIJIL.put(str6, Integer.valueOf(iLJIILL2));
                }
                int iLIZ3 = C1481530oel.LIZ(C1479540obY.LIZLLL(interfaceC1479620obg2), interfaceC1479620obg2.getKey());
                if (iLIZ3 >= 0) {
                    iLIZ3 /= LSPassThroughRecordSizeConfig.DEFAULT;
                }
                String str7 = this.LJIIL;
                if (!TextUtils.isEmpty(str7)) {
                    c1477400oY6.LJJIJLIJ.put(str7, Integer.valueOf(iLIZ3));
                }
            }
        }
        if (C1474810oTv.LJLJI()) {
            C1482750ogj c1482750ogj5 = this.LJ;
            int i4 = c1482750ogj5.LJ;
            if (i4 > c1482750ogj5.LIZ(c1482750ogj5.LIZIZ, c1482750ogj5.LIZJ()) && i4 > -1) {
                z = true;
            } else {
                z = false;
            }
            this.LJIILLIIL = !z;
        }
        if (C1474810oTv.LJJJJIZL()) {
            this.LJIIZILJ.LIZ();
        }
    }

    @Override // X.AbstractC1483700oiG
    public final void LJFF(InterfaceC1483670oiD interfaceC1483670oiD) {
        this.LJIIIIZZ = interfaceC1483670oiD;
    }

    public final void LJIILJJIL(List<C1482660oga> list) {
        if (C1474810oTv.LJLJI() && this.LJIILLIIL) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                c1477400oY6.LIZIZ(this.LJIIL);
                c1477400oY6.LIZJ(this.LJIIL, "reverse");
                return;
            }
            return;
        }
        if (C1474810oTv.LJJJJIZL() && this.LJIIZILJ.LJ) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY62 = C1477400oY6.LJJJJI;
                c1477400oY62.LIZIZ(this.LJIIL);
                c1477400oY62.LIZJ(this.LJIIL, "fast");
            }
            this.LJIIZILJ.LIZLLL = new ARunnableS92S0200000_23(list, this, 129);
            return;
        }
        if (((Boolean) C1474810oTv.n.getValue()).booleanValue()) {
            LJJ.execute(new ARunnableS92S0200000_23(list, this, 130));
            return;
        }
        synchronized (this) {
            if (this.LJIIJ == null) {
                Looper looperW2 = C786410Ut5.W2(this.LJIIIZ);
                if (looperW2 != null) {
                    this.LJIIJ = new BPEAHandler(looperW2);
                }
            }
            BPEAHandler bPEAHandler = this.LJIIJ;
            if (bPEAHandler != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS92S0200000_23(list, this, 131));
                return;
            }
        }
        LJIILL(list);
    }

    public final void LJIILL(List<C1482660oga> list) {
        int i;
        for (C1482660oga c1482660oga : list) {
            int i2 = c1482660oga.LIZJ;
            if (i2 > 0 && (i = c1482660oga.LIZIZ) >= 0) {
                C1482750ogj c1482750ogj = this.LJ;
                c1482750ogj.getClass();
                ArrayList<InterfaceC1479620obg> arrayList = new ArrayList();
                if (c1482750ogj.LJ != -1) {
                    try {
                        List<InterfaceC1479620obg> listLIZJ = c1482750ogj.LIZJ();
                        int i3 = c1482750ogj.LJ;
                        if (i3 > c1482750ogj.LIZ(c1482750ogj.LIZIZ, c1482750ogj.LIZJ()) && i3 > -1) {
                            int i4 = 0;
                            do {
                                int i5 = c1482750ogj.LJ + 1 + i4 + i;
                                if (i5 < listLIZJ.size()) {
                                    arrayList.add(listLIZJ.get(i5));
                                }
                                i4++;
                            } while (i4 < i2);
                        } else {
                            int i6 = 0;
                            do {
                                int i7 = ((c1482750ogj.LJ - 1) - i6) - i;
                                if (i7 >= 0 && i7 < listLIZJ.size()) {
                                    arrayList.add(listLIZJ.get(i7));
                                }
                                i6++;
                            } while (i6 < i2);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (C1474810oTv.LJL()) {
                    if (arrayList.size() == 0) {
                        C1477400oY6.LJJJJI.LIZJ(this.LJIIL, "empty");
                    }
                    C1477400oY6.LIZ(this.LJIIL, arrayList.size(), C1477400oY6.LJJJJI.LJJIIJ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start preload aweme list, size : ");
                sbLIZ.append(arrayList.size());
                C2188811AlT.LIZIZ(sbLIZ);
                for (InterfaceC1479620obg interfaceC1479620obg : arrayList) {
                    SimVideoUrlModel simVideoUrlModelLJII = C1479290ob9.LJII(C1479540obY.LIZIZ(interfaceC1479620obg));
                    if (simVideoUrlModelLJII != null && simVideoUrlModelLJII.getUrlList() != null && simVideoUrlModelLJII.getUrlList().size() != 0) {
                        if (!TextUtils.equals(simVideoUrlModelLJII.getUri(), this.LJIIJJI) && !TextUtils.equals(simVideoUrlModelLJII.getSourceId(), this.LJIIJJI)) {
                            if (C1474810oTv.LLLIIII()) {
                                String strLJIILLIIL = LJIILLIIL(interfaceC1479620obg.getKey());
                                if (!TextUtils.isEmpty(strLJIILLIIL)) {
                                    C786410Ut5.j4("local video need not preload, skip!!! --> path:%s", new Object[]{strLJIILLIIL});
                                }
                            }
                            int i8 = c1482660oga.LIZLLL;
                            C786410Ut5.j4("start preload --> URI:%s, url:%s", new Object[]{simVideoUrlModelLJII.getUri(), ListProtector.get(simVideoUrlModelLJII.getUrlList(), 0)});
                            C786410Ut5.j4("trigger preload: URI:%s, url:%s", new Object[]{simVideoUrlModelLJII.getUri(), ListProtector.get(simVideoUrlModelLJII.getUrlList(), 0)});
                            if (C1474810oTv.LJL()) {
                                C1477400oY6.LIZ(interfaceC1479620obg.getKey(), 1, C1477400oY6.LJJJJI.LJJIIZI);
                            }
                            if (C1474810oTv.LLJILLL() && interfaceC1479620obg.LIZLLL() != null) {
                                interfaceC1479620obg.LIZLLL().getClass();
                            }
                            this.LIZLLL.LJJJLL(simVideoUrlModelLJII, i8);
                        } else {
                            C786410Ut5.j4("preload same video, skip!!! --> currentKey:%s, url:%s", new Object[]{this.LJIIJJI, ListProtector.get(simVideoUrlModelLJII.getUrlList(), 0)});
                        }
                    }
                }
            }
        }
    }

    public final List<C1482660oga> LJIIZILJ(boolean z) {
        List<C1482660oga> listLIZIZ;
        ArrayList arrayList = new ArrayList();
        InterfaceC1482820ogq interfaceC1482820ogq = this.LJFF;
        if (interfaceC1482820ogq == null) {
            return arrayList;
        }
        if (z) {
            listLIZIZ = interfaceC1482820ogq.LIZ();
        } else {
            listLIZIZ = interfaceC1482820ogq.LIZIZ();
        }
        if (listLIZIZ != null && listLIZIZ.size() > 0) {
            arrayList.addAll(listLIZIZ);
        }
        return arrayList;
    }

    public final void LJIJ(boolean z) {
        List<C1482660oga> listLJIIZILJ = LJIIZILJ(z);
        if (((ArrayList) listLJIIZILJ).isEmpty()) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                c1477400oY6.LIZIZ(this.LJIIL);
                c1477400oY6.LIZJ(this.LJIIL, "notasktrigger");
                return;
            }
            return;
        }
        LJIILJJIL(listLJIIZILJ);
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJJII(String str) {
        remove(str);
        this.LIZLLL.LIZIZ(this.LJIL);
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJIIIIZZ(String str, List<InterfaceC1479620obg> list) {
        C1482750ogj c1482750ogj;
        InterfaceC1479620obg interfaceC1479620obg;
        List<InterfaceC1479740obs> listLJIIJJI;
        SimVideoUrlModel simVideoUrlModelLIZJ;
        if (this.LJI && list != null && list.size() != 0) {
            boolean z = false;
            if (C582130MsN.LIZ().getConfig().getVideoPreloaderManagerConfig().enableLoadMorePreload() && (interfaceC1479620obg = (c1482750ogj = this.LJ).LIZJ) != null && (listLJIIJJI = interfaceC1479620obg.LJIIJJI()) != null && listLJIIJJI.size() != 0 && (simVideoUrlModelLIZJ = C1479540obY.LIZJ(c1482750ogj.LIZJ, (InterfaceC1479740obs) ListProtector.get(listLJIIJJI, 0))) != null && this.LIZLLL.LJIIIIZZ(simVideoUrlModelLIZJ)) {
                List<InterfaceC1479620obg> listLIZJ = this.LJ.LIZJ();
                if (list.size() != 0 && listLIZJ.size() != 0 && list.size() > listLIZJ.size() && TextUtils.equals(((InterfaceC1479620obg) ListProtector.get(list, 0)).getKey(), ((InterfaceC1479620obg) ListProtector.get(listLIZJ, 0)).getKey())) {
                    z = true;
                }
            }
            C1482750ogj c1482750ogj2 = this.LJ;
            c1482750ogj2.getClass();
            if (!TextUtils.isEmpty(str) && list.size() != 0) {
                if (c1482750ogj2.LIZ.get(str) == null) {
                    c1482750ogj2.LIZ.put(str, new ArrayList());
                }
                c1482750ogj2.LIZLLL = str;
                c1482750ogj2.LIZJ().clear();
                c1482750ogj2.LIZJ().addAll(list);
            }
            this.LIZLLL.LIZLLL(this.LJIL);
            if (z) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LJIIL, "loadmore");
                }
                LJIILIIL(0L, 0L);
            }
        }
    }

    public final void LJIILIIL(long j, long j2) {
        List<C1482660oga> listLJIIZILJ = LJIIZILJ(false);
        ArrayList arrayList = new ArrayList();
        for (C1482660oga c1482660oga : (ArrayList) listLJIIZILJ) {
            if (100 * j2 >= ((long) c1482660oga.LIZ) * j) {
                arrayList.add(c1482660oga);
            }
        }
        if (arrayList.isEmpty()) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                c1477400oY6.LIZIZ(this.LJIIL);
                c1477400oY6.LIZJ(this.LJIIL, "notaskbegin");
                return;
            }
            return;
        }
        LJIILJJIL(arrayList);
    }
}
