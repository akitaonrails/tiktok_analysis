package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0sJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1622390sJx implements InterfaceC1622080sJS {
    public Effect LL;

    public void LJIJJLI() {
    }

    public void LJIL(C1627370sRz c1627370sRz) {
    }

    public void LJJ() {
    }

    public abstract boolean LJJI(C1627370sRz c1627370sRz);

    public abstract void LJJIFFI();

    public abstract void LJJIII(C1623370sLX c1623370sLX, C1627370sRz c1627370sRz);

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    @Override // X.InterfaceC1622080sJS
    public C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            C1627370sRz c1627370sRz = (C1627370sRz) abstractC1627380sS0;
            if (LJJI(c1627370sRz)) {
                if (!(interfaceC1622070sJR instanceof C1623360sLW)) {
                    LJJ();
                }
                C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(c1627370sRz);
                LJJIII(c1623370sLXLIZ, c1627370sRz);
                this.LL = c1627370sRz.LIZ;
                return c1623370sLXLIZ;
            }
            if (this.LL != null) {
                LJJIFFI();
                this.LL = null;
            }
            C1623370sLX c1623370sLXLIZ2 = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
            if (interfaceC1622070sJR instanceof C1623360sLW) {
                return c1623370sLXLIZ2;
            }
            LJIJJLI();
            return c1623370sLXLIZ2;
        }
        if (abstractC1627380sS0 instanceof C1627360sRy) {
            if (this.LL != null) {
                LJJIFFI();
                this.LL = null;
            }
            C1623370sLX c1623370sLXLIZ3 = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
            if (interfaceC1622070sJR instanceof C1623360sLW) {
                return c1623370sLXLIZ3;
            }
            LJIJJLI();
            return c1623370sLXLIZ3;
        }
        throw new C1954807lC();
    }
}
