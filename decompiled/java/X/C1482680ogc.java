package X;

import Y.ARunnableS92S0200000_23;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0ogc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482680ogc extends AbstractC1483700oiG {
    public final boolean LJFF;
    public String LJI;
    public String LJII;
    public final C1478410oZj LJIIIZ;
    public boolean LJIILIIL;
    public final ExecutorService LJIIIIZZ = C786410Ut5.h4();
    public long LJIIJ = System.currentTimeMillis();
    public final C1482760ogk LJIIJJI = new C1482760ogk((List) C1474810oTv.u3.getValue());
    public final C1482760ogk LJIIL = new C1482760ogk((List) C1474810oTv.x3.getValue());
    public final C1058380deG LJIILJJIL = new C1058380deG();
    public final LruCache<String, String> LJIILL = new LruCache<>(10);
    public final C1482700oge LJIILLIIL = new C0S3K() { // from class: X.0oge
        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onBufferedTimeMs(String str, long j) {
            if (C1474810oTv.LJJLIL()) {
                boolean z = true;
                if (C1474810oTv.LJJLJ()) {
                    long currentPosition = j - this.LL.LIZJ.LJIIIZ().getCurrentPosition();
                    if (this.LL.LJIIJJI.LIZIZ(currentPosition)) {
                        if (C1474810oTv.LJL()) {
                            C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "buffer1");
                        }
                        C1482680ogc c1482680ogc = this.LL;
                        if (currentPosition >= 2500) {
                            z = false;
                        }
                        c1482680ogc.LJIIZILJ(z);
                        return;
                    }
                    return;
                }
                long currentPosition2 = j - this.LL.LIZJ.LJIIIZ().getCurrentPosition();
                long jLongValue = ((Number) C1474810oTv.s3.getValue()).longValue();
                if (currentPosition2 <= ((Number) C1474810oTv.t3.getValue()).longValue()) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1482680ogc c1482680ogc2 = this.LL;
                if (jCurrentTimeMillis - c1482680ogc2.LJIIJ <= jLongValue) {
                    return;
                }
                c1482680ogc2.LJIIJ = System.currentTimeMillis();
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "buffer2");
                }
                this.LL.LJIIZILJ(true);
            }
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onCompleteLoaded(String str, boolean z) {
            C786410Ut5.j4("onCompleteLoaded: sourceid:%s, isDash:%s", new Object[]{str, Boolean.valueOf(z)});
            if (this.LL.LIZ.LJ(str)) {
                this.LL.LJIIJ(new C1057390dcf(str, z));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCompleteLoaded trigger preload, key:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                List<C1482660oga> listLJIILLIIL = this.LL.LJIILLIIL(false);
                if (((ArrayList) listLJIILLIIL).isEmpty()) {
                    if (C1474810oTv.LJL()) {
                        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                        c1477400oY6.LIZIZ(this.LL.LJII);
                        c1477400oY6.LIZJ(this.LL.LJII, "loadnotask");
                        return;
                    }
                    return;
                }
                this.LL.LJI = str;
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "loaded");
                }
                this.LL.LJIILJJIL(listLJIILLIIL);
                return;
            }
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY62 = C1477400oY6.LJJJJI;
                c1477400oY62.LIZIZ(this.LL.LJII);
                c1477400oY62.LIZJ(this.LL.LJII, "loadnotcur");
            }
            if (C1474810oTv.LJII() && C1482720ogg.LJI(EnumC1482800ogo.INS.getPreRenderingItem(), str)) {
                List<C1482660oga> listLJIILLIIL2 = this.LL.LJIILLIIL(false);
                if (((ArrayList) listLJIILLIIL2).isEmpty()) {
                    if (C1474810oTv.LJL()) {
                        C1477400oY6 c1477400oY63 = C1477400oY6.LJJJJI;
                        c1477400oY63.LIZIZ(this.LL.LJII);
                        c1477400oY63.LIZJ(this.LL.LJII, "loadnotask2");
                        return;
                    }
                    return;
                }
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "loaded2");
                }
                this.LL.LJIILJJIL(listLJIILLIIL2);
            }
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onPlayCompleted(String str, int i) {
            if (!C1474810oTv.LLD() && C1474810oTv.LLLIIIIL()) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "playcomplete");
                }
                this.LL.LJIIZILJ(false);
            }
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onPlayCompletedFirstTime(String str, C1480430ocz c1480430ocz) {
            if (C1474810oTv.LLD() && C1474810oTv.LLLIIIIL()) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "playcomplete1");
                }
                this.LL.LJIIZILJ(false);
            }
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onRenderFirstFrame(String str, C1480420ocy c1480420ocy) {
            if (C1474810oTv.LJJLJ()) {
                this.LL.LJIIJJI.LIZ();
            }
            if (C1474810oTv.LJJJJJ() && !TextUtils.isEmpty(C1482680ogc.LJIILL(str))) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "onRenderFirstFrame");
                }
                this.LL.LJIIZILJ(false);
            }
            if (C1474810oTv.LJJLJLI()) {
                this.LL.LJIIL.LIZ();
            }
        }

        @Override // X.C0S3K, X.InterfaceC1482530ogN
        public final void onPlayProgressChange(String str, long j, long j2) {
            if (!C1474810oTv.LJJLJLI() || !this.LL.LJIIL.LIZIZ(j) || TextUtils.isEmpty(C1482680ogc.LJIILL(str))) {
                return;
            }
            if (C1474810oTv.LJL()) {
                C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "onPlayProgressChange");
            }
            this.LL.LJIIZILJ(false);
        }
    };
    public final C1482730ogh LJIIZILJ = new InterfaceC1475300oUi() { // from class: X.0ogh
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
            if (!this.LL.LJFF) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDownloadProgress: not enable preload，return. key:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            if (C1474810oTv.LLD() && j == j2) {
                if (TextUtils.isEmpty(this.LL.LJIILL.get(str))) {
                    this.LL.LJIILL.put(str, str);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onDownloadProgress: already download complete，return. key:");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
            }
            if (this.LL.LIZ.LJ(str)) {
                this.LL.LJIIJ(new C1483060ohE(str, j, j2));
                this.LL.LJI = str;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("trigger preload, key:");
                sbLIZ3.append(str);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "progress");
                }
                this.LL.LJIILIIL(j, j2);
                return;
            }
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                c1477400oY6.LIZIZ(this.LL.LJII);
                c1477400oY6.LIZJ(this.LL.LJII, "progressnotcur");
            }
            if (!C1474810oTv.LJII() || !C1482720ogg.LJI(EnumC1482800ogo.INS.getPreRenderingItem(), str)) {
                return;
            }
            if (C1474810oTv.LJL()) {
                C1477400oY6.LJJJJI.LIZLLL(this.LL.LJII, "progress2");
            }
            this.LL.LJIILIIL(j, j2);
        }
    };
    public final InterfaceC1482870ogv LIZLLL = C1478160oZK.LIZ();
    public final InterfaceC1482820ogq LJ = C582130MsN.LIZ().getConfig().getVideoPreloaderManagerConfig().getPreloadStrategy();

    @Override // X.AbstractC1483700oiG
    public final boolean LJIIL() {
        return C582130MsN.LIZ().getConfig().getVideoPreloaderManagerConfig().canPreload() && !this.LJIIIZ.LJI;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final InterfaceC1482530ogN LIZ() {
        return this.LJIILLIIL;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0oge] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0ogh] */
    public C1482680ogc(C1478410oZj c1478410oZj) {
        this.LJIIIZ = c1478410oZj;
        boolean zCanPreload = C582130MsN.LIZ().getConfig().getVideoPreloaderManagerConfig().canPreload();
        this.LJFF = zCanPreload;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload enable:");
        sbLIZ.append(zCanPreload);
        C2188811AlT.LIZIZ(sbLIZ);
        EnumC590140NCq.INS.addModeChangeListener(new InterfaceC590150NCr() { // from class: X.0ogl
            @Override // X.InterfaceC590150NCr
            public final void LIZ(boolean z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PreloadStrategy setFreedMode Enable:");
                sbLIZ2.append(z);
                C2188811AlT.LIZIZ(sbLIZ2);
                this.LIZ.LIZLLL.LIZ();
                C1475700oVM.LIZ().LJJJJLL(EnumC590140NCq.INS.isEnable());
                this.LIZ.LJIIZILJ(false);
            }
        });
    }

    public static final String LJIILL(String str) {
        if (!C1474810oTv.LLLFF() && C585500Mxo.LIZ > 1) {
            return null;
        }
        return C582130MsN.LIZ().getConfig().getCommonConfig().getLocalVideoPath(str);
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        InterfaceC1479620obg interfaceC1479620obg2;
        InterfaceC1479620obg interfaceC1479620obg3;
        if (!this.LJFF) {
            return;
        }
        if (C1474810oTv.LJL()) {
            String key = interfaceC1479620obg.getKey();
            this.LJII = key;
            C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
            int i = this.LIZ.LJI;
            c1477400oY6.getClass();
            if (!TextUtils.isEmpty(key)) {
                c1477400oY6.LJJIL.put(key, Integer.valueOf(i));
            }
            String str = this.LJII;
            C1482720ogg c1482720ogg = this.LIZ;
            int size = c1482720ogg.LIZLLL().size() - c1482720ogg.LJI;
            if (!TextUtils.isEmpty(str)) {
                c1477400oY6.LJJIZ.put(str, Integer.valueOf(size));
            }
            String str2 = this.LJII;
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
            String str3 = this.LJII;
            if (!TextUtils.isEmpty(str3)) {
                c1477400oY6.LJJIJL.put(str3, Integer.valueOf(iLIZ));
            }
            C1482720ogg c1482720ogg2 = this.LIZ;
            List<InterfaceC1479620obg> listLIZLLL = c1482720ogg2.LIZLLL();
            int i2 = c1482720ogg2.LJI - 1;
            if (i2 > 0 && i2 < listLIZLLL.size() && (interfaceC1479620obg3 = (InterfaceC1479620obg) ListProtector.get(listLIZLLL, i2)) != null) {
                String str4 = this.LJII;
                int iLJIILL = c1477400oY6.LJIILL(interfaceC1479620obg3.getKey());
                if (!TextUtils.isEmpty(str4)) {
                    c1477400oY6.LJJIJIIJI.put(str4, Integer.valueOf(iLJIILL));
                }
                int iLIZ2 = C1481530oel.LIZ(C1479540obY.LIZLLL(interfaceC1479620obg3), interfaceC1479620obg3.getKey());
                if (iLIZ2 >= 0) {
                    iLIZ2 /= LSPassThroughRecordSizeConfig.DEFAULT;
                }
                String str5 = this.LJII;
                if (!TextUtils.isEmpty(str5)) {
                    c1477400oY6.LJJIJIL.put(str5, Integer.valueOf(iLIZ2));
                }
            }
            C1482720ogg c1482720ogg3 = this.LIZ;
            List<InterfaceC1479620obg> listLIZLLL2 = c1482720ogg3.LIZLLL();
            int i3 = c1482720ogg3.LJI + 1;
            if (i3 > 0 && i3 < listLIZLLL2.size() && (interfaceC1479620obg2 = (InterfaceC1479620obg) ListProtector.get(listLIZLLL2, i3)) != null) {
                String str6 = this.LJII;
                int iLJIILL2 = c1477400oY6.LJIILL(interfaceC1479620obg2.getKey());
                if (!TextUtils.isEmpty(str6)) {
                    c1477400oY6.LJJIJIIJIL.put(str6, Integer.valueOf(iLJIILL2));
                }
                int iLIZ3 = C1481530oel.LIZ(C1479540obY.LIZLLL(interfaceC1479620obg2), interfaceC1479620obg2.getKey());
                if (iLIZ3 >= 0) {
                    iLIZ3 /= LSPassThroughRecordSizeConfig.DEFAULT;
                }
                String str7 = this.LJII;
                if (!TextUtils.isEmpty(str7)) {
                    c1477400oY6.LJJIJLIJ.put(str7, Integer.valueOf(iLIZ3));
                }
            }
        }
        if (C1474810oTv.LJLJI()) {
            this.LJIILIIL = !this.LIZ.LJII();
        }
        if (C1474810oTv.LJJJJIZL()) {
            this.LJIILJJIL.LIZ();
        }
    }

    public final void LJIILJJIL(List<C1482660oga> list) {
        if (C1474810oTv.LJLJI() && this.LJIILIIL) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                c1477400oY6.LIZIZ(this.LJII);
                c1477400oY6.LIZJ(this.LJII, "reverse");
                return;
            }
            return;
        }
        if (C1474810oTv.LJJJJIZL() && this.LJIILJJIL.LJ) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY62 = C1477400oY6.LJJJJI;
                c1477400oY62.LIZIZ(this.LJII);
                c1477400oY62.LIZJ(this.LJII, "fast");
            }
            this.LJIILJJIL.LIZLLL = new ARunnableS92S0200000_23(list, this, 63);
            return;
        }
        this.LJIIIIZZ.submit(new ARunnableS92S0200000_23(list, this, 64));
    }

    public final List<C1482660oga> LJIILLIIL(boolean z) {
        List<C1482660oga> listLIZIZ;
        ArrayList arrayList = new ArrayList();
        InterfaceC1482820ogq interfaceC1482820ogq = this.LJ;
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

    public final void LJIIZILJ(boolean z) {
        List<C1482660oga> listLJIILLIIL = LJIILLIIL(z);
        if (((ArrayList) listLJIILLIIL).isEmpty()) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                c1477400oY6.LIZIZ(this.LJII);
                c1477400oY6.LIZJ(this.LJII, "notasktrigger");
                return;
            }
            return;
        }
        LJIILJJIL(listLJIILLIIL);
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJJII(String str) {
        this.LIZLLL.LIZIZ(this.LJIIZILJ);
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJIIIIZZ(String str, List<InterfaceC1479620obg> list) {
        InterfaceC1479620obg interfaceC1479620obg;
        List<InterfaceC1479740obs> listLJIIJJI;
        SimVideoUrlModel simVideoUrlModelLIZJ;
        if (this.LJFF && list != null && list.size() != 0) {
            boolean z = false;
            if (C582130MsN.LIZ().getConfig().getVideoPreloaderManagerConfig().enableLoadMorePreload() && (interfaceC1479620obg = this.LIZ.LIZJ) != null && (listLJIIJJI = interfaceC1479620obg.LJIIJJI()) != null && listLJIIJJI.size() != 0 && (simVideoUrlModelLIZJ = C1479540obY.LIZJ(interfaceC1479620obg, (InterfaceC1479740obs) ListProtector.get(listLJIIJJI, 0))) != null && this.LIZLLL.LJIIIIZZ(simVideoUrlModelLIZJ)) {
                z = this.LIZ.LJ;
            }
            this.LIZLLL.LIZLLL(this.LJIIZILJ);
            if (z) {
                if (C1474810oTv.LJL()) {
                    C1477400oY6.LJJJJI.LIZLLL(this.LJII, "loadmore");
                }
                LJIILIIL(0L, 0L);
            }
        }
    }

    public final void LJIILIIL(long j, long j2) {
        List<C1482660oga> listLJIILLIIL = LJIILLIIL(false);
        ArrayList arrayList = new ArrayList();
        for (C1482660oga c1482660oga : (ArrayList) listLJIILLIIL) {
            if (100 * j2 >= ((long) c1482660oga.LIZ) * j) {
                arrayList.add(c1482660oga);
            }
        }
        if (arrayList.isEmpty()) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                c1477400oY6.LIZIZ(this.LJII);
                c1477400oY6.LIZJ(this.LJII, "notaskbegin");
                return;
            }
            return;
        }
        LJIILJJIL(arrayList);
    }
}
