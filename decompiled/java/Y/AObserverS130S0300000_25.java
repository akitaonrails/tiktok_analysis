package Y;

import X.AbstractC1622910sKn;
import X.C097T;
import X.C0LCS;
import X.C1322110kVd;
import X.C13LP;
import X.C1637080she;
import X.C1641640sp0;
import X.InterfaceC1625880sPa;
import X.InterfaceC1627350sRx;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import lnn.l;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public class AObserverS130S0300000_25 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$0(AObserverS130S0300000_25 aObserverS130S0300000_25, Object obj) {
        String key;
        String categoryKey;
        PanelInfoModel panelInfoModel = (PanelInfoModel) ((C1641640sp0) obj).LIZ;
        if (panelInfoModel != null) {
            InterfaceC1625880sPa interfaceC1625880sPa = (InterfaceC1625880sPa) aObserverS130S0300000_25.l0;
            AbstractC1622910sKn abstractC1622910sKn = (AbstractC1622910sKn) aObserverS130S0300000_25.l1;
            InterfaceC1627350sRx interfaceC1627350sRx = (InterfaceC1627350sRx) aObserverS130S0300000_25.l2;
            CategoryEffectModel categoryEffectModel = panelInfoModel.getCategoryEffectModel();
            if (categoryEffectModel != null && (categoryKey = categoryEffectModel.getCategoryKey()) != null && categoryKey.length() != 0) {
                CategoryEffectModel categoryEffectModel2 = panelInfoModel.getCategoryEffectModel();
                if (categoryEffectModel2 != null) {
                    key = categoryEffectModel2.getCategoryKey();
                } else {
                    return;
                }
            } else {
                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) C13LP.LJJJLL(interfaceC1625880sPa.LJIILJJIL());
                if (effectCategoryModel == null) {
                    return;
                } else {
                    key = effectCategoryModel.getKey();
                }
            }
            if (key != null) {
                interfaceC1625880sPa.LJIIJ(null, true, true, false).removeObserver(aObserverS130S0300000_25);
                abstractC1622910sKn.o4(interfaceC1627350sRx, interfaceC1625880sPa, key);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$1(AObserverS130S0300000_25 aObserverS130S0300000_25, Object obj) {
        CategoryEffectModel categoryEffectModel = (CategoryEffectModel) ((C1641640sp0) obj).LIZ;
        if (categoryEffectModel != null) {
            l0 l0Var = (l0) aObserverS130S0300000_25.l0;
            CategoryEffectModel categoryEffectModel2 = (CategoryEffectModel) aObserverS130S0300000_25.l1;
            InterfaceC1625880sPa interfaceC1625880sPa = (InterfaceC1625880sPa) aObserverS130S0300000_25.l2;
            l0Var.B = categoryEffectModel2.getCategoryKey();
            if (C097T.LIZ()) {
                l0Var.ff(categoryEffectModel.getEffects());
            }
            interfaceC1625880sPa.LJIJJLI(categoryEffectModel2.getCategoryKey(), null, true, false).removeObserver(aObserverS130S0300000_25);
            l0Var.LLLZIIL.LJIIJ(l0Var.P9(categoryEffectModel.getEffects(), 5));
            if (!categoryEffectModel.getEffects().isEmpty()) {
                l0Var.Xe((Effect) ListProtector.get(categoryEffectModel.getEffects(), 0));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0srB, X.19ry] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$2(Y.AObserverS130S0300000_25 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS130S0300000_25.onChanged$2(Y.AObserverS130S0300000_25, java.lang.Object):void");
    }

    public static final void onChanged$3(AObserverS130S0300000_25 aObserverS130S0300000_25, Object obj) {
        C1637080she c1637080she = (C1637080she) ((C0LCS) obj).LIZIZ();
        if (c1637080she != null) {
            l lVar = (l) aObserverS130S0300000_25.l0;
            lVar.LLIZLLLIL = true;
            Effect effect = c1637080she.LIZIZ;
            lVar.LLJI = c1637080she.LIZJ;
            lVar.LLJ = effect.getEffectId();
            l lVar2 = (l) aObserverS130S0300000_25.l0;
            lVar2.LLIZ = effect;
            if (c1637080she.LIZ) {
                q qVar = lVar2.LL;
                if (qVar != null) {
                    qVar.NJ(true, false);
                    return;
                }
                return;
            }
            lVar2.LIZIZ((C1322110kVd) aObserverS130S0300000_25.l1, effect);
            ((l) aObserverS130S0300000_25.l0).LIZ((TuxIconView) aObserverS130S0300000_25.l2, effect);
        }
    }

    public AObserverS130S0300000_25(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
