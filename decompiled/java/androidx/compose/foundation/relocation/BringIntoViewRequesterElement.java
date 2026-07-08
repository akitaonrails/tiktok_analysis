package androidx.compose.foundation.relocation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1692060u8K;
import X.C1697510uH7;
import X.InterfaceC1684400tvy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class BringIntoViewRequesterElement extends AbstractC1685820tyG<C1692060u8K> {
    public final InterfaceC1684400tvy LIZIZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1692060u8K(this.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public BringIntoViewRequesterElement(InterfaceC1684400tvy interfaceC1684400tvy) {
        this.LIZIZ = interfaceC1684400tvy;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1692060u8K c1692060u8K = (C1692060u8K) abstractC20055413dY;
        InterfaceC1684400tvy interfaceC1684400tvy = this.LIZIZ;
        InterfaceC1684400tvy interfaceC1684400tvy2 = c1692060u8K.LLJJ;
        if (interfaceC1684400tvy2 instanceof C1697510uH7) {
            ((C1697510uH7) interfaceC1684400tvy2).LIZ.LJIIL(c1692060u8K);
        }
        if (interfaceC1684400tvy instanceof C1697510uH7) {
            ((C1697510uH7) interfaceC1684400tvy).LIZ.LIZLLL(c1692060u8K);
        }
        c1692060u8K.LLJJ = interfaceC1684400tvy;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof BringIntoViewRequesterElement) && Intrinsics.LJFF(this.LIZIZ, ((BringIntoViewRequesterElement) obj).LIZIZ)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
