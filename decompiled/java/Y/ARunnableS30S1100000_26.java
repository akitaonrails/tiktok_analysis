package Y;

import X.AbstractC1732180vB2;
import X.AbstractC1732350vBJ;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1507790pL7;
import X.C1714230ui5;
import X.C1729230v6H;
import X.C1729240v6I;
import X.C1742510vRh;
import X.C1742530vRj;
import X.C1758310vrB;
import X.C1C7U;
import X.C1DD0;
import X.C21312618aq;
import X.C985403tE;
import X.EnumC1334250kpD;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.ab.EquivalentApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.core.services.FullyRenderedLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.AwS175S1100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS30S1100000_26 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        List<C1742530vRj> list;
        Object obj;
        EquivalentApi next;
        FullyRenderedLogger fullyRenderedLogger = (FullyRenderedLogger) this.l1;
        C1742510vRh c1742510vRh = fullyRenderedLogger.LIZJ;
        if (c1742510vRh == null || (list = c1742510vRh.LJI) == null) {
            return;
        }
        String str = this.s0;
        Iterator<C1742530vRj> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1742530vRj next2 = it2.next();
            C1742530vRj c1742530vRj = next2;
            if (!Intrinsics.LJFF(str, c1742530vRj.LIZ)) {
                Iterator<EquivalentApi> it3 = fullyRenderedLogger.LJI().serverEquivalentApiConfig.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (next.equivalentApis.contains(str)) {
                            break;
                        }
                    }
                }
                EquivalentApi equivalentApi = next;
                if (!Intrinsics.LJFF(equivalentApi != null ? equivalentApi.primaryApi : null, c1742530vRj.LIZ)) {
                    continue;
                }
            }
            if (c1742530vRj.LIZLLL == EnumC1334250kpD.NOT_STARTED) {
                obj = next2;
                break;
            }
        }
        C1742530vRj c1742530vRj2 = (C1742530vRj) obj;
        if (c1742530vRj2 != null) {
            c1742530vRj2.LIZLLL = EnumC1334250kpD.STARTED;
            c1742530vRj2.LIZIZ = Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void LIZ$1() {
        AbstractC1732180vB2 abstractC1732180vB2 = (AbstractC1732180vB2) this.l1;
        C1397580mTM c1397580mTM = new C1397580mTM(abstractC1732180vB2.LLILLL);
        C985403tE.LIZ(c1397580mTM, new AwS140S1100000_26(abstractC1732180vB2, this.s0, 29));
        c1397580mTM.LJFF(2131832642);
        c1397580mTM.LIZ(2131832641);
        c1397580mTM.LIZLLL(new AwS605S0100000_26((AbstractC1732180vB2) this.l1, 473));
        new C1397510mTF(c1397580mTM).LIZLLL();
        AbstractC1732180vB2 abstractC1732180vB22 = (AbstractC1732180vB2) this.l1;
        abstractC1732180vB22.LLJILJILJ = true;
        Map<String, String> map = C1729240v6I.LIZ;
        String strLJJIL = abstractC1732180vB22.LJJIL();
        String strLJFF = C1729240v6I.LJFF(((AbstractC1732180vB2) this.l1).LLILZ);
        String strLJJIJLIJ = AbstractC1732180vB2.LJJIJLIJ();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C1729240v6I.LIZ);
        linkedHashMap.put("room_id", strLJJIL);
        linkedHashMap.put("live_status", strLJFF);
        linkedHashMap.put("author_id", strLJJIJLIJ);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_popup_show", linkedHashMap);
    }

    public final void LIZ$2() {
        AbstractC1732350vBJ abstractC1732350vBJ = (AbstractC1732350vBJ) this.l1;
        C1397580mTM c1397580mTM = new C1397580mTM(abstractC1732350vBJ.LLILLL);
        C985403tE.LIZ(c1397580mTM, new AwS140S1100000_26(abstractC1732350vBJ, this.s0, 56));
        c1397580mTM.LJFF(2131832642);
        c1397580mTM.LIZ(2131832641);
        c1397580mTM.LIZLLL(new AwS605S0100000_26((AbstractC1732350vBJ) this.l1, 813));
        new C1397510mTF(c1397580mTM).LIZLLL();
        AbstractC1732350vBJ abstractC1732350vBJ2 = (AbstractC1732350vBJ) this.l1;
        abstractC1732350vBJ2.LLJILLL = true;
        Map<String, String> map = C1729230v6H.LIZ;
        String strLJJIJIIJI = abstractC1732350vBJ2.LJJIJIIJI();
        String str = ((AbstractC1732350vBJ) this.l1).LLILZ == 0 ? "before_live" : "during_live";
        String strLJJIJ = AbstractC1732350vBJ.LJJIJ();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C1729230v6H.LIZ);
        linkedHashMap.put("room_id", strLJJIJIIJI);
        linkedHashMap.put("live_status", str);
        linkedHashMap.put("author_id", strLJJIJ);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_popup_show", linkedHashMap);
    }

    public static final void run$0(ARunnableS30S1100000_26 aRunnableS30S1100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("FullyRenderedLogger@7d0c.onApiStarted$1");
        try {
            aRunnableS30S1100000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullyRenderedLogger@7d0c.onApiStarted$1");
    }

    public static final void run$1(ARunnableS30S1100000_26 aRunnableS30S1100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("ECBillboardBroadcastBaseWidget@1be8.showPopup$1");
        try {
            aRunnableS30S1100000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECBillboardBroadcastBaseWidget@1be8.showPopup$1");
    }

    public static final void run$2(ARunnableS30S1100000_26 aRunnableS30S1100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PoiPlayNumRepository@c8ad.removeUser$1");
        try {
            Keva keva = (Keva) ((C21312618aq) aRunnableS30S1100000_26.l1).LIZ.getValue();
            if (keva != null) {
                keva.erase(aRunnableS30S1100000_26.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiPlayNumRepository@c8ad.removeUser$1");
    }

    public static final void run$3(ARunnableS30S1100000_26 aRunnableS30S1100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PipoVerifyCenterService@3617.reportSdkMonitor$1$1");
        try {
            C1714230ui5.LIZLLL(new AwS175S1100000_26((Map) aRunnableS30S1100000_26.l1, (Map<String, String>) aRunnableS30S1100000_26.s0, (String) 9));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PipoVerifyCenterService@3617.reportSdkMonitor$1$1");
    }

    public static final void run$4(ARunnableS30S1100000_26 aRunnableS30S1100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PlayNumRepository@8784.removeUser$1");
        try {
            ((Keva) ((C1DD0) aRunnableS30S1100000_26.l1).LIZ.getValue()).erase(aRunnableS30S1100000_26.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayNumRepository@8784.removeUser$1");
    }

    public static final void run$5(ARunnableS30S1100000_26 aRunnableS30S1100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$3$1");
        try {
            C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
            Map<String, String> map = ((IPdpStarter.PdpEnterParam) aRunnableS30S1100000_26.l1).pdpPreParam;
            String str = aRunnableS30S1100000_26.s0;
            c1758310vrB.getClass();
            C1758310vrB.LJJJJI(str, map);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfo$3$1");
    }

    public static final void run$6(ARunnableS30S1100000_26 aRunnableS30S1100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$5$1");
        try {
            C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
            Map<String, String> map = ((IPdpStarter.PdpEnterParam) aRunnableS30S1100000_26.l1).pdpPreParam;
            String str = aRunnableS30S1100000_26.s0;
            c1758310vrB.getClass();
            C1758310vrB.LJJJJI(str, map);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpRepositoryOptimized@68d5.fetchProductInfoV2$5$1");
    }

    public static final void run$7(ARunnableS30S1100000_26 aRunnableS30S1100000_26) {
        boolean zLIZ;
        C1C7U.LIZ("SeaLiveBillboardBroadcastBaseWidget@110.showPopup$1");
        try {
            aRunnableS30S1100000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaLiveBillboardBroadcastBaseWidget@110.showPopup$1");
    }

    public ARunnableS30S1100000_26(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
