package X;

import Y.ARunnableS56S0300000_23;
import Y.ARunnableS92S0200000_23;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigPage;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigPageLife;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AwS73S1000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pLH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507890pLH {
    public static final C1508060pLY LIZJ = new C1508060pLY();
    public static C1507890pLH LIZLLL;
    public final BlockingQueue<C1507990pLR> LIZ;
    public final C1507970pLP LIZIZ;

    public final String LIZLLL() {
        return this.LIZIZ.LJIIJ;
    }

    public C1507890pLH() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.LIZ = linkedBlockingQueue;
        this.LIZIZ = new C1507970pLP(linkedBlockingQueue);
        new C1507920pLK();
        if (C1507840pLC.LIZJ()) {
            C1507830pLB.LJFF(new InterfaceC2173208fK() { // from class: X.0pLI
                @Override // X.InterfaceC2173208fK
                public final void LIZ(List<String> list) {
                }

                @Override // X.InterfaceC2173208fK
                public final void LJI(String str) {
                    EcomLoadRetreatConfigPageLife ecomLoadRetreatConfigPageLife;
                    C1507970pLP c1507970pLP = this.LIZ.LIZIZ;
                    EcomLoadRetreatConfigPage ecomLoadRetreatConfigPage = C1507840pLC.LIZIZ().pages.get(str);
                    if (ecomLoadRetreatConfigPage != null) {
                        c1507970pLP.getClass();
                        ecomLoadRetreatConfigPageLife = ecomLoadRetreatConfigPage.enter;
                    } else {
                        ecomLoadRetreatConfigPageLife = null;
                    }
                    if (!Intrinsics.LJFF(c1507970pLP.LIZLLL, ecomLoadRetreatConfigPageLife)) {
                        c1507970pLP.LIZIZ.submit(new ARunnableS56S0300000_23(ecomLoadRetreatConfigPage, c1507970pLP, ecomLoadRetreatConfigPageLife, 21));
                    }
                }

                @Override // X.InterfaceC2173208fK
                public final void LJ(String str, String str2) {
                    C1507970pLP c1507970pLP = this.LIZ.LIZIZ;
                    if (!Intrinsics.LJFF(c1507970pLP.LIZLLL, null)) {
                        c1507970pLP.LIZIZ.submit(new ARunnableS56S0300000_23(null, c1507970pLP, null, 21));
                    }
                }
            });
        }
    }

    public final void LIZ(List<C1507990pLR> list) {
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((C1507990pLR) it2.next()).LJIILJJIL = System.currentTimeMillis();
        }
        this.LIZ.addAll(list);
        this.LIZIZ.LIZ("add batch", false);
    }

    public final String LIZIZ(C1507990pLR c1507990pLR) {
        c1507990pLR.LJIILJJIL = System.currentTimeMillis();
        this.LIZ.add(c1507990pLR);
        this.LIZIZ.LIZ("add", false);
        return c1507990pLR.LJIILIIL;
    }

    public final void LIZJ(String str) {
        CopyOnWriteArraySet<InterfaceC1507880pLG> copyOnWriteArraySet;
        C1507970pLP c1507970pLP = this.LIZIZ;
        c1507970pLP.getClass();
        c1507970pLP.LIZIZ.submit(new ARunnableS92S0200000_23(c1507970pLP, new AwS73S1000000_23(str, 13), 98));
        if (C1507840pLC.LIZ.enable) {
            C2232408os c2232408os = C1507830pLB.LIZ;
            String strLIZJ = C1507830pLB.LIZJ(str);
            if (strLIZJ != null && (copyOnWriteArraySet = C1507830pLB.LJIIJ.get(strLIZJ)) != null) {
                Iterator<InterfaceC1507880pLG> it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(strLIZJ);
                }
            }
        }
    }

    public static final void LJ(String str, String str2, String str3, String str4, boolean z) throws JSONException {
        if (C1505950pI9.LJFF()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stage", "hit");
            jSONObject.put("is_cache", z ? 1 : 0);
            jSONObject.put("resource_id", str4);
            jSONObject.put("page_name", str);
            jSONObject.put("preload_type", str3);
            jSONObject.put("preload_name", str2);
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_common_preload_hit", jSONObject);
        }
    }
}
