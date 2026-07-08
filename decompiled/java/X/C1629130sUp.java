package X;

import Y.AfS194S0100000_25;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629130sUp implements InterfaceC2176408fq {
    public Effect LIZ;
    public final C19EG LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1185));
    public final EffectCategoryModel LIZLLL = C1623650sLz.LIZ(new AwS604S0100000_25(this, 958));
    public final C11PQ<CategoryEffectModel> LJ = new C11PQ<>();
    public final C1629120sUo LJFF = new InterfaceC1628810sUJ() { // from class: X.0sUo
        @Override // X.InterfaceC1628810sUJ
        public final C11NZ<CategoryEffectModel> LIZIZ(C1631810sZ9 c1631810sZ9) {
            C1629130sUp c1629130sUp = this.LIZ;
            return c1629130sUp.LJ.LJJIJIL(new AfS194S0100000_25(c1629130sUp, 224));
        }
    };

    @Override // X.InterfaceC2176408fq
    public final void LIZ() {
    }

    @Override // X.InterfaceC2176408fq
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC2176408fq
    public final void getFilters() {
    }

    @Override // X.InterfaceC2176408fq
    public final EffectCategoryModel LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC2176408fq
    public final InterfaceC1628810sUJ LIZJ() {
        return this.LJFF;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0sUo] */
    public C1629130sUp(Effect effect, C19EG c19eg) {
        this.LIZ = effect;
        this.LIZIZ = c19eg;
    }
}
