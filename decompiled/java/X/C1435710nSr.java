package X;

import com.ss.android.ugc.aweme.service.IIMMediaCreativeService;
import java.util.Iterator;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435710nSr extends AbstractC1434490nQt {
    public InterfaceC1435810nT1 LLILZLL;
    public C1431070nLN LLIZ;
    public C1435240nS6 LLIZLLLIL;
    public C1434960nRe LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1069));

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.AUTH_KEY;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object next;
        this.LLIZ = c1431070nLN;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            C1434960nRe c1434960nRe = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof C1435240nS6) {
                if (next2 != null) {
                    this.LLIZLLLIL = (C1435240nS6) next2;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next3 = it3.next();
                        if (next3 instanceof C1434960nRe) {
                            if (next3 != null) {
                                this.LLJ = (C1434960nRe) next3;
                                Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next = it4.next();
                                        if (next == null || (next instanceof InterfaceC1435810nT1)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                if (!(next instanceof InterfaceC1435810nT1)) {
                                    next = null;
                                }
                                this.LLILZLL = (InterfaceC1435810nT1) next;
                                ((C1435510nSX) this.LLJI.getValue()).LIZIZ();
                                IIMMediaCreativeService iIMMediaCreativeServiceLJIILIIL = C912070ZqH.LIZIZ.LJIILIIL();
                                C1434960nRe c1434960nRe2 = this.LLJ;
                                if (c1434960nRe2 != null) {
                                    c1434960nRe = c1434960nRe2;
                                }
                                iIMMediaCreativeServiceLJIILIIL.LJ(c1434960nRe.LIZ.getUploadScene(), new AwS601S0100000_22(this, 866), new AwS601S0100000_22(this, 867), false);
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.creation.config.DMMediaPublishResult");
    }
}
