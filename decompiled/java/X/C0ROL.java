package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS129S0110000_11;

/* JADX INFO: renamed from: X.0ROL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0ROL<DATA, CONTEXT> extends C0ROM<DATA, CONTEXT> {
    @Override // X.C0ROM
    public final void LJII(C694940RNs c694940RNs) {
        ReusedUIAssem<?> reusedUIAssem;
        this.LIZIZ = false;
        if (c694940RNs != null && (reusedUIAssem = c694940RNs.LIZ) != null) {
            List<AbstractC738140SxQ> children = reusedUIAssem.getChildren();
            AbstractC738140SxQ abstractC738140SxQ = null;
            if (children != null) {
                Iterator<AbstractC738140SxQ> it2 = children.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC738140SxQ next = it2.next();
                    C13IQ<?> c13iqLJFF = LJFF();
                    if (c13iqLJFF != null) {
                        if (next.getClass().isAssignableFrom(C09R7.LIZ(c13iqLJFF))) {
                            abstractC738140SxQ = next;
                            break;
                        }
                    }
                }
                AbstractC738140SxQ abstractC738140SxQ2 = abstractC738140SxQ;
                if (abstractC738140SxQ2 != null) {
                    LJIIIIZZ(abstractC738140SxQ2, false, c694940RNs);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(AbstractC738140SxQ abstractC738140SxQ, boolean z, C694940RNs c694940RNs) {
        ReusedUIAssem reusedUIAssem;
        C0ROU c0rou;
        if ((abstractC738140SxQ instanceof ReusedUIAssem) && (reusedUIAssem = (ReusedUIAssem) abstractC738140SxQ) != 0) {
            new AwS129S0110000_11(abstractC738140SxQ, z, 6);
            C0T6L.LIZLLL();
            if ((reusedUIAssem instanceof C0ROU) && (c0rou = (C0ROU) reusedUIAssem) != null) {
                c0rou.pl(z);
            }
            if ((this instanceof C694570RMh) || reusedUIAssem.LLILLJJLI == z) {
                return;
            }
            C724100Sam.LIZ(reusedUIAssem, z);
        }
    }
}
