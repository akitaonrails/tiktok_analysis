package X;

import Y.ALAdapterS21S0100000_26;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS235S0300000_26;

/* JADX INFO: renamed from: X.0ut6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721060ut6 extends AbstractC1720840usk<ContainerCardDO> {
    public Function0<Unit> LLILZ;

    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.ae0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(ViewGroup viewGroup, List<CardDO> list) {
        if (list.size() > 1) {
            Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
            AbstractC1720840usk abstractC1720840uskLIZ = C1720940usu.LIZ(viewGroup.getContext(), this.LL, (CardDO) ListProtector.get(list, 1), null);
            if (abstractC1720840uskLIZ instanceof InterfaceC1720830usj) {
                ((InterfaceC1720830usj) abstractC1720840uskLIZ).LIZ(new AwS235S0300000_26(this, (C1721060ut6) viewGroup, (ViewGroup) list, (List<CardDO>) 48));
                viewGroup.addView(abstractC1720840uskLIZ.LLILLJJLI);
                View view = abstractC1720840uskLIZ.LLILLJJLI;
                if (view != null) {
                    float fLJIIJ = C12ES.LJIIJ(viewGroup.getContext());
                    C786410Ut5.Jc(view, fLJIIJ);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", fLJIIJ, 0.0f);
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    objectAnimatorOfFloat.addListener(new ALAdapterS21S0100000_26(list, 11));
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                    return;
                }
                return;
            }
            return;
        }
        Function0<Unit> function0 = this.LLILZ;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, ContainerCardDO containerCardDO, EnumC1720670usT enumC1720670usT) {
        ViewGroup viewGroup;
        ContainerCardDO containerCardDO2 = containerCardDO;
        super.LJFF(view, containerCardDO2, enumC1720670usT);
        if ((view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJIZL((FrameLayout) view);
            while (true) {
                List<CardDO> cardList = containerCardDO2.getCardList();
                if (cardList != null && !cardList.isEmpty()) {
                    CardDO cardDO = (CardDO) ListProtector.get(containerCardDO2.getCardList(), 0);
                    Map<String, WeakReference<C1721420utg>> map = C1720940usu.LIZ;
                    AbstractC1720840usk abstractC1720840uskLIZ = C1720940usu.LIZ(viewGroup.getContext(), this.LL, cardDO, null);
                    if (abstractC1720840uskLIZ != 0) {
                        if (abstractC1720840uskLIZ instanceof InterfaceC1720830usj) {
                            ((InterfaceC1720830usj) abstractC1720840uskLIZ).LIZ(new AwS235S0300000_26(this, view, containerCardDO2, 47));
                            viewGroup.addView(abstractC1720840uskLIZ.LLILLJJLI);
                            return;
                        }
                        ListProtector.remove(containerCardDO2.getCardList(), 0);
                    }
                } else {
                    return;
                }
            }
        }
    }
}
