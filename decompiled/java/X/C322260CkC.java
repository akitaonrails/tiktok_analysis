package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: renamed from: X.0CkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322260CkC extends C09AY implements Function1<C322320CkI, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EffectDraftDetailViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322260CkC(int i, String str, EffectDraftDetailViewModel effectDraftDetailViewModel) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = effectDraftDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C322320CkI c322320CkI) {
        C322460CkW c322460CkW;
        AbstractC322270CkD c322280CkE;
        C322320CkI c322320CkI2 = c322320CkI;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(this.LL, c322320CkI2.LLILLL.LIZ);
        if ((objLJJJLZIJ instanceof C322460CkW) && (c322460CkW = (C322460CkW) objLJJJLZIJ) != null) {
            AbstractC322270CkD abstractC322270CkD = c322460CkW.LIZJ;
            if (abstractC322270CkD instanceof C322280CkE) {
                c322280CkE = C322390CkP.LIZ;
            } else if (abstractC322270CkD instanceof C322390CkP) {
                c322280CkE = new C322280CkE(this.LLILLJJLI);
            } else if (abstractC322270CkD instanceof C322380CkO) {
                c322280CkE = C322380CkO.LIZ;
            } else {
                throw new C1954807lC();
            }
            ArrayList arrayList = new ArrayList(c322320CkI2.LLILLL.LIZ);
            ListProtector.set(arrayList, this.LL, C322460CkW.LIZIZ(c322460CkW, c322280CkE, 0, 0.0f, null, 32763));
            EffectDraftDetailViewModel effectDraftDetailViewModel = this.LLILLL;
            effectDraftDetailViewModel.setState(new AwS370S0200000_4(effectDraftDetailViewModel, (EffectDraftDetailViewModel) arrayList, (ArrayList<Object>) 81));
        }
        return Unit.LIZ;
    }
}
