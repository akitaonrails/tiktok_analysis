package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tKR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661130tKR {
    public final AbstractC1661070tKL LIZ;

    public C1661130tKR(AbstractC1661070tKL abstractC1661070tKL) {
        this.LIZ = abstractC1661070tKL;
    }

    public final void LIZ(Map<String, String> map, InterfaceC1661080tKM interfaceC1661080tKM, boolean z, String str, boolean z2, boolean z3) {
        Effect effect;
        String str2 = str;
        if (interfaceC1661080tKM != null && z) {
            Effect effect2 = null;
            if (Intrinsics.LJFF(str2, this.LIZ.LIZIZ)) {
                AbstractC1661070tKL abstractC1661070tKL = this.LIZ;
                C1661090tKN c1661090tKN = abstractC1661070tKL.LJII;
                if (c1661090tKN != null) {
                    if (c1661090tKN.LJ) {
                        c1661090tKN.LJFF(interfaceC1661080tKM);
                        return;
                    } else if (c1661090tKN.LJII) {
                        abstractC1661070tKL.LJIIIIZZ(map, null, false, str2, false, false);
                    } else {
                        c1661090tKN.LJFF(null);
                    }
                }
                C1661090tKN c1661090tKN2 = this.LIZ.LJII;
                if (c1661090tKN2 != null) {
                    effect = c1661090tKN2.LIZIZ;
                } else {
                    effect = null;
                }
                interfaceC1661080tKM.onStart(effect);
                C1661090tKN c1661090tKN3 = this.LIZ.LJII;
                if (c1661090tKN3 != null) {
                    String str3 = c1661090tKN3.LJIILIIL;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    effect2 = c1661090tKN3.LJIILJJIL;
                }
                interfaceC1661080tKM.LIZIZ(effect2, str2);
                return;
            }
            this.LIZ.LJIIIIZZ(map, null, false, str2, false, false);
            interfaceC1661080tKM.onStart(null);
            interfaceC1661080tKM.LIZIZ(null, str2);
            return;
        }
        this.LIZ.LJIIIIZZ(map, interfaceC1661080tKM, z, str2, z2, z3);
    }
}
