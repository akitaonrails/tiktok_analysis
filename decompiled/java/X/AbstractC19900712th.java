package X;

import X.AbstractC19900712th;
import X.AbstractC19900812ti;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.12th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19900712th<MessageType extends AbstractC19900712th<MessageType, BuilderType>, BuilderType extends AbstractC19900812ti<MessageType, BuilderType>> implements InterfaceC19911612vS {
    public transient int zza;

    public final byte[] LIZIZ() {
        try {
            AbstractC19907912ur abstractC19907912ur = (AbstractC19907912ur) this;
            int iLJIILL = abstractC19907912ur.LJIILL();
            byte[] bArr = new byte[iLJIILL];
            boolean z = AbstractC19910412vG.LIZIZ;
            C19910212vE c19910212vE = new C19910212vE(bArr, iLJIILL);
            abstractC19907912ur.LIZ(c19910212vE);
            c19910212vE.LIZ();
            return bArr;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            String name = getClass().getName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Serializing ");
            sbLIZ.append(name);
            sbLIZ.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public int LIZJ(InterfaceC19908112ut interfaceC19908112ut) {
        throw null;
    }

    @Override // X.InterfaceC19911612vS
    public final C19855812mS LJIILJJIL() {
        try {
            AbstractC19907912ur abstractC19907912ur = (AbstractC19907912ur) this;
            int iLJIILL = abstractC19907912ur.LJIILL();
            AbstractC19855612mQ abstractC19855612mQ = AbstractC19855612mQ.zza;
            byte[] bArr = new byte[iLJIILL];
            boolean z = AbstractC19910412vG.LIZIZ;
            C19910212vE c19910212vE = new C19910212vE(bArr, iLJIILL);
            abstractC19907912ur.LIZ(c19910212vE);
            c19910212vE.LIZ();
            return new C19855812mS(bArr);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            String name = getClass().getName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Serializing ");
            sbLIZ.append(name);
            sbLIZ.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(Iterable iterable, InterfaceC19911812vU interfaceC19911812vU) {
        Charset charset = C19856312mX.LIZ;
        int size = ((Collection) iterable).size();
        if (interfaceC19911812vU instanceof ArrayList) {
            ((ArrayList) interfaceC19911812vU).ensureCapacity(interfaceC19911812vU.size() + size);
        } else if (interfaceC19911812vU instanceof C19887812rc) {
            C19887812rc c19887812rc = (C19887812rc) interfaceC19911812vU;
            int size2 = interfaceC19911812vU.size() + size;
            int length = c19887812rc.LLILLJJLI.length;
            if (size2 > length) {
                if (length == 0) {
                    c19887812rc.LLILLJJLI = new Object[Math.max(size2, 10)];
                } else {
                    while (length < size2) {
                        length = Math.max(((length * 3) / 2) + 1, 10);
                    }
                    c19887812rc.LLILLJJLI = Arrays.copyOf(c19887812rc.LLILLJJLI, length);
                }
            }
        }
        int size3 = interfaceC19911812vU.size();
        List list = (List) iterable;
        int size4 = list.size();
        for (int i = 0; i < size4; i++) {
            Object obj = ListProtector.get(list, i);
            if (obj == null) {
                int size5 = interfaceC19911812vU.size() - size3;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Element at index ");
                sbLIZ.append(size5);
                sbLIZ.append(" is null.");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int size6 = interfaceC19911812vU.size();
                while (true) {
                    size6--;
                    if (size6 >= size3) {
                        ListProtector.remove(interfaceC19911812vU, size6);
                    } else {
                        throw new NullPointerException(strLIZIZ);
                    }
                }
            } else {
                interfaceC19911812vU.add(obj);
            }
        }
    }
}
