package X;

import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ao0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C949100ao0 implements InterfaceC949340aoO {
    public static final void LIZ(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        C947420alI c947420alI = (C947420alI) obj;
        C947420alI c947420alI2 = (C947420alI) obj2;
        InterfaceC949240aoE interfaceC949240aoE = (InterfaceC949240aoE) obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stateChange: ");
        sbLIZ.append(c947420alI);
        sbLIZ.append(" -> ");
        sbLIZ.append(c947420alI2);
        sbLIZ.append(", cause: ");
        sbLIZ.append(interfaceC949240aoE);
        C949190ao9.LIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ));
        C949060anw c949060anw = C949060anw.LIZ;
        c949060anw.getClass();
        EnumC947600ala enumC947600alaLIZ = C947620alc.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("currentRole=");
        sbLIZ2.append(enumC947600alaLIZ);
        C949190ao9.LIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ2));
        if (enumC947600alaLIZ != EnumC947600ala.AUDIENCE) {
            C947500alQ c947500alQ = c947420alI2.LJ;
            String str3 = null;
            if (c947500alQ != null && c947500alQ.LIZIZ != null && (c947500alQ == null || (str2 = c947500alQ.LIZIZ) == null || !C949060anw.LJIIZILJ().LIZ(str2))) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("required gameResourceId changed from ");
                C947500alQ c947500alQ2 = c947420alI.LJ;
                if (c947500alQ2 != null) {
                    str = c947500alQ2.LIZIZ;
                } else {
                    str = null;
                }
                sbLIZ3.append(str);
                sbLIZ3.append(" to ");
                C947500alQ c947500alQ3 = c947420alI2.LJ;
                if (c947500alQ3 != null) {
                    str3 = c947500alQ3.LIZIZ;
                }
                sbLIZ3.append(str3);
                sbLIZ3.append(", re-downloading resources");
                C949190ao9.LIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ3));
                c949060anw.LJIIJJI(Collections.singletonList(EnumC947020ake.GAME_MATERIAL));
            }
        }
        if (!Intrinsics.LJFF(c947420alI.LJFF, c947420alI2.LJFF) && c947420alI2.LJFF != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("optional gameResourceId changed from ");
            sbLIZ4.append(c947420alI.LJFF);
            sbLIZ4.append(" to ");
            sbLIZ4.append(c947420alI2.LJFF);
            sbLIZ4.append(", re-downloading resources");
            C949190ao9.LIZ("KMPLiveDanceService", C2188811AlT.LIZIZ(sbLIZ4));
            c949060anw.LJIIJJI(Collections.singletonList(EnumC947020ake.GAME_BG_LOTTIE));
        }
        C949060anw.LJIJI(c947420alI, c947420alI2, interfaceC949240aoE);
        EnumC947440alK enumC947440alK = c947420alI.LIZJ;
        EnumC947440alK enumC947440alK2 = EnumC947440alK.NONE;
        if (enumC947440alK != enumC947440alK2 && c947420alI2.LIZJ == enumC947440alK2) {
            c949060anw.LIZLLL();
        }
    }
}
