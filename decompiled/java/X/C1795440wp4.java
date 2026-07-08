package X;

import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0wp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795440wp4 implements InterfaceC1796310wqT {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ ConsumeIapProductListener LIZJ;
    public final /* synthetic */ C1795340wou LIZLLL;

    @Override // X.InterfaceC1796310wqT
    public final void LIZIZ() {
        boolean z = this.LIZ;
        final String str = this.LIZIZ;
        ConsumeIapProductListener consumeIapProductListener = this.LIZJ;
        if (consumeIapProductListener != null) {
            ((ConcurrentHashMap) this.LIZLLL.LIZLLL).put(str, consumeIapProductListener);
        }
        if (z) {
            new C1796320wqU();
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C1796110wq9 c1796110wq9 = new C1796110wq9(0);
            c1796110wq9.LIZ = str;
            this.LIZLLL.LJIILIIL.LIZ(c1796110wq9, new InterfaceC2200251B9j() { // from class: X.0wpC
                @Override // X.InterfaceC2200251B9j
                public final void LIZIZ(C19885612rG c19885612rG) {
                    C1795440wp4 c1795440wp4 = this.LIZ;
                    String str2 = str;
                    ConsumeIapProductListener consumeIapProductListener2 = (ConsumeIapProductListener) ((ConcurrentHashMap) c1795440wp4.LIZLLL.LIZLLL).get(str2);
                    if (consumeIapProductListener2 != null) {
                        Iterator<Purchase> it2 = c1795440wp4.LIZLLL.LJ.iterator();
                        while (it2.hasNext()) {
                            if (str2.equals(it2.next().LJ())) {
                                consumeIapProductListener2.onConsumeFinished(C1795020woO.LIZ(c19885612rG));
                            }
                        }
                    }
                    ((ConcurrentHashMap) c1795440wp4.LIZLLL.LIZLLL).remove(str2);
                }
            });
            return;
        }
        new C1796330wqV();
        if (str == null) {
            throw new IllegalArgumentException("Purchase token must be set");
        }
        C1796130wqB c1796130wqB = new C1796130wqB(0);
        c1796130wqB.LIZ = str;
        this.LIZLLL.LJIILIIL.LIZIZ(c1796130wqB, new C1BAM() { // from class: X.0wpD
            @Override // X.C1BAM
            public final void LIZLLL(C19885612rG c19885612rG, String str2) {
                C1795440wp4 c1795440wp4 = this.LIZ;
                ConsumeIapProductListener consumeIapProductListener2 = (ConsumeIapProductListener) ((ConcurrentHashMap) c1795440wp4.LIZLLL.LIZLLL).get(str2);
                if (consumeIapProductListener2 != null) {
                    Iterator<Purchase> it2 = c1795440wp4.LIZLLL.LJ.iterator();
                    while (it2.hasNext()) {
                        if (str2.equals(it2.next().LJ())) {
                            consumeIapProductListener2.onConsumeFinished(C1795020woO.LIZ(c19885612rG));
                        }
                    }
                }
                ((ConcurrentHashMap) c1795440wp4.LIZLLL.LIZLLL).remove(str2);
            }
        });
    }

    @Override // X.InterfaceC1796310wqT
    public final void LIZ(C1792840wks c1792840wks) {
        ConsumeIapProductListener consumeIapProductListener = this.LIZJ;
        if (consumeIapProductListener != null) {
            consumeIapProductListener.onConsumeFinished(c1792840wks);
        }
    }

    public C1795440wp4(C1795340wou c1795340wou, boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
        this.LIZLLL = c1795340wou;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = consumeIapProductListener;
    }
}
