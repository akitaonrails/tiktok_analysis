package Y;

import X.C0PEM;
import X.C0XHP;
import X.C13LP;
import X.C1621670sIn;
import X.C1641640sp0;
import X.C19EG;
import X.C23250099c;
import X.C612430O0j;
import X.InterfaceC1624480sNK;
import X.InterfaceC1625880sPa;
import X.InterfaceC20236714Gf;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AObserverS168S0200000_3 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

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
    public static final void onChanged$0(AObserverS168S0200000_3 aObserverS168S0200000_3, Object obj) {
        final String key;
        String categoryKey;
        PanelInfoModel panelInfoModel = (PanelInfoModel) ((C1641640sp0) obj).LIZ;
        if (panelInfoModel != null) {
            final InterfaceC1625880sPa interfaceC1625880sPa = (InterfaceC1625880sPa) aObserverS168S0200000_3.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) aObserverS168S0200000_3.l1;
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
                interfaceC1625880sPa.LJIIJ(null, true, true, false).removeObserver(aObserverS168S0200000_3);
                C1621670sIn.LIZ.getClass();
                interfaceC1625880sPa.LJIJJLI(key, null, true, false).observe(lifecycleOwner, new Observer<C1641640sp0<CategoryEffectModel>>() { // from class: X.093L
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(C1641640sp0<CategoryEffectModel> c1641640sp0) {
                        if (c1641640sp0.LIZ != null) {
                            interfaceC1625880sPa.LJIJJLI(key, null, true, false).removeObserver(this);
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$1(AObserverS168S0200000_3 aObserverS168S0200000_3, Object obj) {
        Effect effect;
        HorizontalEffectsModel horizontalEffectsModel = (HorizontalEffectsModel) ((C1641640sp0) obj).LIZ;
        if (horizontalEffectsModel != null) {
            LiveData liveData = (LiveData) aObserverS168S0200000_3.l0;
            InterfaceC1624480sNK interfaceC1624480sNK = (InterfaceC1624480sNK) aObserverS168S0200000_3.l1;
            List<? extends Effect> list = horizontalEffectsModel.insert_effects;
            if (list == null || (effect = (Effect) C13LP.LJJJLL(list)) == null) {
                effect = (Effect) C13LP.LJJJLL(horizontalEffectsModel.trending_effects);
            }
            liveData.removeObserver(aObserverS168S0200000_3);
            if (effect != null) {
                C1621670sIn.LIZ.getClass();
                C1621670sIn.LIZIZ(interfaceC1624480sNK, effect);
            }
        }
    }

    public static final void onChanged$2(AObserverS168S0200000_3 aObserverS168S0200000_3, Object obj) {
        if (obj != C0XHP.NOT_READY) {
            ((LiveData) aObserverS168S0200000_3.l0).removeObserver(aObserverS168S0200000_3);
            ((InterfaceC20236714Gf) aObserverS168S0200000_3.l1).LJJIFFI(null, obj);
        }
    }

    public static final void onChanged$3(AObserverS168S0200000_3 aObserverS168S0200000_3, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        String userId = followStatus.getUserId();
        Integer followerStatus = followStatus.getFollowerStatus();
        if (userId != null && userId.length() != 0 && followerStatus != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C19EG) aObserverS168S0200000_3.l0), C0PEM.LIZJ, null, new C612430O0j((RecFeedShareComponentController) aObserverS168S0200000_3.l1, userId, followStatus, followerStatus, null), 2);
        }
    }

    public AObserverS168S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
