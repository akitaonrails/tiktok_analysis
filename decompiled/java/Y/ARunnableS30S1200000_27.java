package Y;

import X.AbstractC808800Vo6;
import X.C1792220wjs;
import X.C1794640wnm;
import X.C1847770yBT;
import X.C1847960yBm;
import X.C1848090yBz;
import X.C1870150ylZ;
import X.C1C7U;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2363609Ny;
import X.C808790Vo5;
import X.C829590WgX;
import X.EnumC1791830wjF;
import X.EnumC1847910yBh;
import X.InterfaceC1794150wmz;
import X.InterfaceC1848350yCP;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS30S1200000_27 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InterfaceC1848350yCP interfaceC1848350yCP;
        JSONObject jSONObject = new JSONObject(((C1848090yBz) this.l1).LIZIZ);
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("event=");
            sbLIZ.append(this.s0);
            sbLIZ.append(", all_params=");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1847960yBm c1847960yBm = C1847960yBm.LJII;
        if (c1847960yBm != null && (interfaceC1848350yCP = c1847960yBm.LIZJ) != null) {
            interfaceC1848350yCP.LIZ(this.s0, jSONObject, (EnumC1847910yBh) this.l2);
        }
        C1848090yBz c1848090yBz = (C1848090yBz) this.l1;
        c1848090yBz.LIZIZ.clear();
        c1848090yBz.LIZ = null;
        LinkedList<C1848090yBz> linkedList = C1848090yBz.LIZJ;
        synchronized (linkedList) {
            try {
                if (linkedList.size() < 10) {
                    linkedList.add(c1848090yBz);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r13 = this;
            X.013C r8 = new X.013C
            r8.<init>()
            java.lang.Object r0 = r13.l1
            com.ss.android.ugc.aweme.tako.ui.TakoContentAssem r0 = (com.ss.android.ugc.aweme.tako.ui.TakoContentAssem) r0
            X.15jv r1 = r0.LLJJL
            if (r1 == 0) goto L1e
            android.graphics.Rect r0 = r0.LLLFF
            X.0yXG r1 = X.C1861260yXE.LIZ(r1, r0)
            X.0yXG r0 = X.EnumC1861280yXG.PARTIAL_BOTTOM
            if (r1 == r0) goto L1b
            X.0yXG r0 = X.EnumC1861280yXG.ABOVE_BOTTOM
            if (r1 != r0) goto L1e
        L1b:
            r0 = 1
            r8.element = r0
        L1e:
            java.lang.Object r0 = r13.l1
            com.ss.android.ugc.aweme.tako.ui.TakoContentAssem r0 = (com.ss.android.ugc.aweme.tako.ui.TakoContentAssem) r0
            X.0Q7z r1 = X.C1558520qew.LJIIL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility> r0 = com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility.class
            r12 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r12)
            com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility r0 = (com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility) r0
            if (r0 == 0) goto L9b
            X.13LC r0 = r0.T71()
            if (r0 == 0) goto L9b
            X.0sDA r2 = r0.LIZIZ()
            X.0ybP r2 = (X.C1863850ybP) r2
        L3d:
            java.lang.Object r0 = r13.l1
            com.ss.android.ugc.aweme.tako.ui.TakoContentAssem r0 = (com.ss.android.ugc.aweme.tako.ui.TakoContentAssem) r0
            X.0Q7z r1 = X.C1558520qew.LJIIL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility> r0 = com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r12)
            com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility r0 = (com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility) r0
            if (r0 == 0) goto L55
            java.lang.String r9 = r0.nZ0()
            if (r9 != 0) goto L57
        L55:
            java.lang.String r9 = "full_screen"
        L57:
            if (r2 == 0) goto L99
            java.lang.String r3 = r2.LLILZIL
        L5b:
            java.lang.String r5 = ""
            if (r3 != 0) goto L60
            r3 = r5
        L60:
            if (r2 == 0) goto L66
            java.lang.String r10 = r2.LLILZLL
            if (r10 != 0) goto L67
        L66:
            r10 = r5
        L67:
            if (r2 == 0) goto L97
            java.lang.String r11 = r2.LLIZ
            java.lang.String r4 = r2.LL
            if (r4 != 0) goto L70
        L6f:
            r4 = r5
        L70:
            if (r2 == 0) goto L77
            java.lang.String r0 = r2.LLILLJJLI
            if (r0 == 0) goto L77
            r5 = r0
        L77:
            java.lang.Object r0 = r13.l2
            X.0Cre r0 = (X.C326880Cre) r0
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r0 = r0.LLILLL
            if (r0 == 0) goto L95
            java.lang.String r6 = r0.replyUuid
        L83:
            java.lang.String r7 = r13.s0
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0CjF r2 = new X.0CjF
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r12, r12, r2, r0)
            return
        L95:
            r6 = r12
            goto L83
        L97:
            r11 = r12
            goto L6f
        L99:
            r3 = r12
            goto L5b
        L9b:
            r2 = r12
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS30S1200000_27.LIZ$1():void");
    }

    public final void LIZ$2() {
        new C808790Vo5();
        ArrayList arrayList = new ArrayList();
        Map map = (Map) this.l1;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        try {
            ((InterfaceC1794150wmz) this.l2).onResponse(AbstractC808800Vo6.LIZ.LIZLLL(this.s0, arrayList, null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int responseCode = th instanceof C829590WgX ? th.getResponseCode() : -100;
            InterfaceC1794150wmz interfaceC1794150wmz = (InterfaceC1794150wmz) this.l2;
            C1792220wjs c1792220wjs = new C1792220wjs();
            c1792220wjs.LIZ = 1;
            c1792220wjs.LIZIZ = responseCode;
            c1792220wjs.LJ = th.getMessage();
            interfaceC1794150wmz.LIZ(c1792220wjs);
        }
    }

    public static final void run$0(ARunnableS30S1200000_27 aRunnableS30S1200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("GamePartnershipGamePinCardWidget@3fec.updateShowGameCard$1");
        try {
            GamePartnershipGamePinCardWidget gamePartnershipGamePinCardWidget = (GamePartnershipGamePinCardWidget) aRunnableS30S1200000_27.l1;
            C1870150ylZ c1870150ylZ = (C1870150ylZ) aRunnableS30S1200000_27.l2;
            String str = aRunnableS30S1200000_27.s0;
            gamePartnershipGamePinCardWidget.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showPinCard source=");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ));
            gamePartnershipGamePinCardWidget.F1(c1870150ylZ, true, str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GamePartnershipGamePinCardWidget@3fec.updateShowGameCard$1");
    }

    public static final void run$1(ARunnableS30S1200000_27 aRunnableS30S1200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("AppWidgetUtil@7643.notifyCheckAppWidgetState$1");
        try {
            Intent intent = new Intent(aRunnableS30S1200000_27.s0);
            C2363609Ny c2363609Ny = C2363609Ny.LIZ;
            Context context = (Context) aRunnableS30S1200000_27.l1;
            List list = (List) aRunnableS30S1200000_27.l2;
            c2363609Ny.getClass();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((AppWidgetProvider) it2.next()).onReceive(context, intent);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AppWidgetUtil@7643.notifyCheckAppWidgetState$1");
    }

    public static final void run$2(ARunnableS30S1200000_27 aRunnableS30S1200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("EventReporter@8b5d.report$1");
        try {
            aRunnableS30S1200000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EventReporter@8b5d.report$1");
    }

    public static final void run$3(ARunnableS30S1200000_27 aRunnableS30S1200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("AddGeneralAnchorMethod@89f7.sendDefaultEvents$1");
        try {
            C2344009Gk c2344009Gk = (C2344009Gk) aRunnableS30S1200000_27.l1;
            AnchorListManager anchorListManager = AnchorListManager.LIZ;
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) aRunnableS30S1200000_27.l2;
            anchorListManager.getClass();
            String strLJIIIIZZ = AnchorListManager.LJIIIIZZ(anchorPublishStruct);
            c2344009Gk.getClass();
            c2344009Gk.LJIIIIZZ("anchor_type", strLJIIIIZZ);
            c2344009Gk.LJIIIIZZ("anchor_entry", aRunnableS30S1200000_27.s0);
            C20684815ws.LJIILLIIL("choose_anchor", c2344009Gk.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AddGeneralAnchorMethod@89f7.sendDefaultEvents$1");
    }

    public static final void run$4(ARunnableS30S1200000_27 aRunnableS30S1200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoContentAssem@bd9.bind$2$10");
        try {
            aRunnableS30S1200000_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoContentAssem@bd9.bind$2$10");
    }

    public static final void run$5(ARunnableS30S1200000_27 aRunnableS30S1200000_27) {
        C1794640wnm c1794640wnm = (C1794640wnm) aRunnableS30S1200000_27.l1;
        EnumC1791830wjF enumC1791830wjF = (EnumC1791830wjF) aRunnableS30S1200000_27.l2;
        String str = aRunnableS30S1200000_27.s0;
        c1794640wnm.getClass();
        C1C7U.LIZ("IapObserverServiceImpl@105b.notifyBillingConfigCallback$1L");
        c1794640wnm.LIZ(enumC1791830wjF, str);
        C1C7U.LIZIZ("IapObserverServiceImpl@105b.notifyBillingConfigCallback$1L");
    }

    public static final void run$6(ARunnableS30S1200000_27 aRunnableS30S1200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("NetworkService@c742.post$1");
        try {
            aRunnableS30S1200000_27.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NetworkService@c742.post$1");
    }

    public ARunnableS30S1200000_27(Context context, List list, int i) {
        this.$t = i;
        this.s0 = "com.ss.android.ugc.tiktok.app.widget.SEARCH_WIDGET_CHECK_STATE";
        this.l1 = context;
        this.l2 = list;
    }

    public ARunnableS30S1200000_27(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }

    public ARunnableS30S1200000_27(C1848090yBz c1848090yBz, String str, C1847770yBT c1847770yBT, EnumC1847910yBh enumC1847910yBh, int i) {
        this.$t = i;
        this.l1 = c1848090yBz;
        this.s0 = str;
        this.l2 = enumC1847910yBh;
    }
}
