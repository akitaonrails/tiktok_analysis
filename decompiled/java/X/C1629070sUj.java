package X;

import Y.AObserverS227S0100000_25;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.verify.FwhcFavoritesTabRelatedSectionAB;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: renamed from: X.0sUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629070sUj implements InterfaceC1623640sLy {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final C01GW<InterfaceC1628970sUZ> LIZ;
    public final boolean LIZIZ;
    public final C01GW<Integer> LIZJ;
    public final C1623150sLB LIZLLL;
    public C11JL LJ;
    public C11JL LJFF;
    public C11PQ<CategoryEffectModel> LJI;
    public CategoryEffectModel LJII;
    public CategoryEffectModel LJIIIIZZ;
    public final AObserverS227S0100000_25 LJIIIZ;
    public final AObserverS227S0100000_25 LJIIJ;

    @Override // X.InterfaceC1623640sLy
    public final void LIZ() {
        C11JL c11jl = this.LJ;
        if (c11jl != null) {
            c11jl.dispose();
        }
        C11JL c11jl2 = this.LJFF;
        if (c11jl2 != null) {
            c11jl2.dispose();
        }
        if (this.LIZ.isInitialized()) {
            this.LIZ.getValue().LJJ().LJIIL.removeObserver(this.LJIIIZ);
            this.LIZ.getValue().LJJ().LJIILIIL.removeObserver(this.LJIIJ);
        }
    }

    @Override // X.InterfaceC1628810sUJ
    public final C11NZ<CategoryEffectModel> LIZIZ(C1631810sZ9 c1631810sZ9) {
        C0CNO.LIZLLL(0L, new AwS426S0200000_25(this, c1631810sZ9, 203));
        C11PQ<CategoryEffectModel> c11pq = this.LJI;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    public final CategoryEffectModel LIZLLL(CategoryEffectModel categoryEffectModel) {
        List listLL;
        List<? extends Effect> list;
        if (!FwhcFavoritesTabRelatedSectionAB.isEnabled()) {
            return categoryEffectModel;
        }
        C1623150sLB c1623150sLB = this.LIZLLL;
        if (c1623150sLB == null || (list = c1623150sLB.LIZ) == null || (listLL = C13LP.LL(list, 12)) == null) {
            listLL = C13BV.INSTANCE;
        }
        if (listLL.isEmpty()) {
            return categoryEffectModel;
        }
        CategoryEffectModel categoryEffectModelCopy = categoryEffectModel.copy();
        ArrayList arrayList = new ArrayList(categoryEffectModel.getEffects());
        arrayList.add(C1629100sUm.LIZJ);
        arrayList.addAll(listLL);
        categoryEffectModelCopy.setEffects(arrayList);
        return categoryEffectModelCopy;
    }

    public final CategoryEffectModel LIZJ(CategoryEffectModel categoryEffectModel, CategoryEffectModel categoryEffectModel2) {
        List<Effect> effects;
        if (this.LIZIZ && categoryEffectModel2 != null && (effects = categoryEffectModel2.getEffects()) != null && !effects.isEmpty()) {
            CategoryEffectModel categoryEffectModelCopy = categoryEffectModel.copy();
            if (true ^ categoryEffectModel.getEffects().isEmpty()) {
                List<Effect> effects2 = categoryEffectModel.getEffects();
                Effect effect = C1629100sUm.LIZ;
                if (!effects2.contains(effect)) {
                    ArrayList arrayList = new ArrayList(categoryEffectModel.getEffects());
                    ListProtector.add(arrayList, 0, C1629100sUm.LIZIZ);
                    arrayList.addAll(0, categoryEffectModel2.getEffects());
                    ListProtector.add(arrayList, 0, effect);
                    categoryEffectModelCopy.setEffects(arrayList);
                    return categoryEffectModelCopy;
                }
            }
            ArrayList arrayList2 = new ArrayList(categoryEffectModel.getEffects());
            arrayList2.addAll(0, categoryEffectModel2.getEffects());
            ListProtector.add(arrayList2, 0, C1629100sUm.LIZ);
            categoryEffectModelCopy.setEffects(arrayList2);
            return categoryEffectModelCopy;
        }
        return categoryEffectModel;
    }

    public /* synthetic */ C1629070sUj(C01GW c01gw, C01GW c01gw2, int i) {
        this(c01gw, false, (i & 4) != 0 ? null : c01gw2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1629070sUj(C01GW<? extends InterfaceC1628970sUZ> c01gw, boolean z, C01GW<Integer> c01gw2, C1623150sLB c1623150sLB) {
        this.LIZ = c01gw;
        this.LIZIZ = z;
        this.LIZJ = c01gw2;
        this.LIZLLL = c1623150sLB;
        this.LJI = new C11PQ<>();
        this.LJIIIZ = new AObserverS227S0100000_25(this, 152);
        this.LJIIJ = new AObserverS227S0100000_25(this, 153);
    }
}
