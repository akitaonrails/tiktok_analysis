package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632820sam extends AbstractC1632560saM<ProviderEffect, String, Unit> implements InterfaceC1632810sal {
    public final InterfaceC1632830san LJIIJJI;
    public final Function0<InterfaceC1632780sai> LJIIL;

    @Override // X.AbstractC1632560saM
    public final Void LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1632560saM
    public final String LJII(ProviderEffect providerEffect) {
        String id = providerEffect.getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    public C1632820sam(InterfaceC1632830san interfaceC1632830san, AwS569S0100000_25 awS569S0100000_25) {
        super(3);
        this.LJIIJJI = interfaceC1632830san;
        this.LJIIL = awS569S0100000_25;
    }

    @Override // X.AbstractC1632560saM
    public final void LJFF(Object obj, final C1632710sab c1632710sab) {
        boolean zLJI = MethodIDManager.LJI(137966);
        ProviderEffect providerEffect = (ProviderEffect) obj;
        boolean zLJI2 = MethodIDManager.LJI(137966);
        final String strLIZIZ = this.LJIIJJI.LIZIZ(providerEffect);
        if (this.LJIIJJI.LIZ(providerEffect)) {
            c1632710sab.LIZLLL(providerEffect, strLIZIZ);
        } else {
            this.LJIIL.invoke().LIZIZ(providerEffect, new InterfaceC1632620saS<ProviderEffect, String, Unit>() { // from class: X.0sah
                @Override // X.InterfaceC1632620saS
                public final void LIZJ(int i, Object obj2) {
                    c1632710sab.LIZJ(i, obj2);
                }

                @Override // X.InterfaceC1632620saS
                public final void LIZLLL(ProviderEffect providerEffect2, String str) {
                    InterfaceC1632620saS<ProviderEffect, String, Unit> interfaceC1632620saS = c1632710sab;
                    if (str == null) {
                        str = strLIZIZ;
                    }
                    interfaceC1632620saS.LIZLLL(providerEffect2, str);
                }

                @Override // X.InterfaceC1632620saS
                public final void LIZ(ProviderEffect providerEffect2, String str, Unit unit, long j) {
                    String str2 = str;
                    InterfaceC1632620saS<ProviderEffect, String, Unit> interfaceC1632620saS = c1632710sab;
                    if (str2 == null) {
                        str2 = strLIZIZ;
                    }
                    interfaceC1632620saS.LIZ(providerEffect2, str2, unit, j);
                }

                @Override // X.InterfaceC1632620saS
                public final void LIZIZ(ProviderEffect providerEffect2, Exception exc, Unit unit, long j) {
                    c1632710sab.LIZIZ(providerEffect2, exc, unit, j);
                }
            });
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
