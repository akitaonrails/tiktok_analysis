package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623230sLJ implements InterfaceC1622080sJS, InterfaceC1622570sKF {
    public final CopyOnWriteArrayList<InterfaceC1622080sJS> LL = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC1622080sJS
    public final int getPriority() {
        return EnumC1641540soq.LOOP_CHAIN_STICKER_PRIORITY.getPriority();
    }

    @Override // X.InterfaceC1622570sKF
    public final InterfaceC1622080sJS I2(Function1<? super InterfaceC1622080sJS, Boolean> function1) {
        InterfaceC1622080sJS next;
        Iterator<InterfaceC1622080sJS> it2 = this.LL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (function1.invoke(next).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    @Override // X.InterfaceC1622080sJS
    public final C1623370sLX LJIILL(InterfaceC1622070sJR interfaceC1622070sJR, AbstractC1627380sS0 abstractC1627380sS0) {
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChainStickerHandler#onStickerChosen:session:");
        sbLIZ.append(abstractC1627380sS0);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        C1623370sLX c1623370sLXLIZ = interfaceC1622070sJR.LIZ(abstractC1627380sS0);
        Iterator it2 = new C13EO(this.LL).iterator();
        while (true) {
            C13EN c13en = (C13EN) it2;
            if (c13en.hasNext()) {
                InterfaceC1622080sJS interfaceC1622080sJS = (InterfaceC1622080sJS) c13en.next();
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ChainStickerHandler#onStickerChosen:handler:");
                sbLIZ2.append(interfaceC1622080sJS);
                interfaceC1463990oCTLIZLLL2.i(C2188811AlT.LIZIZ(sbLIZ2));
                interfaceC1622080sJS.LJIILL(C1623360sLW.LIZ, abstractC1627380sS0);
            } else {
                return c1623370sLXLIZ;
            }
        }
    }
}
