package X;

import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0fTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128720fTi {
    public C1129560fV4 LIZ;
    public boolean LIZIZ = true;

    public static AbstractC1126600fQI LIZ(Gift gift) {
        if (gift.type == 3) {
            return new C2684012c(gift);
        }
        if (gift.LJ()) {
            return new C293001Bo(gift);
        }
        return new C1126040fPO(gift);
    }

    public static boolean LIZLLL(int i) {
        InterfaceC1128210fSt interfaceC1128210fStInst;
        List<Gift> matchGameGifts;
        if (i != 1 || (interfaceC1128210fStInst = GiftManager.inst()) == null || (matchGameGifts = interfaceC1128210fStInst.getMatchGameGifts(i)) == null || matchGameGifts.isEmpty()) {
            return false;
        }
        return ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).kg2();
    }

    public static void LJ(long j, LinkedList linkedList) {
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) it2.next();
            if (abstractC1126600fQI != null) {
                if (abstractC1126600fQI.LJI() == j) {
                    abstractC1126600fQI.LIZJ = true;
                    abstractC1126600fQI.LJIIIIZZ = true;
                } else if (abstractC1126600fQI.LIZJ) {
                    abstractC1126600fQI.LIZJ = false;
                    abstractC1126600fQI.LJIIIIZZ = true;
                } else {
                    abstractC1126600fQI.LJIIIIZZ = false;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> LIZIZ(X.C1129560fV4 r20, java.util.List<? extends com.bytedance.android.livesdk.gift.model.GiftPage> r21) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128720fTi.LIZIZ(X.0fV4, java.util.List):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:399:0x0685, code lost:
    
        if ((!r6.isEmpty()) == false) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0687, code lost:
    
        r9 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x068f, code lost:
    
        if (r9.hasNext() == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0691, code lost:
    
        r5 = r9.next();
        r4 = (X.AbstractC1126600fQI) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0698, code lost:
    
        if (r4 == null) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x069e, code lost:
    
        if (r4.LIZ == 16) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x06a4, code lost:
    
        if (r4.LIZ == 15) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x06aa, code lost:
    
        if (r4.LIZ == 18) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x06b0, code lost:
    
        if (r4.LIZ != 20) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x06bb, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x06bc, code lost:
    
        r5 = (X.AbstractC1126600fQI) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x06be, code lost:
    
        if (r5 == null) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x06c0, code lost:
    
        r0 = r5.LJI();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03f1 A[LOOP:2: B:230:0x03eb->B:232:0x03f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x058b A[PHI: r2
      0x058b: PHI (r2v130 long) = (r2v148 long), (r2v149 long) binds: [B:327:0x0589, B:322:0x057b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedList<X.AbstractC1126600fQI<? extends X.AnonymousClass0054>> LIZJ(com.bytedance.android.livesdk.gift.model.GiftPage r26, X.C1129560fV4 r27, com.bytedance.android.livesdk.gift.model.GiftPage r28) {
        /*
            Method dump skipped, instruction units count: 1777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128720fTi.LIZJ(com.bytedance.android.livesdk.gift.model.GiftPage, X.0fV4, com.bytedance.android.livesdk.gift.model.GiftPage):java.util.LinkedList");
    }
}
