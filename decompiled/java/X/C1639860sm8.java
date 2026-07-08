package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639860sm8 implements InterfaceC1642140spo {
    public final C1639800sm2 LIZ;
    public final InterfaceC1639870sm9 LIZIZ;
    public final InterfaceC1639850sm7 LIZJ;
    public final List<C1639880smA> LIZLLL = new ArrayList();
    public final List<C1639880smA> LJ = new ArrayList();
    public final List<Pair<EffectCategoryResponse, List<C1639670slp>>> LJFF;

    @Override // X.InterfaceC1642140spo
    public final C1639800sm2 Ff() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1642140spo
    public final void Df(AwS569S0100000_25 awS569S0100000_25) {
        if (!((ArrayList) this.LIZLLL).isEmpty()) {
            InterfaceC1639850sm7 interfaceC1639850sm7 = this.LIZJ;
            List<C1639880smA> list = this.LIZLLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(((C1639880smA) it2.next()).LIZ.LIZ);
            }
            interfaceC1639850sm7.LIZIZ(C13LP.LLIIJI(arrayList), new AwS569S0100000_25(this, 826), awS569S0100000_25);
        }
        if (!((ArrayList) this.LJ).isEmpty()) {
            InterfaceC1639850sm7 interfaceC1639850sm72 = this.LIZJ;
            List<C1639880smA> list2 = this.LJ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator it3 = ((ArrayList) list2).iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C1639880smA) it3.next()).LIZ.LIZ);
            }
            interfaceC1639850sm72.LIZLLL(C13LP.LLIIJI(arrayList2), new AwS569S0100000_25(this, 827), awS569S0100000_25);
        }
    }

    @Override // X.InterfaceC1642140spo
    public final void Ef(C1639880smA c1639880smA) {
        if (!c1639880smA.LIZJ) {
            ((ArrayList) this.LJ).add(c1639880smA);
            ((ArrayList) this.LIZLLL).remove(c1639880smA);
        }
    }

    @Override // X.InterfaceC1642140spo
    public final void Gf(C1639880smA c1639880smA) {
        if (!c1639880smA.LIZJ) {
            ((ArrayList) this.LJ).remove(c1639880smA);
            ((ArrayList) this.LIZLLL).add(c1639880smA);
        }
    }

    public C1639860sm8(C1639800sm2 c1639800sm2, InterfaceC1639870sm9 interfaceC1639870sm9, InterfaceC1639850sm7 interfaceC1639850sm7) {
        this.LIZ = c1639800sm2;
        this.LIZIZ = interfaceC1639870sm9;
        this.LIZJ = interfaceC1639850sm7;
        List<? extends Pair<? extends EffectCategoryModel, ? extends List<C1639880smA>>> list = c1639800sm2.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Pair<? extends EffectCategoryModel, ? extends List<C1639880smA>> pair : list) {
            EffectCategoryModel first = pair.getFirst();
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
            effectCategoryResponse.setId(first.getId());
            effectCategoryResponse.setName(first.getName());
            effectCategoryResponse.setKey(first.getKey());
            List<C1639880smA> second = pair.getSecond();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(second, 10));
            Iterator<T> it2 = second.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C1639880smA) it2.next()).LIZ);
            }
            arrayList.add(new Pair(effectCategoryResponse, arrayList2));
        }
        this.LJFF = arrayList;
    }
}
