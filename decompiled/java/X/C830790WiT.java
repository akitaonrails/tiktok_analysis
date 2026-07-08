package X;

import com.tiktok.ttm.TTMParamData;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: renamed from: X.0WiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830790WiT extends C830820WiW {
    public boolean LJ;
    public final ConcurrentLinkedQueue<C830820WiW> LJFF;

    @Override // X.C830820WiW, X.InterfaceC830810WiV
    public final InterfaceC830810WiV LIZ(AwS592S0100000_13 awS592S0100000_13) {
        C830790WiT c830790WiT;
        if (!this.LJ) {
            c830790WiT = new C830790WiT(this.LIZ, this.LIZIZ);
            c830790WiT.LJ = true;
            this.LJFF.add(c830790WiT);
        } else {
            c830790WiT = this;
        }
        c830790WiT.LIZJ.add(C2097608Jq.LJI(new Pair(1, awS592S0100000_13)));
        return c830790WiT;
    }

    @Override // X.C830820WiW
    public final void LIZIZ(TTMParamData tTMParamData) {
        super.LIZIZ(tTMParamData);
        Iterator<C830820WiW> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(tTMParamData);
        }
    }

    @Override // X.C830820WiW
    public final void LIZJ(AbstractC2213701BkW abstractC2213701BkW) {
        super.LIZJ(abstractC2213701BkW);
        Iterator<C830820WiW> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(abstractC2213701BkW);
        }
    }

    public C830790WiT(String str, boolean z) {
        super(str, z);
        this.LJFF = new ConcurrentLinkedQueue<>();
    }
}
