package X;

import Y.AfS194S0100000_25;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0scd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1633970scd<CATEGORY, DOWNLOAD_EVENT> implements InterfaceC1634010sch<CATEGORY, DOWNLOAD_EVENT> {
    public final InterfaceC1634030scj LIZ;
    public final InterfaceC1634030scj LIZIZ;
    public final InterfaceC1634000scg<CATEGORY> LIZJ;
    public final InterfaceC1633990scf<Effect> LIZLLL;
    public final ConcurrentHashMap<String, CATEGORY> LJ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1634010sch
    public final C11JN LIZ(C1634350sdF c1634350sdF) {
        return this.LIZJ.LIZ(c1634350sdF).LJJIJIIJIL(new AfS194S0100000_25(this, 220));
    }

    @Override // X.InterfaceC1634010sch
    public final C11NZ<List<AbstractC1634360sdG>> LIZIZ(boolean z) {
        InterfaceC1634030scj interfaceC1634030scj;
        if (z) {
            interfaceC1634030scj = this.LIZ;
        } else {
            interfaceC1634030scj = this.LIZIZ;
        }
        return interfaceC1634030scj.request();
    }

    @Override // X.InterfaceC1634010sch
    public final InterfaceC1634480sdS<Effect, CategoryEffectModel> LJ(C1634340sdE c1634340sdE) {
        return this.LIZLLL.LIZ(c1634340sdE);
    }

    @Override // X.InterfaceC1634010sch
    public final EffectCategoryResponse LJFF(Effect effect) {
        return ((C1633870scT) this).LIZLLL(effect.getEffectId());
    }

    public AbstractC1633970scd(InterfaceC1634030scj interfaceC1634030scj, InterfaceC1634030scj interfaceC1634030scj2, C1634020sci c1634020sci, C1633980sce c1633980sce, C1632970sb1 c1632970sb1) {
        this.LIZ = interfaceC1634030scj;
        this.LIZIZ = interfaceC1634030scj2;
        this.LIZJ = c1634020sci;
        this.LIZLLL = c1633980sce;
    }
}
