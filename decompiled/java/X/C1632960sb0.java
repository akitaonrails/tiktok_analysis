package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632960sb0 extends AbstractC1632560saM<Effect, Effect, C1634230sd3> implements InterfaceC1632990sb3 {
    public final InterfaceC1633000sb4 LJIIJJI;
    public final Function1<Effect, InterfaceC1633020sb6> LJIIL;

    @Override // X.AbstractC1632560saM
    public final Void LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC1632560saM
    public final String LJII(Effect effect) {
        Effect effect2 = effect;
        String resourceId = effect2.getResourceId();
        if (resourceId.length() <= 0) {
            return effect2.getId();
        }
        return resourceId;
    }

    public C1632960sb0(C1632980sb2 c1632980sb2, AwS604S0100000_25 awS604S0100000_25) {
        super(3);
        this.LJIIJJI = c1632980sb2;
        this.LJIIL = awS604S0100000_25;
    }

    @Override // X.AbstractC1632560saM
    public final void LJFF(Object obj, C1632710sab c1632710sab) {
        Effect effect = (Effect) obj;
        if (this.LJIIJJI.LIZ(effect)) {
            c1632710sab.LIZLLL(effect, effect);
        } else {
            this.LJIIL.invoke(effect).LIZIZ(effect, c1632710sab);
        }
    }
}
