package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622050sJP implements InterfaceC1622080sJS, InterfaceC1623110sL7 {
    public final Function0<Boolean> LL;
    public final List<InterfaceC1411260mpQ> LLILLJJLI = new ArrayList();

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return C1623350sLV.LIZ();
    }

    public C1622050sJP(Function0<Boolean> function0) {
        this.LL = function0;
    }

    public final void LIZ(InterfaceC1411260mpQ interfaceC1411260mpQ) {
        ((ArrayList) this.LLILLJJLI).add(interfaceC1411260mpQ);
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        return interfaceC1622070sJR.LIZ(abstractC1627380sS0);
    }

    @Override // X.InterfaceC1623110sL7
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        Function0<Boolean> function0 = this.LL;
        if ((function0 != null && !function0.invoke().booleanValue()) || i != 41) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectChannelListener INTERACTION msg: ");
        sbLIZ.append(i);
        sbLIZ.append(" , ");
        sbLIZ.append(i2);
        sbLIZ.append(" , ");
        sbLIZ.append(i3);
        sbLIZ.append(" , ");
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC1411260mpQ interfaceC1411260mpQ : (ArrayList) this.LLILLJJLI) {
            if (interfaceC1411260mpQ.LIZJ(i, i2, i3, str)) {
                if (str != null) {
                    interfaceC1411260mpQ.LIZ(i3, str);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
    }
}
