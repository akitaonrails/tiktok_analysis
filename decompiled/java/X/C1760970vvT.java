package X;

import Y.ARunnableS126S0100000_26;
import Y.ARunnableS95S0200000_26;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerCountdown;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760970vvT {
    public static final HashMap<String, C1760970vvT> LJIILIIL = new HashMap<>();
    public final String LIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public final List<InterfaceC1631620sYq<Integer, Integer, Long, Unit>> LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final ARunnableS126S0100000_26 LJIIL;
    public long LIZIZ = -1;
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            long r3 = r6.LIZLLL
            long r1 = r6.LJ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L36
            r0 = 1
            r6.LJIIIZ = r0
            long r1 = r1 - r3
            r6.LIZIZ = r1
        Le:
            java.util.List<X.0sYq<java.lang.Integer, java.lang.Integer, java.lang.Long, kotlin.Unit>> r0 = r6.LJII
            java.util.Iterator r5 = r0.iterator()
        L14:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r4 = r5.next()
            X.0sYq r4 = (X.InterfaceC1631620sYq) r4
            int r0 = r6.LJIIIZ
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            int r0 = r6.LJIIJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            long r0 = r6.LIZIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.invoke(r3, r2, r0)
            goto L14
        L36:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L47
            long r1 = r6.LJFF
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L47
            r0 = 2
            r6.LJIIIZ = r0
            long r1 = r1 - r3
            r6.LIZIZ = r1
            goto Le
        L47:
            r0 = 0
            r6.LIZIZ = r0
            r0 = 3
            r6.LJIIIZ = r0
            goto Le
        L4f:
            int r0 = r6.LJIIIZ
            r6.LJIIJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1760970vvT.LIZ():void");
    }

    public final void LIZIZ() {
        BPEAHandler bPEAHandler = this.LJI;
        ARunnableS126S0100000_26 aRunnableS126S0100000_26 = this.LJIIL;
        if (aRunnableS126S0100000_26 == null) {
            aRunnableS126S0100000_26 = null;
        }
        bPEAHandler.removeCallbacks(aRunnableS126S0100000_26);
    }

    public C1760970vvT(String str) {
        List<InterfaceC1631620sYq<Integer, Integer, Long, Unit>> arrayList;
        this.LIZ = str;
        if (C077D.LIZ()) {
            arrayList = new CopyOnWriteArrayList<>();
        } else {
            arrayList = new ArrayList<>();
        }
        this.LJII = arrayList;
        this.LJIIIIZZ = 1000L;
        this.LJIIL = new ARunnableS126S0100000_26(this, 89);
    }

    public final void LIZJ(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Long, Unit> interfaceC1631620sYq) {
        if (interfaceC1631620sYq != null) {
            this.LJII.remove(interfaceC1631620sYq);
        }
    }

    public final void LIZLLL(PromotionWaist promotionWaist) {
        BannerComponent bannerComponent;
        BannerCountdown bannerCountdown;
        BannerComponent bannerComponent2 = promotionWaist.tailComponent;
        if ((bannerComponent2 == null || (bannerCountdown = bannerComponent2.bannerCountdown) == null) && ((bannerComponent = promotionWaist.headComponent) == null || (bannerCountdown = bannerComponent.bannerCountdown) == null)) {
            return;
        }
        this.LIZJ = true;
        C786410Ut5.LJJZZIII(this.LJI, new ARunnableS95S0200000_26(this, bannerCountdown, 37));
    }
}
