package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0sK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622500sK8 implements InterfaceC1622070sJR {
    public final List<InterfaceC1622080sJS> LIZ;
    public final int LIZIZ;
    public final InterfaceC1463990oCT LIZJ;
    public int LIZLLL;

    @Override // X.InterfaceC1622070sJR
    public final C1623370sLX LIZ(AbstractC1627380sS0 abstractC1627380sS0) {
        InterfaceC1463990oCT interfaceC1463990oCT;
        boolean z = false;
        if (this.LIZIZ < this.LIZ.size()) {
            int i = this.LIZLLL + 1;
            this.LIZLLL = i;
            if (i <= 1) {
                z = true;
            }
            if (z) {
                List<InterfaceC1622080sJS> list = this.LIZ;
                int i2 = this.LIZIZ;
                C1622500sK8 c1622500sK8 = new C1622500sK8(list, i2 + 1, this.LIZJ);
                InterfaceC1622080sJS interfaceC1622080sJS = (InterfaceC1622080sJS) ListProtector.get(list, i2);
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DefaultStickerHandlerChain#useSticker:handler:");
                sbLIZ.append(interfaceC1622080sJS);
                interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
                C1623370sLX c1623370sLXLJIILL = interfaceC1622080sJS.LJIILL(c1622500sK8, abstractC1627380sS0);
                if (this.LIZIZ + 1 < this.LIZ.size() && c1622500sK8.LIZLLL < 1 && (interfaceC1463990oCT = this.LIZJ) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handler:");
                    sbLIZ2.append(interfaceC1622080sJS);
                    sbLIZ2.append(" must call proceed() at least once");
                    interfaceC1463990oCT.w(C2188811AlT.LIZIZ(sbLIZ2));
                }
                return c1623370sLXLJIILL;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handler:");
            sbLIZ3.append(ListProtector.get(this.LIZ, this.LIZIZ - 1));
            sbLIZ3.append(" must called useSticker() exactly once");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        "chain response beyond handlers size".toString();
        throw new IllegalStateException("chain response beyond handlers size");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1622500sK8(List<? extends InterfaceC1622080sJS> list, int i, InterfaceC1463990oCT interfaceC1463990oCT) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = interfaceC1463990oCT;
    }
}
