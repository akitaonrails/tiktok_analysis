package Y;

import X.AbstractC1552040qUU;
import X.C08VH;
import X.C098200Yq;
import X.C13LP;
import X.C1468940oKS;
import X.C1507960pLO;
import X.C1507970pLP;
import X.C1507980pLQ;
import X.C1526100poe;
import X.C1527010pq7;
import X.C1527020pq8;
import X.C1527060pqC;
import X.C1527890prX;
import X.C1534030q1R;
import X.C1551200qT8;
import X.C1551960qUM;
import X.C1552230qUn;
import X.C1552410qV5;
import X.C1553130qWF;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.EnumC1526160pok;
import X.EnumC1526180pom;
import X.EnumC1527170pqN;
import X.EnumC1527210pqR;
import X.EnumC2281151EQn;
import X.InterfaceC1526120pog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;
import com.ss.ttm.player.TraitObject;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import com.tts.oecverify.BdTuring;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS29S0201000_23 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    public static final void run$1(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        C1468940oKS.LLZZZZ((C1468940oKS) aRunnableS29S0201000_23.l0, aRunnableS29S0201000_23.i2, (TraitObject) aRunnableS29S0201000_23.l1);
    }

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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            C1552230qUn c1552230qUnLJIIIIZZ = C1551960qUM.LJIIIIZZ(((C1552410qV5) this.l1).LIZ, null);
            c1552230qUnLJIIIIZZ.setPipelineData("req_type", 4);
            c1552230qUnLJIIIIZZ.setPipelineData("sync_task_id", Integer.valueOf(this.i2));
            c1552230qUnLJIIIIZZ.proceed((List) this.l0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LIZ("gecko-debug-tag", "sync download CDN channel err", e);
        }
    }

    public static final void run$0(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        boolean zLIZ;
        C1C7U.LIZ("CronetWebsocketConnection@25f3.onMessageReceived$1");
        try {
            try {
                CronetWebsocketConnection cronetWebsocketConnection = (CronetWebsocketConnection) aRunnableS29S0201000_23.l1;
                cronetWebsocketConnection.LIZIZ.onMessageReceived(cronetWebsocketConnection, (ByteBuffer) aRunnableS29S0201000_23.l0, aRunnableS29S0201000_23.i2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C08VH.LIZ("Exception in callback: ", e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CronetWebsocketConnection@25f3.onMessageReceived$1");
    }

    public static final void run$10(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS29S0201000_23.l0;
        List list = (List) aRunnableS29S0201000_23.l1;
        int i = aRunnableS29S0201000_23.i2;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.preloadSub$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJJLIIIJLJLI(i, list);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.preloadSub$2L$1L");
    }

    public static final void run$2(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        C1468940oKS c1468940oKS = (C1468940oKS) aRunnableS29S0201000_23.l0;
        EnumC2281151EQn enumC2281151EQn = (EnumC2281151EQn) aRunnableS29S0201000_23.l1;
        int i = aRunnableS29S0201000_23.i2;
        c1468940oKS.getClass();
        C1C7U.LIZ("TTVideoEngineAsyncImpl@8424.notifyVideoStreamBitrateChanged$1L");
        c1468940oKS.LLLLLZL.LJFF(i, enumC2281151EQn);
        C1C7U.LIZIZ("TTVideoEngineAsyncImpl@8424.notifyVideoStreamBitrateChanged$1L");
    }

    public static final void run$3(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        boolean zLIZ;
        C1C7U.LIZ("DiscreteMeta@33ad.tryCreateAndTurnPage$1");
        try {
            C1534030q1R c1534030q1R = (C1534030q1R) aRunnableS29S0201000_23.l0;
            byte[] bArr = (byte[]) aRunnableS29S0201000_23.l1;
            try {
                c1534030q1R.LJIILLIIL(bArr, bArr.length, aRunnableS29S0201000_23.i2 - bArr.length);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DiscreteMeta@33ad.tryCreateAndTurnPage$1");
    }

    public static final void run$4(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        C1526100poe c1526100poe = (C1526100poe) aRunnableS29S0201000_23.l0;
        C1527060pqC c1527060pqC = (C1527060pqC) aRunnableS29S0201000_23.l1;
        int i = aRunnableS29S0201000_23.i2;
        C1C7U.LIZ("ProtocolProcessorV4@8cad.process$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        c1526100poe.getClass();
        sbLIZ.append("[ProtocolProcessorV4] ");
        sbLIZ.append("receive package -> ");
        sbLIZ.append(c1527060pqC);
        C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c1527060pqC == null) {
            C1527890prX.LIZJ(Intrinsics.LJIIJJI("protocol is null", "[ProtocolProcessorV4] "));
        } else {
            C1527010pq7 c1527010pq7 = c1527060pqC.header;
            if (c1527010pq7 == null) {
                C1527890prX.LIZIZ(Intrinsics.LJIIJJI("header is null", "[ProtocolProcessorV4] "));
            } else if (c1527010pq7.version != EnumC1527210pqR.V4) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[ProtocolProcessorV4] ");
                sbLIZ2.append("version is ");
                sbLIZ2.append(c1527060pqC.header.version);
                sbLIZ2.append(", ignore");
                C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                EnumC1526180pom enumC1526180pom = c1527010pq7.reason;
                if (enumC1526180pom != null && enumC1526180pom != EnumC1526180pom.Def) {
                    try {
                        for (Object obj : (List) c1526100poe.LJ.getValue()) {
                            if (((InterfaceC1526120pog) obj).LIZ(c1527060pqC.header.reason)) {
                                ((InterfaceC1526120pog) obj).LIZIZ(c1527060pqC.header, c1527060pqC.topics);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1527890prX.LIZIZ(Intrinsics.LJIIJJI(th, "dispatch by reason err: "));
                    }
                }
                EnumC1526160pok enumC1526160pok = c1527060pqC.header.ctrl;
                if (enumC1526160pok != null && enumC1526160pok != EnumC1526160pok.Default) {
                    for (InterfaceC1526120pog interfaceC1526120pog : (List) c1526100poe.LIZLLL.getValue()) {
                        if (interfaceC1526120pog.LIZ(c1527060pqC.header.ctrl)) {
                            interfaceC1526120pog.LIZIZ(c1527060pqC.header, c1527060pqC.topics);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                List<C1527020pq8> list = c1527060pqC.topics;
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<C1527020pq8> arrayList2 = new ArrayList();
                    for (C1527020pq8 c1527020pq8 : c1527060pqC.topics) {
                        if (c1527020pq8.flag == EnumC1527170pqN.Sync) {
                            arrayList.add(c1527020pq8);
                        } else {
                            arrayList2.add(c1527020pq8);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        c1526100poe.LIZIZ(i, ((C1527020pq8) C13LP.LJJJJZI(arrayList)).flag, c1527060pqC.header, arrayList);
                    }
                    EnumC1527170pqN enumC1527170pqN = ((C1527020pq8) C13LP.LJJJJZI(c1527060pqC.topics)).flag;
                    ArrayList arrayList3 = new ArrayList();
                    for (C1527020pq8 c1527020pq82 : arrayList2) {
                        if (c1527020pq82.flag == enumC1527170pqN) {
                            arrayList3.add(c1527020pq82);
                        } else {
                            if (enumC1527170pqN != null && !arrayList3.isEmpty()) {
                                c1526100poe.LIZIZ(i, enumC1527170pqN, c1527060pqC.header, arrayList3);
                            }
                            arrayList3 = new ArrayList();
                            arrayList3.add(c1527020pq82);
                            enumC1527170pqN = c1527020pq82.flag;
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        c1526100poe.LIZIZ(i, enumC1527170pqN, c1527060pqC.header, arrayList3);
                    }
                } else {
                    C1527890prX.LIZJ(Intrinsics.LJIIJJI("topics is null", "[ProtocolProcessorV4] "));
                }
            }
        }
        C1C7U.LIZIZ("ProtocolProcessorV4@8cad.process$1L");
    }

    public static final void run$5(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        boolean zLIZ;
        C1C7U.LIZ("SyncManager@2ac2.downloadZipFullChannel$1");
        try {
            aRunnableS29S0201000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SyncManager@2ac2.downloadZipFullChannel$1");
    }

    public static final void run$6(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        boolean zLIZ;
        C1C7U.LIZ("ECPreloadTaskDispatcherV2@b531.batchExecute$1$1$onStateChange$1");
        try {
            if (C1507960pLO.LIZ(aRunnableS29S0201000_23.i2)) {
                C1507970pLP c1507970pLP = (C1507970pLP) aRunnableS29S0201000_23.l0;
                C1507980pLQ c1507980pLQ = (C1507980pLQ) aRunnableS29S0201000_23.l1;
                c1507970pLP.LIZJ.remove(c1507980pLQ);
                if (!c1507980pLQ.LJ()) {
                    c1507970pLP.LIZ("finish", false);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECPreloadTaskDispatcherV2@b531.batchExecute$1$1$onStateChange$1");
    }

    public static final void run$7(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        boolean zLIZ;
        C1C7U.LIZ("AbandonChannelClenUtils@8e06.clean$1");
        try {
            try {
                C1551200qT8.LIZJ(aRunnableS29S0201000_23.i2, (List) aRunnableS29S0201000_23.l0, (AbstractC1552040qUU) aRunnableS29S0201000_23.l1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1553130qWF.LJ("clean-channel", "", e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbandonChannelClenUtils@8e06.clean$1");
    }

    public static final void run$8(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS29S0201000_23.l0;
        List list = (List) aRunnableS29S0201000_23.l1;
        int i = aRunnableS29S0201000_23.i2;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.preloadSub$1L");
        videoPreloadManagerAsync.LJJZZI().LJJLIIIJLJLI(i, list);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.preloadSub$1L");
    }

    public static final void run$9(ARunnableS29S0201000_23 aRunnableS29S0201000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS29S0201000_23.l0;
        List list = (List) aRunnableS29S0201000_23.l1;
        int i = aRunnableS29S0201000_23.i2;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.preloadSub$2L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS29S0201000_23(i, videoPreloadManagerAsync, list, 10));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.preloadSub$2L");
    }

    public ARunnableS29S0201000_23(VideoPreloadManagerAsync videoPreloadManagerAsync, List list, int i) {
        this.$t = i;
        this.l0 = videoPreloadManagerAsync;
        this.l1 = list;
        this.i2 = Integer.MAX_VALUE;
    }

    public ARunnableS29S0201000_23(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
