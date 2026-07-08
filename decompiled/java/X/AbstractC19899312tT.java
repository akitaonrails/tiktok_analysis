package X;

import X.AbstractC19899312tT;
import X.AbstractC19899812tY;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12tT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19899312tT<MessageType extends AbstractC19899312tT<MessageType, BuilderType>, BuilderType extends AbstractC19899812tY<MessageType, BuilderType>> implements InterfaceC19901112tl {
    public int zza;

    @Override // X.InterfaceC19901112tl
    public final C19855012mK LIZ() {
        try {
            int iLJFF = LJFF(null);
            AbstractC19854812mI abstractC19854812mI = AbstractC19854812mI.zza;
            C19899412tU c19899412tU = new C19899412tU(iLJFF);
            ((AbstractC19899612tW) this).LJ(c19899412tU.LIZ);
            if (c19899412tU.LIZ.LJJII() == 0) {
                return new C19855012mK(c19899412tU.LIZIZ);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] LJIIJ() {
        try {
            int iLJFF = LJFF(null);
            byte[] bArr = new byte[iLJFF];
            Logger logger = AbstractC19901712tr.LIZIZ;
            C19901612tq c19901612tq = new C19901612tq(bArr, iLJFF);
            ((AbstractC19899612tW) this).LJ(c19901612tq);
            if (c19901612tq.LJJII() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public int LJIIIZ() {
        throw new UnsupportedOperationException();
    }

    public int LJFF(InterfaceC19900112tb interfaceC19900112tb) {
        int iLJIIIZ = LJIIIZ();
        if (iLJIIIZ == -1) {
            int iLIZ = interfaceC19900112tb.LIZ(this);
            LJIIJJI(iLIZ);
            return iLIZ;
        }
        return iLJIIIZ;
    }

    public void LJIIJJI(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(Iterable iterable, InterfaceC19875012pY interfaceC19875012pY) {
        Charset charset = C19856912md.LIZ;
        iterable.getClass();
        if (iterable instanceof InterfaceC19899512tV) {
            List<?> listM74zza = ((InterfaceC19899512tV) iterable).m74zza();
            InterfaceC19899512tV interfaceC19899512tV = (InterfaceC19899512tV) interfaceC19875012pY;
            int size = interfaceC19875012pY.size();
            for (Object obj : listM74zza) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC19899512tV.size() - size) + " is null.";
                    int size2 = interfaceC19899512tV.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            interfaceC19899512tV.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (obj instanceof AbstractC19854812mI) {
                    interfaceC19899512tV.m75zza();
                } else if (obj instanceof byte[]) {
                    AbstractC19854812mI.zza((byte[]) obj);
                    interfaceC19899512tV.m75zza();
                } else {
                    interfaceC19899512tV.add(obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC19886612rQ) {
            interfaceC19875012pY.addAll((Collection) iterable);
            return;
        }
        if ((interfaceC19875012pY instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) interfaceC19875012pY).ensureCapacity(interfaceC19875012pY.size() + ((Collection) iterable).size());
        }
        int size3 = interfaceC19875012pY.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (interfaceC19875012pY.size() - size3) + " is null.";
                int size4 = interfaceC19875012pY.size();
                while (true) {
                    size4--;
                    if (size4 >= size3) {
                        ListProtector.remove(interfaceC19875012pY, size4);
                    } else {
                        throw new NullPointerException(str2);
                    }
                }
            } else {
                interfaceC19875012pY.add(obj2);
            }
        }
    }
}
