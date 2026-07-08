package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: X.0oNA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1470620oNA {
    public static Constructor<?> LIZ;

    public static InterfaceC1467090oHT LIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
        if (C1470530oN1.LIZIZ(abstractC1470590oN7)) {
            C1470610oN9 c1470610oN9 = C1470690oNH.LIZ;
            C1470630oNB c1470630oNB = c1470610oN9.LIZ;
            if (abstractC1470590oN7.LIZJ() == EnumC1469090oKh.VOD_PLAYER) {
                c1470630oNB = c1470610oN9.LIZIZ;
            }
            if (abstractC1470590oN7.LIZLLL()) {
                c1470630oNB = c1470610oN9.LIZJ;
            }
            return (InterfaceC1467090oHT) c1470630oNB.LIZIZ(abstractC1470590oN7, interfaceC1469660oLc);
        }
        try {
            if (LIZ == null) {
                LIZ = Class.forName("com.ss.ttvideo.TTKPlayerV2").getConstructor(AbstractC1470590oN7.class, InterfaceC1469660oLc.class);
            }
            return (InterfaceC1467090oHT) LIZ.newInstance(abstractC1470590oN7, interfaceC1469660oLc);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ = null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create player failed: ");
            sbLIZ.append(e.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
