package X;

import Y.ARunnableS92S0200000_23;
import android.util.LruCache;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0ogb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482670ogb extends AbstractC1482950oh3 {
    public final InterfaceC1482870ogv LIZIZ;
    public final InterfaceC1482820ogq LIZJ;
    public final boolean LIZLLL;
    public String LJ;
    public String LJFF;
    public final ExecutorService LJI;
    public final C1482760ogk LJII;
    public final C1482760ogk LJIIIIZZ;
    public boolean LJIIIZ;
    public final C1058380deG LJIIJ;
    public final LruCache<String, String> LJIIJJI;
    public final C1482720ogg LJIIL;

    @Override // X.AbstractC1482950oh3
    public final String LJFF() {
        return "PreloadStrategy";
    }

    @Override // X.InterfaceC583260MuC
    public final List<String> LIZ() {
        return Arrays.asList("PlayerCallback_COMPLETE_LOADED", "PlayerCallback_COMPLETE", "PlayerCallback_FIRST_FRAME", "PlayerCallback_PROGRESS_CHANGE", "PlayerCallback_BUFFERED_TIME", "PreloaderCallback_PROGRESS", "SimKitPlayer_PLAY", "StrategyScene_SET_PLAY_LIST");
    }

    @Override // X.AbstractC1482950oh3
    public final boolean LIZJ() {
        this.LIZ.LIZJ.getClass();
        return C1479120oas.LIZ();
    }

    public final List LJIIJ() {
        List<C1482660oga> listLIZIZ;
        ArrayList arrayList = new ArrayList();
        InterfaceC1482820ogq interfaceC1482820ogq = this.LIZJ;
        if (interfaceC1482820ogq != null && (listLIZIZ = interfaceC1482820ogq.LIZIZ()) != null && listLIZIZ.size() > 0) {
            arrayList.addAll(listLIZIZ);
        }
        return arrayList;
    }

    public final void LJIIJJI() {
        List listLJIIJ = LJIIJ();
        if (!((ArrayList) listLJIIJ).isEmpty()) {
            LJIIIIZZ(listLJIIJ);
        } else if (C1474810oTv.LJL()) {
            C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
            c1477400oY6.LIZIZ(this.LJFF);
            c1477400oY6.LIZJ(this.LJFF, "notasktrigger");
        }
    }

    public C1482670ogb(C1483080ohG c1483080ohG) {
        super(c1483080ohG);
        this.LJI = C786410Ut5.h4();
        System.currentTimeMillis();
        this.LJII = new C1482760ogk((List) C1474810oTv.u3.getValue());
        this.LJIIIIZZ = new C1482760ogk((List) C1474810oTv.x3.getValue());
        this.LJIIJ = new C1058380deG();
        this.LJIIJJI = new LruCache<>(10);
        this.LJIIL = c1483080ohG.LIZIZ;
        this.LIZIZ = C1478160oZK.LIZ();
        this.LIZJ = C1479110oar.LIZ.LIZ.getVideoPreloaderManagerConfig().getPreloadStrategy();
        c1483080ohG.LIZJ.getClass();
        boolean zLIZ = C1479120oas.LIZ();
        this.LIZLLL = zLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload enable:");
        sbLIZ.append(zLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        EnumC590140NCq.INS.addModeChangeListener(new InterfaceC590150NCr() { // from class: X.0ogm
            @Override // X.InterfaceC590150NCr
            public final void LIZ(boolean z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PreloadStrategy setFreedMode Enable:");
                sbLIZ2.append(z);
                C2188811AlT.LIZIZ(sbLIZ2);
                this.LIZ.LIZIZ.LIZ();
                C1475700oVM.LIZ().LJJJJLL(EnumC590140NCq.INS.isEnable());
                this.LIZ.LJIIJJI();
            }
        });
    }

    public static final String LJIIIZ(String str) {
        if (!C1474810oTv.LLLFF() && C585500Mxo.LIZ > 1) {
            return null;
        }
        return C1479110oar.LIZ.LIZ.getCommonConfig().getLocalVideoPath(str);
    }

    public final void LJIIIIZZ(List<C1482660oga> list) {
        if (C1474810oTv.LJLJI() && this.LJIIIZ) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                c1477400oY6.LIZIZ(this.LJFF);
                c1477400oY6.LIZJ(this.LJFF, "reverse");
                return;
            }
            return;
        }
        if (C1474810oTv.LJJJJIZL() && this.LJIIJ.LJ) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY62 = C1477400oY6.LJJJJI;
                c1477400oY62.LIZIZ(this.LJFF);
                c1477400oY62.LIZJ(this.LJFF, "fast");
            }
            this.LJIIJ.LIZLLL = new ARunnableS92S0200000_23(list, this, 89);
            return;
        }
        this.LJI.submit(new ARunnableS92S0200000_23(list, this, 90));
    }

    public static int LJII(SimVideoUrlModel simVideoUrlModel, String str) {
        if (C1478160oZK.LIZ().isCache(simVideoUrlModel)) {
            return C1478160oZK.LIZ().LJJLIIIJJI(simVideoUrlModel);
        }
        if (PreloadSessionManager.LIZIZ.LIZ(str) == null) {
            return -2;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bd  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // X.InterfaceC583260MuC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.Object r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1482670ogb.LIZIZ(java.lang.Object, java.lang.String):void");
    }

    public final void LJI(long j, long j2) {
        List listLJIIJ = LJIIJ();
        ArrayList arrayList = new ArrayList();
        for (C1482660oga c1482660oga : (ArrayList) listLJIIJ) {
            if (100 * j2 >= ((long) c1482660oga.LIZ) * j) {
                arrayList.add(c1482660oga);
            }
        }
        if (arrayList.isEmpty()) {
            if (C1474810oTv.LJL()) {
                C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                c1477400oY6.LIZIZ(this.LJFF);
                c1477400oY6.LIZJ(this.LJFF, "notaskbegin");
                return;
            }
            return;
        }
        LJIIIIZZ(arrayList);
    }
}
