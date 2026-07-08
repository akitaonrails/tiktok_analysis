package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.zip.CRC32;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053930dX5 extends C09AY implements Function0<List<AbstractC1053850dWx>> {
    public C1053930dX5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<AbstractC1053850dWx> invoke() {
        AbstractC1053850dWx abstractC1053850dWx;
        int iIntValue = ((Number) C2260431Ddh.LIZJ.getValue()).intValue();
        final int iIntValue2 = ((Number) C2260431Ddh.LIZLLL.getValue()).intValue();
        Iterable iterable = (Iterable) C2260431Ddh.LJ.getValue();
        if (iIntValue == 1) {
            final Set setLLIIJI = C13LP.LLIIJI(iterable);
            abstractC1053850dWx = new AbstractC1053850dWx(setLLIIJI, iIntValue2) { // from class: X.0dX7
                public final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(344));

                @Override // X.AbstractC1053850dWx
                public final boolean LIZ(InterfaceC1053960dX8 interfaceC1053960dX8) {
                    if (((Random) this.LIZJ.getValue()).nextInt(10000) >= this.LIZ) {
                        return true;
                    }
                    return false;
                }
            };
        } else if (iIntValue == 2) {
            final Set setLLIIJI2 = C13LP.LLIIJI(iterable);
            abstractC1053850dWx = new AbstractC1053850dWx(setLLIIJI2, iIntValue2) { // from class: X.0dX6
                @Override // X.AbstractC1053850dWx
                public final boolean LIZ(InterfaceC1053960dX8 interfaceC1053960dX8) {
                    if (a0.LJJJIL(interfaceC1053960dX8.getDeviceId())) {
                        return false;
                    }
                    CRC32 crc32 = new CRC32();
                    crc32.update(interfaceC1053960dX8.getDeviceId().getBytes(Charsets.UTF_8));
                    if (Math.abs(crc32.getValue()) % ((long) 10000) < this.LIZ) {
                        return false;
                    }
                    return true;
                }
            };
        } else if (iIntValue != 3) {
            abstractC1053850dWx = null;
        } else {
            final Set setLLIIJI3 = C13LP.LLIIJI(iterable);
            abstractC1053850dWx = new AbstractC1053850dWx(setLLIIJI3, iIntValue2) { // from class: X.0dX4
                @Override // X.AbstractC1053850dWx
                public final boolean LIZ(InterfaceC1053960dX8 interfaceC1053960dX8) {
                    Long lLJIILIIL;
                    String deviceId = interfaceC1053960dX8.getDeviceId();
                    if (a0.LJJJIL(deviceId) || (lLJIILIIL = C2095008Iq.LJIILIIL(deviceId)) == null || Math.abs(lLJIILIIL.longValue()) % ((long) 10000) < this.LIZ) {
                        return false;
                    }
                    return true;
                }
            };
        }
        ArrayList arrayList = new ArrayList();
        if (abstractC1053850dWx != null) {
            arrayList.add(abstractC1053850dWx);
        }
        return arrayList;
    }
}
