package X;

import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0sJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1622370sJv implements InterfaceC1622080sJS, InterfaceC1623110sL7, InterfaceC1447100nlE {
    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    @Override // X.InterfaceC1447100nlE
    public final FaceStickerBean LIZ(Effect effect) {
        return ((C1622410sJz) this).LLJILLL;
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        InterfaceC1622430sK1 interfaceC1622430sK1LIZ;
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
            Effect effect = ((C1627370sRz) abstractC1627380sS0).LIZ;
            C1622410sJz c1622410sJz = (C1622410sJz) this;
            c1622410sJz.LIZIZ();
            c1622410sJz.LLJIJIL = effect;
            Iterator<InterfaceC1622380sJw> it2 = c1622410sJz.LLILLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC1622380sJw next = it2.next();
                    if (next.LIZIZ(effect)) {
                        interfaceC1622430sK1LIZ = next.LIZ(effect);
                        break;
                    }
                } else {
                    interfaceC1622430sK1LIZ = null;
                    break;
                }
            }
            c1622410sJz.LLJILJIL = interfaceC1622430sK1LIZ;
            if (interfaceC1622430sK1LIZ != null) {
                ((ArrayList) c1622410sJz.LLIZLLLIL).add(C23250099c.LIZLLL(c1622410sJz.LLILZLL, null, null, new C0NN9(c1622410sJz, null), 3));
            }
            return c1623370sLXLIZ;
        }
        if (abstractC1627380sS0 instanceof C1627360sRy) {
            if (((C1627360sRy) abstractC1627380sS0).LIZ != null) {
                ((C1622410sJz) this).LIZIZ();
            }
            return interfaceC1622070sJR.LIZ(abstractC1627380sS0);
        }
        throw new C1954807lC();
    }
}
