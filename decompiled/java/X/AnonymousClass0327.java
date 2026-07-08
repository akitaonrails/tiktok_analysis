package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0327, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0327 extends C035N<C733202te> implements C032G, C032N {
    public final C032I LIZJ;
    public C033M LJFF;
    public C033K LIZLLL = new C033K() { // from class: X.032H
        @Override // X.C033K
        public final InterfaceC769902zZ LIZ(Class<? extends InterfaceC769902zZ> cls) {
            return null;
        }
    };
    public final C032A LJ = new C032A();
    public final Map<AnonymousClass0047, C032J> LJI = new LinkedHashMap();
    public final Map<C124800di, C032J> LJII = new LinkedHashMap();
    public final List<C032M> LJIIIIZZ = new ArrayList();

    @Override // X.C032G
    public final void LJJIIZI() {
        List listLLIIII;
        synchronized (this) {
            try {
                listLLIIII = C13LP.LLIIII(this.LJIIIIZZ);
                ((ArrayList) this.LJIIIIZZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((C032M) it2.next()).execute();
        }
    }

    @Override // X.C035N, X.C036G
    public final void LJJJJZ(PaymentInfo paymentInfo, BillInfoData billInfoData, boolean z) {
    }

    public final void LJL() {
        Map mapLJIIZILJ;
        Map mapLJIIZILJ2;
        synchronized (this) {
            try {
                mapLJIIZILJ = C2097608Jq.LJIIZILJ(this.LJI);
                mapLJIIZILJ2 = C2097608Jq.LJIIZILJ(this.LJII);
                ((LinkedHashMap) this.LJI).clear();
                ((LinkedHashMap) this.LJII).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = mapLJIIZILJ.entrySet().iterator();
        while (it2.hasNext()) {
            ((Map.Entry) it2.next()).getValue().getClass();
        }
        Iterator it3 = mapLJIIZILJ2.entrySet().iterator();
        while (it3.hasNext()) {
            ((Map.Entry) it3.next()).getValue().getClass();
        }
    }

    @Override // X.C035N
    public final InterfaceC729102sz LJJZ() {
        return new C733202te(0);
    }

    @Override // X.C035N, X.InterfaceC2257711DYj
    public final void onDestroy() {
        LJL();
    }

    public AnonymousClass0327(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        this.LIZJ = orderSubmitAssemViewModel;
    }

    @Override // X.C032G
    public final void LJJJJJL(C035R c035r) {
        this.LIZLLL = c035r;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Type inference failed for: r10v6, types: [X.032D] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v8, types: [X.032E] */
    @Override // X.C032G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.AbstractC723102s1> LJJLIIIJJIZ(X.AnonymousClass0328 r20) {
        /*
            Method dump skipped, instruction units count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0327.LJJLIIIJJIZ(X.0328):java.util.List");
    }
}
