package X;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ekF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100530ekF {
    public EnumC1100490ekB LIZ = EnumC1100490ekB.INIT;
    public final List<InterfaceC1100540ekG> LIZIZ = new ArrayList();

    public static void LIZIZ(String str) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Method ");
        sbLIZ.append(str);
        sbLIZ.append(" must be called on the main thread");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public final void LIZ(InterfaceC1100540ekG interfaceC1100540ekG) {
        LIZIZ("addObserver");
        ((ArrayList) this.LIZIZ).add(interfaceC1100540ekG);
    }

    public final void LIZJ(EnumC1100490ekB enumC1100490ekB) {
        EnumC1100550ekH enumC1100550ekH;
        LIZIZ("setCurrentState");
        if (this.LIZ == enumC1100490ekB) {
            return;
        }
        this.LIZ = enumC1100490ekB;
        for (InterfaceC1100540ekG interfaceC1100540ekG : (ArrayList) this.LIZIZ) {
            int i = C1100500ekC.LIZ[enumC1100490ekB.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC1100550ekH = EnumC1100550ekH.ON_END;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    enumC1100550ekH = EnumC1100550ekH.ON_START;
                }
            } else {
                enumC1100550ekH = EnumC1100550ekH.ON_END;
            }
            interfaceC1100540ekG.LIZ(this, enumC1100550ekH);
        }
    }
}
